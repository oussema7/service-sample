/*
 * Legal Entity Name client API
 * OpenApi Endpoints for managing Legal Entities Ancestors. 
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.onboarding.client.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.onboarding.client.api.listener.v2.model.FunctionGroupItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * UserJobRoles
 */
@JsonPropertyOrder({
  UserJobRoles.JSON_PROPERTY_USERS_ID,
  UserJobRoles.JSON_PROPERTY_USERNAME,
  UserJobRoles.JSON_PROPERTY_FULL_NAME,
  UserJobRoles.JSON_PROPERTY_JOB_ROLES
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:54.559235200+01:00[Africa/Tunis]")
public  class UserJobRoles {
  public static final String JSON_PROPERTY_USERS_ID = "usersId";
  private String usersId;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_JOB_ROLES = "jobRoles";
  private List<FunctionGroupItem> jobRoles = null;


  public UserJobRoles usersId(String usersId) {
    
    this.usersId = usersId;
    return this;
  }

   /**
   * Get usersId
   * @return usersId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USERS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsersId() {
    return usersId;
  }


  public void setUsersId(String usersId) {
    this.usersId = usersId;
  }


  public UserJobRoles username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public UserJobRoles fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public UserJobRoles jobRoles(List<FunctionGroupItem> jobRoles) {
    
    this.jobRoles = jobRoles;
    return this;
  }

  public UserJobRoles addJobRolesItem(FunctionGroupItem jobRolesItem) {
    if (this.jobRoles == null) {
      this.jobRoles = new ArrayList<>();
    }
    this.jobRoles.add(jobRolesItem);
    return this;
  }

   /**
   * list of job roles (function group) assigned to the user
   * @return jobRoles
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "list of job roles (function group) assigned to the user")
  @JsonProperty(JSON_PROPERTY_JOB_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FunctionGroupItem> getJobRoles() {
    return jobRoles;
  }


  public void setJobRoles(List<FunctionGroupItem> jobRoles) {
    this.jobRoles = jobRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserJobRoles userJobRoles = (UserJobRoles) o;
    return Objects.equals(this.usersId, userJobRoles.usersId) &&
        Objects.equals(this.username, userJobRoles.username) &&
        Objects.equals(this.fullName, userJobRoles.fullName) &&
        Objects.equals(this.jobRoles, userJobRoles.jobRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usersId, username, fullName, jobRoles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserJobRoles {\n");
    sb.append("    usersId: ").append(toIndentedString(usersId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    jobRoles: ").append(toIndentedString(jobRoles)).append("\n");
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

