/*
 * Arrangement Manager Service API
 * This API allows other DBS services to operate on products
 *
 * The version of the OpenAPI document: 2.7.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.arrangement.service.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.arrangement.service.api.listener.v2.model.AdditionalProperties;
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
 * Debit Card item
 */
@ApiModel(description = "Debit Card item")
@JsonPropertyOrder({
  AbstractDebitCardItem.JSON_PROPERTY_NUMBER,
  AbstractDebitCardItem.JSON_PROPERTY_EXPIRY_DATE,
  AbstractDebitCardItem.JSON_PROPERTY_CARD_ID,
  AbstractDebitCardItem.JSON_PROPERTY_CARDHOLDER_NAME,
  AbstractDebitCardItem.JSON_PROPERTY_CARD_TYPE,
  AbstractDebitCardItem.JSON_PROPERTY_CARD_STATUS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
public  class AbstractDebitCardItem extends AdditionalProperties {
  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_EXPIRY_DATE = "expiryDate";
  private String expiryDate;

  public static final String JSON_PROPERTY_CARD_ID = "cardId";
  private String cardId;

  public static final String JSON_PROPERTY_CARDHOLDER_NAME = "cardholderName";
  private String cardholderName;

  public static final String JSON_PROPERTY_CARD_TYPE = "cardType";
  private String cardType;

  public static final String JSON_PROPERTY_CARD_STATUS = "cardStatus";
  private String cardStatus;


  public AbstractDebitCardItem number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * First 6 and/or last 4 digits of a Payment card. All other digits will/to be masked. Be aware that using card number differently is potential PCI risk.
   * @return number
  **/
  @javax.annotation.Nullable
 @Size(max=36)  @ApiModelProperty(value = "First 6 and/or last 4 digits of a Payment card. All other digits will/to be masked. Be aware that using card number differently is potential PCI risk.")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public AbstractDebitCardItem expiryDate(String expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Expiration date of a credit card, after which is no longer valid
   * @return expiryDate
  **/
  @javax.annotation.Nullable
 @Size(max=32)  @ApiModelProperty(value = "Expiration date of a credit card, after which is no longer valid")
  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }


  public AbstractDebitCardItem cardId(String cardId) {
    
    this.cardId = cardId;
    return this;
  }

   /**
   * External ID of the card
   * @return cardId
  **/
  @javax.annotation.Nullable
 @Size(max=32)  @ApiModelProperty(value = "External ID of the card")
  @JsonProperty(JSON_PROPERTY_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardId() {
    return cardId;
  }


  public void setCardId(String cardId) {
    this.cardId = cardId;
  }


  public AbstractDebitCardItem cardholderName(String cardholderName) {
    
    this.cardholderName = cardholderName;
    return this;
  }

   /**
   * First Name and Last Name of card holder.
   * @return cardholderName
  **/
  @javax.annotation.Nullable
 @Size(max=64)  @ApiModelProperty(value = "First Name and Last Name of card holder.")
  @JsonProperty(JSON_PROPERTY_CARDHOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardholderName() {
    return cardholderName;
  }


  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }


  public AbstractDebitCardItem cardType(String cardType) {
    
    this.cardType = cardType;
    return this;
  }

   /**
   * Card type to change card image based on it, ex. Maestro Gold
   * @return cardType
  **/
  @javax.annotation.Nullable
 @Size(max=32)  @ApiModelProperty(value = "Card type to change card image based on it, ex. Maestro Gold")
  @JsonProperty(JSON_PROPERTY_CARD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  public AbstractDebitCardItem cardStatus(String cardStatus) {
    
    this.cardStatus = cardStatus;
    return this;
  }

   /**
   * Status of the card ex. Active, Expired etc
   * @return cardStatus
  **/
  @javax.annotation.Nullable
 @Size(max=32)  @ApiModelProperty(value = "Status of the card ex. Active, Expired etc")
  @JsonProperty(JSON_PROPERTY_CARD_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardStatus() {
    return cardStatus;
  }


  public void setCardStatus(String cardStatus) {
    this.cardStatus = cardStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractDebitCardItem abstractDebitCardItem = (AbstractDebitCardItem) o;
    return Objects.equals(this.number, abstractDebitCardItem.number) &&
        Objects.equals(this.expiryDate, abstractDebitCardItem.expiryDate) &&
        Objects.equals(this.cardId, abstractDebitCardItem.cardId) &&
        Objects.equals(this.cardholderName, abstractDebitCardItem.cardholderName) &&
        Objects.equals(this.cardType, abstractDebitCardItem.cardType) &&
        Objects.equals(this.cardStatus, abstractDebitCardItem.cardStatus) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, expiryDate, cardId, cardholderName, cardType, cardStatus, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractDebitCardItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardStatus: ").append(toIndentedString(cardStatus)).append("\n");
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
