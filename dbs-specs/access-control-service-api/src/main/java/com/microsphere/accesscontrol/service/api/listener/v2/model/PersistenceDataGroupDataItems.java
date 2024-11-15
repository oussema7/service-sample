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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * An object which contain data group id and data item ids.
 */
@ApiModel(description = "An object which contain data group id and data item ids.")
@JsonPropertyOrder({
  PersistenceDataGroupDataItems.JSON_PROPERTY_ID,
  PersistenceDataGroupDataItems.JSON_PROPERTY_ITEMS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PersistenceDataGroupDataItems {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<String> items = null;


  public PersistenceDataGroupDataItems id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Data group id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data group id")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PersistenceDataGroupDataItems items(List<String> items) {
    
    this.items = items;
    return this;
  }

  public PersistenceDataGroupDataItems addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of data item ids
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of data item ids")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getItems() {
    return items;
  }


  public void setItems(List<String> items) {
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
    PersistenceDataGroupDataItems persistenceDataGroupDataItems = (PersistenceDataGroupDataItems) o;
    return Objects.equals(this.id, persistenceDataGroupDataItems.id) &&
        Objects.equals(this.items, persistenceDataGroupDataItems.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistenceDataGroupDataItems {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

