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
import com.microsphere.accesscontrol.service.api.listener.v2.model.AdditionalPropertiesAware;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationDataGroupIdentifier;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationDataGroupUpdateAllOf;
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
 * PresentationDataGroupUpdate
 */
@JsonPropertyOrder({
  PresentationDataGroupUpdate.JSON_PROPERTY_ADDITIONS,
  PresentationDataGroupUpdate.JSON_PROPERTY_NAME,
  PresentationDataGroupUpdate.JSON_PROPERTY_DESCRIPTION,
  PresentationDataGroupUpdate.JSON_PROPERTY_TYPE,
  PresentationDataGroupUpdate.JSON_PROPERTY_DATA_GROUP_IDENTIFIER,
  PresentationDataGroupUpdate.JSON_PROPERTY_DATA_ITEMS,
  PresentationDataGroupUpdate.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PresentationDataGroupUpdate {
  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;

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


  public PresentationDataGroupUpdate additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public PresentationDataGroupUpdate putAdditionsItem(String key, String additionsItem) {
    if (this.additions == null) {
      this.additions = new HashMap<>();
    }
    this.additions.put(key, additionsItem);
    return this;
  }

   /**
   * Get additions
   * @return additions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAdditions() {
    return additions;
  }


  public void setAdditions(Map<String, String> additions) {
    this.additions = additions;
  }


  public PresentationDataGroupUpdate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
 @Size(min=1,max=128)  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PresentationDataGroupUpdate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @NotNull
 @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1,max=255)  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PresentationDataGroupUpdate type(String type) {
    
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


  public PresentationDataGroupUpdate dataGroupIdentifier(PresentationDataGroupIdentifier dataGroupIdentifier) {
    
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


  public PresentationDataGroupUpdate dataItems(List<PresentationItemIdentifier> dataItems) {
    
    this.dataItems = dataItems;
    return this;
  }

  public PresentationDataGroupUpdate addDataItemsItem(PresentationItemIdentifier dataItemsItem) {
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


  public PresentationDataGroupUpdate metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public PresentationDataGroupUpdate putMetadataItem(String key, String metadataItem) {
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
    PresentationDataGroupUpdate presentationDataGroupUpdate = (PresentationDataGroupUpdate) o;
    return Objects.equals(this.additions, presentationDataGroupUpdate.additions) &&
        Objects.equals(this.name, presentationDataGroupUpdate.name) &&
        Objects.equals(this.description, presentationDataGroupUpdate.description) &&
        Objects.equals(this.type, presentationDataGroupUpdate.type) &&
        Objects.equals(this.dataGroupIdentifier, presentationDataGroupUpdate.dataGroupIdentifier) &&
        Objects.equals(this.dataItems, presentationDataGroupUpdate.dataItems) &&
        Objects.equals(this.metadata, presentationDataGroupUpdate.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, name, description, type, dataGroupIdentifier, dataItems, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationDataGroupUpdate {\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
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

