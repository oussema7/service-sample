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
 * A single assignment of an approval type to a job profile.
 */
@ApiModel(description = "A single assignment of an approval type to a job profile.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PresentationApprovalTypeAssignmentDto 
 {
    @JsonProperty("approvalTypeId")
    private @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String approvalTypeId;

    @JsonProperty("jobProfileId")
    private @Size(min=1, max=36)  String jobProfileId;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PresentationApprovalTypeAssignmentDto approvalTypeId(String approvalTypeId) {
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


    public PresentationApprovalTypeAssignmentDto jobProfileId(String jobProfileId) {
        this.jobProfileId = jobProfileId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return jobProfileId
     */
    @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @NotNull @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getJobProfileId() {
        return jobProfileId;
    }

    public void setJobProfileId(@Size(min=1, max=36)  String jobProfileId) {
        this.jobProfileId = jobProfileId;
    }


    public PresentationApprovalTypeAssignmentDto additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationApprovalTypeAssignmentDto putAdditionsItem(String key, String additionsItem) {
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
        PresentationApprovalTypeAssignmentDto presentationApprovalTypeAssignmentDto = (PresentationApprovalTypeAssignmentDto) o;
        return Objects.equals(this.approvalTypeId, presentationApprovalTypeAssignmentDto.approvalTypeId) &&
                Objects.equals(this.jobProfileId, presentationApprovalTypeAssignmentDto.jobProfileId) &&
                Objects.equals(this.additions, presentationApprovalTypeAssignmentDto.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            approvalTypeId,
            jobProfileId,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationApprovalTypeAssignmentDto {\n");
        
        sb.append("        approvalTypeId: ").append(toIndentedString(approvalTypeId)).append("\n");
        sb.append("        jobProfileId: ").append(toIndentedString(jobProfileId)).append("\n");
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

