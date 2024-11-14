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
 * A policy item defines how many approvals, of what approval type are needed.
 */
@ApiModel(description = "A policy item defines how many approvals, of what approval type are needed.")
@JsonPropertyOrder({
  CreatePolicyItemDto.JSON_PROPERTY_APPROVAL_TYPE_ID,
  CreatePolicyItemDto.JSON_PROPERTY_NUMBER_OF_APPROVALS,
  CreatePolicyItemDto.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:49.266495+01:00[Africa/Tunis]")
public  class CreatePolicyItemDto {
  public static final String JSON_PROPERTY_APPROVAL_TYPE_ID = "approvalTypeId";
  private String approvalTypeId;

  public static final String JSON_PROPERTY_NUMBER_OF_APPROVALS = "numberOfApprovals";
  private Integer numberOfApprovals;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public CreatePolicyItemDto approvalTypeId(String approvalTypeId) {
    
    this.approvalTypeId = approvalTypeId;
    return this;
  }

   /**
   * Universal Unique Identifier, 
   * @return approvalTypeId
  **/
  @NotNull
 @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  @ApiModelProperty(required = true, value = "Universal Unique Identifier, ")
  @JsonProperty(JSON_PROPERTY_APPROVAL_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApprovalTypeId() {
    return approvalTypeId;
  }


  public void setApprovalTypeId(String approvalTypeId) {
    this.approvalTypeId = approvalTypeId;
  }


  public CreatePolicyItemDto numberOfApprovals(Integer numberOfApprovals) {
    
    this.numberOfApprovals = numberOfApprovals;
    return this;
  }

   /**
   * The number of a certain type of approval that is required.
   * minimum: 1
   * maximum: 99
   * @return numberOfApprovals
  **/
  @NotNull
 @Min(1) @Max(99)  @ApiModelProperty(required = true, value = "The number of a certain type of approval that is required.")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_APPROVALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNumberOfApprovals() {
    return numberOfApprovals;
  }


  public void setNumberOfApprovals(Integer numberOfApprovals) {
    this.numberOfApprovals = numberOfApprovals;
  }


  public CreatePolicyItemDto additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public CreatePolicyItemDto putAdditionsItem(String key, String additionsItem) {
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
    CreatePolicyItemDto createPolicyItemDto = (CreatePolicyItemDto) o;
    return Objects.equals(this.approvalTypeId, createPolicyItemDto.approvalTypeId) &&
        Objects.equals(this.numberOfApprovals, createPolicyItemDto.numberOfApprovals) &&
        Objects.equals(this.additions, createPolicyItemDto.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalTypeId, numberOfApprovals, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePolicyItemDto {\n");
    sb.append("    approvalTypeId: ").append(toIndentedString(approvalTypeId)).append("\n");
    sb.append("    numberOfApprovals: ").append(toIndentedString(numberOfApprovals)).append("\n");
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

