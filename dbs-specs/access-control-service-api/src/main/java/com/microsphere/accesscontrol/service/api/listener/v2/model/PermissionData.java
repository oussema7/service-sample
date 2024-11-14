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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * Permission data
 */
@ApiModel(description = "Permission data")
@JsonPropertyOrder({
  PermissionData.JSON_PROPERTY_RESOURCE_NAME,
  PermissionData.JSON_PROPERTY_FUNCTION_NAME,
  PermissionData.JSON_PROPERTY_PRIVILEGES
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PermissionData {
  public static final String JSON_PROPERTY_RESOURCE_NAME = "resourceName";
  private String resourceName;

  public static final String JSON_PROPERTY_FUNCTION_NAME = "functionName";
  private String functionName;

  public static final String JSON_PROPERTY_PRIVILEGES = "privileges";
  private List<String> privileges = null;


  public PermissionData resourceName(String resourceName) {
    
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Resource name
   * @return resourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource name")
  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceName() {
    return resourceName;
  }


  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  public PermissionData functionName(String functionName) {
    
    this.functionName = functionName;
    return this;
  }

   /**
   * Business function name
   * @return functionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Business function name")
  @JsonProperty(JSON_PROPERTY_FUNCTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFunctionName() {
    return functionName;
  }


  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }


  public PermissionData privileges(List<String> privileges) {
    
    this.privileges = privileges;
    return this;
  }

  public PermissionData addPrivilegesItem(String privilegesItem) {
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
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIVILEGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPrivileges() {
    return privileges;
  }


  public void setPrivileges(List<String> privileges) {
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
    PermissionData permissionData = (PermissionData) o;
    return Objects.equals(this.resourceName, permissionData.resourceName) &&
        Objects.equals(this.functionName, permissionData.functionName) &&
        Objects.equals(this.privileges, permissionData.privileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceName, functionName, privileges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionData {\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
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

