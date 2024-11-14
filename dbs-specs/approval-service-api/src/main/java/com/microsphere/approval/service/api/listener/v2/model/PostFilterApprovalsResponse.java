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
import com.microsphere.approval.service.api.listener.v2.model.ApprovalDto;
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
 * A filtered list of approvals, based on the request parameters
 */
@ApiModel(description = "A filtered list of approvals, based on the request parameters")
@JsonPropertyOrder({
  PostFilterApprovalsResponse.JSON_PROPERTY_APPROVALS,
  PostFilterApprovalsResponse.JSON_PROPERTY_CURSOR,
  PostFilterApprovalsResponse.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:49.266495+01:00[Africa/Tunis]")
public  class PostFilterApprovalsResponse {
  public static final String JSON_PROPERTY_APPROVALS = "approvals";
  private List<ApprovalDto> approvals = new ArrayList<>();

  public static final String JSON_PROPERTY_CURSOR = "cursor";
  private String cursor;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public PostFilterApprovalsResponse approvals(List<ApprovalDto> approvals) {
    
    this.approvals = approvals;
    return this;
  }

  public PostFilterApprovalsResponse addApprovalsItem(ApprovalDto approvalsItem) {
    this.approvals.add(approvalsItem);
    return this;
  }

   /**
   * Get approvals
   * @return approvals
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_APPROVALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ApprovalDto> getApprovals() {
    return approvals;
  }


  public void setApprovals(List<ApprovalDto> approvals) {
    this.approvals = approvals;
  }


  public PostFilterApprovalsResponse cursor(String cursor) {
    
    this.cursor = cursor;
    return this;
  }

   /**
   * Universal Unique Identifier, 
   * @return cursor
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  @ApiModelProperty(value = "Universal Unique Identifier, ")
  @JsonProperty(JSON_PROPERTY_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCursor() {
    return cursor;
  }


  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  public PostFilterApprovalsResponse additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public PostFilterApprovalsResponse putAdditionsItem(String key, String additionsItem) {
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
    PostFilterApprovalsResponse postFilterApprovalsResponse = (PostFilterApprovalsResponse) o;
    return Objects.equals(this.approvals, postFilterApprovalsResponse.approvals) &&
        Objects.equals(this.cursor, postFilterApprovalsResponse.cursor) &&
        Objects.equals(this.additions, postFilterApprovalsResponse.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvals, cursor, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFilterApprovalsResponse {\n");
    sb.append("    approvals: ").append(toIndentedString(approvals)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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
