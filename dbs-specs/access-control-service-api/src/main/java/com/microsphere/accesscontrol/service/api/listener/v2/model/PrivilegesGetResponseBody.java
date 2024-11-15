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
import com.microsphere.accesscontrol.service.api.listener.v2.model.PrivilegesGetResponseBodyAllOf;
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
 * PrivilegesGetResponseBody
 */
@JsonPropertyOrder({
  PrivilegesGetResponseBody.JSON_PROPERTY_ADDITIONS,
  PrivilegesGetResponseBody.JSON_PROPERTY_PRIVILEGE
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PrivilegesGetResponseBody {
  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;

  public static final String JSON_PROPERTY_PRIVILEGE = "privilege";
  private String privilege;


  public PrivilegesGetResponseBody additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public PrivilegesGetResponseBody putAdditionsItem(String key, String additionsItem) {
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


  public PrivilegesGetResponseBody privilege(String privilege) {
    
    this.privilege = privilege;
    return this;
  }

   /**
   * Get privilege
   * @return privilege
  **/
  @NotNull
 @Size(min=1,max=16)  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRIVILEGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrivilege() {
    return privilege;
  }


  public void setPrivilege(String privilege) {
    this.privilege = privilege;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivilegesGetResponseBody privilegesGetResponseBody = (PrivilegesGetResponseBody) o;
    return Objects.equals(this.additions, privilegesGetResponseBody.additions) &&
        Objects.equals(this.privilege, privilegesGetResponseBody.privilege);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, privilege);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivilegesGetResponseBody {\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
    sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
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

