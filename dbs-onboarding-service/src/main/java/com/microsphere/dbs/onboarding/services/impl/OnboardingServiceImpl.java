package com.microsphere.dbs.onboarding.services.impl;

import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityItemBase;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityItemId;
import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;
import com.backbase.buildingblocks.presentation.errors.NotFoundException;
import com.microsphere.dbs.onboarding.clients.GetLegalEntityApiClientWrapper;
import com.microsphere.dbs.onboarding.clients.SubscriptionClientWrapper;
import com.microsphere.dbs.onboarding.exceptions.LegalEntityAlreadyExistException;
import com.microsphere.dbs.onboarding.exceptions.LegalEntityNotEligibleException;
import com.microsphere.dbs.onboarding.exceptions.LegalEntityNotExistInCoreBankException;
import com.microsphere.dbs.onboarding.exceptions.SubmitSubscriptionToCoreBankException;
import com.microsphere.dbs.onboarding.exceptions.SubscriptionUnknownException;
import com.microsphere.dbs.onboarding.models.OfferType;
import com.microsphere.dbs.onboarding.models.ServiceAgreementIds;
import com.microsphere.dbs.onboarding.repositories.CommercialCardItemRepository;
import com.microsphere.dbs.onboarding.repositories.CommercialCardRepository;
import com.microsphere.dbs.onboarding.repositories.SubscriptionRepository;
import com.microsphere.dbs.onboarding.repositories.domain.CommercialCard;
import com.microsphere.dbs.onboarding.repositories.domain.ExecutionStatus;
import com.microsphere.dbs.onboarding.repositories.domain.Subscription;
import com.microsphere.dbs.onboarding.services.OnboardingService;
import com.microsphere.dbs.onboarding.services.SubscriptionInitializerService;
import com.microsphere.onboarding.client.api.rest.v2.model.AccountDetail;
import com.microsphere.onboarding.client.api.rest.v2.model.Card;
import com.microsphere.onboarding.client.api.rest.v2.model.CommercialCardResponseGet;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityIdResponse;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityPostRequest;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityTypePostResponse;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.microsphere.bank.backend.legalEntity.ClientResponse;

@Slf4j
@Service
@AllArgsConstructor
public class OnboardingServiceImpl implements OnboardingService {

  private final AccessGroupService accessGroupService;
  private final PolicyAssignmentService policyAssignmentService;
  private final SubscriptionInitializerService subscriptionInitializerService;
  private final CommercialCardRepository commercialCardRepository;
  private final CommercialCardItemRepository commercialCardItemRepository;
  private final GetLegalEntityApiClientWrapper getLegalEntityApiClientWrapper;
  private final SubscriptionClientWrapper subscriptionClientWrapper;
  private final SubscriptionRepository subscriptionRepository;

  private static final Comparator<Card> BY_NAME_COMPARATOR = Comparator.comparing(Card::getName);
  private static final Comparator<Card> BY_TYPE_COMPARATOR = (o1, o2) -> {
    if (o1.getType().equals(OfferType.STANDARD.toString())) {
      return -1;
    } else if (o2.getType().equals(OfferType.STANDARD.toString())) {
      return 1;
    } else {
      return o1.getType().compareTo(o2.getType());
    }
  };

  public static final String ENGLISH = "en";
  public static final String IS_ELIGIBLE = "True";
  public static final String CLIENT_EXISTS_ERROR = "Error";

  @Override
  public LegalEntityTypePostResponse getLegalEntity(String externalId)
      throws LegalEntityAlreadyExistException, LegalEntityNotExistInCoreBankException {
    boolean eligible;
    boolean isRescinded = false;
    try {
      LegalEntityItemBase legalEntityItem = this.accessGroupService.getLegalEntityByExternalId(
          externalId);
      log.debug("Found legalEntity : '{}'", legalEntityItem.getName());
      List<Subscription> subscriptions = this.subscriptionRepository.findAllByLeExtId(
          externalId);
      if (!subscriptions.isEmpty()) {
        isRescinded = subscriptions.stream()
            .allMatch(s -> s.getExecutionStatus().equals(ExecutionStatus.RESCINDED));
        eligible = isRescinded;
      } else {
        eligible = true;
      }
    } catch (NotFoundException e) {
      eligible = true;
    } catch (Exception e) {
      throw new InternalServerErrorException("An error has occurred when verifying legal entity.");
    }

    if (eligible) {
      ClientResponse getClientResponse = getLegalEntityApiClientWrapper.getLegalEntityFromCoreBank(
          externalId);
      if (getClientResponse.getBody().get(0).getClientExists() != null
          && getClientResponse.getBody().get(0).getClientExists().equals(CLIENT_EXISTS_ERROR)) {
        throw new LegalEntityNotExistInCoreBankException("Legal entity not found in core bank");
      } else {
        if (getClientResponse.getBody().get(0).getEligible().equals(IS_ELIGIBLE)) {
          return buildLegalEntityTypePostResponse(externalId, getClientResponse,
              isRescinded);
        } else {
          throw new LegalEntityNotEligibleException("Legal entity exist but not eligible");
        }
      }
    } else {
      throw new LegalEntityAlreadyExistException("Legal entity already exist", externalId);
    }
  }

  private LegalEntityTypePostResponse buildLegalEntityTypePostResponse(String externalId,
      ClientResponse clientResponse, boolean subscriptionRescinded) {
    return new LegalEntityTypePostResponse()
        .externalId(externalId)
        .name(clientResponse.getBody().get(0).getLegalEntityName())
        .accountList(GetLegalEntityApiClientWrapper.extractBillingAccounts(clientResponse))
        .subscriptionRescinded(subscriptionRescinded);
  }

  @Override
  public LegalEntityIdResponse createLegalEntity(LegalEntityPostRequest legalEntityPostRequest) {
    try {
      LegalEntityItemId legalEntityResponse = this.accessGroupService.createLegalEntity(
          legalEntityPostRequest);
      ServiceAgreementIds serviceAgreementIds = this.accessGroupService.createMasterServiceAgreement(
          legalEntityPostRequest);
      this.policyAssignmentService.assignDefaultPolicy(serviceAgreementIds.getExternalId(),
          legalEntityPostRequest.getCardsExternalIds());
      subscriptionInitializerService.initializeSubscriptionAsync(
          legalEntityPostRequest.getExternalId(), legalEntityPostRequest.getName());
      return new LegalEntityIdResponse().id(legalEntityResponse.getId());
    } catch (SubmitSubscriptionToCoreBankException e) {
      throw new SubmitSubscriptionToCoreBankException(e);
    } catch (SubscriptionUnknownException e) {
      throw new SubscriptionUnknownException();
    }
  }

  @Override
  public List<AccountDetail> getAccountsByLeExtId(String leExternalId) {
    ClientResponse clientResponse = getLegalEntityApiClientWrapper.getLegalEntityFromCoreBank(
        leExternalId);
    return Optional.ofNullable(
            GetLegalEntityApiClientWrapper.extractBillingAccounts(clientResponse))
        .orElse(Collections.emptyList());
  }

  @Override
  public CommercialCardResponseGet getCommercialCards(String type, String language) {
    List<CommercialCard> commercialCards;
    if (type != null && type.equals(OfferType.PREMIUM.toString())) {
      commercialCards = commercialCardRepository.findAll();
    } else {
      commercialCards = commercialCardRepository.findByType(OfferType.STANDARD.toString());
    }
    String locale = language != null ? language : ENGLISH;
    return new CommercialCardResponseGet().cards(getListCommercialCards(commercialCards, locale));
  }

  private List<Card> getListCommercialCards(List<CommercialCard> commercialCards, String lang) {
    return commercialCards.stream().map(commercialCard -> new Card().cardGroup(
                lang.equals(ENGLISH) ? commercialCard.getCardGroupEn() : commercialCard.getCardGroupFr())
            .name(lang.equals(ENGLISH) ? commercialCard.getNameEn() : commercialCard.getNameFr())
            .price(BigDecimal.valueOf(commercialCard.getPrice())).description(
                lang.equals(ENGLISH) ? commercialCard.getDescriptionEn()
                    : commercialCard.getDescriptionFr())
            .assignablePermissionSet(commercialCard.getApsName()).type(commercialCard.getType())
            .externalId(commercialCard.getExternalId())
            .businessFunctions(getBusinessFunctions(commercialCard, lang)))
        .sorted(BY_TYPE_COMPARATOR.thenComparing(BY_NAME_COMPARATOR)).collect(Collectors.toList());
  }

  private List<String> getBusinessFunctions(CommercialCard commercialCard, String lang) {
    return commercialCardItemRepository.findByCardId(commercialCard.getExternalId()).stream().map(
        commercialCardItem -> lang.equals(ENGLISH) ? commercialCardItem.getNameEn()
            : commercialCardItem.getNameFr()).sorted().collect(Collectors.toList());
  }

}
