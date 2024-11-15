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
import com.microsphere.accesscontrol.service.api.listener.v2.model.DataGroupData;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PermissionDataGroup;
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
  PermissionsDataGroup.JSON_PROPERTY_PERMISSIONS_DATA,
  PermissionsDataGroup.JSON_PROPERTY_DATA_GROUPS_DATA
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PermissionsDataGroup {
  public static final String JSON_PROPERTY_PERMISSIONS_DATA = "permissionsData";
  private List<PermissionDataGroup> permissionsData = null;

  public static final String JSON_PROPERTY_DATA_GROUPS_DATA = "dataGroupsData";
  private List<DataGroupData> dataGroupsData = null;


  public PermissionsDataGroup permissionsData(List<PermissionDataGroup> permissionsData) {
    
    this.permissionsData = permissionsData;
    return this;
  }

  public PermissionsDataGroup addPermissionsDataItem(PermissionDataGroup permissionsDataItem) {
    if (this.permissionsData == null) {
      this.permissionsData = new ArrayList<>();
    }
    this.permissionsData.add(permissionsDataItem);
    return this;
  }

   /**
   * Get permissionsData
   * @return permissionsData
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERMISSIONS_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PermissionDataGroup> getPermissionsData() {
    return permissionsData;
  }


  public void setPermissionsData(List<PermissionDataGroup> permissionsData) {
    this.permissionsData = permissionsData;
  }


  public PermissionsDataGroup dataGroupsData(List<DataGroupData> dataGroupsData) {
    
    this.dataGroupsData = dataGroupsData;
    return this;
  }

  public PermissionsDataGroup addDataGroupsDataItem(DataGroupData dataGroupsDataItem) {
    if (this.dataGroupsData == null) {
      this.dataGroupsData = new ArrayList<>();
    }
    this.dataGroupsData.add(dataGroupsDataItem);
    return this;
  }

   /**
   * Get dataGroupsData
   * @return dataGroupsData
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_GROUPS_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DataGroupData> getDataGroupsData() {
    return dataGroupsData;
  }


  public void setDataGroupsData(List<DataGroupData> dataGroupsData) {
    this.dataGroupsData = dataGroupsData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionsDataGroup permissionsDataGroup = (PermissionsDataGroup) o;
    return Objects.equals(this.permissionsData, permissionsDataGroup.permissionsData) &&
        Objects.equals(this.dataGroupsData, permissionsDataGroup.dataGroupsData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionsData, dataGroupsData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionsDataGroup {\n");
    sb.append("    permissionsData: ").append(toIndentedString(permissionsData)).append("\n");
    sb.append("    dataGroupsData: ").append(toIndentedString(dataGroupsData)).append("\n");
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

