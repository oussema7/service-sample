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
 * User context data group permissions request
 */
@ApiModel(description = "User context data group permissions request")
@JsonPropertyOrder({
  PermissionsRequest.JSON_PROPERTY_DATA_GROUP_TYPES,
  PermissionsRequest.JSON_PROPERTY_RESOURCE_NAME,
  PermissionsRequest.JSON_PROPERTY_FUNCTION_NAMES,
  PermissionsRequest.JSON_PROPERTY_PRIVILEGES
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PermissionsRequest {
  public static final String JSON_PROPERTY_DATA_GROUP_TYPES = "dataGroupTypes";
  private List<String> dataGroupTypes = new ArrayList<>();

  public static final String JSON_PROPERTY_RESOURCE_NAME = "resourceName";
  private String resourceName;

  public static final String JSON_PROPERTY_FUNCTION_NAMES = "functionNames";
  private List<String> functionNames = null;

  public static final String JSON_PROPERTY_PRIVILEGES = "privileges";
  private List<String> privileges = null;


  public PermissionsRequest dataGroupTypes(List<String> dataGroupTypes) {
    
    this.dataGroupTypes = dataGroupTypes;
    return this;
  }

  public PermissionsRequest addDataGroupTypesItem(String dataGroupTypesItem) {
    this.dataGroupTypes.add(dataGroupTypesItem);
    return this;
  }

   /**
   * Get dataGroupTypes
   * @return dataGroupTypes
  **/
  @NotNull
 @Size(min=1)  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA_GROUP_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getDataGroupTypes() {
    return dataGroupTypes;
  }


  public void setDataGroupTypes(List<String> dataGroupTypes) {
    this.dataGroupTypes = dataGroupTypes;
  }


  public PermissionsRequest resourceName(String resourceName) {
    
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


  public PermissionsRequest functionNames(List<String> functionNames) {
    
    this.functionNames = functionNames;
    return this;
  }

  public PermissionsRequest addFunctionNamesItem(String functionNamesItem) {
    if (this.functionNames == null) {
      this.functionNames = new ArrayList<>();
    }
    this.functionNames.add(functionNamesItem);
    return this;
  }

   /**
   * Get functionNames
   * @return functionNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FUNCTION_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFunctionNames() {
    return functionNames;
  }


  public void setFunctionNames(List<String> functionNames) {
    this.functionNames = functionNames;
  }


  public PermissionsRequest privileges(List<String> privileges) {
    
    this.privileges = privileges;
    return this;
  }

  public PermissionsRequest addPrivilegesItem(String privilegesItem) {
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
    PermissionsRequest permissionsRequest = (PermissionsRequest) o;
    return Objects.equals(this.dataGroupTypes, permissionsRequest.dataGroupTypes) &&
        Objects.equals(this.resourceName, permissionsRequest.resourceName) &&
        Objects.equals(this.functionNames, permissionsRequest.functionNames) &&
        Objects.equals(this.privileges, permissionsRequest.privileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataGroupTypes, resourceName, functionNames, privileges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionsRequest {\n");
    sb.append("    dataGroupTypes: ").append(toIndentedString(dataGroupTypes)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    functionNames: ").append(toIndentedString(functionNames)).append("\n");
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

