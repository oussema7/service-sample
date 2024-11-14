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
import com.microsphere.arrangement.service.api.listener.v2.model.UserPreferences;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * Limited view of an arrangement.
 */
@ApiModel(description = "Limited view of an arrangement.")
@JsonPropertyOrder({
  AbstractLimitedArrangement.JSON_PROPERTY_ID,
  AbstractLimitedArrangement.JSON_PROPERTY_LEGAL_ENTITY_IDS,
  AbstractLimitedArrangement.JSON_PROPERTY_NAME,
  AbstractLimitedArrangement.JSON_PROPERTY_BANK_ALIAS,
  AbstractLimitedArrangement.JSON_PROPERTY_I_B_A_N,
  AbstractLimitedArrangement.JSON_PROPERTY_B_B_A_N,
  AbstractLimitedArrangement.JSON_PROPERTY_CURRENCY,
  AbstractLimitedArrangement.JSON_PROPERTY_EXTERNAL_TRANSFER_ALLOWED,
  AbstractLimitedArrangement.JSON_PROPERTY_URGENT_TRANSFER_ALLOWED,
  AbstractLimitedArrangement.JSON_PROPERTY_NUMBER,
  AbstractLimitedArrangement.JSON_PROPERTY_PRODUCT_KIND_NAME,
  AbstractLimitedArrangement.JSON_PROPERTY_PRODUCT_TYPE_NAME,
  AbstractLimitedArrangement.JSON_PROPERTY_B_I_C,
  AbstractLimitedArrangement.JSON_PROPERTY_BANK_BRANCH_CODE,
  AbstractLimitedArrangement.JSON_PROPERTY_CREDIT_ACCOUNT,
  AbstractLimitedArrangement.JSON_PROPERTY_DEBIT_ACCOUNT,
  AbstractLimitedArrangement.JSON_PROPERTY_USER_PREFERENCES,
  AbstractLimitedArrangement.JSON_PROPERTY_FINANCIAL_INSTITUTION_ID,
  AbstractLimitedArrangement.JSON_PROPERTY_LAST_SYNC_DATE,
  AbstractLimitedArrangement.JSON_PROPERTY_SOURCE_ID
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
public  class AbstractLimitedArrangement extends AdditionalProperties {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LEGAL_ENTITY_IDS = "legalEntityIds";
  private List<String> legalEntityIds = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_BANK_ALIAS = "bankAlias";
  private String bankAlias;

  public static final String JSON_PROPERTY_I_B_A_N = "IBAN";
  private String IBAN;

  public static final String JSON_PROPERTY_B_B_A_N = "BBAN";
  private String BBAN;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_EXTERNAL_TRANSFER_ALLOWED = "externalTransferAllowed";
  private Boolean externalTransferAllowed;

  public static final String JSON_PROPERTY_URGENT_TRANSFER_ALLOWED = "urgentTransferAllowed";
  private Boolean urgentTransferAllowed;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_PRODUCT_KIND_NAME = "productKindName";
  private String productKindName;

  public static final String JSON_PROPERTY_PRODUCT_TYPE_NAME = "productTypeName";
  private String productTypeName;

  public static final String JSON_PROPERTY_B_I_C = "BIC";
  private String BIC;

  public static final String JSON_PROPERTY_BANK_BRANCH_CODE = "bankBranchCode";
  private String bankBranchCode;

  public static final String JSON_PROPERTY_CREDIT_ACCOUNT = "creditAccount";
  private Boolean creditAccount;

  public static final String JSON_PROPERTY_DEBIT_ACCOUNT = "debitAccount";
  private Boolean debitAccount;

  public static final String JSON_PROPERTY_USER_PREFERENCES = "userPreferences";
  private UserPreferences userPreferences;

  public static final String JSON_PROPERTY_FINANCIAL_INSTITUTION_ID = "financialInstitutionId";
  private Long financialInstitutionId;

  public static final String JSON_PROPERTY_LAST_SYNC_DATE = "lastSyncDate";
  private OffsetDateTime lastSyncDate;

  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;


  public AbstractLimitedArrangement id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the Arrangement object that is generated and used Internally in DBS.
   * @return id
  **/
  @NotNull
 @Size(max=36)  @ApiModelProperty(required = true, value = "A unique identifier for the Arrangement object that is generated and used Internally in DBS.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AbstractLimitedArrangement legalEntityIds(List<String> legalEntityIds) {
    
    this.legalEntityIds = legalEntityIds;
    return this;
  }

  public AbstractLimitedArrangement addLegalEntityIdsItem(String legalEntityIdsItem) {
    this.legalEntityIds.add(legalEntityIdsItem);
    return this;
  }

   /**
   * References to the legal entities that are owners of the arrangement.
   * @return legalEntityIds
  **/
  @NotNull
 @Size(min=1)  @ApiModelProperty(required = true, value = "References to the legal entities that are owners of the arrangement.")
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getLegalEntityIds() {
    return legalEntityIds;
  }


  public void setLegalEntityIds(List<String> legalEntityIds) {
    this.legalEntityIds = legalEntityIds;
  }


  public AbstractLimitedArrangement name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name that can be assigned by the bank to label an arrangement.
   * @return name
  **/
  @javax.annotation.Nullable
 @Size(max=50)  @ApiModelProperty(value = "The name that can be assigned by the bank to label an arrangement.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AbstractLimitedArrangement bankAlias(String bankAlias) {
    
    this.bankAlias = bankAlias;
    return this;
  }

   /**
   * The name that can be assigned by the customer to label the arrangement.
   * @return bankAlias
  **/
  @javax.annotation.Nullable
 @Size(max=50)  @ApiModelProperty(value = "The name that can be assigned by the customer to label the arrangement.")
  @JsonProperty(JSON_PROPERTY_BANK_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankAlias() {
    return bankAlias;
  }


  public void setBankAlias(String bankAlias) {
    this.bankAlias = bankAlias;
  }


  public AbstractLimitedArrangement IBAN(String IBAN) {
    
    this.IBAN = IBAN;
    return this;
  }

   /**
   * The International Bank Account Number. If specified, it must be a valid IBAN, otherwise an invalid value error could be raised. 
   * @return IBAN
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[0-9A-Z•]+$") @Size(max=34)  @ApiModelProperty(value = "The International Bank Account Number. If specified, it must be a valid IBAN, otherwise an invalid value error could be raised. ")
  @JsonProperty(JSON_PROPERTY_I_B_A_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIBAN() {
    return IBAN;
  }


  public void setIBAN(String IBAN) {
    this.IBAN = IBAN;
  }


  public AbstractLimitedArrangement BBAN(String BBAN) {
    
    this.BBAN = BBAN;
    return this;
  }

   /**
   * BBAN is the country-specific bank account number. It is short for Basic Bank Account Number. Account numbers usually match the BBAN. 
   * @return BBAN
  **/
  @javax.annotation.Nullable
 @Size(max=50)  @ApiModelProperty(value = "BBAN is the country-specific bank account number. It is short for Basic Bank Account Number. Account numbers usually match the BBAN. ")
  @JsonProperty(JSON_PROPERTY_B_B_A_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBBAN() {
    return BBAN;
  }


  public void setBBAN(String BBAN) {
    this.BBAN = BBAN;
  }


  public AbstractLimitedArrangement currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The alpha-3 code (complying with ISO 4217) of the currency that qualifies the amount.
   * @return currency
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[A-Z]{3}$")  @ApiModelProperty(value = "The alpha-3 code (complying with ISO 4217) of the currency that qualifies the amount.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public AbstractLimitedArrangement externalTransferAllowed(Boolean externalTransferAllowed) {
    
    this.externalTransferAllowed = externalTransferAllowed;
    return this;
  }

   /**
   * Defines if transfer to another party is allowed.
   * @return externalTransferAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if transfer to another party is allowed.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_TRANSFER_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExternalTransferAllowed() {
    return externalTransferAllowed;
  }


  public void setExternalTransferAllowed(Boolean externalTransferAllowed) {
    this.externalTransferAllowed = externalTransferAllowed;
  }


  public AbstractLimitedArrangement urgentTransferAllowed(Boolean urgentTransferAllowed) {
    
    this.urgentTransferAllowed = urgentTransferAllowed;
    return this;
  }

   /**
   * Defines if urgent transfer is allowed.
   * @return urgentTransferAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if urgent transfer is allowed.")
  @JsonProperty(JSON_PROPERTY_URGENT_TRANSFER_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUrgentTransferAllowed() {
    return urgentTransferAllowed;
  }


  public void setUrgentTransferAllowed(Boolean urgentTransferAllowed) {
    this.urgentTransferAllowed = urgentTransferAllowed;
  }


  public AbstractLimitedArrangement number(String number) {
    
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


  public AbstractLimitedArrangement productKindName(String productKindName) {
    
    this.productKindName = productKindName;
    return this;
  }

   /**
   * The label/name that is used for the respective product kind
   * @return productKindName
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=50)  @ApiModelProperty(value = "The label/name that is used for the respective product kind")
  @JsonProperty(JSON_PROPERTY_PRODUCT_KIND_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductKindName() {
    return productKindName;
  }


  public void setProductKindName(String productKindName) {
    this.productKindName = productKindName;
  }


  public AbstractLimitedArrangement productTypeName(String productTypeName) {
    
    this.productTypeName = productTypeName;
    return this;
  }

   /**
   * The label/name that is used to label a specific product type
   * @return productTypeName
  **/
  @javax.annotation.Nullable
 @Size(max=50)  @ApiModelProperty(value = "The label/name that is used to label a specific product type")
  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductTypeName() {
    return productTypeName;
  }


  public void setProductTypeName(String productTypeName) {
    this.productTypeName = productTypeName;
  }


  public AbstractLimitedArrangement BIC(String BIC) {
    
    this.BIC = BIC;
    return this;
  }

   /**
   * Bank Identifier Code - international bank code that identifies particular banks worldwide
   * @return BIC
  **/
  @javax.annotation.Nullable
 @Size(max=11)  @ApiModelProperty(value = "Bank Identifier Code - international bank code that identifies particular banks worldwide")
  @JsonProperty(JSON_PROPERTY_B_I_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBIC() {
    return BIC;
  }


  public void setBIC(String BIC) {
    this.BIC = BIC;
  }


  public AbstractLimitedArrangement bankBranchCode(String bankBranchCode) {
    
    this.bankBranchCode = bankBranchCode;
    return this;
  }

   /**
   * A country-specific bank identification number or code: the sort code in the UK, the ACH routing number in the US, and the transit number in Canada 
   * @return bankBranchCode
  **/
  @javax.annotation.Nullable
 @Size(max=20)  @ApiModelProperty(value = "A country-specific bank identification number or code: the sort code in the UK, the ACH routing number in the US, and the transit number in Canada ")
  @JsonProperty(JSON_PROPERTY_BANK_BRANCH_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankBranchCode() {
    return bankBranchCode;
  }


  public void setBankBranchCode(String bankBranchCode) {
    this.bankBranchCode = bankBranchCode;
  }


  public AbstractLimitedArrangement creditAccount(Boolean creditAccount) {
    
    this.creditAccount = creditAccount;
    return this;
  }

   /**
   * Indicator whether or not the arrangement can be used in payment orders as credit account - account to transfer TO
   * @return creditAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator whether or not the arrangement can be used in payment orders as credit account - account to transfer TO")
  @JsonProperty(JSON_PROPERTY_CREDIT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreditAccount() {
    return creditAccount;
  }


  public void setCreditAccount(Boolean creditAccount) {
    this.creditAccount = creditAccount;
  }


  public AbstractLimitedArrangement debitAccount(Boolean debitAccount) {
    
    this.debitAccount = debitAccount;
    return this;
  }

   /**
   * Indicator whether or not the arrangement can be used in payment orders as debit account - account to transfer FROM
   * @return debitAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator whether or not the arrangement can be used in payment orders as debit account - account to transfer FROM")
  @JsonProperty(JSON_PROPERTY_DEBIT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDebitAccount() {
    return debitAccount;
  }


  public void setDebitAccount(Boolean debitAccount) {
    this.debitAccount = debitAccount;
  }


  public AbstractLimitedArrangement userPreferences(UserPreferences userPreferences) {
    
    this.userPreferences = userPreferences;
    return this;
  }

   /**
   * Get userPreferences
   * @return userPreferences
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_PREFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserPreferences getUserPreferences() {
    return userPreferences;
  }


  public void setUserPreferences(UserPreferences userPreferences) {
    this.userPreferences = userPreferences;
  }


  public AbstractLimitedArrangement financialInstitutionId(Long financialInstitutionId) {
    
    this.financialInstitutionId = financialInstitutionId;
    return this;
  }

   /**
   * Financial institution ID
   * @return financialInstitutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Financial institution ID")
  @JsonProperty(JSON_PROPERTY_FINANCIAL_INSTITUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFinancialInstitutionId() {
    return financialInstitutionId;
  }


  public void setFinancialInstitutionId(Long financialInstitutionId) {
    this.financialInstitutionId = financialInstitutionId;
  }


  public AbstractLimitedArrangement lastSyncDate(OffsetDateTime lastSyncDate) {
    
    this.lastSyncDate = lastSyncDate;
    return this;
  }

   /**
   * Last synchronization datetime
   * @return lastSyncDate
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "Last synchronization datetime")
  @JsonProperty(JSON_PROPERTY_LAST_SYNC_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastSyncDate() {
    return lastSyncDate;
  }


  public void setLastSyncDate(OffsetDateTime lastSyncDate) {
    this.lastSyncDate = lastSyncDate;
  }


  public AbstractLimitedArrangement sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @javax.annotation.Nullable
 @Size(max=11)  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractLimitedArrangement abstractLimitedArrangement = (AbstractLimitedArrangement) o;
    return Objects.equals(this.id, abstractLimitedArrangement.id) &&
        Objects.equals(this.legalEntityIds, abstractLimitedArrangement.legalEntityIds) &&
        Objects.equals(this.name, abstractLimitedArrangement.name) &&
        Objects.equals(this.bankAlias, abstractLimitedArrangement.bankAlias) &&
        Objects.equals(this.IBAN, abstractLimitedArrangement.IBAN) &&
        Objects.equals(this.BBAN, abstractLimitedArrangement.BBAN) &&
        Objects.equals(this.currency, abstractLimitedArrangement.currency) &&
        Objects.equals(this.externalTransferAllowed, abstractLimitedArrangement.externalTransferAllowed) &&
        Objects.equals(this.urgentTransferAllowed, abstractLimitedArrangement.urgentTransferAllowed) &&
        Objects.equals(this.number, abstractLimitedArrangement.number) &&
        Objects.equals(this.productKindName, abstractLimitedArrangement.productKindName) &&
        Objects.equals(this.productTypeName, abstractLimitedArrangement.productTypeName) &&
        Objects.equals(this.BIC, abstractLimitedArrangement.BIC) &&
        Objects.equals(this.bankBranchCode, abstractLimitedArrangement.bankBranchCode) &&
        Objects.equals(this.creditAccount, abstractLimitedArrangement.creditAccount) &&
        Objects.equals(this.debitAccount, abstractLimitedArrangement.debitAccount) &&
        Objects.equals(this.userPreferences, abstractLimitedArrangement.userPreferences) &&
        Objects.equals(this.financialInstitutionId, abstractLimitedArrangement.financialInstitutionId) &&
        Objects.equals(this.lastSyncDate, abstractLimitedArrangement.lastSyncDate) &&
        Objects.equals(this.sourceId, abstractLimitedArrangement.sourceId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, legalEntityIds, name, bankAlias, IBAN, BBAN, currency, externalTransferAllowed, urgentTransferAllowed, number, productKindName, productTypeName, BIC, bankBranchCode, creditAccount, debitAccount, userPreferences, financialInstitutionId, lastSyncDate, sourceId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractLimitedArrangement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    legalEntityIds: ").append(toIndentedString(legalEntityIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bankAlias: ").append(toIndentedString(bankAlias)).append("\n");
    sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
    sb.append("    BBAN: ").append(toIndentedString(BBAN)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    externalTransferAllowed: ").append(toIndentedString(externalTransferAllowed)).append("\n");
    sb.append("    urgentTransferAllowed: ").append(toIndentedString(urgentTransferAllowed)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    productKindName: ").append(toIndentedString(productKindName)).append("\n");
    sb.append("    productTypeName: ").append(toIndentedString(productTypeName)).append("\n");
    sb.append("    BIC: ").append(toIndentedString(BIC)).append("\n");
    sb.append("    bankBranchCode: ").append(toIndentedString(bankBranchCode)).append("\n");
    sb.append("    creditAccount: ").append(toIndentedString(creditAccount)).append("\n");
    sb.append("    debitAccount: ").append(toIndentedString(debitAccount)).append("\n");
    sb.append("    userPreferences: ").append(toIndentedString(userPreferences)).append("\n");
    sb.append("    financialInstitutionId: ").append(toIndentedString(financialInstitutionId)).append("\n");
    sb.append("    lastSyncDate: ").append(toIndentedString(lastSyncDate)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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

