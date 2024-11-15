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
 * Response with success counter.
 */
@ApiModel(description = "Response with success counter.")
@JsonPropertyOrder({
  PostApprovalTypeAssignmentBulkResponse.JSON_PROPERTY_SUCCESS_COUNT,
  PostApprovalTypeAssignmentBulkResponse.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:49.266495+01:00[Africa/Tunis]")
public  class PostApprovalTypeAssignmentBulkResponse {
  public static final String JSON_PROPERTY_SUCCESS_COUNT = "successCount";
  private Integer successCount;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public PostApprovalTypeAssignmentBulkResponse successCount(Integer successCount) {
    
    this.successCount = successCount;
    return this;
  }

   /**
   * Number of items processed successfully.
   * minimum: 0
   * @return successCount
  **/
  @NotNull
 @Min(0)  @ApiModelProperty(required = true, value = "Number of items processed successfully.")
  @JsonProperty(JSON_PROPERTY_SUCCESS_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSuccessCount() {
    return successCount;
  }


  public void setSuccessCount(Integer successCount) {
    this.successCount = successCount;
  }


  public PostApprovalTypeAssignmentBulkResponse additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public PostApprovalTypeAssignmentBulkResponse putAdditionsItem(String key, String additionsItem) {
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
    PostApprovalTypeAssignmentBulkResponse postApprovalTypeAssignmentBulkResponse = (PostApprovalTypeAssignmentBulkResponse) o;
    return Objects.equals(this.successCount, postApprovalTypeAssignmentBulkResponse.successCount) &&
        Objects.equals(this.additions, postApprovalTypeAssignmentBulkResponse.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successCount, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostApprovalTypeAssignmentBulkResponse {\n");
    sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
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

