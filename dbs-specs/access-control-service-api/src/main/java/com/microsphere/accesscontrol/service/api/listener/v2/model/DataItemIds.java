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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * DataItemIds
 */
@JsonPropertyOrder({
  DataItemIds.JSON_PROPERTY_ITEM_ID,
  DataItemIds.JSON_PROPERTY_ITEM_TYPE
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class DataItemIds {
  public static final String JSON_PROPERTY_ITEM_ID = "itemId";
  private String itemId;

  public static final String JSON_PROPERTY_ITEM_TYPE = "itemType";
  private String itemType;


  public DataItemIds itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Data item id
   * @return itemId
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Data item id")
  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public DataItemIds itemType(String itemType) {
    
    this.itemType = itemType;
    return this;
  }

   /**
   * Data item type
   * @return itemType
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Data item type")
  @JsonProperty(JSON_PROPERTY_ITEM_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getItemType() {
    return itemType;
  }


  public void setItemType(String itemType) {
    this.itemType = itemType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataItemIds dataItemIds = (DataItemIds) o;
    return Objects.equals(this.itemId, dataItemIds.itemId) &&
        Objects.equals(this.itemType, dataItemIds.itemType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, itemType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataItemIds {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
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

