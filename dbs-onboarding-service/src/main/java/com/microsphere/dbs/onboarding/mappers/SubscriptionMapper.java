package com.microsphere.dbs.onboarding.mappers;

import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionResponse;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionResponseBody;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionResponseBody.SubscriptionStatusEnum;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionResponseBodyCards;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import com.microsphere.dbs.onboarding.models.ExternalSubscriptionStatus;
import com.microsphere.dbs.onboarding.repositories.domain.CommercialCard;
import com.microsphere.dbs.onboarding.repositories.domain.ExecutionStatus;
import com.microsphere.dbs.onboarding.repositories.domain.Subscription;

@Mapper
@Slf4j
public abstract class SubscriptionMapper {

  public static final SubscriptionMapper INSTANCE = Mappers.getMapper(SubscriptionMapper.class);

  @Mapping(source = "leName", target = "legalEntityName")
  @Mapping(source = "leExtId", target = "legalEntityExtId")
  @Mapping(source = "offer", target = "offer")
  @Mapping(source = "executionStatus", target = "status")
  @Mapping(source = "accounts", target = "accountPulled")
  @Mapping(source = "dataGroupsCreation", target = "accountGroupCreated")
  @Mapping(source = "ibs", target = "ibsActivated")
  @Mapping(source = "id", target = "subscriptionId")
  @Mapping(source = "subscriptionType", target = "subscriptionType")
  @Mapping(source = "externalSubscriptionId", target = "externalSubscriptionId")
  @Mapping(source = "emailAddress", target = "email")
  @Mapping(source = "billingAccount", target = "billingAccount")
  @Mapping(source = "externalSubscriptionStatus", target = "externalSubscriptionStatus")
  @Mapping(ignore = true, target = "subscriptionStatus")
  @Mapping(ignore = true, target = "cards")
  public abstract SubscriptionResponseBody subscriptionToSubscriptionResponseBody(
    Subscription subscription);

  @Mapping(source = "leId", target = "legalEntityId")
  @Mapping(source = "leExtId", target = "legalEntityExternalId")
  @Mapping(source = "saId", target = "serviceAgreementId")
  @Mapping(source = "saExtId", target = "serviceAgreementExternalId")
  @Mapping(source = "id", target = "subscriptionId")
  @Mapping(source = "externalSubscriptionId", target = "subscriptionExternalId")
  public abstract SubscriptionResponse subscriptionToSubscriptionResponse(
    Subscription subscription);

  @AfterMapping
  protected void toSubscriptionResponseBodyCardsList(
    @MappingTarget SubscriptionResponseBody target, Subscription subscription) {
    mapCommercialCards(target, subscription);
    mapSubscriptionStatus(target, subscription);
  }

  @Mapping(source = "externalId", target = "externalId")
  @Mapping(source = "nameEn", target = "nameEn")
  @Mapping(source = "nameFr", target = "nameFr")
  public abstract SubscriptionResponseBodyCards toSubscriptionResponseBodyCards(
    CommercialCard commercialCard);

  private void mapSubscriptionStatus(SubscriptionResponseBody target, Subscription subscription) {
    // add subscription status to the subscription response body
    String externalSubscriptionStatus = subscription.getExternalSubscriptionStatus();
    if (externalSubscriptionStatus.equals(ExternalSubscriptionStatus.ACTIVE.getValue())) {
      ExecutionStatus executionStatus = subscription.getExecutionStatus();
      switch (executionStatus) {
        case IDLE:
        case INITIATED:
          target.setSubscriptionStatus(SubscriptionStatusEnum.ACTIVATION_LOADING);
          break;
        case FAILED:
          target.setSubscriptionStatus(SubscriptionStatusEnum.ACTIVATION_FAILED);
          break;
        case SUCCESSFUL:
          target.setSubscriptionStatus(SubscriptionStatusEnum.ACTIVE);
          break;
        case RESCINDED:
          target.setSubscriptionStatus(SubscriptionStatusEnum.RESCINDED);
          break;
      }
    } else if (externalSubscriptionStatus.equals(ExternalSubscriptionStatus.INACTIVE.getValue())) {
      target.setSubscriptionStatus(SubscriptionStatusEnum.INACTIVE);
    } else if (externalSubscriptionStatus.equals(ExternalSubscriptionStatus.RESCINDED.getValue())) {
      target.setSubscriptionStatus(SubscriptionStatusEnum.RESCINDED);
    } else {
      throw new InternalServerErrorException("Found unknown external subscription status");
    }
  }

  private void mapCommercialCards(SubscriptionResponseBody target, Subscription subscription) {
    List<SubscriptionResponseBodyCards> list = subscription.getCommercialCards().stream()
      .map(this::toSubscriptionResponseBodyCards).collect(Collectors.toList());
    target.setCards(list);
  }

}
