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
package com.microsphere.accesscontrol.service.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsphere.accesscontrol.service.api.rest.v2.model.AdditionalPropertiesAware;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ApprovalStatus;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationApprovalStatusAllOf;
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
 * PresentationApprovalStatus
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationApprovalStatus 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("approvalStatus")
    private  ApprovalStatus approvalStatus;


    public PresentationApprovalStatus additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationApprovalStatus putAdditionsItem(String key, String additionsItem) {
        if (this.additions == null) {
            this.additions = new HashMap<>();
        }
        this.additions.put(key, additionsItem);
        return this;
    }

    /**
     * Get additions
     * @return additions
     */
    @ApiModelProperty(value = "")
    
    public Map<String, String> getAdditions() {
        return additions;
    }

    public void setAdditions(Map<String, String> additions) {
        this.additions = additions;
    }


    public PresentationApprovalStatus approvalStatus(ApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }

    /**
     * Get approvalStatus
     * @return approvalStatus
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus( ApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationApprovalStatus presentationApprovalStatus = (PresentationApprovalStatus) o;
        return Objects.equals(this.additions, presentationApprovalStatus.additions) &&
                Objects.equals(this.approvalStatus, presentationApprovalStatus.approvalStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            approvalStatus
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationApprovalStatus {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
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

