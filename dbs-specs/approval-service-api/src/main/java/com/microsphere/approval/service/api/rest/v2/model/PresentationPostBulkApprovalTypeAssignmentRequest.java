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
import com.microsphere.approval.service.api.rest.v2.model.PresentationApprovalTypeAssignmentDto;
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
 * Assign an approval type to a job profile in bulk.
 */
@ApiModel(description = "Assign an approval type to a job profile in bulk.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PresentationPostBulkApprovalTypeAssignmentRequest 
 {
    @JsonProperty("approvalTypeAssignments")
    private List<PresentationApprovalTypeAssignmentDto> approvalTypeAssignments = new ArrayList<>();

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PresentationPostBulkApprovalTypeAssignmentRequest approvalTypeAssignments(List<PresentationApprovalTypeAssignmentDto> approvalTypeAssignments) {
        this.approvalTypeAssignments = approvalTypeAssignments;
        return this;
    }

    public PresentationPostBulkApprovalTypeAssignmentRequest addApprovalTypeAssignmentsItem(PresentationApprovalTypeAssignmentDto approvalTypeAssignmentsItem) {
        this.approvalTypeAssignments.add(approvalTypeAssignmentsItem);
        return this;
    }

    /**
     * The request body with a set of approval type assignments.
     * @return approvalTypeAssignments
     */
    @ApiModelProperty(required = true, value = "The request body with a set of approval type assignments.")
    @NotNull @Valid @Size(min=1, max=100) 
    public List<PresentationApprovalTypeAssignmentDto> getApprovalTypeAssignments() {
        return approvalTypeAssignments;
    }

    public void setApprovalTypeAssignments(List<PresentationApprovalTypeAssignmentDto> approvalTypeAssignments) {
        this.approvalTypeAssignments = approvalTypeAssignments;
    }


    public PresentationPostBulkApprovalTypeAssignmentRequest additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationPostBulkApprovalTypeAssignmentRequest putAdditionsItem(String key, String additionsItem) {
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
        PresentationPostBulkApprovalTypeAssignmentRequest presentationPostBulkApprovalTypeAssignmentRequest = (PresentationPostBulkApprovalTypeAssignmentRequest) o;
        return Objects.equals(this.approvalTypeAssignments, presentationPostBulkApprovalTypeAssignmentRequest.approvalTypeAssignments) &&
                Objects.equals(this.additions, presentationPostBulkApprovalTypeAssignmentRequest.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            approvalTypeAssignments,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPostBulkApprovalTypeAssignmentRequest {\n");
        
        sb.append("        approvalTypeAssignments: ").append(toIndentedString(approvalTypeAssignments)).append("\n");
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

