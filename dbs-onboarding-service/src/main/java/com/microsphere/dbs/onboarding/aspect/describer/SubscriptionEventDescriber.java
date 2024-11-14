package com.microsphere.dbs.onboarding.aspect.describer;

import java.util.Map;
import com.microsphere.dbs.onboarding.repositories.SubscriptionRepository;
import com.microsphere.dbs.onboarding.repositories.domain.ExecutionStatus;
import com.microsphere.dbs.onboarding.repositories.domain.Subscription;
import com.microsphere.dbs.onboarding.annotation.SubscriptionOperation;

public abstract class SubscriptionEventDescriber {

  protected final SubscriptionRepository subscriptionRepository;

  public SubscriptionEventDescriber(SubscriptionRepository subscriptionRepository) {
    this.subscriptionRepository = subscriptionRepository;
  }

  public abstract Subscription describeInitiated(SubscriptionOperation auditableOperation,
    Map<String, Object> arguments);

  public abstract void describeSuccessful(Subscription subscription,
    SubscriptionOperation auditableOperation, Map<String, Object> arguments, Object response);

  public void describeFailed(Subscription subscription) {
    subscription.setStepStatus(ExecutionStatus.FAILED);
    subscription.setExecutionStatus(ExecutionStatus.FAILED);
    this.subscriptionRepository.save(subscription);
  }
}
