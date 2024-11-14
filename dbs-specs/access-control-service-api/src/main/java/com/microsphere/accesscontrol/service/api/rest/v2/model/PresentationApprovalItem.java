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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

public class PresentationApprovalItem 
 {
    @JsonProperty("creatorUserFullName")
    private @Size(min=1, max=255)  String creatorUserFullName;

    @JsonProperty("creatorUserId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String creatorUserId;

    @JsonProperty("createdAt")
    private  String createdAt;

    @JsonProperty("action")
    private  PresentationApprovalAction action;

    @JsonProperty("category")
    private  PresentationApprovalCategory category;

    @JsonProperty("approvalId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String approvalId;


    public PresentationApprovalItem creatorUserFullName(String creatorUserFullName) {
        this.creatorUserFullName = creatorUserFullName;
        return this;
    }

    /**
     * Full name of the user who created the approval.
     * @return creatorUserFullName
     */
    @ApiModelProperty(value = "Full name of the user who created the approval.")
    @Size(min=1, max=255) 
    public @Size(min=1, max=255)  String getCreatorUserFullName() {
        return creatorUserFullName;
    }

    public void setCreatorUserFullName(@Size(min=1, max=255)  String creatorUserFullName) {
        this.creatorUserFullName = creatorUserFullName;
    }


    public PresentationApprovalItem creatorUserId(String creatorUserId) {
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


    public PresentationApprovalItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @ApiModelProperty(value = "")
    
    public  String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt( String createdAt) {
        this.createdAt = createdAt;
    }


    public PresentationApprovalItem action(PresentationApprovalAction action) {
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


    public PresentationApprovalItem category(PresentationApprovalCategory category) {
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


    public PresentationApprovalItem approvalId(String approvalId) {
        this.approvalId = approvalId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return approvalId
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String approvalId) {
        this.approvalId = approvalId;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationApprovalItem presentationApprovalItem = (PresentationApprovalItem) o;
        return Objects.equals(this.creatorUserFullName, presentationApprovalItem.creatorUserFullName) &&
                Objects.equals(this.creatorUserId, presentationApprovalItem.creatorUserId) &&
                Objects.equals(this.createdAt, presentationApprovalItem.createdAt) &&
                Objects.equals(this.action, presentationApprovalItem.action) &&
                Objects.equals(this.category, presentationApprovalItem.category) &&
                Objects.equals(this.approvalId, presentationApprovalItem.approvalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            creatorUserFullName,
            creatorUserId,
            createdAt,
            action,
            category,
            approvalId
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationApprovalItem {\n");
        
        sb.append("        creatorUserFullName: ").append(toIndentedString(creatorUserFullName)).append("\n");
        sb.append("        creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
        sb.append("        createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("        action: ").append(toIndentedString(action)).append("\n");
        sb.append("        category: ").append(toIndentedString(category)).append("\n");
        sb.append("        approvalId: ").append(toIndentedString(approvalId)).append("\n");
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

