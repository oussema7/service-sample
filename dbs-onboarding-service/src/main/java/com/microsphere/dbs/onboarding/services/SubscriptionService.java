package com.microsphere.dbs.onboarding.services;

import com.microsphere.onboarding.client.api.rest.v2.model.CardIds;
import com.microsphere.onboarding.client.api.rest.v2.model.ResiliationPutRequest;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionRequestBody;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionResponse;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionResponseBody;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionsPage;
import com.microsphere.onboarding.client.api.rest.v2.model.UserJobRoles;
import java.util.List;
import com.microsphere.dbs.onboarding.exceptions.SubscriptionNotFoundException;

public interface SubscriptionService {

  SubscriptionsPage getAllSubscriptions(Integer page, Integer size, String query);

  SubscriptionResponseBody retrySubscription(String subscriptionId);

  SubscriptionResponseBody getSubscriptionById(String subscriptionId);

  SubscriptionResponseBody updateSubscriptionById(String subscriptionId,
    SubscriptionRequestBody requestBody);

  void resiliateSubscription(ResiliationPutRequest resiliationPutRequest) throws SubscriptionNotFoundException;

  List<UserJobRoles> findUsersInvalidFunctionGroupsAssignement(String subscriptionId, CardIds newCardsExternalIds);

  SubscriptionResponse getSubscriptionByServiceAgreementId(String serviceAgreementId);
}
