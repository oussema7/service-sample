/*
 * Legal Entity Ancestor Service API
 * OpenApi Endpoints for managing Legal Entities Ancestors. 
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.accesscontrolextension.service.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.accesscontrolextension.service.api.listener.v2.model.FunctionDataGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ApprovalPermissionsAllOf
 */
@JsonPropertyOrder({
  ApprovalPermissionsAllOf.JSON_PROPERTY_APPROVAL_ID,
  ApprovalPermissionsAllOf.JSON_PROPERTY_ITEMS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:46.958085800+01:00[Africa/Tunis]")
public  class ApprovalPermissionsAllOf {
  public static final String JSON_PROPERTY_APPROVAL_ID = "approvalId";
  private String approvalId;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<FunctionDataGroup> items = null;


  public ApprovalPermissionsAllOf approvalId(String approvalId) {
    
    this.approvalId = approvalId;
    return this;
  }

   /**
   * Id of approval request.
   * @return approvalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of approval request.")
  @JsonProperty(JSON_PROPERTY_APPROVAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApprovalId() {
    return approvalId;
  }


  public void setApprovalId(String approvalId) {
    this.approvalId = approvalId;
  }


  public ApprovalPermissionsAllOf items(List<FunctionDataGroup> items) {
    
    this.items = items;
    return this;
  }

  public ApprovalPermissionsAllOf addItemsItem(FunctionDataGroup itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FunctionDataGroup> getItems() {
    return items;
  }


  public void setItems(List<FunctionDataGroup> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalPermissionsAllOf approvalPermissionsAllOf = (ApprovalPermissionsAllOf) o;
    return Objects.equals(this.approvalId, approvalPermissionsAllOf.approvalId) &&
        Objects.equals(this.items, approvalPermissionsAllOf.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalId, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalPermissionsAllOf {\n");
    sb.append("    approvalId: ").append(toIndentedString(approvalId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

