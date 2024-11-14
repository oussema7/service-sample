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
import com.microsphere.approval.service.api.listener.v2.model.PresentationApprovalTypeAssignmentDto;
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
 * Assign an approval type to a job profile in bulk.
 */
@ApiModel(description = "Assign an approval type to a job profile in bulk.")
@JsonPropertyOrder({
  PostApprovalTypeAssignmentBulkRequest.JSON_PROPERTY_APPROVAL_TYPE_ASSIGNMENTS,
  PostApprovalTypeAssignmentBulkRequest.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:49.266495+01:00[Africa/Tunis]")
public  class PostApprovalTypeAssignmentBulkRequest {
  public static final String JSON_PROPERTY_APPROVAL_TYPE_ASSIGNMENTS = "approvalTypeAssignments";
  private List<PresentationApprovalTypeAssignmentDto> approvalTypeAssignments = new ArrayList<>();

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public PostApprovalTypeAssignmentBulkRequest approvalTypeAssignments(List<PresentationApprovalTypeAssignmentDto> approvalTypeAssignments) {
    
    this.approvalTypeAssignments = approvalTypeAssignments;
    return this;
  }

  public PostApprovalTypeAssignmentBulkRequest addApprovalTypeAssignmentsItem(PresentationApprovalTypeAssignmentDto approvalTypeAssignmentsItem) {
    this.approvalTypeAssignments.add(approvalTypeAssignmentsItem);
    return this;
  }

   /**
   * The request body with a set of approval type assignments.
   * @return approvalTypeAssignments
  **/
  @NotNull
  @Valid
 @Size(min=1,max=100)  @ApiModelProperty(required = true, value = "The request body with a set of approval type assignments.")
  @JsonProperty(JSON_PROPERTY_APPROVAL_TYPE_ASSIGNMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<PresentationApprovalTypeAssignmentDto> getApprovalTypeAssignments() {
    return approvalTypeAssignments;
  }


  public void setApprovalTypeAssignments(List<PresentationApprovalTypeAssignmentDto> approvalTypeAssignments) {
    this.approvalTypeAssignments = approvalTypeAssignments;
  }


  public PostApprovalTypeAssignmentBulkRequest additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public PostApprovalTypeAssignmentBulkRequest putAdditionsItem(String key, String additionsItem) {
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
    PostApprovalTypeAssignmentBulkRequest postApprovalTypeAssignmentBulkRequest = (PostApprovalTypeAssignmentBulkRequest) o;
    return Objects.equals(this.approvalTypeAssignments, postApprovalTypeAssignmentBulkRequest.approvalTypeAssignments) &&
        Objects.equals(this.additions, postApprovalTypeAssignmentBulkRequest.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalTypeAssignments, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostApprovalTypeAssignmentBulkRequest {\n");
    sb.append("    approvalTypeAssignments: ").append(toIndentedString(approvalTypeAssignments)).append("\n");
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

