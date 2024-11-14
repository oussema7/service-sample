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
 * The object describing confirmation details.
 */
@ApiModel(description = "The object describing confirmation details.")
@JsonPropertyOrder({
  ConfirmationDetails.JSON_PROPERTY_CALLBACK_URL,
  ConfirmationDetails.JSON_PROPERTY_CONFIRMATION_TYPE,
  ConfirmationDetails.JSON_PROPERTY_TRANSACTION_DATA,
  ConfirmationDetails.JSON_PROPERTY_CONFIRMATION_ID
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:49.266495+01:00[Africa/Tunis]")
public  class ConfirmationDetails {
  public static final String JSON_PROPERTY_CALLBACK_URL = "callbackUrl";
  private String callbackUrl;

  public static final String JSON_PROPERTY_CONFIRMATION_TYPE = "confirmationType";
  private String confirmationType;

  public static final String JSON_PROPERTY_TRANSACTION_DATA = "transactionData";
  private Map<String, String> transactionData = null;

  public static final String JSON_PROPERTY_CONFIRMATION_ID = "confirmationId";
  private String confirmationId;


  public ConfirmationDetails callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * This is the URL that is called by the Confirmation service when the status of the Confirmation changes.
   * @return callbackUrl
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "This is the URL that is called by the Confirmation service when the status of the Confirmation changes.")
  @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public ConfirmationDetails confirmationType(String confirmationType) {
    
    this.confirmationType = confirmationType;
    return this;
  }

   /**
   * Defined by the domain Capability. Allows subscribing Capabilities to discriminate between their data and that created by other Capabilities.
   * @return confirmationType
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=55)  @ApiModelProperty(value = "Defined by the domain Capability. Allows subscribing Capabilities to discriminate between their data and that created by other Capabilities.")
  @JsonProperty(JSON_PROPERTY_CONFIRMATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConfirmationType() {
    return confirmationType;
  }


  public void setConfirmationType(String confirmationType) {
    this.confirmationType = confirmationType;
  }


  public ConfirmationDetails transactionData(Map<String, String> transactionData) {
    
    this.transactionData = transactionData;
    return this;
  }

  public ConfirmationDetails putTransactionDataItem(String key, String transactionDataItem) {
    if (this.transactionData == null) {
      this.transactionData = new HashMap<>();
    }
    this.transactionData.put(key, transactionDataItem);
    return this;
  }

   /**
   * A collection of transaction data points for the confirmation, in the form of key-value pairs.
   * @return transactionData
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=40)  @ApiModelProperty(value = "A collection of transaction data points for the confirmation, in the form of key-value pairs.")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getTransactionData() {
    return transactionData;
  }


  public void setTransactionData(Map<String, String> transactionData) {
    this.transactionData = transactionData;
  }


  public ConfirmationDetails confirmationId(String confirmationId) {
    
    this.confirmationId = confirmationId;
    return this;
  }

   /**
   * Confirmation Id. Can be passed to skip confirmation on approvals side.
   * @return confirmationId
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=36)  @ApiModelProperty(value = "Confirmation Id. Can be passed to skip confirmation on approvals side.")
  @JsonProperty(JSON_PROPERTY_CONFIRMATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConfirmationId() {
    return confirmationId;
  }


  public void setConfirmationId(String confirmationId) {
    this.confirmationId = confirmationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmationDetails confirmationDetails = (ConfirmationDetails) o;
    return Objects.equals(this.callbackUrl, confirmationDetails.callbackUrl) &&
        Objects.equals(this.confirmationType, confirmationDetails.confirmationType) &&
        Objects.equals(this.transactionData, confirmationDetails.transactionData) &&
        Objects.equals(this.confirmationId, confirmationDetails.confirmationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, confirmationType, transactionData, confirmationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmationDetails {\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    confirmationType: ").append(toIndentedString(confirmationType)).append("\n");
    sb.append("    transactionData: ").append(toIndentedString(transactionData)).append("\n");
    sb.append("    confirmationId: ").append(toIndentedString(confirmationId)).append("\n");
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

