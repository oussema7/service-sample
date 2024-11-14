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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * A policy item defines how many approvals, of what approval type are needed.
 */
@ApiModel(description = "A policy item defines how many approvals, of what approval type are needed.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class CreatePolicyItemDto 
 {
    @JsonProperty("approvalTypeId")
    private @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String approvalTypeId;

    @JsonProperty("numberOfApprovals")
    private @Min(1) @Max(99)  Integer numberOfApprovals;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public CreatePolicyItemDto approvalTypeId(String approvalTypeId) {
        this.approvalTypeId = approvalTypeId;
        return this;
    }

    /**
     * Universal Unique Identifier, 
     * @return approvalTypeId
     */
    @ApiModelProperty(required = true, value = "Universal Unique Identifier, ")
    @NotNull @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$") 
    public @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String getApprovalTypeId() {
        return approvalTypeId;
    }

    public void setApprovalTypeId(@Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String approvalTypeId) {
        this.approvalTypeId = approvalTypeId;
    }


    public CreatePolicyItemDto numberOfApprovals(Integer numberOfApprovals) {
        this.numberOfApprovals = numberOfApprovals;
        return this;
    }

    /**
     * The number of a certain type of approval that is required.
     * minimum: 1
     * maximum: 99
     * @return numberOfApprovals
     */
    @ApiModelProperty(required = true, value = "The number of a certain type of approval that is required.")
    @NotNull @Min(1) @Max(99) 
    public @Min(1) @Max(99)  Integer getNumberOfApprovals() {
        return numberOfApprovals;
    }

    public void setNumberOfApprovals(@Min(1) @Max(99)  Integer numberOfApprovals) {
        this.numberOfApprovals = numberOfApprovals;
    }


    public CreatePolicyItemDto additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public CreatePolicyItemDto putAdditionsItem(String key, String additionsItem) {
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
        CreatePolicyItemDto createPolicyItemDto = (CreatePolicyItemDto) o;
        return Objects.equals(this.approvalTypeId, createPolicyItemDto.approvalTypeId) &&
                Objects.equals(this.numberOfApprovals, createPolicyItemDto.numberOfApprovals) &&
                Objects.equals(this.additions, createPolicyItemDto.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            approvalTypeId,
            numberOfApprovals,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePolicyItemDto {\n");
        
        sb.append("        approvalTypeId: ").append(toIndentedString(approvalTypeId)).append("\n");
        sb.append("        numberOfApprovals: ").append(toIndentedString(numberOfApprovals)).append("\n");
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

