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
import com.microsphere.approval.service.api.rest.v2.model.ApprovalTypeDto;
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

public class PresentationAssignedApprovalTypeDto 
 {
    @JsonProperty("approvalType")
    private  ApprovalTypeDto approvalType;

    @JsonProperty("jobProfileId")
    private @Size(min=1, max=36)  String jobProfileId;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PresentationAssignedApprovalTypeDto approvalType(ApprovalTypeDto approvalType) {
        this.approvalType = approvalType;
        return this;
    }

    /**
     * Get approvalType
     * @return approvalType
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  ApprovalTypeDto getApprovalType() {
        return approvalType;
    }

    public void setApprovalType( ApprovalTypeDto approvalType) {
        this.approvalType = approvalType;
    }


    public PresentationAssignedApprovalTypeDto jobProfileId(String jobProfileId) {
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


    public PresentationAssignedApprovalTypeDto additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationAssignedApprovalTypeDto putAdditionsItem(String key, String additionsItem) {
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
        PresentationAssignedApprovalTypeDto presentationAssignedApprovalTypeDto = (PresentationAssignedApprovalTypeDto) o;
        return Objects.equals(this.approvalType, presentationAssignedApprovalTypeDto.approvalType) &&
                Objects.equals(this.jobProfileId, presentationAssignedApprovalTypeDto.jobProfileId) &&
                Objects.equals(this.additions, presentationAssignedApprovalTypeDto.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            approvalType,
            jobProfileId,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationAssignedApprovalTypeDto {\n");
        
        sb.append("        approvalType: ").append(toIndentedString(approvalType)).append("\n");
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

