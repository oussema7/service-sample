package com.microsphere.dbs.onboarding.clients;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.microsphere.bank.backend.holding_subscription_client.AbonnementsocResponseBody;
import com.microsphere.bank.backend.holding_subscription_client.api.DefaultApi;
import com.microsphere.bank.backend.resiliatesubscription.SubscriptionResponse1;
import com.microsphere.dbs.onboarding.exceptions.ResiliateSubscriptionException;
import com.microsphere.dbs.onboarding.exceptions.SubmitSubscriptionToCoreBankException;
import com.microsphere.dbs.onboarding.utils.SubscriptionTypeUtil;

@Slf4j
@Component
@RequiredArgsConstructor
public class SubscriptionClientWrapper {

  private final DefaultApi defaultApi;
  private final com.microsphere.bank.backend.resiliatesubscription.api.DefaultApi defaultApiResiliation;

  public SubscriptionResponse1 resiliateSubscriptionFromCoreBank(String subscriptionId,
    String subscriptionStatus, String motive) {
    try {
      log.debug("Resiliating subscription: subscriptionId={}, subscriptionStatus={}, motive={}",
        subscriptionId, subscriptionStatus, motive);
      SubscriptionResponse1 responseBody = defaultApiResiliation.resilSubscription(
        subscriptionId, subscriptionStatus, motive, null, null, null, null, null, null, null);
      log.debug(
        "Received response from core bank for resiliating subscription: {}",
        responseBody);
      return responseBody;
    } catch (Exception e) {
      log.error("Error when resiliating subscription: {}, {}, {}", subscriptionId,
        subscriptionStatus, motive);
      throw new ResiliateSubscriptionException();
    }
  }

  public AbonnementsocResponseBody submitSubscriptionToCoreBank(String subscriptionType,
    String legalEntityExternalId, String billingAccount, List<String> cardExternalIds,
    String name,
    String email) {
    try {
      log.debug(
        "Creating subscription in core bank: subscriptionType={}, legalEntityExternalId={}, billingAccount={}, cardExternalIds={}, name={}, email={}",
        subscriptionType, legalEntityExternalId, billingAccount, String.join(" ", cardExternalIds),
        name, email);
      AbonnementsocResponseBody responseBody = defaultApi.createAbonnementsoc(
        SubscriptionTypeUtil.getExternalSubscriptionType(subscriptionType), legalEntityExternalId,
        billingAccount,
        String.join(" ", cardExternalIds), name, email, null, null,
        null, null, null, null, null).getBody();
      log.debug(
        "Received response from core bank for create/update subscription submitSubscription: {}",
        responseBody);
      return responseBody;
    } catch (Exception ex) {
      log.debug("throw Exception while submitting update request to core banking system:", ex);
      throw new SubmitSubscriptionToCoreBankException(ex);
    }
  }
}
