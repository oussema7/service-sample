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
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionResponseBodyCards;
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
 * SubscriptionResponseBody
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")

public class SubscriptionResponseBody 
 {
    @JsonProperty("subscriptionId")
    private  String subscriptionId;

    @JsonProperty("legalEntityName")
    private  String legalEntityName;

    @JsonProperty("legalEntityExtId")
    private  String legalEntityExtId;

    @JsonProperty("offer")
    private  String offer;

    @JsonProperty("status")
    private  String status;

    @JsonProperty("accountPulled")
    private  String accountPulled;

    @JsonProperty("accountGroupCreated")
    private  String accountGroupCreated;

    @JsonProperty("ibsActivated")
    private  String ibsActivated;

    @JsonProperty("subscriptionType")
    private  String subscriptionType;

    @JsonProperty("externalSubscriptionId")
    private  String externalSubscriptionId;

    @JsonProperty("billingAccount")
    private  String billingAccount;

    @JsonProperty("externalSubscriptionStatus")
    private  String externalSubscriptionStatus;

  /**
   * Gets or Sets subscriptionStatus
   */
  public enum SubscriptionStatusEnum {
    ACTIVE("ACTIVE"),
    
    RESCINDED("RESCINDED"),
    
    INACTIVE("INACTIVE"),
    
    ACTIVATION_LOADING("ACTIVATION_LOADING"),
    
    ACTIVATION_FAILED("ACTIVATION_FAILED");

    private String value;

    SubscriptionStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SubscriptionStatusEnum fromValue(String value) {
      for (SubscriptionStatusEnum b : SubscriptionStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

    @JsonProperty("subscriptionStatus")
    private  SubscriptionStatusEnum subscriptionStatus;

    @JsonProperty("email")
    private  String email;

    @JsonProperty("cards")
    private List<SubscriptionResponseBodyCards> cards = null;


    public SubscriptionResponseBody subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get subscriptionId
     * @return subscriptionId
     */
    @ApiModelProperty(value = "")
    
    public  String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId( String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    public SubscriptionResponseBody legalEntityName(String legalEntityName) {
        this.legalEntityName = legalEntityName;
        return this;
    }

    /**
     * Get legalEntityName
     * @return legalEntityName
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getLegalEntityName() {
        return legalEntityName;
    }

    public void setLegalEntityName( String legalEntityName) {
        this.legalEntityName = legalEntityName;
    }


    public SubscriptionResponseBody legalEntityExtId(String legalEntityExtId) {
        this.legalEntityExtId = legalEntityExtId;
        return this;
    }

    /**
     * Get legalEntityExtId
     * @return legalEntityExtId
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getLegalEntityExtId() {
        return legalEntityExtId;
    }

    public void setLegalEntityExtId( String legalEntityExtId) {
        this.legalEntityExtId = legalEntityExtId;
    }


    public SubscriptionResponseBody offer(String offer) {
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


    public SubscriptionResponseBody status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getStatus() {
        return status;
    }

    public void setStatus( String status) {
        this.status = status;
    }


    public SubscriptionResponseBody accountPulled(String accountPulled) {
        this.accountPulled = accountPulled;
        return this;
    }

    /**
     * Get accountPulled
     * @return accountPulled
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getAccountPulled() {
        return accountPulled;
    }

    public void setAccountPulled( String accountPulled) {
        this.accountPulled = accountPulled;
    }


    public SubscriptionResponseBody accountGroupCreated(String accountGroupCreated) {
        this.accountGroupCreated = accountGroupCreated;
        return this;
    }

    /**
     * Get accountGroupCreated
     * @return accountGroupCreated
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getAccountGroupCreated() {
        return accountGroupCreated;
    }

    public void setAccountGroupCreated( String accountGroupCreated) {
        this.accountGroupCreated = accountGroupCreated;
    }


    public SubscriptionResponseBody ibsActivated(String ibsActivated) {
        this.ibsActivated = ibsActivated;
        return this;
    }

    /**
     * Get ibsActivated
     * @return ibsActivated
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getIbsActivated() {
        return ibsActivated;
    }

    public void setIbsActivated( String ibsActivated) {
        this.ibsActivated = ibsActivated;
    }


    public SubscriptionResponseBody subscriptionType(String subscriptionType) {
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


    public SubscriptionResponseBody externalSubscriptionId(String externalSubscriptionId) {
        this.externalSubscriptionId = externalSubscriptionId;
        return this;
    }

    /**
     * Get externalSubscriptionId
     * @return externalSubscriptionId
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getExternalSubscriptionId() {
        return externalSubscriptionId;
    }

    public void setExternalSubscriptionId( String externalSubscriptionId) {
        this.externalSubscriptionId = externalSubscriptionId;
    }


    public SubscriptionResponseBody billingAccount(String billingAccount) {
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


    public SubscriptionResponseBody externalSubscriptionStatus(String externalSubscriptionStatus) {
        this.externalSubscriptionStatus = externalSubscriptionStatus;
        return this;
    }

    /**
     * Get externalSubscriptionStatus
     * @return externalSubscriptionStatus
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getExternalSubscriptionStatus() {
        return externalSubscriptionStatus;
    }

    public void setExternalSubscriptionStatus( String externalSubscriptionStatus) {
        this.externalSubscriptionStatus = externalSubscriptionStatus;
    }


    public SubscriptionResponseBody subscriptionStatus(SubscriptionStatusEnum subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
        return this;
    }

    /**
     * Get subscriptionStatus
     * @return subscriptionStatus
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  SubscriptionStatusEnum getSubscriptionStatus() {
        return subscriptionStatus;
    }

    public void setSubscriptionStatus( SubscriptionStatusEnum subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }


    public SubscriptionResponseBody email(String email) {
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


    public SubscriptionResponseBody cards(List<SubscriptionResponseBodyCards> cards) {
        this.cards = cards;
        return this;
    }

    public SubscriptionResponseBody addCardsItem(SubscriptionResponseBodyCards cardsItem) {
        if (this.cards == null) {
            this.cards = new ArrayList<>();
        }
        this.cards.add(cardsItem);
        return this;
    }

    /**
     * Get cards
     * @return cards
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<SubscriptionResponseBodyCards> getCards() {
        return cards;
    }

    public void setCards(List<SubscriptionResponseBodyCards> cards) {
        this.cards = cards;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionResponseBody subscriptionResponseBody = (SubscriptionResponseBody) o;
        return Objects.equals(this.subscriptionId, subscriptionResponseBody.subscriptionId) &&
                Objects.equals(this.legalEntityName, subscriptionResponseBody.legalEntityName) &&
                Objects.equals(this.legalEntityExtId, subscriptionResponseBody.legalEntityExtId) &&
                Objects.equals(this.offer, subscriptionResponseBody.offer) &&
                Objects.equals(this.status, subscriptionResponseBody.status) &&
                Objects.equals(this.accountPulled, subscriptionResponseBody.accountPulled) &&
                Objects.equals(this.accountGroupCreated, subscriptionResponseBody.accountGroupCreated) &&
                Objects.equals(this.ibsActivated, subscriptionResponseBody.ibsActivated) &&
                Objects.equals(this.subscriptionType, subscriptionResponseBody.subscriptionType) &&
                Objects.equals(this.externalSubscriptionId, subscriptionResponseBody.externalSubscriptionId) &&
                Objects.equals(this.billingAccount, subscriptionResponseBody.billingAccount) &&
                Objects.equals(this.externalSubscriptionStatus, subscriptionResponseBody.externalSubscriptionStatus) &&
                Objects.equals(this.subscriptionStatus, subscriptionResponseBody.subscriptionStatus) &&
                Objects.equals(this.email, subscriptionResponseBody.email) &&
                Objects.equals(this.cards, subscriptionResponseBody.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            subscriptionId,
            legalEntityName,
            legalEntityExtId,
            offer,
            status,
            accountPulled,
            accountGroupCreated,
            ibsActivated,
            subscriptionType,
            externalSubscriptionId,
            billingAccount,
            externalSubscriptionStatus,
            subscriptionStatus,
            email,
            cards
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionResponseBody {\n");
        
        sb.append("        subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("        legalEntityName: ").append(toIndentedString(legalEntityName)).append("\n");
        sb.append("        legalEntityExtId: ").append(toIndentedString(legalEntityExtId)).append("\n");
        sb.append("        offer: ").append(toIndentedString(offer)).append("\n");
        sb.append("        status: ").append(toIndentedString(status)).append("\n");
        sb.append("        accountPulled: ").append(toIndentedString(accountPulled)).append("\n");
        sb.append("        accountGroupCreated: ").append(toIndentedString(accountGroupCreated)).append("\n");
        sb.append("        ibsActivated: ").append(toIndentedString(ibsActivated)).append("\n");
        sb.append("        subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
        sb.append("        externalSubscriptionId: ").append(toIndentedString(externalSubscriptionId)).append("\n");
        sb.append("        billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
        sb.append("        externalSubscriptionStatus: ").append(toIndentedString(externalSubscriptionStatus)).append("\n");
        sb.append("        subscriptionStatus: ").append(toIndentedString(subscriptionStatus)).append("\n");
        sb.append("        email: ").append(toIndentedString(email)).append("\n");
        sb.append("        cards: ").append(toIndentedString(cards)).append("\n");
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

