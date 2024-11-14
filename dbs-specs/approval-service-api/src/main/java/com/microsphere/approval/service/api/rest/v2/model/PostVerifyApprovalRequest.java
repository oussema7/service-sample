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
 * Request body to verify if the user can create an approval and if it is the final approver.
 */
@ApiModel(description = "Request body to verify if the user can create an approval and if it is the final approver.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PostVerifyApprovalRequest 
 {
    @JsonProperty("userId")
    private @Size(min=1, max=36)  String userId;

    @JsonProperty("serviceAgreementId")
    private @Size(min=1, max=36)  String serviceAgreementId;

    @JsonProperty("dataAccessItemId")
    private @Size(min=1, max=36)  String dataAccessItemId;

    @JsonProperty("resource")
    private @Size(max=32)  String resource;

    @JsonProperty("function")
    private @Size(max=32)  String function;

    @JsonProperty("amountDetails")
    private  Currency amountDetails;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PostVerifyApprovalRequest userId(String userId) {
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


    public PostVerifyApprovalRequest serviceAgreementId(String serviceAgreementId) {
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


    public PostVerifyApprovalRequest dataAccessItemId(String dataAccessItemId) {
        this.dataAccessItemId = dataAccessItemId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return dataAccessItemId
     */
    @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @NotNull @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getDataAccessItemId() {
        return dataAccessItemId;
    }

    public void setDataAccessItemId(@Size(min=1, max=36)  String dataAccessItemId) {
        this.dataAccessItemId = dataAccessItemId;
    }


    public PostVerifyApprovalRequest resource(String resource) {
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


    public PostVerifyApprovalRequest function(String function) {
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


    public PostVerifyApprovalRequest amountDetails(Currency amountDetails) {
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
        return Objects.hash(
            userId,
            serviceAgreementId,
            dataAccessItemId,
            resource,
            function,
            amountDetails,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostVerifyApprovalRequest {\n");
        
        sb.append("        userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
        sb.append("        dataAccessItemId: ").append(toIndentedString(dataAccessItemId)).append("\n");
        sb.append("        resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("        function: ").append(toIndentedString(function)).append("\n");
        sb.append("        amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
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

