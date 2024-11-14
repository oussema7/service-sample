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
import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementItemBase;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountPresentationProductItem;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountUserPreferencesItem;
import com.microsphere.arrangement.service.api.listener.v2.model.StateItem;
import com.microsphere.arrangement.service.api.listener.v2.model.Subscription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * AccountArrangementItem
 */
@JsonPropertyOrder({
  AccountArrangementItem.JSON_PROPERTY_ID,
  AccountArrangementItem.JSON_PROPERTY_PRODUCT_KIND_NAME,
  AccountArrangementItem.JSON_PROPERTY_VISIBLE,
  AccountArrangementItem.JSON_PROPERTY_LEGAL_ENTITY_IDS,
  AccountArrangementItem.JSON_PROPERTY_PRODUCT_ID,
  AccountArrangementItem.JSON_PROPERTY_PRODUCT_TYPE_NAME,
  AccountArrangementItem.JSON_PROPERTY_EXTERNAL_LEGAL_ENTITY_ID,
  AccountArrangementItem.JSON_PROPERTY_EXTERNAL_PRODUCT_ID,
  AccountArrangementItem.JSON_PROPERTY_EXTERNAL_ARRANGEMENT_ID,
  AccountArrangementItem.JSON_PROPERTY_USER_PREFERENCES,
  AccountArrangementItem.JSON_PROPERTY_PRODUCT,
  AccountArrangementItem.JSON_PROPERTY_STATE,
  AccountArrangementItem.JSON_PROPERTY_PARENT_ID,
  AccountArrangementItem.JSON_PROPERTY_SUBSCRIPTIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
public  class AccountArrangementItem extends AccountArrangementItemBase {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PRODUCT_KIND_NAME = "productKindName";
  private String productKindName;

  public static final String JSON_PROPERTY_VISIBLE = "visible";
  private Boolean visible;

  public static final String JSON_PROPERTY_LEGAL_ENTITY_IDS = "legalEntityIds";
  private List<String> legalEntityIds = null;

  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  private String productId;

  public static final String JSON_PROPERTY_PRODUCT_TYPE_NAME = "productTypeName";
  private String productTypeName;

  public static final String JSON_PROPERTY_EXTERNAL_LEGAL_ENTITY_ID = "externalLegalEntityId";
  private String externalLegalEntityId;

  public static final String JSON_PROPERTY_EXTERNAL_PRODUCT_ID = "externalProductId";
  private String externalProductId;

  public static final String JSON_PROPERTY_EXTERNAL_ARRANGEMENT_ID = "externalArrangementId";
  private String externalArrangementId;

  public static final String JSON_PROPERTY_USER_PREFERENCES = "userPreferences";
  private AccountUserPreferencesItem userPreferences;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private AccountPresentationProductItem product;

  public static final String JSON_PROPERTY_STATE = "state";
  private StateItem state;

  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  private String parentId;

  public static final String JSON_PROPERTY_SUBSCRIPTIONS = "subscriptions";
  private List<Subscription> subscriptions = null;


  public AccountArrangementItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the Arrangement object that is generated and used Internally in DBS
   * @return id
  **/
  @NotNull
 @Size(max=36)  @ApiModelProperty(required = true, value = "A unique identifier for the Arrangement object that is generated and used Internally in DBS")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AccountArrangementItem productKindName(String productKindName) {
    
    this.productKindName = productKindName;
    return this;
  }

   /**
   * The label/name that is used for the respective product kind ex. Current Account, Savings Account
   * @return productKindName
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=50)  @ApiModelProperty(value = "The label/name that is used for the respective product kind ex. Current Account, Savings Account")
  @JsonProperty(JSON_PROPERTY_PRODUCT_KIND_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductKindName() {
    return productKindName;
  }


  public void setProductKindName(String productKindName) {
    this.productKindName = productKindName;
  }


  public AccountArrangementItem visible(Boolean visible) {
    
    this.visible = visible;
    return this;
  }

   /**
   * DEPRECATED 2.12.2 AND REPLACED BY &#x60;userPreferences.visible&#x60;. Indicator whether to show or hide the arrangement on the widget
   * @return visible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DEPRECATED 2.12.2 AND REPLACED BY `userPreferences.visible`. Indicator whether to show or hide the arrangement on the widget")
  @JsonProperty(JSON_PROPERTY_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVisible() {
    return visible;
  }


  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  public AccountArrangementItem legalEntityIds(List<String> legalEntityIds) {
    
    this.legalEntityIds = legalEntityIds;
    return this;
  }

  public AccountArrangementItem addLegalEntityIdsItem(String legalEntityIdsItem) {
    if (this.legalEntityIds == null) {
      this.legalEntityIds = new ArrayList<>();
    }
    this.legalEntityIds.add(legalEntityIdsItem);
    return this;
  }

   /**
   * References to the internal legal entities that own the arrangement.
   * @return legalEntityIds
  **/
  @javax.annotation.Nullable
 @Size(min=1)  @ApiModelProperty(value = "References to the internal legal entities that own the arrangement.")
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLegalEntityIds() {
    return legalEntityIds;
  }


  public void setLegalEntityIds(List<String> legalEntityIds) {
    this.legalEntityIds = legalEntityIds;
  }


  public AccountArrangementItem productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Reference to the product of which the arrangement is an instantiation.
   * @return productId
  **/
  @NotNull
 @Size(max=36)  @ApiModelProperty(required = true, value = "Reference to the product of which the arrangement is an instantiation.")
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  public AccountArrangementItem productTypeName(String productTypeName) {
    
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


  public AccountArrangementItem externalLegalEntityId(String externalLegalEntityId) {
    
    this.externalLegalEntityId = externalLegalEntityId;
    return this;
  }

   /**
   * A unique identifier for the legal entity for which the arrangement is assigned to (this property is being deprecated and its being replaced by legalEntityIds).
   * @return externalLegalEntityId
  **/
  @javax.annotation.Nullable
 @Size(max=64)  @ApiModelProperty(value = "A unique identifier for the legal entity for which the arrangement is assigned to (this property is being deprecated and its being replaced by legalEntityIds).")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_LEGAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalLegalEntityId() {
    return externalLegalEntityId;
  }


  public void setExternalLegalEntityId(String externalLegalEntityId) {
    this.externalLegalEntityId = externalLegalEntityId;
  }


  public AccountArrangementItem externalProductId(String externalProductId) {
    
    this.externalProductId = externalProductId;
    return this;
  }

   /**
   * A unique identifier for the product that the arrangement applies to
   * @return externalProductId
  **/
  @javax.annotation.Nullable
 @Size(max=50)  @ApiModelProperty(value = "A unique identifier for the product that the arrangement applies to")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalProductId() {
    return externalProductId;
  }


  public void setExternalProductId(String externalProductId) {
    this.externalProductId = externalProductId;
  }


  public AccountArrangementItem externalArrangementId(String externalArrangementId) {
    
    this.externalArrangementId = externalArrangementId;
    return this;
  }

   /**
   * A unique external identifier for the arrangement
   * @return externalArrangementId
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=50)  @ApiModelProperty(value = "A unique external identifier for the arrangement")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ARRANGEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalArrangementId() {
    return externalArrangementId;
  }


  public void setExternalArrangementId(String externalArrangementId) {
    this.externalArrangementId = externalArrangementId;
  }


  public AccountArrangementItem userPreferences(AccountUserPreferencesItem userPreferences) {
    
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

  public AccountUserPreferencesItem getUserPreferences() {
    return userPreferences;
  }


  public void setUserPreferences(AccountUserPreferencesItem userPreferences) {
    this.userPreferences = userPreferences;
  }


  public AccountArrangementItem product(AccountPresentationProductItem product) {
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountPresentationProductItem getProduct() {
    return product;
  }


  public void setProduct(AccountPresentationProductItem product) {
    this.product = product;
  }


  public AccountArrangementItem state(StateItem state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateItem getState() {
    return state;
  }


  public void setState(StateItem state) {
    this.state = state;
  }


  public AccountArrangementItem parentId(String parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Indicate if the account has parent child relationship with another account
   * @return parentId
  **/
  @javax.annotation.Nullable
 @Size(max=36)  @ApiModelProperty(value = "Indicate if the account has parent child relationship with another account")
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentId() {
    return parentId;
  }


  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public AccountArrangementItem subscriptions(List<Subscription> subscriptions) {
    
    this.subscriptions = subscriptions;
    return this;
  }

  public AccountArrangementItem addSubscriptionsItem(Subscription subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Subscription> getSubscriptions() {
    return subscriptions;
  }


  public void setSubscriptions(List<Subscription> subscriptions) {
    this.subscriptions = subscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountArrangementItem accountArrangementItem = (AccountArrangementItem) o;
    return Objects.equals(this.id, accountArrangementItem.id) &&
        Objects.equals(this.productKindName, accountArrangementItem.productKindName) &&
        Objects.equals(this.visible, accountArrangementItem.visible) &&
        Objects.equals(this.legalEntityIds, accountArrangementItem.legalEntityIds) &&
        Objects.equals(this.productId, accountArrangementItem.productId) &&
        Objects.equals(this.productTypeName, accountArrangementItem.productTypeName) &&
        Objects.equals(this.externalLegalEntityId, accountArrangementItem.externalLegalEntityId) &&
        Objects.equals(this.externalProductId, accountArrangementItem.externalProductId) &&
        Objects.equals(this.externalArrangementId, accountArrangementItem.externalArrangementId) &&
        Objects.equals(this.userPreferences, accountArrangementItem.userPreferences) &&
        Objects.equals(this.product, accountArrangementItem.product) &&
        Objects.equals(this.state, accountArrangementItem.state) &&
        Objects.equals(this.parentId, accountArrangementItem.parentId) &&
        Objects.equals(this.subscriptions, accountArrangementItem.subscriptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productKindName, visible, legalEntityIds, productId, productTypeName, externalLegalEntityId, externalProductId, externalArrangementId, userPreferences, product, state, parentId, subscriptions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountArrangementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productKindName: ").append(toIndentedString(productKindName)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    legalEntityIds: ").append(toIndentedString(legalEntityIds)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productTypeName: ").append(toIndentedString(productTypeName)).append("\n");
    sb.append("    externalLegalEntityId: ").append(toIndentedString(externalLegalEntityId)).append("\n");
    sb.append("    externalProductId: ").append(toIndentedString(externalProductId)).append("\n");
    sb.append("    externalArrangementId: ").append(toIndentedString(externalArrangementId)).append("\n");
    sb.append("    userPreferences: ").append(toIndentedString(userPreferences)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
