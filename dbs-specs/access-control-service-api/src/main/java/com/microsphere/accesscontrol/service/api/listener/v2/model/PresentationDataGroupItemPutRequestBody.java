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
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationAction;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationDataGroupIdentifier;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationItemIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * Data group items by identifier update put
 */
@ApiModel(description = "Data group items by identifier update put")
@JsonPropertyOrder({
  PresentationDataGroupItemPutRequestBody.JSON_PROPERTY_DATA_GROUP_IDENTIFIER,
  PresentationDataGroupItemPutRequestBody.JSON_PROPERTY_ACTION,
  PresentationDataGroupItemPutRequestBody.JSON_PROPERTY_TYPE,
  PresentationDataGroupItemPutRequestBody.JSON_PROPERTY_DATA_ITEMS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PresentationDataGroupItemPutRequestBody {
  public static final String JSON_PROPERTY_DATA_GROUP_IDENTIFIER = "dataGroupIdentifier";
  private PresentationDataGroupIdentifier dataGroupIdentifier;

  public static final String JSON_PROPERTY_ACTION = "action";
  private PresentationAction action;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_DATA_ITEMS = "dataItems";
  private List<PresentationItemIdentifier> dataItems = null;


  public PresentationDataGroupItemPutRequestBody dataGroupIdentifier(PresentationDataGroupIdentifier dataGroupIdentifier) {
    
    this.dataGroupIdentifier = dataGroupIdentifier;
    return this;
  }

   /**
   * Get dataGroupIdentifier
   * @return dataGroupIdentifier
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA_GROUP_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PresentationDataGroupIdentifier getDataGroupIdentifier() {
    return dataGroupIdentifier;
  }


  public void setDataGroupIdentifier(PresentationDataGroupIdentifier dataGroupIdentifier) {
    this.dataGroupIdentifier = dataGroupIdentifier;
  }


  public PresentationDataGroupItemPutRequestBody action(PresentationAction action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PresentationAction getAction() {
    return action;
  }


  public void setAction(PresentationAction action) {
    this.action = action;
  }


  public PresentationDataGroupItemPutRequestBody type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Data group type
   * @return type
  **/
  @NotNull
 @Pattern(regexp="^\\S+$") @Size(min=1,max=36)  @ApiModelProperty(required = true, value = "Data group type")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PresentationDataGroupItemPutRequestBody dataItems(List<PresentationItemIdentifier> dataItems) {
    
    this.dataItems = dataItems;
    return this;
  }

  public PresentationDataGroupItemPutRequestBody addDataItemsItem(PresentationItemIdentifier dataItemsItem) {
    if (this.dataItems == null) {
      this.dataItems = new ArrayList<>();
    }
    this.dataItems.add(dataItemsItem);
    return this;
  }

   /**
   * Get dataItems
   * @return dataItems
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PresentationItemIdentifier> getDataItems() {
    return dataItems;
  }


  public void setDataItems(List<PresentationItemIdentifier> dataItems) {
    this.dataItems = dataItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresentationDataGroupItemPutRequestBody presentationDataGroupItemPutRequestBody = (PresentationDataGroupItemPutRequestBody) o;
    return Objects.equals(this.dataGroupIdentifier, presentationDataGroupItemPutRequestBody.dataGroupIdentifier) &&
        Objects.equals(this.action, presentationDataGroupItemPutRequestBody.action) &&
        Objects.equals(this.type, presentationDataGroupItemPutRequestBody.type) &&
        Objects.equals(this.dataItems, presentationDataGroupItemPutRequestBody.dataItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataGroupIdentifier, action, type, dataItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationDataGroupItemPutRequestBody {\n");
    sb.append("    dataGroupIdentifier: ").append(toIndentedString(dataGroupIdentifier)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dataItems: ").append(toIndentedString(dataItems)).append("\n");
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

