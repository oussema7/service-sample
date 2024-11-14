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
import com.microsphere.accesscontrol.service.api.listener.v2.model.FunctiongroupupdateAllOf;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationPermissionFunctionGroupUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * Functiongroupupdate
 */
@JsonPropertyOrder({
  Functiongroupupdate.JSON_PROPERTY_ADDITIONS,
  Functiongroupupdate.JSON_PROPERTY_NAME,
  Functiongroupupdate.JSON_PROPERTY_DESCRIPTION,
  Functiongroupupdate.JSON_PROPERTY_PERMISSIONS,
  Functiongroupupdate.JSON_PROPERTY_VALID_FROM_DATE,
  Functiongroupupdate.JSON_PROPERTY_VALID_FROM_TIME,
  Functiongroupupdate.JSON_PROPERTY_VALID_UNTIL_DATE,
  Functiongroupupdate.JSON_PROPERTY_VALID_UNTIL_TIME,
  Functiongroupupdate.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class Functiongroupupdate {
  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private List<PresentationPermissionFunctionGroupUpdate> permissions = null;

  public static final String JSON_PROPERTY_VALID_FROM_DATE = "validFromDate";
  private String validFromDate;

  public static final String JSON_PROPERTY_VALID_FROM_TIME = "validFromTime";
  private String validFromTime;

  public static final String JSON_PROPERTY_VALID_UNTIL_DATE = "validUntilDate";
  private String validUntilDate;

  public static final String JSON_PROPERTY_VALID_UNTIL_TIME = "validUntilTime";
  private String validUntilTime;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;


  public Functiongroupupdate additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public Functiongroupupdate putAdditionsItem(String key, String additionsItem) {
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


  public Functiongroupupdate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Function group name
   * @return name
  **/
  @NotNull
 @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1,max=128)  @ApiModelProperty(required = true, value = "Function group name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Functiongroupupdate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Function group description
   * @return description
  **/
  @NotNull
 @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1,max=255)  @ApiModelProperty(required = true, value = "Function group description")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Functiongroupupdate permissions(List<PresentationPermissionFunctionGroupUpdate> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public Functiongroupupdate addPermissionsItem(PresentationPermissionFunctionGroupUpdate permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PresentationPermissionFunctionGroupUpdate> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<PresentationPermissionFunctionGroupUpdate> permissions) {
    this.permissions = permissions;
  }


  public Functiongroupupdate validFromDate(String validFromDate) {
    
    this.validFromDate = validFromDate;
    return this;
  }

   /**
   * Start date of the function group.
   * @return validFromDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start date of the function group.")
  @JsonProperty(JSON_PROPERTY_VALID_FROM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidFromDate() {
    return validFromDate;
  }


  public void setValidFromDate(String validFromDate) {
    this.validFromDate = validFromDate;
  }


  public Functiongroupupdate validFromTime(String validFromTime) {
    
    this.validFromTime = validFromTime;
    return this;
  }

   /**
   * Start time of the function group.
   * @return validFromTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start time of the function group.")
  @JsonProperty(JSON_PROPERTY_VALID_FROM_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidFromTime() {
    return validFromTime;
  }


  public void setValidFromTime(String validFromTime) {
    this.validFromTime = validFromTime;
  }


  public Functiongroupupdate validUntilDate(String validUntilDate) {
    
    this.validUntilDate = validUntilDate;
    return this;
  }

   /**
   * End date of the function group.
   * @return validUntilDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End date of the function group.")
  @JsonProperty(JSON_PROPERTY_VALID_UNTIL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidUntilDate() {
    return validUntilDate;
  }


  public void setValidUntilDate(String validUntilDate) {
    this.validUntilDate = validUntilDate;
  }


  public Functiongroupupdate validUntilTime(String validUntilTime) {
    
    this.validUntilTime = validUntilTime;
    return this;
  }

   /**
   * End time of the function group.
   * @return validUntilTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End time of the function group.")
  @JsonProperty(JSON_PROPERTY_VALID_UNTIL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidUntilTime() {
    return validUntilTime;
  }


  public void setValidUntilTime(String validUntilTime) {
    this.validUntilTime = validUntilTime;
  }


  public Functiongroupupdate metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public Functiongroupupdate putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata for specific entities. Do not use it for custom extensions. Use additions instead.
   * @return metadata
  **/
  @javax.annotation.Nullable
 @Size(min=0,max=10)  @ApiModelProperty(value = "Metadata for specific entities. Do not use it for custom extensions. Use additions instead.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Functiongroupupdate functiongroupupdate = (Functiongroupupdate) o;
    return Objects.equals(this.additions, functiongroupupdate.additions) &&
        Objects.equals(this.name, functiongroupupdate.name) &&
        Objects.equals(this.description, functiongroupupdate.description) &&
        Objects.equals(this.permissions, functiongroupupdate.permissions) &&
        Objects.equals(this.validFromDate, functiongroupupdate.validFromDate) &&
        Objects.equals(this.validFromTime, functiongroupupdate.validFromTime) &&
        Objects.equals(this.validUntilDate, functiongroupupdate.validUntilDate) &&
        Objects.equals(this.validUntilTime, functiongroupupdate.validUntilTime) &&
        Objects.equals(this.metadata, functiongroupupdate.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, name, description, permissions, validFromDate, validFromTime, validUntilDate, validUntilTime, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Functiongroupupdate {\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    validFromDate: ").append(toIndentedString(validFromDate)).append("\n");
    sb.append("    validFromTime: ").append(toIndentedString(validFromTime)).append("\n");
    sb.append("    validUntilDate: ").append(toIndentedString(validUntilDate)).append("\n");
    sb.append("    validUntilTime: ").append(toIndentedString(validUntilTime)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
