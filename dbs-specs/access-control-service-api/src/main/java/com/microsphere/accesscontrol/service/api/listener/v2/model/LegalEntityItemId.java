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
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityItemIdAllOf;
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
 * Object that defines an id attribute only.
 */
@ApiModel(description = "Object that defines an id attribute only.")
@JsonPropertyOrder({
  LegalEntityItemId.JSON_PROPERTY_ADDITIONS,
  LegalEntityItemId.JSON_PROPERTY_ID
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class LegalEntityItemId {
  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;


  public LegalEntityItemId additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public LegalEntityItemId putAdditionsItem(String key, String additionsItem) {
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


  public LegalEntityItemId id(String id) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalEntityItemId legalEntityItemId = (LegalEntityItemId) o;
    return Objects.equals(this.additions, legalEntityItemId.additions) &&
        Objects.equals(this.id, legalEntityItemId.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalEntityItemId {\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

