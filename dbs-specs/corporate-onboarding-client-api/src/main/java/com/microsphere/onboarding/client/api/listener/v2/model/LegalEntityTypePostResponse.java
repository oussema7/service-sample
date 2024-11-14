/*
 * Legal Entity Name client API
 * OpenApi Endpoints for managing Legal Entities Ancestors. 
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.onboarding.client.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.onboarding.client.api.listener.v2.model.AccountDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * Get legal entity request
 */
@ApiModel(description = "Get legal entity request")
@JsonPropertyOrder({
  LegalEntityTypePostResponse.JSON_PROPERTY_EXTERNAL_ID,
  LegalEntityTypePostResponse.JSON_PROPERTY_NAME,
  LegalEntityTypePostResponse.JSON_PROPERTY_ACCOUNT_LIST,
  LegalEntityTypePostResponse.JSON_PROPERTY_SUBSCRIPTION_RESCINDED
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:54.559235200+01:00[Africa/Tunis]")
public  class LegalEntityTypePostResponse {
  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ACCOUNT_LIST = "accountList";
  private List<AccountDetail> accountList = new ArrayList<>();

  public static final String JSON_PROPERTY_SUBSCRIPTION_RESCINDED = "subscriptionRescinded";
  private Boolean subscriptionRescinded;


  public LegalEntityTypePostResponse externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Identifier
   * @return externalId
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Identifier")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public LegalEntityTypePostResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Identifier
   * @return name
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Identifier")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LegalEntityTypePostResponse accountList(List<AccountDetail> accountList) {
    
    this.accountList = accountList;
    return this;
  }

  public LegalEntityTypePostResponse addAccountListItem(AccountDetail accountListItem) {
    this.accountList.add(accountListItem);
    return this;
  }

   /**
   * Get accountList
   * @return accountList
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AccountDetail> getAccountList() {
    return accountList;
  }


  public void setAccountList(List<AccountDetail> accountList) {
    this.accountList = accountList;
  }


  public LegalEntityTypePostResponse subscriptionRescinded(Boolean subscriptionRescinded) {
    
    this.subscriptionRescinded = subscriptionRescinded;
    return this;
  }

   /**
   * Get subscriptionRescinded
   * @return subscriptionRescinded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_RESCINDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubscriptionRescinded() {
    return subscriptionRescinded;
  }


  public void setSubscriptionRescinded(Boolean subscriptionRescinded) {
    this.subscriptionRescinded = subscriptionRescinded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalEntityTypePostResponse legalEntityTypePostResponse = (LegalEntityTypePostResponse) o;
    return Objects.equals(this.externalId, legalEntityTypePostResponse.externalId) &&
        Objects.equals(this.name, legalEntityTypePostResponse.name) &&
        Objects.equals(this.accountList, legalEntityTypePostResponse.accountList) &&
        Objects.equals(this.subscriptionRescinded, legalEntityTypePostResponse.subscriptionRescinded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, name, accountList, subscriptionRescinded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalEntityTypePostResponse {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountList: ").append(toIndentedString(accountList)).append("\n");
    sb.append("    subscriptionRescinded: ").append(toIndentedString(subscriptionRescinded)).append("\n");
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

