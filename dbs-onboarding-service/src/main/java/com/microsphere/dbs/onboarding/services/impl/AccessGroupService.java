package com.microsphere.dbs.onboarding.services.impl;

import com.microsphere.accesscontrol.service.api.listener.v2.LegalEntitiesApi;
import com.microsphere.accesscontrol.service.api.listener.v2.ServiceAgreementApi;
import com.microsphere.accesscontrol.service.api.listener.v2.model.CreateStatus;
import com.microsphere.accesscontrol.service.api.listener.v2.model.GetServiceAgreement;
import com.microsphere.accesscontrol.service.api.listener.v2.model.IdItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityItemBase;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityItemId;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServiceAgreementPut;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServicesAgreementIngest;
import com.microsphere.accesscontrol.service.api.listener.v2.model.Status;
import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;
import com.backbase.buildingblocks.presentation.errors.NotFoundException;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityPostRequest;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.microsphere.bank.backend.holding_subscription_client.AbonnementsocResponseBodyInner;
import com.microsphere.dbs.onboarding.annotation.SubscriptionOperation;
import com.microsphere.dbs.onboarding.aspect.describer.CreateLegalEntityEventDescriber;
import com.microsphere.dbs.onboarding.aspect.describer.CreateServiceAgreementEventDescriber;
import com.microsphere.dbs.onboarding.exceptions.LegalEntityCreationException;
import com.microsphere.dbs.onboarding.exceptions.ServiceAgreementCreationException;
import com.microsphere.dbs.onboarding.mappers.AccessGroupMapper;
import com.microsphere.dbs.onboarding.models.ExternalSubscriptionStatus;
import com.microsphere.dbs.onboarding.models.ServiceAgreementIds;
import com.microsphere.dbs.onboarding.repositories.SubscriptionRepository;
import com.microsphere.dbs.onboarding.repositories.domain.Subscription;
import com.microsphere.dbs.onboarding.services.CommercialCardService;

@Slf4j
@Component
@AllArgsConstructor
public class AccessGroupService {

  private static final String BANK_CORPORATE_REALM = "bank-corporate";

  private final ServiceAgreementApi serviceAgreementApi;
  private final LegalEntitiesApi legalEntitiesApi;
  private final IdentityManagementService identityManagementService;
  private final CommercialCardService commercialCardService;
  private final SubscriptionRepository subscriptionRepository;

  public LegalEntityItemBase getLegalEntityByExternalId(String externalId) {
    try {
      log.debug("Searching legal entity with externalId: {}", externalId);
      return this.legalEntitiesApi.getLegalEntityByExternalId(externalId);
    } catch (NotFoundException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new InternalServerErrorException(
        "An error has occurred when searching legal entity with externalId: {}" + externalId);
    }
  }

  @SubscriptionOperation(
    eventDescriberClass = CreateLegalEntityEventDescriber.class
  )
  public LegalEntityItemId createLegalEntity(LegalEntityPostRequest legalEntityPostRequest) {
    List<Subscription> subscription = subscriptionRepository.findBySaExtIdAndStatusOrderByCreatedAtDesc(
      legalEntityPostRequest.getExternalId(),
      ExternalSubscriptionStatus.RESCINDED.getValue());
    if (!subscription.isEmpty()) {
      ResponseEntity<LegalEntityItemBase> legalEntityGetResponse = this.legalEntitiesApi.getLegalEntityByExternalIdWithHttpInfo(
        legalEntityPostRequest.getExternalId());
      return new LegalEntityItemId().id(
        Objects.requireNonNull(legalEntityGetResponse.getBody()).getId());
    } else {
      try {
        log.debug("Creating legal entity: {}", legalEntityPostRequest);
        ResponseEntity<LegalEntityItemId> legalEntityResponse = this.legalEntitiesApi.postCreateLegalEntitiesWithHttpInfo(
          AccessGroupMapper.INSTANCE.toLegalEntityCreateItem(legalEntityPostRequest, true));
        if (!legalEntityResponse.getStatusCode().is2xxSuccessful()
          || legalEntityResponse.getBody() == null) {
          throw new InternalServerErrorException("Error creating legal entity");
        }
        if (this.identityManagementService.linkLegalEntityToRealm(
          legalEntityResponse.getBody().getId(), BANK_CORPORATE_REALM)) {
          log.debug("Assigned legal entity to realm successfully");
        } else {
          throw new InternalServerErrorException("Error assigning realm to legal entity");
        }
        log.debug("Legal entity was successfully created: {}", legalEntityResponse);
        return legalEntityResponse.getBody();
      } catch (Exception e) {
        log.debug("Couldn't create legal entity", e);
        throw new LegalEntityCreationException(e);
      }
    }
  }

  @SubscriptionOperation(
    eventDescriberClass = CreateServiceAgreementEventDescriber.class
  )
  public ServiceAgreementIds createMasterServiceAgreement(
    LegalEntityPostRequest legalEntityPostRequest) {
    return this.saveMasterServiceAgreement(legalEntityPostRequest);
  }

  public ServiceAgreementIds saveMasterServiceAgreement(
    LegalEntityPostRequest legalEntityPostRequest) {
    try {
      ServiceAgreementIds serviceAgreementResponse = this.createServiceAgreement(
        legalEntityPostRequest.getName(), legalEntityPostRequest.getExternalId(),
        commercialCardService.getApsNames(legalEntityPostRequest.getCardsExternalIds()));
      log.debug("Master service agreement with externalId: {} created successfully",
        serviceAgreementResponse.getId());
      return serviceAgreementResponse;
    } catch (Exception e) {
      log.debug("Couldn't create service agreement", e);
      throw new ServiceAgreementCreationException(e);
    }
  }

  private ServiceAgreementIds createServiceAgreement(String legalEntityName,
    String legalEntityExternalId, List<String> apsNames) {
    GetServiceAgreement masterServiceAgreement = this.getMasterServiceAgreement(
      legalEntityExternalId);
    if (masterServiceAgreement == null) {
      ServicesAgreementIngest serviceAgreement = AccessGroupMapper.INSTANCE.toPostServiceAgreement(
        legalEntityName, legalEntityExternalId, CreateStatus.ENABLED, true, apsNames,
        Collections.emptyList());
      log.debug("Creating service agreement: {}", serviceAgreement);
      return createServiceAgreement(serviceAgreement);
    } else {
      masterServiceAgreement.setStatus(Status.ENABLED);
      ServiceAgreementPut serviceAgreement = AccessGroupMapper.INSTANCE.toPutServiceAgreementRequest(
        masterServiceAgreement, legalEntityExternalId, legalEntityName, apsNames);
      log.debug("Updating service agreement: {}", serviceAgreement);
      this.updateServiceAgreement(masterServiceAgreement.getId(), serviceAgreement);
      return new ServiceAgreementIds(masterServiceAgreement.getId(),
        serviceAgreement.getExternalId());
    }
  }

  private ServiceAgreementIds createServiceAgreement(ServicesAgreementIngest servicesAgreement) {
    ResponseEntity<IdItem> serviceAgreementResponse = this.serviceAgreementApi.postServiceAgreementIngestWithHttpInfo(
      servicesAgreement);
    if (!serviceAgreementResponse.getStatusCode().is2xxSuccessful()
      || serviceAgreementResponse.getBody() == null) {
      throw new InternalServerErrorException("Failed to create service agreement.");
    }
    return new ServiceAgreementIds(serviceAgreementResponse.getBody().getId(),
      servicesAgreement.getExternalId());
  }

  public void updateServiceAgreement(String serviceAgreementId,
    ServiceAgreementPut serviceAgreement) {
    log.debug("updating service agreement {}: {}", serviceAgreementId, serviceAgreement);
    try {
      if (!serviceAgreementApi.putServiceAgreementItemWithHttpInfo(serviceAgreementId,
        serviceAgreement).getStatusCode().is2xxSuccessful()) {
        throw new InternalServerErrorException("Failed to update existing service agreement.");
      }
    } catch (Exception e) {
      log.debug("Couldn't update service agreement", e);
      throw e;
    }
  }

  private GetServiceAgreement getMasterServiceAgreement(String legalEntityExternalId) {
    try {
      return legalEntitiesApi.getMasterServiceAgreementByExternalLegalEntity(legalEntityExternalId);
    } catch (NotFoundException e) {
      log.debug("Master service agreement for legal entity {} not found", legalEntityExternalId);
      return null;
    }
  }
}