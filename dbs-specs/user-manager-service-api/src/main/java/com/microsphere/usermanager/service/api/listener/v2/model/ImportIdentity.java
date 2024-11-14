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
 * ImportIdentity
 */
@JsonPropertyOrder({
  ImportIdentity.JSON_PROPERTY_EXTERNAL_ID,
  ImportIdentity.JSON_PROPERTY_LEGAL_ENTITY_INTERNAL_ID,
  ImportIdentity.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:56.279646600+01:00[Africa/Tunis]")
public  class ImportIdentity {
  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_LEGAL_ENTITY_INTERNAL_ID = "legalEntityInternalId";
  private String legalEntityInternalId;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public ImportIdentity externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * external Id (username) of the user.
   * @return externalId
  **/
  @NotNull
 @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1,max=64)  @ApiModelProperty(required = true, value = "external Id (username) of the user.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public ImportIdentity legalEntityInternalId(String legalEntityInternalId) {
    
    this.legalEntityInternalId = legalEntityInternalId;
    return this;
  }

   /**
   * Internal (MicroSphere) ID of the Legal Entity the user will belong to.
   * @return legalEntityInternalId
  **/
  @NotNull
 @Pattern(regexp="^\\S+$") @Size(min=1,max=36)  @ApiModelProperty(required = true, value = "Internal (MicroSphere) ID of the Legal Entity the user will belong to.")
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_INTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLegalEntityInternalId() {
    return legalEntityInternalId;
  }


  public void setLegalEntityInternalId(String legalEntityInternalId) {
    this.legalEntityInternalId = legalEntityInternalId;
  }


  public ImportIdentity additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public ImportIdentity putAdditionsItem(String key, String additionsItem) {
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
    ImportIdentity importIdentity = (ImportIdentity) o;
    return Objects.equals(this.externalId, importIdentity.externalId) &&
        Objects.equals(this.legalEntityInternalId, importIdentity.legalEntityInternalId) &&
        Objects.equals(this.additions, importIdentity.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, legalEntityInternalId, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportIdentity {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    legalEntityInternalId: ").append(toIndentedString(legalEntityInternalId)).append("\n");
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

