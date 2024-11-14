/*
Boat Generator configuration:
    useBeanValidation: true
    useOptional: false
    addServletRequest: false
    useLombokAnnotations: false
    openApiNullable: true
    useSetForUniqueItems: false
    useWithModifiers: false
*/
package com.microsphere.approval.service.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsphere.approval.service.api.rest.v2.model.PresentationPolicyAssignmentRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Assign a policy.
 */
@ApiModel(description = "Assign a policy.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PresentationPostPolicyAssignmentBulkRequest 
 {
    @JsonProperty("policyAssignments")
    private List<PresentationPolicyAssignmentRequest> policyAssignments = new ArrayList<>();

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PresentationPostPolicyAssignmentBulkRequest policyAssignments(List<PresentationPolicyAssignmentRequest> policyAssignments) {
        this.policyAssignments = policyAssignments;
        return this;
    }

    public PresentationPostPolicyAssignmentBulkRequest addPolicyAssignmentsItem(PresentationPolicyAssignmentRequest policyAssignmentsItem) {
        this.policyAssignments.add(policyAssignmentsItem);
        return this;
    }

    /**
     * Get policyAssignments
     * @return policyAssignments
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid @Size(min=1) 
    public List<PresentationPolicyAssignmentRequest> getPolicyAssignments() {
        return policyAssignments;
    }

    public void setPolicyAssignments(List<PresentationPolicyAssignmentRequest> policyAssignments) {
        this.policyAssignments = policyAssignments;
    }


    public PresentationPostPolicyAssignmentBulkRequest additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationPostPolicyAssignmentBulkRequest putAdditionsItem(String key, String additionsItem) {
        if (this.additions == null) {
            this.additions = new HashMap<>();
        }
        this.additions.put(key, additionsItem);
        return this;
    }

    /**
     * Additional properties
     * @return additions
     */
    @ApiModelProperty(value = "Additional properties")
    
    public Map<String, String> getAdditions() {
        return additions;
    }

    public void setAdditions(Map<String, String> additions) {
        this.additions = additions;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationPostPolicyAssignmentBulkRequest presentationPostPolicyAssignmentBulkRequest = (PresentationPostPolicyAssignmentBulkRequest) o;
        return Objects.equals(this.policyAssignments, presentationPostPolicyAssignmentBulkRequest.policyAssignments) &&
                Objects.equals(this.additions, presentationPostPolicyAssignmentBulkRequest.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            policyAssignments,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPostPolicyAssignmentBulkRequest {\n");
        
        sb.append("        policyAssignments: ").append(toIndentedString(policyAssignments)).append("\n");
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n        ");
    }
}

