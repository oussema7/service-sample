/*
Boat Generator configuration:
    useBeanValidation: true
    useOptional: false
    addServletRequest: false
    useLombokAnnotations: false
    openApiNullable: true
    useSetForUniqueItems: false
    useWithModifiers: false
*/
package com.microsphere.approval.service.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * The object describing confirmation details.
 */
@ApiModel(description = "The object describing confirmation details.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class ConfirmationDetails 
 {
    @JsonProperty("callbackUrl")
    private @Size(min=1, max=255)  String callbackUrl;

    @JsonProperty("confirmationType")
    private @Size(min=1, max=55)  String confirmationType;

    @JsonProperty("transactionData")
    private Map<String, String> transactionData = null;

    @JsonProperty("confirmationId")
    private @Size(min=1, max=36)  String confirmationId;


    public ConfirmationDetails callbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * This is the URL that is called by the Confirmation service when the status of the Confirmation changes.
     * @return callbackUrl
     */
    @ApiModelProperty(value = "This is the URL that is called by the Confirmation service when the status of the Confirmation changes.")
    @Size(min=1, max=255) 
    public @Size(min=1, max=255)  String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(@Size(min=1, max=255)  String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }


    public ConfirmationDetails confirmationType(String confirmationType) {
        this.confirmationType = confirmationType;
        return this;
    }

    /**
     * Defined by the domain Capability. Allows subscribing Capabilities to discriminate between their data and that created by other Capabilities.
     * @return confirmationType
     */
    @ApiModelProperty(value = "Defined by the domain Capability. Allows subscribing Capabilities to discriminate between their data and that created by other Capabilities.")
    @Size(min=1, max=55) 
    public @Size(min=1, max=55)  String getConfirmationType() {
        return confirmationType;
    }

    public void setConfirmationType(@Size(min=1, max=55)  String confirmationType) {
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
     */
    @ApiModelProperty(value = "A collection of transaction data points for the confirmation, in the form of key-value pairs.")
    @Size(min=1, max=40) 
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
     */
    @ApiModelProperty(value = "Confirmation Id. Can be passed to skip confirmation on approvals side.")
    @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getConfirmationId() {
        return confirmationId;
    }

    public void setConfirmationId(@Size(min=1, max=36)  String confirmationId) {
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
        return Objects.hash(
            callbackUrl,
            confirmationType,
            transactionData,
            confirmationId
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmationDetails {\n");
        
        sb.append("        callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("        confirmationType: ").append(toIndentedString(confirmationType)).append("\n");
        sb.append("        transactionData: ").append(toIndentedString(transactionData)).append("\n");
        sb.append("        confirmationId: ").append(toIndentedString(confirmationId)).append("\n");
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
        return o.toString().replace("\n", "\n        ");
    }
}

