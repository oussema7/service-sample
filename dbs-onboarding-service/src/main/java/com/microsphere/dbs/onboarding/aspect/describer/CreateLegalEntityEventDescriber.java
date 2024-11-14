package com.microsphere.dbs.onboarding.aspect.describer;

import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityItemId;
import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityPostRequest;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.microsphere.bank.backend.holding_subscription_client.AbonnementsocResponseBodyInner;
import com.microsphere.dbs.onboarding.annotation.SubscriptionOperation;
import com.microsphere.dbs.onboarding.models.ExternalSubscriptionStatus;
import com.microsphere.dbs.onboarding.repositories.CommercialCardRepository;
import com.microsphere.dbs.onboarding.repositories.SubscriptionRepository;
import com.microsphere.dbs.onboarding.repositories.domain.ExecutionStatus;
import com.microsphere.dbs.onboarding.repositories.domain.Subscription;
import com.microsphere.dbs.onboarding.repositories.domain.SubscriptionStep;
import com.microsphere.dbs.onboarding.utils.SubscriptionTypeUtil;

@Component
public class CreateLegalEntityEventDescriber extends SubscriptionEventDescriber {

  private final CommercialCardRepository commercialCardRepository;

  public CreateLegalEntityEventDescriber(SubscriptionRepository subscriptionRepository,
    CommercialCardRepository commercialCardRepository) {
    super(subscriptionRepository);
    this.commercialCardRepository = commercialCardRepository;
  }

  @Override
  public Subscription describeInitiated(SubscriptionOperation auditableOperation,
    Map<String, Object> arguments) {
    Subscription subscription;
    LegalEntityPostRequest request = this.getLegalEntityPostRequest(arguments);
    AbonnementsocResponseBodyInner externalSubscription = this.getAbonnementResponseBody(
      arguments);
    if (externalSubscription == null) {
      throw new InternalServerErrorException("Subscription not created in core bank.");
    }
    Optional<Subscription> subscriptionOp = this.subscriptionRepository.findByLeExtIdAndStatus(
      Objects.requireNonNull(request).getExternalId(), ExternalSubscriptionStatus.ACTIVE.getValue());
    if (subscriptionOp.isEmpty()) {
      subscription = this.subscriptionRepository.save(
        Subscription.builder().offer(request.getOffer()).commercialCards(
            request.getCardsExternalIds().stream()
              .map(commercialCardRepository::findCommercialCardByExternalId)
              .collect(Collectors.toList())).leExtId(request.getExternalId())
          .leName(request.getName()).currentStep(SubscriptionStep.CREATE_LE)
          .stepStatus(ExecutionStatus.INITIATED).executionStatus(ExecutionStatus.INITIATED)
          .accounts(ExecutionStatus.IDLE).dataGroupsCreation(ExecutionStatus.IDLE)
          .ibs(ExecutionStatus.IDLE)
          .externalSubscriptionId(externalSubscription.getIdMyBankT24())
          .contratSigne(externalSubscription.getContratSigne())
          .emailAddress(externalSubscription.getContactEmail())
          .externalSubscriptionStatus(
            ExternalSubscriptionStatus.getStatusFromCode(externalSubscription.getStatutAbonnement())
              .getValue())
          .lastNameFirstName(externalSubscription.getLastNameFirstName())
          .billingAccount(externalSubscription.getBillingAccount())
          .subscriptionType(
            SubscriptionTypeUtil.getSubscriptionType(externalSubscription.getTypeAbonnement()))
          .build());
    } else {
      throw new InternalServerErrorException("Subscription for legal entity already exists");
    }
    return subscription;
  }

  @Override
  public void describeSuccessful(Subscription subscription,
    SubscriptionOperation auditableOperation, Map<String, Object> arguments, Object response) {
    LegalEntityItemId legalEntityItemId = (LegalEntityItemId) response;
    subscription.setLeId(legalEntityItemId.getId());
    subscription.setStepStatus(ExecutionStatus.SUCCESSFUL);
    this.subscriptionRepository.save(subscription);
  }

  private LegalEntityPostRequest getLegalEntityPostRequest(Map<String, Object> arguments) {
    return arguments.get("legalEntityPostRequest") != null ? (LegalEntityPostRequest) arguments.get(
      "legalEntityPostRequest") : null;
  }

  private AbonnementsocResponseBodyInner getAbonnementResponseBody(Map<String, Object> arguments) {
    return arguments.get("abonnementsocResponseBody") != null
      ? (AbonnementsocResponseBodyInner) arguments.get("abonnementsocResponseBody") : null;
  }
}