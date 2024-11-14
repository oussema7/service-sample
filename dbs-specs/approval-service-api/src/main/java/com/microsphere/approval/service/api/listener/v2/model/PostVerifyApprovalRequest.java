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
import com.microsphere.approval.service.api.listener.v2.model.Currency;
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
 * Request body to verify if the user can create an approval and if it is the final approver.
 */
@ApiModel(description = "Request body to verify if the user can create an approval and if it is the final approver.")
@JsonPropertyOrder({
  PostVerifyApprovalRequest.JSON_PROPERTY_USER_ID,
  PostVerifyApprovalRequest.JSON_PROPERTY_SERVICE_AGREEMENT_ID,
  PostVerifyApprovalRequest.JSON_PROPERTY_DATA_ACCESS_ITEM_ID,
  PostVerifyApprovalRequest.JSON_PROPERTY_RESOURCE,
  PostVerifyApprovalRequest.JSON_PROPERTY_FUNCTION,
  PostVerifyApprovalRequest.JSON_PROPERTY_AMOUNT_DETAILS,
  PostVerifyApprovalRequest.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:49.266495+01:00[Africa/Tunis]")
public  class PostVerifyApprovalRequest {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public static final String JSON_PROPERTY_SERVICE_AGREEMENT_ID = "serviceAgreementId";
  private String serviceAgreementId;

  public static final String JSON_PROPERTY_DATA_ACCESS_ITEM_ID = "dataAccessItemId";
  private String dataAccessItemId;

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private String resource;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private String function;

  public static final String JSON_PROPERTY_AMOUNT_DETAILS = "amountDetails";
  private Currency amountDetails;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public PostVerifyApprovalRequest userId(String userId) {
    
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


  public PostVerifyApprovalRequest serviceAgreementId(String serviceAgreementId) {
    
    this.serviceAgreementId = serviceAgreementId;
    return this;
  }

   /**
   * A simple definition for an internal identifier. Can be UUID but doesn&#39;t have to.
   * @return serviceAgreementId
  **/
  @NotNull
 @Size(min=1,max=36)  @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
  @JsonProperty(JSON_PROPERTY_SERVICE_AGREEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServiceAgreementId() {
    return serviceAgreementId;
  }


  public void setServiceAgreementId(String serviceAgreementId) {
    this.serviceAgreementId = serviceAgreementId;
  }


  public PostVerifyApprovalRequest dataAccessItemId(String dataAccessItemId) {
    
    this.dataAccessItemId = dataAccessItemId;
    return this;
  }

   /**
   * A simple definition for an internal identifier. Can be UUID but doesn&#39;t have to.
   * @return dataAccessItemId
  **/
  @NotNull
 @Size(min=1,max=36)  @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
  @JsonProperty(JSON_PROPERTY_DATA_ACCESS_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDataAccessItemId() {
    return dataAccessItemId;
  }


  public void setDataAccessItemId(String dataAccessItemId) {
    this.dataAccessItemId = dataAccessItemId;
  }


  public PostVerifyApprovalRequest resource(String resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * This is the name of the resource.
   * @return resource
  **/
  @NotNull
 @Size(max=32)  @ApiModelProperty(required = true, value = "This is the name of the resource.")
  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  public PostVerifyApprovalRequest function(String function) {
    
    this.function = function;
    return this;
  }

   /**
   * This is the name of the business function.
   * @return function
  **/
  @NotNull
 @Size(max=32)  @ApiModelProperty(required = true, value = "This is the name of the business function.")
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFunction() {
    return function;
  }


  public void setFunction(String function) {
    this.function = function;
  }


  public PostVerifyApprovalRequest amountDetails(Currency amountDetails) {
    
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Currency getAmountDetails() {
    return amountDetails;
  }


  public void setAmountDetails(Currency amountDetails) {
    this.amountDetails = amountDetails;
  }


  public PostVerifyApprovalRequest additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public PostVerifyApprovalRequest putAdditionsItem(String key, String additionsItem) {
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
    PostVerifyApprovalRequest postVerifyApprovalRequest = (PostVerifyApprovalRequest) o;
    return Objects.equals(this.userId, postVerifyApprovalRequest.userId) &&
        Objects.equals(this.serviceAgreementId, postVerifyApprovalRequest.serviceAgreementId) &&
        Objects.equals(this.dataAccessItemId, postVerifyApprovalRequest.dataAccessItemId) &&
        Objects.equals(this.resource, postVerifyApprovalRequest.resource) &&
        Objects.equals(this.function, postVerifyApprovalRequest.function) &&
        Objects.equals(this.amountDetails, postVerifyApprovalRequest.amountDetails) &&
        Objects.equals(this.additions, postVerifyApprovalRequest.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, serviceAgreementId, dataAccessItemId, resource, function, amountDetails, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostVerifyApprovalRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
    sb.append("    dataAccessItemId: ").append(toIndentedString(dataAccessItemId)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
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

