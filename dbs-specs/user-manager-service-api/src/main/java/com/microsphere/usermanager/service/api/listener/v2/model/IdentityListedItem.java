/*
 * User Manager service
 * Create, retrieve, and manage users and their relationships with internal (DBS services) and external (CRM systems) resources. 
 *
 * The version of the OpenAPI document: 2.6.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.usermanager.service.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * IdentityListedItem
 */
@JsonPropertyOrder({
  IdentityListedItem.JSON_PROPERTY_ID,
  IdentityListedItem.JSON_PROPERTY_EXTERNAL_ID,
  IdentityListedItem.JSON_PROPERTY_LEGAL_ENTITY_ID,
  IdentityListedItem.JSON_PROPERTY_FULL_NAME,
  IdentityListedItem.JSON_PROPERTY_LEGAL_ENTITY_NAME,
  IdentityListedItem.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:56.279646600+01:00[Africa/Tunis]")
public  class IdentityListedItem {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_LEGAL_ENTITY_ID = "legalEntityId";
  private String legalEntityId;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_LEGAL_ENTITY_NAME = "legalEntityName";
  private String legalEntityName;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public IdentityListedItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @NotNull
 @Size(min=1,max=36)  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IdentityListedItem externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @NotNull
 @Size(min=1,max=64)  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public IdentityListedItem legalEntityId(String legalEntityId) {
    
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * Get legalEntityId
   * @return legalEntityId
  **/
  @NotNull
 @Size(min=1,max=36)  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLegalEntityId() {
    return legalEntityId;
  }


  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }


  public IdentityListedItem fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @NotNull
 @Size(min=1,max=255)  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public IdentityListedItem legalEntityName(String legalEntityName) {
    
    this.legalEntityName = legalEntityName;
    return this;
  }

   /**
   * Get legalEntityName
   * @return legalEntityName
  **/
  @NotNull
 @Size(min=1,max=128)  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLegalEntityName() {
    return legalEntityName;
  }


  public void setLegalEntityName(String legalEntityName) {
    this.legalEntityName = legalEntityName;
  }


  public IdentityListedItem additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public IdentityListedItem putAdditionsItem(String key, String additionsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityListedItem identityListedItem = (IdentityListedItem) o;
    return Objects.equals(this.id, identityListedItem.id) &&
        Objects.equals(this.externalId, identityListedItem.externalId) &&
        Objects.equals(this.legalEntityId, identityListedItem.legalEntityId) &&
        Objects.equals(this.fullName, identityListedItem.fullName) &&
        Objects.equals(this.legalEntityName, identityListedItem.legalEntityName) &&
        Objects.equals(this.additions, identityListedItem.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalId, legalEntityId, fullName, legalEntityName, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityListedItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    legalEntityName: ").append(toIndentedString(legalEntityName)).append("\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
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

