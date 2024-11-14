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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationApprovalAction;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationApprovalCategory;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationApprovalLogItem;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationFunctionGroupsDataGroupsExtendedPair;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationFunctionGroupsDataGroupsPair;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Approval details
 */
@ApiModel(description = "Approval details")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationPermissionsApprovalDetailsItem 
 {
    @JsonProperty("approvalId")
    private @Size(min=1, max=36)  String approvalId;

    @JsonProperty("creatorUserFullName")
    private @Size(min=1, max=255)  String creatorUserFullName;

    @JsonProperty("creatorUserId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String creatorUserId;

    @JsonProperty("createdAt")
    private  String createdAt;

    @JsonProperty("userId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String userId;

    @JsonProperty("userFullName")
    private @Size(min=1, max=255)  String userFullName;

    @JsonProperty("serviceAgreementId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String serviceAgreementId;

    @JsonProperty("serviceAgreementName")
    private  String serviceAgreementName;

    @JsonProperty("serviceAgreementDescription")
    private @Size(min=1, max=255)  String serviceAgreementDescription;

    @JsonProperty("action")
    private  PresentationApprovalAction action;

    @JsonProperty("category")
    private  PresentationApprovalCategory category;

    @JsonProperty("newFunctionGroups")
    private List<PresentationFunctionGroupsDataGroupsPair> newFunctionGroups = null;

    @JsonProperty("removedFunctionGroups")
    private List<PresentationFunctionGroupsDataGroupsPair> removedFunctionGroups = null;

    @JsonProperty("modifiedFunctionGroups")
    private List<PresentationFunctionGroupsDataGroupsExtendedPair> modifiedFunctionGroups = null;

    @JsonProperty("unmodifiedFunctionGroups")
    private List<PresentationFunctionGroupsDataGroupsPair> unmodifiedFunctionGroups = null;

    @JsonProperty("requiredApproves")
    private  Integer requiredApproves;

    @JsonProperty("completedApproves")
    private  Integer completedApproves;

    @JsonProperty("approvalLog")
    private List<PresentationApprovalLogItem> approvalLog = null;


    public PresentationPermissionsApprovalDetailsItem approvalId(String approvalId) {
        this.approvalId = approvalId;
        return this;
    }

    /**
     * ID of the approval.
     * @return approvalId
     */
    @ApiModelProperty(value = "ID of the approval.")
    @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(@Size(min=1, max=36)  String approvalId) {
        this.approvalId = approvalId;
    }


    public PresentationPermissionsApprovalDetailsItem creatorUserFullName(String creatorUserFullName) {
        this.creatorUserFullName = creatorUserFullName;
        return this;
    }

    /**
     * Full name of the user who created the approval. Deprecated since 2.18.0, planned for removal in 2.19.0. This property is no longer used and will be ignored.
     * @return creatorUserFullName
     */
    @ApiModelProperty(value = "Full name of the user who created the approval. Deprecated since 2.18.0, planned for removal in 2.19.0. This property is no longer used and will be ignored.")
    @Size(min=1, max=255) 
    public @Size(min=1, max=255)  String getCreatorUserFullName() {
        return creatorUserFullName;
    }

    public void setCreatorUserFullName(@Size(min=1, max=255)  String creatorUserFullName) {
        this.creatorUserFullName = creatorUserFullName;
    }


    public PresentationPermissionsApprovalDetailsItem creatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return creatorUserId
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }


    public PresentationPermissionsApprovalDetailsItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Deprecated since 2.18.0, planned for removal in 2.19.0. This property is no longer used and will be ignored.
     * @return createdAt
     */
    @ApiModelProperty(value = "Deprecated since 2.18.0, planned for removal in 2.19.0. This property is no longer used and will be ignored.")
    
    public  String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt( String createdAt) {
        this.createdAt = createdAt;
    }


    public PresentationPermissionsApprovalDetailsItem userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return userId
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getUserId() {
        return userId;
    }

    public void setUserId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String userId) {
        this.userId = userId;
    }


    public PresentationPermissionsApprovalDetailsItem userFullName(String userFullName) {
        this.userFullName = userFullName;
        return this;
    }

    /**
     * User full name to whom the permissions are assigned
     * @return userFullName
     */
    @ApiModelProperty(value = "User full name to whom the permissions are assigned")
    @Size(min=1, max=255) 
    public @Size(min=1, max=255)  String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(@Size(min=1, max=255)  String userFullName) {
        this.userFullName = userFullName;
    }


    public PresentationPermissionsApprovalDetailsItem serviceAgreementId(String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return serviceAgreementId
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getServiceAgreementId() {
        return serviceAgreementId;
    }

    public void setServiceAgreementId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
    }


    public PresentationPermissionsApprovalDetailsItem serviceAgreementName(String serviceAgreementName) {
        this.serviceAgreementName = serviceAgreementName;
        return this;
    }

    /**
     * Service Agreement name.
     * @return serviceAgreementName
     */
    @ApiModelProperty(value = "Service Agreement name.")
    
    public  String getServiceAgreementName() {
        return serviceAgreementName;
    }

    public void setServiceAgreementName( String serviceAgreementName) {
        this.serviceAgreementName = serviceAgreementName;
    }


    public PresentationPermissionsApprovalDetailsItem serviceAgreementDescription(String serviceAgreementDescription) {
        this.serviceAgreementDescription = serviceAgreementDescription;
        return this;
    }

    /**
     * Service Agreement descriptioin.
     * @return serviceAgreementDescription
     */
    @ApiModelProperty(value = "Service Agreement descriptioin.")
    @Size(min=1, max=255) 
    public @Size(min=1, max=255)  String getServiceAgreementDescription() {
        return serviceAgreementDescription;
    }

    public void setServiceAgreementDescription(@Size(min=1, max=255)  String serviceAgreementDescription) {
        this.serviceAgreementDescription = serviceAgreementDescription;
    }


    public PresentationPermissionsApprovalDetailsItem action(PresentationApprovalAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  PresentationApprovalAction getAction() {
        return action;
    }

    public void setAction( PresentationApprovalAction action) {
        this.action = action;
    }


    public PresentationPermissionsApprovalDetailsItem category(PresentationApprovalCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  PresentationApprovalCategory getCategory() {
        return category;
    }

    public void setCategory( PresentationApprovalCategory category) {
        this.category = category;
    }


    public PresentationPermissionsApprovalDetailsItem newFunctionGroups(List<PresentationFunctionGroupsDataGroupsPair> newFunctionGroups) {
        this.newFunctionGroups = newFunctionGroups;
        return this;
    }

    public PresentationPermissionsApprovalDetailsItem addNewFunctionGroupsItem(PresentationFunctionGroupsDataGroupsPair newFunctionGroupsItem) {
        if (this.newFunctionGroups == null) {
            this.newFunctionGroups = new ArrayList<>();
        }
        this.newFunctionGroups.add(newFunctionGroupsItem);
        return this;
    }

    /**
     * Get newFunctionGroups
     * @return newFunctionGroups
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<PresentationFunctionGroupsDataGroupsPair> getNewFunctionGroups() {
        return newFunctionGroups;
    }

    public void setNewFunctionGroups(List<PresentationFunctionGroupsDataGroupsPair> newFunctionGroups) {
        this.newFunctionGroups = newFunctionGroups;
    }


    public PresentationPermissionsApprovalDetailsItem removedFunctionGroups(List<PresentationFunctionGroupsDataGroupsPair> removedFunctionGroups) {
        this.removedFunctionGroups = removedFunctionGroups;
        return this;
    }

    public PresentationPermissionsApprovalDetailsItem addRemovedFunctionGroupsItem(PresentationFunctionGroupsDataGroupsPair removedFunctionGroupsItem) {
        if (this.removedFunctionGroups == null) {
            this.removedFunctionGroups = new ArrayList<>();
        }
        this.removedFunctionGroups.add(removedFunctionGroupsItem);
        return this;
    }

    /**
     * Get removedFunctionGroups
     * @return removedFunctionGroups
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<PresentationFunctionGroupsDataGroupsPair> getRemovedFunctionGroups() {
        return removedFunctionGroups;
    }

    public void setRemovedFunctionGroups(List<PresentationFunctionGroupsDataGroupsPair> removedFunctionGroups) {
        this.removedFunctionGroups = removedFunctionGroups;
    }


    public PresentationPermissionsApprovalDetailsItem modifiedFunctionGroups(List<PresentationFunctionGroupsDataGroupsExtendedPair> modifiedFunctionGroups) {
        this.modifiedFunctionGroups = modifiedFunctionGroups;
        return this;
    }

    public PresentationPermissionsApprovalDetailsItem addModifiedFunctionGroupsItem(PresentationFunctionGroupsDataGroupsExtendedPair modifiedFunctionGroupsItem) {
        if (this.modifiedFunctionGroups == null) {
            this.modifiedFunctionGroups = new ArrayList<>();
        }
        this.modifiedFunctionGroups.add(modifiedFunctionGroupsItem);
        return this;
    }

    /**
     * Get modifiedFunctionGroups
     * @return modifiedFunctionGroups
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<PresentationFunctionGroupsDataGroupsExtendedPair> getModifiedFunctionGroups() {
        return modifiedFunctionGroups;
    }

    public void setModifiedFunctionGroups(List<PresentationFunctionGroupsDataGroupsExtendedPair> modifiedFunctionGroups) {
        this.modifiedFunctionGroups = modifiedFunctionGroups;
    }


    public PresentationPermissionsApprovalDetailsItem unmodifiedFunctionGroups(List<PresentationFunctionGroupsDataGroupsPair> unmodifiedFunctionGroups) {
        this.unmodifiedFunctionGroups = unmodifiedFunctionGroups;
        return this;
    }

    public PresentationPermissionsApprovalDetailsItem addUnmodifiedFunctionGroupsItem(PresentationFunctionGroupsDataGroupsPair unmodifiedFunctionGroupsItem) {
        if (this.unmodifiedFunctionGroups == null) {
            this.unmodifiedFunctionGroups = new ArrayList<>();
        }
        this.unmodifiedFunctionGroups.add(unmodifiedFunctionGroupsItem);
        return this;
    }

    /**
     * Get unmodifiedFunctionGroups
     * @return unmodifiedFunctionGroups
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<PresentationFunctionGroupsDataGroupsPair> getUnmodifiedFunctionGroups() {
        return unmodifiedFunctionGroups;
    }

    public void setUnmodifiedFunctionGroups(List<PresentationFunctionGroupsDataGroupsPair> unmodifiedFunctionGroups) {
        this.unmodifiedFunctionGroups = unmodifiedFunctionGroups;
    }


    public PresentationPermissionsApprovalDetailsItem requiredApproves(Integer requiredApproves) {
        this.requiredApproves = requiredApproves;
        return this;
    }

    /**
     * Number of required approves for the action to be successful.
     * @return requiredApproves
     */
    @ApiModelProperty(value = "Number of required approves for the action to be successful.")
    
    public  Integer getRequiredApproves() {
        return requiredApproves;
    }

    public void setRequiredApproves( Integer requiredApproves) {
        this.requiredApproves = requiredApproves;
    }


    public PresentationPermissionsApprovalDetailsItem completedApproves(Integer completedApproves) {
        this.completedApproves = completedApproves;
        return this;
    }

    /**
     * Number of approves that the action has.
     * @return completedApproves
     */
    @ApiModelProperty(value = "Number of approves that the action has.")
    
    public  Integer getCompletedApproves() {
        return completedApproves;
    }

    public void setCompletedApproves( Integer completedApproves) {
        this.completedApproves = completedApproves;
    }


    public PresentationPermissionsApprovalDetailsItem approvalLog(List<PresentationApprovalLogItem> approvalLog) {
        this.approvalLog = approvalLog;
        return this;
    }

    public PresentationPermissionsApprovalDetailsItem addApprovalLogItem(PresentationApprovalLogItem approvalLogItem) {
        if (this.approvalLog == null) {
            this.approvalLog = new ArrayList<>();
        }
        this.approvalLog.add(approvalLogItem);
        return this;
    }

    /**
     * Deprecated since 2.18.0, planned for removal in 2.19.0. This property is no longer used and will be ignored.
     * @return approvalLog
     */
    @ApiModelProperty(value = "Deprecated since 2.18.0, planned for removal in 2.19.0. This property is no longer used and will be ignored.")
    @Valid 
    public List<PresentationApprovalLogItem> getApprovalLog() {
        return approvalLog;
    }

    public void setApprovalLog(List<PresentationApprovalLogItem> approvalLog) {
        this.approvalLog = approvalLog;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationPermissionsApprovalDetailsItem presentationPermissionsApprovalDetailsItem = (PresentationPermissionsApprovalDetailsItem) o;
        return Objects.equals(this.approvalId, presentationPermissionsApprovalDetailsItem.approvalId) &&
                Objects.equals(this.creatorUserFullName, presentationPermissionsApprovalDetailsItem.creatorUserFullName) &&
                Objects.equals(this.creatorUserId, presentationPermissionsApprovalDetailsItem.creatorUserId) &&
                Objects.equals(this.createdAt, presentationPermissionsApprovalDetailsItem.createdAt) &&
                Objects.equals(this.userId, presentationPermissionsApprovalDetailsItem.userId) &&
                Objects.equals(this.userFullName, presentationPermissionsApprovalDetailsItem.userFullName) &&
                Objects.equals(this.serviceAgreementId, presentationPermissionsApprovalDetailsItem.serviceAgreementId) &&
                Objects.equals(this.serviceAgreementName, presentationPermissionsApprovalDetailsItem.serviceAgreementName) &&
                Objects.equals(this.serviceAgreementDescription, presentationPermissionsApprovalDetailsItem.serviceAgreementDescription) &&
                Objects.equals(this.action, presentationPermissionsApprovalDetailsItem.action) &&
                Objects.equals(this.category, presentationPermissionsApprovalDetailsItem.category) &&
                Objects.equals(this.newFunctionGroups, presentationPermissionsApprovalDetailsItem.newFunctionGroups) &&
                Objects.equals(this.removedFunctionGroups, presentationPermissionsApprovalDetailsItem.removedFunctionGroups) &&
                Objects.equals(this.modifiedFunctionGroups, presentationPermissionsApprovalDetailsItem.modifiedFunctionGroups) &&
                Objects.equals(this.unmodifiedFunctionGroups, presentationPermissionsApprovalDetailsItem.unmodifiedFunctionGroups) &&
                Objects.equals(this.requiredApproves, presentationPermissionsApprovalDetailsItem.requiredApproves) &&
                Objects.equals(this.completedApproves, presentationPermissionsApprovalDetailsItem.completedApproves) &&
                Objects.equals(this.approvalLog, presentationPermissionsApprovalDetailsItem.approvalLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            approvalId,
            creatorUserFullName,
            creatorUserId,
            createdAt,
            userId,
            userFullName,
            serviceAgreementId,
            serviceAgreementName,
            serviceAgreementDescription,
            action,
            category,
            newFunctionGroups,
            removedFunctionGroups,
            modifiedFunctionGroups,
            unmodifiedFunctionGroups,
            requiredApproves,
            completedApproves,
            approvalLog
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPermissionsApprovalDetailsItem {\n");
        
        sb.append("        approvalId: ").append(toIndentedString(approvalId)).append("\n");
        sb.append("        creatorUserFullName: ").append(toIndentedString(creatorUserFullName)).append("\n");
        sb.append("        creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
        sb.append("        createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("        userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("        userFullName: ").append(toIndentedString(userFullName)).append("\n");
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
        sb.append("        serviceAgreementName: ").append(toIndentedString(serviceAgreementName)).append("\n");
        sb.append("        serviceAgreementDescription: ").append(toIndentedString(serviceAgreementDescription)).append("\n");
        sb.append("        action: ").append(toIndentedString(action)).append("\n");
        sb.append("        category: ").append(toIndentedString(category)).append("\n");
        sb.append("        newFunctionGroups: ").append(toIndentedString(newFunctionGroups)).append("\n");
        sb.append("        removedFunctionGroups: ").append(toIndentedString(removedFunctionGroups)).append("\n");
        sb.append("        modifiedFunctionGroups: ").append(toIndentedString(modifiedFunctionGroups)).append("\n");
        sb.append("        unmodifiedFunctionGroups: ").append(toIndentedString(unmodifiedFunctionGroups)).append("\n");
        sb.append("        requiredApproves: ").append(toIndentedString(requiredApproves)).append("\n");
        sb.append("        completedApproves: ").append(toIndentedString(completedApproves)).append("\n");
        sb.append("        approvalLog: ").append(toIndentedString(approvalLog)).append("\n");
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

