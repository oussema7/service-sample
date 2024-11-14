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
package com.microsphere.onboarding.client.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * SubscriptionResponse
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")

public class SubscriptionResponse 
 {
    @JsonProperty("legalEntityId")
    private  String legalEntityId;

    @JsonProperty("legalEntityExternalId")
    private  String legalEntityExternalId;

    @JsonProperty("serviceAgreementId")
    private  String serviceAgreementId;

    @JsonProperty("serviceAgreementExternalId")
    private  String serviceAgreementExternalId;

    @JsonProperty("subscriptionId")
    private  String subscriptionId;

    @JsonProperty("subscriptionExternalId")
    private  String subscriptionExternalId;


    public SubscriptionResponse legalEntityId(String legalEntityId) {
        this.legalEntityId = legalEntityId;
        return this;
    }

    /**
     * Get legalEntityId
     * @return legalEntityId
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getLegalEntityId() {
        return legalEntityId;
    }

    public void setLegalEntityId( String legalEntityId) {
        this.legalEntityId = legalEntityId;
    }


    public SubscriptionResponse legalEntityExternalId(String legalEntityExternalId) {
        this.legalEntityExternalId = legalEntityExternalId;
        return this;
    }

    /**
     * Get legalEntityExternalId
     * @return legalEntityExternalId
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getLegalEntityExternalId() {
        return legalEntityExternalId;
    }

    public void setLegalEntityExternalId( String legalEntityExternalId) {
        this.legalEntityExternalId = legalEntityExternalId;
    }


    public SubscriptionResponse serviceAgreementId(String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
        return this;
    }

    /**
     * Get serviceAgreementId
     * @return serviceAgreementId
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getServiceAgreementId() {
        return serviceAgreementId;
    }

    public void setServiceAgreementId( String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
    }


    public SubscriptionResponse serviceAgreementExternalId(String serviceAgreementExternalId) {
        this.serviceAgreementExternalId = serviceAgreementExternalId;
        return this;
    }

    /**
     * Get serviceAgreementExternalId
     * @return serviceAgreementExternalId
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getServiceAgreementExternalId() {
        return serviceAgreementExternalId;
    }

    public void setServiceAgreementExternalId( String serviceAgreementExternalId) {
        this.serviceAgreementExternalId = serviceAgreementExternalId;
    }


    public SubscriptionResponse subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get subscriptionId
     * @return subscriptionId
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId( String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    public SubscriptionResponse subscriptionExternalId(String subscriptionExternalId) {
        this.subscriptionExternalId = subscriptionExternalId;
        return this;
    }

    /**
     * Get subscriptionExternalId
     * @return subscriptionExternalId
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getSubscriptionExternalId() {
        return subscriptionExternalId;
    }

    public void setSubscriptionExternalId( String subscriptionExternalId) {
        this.subscriptionExternalId = subscriptionExternalId;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionResponse subscriptionResponse = (SubscriptionResponse) o;
        return Objects.equals(this.legalEntityId, subscriptionResponse.legalEntityId) &&
                Objects.equals(this.legalEntityExternalId, subscriptionResponse.legalEntityExternalId) &&
                Objects.equals(this.serviceAgreementId, subscriptionResponse.serviceAgreementId) &&
                Objects.equals(this.serviceAgreementExternalId, subscriptionResponse.serviceAgreementExternalId) &&
                Objects.equals(this.subscriptionId, subscriptionResponse.subscriptionId) &&
                Objects.equals(this.subscriptionExternalId, subscriptionResponse.subscriptionExternalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            legalEntityId,
            legalEntityExternalId,
            serviceAgreementId,
            serviceAgreementExternalId,
            subscriptionId,
            subscriptionExternalId
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionResponse {\n");
        
        sb.append("        legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
        sb.append("        legalEntityExternalId: ").append(toIndentedString(legalEntityExternalId)).append("\n");
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
        sb.append("        serviceAgreementExternalId: ").append(toIndentedString(serviceAgreementExternalId)).append("\n");
        sb.append("        subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("        subscriptionExternalId: ").append(toIndentedString(subscriptionExternalId)).append("\n");
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

