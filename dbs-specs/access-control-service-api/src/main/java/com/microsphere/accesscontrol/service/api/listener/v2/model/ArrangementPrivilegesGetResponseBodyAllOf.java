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
import com.microsphere.accesscontrol.service.api.listener.v2.model.Privilege;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ArrangementPrivilegesGetResponseBodyAllOf
 */
@JsonPropertyOrder({
  ArrangementPrivilegesGetResponseBodyAllOf.JSON_PROPERTY_ARRANGEMENT_ID,
  ArrangementPrivilegesGetResponseBodyAllOf.JSON_PROPERTY_PRIVILEGES
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class ArrangementPrivilegesGetResponseBodyAllOf {
  public static final String JSON_PROPERTY_ARRANGEMENT_ID = "arrangementId";
  private String arrangementId;

  public static final String JSON_PROPERTY_PRIVILEGES = "privileges";
  private List<Privilege> privileges = null;


  public ArrangementPrivilegesGetResponseBodyAllOf arrangementId(String arrangementId) {
    
    this.arrangementId = arrangementId;
    return this;
  }

   /**
   * Get arrangementId
   * @return arrangementId
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=36)  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ARRANGEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getArrangementId() {
    return arrangementId;
  }


  public void setArrangementId(String arrangementId) {
    this.arrangementId = arrangementId;
  }


  public ArrangementPrivilegesGetResponseBodyAllOf privileges(List<Privilege> privileges) {
    
    this.privileges = privileges;
    return this;
  }

  public ArrangementPrivilegesGetResponseBodyAllOf addPrivilegesItem(Privilege privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<>();
    }
    this.privileges.add(privilegesItem);
    return this;
  }

   /**
   * Get privileges
   * @return privileges
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIVILEGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Privilege> getPrivileges() {
    return privileges;
  }


  public void setPrivileges(List<Privilege> privileges) {
    this.privileges = privileges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrangementPrivilegesGetResponseBodyAllOf arrangementPrivilegesGetResponseBodyAllOf = (ArrangementPrivilegesGetResponseBodyAllOf) o;
    return Objects.equals(this.arrangementId, arrangementPrivilegesGetResponseBodyAllOf.arrangementId) &&
        Objects.equals(this.privileges, arrangementPrivilegesGetResponseBodyAllOf.privileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrangementId, privileges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrangementPrivilegesGetResponseBodyAllOf {\n");
    sb.append("    arrangementId: ").append(toIndentedString(arrangementId)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
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

