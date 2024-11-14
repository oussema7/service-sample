/*
 * Access Control service API
 * Manage user permissions, data groups, function groups and service agreements from service to service side
 *
 * The version of the OpenAPI document: 2.11.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.accesscontrol.service.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationApprovalAction;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationApprovalCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * Approval details
 */
@ApiModel(description = "Approval details")
@JsonPropertyOrder({
  PresentationApprovalItem.JSON_PROPERTY_CREATOR_USER_FULL_NAME,
  PresentationApprovalItem.JSON_PROPERTY_CREATOR_USER_ID,
  PresentationApprovalItem.JSON_PROPERTY_CREATED_AT,
  PresentationApprovalItem.JSON_PROPERTY_ACTION,
  PresentationApprovalItem.JSON_PROPERTY_CATEGORY,
  PresentationApprovalItem.JSON_PROPERTY_APPROVAL_ID
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PresentationApprovalItem {
  public static final String JSON_PROPERTY_CREATOR_USER_FULL_NAME = "creatorUserFullName";
  private String creatorUserFullName;

  public static final String JSON_PROPERTY_CREATOR_USER_ID = "creatorUserId";
  private String creatorUserId;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_ACTION = "action";
  private PresentationApprovalAction action;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private PresentationApprovalCategory category;

  public static final String JSON_PROPERTY_APPROVAL_ID = "approvalId";
  private String approvalId;


  public PresentationApprovalItem creatorUserFullName(String creatorUserFullName) {
    
    this.creatorUserFullName = creatorUserFullName;
    return this;
  }

   /**
   * Full name of the user who created the approval.
   * @return creatorUserFullName
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "Full name of the user who created the approval.")
  @JsonProperty(JSON_PROPERTY_CREATOR_USER_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatorUserFullName() {
    return creatorUserFullName;
  }


  public void setCreatorUserFullName(String creatorUserFullName) {
    this.creatorUserFullName = creatorUserFullName;
  }


  public PresentationApprovalItem creatorUserId(String creatorUserId) {
    
    this.creatorUserId = creatorUserId;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return creatorUserId
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_CREATOR_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatorUserId() {
    return creatorUserId;
  }


  public void setCreatorUserId(String creatorUserId) {
    this.creatorUserId = creatorUserId;
  }


  public PresentationApprovalItem createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public PresentationApprovalItem action(PresentationApprovalAction action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PresentationApprovalAction getAction() {
    return action;
  }


  public void setAction(PresentationApprovalAction action) {
    this.action = action;
  }


  public PresentationApprovalItem category(PresentationApprovalCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PresentationApprovalCategory getCategory() {
    return category;
  }


  public void setCategory(PresentationApprovalCategory category) {
    this.category = category;
  }


  public PresentationApprovalItem approvalId(String approvalId) {
    
    this.approvalId = approvalId;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return approvalId
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_APPROVAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApprovalId() {
    return approvalId;
  }


  public void setApprovalId(String approvalId) {
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
    return Objects.hash(creatorUserFullName, creatorUserId, createdAt, action, category, approvalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationApprovalItem {\n");
    sb.append("    creatorUserFullName: ").append(toIndentedString(creatorUserFullName)).append("\n");
    sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    approvalId: ").append(toIndentedString(approvalId)).append("\n");
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
    return o.toString().replace("\n", "\n    ");
  }

}
