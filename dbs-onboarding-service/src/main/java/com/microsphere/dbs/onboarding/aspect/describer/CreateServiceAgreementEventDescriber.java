package com.microsphere.dbs.onboarding.aspect.describer;

import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityPostRequest;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.springframework.stereotype.Component;
import com.microsphere.dbs.onboarding.annotation.SubscriptionOperation;
import com.microsphere.dbs.onboarding.models.ExternalSubscriptionStatus;
import com.microsphere.dbs.onboarding.models.ServiceAgreementIds;
import com.microsphere.dbs.onboarding.repositories.SubscriptionRepository;
import com.microsphere.dbs.onboarding.repositories.domain.ExecutionStatus;
import com.microsphere.dbs.onboarding.repositories.domain.Subscription;
import com.microsphere.dbs.onboarding.repositories.domain.SubscriptionStep;

@Component
public class CreateServiceAgreementEventDescriber extends SubscriptionEventDescriber {

  public CreateServiceAgreementEventDescriber(
    SubscriptionRepository subscriptionRepository) {
    super(subscriptionRepository);
  }

  @Override
  public Subscription describeInitiated(SubscriptionOperation auditableOperation,
    Map<String, Object> arguments) {
    LegalEntityPostRequest request = this.getLegalEntityPostRequest(arguments);
    Optional<Subscription> subscriptionOp = this.subscriptionRepository.findByLeExtIdAndStatus(
      Objects.requireNonNull(request).getExternalId(),
      ExternalSubscriptionStatus.ACTIVE.getValue());
    if (subscriptionOp.isEmpty()) {
      throw new InternalServerErrorException("Subscription for legal entity not found");
    }
    Subscription subscription = subscriptionOp.get();
    return this.subscriptionRepository.save(
      subscription.withStepStatus(ExecutionStatus.INITIATED).withCurrentStep(
        SubscriptionStep.CREATE_SA));
  }

  @Override
  public void describeSuccessful(Subscription subscription,
    SubscriptionOperation auditableOperation,
    Map<String, Object> arguments, Object response) {
    ServiceAgreementIds serviceAgreementIds = (ServiceAgreementIds) response;
    this.subscriptionRepository.save(subscription.withSaExtId(serviceAgreementIds.getExternalId())
      .withSaId(serviceAgreementIds.getId())
      .withStepStatus(ExecutionStatus.SUCCESSFUL));
  }

  private LegalEntityPostRequest getLegalEntityPostRequest(Map<String, Object> arguments) {
    return arguments.get("legalEntityPostRequest") != null ? (LegalEntityPostRequest) arguments.get(
      "legalEntityPostRequest")
      : null;
  }
}