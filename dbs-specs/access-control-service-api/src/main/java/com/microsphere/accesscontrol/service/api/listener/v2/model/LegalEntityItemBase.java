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
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityItemBaseAllOf;
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
 * LegalEntityItemBase
 */
@JsonPropertyOrder({
  LegalEntityItemBase.JSON_PROPERTY_ADDITIONS,
  LegalEntityItemBase.JSON_PROPERTY_ID,
  LegalEntityItemBase.JSON_PROPERTY_EXTERNAL_ID,
  LegalEntityItemBase.JSON_PROPERTY_NAME,
  LegalEntityItemBase.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class LegalEntityItemBase {
  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LegalEntityType type;


  public LegalEntityItemBase additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public LegalEntityItemBase putAdditionsItem(String key, String additionsItem) {
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


  public LegalEntityItemBase id(String id) {
    
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


  public LegalEntityItemBase externalId(String externalId) {
    
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


  public LegalEntityItemBase name(String name) {
    
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


  public LegalEntityItemBase type(LegalEntityType type) {
    
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
    LegalEntityItemBase legalEntityItemBase = (LegalEntityItemBase) o;
    return Objects.equals(this.additions, legalEntityItemBase.additions) &&
        Objects.equals(this.id, legalEntityItemBase.id) &&
        Objects.equals(this.externalId, legalEntityItemBase.externalId) &&
        Objects.equals(this.name, legalEntityItemBase.name) &&
        Objects.equals(this.type, legalEntityItemBase.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, id, externalId, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalEntityItemBase {\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
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

