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
import com.microsphere.approval.service.api.rest.v2.model.ConfirmationDetails;
import com.microsphere.approval.service.api.rest.v2.model.Currency;
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
 * Request body to create a new approval optionally the approval can be pre-approved by the user creating it.
 */
@ApiModel(description = "Request body to create a new approval optionally the approval can be pre-approved by the user creating it.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PresentationPostApprovalRequest 
 {
    @JsonProperty("userId")
    private @Size(min=1, max=36)  String userId;

    @JsonProperty("serviceAgreementId")
    private @Size(min=1, max=36)  String serviceAgreementId;

    @JsonProperty("itemId")
    private @Size(min=1, max=36)  String itemId;

    @JsonProperty("dataAccessItemId")
    private @Size(min=1, max=36)  String dataAccessItemId;

    @JsonProperty("resource")
    private @Size(max=32)  String resource;

    @JsonProperty("function")
    private @Size(max=32)  String function;

    @JsonProperty("amountDetails")
    private  Currency amountDetails;

    @JsonProperty("action")
    private @Size(max=20)  String action;

    @JsonProperty("approved")
    private  Boolean approved;

    @JsonProperty("confirmationDetails")
    private  ConfirmationDetails confirmationDetails;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PresentationPostApprovalRequest userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return userId
     */
    @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @NotNull @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getUserId() {
        return userId;
    }

    public void setUserId(@Size(min=1, max=36)  String userId) {
        this.userId = userId;
    }


    public PresentationPostApprovalRequest serviceAgreementId(String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return serviceAgreementId
     */
    @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @NotNull @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getServiceAgreementId() {
        return serviceAgreementId;
    }

    public void setServiceAgreementId(@Size(min=1, max=36)  String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
    }


    public PresentationPostApprovalRequest itemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return itemId
     */
    @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @NotNull @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getItemId() {
        return itemId;
    }

    public void setItemId(@Size(min=1, max=36)  String itemId) {
        this.itemId = itemId;
    }


    public PresentationPostApprovalRequest dataAccessItemId(String dataAccessItemId) {
        this.dataAccessItemId = dataAccessItemId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return dataAccessItemId
     */
    @ApiModelProperty(value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getDataAccessItemId() {
        return dataAccessItemId;
    }

    public void setDataAccessItemId(@Size(min=1, max=36)  String dataAccessItemId) {
        this.dataAccessItemId = dataAccessItemId;
    }


    public PresentationPostApprovalRequest resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * This is the name of the resource.
     * @return resource
     */
    @ApiModelProperty(required = true, value = "This is the name of the resource.")
    @NotNull @Size(max=32) 
    public @Size(max=32)  String getResource() {
        return resource;
    }

    public void setResource(@Size(max=32)  String resource) {
        this.resource = resource;
    }


    public PresentationPostApprovalRequest function(String function) {
        this.function = function;
        return this;
    }

    /**
     * This is the name of the business function.
     * @return function
     */
    @ApiModelProperty(required = true, value = "This is the name of the business function.")
    @NotNull @Size(max=32) 
    public @Size(max=32)  String getFunction() {
        return function;
    }

    public void setFunction(@Size(max=32)  String function) {
        this.function = function;
    }


    public PresentationPostApprovalRequest amountDetails(Currency amountDetails) {
        this.amountDetails = amountDetails;
        return this;
    }

    /**
     * Get amountDetails
     * @return amountDetails
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  Currency getAmountDetails() {
        return amountDetails;
    }

    public void setAmountDetails( Currency amountDetails) {
        this.amountDetails = amountDetails;
    }


    public PresentationPostApprovalRequest action(String action) {
        this.action = action;
        return this;
    }

    /**
     * The action of the approval request
     * @return action
     */
    @ApiModelProperty(value = "The action of the approval request")
    @Size(max=20) 
    public @Size(max=20)  String getAction() {
        return action;
    }

    public void setAction(@Size(max=20)  String action) {
        this.action = action;
    }


    public PresentationPostApprovalRequest approved(Boolean approved) {
        this.approved = approved;
        return this;
    }

    /**
     * When true the approval created will also be approved by the same user.
     * @return approved
     */
    @ApiModelProperty(value = "When true the approval created will also be approved by the same user.")
    
    public  Boolean getApproved() {
        return approved;
    }

    public void setApproved( Boolean approved) {
        this.approved = approved;
    }


    public PresentationPostApprovalRequest confirmationDetails(ConfirmationDetails confirmationDetails) {
        this.confirmationDetails = confirmationDetails;
        return this;
    }

    /**
     * Get confirmationDetails
     * @return confirmationDetails
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  ConfirmationDetails getConfirmationDetails() {
        return confirmationDetails;
    }

    public void setConfirmationDetails( ConfirmationDetails confirmationDetails) {
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
     */
    @ApiModelProperty(value = "Additional properties")
    
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
        return Objects.hash(
            userId,
            serviceAgreementId,
            itemId,
            dataAccessItemId,
            resource,
            function,
            amountDetails,
            action,
            approved,
            confirmationDetails,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPostApprovalRequest {\n");
        
        sb.append("        userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
        sb.append("        itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("        dataAccessItemId: ").append(toIndentedString(dataAccessItemId)).append("\n");
        sb.append("        resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("        function: ").append(toIndentedString(function)).append("\n");
        sb.append("        amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
        sb.append("        action: ").append(toIndentedString(action)).append("\n");
        sb.append("        approved: ").append(toIndentedString(approved)).append("\n");
        sb.append("        confirmationDetails: ").append(toIndentedString(confirmationDetails)).append("\n");
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

