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
import com.microsphere.approval.service.api.rest.v2.model.ApprovalRecordStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * This is the request body to request an update of the status for an approval record.
 */
@ApiModel(description = "This is the request body to request an update of the status for an approval record.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PostApprovalRecordStatusUpdateRequest 
 {
    @JsonProperty("status")
    private  ApprovalRecordStatus status;

    @JsonProperty("statusCode")
    private  String statusCode;


    public PostApprovalRecordStatusUpdateRequest status(ApprovalRecordStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  ApprovalRecordStatus getStatus() {
        return status;
    }

    public void setStatus( ApprovalRecordStatus status) {
        this.status = status;
    }


    public PostApprovalRecordStatusUpdateRequest statusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get statusCode
     * @return statusCode
     */
    @ApiModelProperty(value = "")
    
    public  String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode( String statusCode) {
        this.statusCode = statusCode;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostApprovalRecordStatusUpdateRequest postApprovalRecordStatusUpdateRequest = (PostApprovalRecordStatusUpdateRequest) o;
        return Objects.equals(this.status, postApprovalRecordStatusUpdateRequest.status) &&
                Objects.equals(this.statusCode, postApprovalRecordStatusUpdateRequest.statusCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            status,
            statusCode
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostApprovalRecordStatusUpdateRequest {\n");
        
        sb.append("        status: ").append(toIndentedString(status)).append("\n");
        sb.append("        statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

