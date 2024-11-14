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
import com.microsphere.approval.service.api.rest.v2.model.RecordStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * A single record of either an approval or rejection by a user on an approval request.
 */
@ApiModel(description = "A single record of either an approval or rejection by a user on an approval request.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class RecordDto 
 {
    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String id;

    @JsonProperty("userId")
    private @Size(min=1, max=36)  String userId;

    @JsonProperty("serviceAgreementId")
    private @Size(min=1, max=36)  String serviceAgreementId;

    @JsonProperty("approvalTypeId")
    private @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String approvalTypeId;

    @JsonProperty("status")
    private  RecordStatus status;

    @JsonProperty("createdAt")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private  OffsetDateTime createdAt;

    @JsonProperty("comment")
    private @Size(max=140)  String comment;

    @JsonProperty("externalUserId")
    private @Size(max=64)  String externalUserId;

    @JsonProperty("userFullName")
    private @Size(min=1, max=255)  String userFullName;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public RecordDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Universal Unique Identifier, 
     * @return id
     */
    @ApiModelProperty(required = true, value = "Universal Unique Identifier, ")
    @NotNull @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$") 
    public @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String getId() {
        return id;
    }

    public void setId(@Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String id) {
        this.id = id;
    }


    public RecordDto userId(String userId) {
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


    public RecordDto serviceAgreementId(String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return serviceAgreementId
     */
    @ApiModelProperty(value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getServiceAgreementId() {
        return serviceAgreementId;
    }

    public void setServiceAgreementId(@Size(min=1, max=36)  String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
    }


    public RecordDto approvalTypeId(String approvalTypeId) {
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


    public RecordDto status(RecordStatus status) {
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


    public RecordDto createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The timestamp indicates when the object was created.
     * @return createdAt
     */
    @ApiModelProperty(required = true, value = "The timestamp indicates when the object was created.")
    @NotNull @Valid 
    public  OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt( OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }


    public RecordDto comment(String comment) {
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


    public RecordDto externalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }

    /**
     * The (unique and human readable) external user id of the user.
     * @return externalUserId
     */
    @ApiModelProperty(value = "The (unique and human readable) external user id of the user.")
    @Size(max=64) 
    public @Size(max=64)  String getExternalUserId() {
        return externalUserId;
    }

    public void setExternalUserId(@Size(max=64)  String externalUserId) {
        this.externalUserId = externalUserId;
    }


    public RecordDto userFullName(String userFullName) {
        this.userFullName = userFullName;
        return this;
    }

    /**
     * The full name of a user.
     * @return userFullName
     */
    @ApiModelProperty(value = "The full name of a user.")
    @Size(min=1, max=255) 
    public @Size(min=1, max=255)  String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(@Size(min=1, max=255)  String userFullName) {
        this.userFullName = userFullName;
    }


    public RecordDto additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public RecordDto putAdditionsItem(String key, String additionsItem) {
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
        RecordDto recordDto = (RecordDto) o;
        return Objects.equals(this.id, recordDto.id) &&
                Objects.equals(this.userId, recordDto.userId) &&
                Objects.equals(this.serviceAgreementId, recordDto.serviceAgreementId) &&
                Objects.equals(this.approvalTypeId, recordDto.approvalTypeId) &&
                Objects.equals(this.status, recordDto.status) &&
                Objects.equals(this.createdAt, recordDto.createdAt) &&
                Objects.equals(this.comment, recordDto.comment) &&
                Objects.equals(this.externalUserId, recordDto.externalUserId) &&
                Objects.equals(this.userFullName, recordDto.userFullName) &&
                Objects.equals(this.additions, recordDto.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            userId,
            serviceAgreementId,
            approvalTypeId,
            status,
            createdAt,
            comment,
            externalUserId,
            userFullName,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordDto {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
        sb.append("        approvalTypeId: ").append(toIndentedString(approvalTypeId)).append("\n");
        sb.append("        status: ").append(toIndentedString(status)).append("\n");
        sb.append("        createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("        comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("        externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
        sb.append("        userFullName: ").append(toIndentedString(userFullName)).append("\n");
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

