package com.microsphere.dbs.onboarding.services.impl;

import com.microsphere.accesscontrol.service.api.listener.v2.model.ServiceAgreementPut;
import com.microsphere.accesscontrol.service.api.listener.v2.model.Status;
import com.backbase.buildingblocks.presentation.errors.BadRequestException;
import com.backbase.buildingblocks.presentation.errors.NotFoundException;
import com.microsphere.dbs.onboarding.clients.SubscriptionClientWrapper;
import com.microsphere.dbs.onboarding.clients.UserManagerWrapper;
import com.microsphere.dbs.onboarding.exceptions.ResiliateSubscriptionException;
import com.microsphere.dbs.onboarding.exceptions.SubscriptionNotFoundException;
import com.microsphere.dbs.onboarding.mappers.SubscriptionMapper;
import com.microsphere.dbs.onboarding.models.ExternalSubscriptionStatus;
import com.microsphere.dbs.onboarding.repositories.CommercialCardRepository;
import com.microsphere.dbs.onboarding.repositories.SubscriptionRepository;
import com.microsphere.dbs.onboarding.repositories.domain.CommercialCard;
import com.microsphere.dbs.onboarding.repositories.domain.ExecutionStatus;
import com.microsphere.dbs.onboarding.repositories.domain.Subscription;
import com.microsphere.dbs.onboarding.repositories.domain.SubscriptionStep;
import com.microsphere.dbs.onboarding.services.SubscriptionInitializerService;
import com.microsphere.dbs.onboarding.services.SubscriptionService;
import com.microsphere.onboarding.client.api.rest.v2.model.CardIds;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityPostRequest;
import com.microsphere.onboarding.client.api.rest.v2.model.ResiliationPutRequest;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionRequestBody;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionResponse;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionResponseBody;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionsPage;
import com.microsphere.onboarding.client.api.rest.v2.model.UserJobRoles;
import com.microsphere.usermanager.extension.client.api.listener.v2.model.RevokeIdentityAccessServiceRequest;
import com.microsphere.usermanager.service.api.listener.v2.model.GetUser;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.microsphere.bank.backend.holding_subscription_client.AbonnementsocResponseBody;
import com.microsphere.bank.backend.resiliatesubscription.SubscriptionResponse1;

@Service
@Slf4j
@AllArgsConstructor
public class SubscriptionServiceImpl implements SubscriptionService {

  public static final String STANDARD_CARD_TYPE = "STANDARD";
  public static final String PREMIUM_CARD_TYPE = "PREMIUM";
  public static final String RESILIE = "RESILIE";

  private final SubscriptionRepository subscriptionRepository;
  private final CommercialCardRepository commercialCardRepository;
  private final SubscriptionInitializerService subscriptionInitializerService;
  private final SubscriptionClientWrapper subscriptionClientWrapper;
  private final UserPermissionsService userPermissionsService;
  private final AccessGroupService accessGroupService;
  private final UserManagerWrapper userManagerWrapper;
  private final PolicyAssignmentService policyAssignmentService;

  private static final ExampleMatcher SEARCH_CONDITIONS_MATCH_ANY = ExampleMatcher.matchingAny()
      .withMatcher("leName", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
      .withMatcher("leExtId", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
      .withIgnorePaths("id", "leId", "saId", "saExtId", "offer", "onboardingStatus",
          "workflowSteps");

  @Override
  public SubscriptionsPage getAllSubscriptions(Integer page, Integer size, String query) {
    Subscription subscription = Subscription.builder().leName(query).leExtId(query).build();
    Example<Subscription> example = Example.of(subscription, SEARCH_CONDITIONS_MATCH_ANY);
    Pageable pageable = PageRequest.of(page, size, Direction.ASC, "leName");
    Page<Subscription> subs = query == null ? subscriptionRepository.findAll(pageable)
        : subscriptionRepository.findAll(example, pageable);
    List<SubscriptionResponseBody> subscriptionResponseBodies = subs.getContent().stream()
        .map(SubscriptionMapper.INSTANCE::subscriptionToSubscriptionResponseBody)
        .collect(Collectors.toList());
    SubscriptionsPage subscriptionsPage = new SubscriptionsPage();
    subscriptionsPage.setSubscriptionResponseBody(subscriptionResponseBodies);
    subscriptionsPage.setCurrentPage(subs.getNumber());
    subscriptionsPage.totalItems((int) subs.getTotalElements());
    subscriptionsPage.totalPages(subs.getTotalPages());
    return subscriptionsPage;
  }

  @Override
  public SubscriptionResponseBody retrySubscription(String subscriptionId) {
    Optional<Subscription> optionalSubscription = subscriptionRepository.findById(subscriptionId);
    if (optionalSubscription.isPresent()) {
      Subscription subscription = optionalSubscription.get();
      if (!subscription.getExecutionStatus().equals(ExecutionStatus.FAILED) || Arrays.asList(
              SubscriptionStep.CREATE_LE, SubscriptionStep.CREATE_SA, SubscriptionStep.ASSIGN_POLICY)
          .contains(subscription.getCurrentStep())) {
        throw new BadRequestException("Subscription does not support retry.");
      } else {
        if (subscription.getAccounts().equals(ExecutionStatus.FAILED)
            || subscription.getDataGroupsCreation().equals(ExecutionStatus.FAILED)) {
          subscription.setExecutionStatus(ExecutionStatus.INITIATED);
          subscription.setAccounts(ExecutionStatus.IDLE);
          subscription.setDataGroupsCreation(ExecutionStatus.IDLE);
          subscription.setIbs(ExecutionStatus.IDLE);
          subscriptionRepository.save(subscription);
          subscriptionInitializerService.initializeSubscriptionAsync(subscription.getLeExtId(),
              subscription.getLeName());
        } else if (subscription.getIbs().equals(ExecutionStatus.FAILED)) {
          subscription.setExecutionStatus(ExecutionStatus.INITIATED);
          subscription.setIbs(ExecutionStatus.IDLE);
          subscriptionRepository.save(subscription);
          subscriptionInitializerService.initializeIbsAsync(subscription.getLeExtId());
        }
        return SubscriptionMapper.INSTANCE.subscriptionToSubscriptionResponseBody(subscription);
      }
    }
    throw new NotFoundException("Subscription not found");
  }

  @Override
  public SubscriptionResponseBody getSubscriptionById(String subscriptionId) {
    Optional<Subscription> subscriptionOp = subscriptionRepository.findById(subscriptionId);
    if (subscriptionOp.isPresent()) {
      Subscription subscription = subscriptionOp.get();
      Optional<List<CommercialCard>> cardsBySubscriptionId = this.commercialCardRepository.findCardsBySubscriptionId(
          subscriptionId);
      if (cardsBySubscriptionId.isPresent()) {
        log.debug("List of commercial cards : {}", cardsBySubscriptionId.get());
        subscription.setCommercialCards(cardsBySubscriptionId.get());
      }
      return SubscriptionMapper.INSTANCE.subscriptionToSubscriptionResponseBody(subscription);
    }
    throw new NotFoundException("Subscription not found");
  }

  @Override
  @Transactional
  public SubscriptionResponseBody updateSubscriptionById(String subscriptionId,
      SubscriptionRequestBody subscriptionUpdateRequest) {
    this.validateUpdateRequest(subscriptionId, subscriptionUpdateRequest);
    return this.process(subscriptionId, subscriptionUpdateRequest);
  }

  @Override
  public void resiliateSubscription(ResiliationPutRequest resiliationPutRequest) {
    Subscription subscription = this.subscriptionRepository.findById(
        resiliationPutRequest.getSubscriptionId()).orElseThrow(SubscriptionNotFoundException::new);
    String subscriptionExternalId = subscription.getExternalSubscriptionId();
    try {
      SubscriptionResponse1 subscriptionResponse = this.subscriptionClientWrapper.resiliateSubscriptionFromCoreBank(
          subscriptionExternalId, RESILIE, resiliationPutRequest.getMotive().getValue());
      String status = subscriptionResponse.getBody().get(0).getStatutAbonnement();
      log.debug("Received resiliation status from core bank: {} for subscription externalId: {}",
          status, subscriptionExternalId);
      if (!Objects.equals(status, RESILIE)) {
        throw new ResiliateSubscriptionException();
      }
      subscription.setExternalSubscriptionStatus(ExternalSubscriptionStatus.RESCINDED.getValue());
      subscription.setExecutionStatus(ExecutionStatus.RESCINDED);
      subscription.setResiliationMotive(resiliationPutRequest.getMotive().getValue());
      subscriptionRepository.save(subscription);
      this.policyAssignmentService.deleteAssignedPolicies(subscription.getSaExtId());
      this.accessGroupService.updateServiceAgreement(subscription.getSaId(),
          new ServiceAgreementPut().status(Status.DISABLED).externalId(subscription.getSaId()));
      this.revokeUsersAccess(subscription.getLeId());
    } catch (Exception e) {
      log.error("An error has occurred", e);
      throw new ResiliateSubscriptionException();
    }
  }

  private void revokeUsersAccess(String leId) {
    List<GetUser> users = this.userManagerWrapper.getUserByLegalEntityId(leId);
    RevokeIdentityAccessServiceRequest revokeIdentityAccessServiceRequest = new RevokeIdentityAccessServiceRequest();
    revokeIdentityAccessServiceRequest.setComment(
        "This user is automatically revoked due to subscription rescission.");
    users.forEach(user -> this.userManagerWrapper.revokeUserAccess(user.getId(),
        revokeIdentityAccessServiceRequest));
  }

  @Override
  public List<UserJobRoles> findUsersInvalidFunctionGroupsAssignement(String subscriptionId,
      CardIds newCardsExternalIds) {
    Subscription subscription = this.subscriptionRepository.findById(subscriptionId)
        .orElseThrow(() -> new NotFoundException("Subscription not found"));
    return this.userPermissionsService.validateSubscriptionPermissionsUpdate(subscription,
        newCardsExternalIds);
  }

  @Override
  public SubscriptionResponse getSubscriptionByServiceAgreementId(
      String serviceAgreementId) {
    Subscription subscription = subscriptionRepository.findSubscriptionBySaId(serviceAgreementId,
            ExternalSubscriptionStatus.ACTIVE.getValue())
        .orElseThrow(SubscriptionNotFoundException::new);
    return SubscriptionMapper.INSTANCE.subscriptionToSubscriptionResponse(subscription);
  }

  private SubscriptionResponseBody process(String subscriptionId,
      SubscriptionRequestBody subscriptionUpdateRequest) {
    Subscription subscription = this.subscriptionRepository.findById(subscriptionId)
        .orElseThrow(() -> new NotFoundException("Subscription not found"));

    AbonnementsocResponseBody responseBody = this.subscriptionClientWrapper.submitSubscriptionToCoreBank(
        subscription.getSubscriptionType(), subscription.getLeExtId(),
        subscriptionUpdateRequest.getBillingAccount(),
        subscriptionUpdateRequest.getCardsExternalIds(), subscription.getLeName(),
        Optional.ofNullable(subscriptionUpdateRequest.getEmail())
            .orElse(subscription.getEmailAddress()));
    List<String> currentCardsIds = subscription.getCommercialCards().stream()
        .map(CommercialCard::getExternalId)
        .collect(Collectors.toList());
    List<String> newlyAddedCardsIds = subscriptionUpdateRequest.getCardsExternalIds().stream()
        .filter(id -> !currentCardsIds.contains(id)).collect(
            Collectors.toList());
    List<String> removedCardsIds = currentCardsIds.stream()
        .filter(id -> !subscriptionUpdateRequest.getCardsExternalIds().contains(id))
        .collect(Collectors.toList());
    this.policyAssignmentService.deleteAssignedPolicies(subscription.getSaExtId(), removedCardsIds);
    this.userPermissionsService.updateUserPermissions(subscriptionUpdateRequest, subscription);
    Subscription updatedSubscription = this.updateSubscription(subscription,
        subscriptionUpdateRequest, responseBody);
    this.policyAssignmentService.performAssignDefaultPolicy(subscription.getSaExtId(),
        newlyAddedCardsIds);
    return SubscriptionMapper.INSTANCE.subscriptionToSubscriptionResponseBody(updatedSubscription);
  }

  private void validateUpdateRequest(String subscriptionId,
      SubscriptionRequestBody subscriptionUpdateRequest) {
    if (!subscriptionId.equals(subscriptionUpdateRequest.getSubscriptionId())) {
      throw new BadRequestException("Subscription id provided does not match the subscriptionId");
    }

    List<String> externalCardsIds = subscriptionUpdateRequest.getCardsExternalIds();
    if (externalCardsIds.isEmpty()) {
      throw new BadRequestException("Error updating subscription: empty selected cards");
    }

    List<String> allCards = commercialCardRepository.findAll().stream()
        .map(CommercialCard::getExternalId).collect(Collectors.toList());
    if (!new HashSet<>(allCards).containsAll(externalCardsIds)) {
      throw new BadRequestException("Invalid cards found.");
    }
  }

  private Subscription updateSubscription(Subscription subscription,
      SubscriptionRequestBody subscriptionUpdateRequest, AbonnementsocResponseBody responseBody) {
    List<CommercialCard> commercialCards = subscriptionUpdateRequest.getCardsExternalIds().stream()
        .map(commercialCardRepository::findCommercialCardByExternalId).collect(Collectors.toList());
    accessGroupService.saveMasterServiceAgreement(
        new LegalEntityPostRequest().name(subscription.getLeName())
            .externalId(subscription.getLeExtId())
            .cardsExternalIds(subscriptionUpdateRequest.getCardsExternalIds()));
    return subscriptionRepository.save(
        subscription.withBillingAccount(subscriptionUpdateRequest.getBillingAccount())
            .withExternalSubscriptionStatus(ExternalSubscriptionStatus.getStatusFromCode(
                responseBody.get(0).getStatutAbonnement()).getValue()).withOffer(
                commercialCards.stream().anyMatch(c -> c.getType().equals(PREMIUM_CARD_TYPE))
                    ? PREMIUM_CARD_TYPE : STANDARD_CARD_TYPE).withEmailAddress(
                Optional.ofNullable(subscriptionUpdateRequest.getEmail())
                    .orElse(subscription.getEmailAddress())).withCommercialCards(commercialCards));
  }

}
