package com.microsphere.dbs.onboarding.rest;

import com.microsphere.dbs.onboarding.services.OnboardingService;
import com.microsphere.dbs.onboarding.services.SubscriptionService;
import com.microsphere.onboarding.client.api.rest.v2.OnboardingApi;
import com.microsphere.onboarding.client.api.rest.v2.SubscriptionsApi;
import com.microsphere.onboarding.client.api.rest.v2.model.AccountDetail;
import com.microsphere.onboarding.client.api.rest.v2.model.CardIds;
import com.microsphere.onboarding.client.api.rest.v2.model.CommercialCardResponseGet;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityIdResponse;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityPostRequest;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityTypePostResponse;
import com.microsphere.onboarding.client.api.rest.v2.model.ResiliationPutRequest;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionRequestBody;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionResponse;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionResponseBody;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionsPage;
import com.microsphere.onboarding.client.api.rest.v2.model.UserJobRoles;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class OnboardingController implements OnboardingApi,
    SubscriptionsApi {

  private final OnboardingService onboardingService;

  private final SubscriptionService subscriptionService;

  @Override
  @PreAuthorize("checkPermission('Onboarding','Manage Onboarding Corporate',{'view'})")
  public ResponseEntity<CommercialCardResponseGet> getCommercialCard(
      @Valid @NotNull @Size(min = 1, max = 50) String offer, @Valid String localize) {
    return new ResponseEntity<>(this.onboardingService.getCommercialCards(offer, localize),
        HttpStatus.OK);
  }

  @Override
  @PreAuthorize("checkPermission('Onboarding','Manage Onboarding Corporate',{'create'})")
  public ResponseEntity<LegalEntityIdResponse> persistLegalEntity(
      LegalEntityPostRequest legalEntityPostRequest) {
    return ResponseEntity.ok(onboardingService.createLegalEntity(legalEntityPostRequest));
  }

  @Override
  @PreAuthorize("checkPermission('Onboarding','Manage Onboarding Corporate',{'create'})")
  public ResponseEntity<LegalEntityTypePostResponse> searchLegalEntity(
      @Valid @NotNull @Size(min = 1, max = 50) String legalEntityExternalId) {
    return new ResponseEntity<>(this.onboardingService.getLegalEntity(legalEntityExternalId),
        HttpStatus.OK);
  }

  @Override
  @PreAuthorize("checkPermission('Onboarding','Manage Onboarding Corporate',{'view'})")
  public ResponseEntity<List<AccountDetail>> getAccountsByLegalEntityExtId(String externalId) {
    return new ResponseEntity<>(this.onboardingService.getAccountsByLeExtId(externalId),
        HttpStatus.OK);
  }

  @Override
  @PreAuthorize("checkPermission('Onboarding','Manage Onboarding Corporate',{'view'})")
  public ResponseEntity<SubscriptionsPage> getAllSubscriptions(Integer page, Integer size,
      String query) {
    return new ResponseEntity<>(subscriptionService.getAllSubscriptions(page, size, query),
        HttpStatus.OK);
  }

  @Override
  public ResponseEntity<SubscriptionResponseBody> getSubscriptionById(String subscriptionId) {
    return new ResponseEntity<>(subscriptionService.getSubscriptionById(subscriptionId),
        HttpStatus.OK);
  }

  @Override
  public ResponseEntity<SubscriptionResponse> getSubscriptionByServiceAgreementId(
      String serviceAgreementId) {
    return new ResponseEntity<>(
        subscriptionService.getSubscriptionByServiceAgreementId(serviceAgreementId),
        HttpStatus.OK);
  }

  @Override
  public ResponseEntity<List<UserJobRoles>> getUsersWithJobRoles(String subscriptionId,
      CardIds cardIds) {
    return new ResponseEntity<>(
        subscriptionService.findUsersInvalidFunctionGroupsAssignement(subscriptionId, cardIds),
        HttpStatus.OK);
  }

  @Override
  @PreAuthorize("checkPermission('Onboarding','Manage Onboarding Corporate',{'delete'})")
  public ResponseEntity<Void> resiliateSubscription(ResiliationPutRequest resiliationPutRequest) {
    subscriptionService.resiliateSubscription(resiliationPutRequest);
    return ResponseEntity.ok().build();
  }

  @Override
  @PreAuthorize("checkPermission('Onboarding','Manage Onboarding Corporate',{'create'})")
  public ResponseEntity<SubscriptionResponseBody> retrySubscription(String subscriptionId) {
    return new ResponseEntity<>(subscriptionService.retrySubscription(subscriptionId),
        HttpStatus.OK);
  }

  @Override
  @PreAuthorize("checkPermission('Onboarding','Manage Onboarding Corporate',{'edit'})")
  public ResponseEntity<SubscriptionResponseBody> updateSubscriptionById(String id,
      SubscriptionRequestBody subscriptionRequestBody) {
    return new ResponseEntity<>(
        subscriptionService.updateSubscriptionById(id, subscriptionRequestBody), HttpStatus.OK);
  }
}
