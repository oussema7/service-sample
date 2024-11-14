package com.microsphere.dbs.onboarding.aspect.describer;

import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;
import java.util.Map;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.microsphere.dbs.onboarding.models.ExternalSubscriptionStatus;
import com.microsphere.dbs.onboarding.repositories.SubscriptionRepository;
import com.microsphere.dbs.onboarding.repositories.domain.ExecutionStatus;
import com.microsphere.dbs.onboarding.repositories.domain.Subscription;
import com.microsphere.dbs.onboarding.repositories.domain.SubscriptionStep;
import com.microsphere.dbs.onboarding.annotation.SubscriptionOperation;

@Component
@Slf4j
public class AssignApprovalWorkflowEventDescriber extends SubscriptionEventDescriber {

  public AssignApprovalWorkflowEventDescriber(SubscriptionRepository subscriptionRepository) {
    super(subscriptionRepository);
  }

  @Override
  public Subscription describeInitiated(SubscriptionOperation auditableOperation,
    Map<String, Object> arguments) {
    String externalServiceAgreementId = this.getExternalServiceAgreementId(arguments);
    Optional<Subscription> subscriptionOp = this.subscriptionRepository.findBySaExtIdAndStatus(
      externalServiceAgreementId, ExternalSubscriptionStatus.ACTIVE.getValue());
    if (subscriptionOp.isEmpty()) {
      throw new InternalServerErrorException("Subscription for service agreement not found");
    }
    Subscription subscription = subscriptionOp.get();
    return this.subscriptionRepository.save(subscription.withStepStatus(ExecutionStatus.INITIATED)
      .withCurrentStep(SubscriptionStep.ASSIGN_POLICY));
  }

  @Override
  public void describeSuccessful(Subscription subscription,
    SubscriptionOperation auditableOperation, Map<String, Object> arguments, Object response) {
    this.subscriptionRepository.save(subscription.withStepStatus(ExecutionStatus.SUCCESSFUL));
  }

  private String getExternalServiceAgreementId(Map<String, Object> arguments) {
    return arguments.get("externalServiceAgreementId") != null ? (String) arguments.get(
      "externalServiceAgreementId") : null;
  }
}
