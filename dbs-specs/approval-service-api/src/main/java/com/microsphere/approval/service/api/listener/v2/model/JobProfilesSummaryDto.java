/*
 * Approvals service
 * Other services approve or reject approvals, and update approval types, policies, and policy assignments.
 *
 * The version of the OpenAPI document: 2.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.approval.service.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.approval.service.api.listener.v2.model.JobProfileDto;
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
 * This object describes the job profiles in the context of the given user and service agreement.
 */
@ApiModel(description = "This object describes the job profiles in the context of the given user and service agreement.")
@JsonPropertyOrder({
  JobProfilesSummaryDto.JSON_PROPERTY_USER_ID,
  JobProfilesSummaryDto.JSON_PROPERTY_JOB_PROFILES,
  JobProfilesSummaryDto.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:49.266495+01:00[Africa/Tunis]")
public  class JobProfilesSummaryDto {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public static final String JSON_PROPERTY_JOB_PROFILES = "jobProfiles";
  private List<JobProfileDto> jobProfiles = new ArrayList<>();

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public JobProfilesSummaryDto userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * A simple definition for an internal identifier. Can be UUID but doesn&#39;t have to.
   * @return userId
  **/
  @NotNull
 @Size(min=1,max=36)  @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public JobProfilesSummaryDto jobProfiles(List<JobProfileDto> jobProfiles) {
    
    this.jobProfiles = jobProfiles;
    return this;
  }

  public JobProfilesSummaryDto addJobProfilesItem(JobProfileDto jobProfilesItem) {
    this.jobProfiles.add(jobProfilesItem);
    return this;
  }

   /**
   * the list of applicable job profiles for this user and service agreement.
   * @return jobProfiles
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "the list of applicable job profiles for this user and service agreement.")
  @JsonProperty(JSON_PROPERTY_JOB_PROFILES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<JobProfileDto> getJobProfiles() {
    return jobProfiles;
  }


  public void setJobProfiles(List<JobProfileDto> jobProfiles) {
    this.jobProfiles = jobProfiles;
  }


  public JobProfilesSummaryDto additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public JobProfilesSummaryDto putAdditionsItem(String key, String additionsItem) {
    if (this.additions == null) {
      this.additions = new HashMap<>();
    }
    this.additions.put(key, additionsItem);
    return this;
  }

   /**
   * Additional properties
   * @return additions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional properties")
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
    JobProfilesSummaryDto jobProfilesSummaryDto = (JobProfilesSummaryDto) o;
    return Objects.equals(this.userId, jobProfilesSummaryDto.userId) &&
        Objects.equals(this.jobProfiles, jobProfilesSummaryDto.jobProfiles) &&
        Objects.equals(this.additions, jobProfilesSummaryDto.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, jobProfiles, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobProfilesSummaryDto {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    jobProfiles: ").append(toIndentedString(jobProfiles)).append("\n");
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

