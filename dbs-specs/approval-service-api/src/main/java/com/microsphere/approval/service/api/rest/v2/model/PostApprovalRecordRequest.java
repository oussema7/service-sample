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
import com.microsphere.approval.service.api.rest.v2.model.ConfirmationDetails;
import com.microsphere.approval.service.api.rest.v2.model.RecordStatus;
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
 * This is the request body to request an update of the status for an approval. This is initiated by a user when he either approves or rejects an item in a capability.
 */
@ApiModel(description = "This is the request body to request an update of the status for an approval. This is initiated by a user when he either approves or rejects an item in a capability.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PostApprovalRecordRequest 
 {
    @JsonProperty("userId")
    private @Size(min=1, max=36)  String userId;

    @JsonProperty("serviceAgreementId")
    private @Size(min=1, max=36)  String serviceAgreementId;

    @JsonProperty("status")
    private  RecordStatus status;

    @JsonProperty("comment")
    private @Size(max=140)  String comment;

    @JsonProperty("confirmationDetails")
    private  ConfirmationDetails confirmationDetails;

    @JsonProperty("statusCode")
    private  String statusCode;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PostApprovalRecordRequest userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return userId
     */
    @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @NotNull @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getUserId() {
        return userId;
    }

    public void setUserId(@Size(min=1, max=36)  String userId) {
        this.userId = userId;
    }


    public PostApprovalRecordRequest serviceAgreementId(String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return serviceAgreementId
     */
    @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @NotNull @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getServiceAgreementId() {
        return serviceAgreementId;
    }

    public void setServiceAgreementId(@Size(min=1, max=36)  String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
    }


    public PostApprovalRecordRequest status(RecordStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  RecordStatus getStatus() {
        return status;
    }

    public void setStatus( RecordStatus status) {
        this.status = status;
    }


    public PostApprovalRecordRequest comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * When approving or rejecting, the user can add comments which would explain the reason for the action.
     * @return comment
     */
    @ApiModelProperty(value = "When approving or rejecting, the user can add comments which would explain the reason for the action.")
    @Size(max=140) 
    public @Size(max=140)  String getComment() {
        return comment;
    }

    public void setComment(@Size(max=140)  String comment) {
        this.comment = comment;
    }


    public PostApprovalRecordRequest confirmationDetails(ConfirmationDetails confirmationDetails) {
        this.confirmationDetails = confirmationDetails;
        return this;
    }

    /**
     * Get confirmationDetails
     * @return confirmationDetails
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  ConfirmationDetails getConfirmationDetails() {
        return confirmationDetails;
    }

    public void setConfirmationDetails( ConfirmationDetails confirmationDetails) {
        this.confirmationDetails = confirmationDetails;
    }


    public PostApprovalRecordRequest statusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * This reflects the approval record status reason. If this field is set and confirmation flow is disabled, the approval record will be created with PROCESSING status and with this status code.
     * @return statusCode
     */
    @ApiModelProperty(value = "This reflects the approval record status reason. If this field is set and confirmation flow is disabled, the approval record will be created with PROCESSING status and with this status code.")
    
    public  String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode( String statusCode) {
        this.statusCode = statusCode;
    }


    public PostApprovalRecordRequest additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PostApprovalRecordRequest putAdditionsItem(String key, String additionsItem) {
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
        PostApprovalRecordRequest postApprovalRecordRequest = (PostApprovalRecordRequest) o;
        return Objects.equals(this.userId, postApprovalRecordRequest.userId) &&
                Objects.equals(this.serviceAgreementId, postApprovalRecordRequest.serviceAgreementId) &&
                Objects.equals(this.status, postApprovalRecordRequest.status) &&
                Objects.equals(this.comment, postApprovalRecordRequest.comment) &&
                Objects.equals(this.confirmationDetails, postApprovalRecordRequest.confirmationDetails) &&
                Objects.equals(this.statusCode, postApprovalRecordRequest.statusCode) &&
                Objects.equals(this.additions, postApprovalRecordRequest.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            userId,
            serviceAgreementId,
            status,
            comment,
            confirmationDetails,
            statusCode,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostApprovalRecordRequest {\n");
        
        sb.append("        userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
        sb.append("        status: ").append(toIndentedString(status)).append("\n");
        sb.append("        comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("        confirmationDetails: ").append(toIndentedString(confirmationDetails)).append("\n");
        sb.append("        statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

