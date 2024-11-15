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
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationDataGroupIdentifier;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationItemIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * Data group update put
 */
@ApiModel(description = "Data group update put")
@JsonPropertyOrder({
  PresentationDataGroupUpdateAllOf.JSON_PROPERTY_NAME,
  PresentationDataGroupUpdateAllOf.JSON_PROPERTY_DESCRIPTION,
  PresentationDataGroupUpdateAllOf.JSON_PROPERTY_TYPE,
  PresentationDataGroupUpdateAllOf.JSON_PROPERTY_DATA_GROUP_IDENTIFIER,
  PresentationDataGroupUpdateAllOf.JSON_PROPERTY_DATA_ITEMS,
  PresentationDataGroupUpdateAllOf.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PresentationDataGroupUpdateAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_DATA_GROUP_IDENTIFIER = "dataGroupIdentifier";
  private PresentationDataGroupIdentifier dataGroupIdentifier;

  public static final String JSON_PROPERTY_DATA_ITEMS = "dataItems";
  private List<PresentationItemIdentifier> dataItems = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;


  public PresentationDataGroupUpdateAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=128)  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PresentationDataGroupUpdateAllOf description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1,max=255)  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PresentationDataGroupUpdateAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Data group type
   * @return type
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^\\S+$") @Size(min=1,max=36)  @ApiModelProperty(value = "Data group type")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PresentationDataGroupUpdateAllOf dataGroupIdentifier(PresentationDataGroupIdentifier dataGroupIdentifier) {
    
    this.dataGroupIdentifier = dataGroupIdentifier;
    return this;
  }

   /**
   * Get dataGroupIdentifier
   * @return dataGroupIdentifier
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_GROUP_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PresentationDataGroupIdentifier getDataGroupIdentifier() {
    return dataGroupIdentifier;
  }


  public void setDataGroupIdentifier(PresentationDataGroupIdentifier dataGroupIdentifier) {
    this.dataGroupIdentifier = dataGroupIdentifier;
  }


  public PresentationDataGroupUpdateAllOf dataItems(List<PresentationItemIdentifier> dataItems) {
    
    this.dataItems = dataItems;
    return this;
  }

  public PresentationDataGroupUpdateAllOf addDataItemsItem(PresentationItemIdentifier dataItemsItem) {
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


  public PresentationDataGroupUpdateAllOf metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public PresentationDataGroupUpdateAllOf putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata for specific entities. Do not use it for custom extensions. Use additions instead.
   * @return metadata
  **/
  @javax.annotation.Nullable
 @Size(min=0,max=10)  @ApiModelProperty(value = "Metadata for specific entities. Do not use it for custom extensions. Use additions instead.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresentationDataGroupUpdateAllOf presentationDataGroupUpdateAllOf = (PresentationDataGroupUpdateAllOf) o;
    return Objects.equals(this.name, presentationDataGroupUpdateAllOf.name) &&
        Objects.equals(this.description, presentationDataGroupUpdateAllOf.description) &&
        Objects.equals(this.type, presentationDataGroupUpdateAllOf.type) &&
        Objects.equals(this.dataGroupIdentifier, presentationDataGroupUpdateAllOf.dataGroupIdentifier) &&
        Objects.equals(this.dataItems, presentationDataGroupUpdateAllOf.dataItems) &&
        Objects.equals(this.metadata, presentationDataGroupUpdateAllOf.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, dataGroupIdentifier, dataItems, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationDataGroupUpdateAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dataGroupIdentifier: ").append(toIndentedString(dataGroupIdentifier)).append("\n");
    sb.append("    dataItems: ").append(toIndentedString(dataItems)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

