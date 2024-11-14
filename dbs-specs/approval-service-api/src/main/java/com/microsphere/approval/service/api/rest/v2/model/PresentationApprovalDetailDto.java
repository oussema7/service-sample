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
import com.microsphere.approval.service.api.rest.v2.model.ApprovalStatus;
import com.microsphere.approval.service.api.rest.v2.model.ApprovalTypeDto;
import com.microsphere.approval.service.api.rest.v2.model.PolicyDetailsDto;
import com.microsphere.approval.service.api.rest.v2.model.RecordDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
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
 * A detailed approval object that holds extended details of a single item to be approved.
 */
@ApiModel(description = "A detailed approval object that holds extended details of a single item to be approved.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PresentationApprovalDetailDto 
 {
    @JsonProperty("approvalTypes")
    private List<ApprovalTypeDto> approvalTypes = new ArrayList<>();

    @JsonProperty("policy")
    private  PolicyDetailsDto policy;

    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String id;

    @JsonProperty("userId")
    private @Size(min=1, max=36)  String userId;

    @JsonProperty("serviceAgreementId")
    private @Size(min=1, max=36)  String serviceAgreementId;

    @JsonProperty("itemId")
    private @Size(min=1, max=36)  String itemId;

    @JsonProperty("dataAccessItemId")
    private @Size(min=1, max=36)  String dataAccessItemId;

    @JsonProperty("resource")
    private @Size(max=32)  String resource;

    @JsonProperty("function")
    private @Size(max=32)  String function;

    @JsonProperty("status")
    private  ApprovalStatus status;

    @JsonProperty("records")
    private List<RecordDto> records = new ArrayList<>();

    @JsonProperty("canApprove")
    private  Boolean canApprove;

    @JsonProperty("canReject")
    private  Boolean canReject;

    @JsonProperty("finalApprover")
    private  Boolean finalApprover;

    @JsonProperty("action")
    private @Size(max=20)  String action;

    @JsonProperty("createdAt")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private  OffsetDateTime createdAt;

    @JsonProperty("externalUserId")
    private @Size(max=64)  String externalUserId;

    @JsonProperty("userFullName")
    private @Size(min=1, max=255)  String userFullName;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PresentationApprovalDetailDto approvalTypes(List<ApprovalTypeDto> approvalTypes) {
        this.approvalTypes = approvalTypes;
        return this;
    }

    public PresentationApprovalDetailDto addApprovalTypesItem(ApprovalTypeDto approvalTypesItem) {
        this.approvalTypes.add(approvalTypesItem);
        return this;
    }

    /**
     * Get approvalTypes
     * @return approvalTypes
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public List<ApprovalTypeDto> getApprovalTypes() {
        return approvalTypes;
    }

    public void setApprovalTypes(List<ApprovalTypeDto> approvalTypes) {
        this.approvalTypes = approvalTypes;
    }


    public PresentationApprovalDetailDto policy(PolicyDetailsDto policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  PolicyDetailsDto getPolicy() {
        return policy;
    }

    public void setPolicy( PolicyDetailsDto policy) {
        this.policy = policy;
    }


    public PresentationApprovalDetailDto id(String id) {
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


    public PresentationApprovalDetailDto userId(String userId) {
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


    public PresentationApprovalDetailDto serviceAgreementId(String serviceAgreementId) {
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


    public PresentationApprovalDetailDto itemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return itemId
     */
    @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @NotNull @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getItemId() {
        return itemId;
    }

    public void setItemId(@Size(min=1, max=36)  String itemId) {
        this.itemId = itemId;
    }


    public PresentationApprovalDetailDto dataAccessItemId(String dataAccessItemId) {
        this.dataAccessItemId = dataAccessItemId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return dataAccessItemId
     */
    @ApiModelProperty(value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getDataAccessItemId() {
        return dataAccessItemId;
    }

    public void setDataAccessItemId(@Size(min=1, max=36)  String dataAccessItemId) {
        this.dataAccessItemId = dataAccessItemId;
    }


    public PresentationApprovalDetailDto resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * This is the name of the resource.
     * @return resource
     */
    @ApiModelProperty(required = true, value = "This is the name of the resource.")
    @NotNull @Size(max=32) 
    public @Size(max=32)  String getResource() {
        return resource;
    }

    public void setResource(@Size(max=32)  String resource) {
        this.resource = resource;
    }


    public PresentationApprovalDetailDto function(String function) {
        this.function = function;
        return this;
    }

    /**
     * This is the name of the business function.
     * @return function
     */
    @ApiModelProperty(required = true, value = "This is the name of the business function.")
    @NotNull @Size(max=32) 
    public @Size(max=32)  String getFunction() {
        return function;
    }

    public void setFunction(@Size(max=32)  String function) {
        this.function = function;
    }


    public PresentationApprovalDetailDto status(ApprovalStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  ApprovalStatus getStatus() {
        return status;
    }

    public void setStatus( ApprovalStatus status) {
        this.status = status;
    }


    public PresentationApprovalDetailDto records(List<RecordDto> records) {
        this.records = records;
        return this;
    }

    public PresentationApprovalDetailDto addRecordsItem(RecordDto recordsItem) {
        this.records.add(recordsItem);
        return this;
    }

    /**
     * A list of records of all the actions users may have performed on the approval request.
     * @return records
     */
    @ApiModelProperty(required = true, value = "A list of records of all the actions users may have performed on the approval request.")
    @NotNull @Valid 
    public List<RecordDto> getRecords() {
        return records;
    }

    public void setRecords(List<RecordDto> records) {
        this.records = records;
    }


    public PresentationApprovalDetailDto canApprove(Boolean canApprove) {
        this.canApprove = canApprove;
        return this;
    }

    /**
     * This flag indicates if the user (with his current context) that is requesting the approval can approve it, depending on the policy that applies.
     * @return canApprove
     */
    @ApiModelProperty(value = "This flag indicates if the user (with his current context) that is requesting the approval can approve it, depending on the policy that applies.")
    
    public  Boolean getCanApprove() {
        return canApprove;
    }

    public void setCanApprove( Boolean canApprove) {
        this.canApprove = canApprove;
    }


    public PresentationApprovalDetailDto canReject(Boolean canReject) {
        this.canReject = canReject;
        return this;
    }

    /**
     * This flag indicates if the user (with his current context) that is requesting the approval can reject it, depending on the policy that applies.
     * @return canReject
     */
    @ApiModelProperty(value = "This flag indicates if the user (with his current context) that is requesting the approval can reject it, depending on the policy that applies.")
    
    public  Boolean getCanReject() {
        return canReject;
    }

    public void setCanReject( Boolean canReject) {
        this.canReject = canReject;
    }


    public PresentationApprovalDetailDto finalApprover(Boolean finalApprover) {
        this.finalApprover = finalApprover;
        return this;
    }

    /**
     * This flag indicates if the user (with his current context) is the final approver that is needed.
     * @return finalApprover
     */
    @ApiModelProperty(value = "This flag indicates if the user (with his current context) is the final approver that is needed.")
    
    public  Boolean getFinalApprover() {
        return finalApprover;
    }

    public void setFinalApprover( Boolean finalApprover) {
        this.finalApprover = finalApprover;
    }


    public PresentationApprovalDetailDto action(String action) {
        this.action = action;
        return this;
    }

    /**
     * The action of the approval request
     * @return action
     */
    @ApiModelProperty(value = "The action of the approval request")
    @Size(max=20) 
    public @Size(max=20)  String getAction() {
        return action;
    }

    public void setAction(@Size(max=20)  String action) {
        this.action = action;
    }


    public PresentationApprovalDetailDto createdAt(OffsetDateTime createdAt) {
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


    public PresentationApprovalDetailDto externalUserId(String externalUserId) {
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


    public PresentationApprovalDetailDto userFullName(String userFullName) {
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


    public PresentationApprovalDetailDto additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationApprovalDetailDto putAdditionsItem(String key, String additionsItem) {
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
        PresentationApprovalDetailDto presentationApprovalDetailDto = (PresentationApprovalDetailDto) o;
        return Objects.equals(this.approvalTypes, presentationApprovalDetailDto.approvalTypes) &&
                Objects.equals(this.policy, presentationApprovalDetailDto.policy) &&
                Objects.equals(this.id, presentationApprovalDetailDto.id) &&
                Objects.equals(this.userId, presentationApprovalDetailDto.userId) &&
                Objects.equals(this.serviceAgreementId, presentationApprovalDetailDto.serviceAgreementId) &&
                Objects.equals(this.itemId, presentationApprovalDetailDto.itemId) &&
                Objects.equals(this.dataAccessItemId, presentationApprovalDetailDto.dataAccessItemId) &&
                Objects.equals(this.resource, presentationApprovalDetailDto.resource) &&
                Objects.equals(this.function, presentationApprovalDetailDto.function) &&
                Objects.equals(this.status, presentationApprovalDetailDto.status) &&
                Objects.equals(this.records, presentationApprovalDetailDto.records) &&
                Objects.equals(this.canApprove, presentationApprovalDetailDto.canApprove) &&
                Objects.equals(this.canReject, presentationApprovalDetailDto.canReject) &&
                Objects.equals(this.finalApprover, presentationApprovalDetailDto.finalApprover) &&
                Objects.equals(this.action, presentationApprovalDetailDto.action) &&
                Objects.equals(this.createdAt, presentationApprovalDetailDto.createdAt) &&
                Objects.equals(this.externalUserId, presentationApprovalDetailDto.externalUserId) &&
                Objects.equals(this.userFullName, presentationApprovalDetailDto.userFullName) &&
                Objects.equals(this.additions, presentationApprovalDetailDto.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            approvalTypes,
            policy,
            id,
            userId,
            serviceAgreementId,
            itemId,
            dataAccessItemId,
            resource,
            function,
            status,
            records,
            canApprove,
            canReject,
            finalApprover,
            action,
            createdAt,
            externalUserId,
            userFullName,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationApprovalDetailDto {\n");
        
        sb.append("        approvalTypes: ").append(toIndentedString(approvalTypes)).append("\n");
        sb.append("        policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
        sb.append("        itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("        dataAccessItemId: ").append(toIndentedString(dataAccessItemId)).append("\n");
        sb.append("        resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("        function: ").append(toIndentedString(function)).append("\n");
        sb.append("        status: ").append(toIndentedString(status)).append("\n");
        sb.append("        records: ").append(toIndentedString(records)).append("\n");
        sb.append("        canApprove: ").append(toIndentedString(canApprove)).append("\n");
        sb.append("        canReject: ").append(toIndentedString(canReject)).append("\n");
        sb.append("        finalApprover: ").append(toIndentedString(finalApprover)).append("\n");
        sb.append("        action: ").append(toIndentedString(action)).append("\n");
        sb.append("        createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

