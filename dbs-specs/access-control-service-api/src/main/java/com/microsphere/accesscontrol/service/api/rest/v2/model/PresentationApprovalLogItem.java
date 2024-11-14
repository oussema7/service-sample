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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Approver information.
 */
@ApiModel(description = "Approver information.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationApprovalLogItem 
 {
    @JsonProperty("approverId")
    private  String approverId;

    @JsonProperty("approverFullName")
    private  String approverFullName;

    @JsonProperty("approvedAt")
    private  String approvedAt;


    public PresentationApprovalLogItem approverId(String approverId) {
        this.approverId = approverId;
        return this;
    }

    /**
     * This is the user id of the approver that approved the action.
     * @return approverId
     */
    @ApiModelProperty(value = "This is the user id of the approver that approved the action.")
    
    public  String getApproverId() {
        return approverId;
    }

    public void setApproverId( String approverId) {
        this.approverId = approverId;
    }


    public PresentationApprovalLogItem approverFullName(String approverFullName) {
        this.approverFullName = approverFullName;
        return this;
    }

    /**
     * This is the name of the user that approved the action.
     * @return approverFullName
     */
    @ApiModelProperty(value = "This is the name of the user that approved the action.")
    
    public  String getApproverFullName() {
        return approverFullName;
    }

    public void setApproverFullName( String approverFullName) {
        this.approverFullName = approverFullName;
    }


    public PresentationApprovalLogItem approvedAt(String approvedAt) {
        this.approvedAt = approvedAt;
        return this;
    }

    /**
     * Get approvedAt
     * @return approvedAt
     */
    @ApiModelProperty(value = "")
    
    public  String getApprovedAt() {
        return approvedAt;
    }

    public void setApprovedAt( String approvedAt) {
        this.approvedAt = approvedAt;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationApprovalLogItem presentationApprovalLogItem = (PresentationApprovalLogItem) o;
        return Objects.equals(this.approverId, presentationApprovalLogItem.approverId) &&
                Objects.equals(this.approverFullName, presentationApprovalLogItem.approverFullName) &&
                Objects.equals(this.approvedAt, presentationApprovalLogItem.approvedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            approverId,
            approverFullName,
            approvedAt
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationApprovalLogItem {\n");
        
        sb.append("        approverId: ").append(toIndentedString(approverId)).append("\n");
        sb.append("        approverFullName: ").append(toIndentedString(approverFullName)).append("\n");
        sb.append("        approvedAt: ").append(toIndentedString(approvedAt)).append("\n");
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

