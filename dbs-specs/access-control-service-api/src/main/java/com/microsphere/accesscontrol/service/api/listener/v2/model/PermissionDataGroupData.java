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
 * Permissions data group
 */
@ApiModel(description = "Permissions data group")
@JsonPropertyOrder({
  PermissionDataGroupData.JSON_PROPERTY_DATA_GROUP_TYPE,
  PermissionDataGroupData.JSON_PROPERTY_DATA_GROUP_IDS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PermissionDataGroupData {
  public static final String JSON_PROPERTY_DATA_GROUP_TYPE = "dataGroupType";
  private String dataGroupType;

  public static final String JSON_PROPERTY_DATA_GROUP_IDS = "dataGroupIds";
  private List<String> dataGroupIds = null;


  public PermissionDataGroupData dataGroupType(String dataGroupType) {
    
    this.dataGroupType = dataGroupType;
    return this;
  }

   /**
   * Data group type
   * @return dataGroupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data group type")
  @JsonProperty(JSON_PROPERTY_DATA_GROUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataGroupType() {
    return dataGroupType;
  }


  public void setDataGroupType(String dataGroupType) {
    this.dataGroupType = dataGroupType;
  }


  public PermissionDataGroupData dataGroupIds(List<String> dataGroupIds) {
    
    this.dataGroupIds = dataGroupIds;
    return this;
  }

  public PermissionDataGroupData addDataGroupIdsItem(String dataGroupIdsItem) {
    if (this.dataGroupIds == null) {
      this.dataGroupIds = new ArrayList<>();
    }
    this.dataGroupIds.add(dataGroupIdsItem);
    return this;
  }

   /**
   * Get dataGroupIds
   * @return dataGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDataGroupIds() {
    return dataGroupIds;
  }


  public void setDataGroupIds(List<String> dataGroupIds) {
    this.dataGroupIds = dataGroupIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionDataGroupData permissionDataGroupData = (PermissionDataGroupData) o;
    return Objects.equals(this.dataGroupType, permissionDataGroupData.dataGroupType) &&
        Objects.equals(this.dataGroupIds, permissionDataGroupData.dataGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataGroupType, dataGroupIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionDataGroupData {\n");
    sb.append("    dataGroupType: ").append(toIndentedString(dataGroupType)).append("\n");
    sb.append("    dataGroupIds: ").append(toIndentedString(dataGroupIds)).append("\n");
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

