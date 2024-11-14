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
import com.microsphere.approval.service.api.listener.v2.model.ApprovalTypeDto;
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
 * The approval type that was created
 */
@ApiModel(description = "The approval type that was created")
@JsonPropertyOrder({
  PostApprovalTypeResponse.JSON_PROPERTY_APPROVAL_TYPE,
  PostApprovalTypeResponse.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:49.266495+01:00[Africa/Tunis]")
public  class PostApprovalTypeResponse {
  public static final String JSON_PROPERTY_APPROVAL_TYPE = "approvalType";
  private ApprovalTypeDto approvalType;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public PostApprovalTypeResponse approvalType(ApprovalTypeDto approvalType) {
    
    this.approvalType = approvalType;
    return this;
  }

   /**
   * Get approvalType
   * @return approvalType
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_APPROVAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ApprovalTypeDto getApprovalType() {
    return approvalType;
  }


  public void setApprovalType(ApprovalTypeDto approvalType) {
    this.approvalType = approvalType;
  }


  public PostApprovalTypeResponse additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public PostApprovalTypeResponse putAdditionsItem(String key, String additionsItem) {
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
    PostApprovalTypeResponse postApprovalTypeResponse = (PostApprovalTypeResponse) o;
    return Objects.equals(this.approvalType, postApprovalTypeResponse.approvalType) &&
        Objects.equals(this.additions, postApprovalTypeResponse.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalType, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostApprovalTypeResponse {\n");
    sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
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
