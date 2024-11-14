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
import com.microsphere.approval.service.api.listener.v2.model.ConfirmationDetails;
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
 * Request body to create a new approval optionally the approval can be pre-approved by the user creating it.
 */
@ApiModel(description = "Request body to create a new approval optionally the approval can be pre-approved by the user creating it.")
@JsonPropertyOrder({
  PresentationPostApprovalRequest.JSON_PROPERTY_USER_ID,
  PresentationPostApprovalRequest.JSON_PROPERTY_SERVICE_AGREEMENT_ID,
  PresentationPostApprovalRequest.JSON_PROPERTY_ITEM_ID,
  PresentationPostApprovalRequest.JSON_PROPERTY_DATA_ACCESS_ITEM_ID,
  PresentationPostApprovalRequest.JSON_PROPERTY_RESOURCE,
  PresentationPostApprovalRequest.JSON_PROPERTY_FUNCTION,
  PresentationPostApprovalRequest.JSON_PROPERTY_AMOUNT_DETAILS,
  PresentationPostApprovalRequest.JSON_PROPERTY_ACTION,
  PresentationPostApprovalRequest.JSON_PROPERTY_APPROVED,
  PresentationPostApprovalRequest.JSON_PROPERTY_CONFIRMATION_DETAILS,
  PresentationPostApprovalRequest.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:49.266495+01:00[Africa/Tunis]")
public  class PresentationPostApprovalRequest {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public static final String JSON_PROPERTY_SERVICE_AGREEMENT_ID = "serviceAgreementId";
  private String serviceAgreementId;

  public static final String JSON_PROPERTY_ITEM_ID = "itemId";
  private String itemId;

  public static final String JSON_PROPERTY_DATA_ACCESS_ITEM_ID = "dataAccessItemId";
  private String dataAccessItemId;

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private String resource;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private String function;

  public static final String JSON_PROPERTY_AMOUNT_DETAILS = "amountDetails";
  private Currency amountDetails;

  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public static final String JSON_PROPERTY_APPROVED = "approved";
  private Boolean approved;

  public static final String JSON_PROPERTY_CONFIRMATION_DETAILS = "confirmationDetails";
  private ConfirmationDetails confirmationDetails;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public PresentationPostApprovalRequest userId(String userId) {
    
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


  public PresentationPostApprovalRequest serviceAgreementId(String serviceAgreementId) {
    
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


  public PresentationPostApprovalRequest itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * A simple definition for an internal identifier. Can be UUID but doesn&#39;t have to.
   * @return itemId
  **/
  @NotNull
 @Size(min=1,max=36)  @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public PresentationPostApprovalRequest dataAccessItemId(String dataAccessItemId) {
    
    this.dataAccessItemId = dataAccessItemId;
    return this;
  }

   /**
   * A simple definition for an internal identifier. Can be UUID but doesn&#39;t have to.
   * @return dataAccessItemId
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=36)  @ApiModelProperty(value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
  @JsonProperty(JSON_PROPERTY_DATA_ACCESS_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataAccessItemId() {
    return dataAccessItemId;
  }


  public void setDataAccessItemId(String dataAccessItemId) {
    this.dataAccessItemId = dataAccessItemId;
  }


  public PresentationPostApprovalRequest resource(String resource) {
    
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


  public PresentationPostApprovalRequest function(String function) {
    
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


  public PresentationPostApprovalRequest amountDetails(Currency amountDetails) {
    
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


  public PresentationPostApprovalRequest action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * The action of the approval request
   * @return action
  **/
  @javax.annotation.Nullable
 @Size(max=20)  @ApiModelProperty(value = "The action of the approval request")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public PresentationPostApprovalRequest approved(Boolean approved) {
    
    this.approved = approved;
    return this;
  }

   /**
   * When true the approval created will also be approved by the same user.
   * @return approved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When true the approval created will also be approved by the same user.")
  @JsonProperty(JSON_PROPERTY_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getApproved() {
    return approved;
  }


  public void setApproved(Boolean approved) {
    this.approved = approved;
  }


  public PresentationPostApprovalRequest confirmationDetails(ConfirmationDetails confirmationDetails) {
    
    this.confirmationDetails = confirmationDetails;
    return this;
  }

   /**
   * Get confirmationDetails
   * @return confirmationDetails
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIRMATION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConfirmationDetails getConfirmationDetails() {
    return confirmationDetails;
  }


  public void setConfirmationDetails(ConfirmationDetails confirmationDetails) {
    this.confirmationDetails = confirmationDetails;
  }


  public PresentationPostApprovalRequest additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public PresentationPostApprovalRequest putAdditionsItem(String key, String additionsItem) {
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
    PresentationPostApprovalRequest presentationPostApprovalRequest = (PresentationPostApprovalRequest) o;
    return Objects.equals(this.userId, presentationPostApprovalRequest.userId) &&
        Objects.equals(this.serviceAgreementId, presentationPostApprovalRequest.serviceAgreementId) &&
        Objects.equals(this.itemId, presentationPostApprovalRequest.itemId) &&
        Objects.equals(this.dataAccessItemId, presentationPostApprovalRequest.dataAccessItemId) &&
        Objects.equals(this.resource, presentationPostApprovalRequest.resource) &&
        Objects.equals(this.function, presentationPostApprovalRequest.function) &&
        Objects.equals(this.amountDetails, presentationPostApprovalRequest.amountDetails) &&
        Objects.equals(this.action, presentationPostApprovalRequest.action) &&
        Objects.equals(this.approved, presentationPostApprovalRequest.approved) &&
        Objects.equals(this.confirmationDetails, presentationPostApprovalRequest.confirmationDetails) &&
        Objects.equals(this.additions, presentationPostApprovalRequest.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, serviceAgreementId, itemId, dataAccessItemId, resource, function, amountDetails, action, approved, confirmationDetails, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationPostApprovalRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    dataAccessItemId: ").append(toIndentedString(dataAccessItemId)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    confirmationDetails: ").append(toIndentedString(confirmationDetails)).append("\n");
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

