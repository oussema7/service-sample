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
import com.microsphere.accesscontrol.service.api.rest.v2.model.ApprovalStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * PresentationApprovalStatusAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationApprovalStatusAllOf 
 {
    @JsonProperty("approvalStatus")
    private  ApprovalStatus approvalStatus;


    public PresentationApprovalStatusAllOf approvalStatus(ApprovalStatus approvalStatus) {
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
        PresentationApprovalStatusAllOf presentationApprovalStatusAllOf = (PresentationApprovalStatusAllOf) o;
        return Objects.equals(this.approvalStatus, presentationApprovalStatusAllOf.approvalStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            approvalStatus
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationApprovalStatusAllOf {\n");
        
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
