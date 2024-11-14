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
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityItemAllOf;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * Legal entity item
 */
@ApiModel(description = "Legal entity item")
@JsonPropertyOrder({
  LegalEntityItem.JSON_PROPERTY_ADDITIONS,
  LegalEntityItem.JSON_PROPERTY_PARENT_ID,
  LegalEntityItem.JSON_PROPERTY_IS_PARENT,
  LegalEntityItem.JSON_PROPERTY_ID,
  LegalEntityItem.JSON_PROPERTY_EXTERNAL_ID,
  LegalEntityItem.JSON_PROPERTY_NAME,
  LegalEntityItem.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class LegalEntityItem {
  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;

  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  private String parentId;

  public static final String JSON_PROPERTY_IS_PARENT = "isParent";
  private Boolean isParent;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LegalEntityType type;


  public LegalEntityItem additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public LegalEntityItem putAdditionsItem(String key, String additionsItem) {
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


  public LegalEntityItem parentId(String parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return parentId
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentId() {
    return parentId;
  }


  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public LegalEntityItem isParent(Boolean isParent) {
    
    this.isParent = isParent;
    return this;
  }

   /**
   * Defines whether the legal entity is parent
   * @return isParent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines whether the legal entity is parent")
  @JsonProperty(JSON_PROPERTY_IS_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsParent() {
    return isParent;
  }


  public void setIsParent(Boolean isParent) {
    this.isParent = isParent;
  }


  public LegalEntityItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return id
  **/
  @NotNull
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LegalEntityItem externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * External Unique Identifier.
   * @return externalId
  **/
  @NotNull
 @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1,max=64)  @ApiModelProperty(required = true, value = "External Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public LegalEntityItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the legal entity
   * @return name
  **/
  @NotNull
 @Size(min=1)  @ApiModelProperty(required = true, value = "Name of the legal entity")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LegalEntityItem type(LegalEntityType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LegalEntityType getType() {
    return type;
  }


  public void setType(LegalEntityType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalEntityItem legalEntityItem = (LegalEntityItem) o;
    return Objects.equals(this.additions, legalEntityItem.additions) &&
        Objects.equals(this.parentId, legalEntityItem.parentId) &&
        Objects.equals(this.isParent, legalEntityItem.isParent) &&
        Objects.equals(this.id, legalEntityItem.id) &&
        Objects.equals(this.externalId, legalEntityItem.externalId) &&
        Objects.equals(this.name, legalEntityItem.name) &&
        Objects.equals(this.type, legalEntityItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, parentId, isParent, id, externalId, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalEntityItem {\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    isParent: ").append(toIndentedString(isParent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
