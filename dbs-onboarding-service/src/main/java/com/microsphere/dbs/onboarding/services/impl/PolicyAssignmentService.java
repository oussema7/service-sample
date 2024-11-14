package com.microsphere.dbs.onboarding.services.impl;

import com.microsphere.approval.service.api.listener.v2.PolicyAssignmentsApi;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPolicyAssignmentRequest;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPolicyAssignmentRequestBounds;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPostPolicyAssignmentBulkRequest;
import com.microsphere.dbs.onboarding.annotation.SubscriptionOperation;
import com.microsphere.dbs.onboarding.aspect.describer.AssignApprovalWorkflowEventDescriber;
import com.microsphere.dbs.onboarding.exceptions.DefaultPolicyAssignmentException;
import com.microsphere.dbs.onboarding.models.ApprovableBusinessFunction;
import com.microsphere.dbs.onboarding.repositories.domain.CommercialCardItem;
import com.microsphere.dbs.onboarding.services.CommercialCardService;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class PolicyAssignmentService {

  private final PolicyAssignmentsApi policyAssignmentsApi;
  private final CommercialCardService commercialCardService;

  @SubscriptionOperation(
      eventDescriberClass = AssignApprovalWorkflowEventDescriber.class
  )
  public void assignDefaultPolicy(String externalServiceAgreementId,
      List<String> cardsExternalIds) {
    this.deleteAssignedPolicies(externalServiceAgreementId);
    this.performAssignDefaultPolicy(externalServiceAgreementId, cardsExternalIds);
  }

  public void performAssignDefaultPolicy(String externalServiceAgreementId,
      List<String> cardsExternalIds) {
    try {
      log.debug("Trying to assign default policies to service agreement {}",
          externalServiceAgreementId);

      Map<String, Map<String, List<ApprovableBusinessFunction>>> approvableBusinessFunctions = cardsExternalIds.stream()
          .flatMap(s -> this.commercialCardService.findCardItemByCardId(s).stream())
          .collect(
              Collectors.toList()).stream()
          .filter(commercialCardItem -> commercialCardItem.getDefaultApprovalPolicy() != null)
          .map(commercialCardItem -> ApprovableBusinessFunction.builder()
              .approvalPolicyId(commercialCardItem.getDefaultApprovalPolicy())
              .businessFunction(commercialCardItem.getApprovableBusinessFunction())
              .resource(commercialCardItem.getApprovableResource()).build())
          .collect(Collectors.groupingBy(ApprovableBusinessFunction::getApprovalPolicyId,
              Collectors.groupingBy(ApprovableBusinessFunction::getResource)));
      approvableBusinessFunctions.keySet().forEach(policyId -> {
        Map<String, List<ApprovableBusinessFunction>> resources = approvableBusinessFunctions.get(
            policyId);
        this.policyAssignmentsApi.postCreatesBulkPolicyAssignments(
            new PresentationPostPolicyAssignmentBulkRequest().policyAssignments(
                resources.entrySet().stream().map(
                        entry -> this.getPolicyAssignments(externalServiceAgreementId, entry.getKey(),
                            entry.getValue().stream()
                                .map(ApprovableBusinessFunction::getBusinessFunction)
                                .distinct().collect(Collectors.toList()), policyId))
                    .collect(Collectors.toList())));
      });

      log.debug("Default policies assigned successfully to service agreement {}",
          externalServiceAgreementId);
    } catch (Exception e) {
      log.error("Error while assign default policies to service agreement {}",
          externalServiceAgreementId);
      throw new DefaultPolicyAssignmentException(e);
    }
  }

  public void deleteAssignedPolicies(String externalServiceAgreementId, List<String> cardsIds) {
    log.debug("Deleting approval policies for service agreement: {}", externalServiceAgreementId);
    cardsIds.forEach(cardId -> {
      List<CommercialCardItem> cardItems = this.commercialCardService.findCardItemByCardId(cardId);
      cardItems.forEach(commercialCardItem -> {
        if (commercialCardItem.getDefaultApprovalPolicy() != null) {
          this.deleteApprovalPolicy(externalServiceAgreementId, commercialCardItem);
        }
      });
    });
  }

  public void deleteAssignedPolicies(String externalServiceAgreementId) {
    log.debug("Deleting approval policies for service agreement: {}", externalServiceAgreementId);
    List<CommercialCardItem> cardItems = this.commercialCardService.findAllCardItems();
    cardItems.forEach(commercialCardItem -> {
      if (commercialCardItem.getDefaultApprovalPolicy() != null) {
        this.deleteApprovalPolicy(externalServiceAgreementId, commercialCardItem);
      }
    });
  }

  private void deleteApprovalPolicy(String externalServiceAgreementId,
      CommercialCardItem commercialCardItem) {
    try {
      this.policyAssignmentsApi.deletePolicyAssignment(
          externalServiceAgreementId, commercialCardItem.getApprovableResource(),
          commercialCardItem.getApprovableBusinessFunction()
      );
    } catch (Exception ex) {
      log.warn("Deleting approval policy for sa: {}, resource: {}, bf: {} failed due to",
          externalServiceAgreementId, commercialCardItem.getApprovableResource(),
          commercialCardItem.getApprovableBusinessFunction(), ex);
    }
  }

  private PresentationPolicyAssignmentRequest getPolicyAssignments(
      String externalServiceAgreementId, String resource, List<String> functions, String policyId) {
    return new PresentationPolicyAssignmentRequest().externalServiceAgreementId(
            externalServiceAgreementId).resource(resource)
        .functions(functions).addBoundsItem(
            new PresentationPolicyAssignmentRequestBounds().policyId(policyId));
  }
}
