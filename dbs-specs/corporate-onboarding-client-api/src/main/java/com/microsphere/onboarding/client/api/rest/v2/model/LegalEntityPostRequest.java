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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * LegalEntityPostRequest
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")

public class LegalEntityPostRequest 
 {
    @JsonProperty("externalId")
    private  String externalId;

    @JsonProperty("name")
    private  String name;

    @JsonProperty("offer")
    private  String offer;

    @JsonProperty("subscriptionType")
    private  String subscriptionType;

    @JsonProperty("billingAccount")
    private  String billingAccount;

    @JsonProperty("email")
    private  String email;

    @JsonProperty("cardsExternalIds")
    private List<String> cardsExternalIds = new ArrayList<>();


    public LegalEntityPostRequest externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Get externalId
     * @return externalId
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getExternalId() {
        return externalId;
    }

    public void setExternalId( String externalId) {
        this.externalId = externalId;
    }


    public LegalEntityPostRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }


    public LegalEntityPostRequest offer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get offer
     * @return offer
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getOffer() {
        return offer;
    }

    public void setOffer( String offer) {
        this.offer = offer;
    }


    public LegalEntityPostRequest subscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    /**
     * Get subscriptionType
     * @return subscriptionType
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType( String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }


    public LegalEntityPostRequest billingAccount(String billingAccount) {
        this.billingAccount = billingAccount;
        return this;
    }

    /**
     * Get billingAccount
     * @return billingAccount
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount( String billingAccount) {
        this.billingAccount = billingAccount;
    }


    public LegalEntityPostRequest email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @ApiModelProperty(value = "")
    
    public  String getEmail() {
        return email;
    }

    public void setEmail( String email) {
        this.email = email;
    }


    public LegalEntityPostRequest cardsExternalIds(List<String> cardsExternalIds) {
        this.cardsExternalIds = cardsExternalIds;
        return this;
    }

    public LegalEntityPostRequest addCardsExternalIdsItem(String cardsExternalIdsItem) {
        this.cardsExternalIds.add(cardsExternalIdsItem);
        return this;
    }

    /**
     * Get cardsExternalIds
     * @return cardsExternalIds
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public List<String> getCardsExternalIds() {
        return cardsExternalIds;
    }

    public void setCardsExternalIds(List<String> cardsExternalIds) {
        this.cardsExternalIds = cardsExternalIds;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LegalEntityPostRequest legalEntityPostRequest = (LegalEntityPostRequest) o;
        return Objects.equals(this.externalId, legalEntityPostRequest.externalId) &&
                Objects.equals(this.name, legalEntityPostRequest.name) &&
                Objects.equals(this.offer, legalEntityPostRequest.offer) &&
                Objects.equals(this.subscriptionType, legalEntityPostRequest.subscriptionType) &&
                Objects.equals(this.billingAccount, legalEntityPostRequest.billingAccount) &&
                Objects.equals(this.email, legalEntityPostRequest.email) &&
                Objects.equals(this.cardsExternalIds, legalEntityPostRequest.cardsExternalIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            externalId,
            name,
            offer,
            subscriptionType,
            billingAccount,
            email,
            cardsExternalIds
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LegalEntityPostRequest {\n");
        
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        offer: ").append(toIndentedString(offer)).append("\n");
        sb.append("        subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
        sb.append("        billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
        sb.append("        email: ").append(toIndentedString(email)).append("\n");
        sb.append("        cardsExternalIds: ").append(toIndentedString(cardsExternalIds)).append("\n");
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

