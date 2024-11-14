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
import com.microsphere.approval.service.api.rest.v2.model.PresentationPolicyAssignmentDto;
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
 * Response with a list of policy assignments.
 */
@ApiModel(description = "Response with a list of policy assignments.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PostFilterPolicyAssignmentResponse 
 {
    @JsonProperty("policyAssignments")
    private List<PresentationPolicyAssignmentDto> policyAssignments = new ArrayList<>();

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PostFilterPolicyAssignmentResponse policyAssignments(List<PresentationPolicyAssignmentDto> policyAssignments) {
        this.policyAssignments = policyAssignments;
        return this;
    }

    public PostFilterPolicyAssignmentResponse addPolicyAssignmentsItem(PresentationPolicyAssignmentDto policyAssignmentsItem) {
        this.policyAssignments.add(policyAssignmentsItem);
        return this;
    }

    /**
     * Get policyAssignments
     * @return policyAssignments
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public List<PresentationPolicyAssignmentDto> getPolicyAssignments() {
        return policyAssignments;
    }

    public void setPolicyAssignments(List<PresentationPolicyAssignmentDto> policyAssignments) {
        this.policyAssignments = policyAssignments;
    }


    public PostFilterPolicyAssignmentResponse additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PostFilterPolicyAssignmentResponse putAdditionsItem(String key, String additionsItem) {
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
        PostFilterPolicyAssignmentResponse postFilterPolicyAssignmentResponse = (PostFilterPolicyAssignmentResponse) o;
        return Objects.equals(this.policyAssignments, postFilterPolicyAssignmentResponse.policyAssignments) &&
                Objects.equals(this.additions, postFilterPolicyAssignmentResponse.additions);
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
        sb.append("class PostFilterPolicyAssignmentResponse {\n");
        
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

