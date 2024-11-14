package com.microsphere.dbs.onboarding.aspect.describer;

import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Component;
import com.microsphere.dbs.onboarding.annotation.SubscriptionOperation;
import com.microsphere.dbs.onboarding.models.ExternalSubscriptionStatus;
import com.microsphere.dbs.onboarding.repositories.SubscriptionRepository;
import com.microsphere.dbs.onboarding.repositories.domain.ExecutionStatus;
import com.microsphere.dbs.onboarding.repositories.domain.Subscription;
import com.microsphere.dbs.onboarding.repositories.domain.SubscriptionStep;

@Component
public class InitDataGroupsEventDescriber extends SubscriptionEventDescriber {

  public InitDataGroupsEventDescriber(
    SubscriptionRepository subscriptionRepository) {
    super(subscriptionRepository);
  }

  @Override
  public Subscription describeInitiated(SubscriptionOperation auditableOperation,
    Map<String, Object> arguments) {
    String customerId = this.getCustomerId(arguments);
    return this.describeInitiated(customerId);
  }

  public Subscription describeInitiated(String customerId) {
    Optional<Subscription> subscriptionOp = this.subscriptionRepository.findByLeExtIdAndStatus(
      customerId, ExternalSubscriptionStatus.ACTIVE.getValue());
    if (subscriptionOp.isEmpty()) {
      throw new InternalServerErrorException("Subscription for legal entity not found");
    }
    Subscription subscription = subscriptionOp.get();
    return this.subscriptionRepository.save(
      subscription.withStepStatus(ExecutionStatus.INITIATED).withCurrentStep(
          SubscriptionStep.CREATE_DG).withDataGroupsCreation(ExecutionStatus.INITIATED)
        .withExecutionStatus(ExecutionStatus.INITIATED));
  }

  @Override
  public void describeSuccessful(Subscription subscription,
    SubscriptionOperation auditableOperation,
    Map<String, Object> arguments, Object response) {
    this.describeSuccessful(subscription);
  }

  public void describeSuccessful(Subscription subscription) {
    this.subscriptionRepository.save(subscription.withStepStatus(ExecutionStatus.SUCCESSFUL)
      .withDataGroupsCreation(ExecutionStatus.SUCCESSFUL));
  }

  @Override
  public void describeFailed(Subscription subscription) {
    subscription.setStepStatus(ExecutionStatus.FAILED);
    subscription.setExecutionStatus(ExecutionStatus.FAILED);
    subscription.setDataGroupsCreation(ExecutionStatus.FAILED);
    subscription.setIbs(ExecutionStatus.FAILED);
    this.subscriptionRepository.save(subscription);
  }

  private String getCustomerId(Map<String, Object> arguments) {
    return arguments.get("customerId") != null ? (String) arguments.get(
      "customerId")
      : null;
  }
}