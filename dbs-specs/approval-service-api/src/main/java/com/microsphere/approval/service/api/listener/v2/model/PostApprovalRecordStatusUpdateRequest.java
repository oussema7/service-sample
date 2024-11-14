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
import com.microsphere.approval.service.api.listener.v2.model.ApprovalRecordStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * This is the request body to request an update of the status for an approval record.
 */
@ApiModel(description = "This is the request body to request an update of the status for an approval record.")
@JsonPropertyOrder({
  PostApprovalRecordStatusUpdateRequest.JSON_PROPERTY_STATUS,
  PostApprovalRecordStatusUpdateRequest.JSON_PROPERTY_STATUS_CODE
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:49.266495+01:00[Africa/Tunis]")
public  class PostApprovalRecordStatusUpdateRequest {
  public static final String JSON_PROPERTY_STATUS = "status";
  private ApprovalRecordStatus status;

  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  private String statusCode;


  public PostApprovalRecordStatusUpdateRequest status(ApprovalRecordStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ApprovalRecordStatus getStatus() {
    return status;
  }


  public void setStatus(ApprovalRecordStatus status) {
    this.status = status;
  }


  public PostApprovalRecordStatusUpdateRequest statusCode(String statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostApprovalRecordStatusUpdateRequest postApprovalRecordStatusUpdateRequest = (PostApprovalRecordStatusUpdateRequest) o;
    return Objects.equals(this.status, postApprovalRecordStatusUpdateRequest.status) &&
        Objects.equals(this.statusCode, postApprovalRecordStatusUpdateRequest.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostApprovalRecordStatusUpdateRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

