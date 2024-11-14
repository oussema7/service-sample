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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * DataGroupItemAllOf
 */
@JsonPropertyOrder({
  DataGroupItemAllOf.JSON_PROPERTY_ID,
  DataGroupItemAllOf.JSON_PROPERTY_NAME,
  DataGroupItemAllOf.JSON_PROPERTY_DESCRIPTION,
  DataGroupItemAllOf.JSON_PROPERTY_SERVICE_AGREEMENT_ID,
  DataGroupItemAllOf.JSON_PROPERTY_TYPE,
  DataGroupItemAllOf.JSON_PROPERTY_APPROVAL_ID,
  DataGroupItemAllOf.JSON_PROPERTY_ITEMS,
  DataGroupItemAllOf.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class DataGroupItemAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SERVICE_AGREEMENT_ID = "serviceAgreementId";
  private String serviceAgreementId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_APPROVAL_ID = "approvalId";
  private String approvalId;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<String> items = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;


  public DataGroupItemAllOf id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return id
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DataGroupItemAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of data group
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of data group")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DataGroupItemAllOf description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of data group
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of data group")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DataGroupItemAllOf serviceAgreementId(String serviceAgreementId) {
    
    this.serviceAgreementId = serviceAgreementId;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return serviceAgreementId
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_SERVICE_AGREEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceAgreementId() {
    return serviceAgreementId;
  }


  public void setServiceAgreementId(String serviceAgreementId) {
    this.serviceAgreementId = serviceAgreementId;
  }


  public DataGroupItemAllOf type(String type) {
    
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


  public DataGroupItemAllOf approvalId(String approvalId) {
    
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


  public DataGroupItemAllOf items(List<String> items) {
    
    this.items = items;
    return this;
  }

  public DataGroupItemAllOf addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Items that belong to the data group
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Items that belong to the data group")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getItems() {
    return items;
  }


  public void setItems(List<String> items) {
    this.items = items;
  }


  public DataGroupItemAllOf metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public DataGroupItemAllOf putMetadataItem(String key, String metadataItem) {
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
    DataGroupItemAllOf dataGroupItemAllOf = (DataGroupItemAllOf) o;
    return Objects.equals(this.id, dataGroupItemAllOf.id) &&
        Objects.equals(this.name, dataGroupItemAllOf.name) &&
        Objects.equals(this.description, dataGroupItemAllOf.description) &&
        Objects.equals(this.serviceAgreementId, dataGroupItemAllOf.serviceAgreementId) &&
        Objects.equals(this.type, dataGroupItemAllOf.type) &&
        Objects.equals(this.approvalId, dataGroupItemAllOf.approvalId) &&
        Objects.equals(this.items, dataGroupItemAllOf.items) &&
        Objects.equals(this.metadata, dataGroupItemAllOf.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, serviceAgreementId, type, approvalId, items, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataGroupItemAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    approvalId: ").append(toIndentedString(approvalId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

