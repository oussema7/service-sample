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
 * SubscriptionRequestBody
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")

public class SubscriptionRequestBody 
 {
    @JsonProperty("subscriptionId")
    private  String subscriptionId;

    @JsonProperty("email")
    private  String email;

    @JsonProperty("billingAccount")
    private  String billingAccount;

    @JsonProperty("cardsExternalIds")
    private List<String> cardsExternalIds = new ArrayList<>();


    public SubscriptionRequestBody subscriptionId(String subscriptionId) {
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


    public SubscriptionRequestBody email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getEmail() {
        return email;
    }

    public void setEmail( String email) {
        this.email = email;
    }


    public SubscriptionRequestBody billingAccount(String billingAccount) {
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


    public SubscriptionRequestBody cardsExternalIds(List<String> cardsExternalIds) {
        this.cardsExternalIds = cardsExternalIds;
        return this;
    }

    public SubscriptionRequestBody addCardsExternalIdsItem(String cardsExternalIdsItem) {
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
        SubscriptionRequestBody subscriptionRequestBody = (SubscriptionRequestBody) o;
        return Objects.equals(this.subscriptionId, subscriptionRequestBody.subscriptionId) &&
                Objects.equals(this.email, subscriptionRequestBody.email) &&
                Objects.equals(this.billingAccount, subscriptionRequestBody.billingAccount) &&
                Objects.equals(this.cardsExternalIds, subscriptionRequestBody.cardsExternalIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            subscriptionId,
            email,
            billingAccount,
            cardsExternalIds
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionRequestBody {\n");
        
        sb.append("        subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("        email: ").append(toIndentedString(email)).append("\n");
        sb.append("        billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
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

