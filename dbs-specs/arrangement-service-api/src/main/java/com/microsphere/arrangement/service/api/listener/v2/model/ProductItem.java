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
import com.microsphere.arrangement.service.api.listener.v2.model.SummaryProductKindItem;
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
 * ProductItem
 */
@JsonPropertyOrder({
  ProductItem.JSON_PROPERTY_EXTERNAL_ID,
  ProductItem.JSON_PROPERTY_EXTERNAL_TYPE_ID,
  ProductItem.JSON_PROPERTY_TYPE_NAME,
  ProductItem.JSON_PROPERTY_PRODUCT_KIND
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
public  class ProductItem extends AdditionalProperties {
  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_EXTERNAL_TYPE_ID = "externalTypeId";
  private String externalTypeId;

  public static final String JSON_PROPERTY_TYPE_NAME = "typeName";
  private String typeName;

  public static final String JSON_PROPERTY_PRODUCT_KIND = "productKind";
  private SummaryProductKindItem productKind;


  public ProductItem externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * A unique identifier for the product that the arrangement applies to 
   * @return externalId
  **/
  @javax.annotation.Nullable
 @Size(max=50)  @ApiModelProperty(value = "A unique identifier for the product that the arrangement applies to ")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public ProductItem externalTypeId(String externalTypeId) {
    
    this.externalTypeId = externalTypeId;
    return this;
  }

   /**
   * The ID that is used by the Bank to identify the specific Product type - External reference to the product Type.
   * @return externalTypeId
  **/
  @javax.annotation.Nullable
 @Size(max=50)  @ApiModelProperty(value = "The ID that is used by the Bank to identify the specific Product type - External reference to the product Type.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalTypeId() {
    return externalTypeId;
  }


  public void setExternalTypeId(String externalTypeId) {
    this.externalTypeId = externalTypeId;
  }


  public ProductItem typeName(String typeName) {
    
    this.typeName = typeName;
    return this;
  }

   /**
   * The label/name that is used to label a specific product type.
   * @return typeName
  **/
  @javax.annotation.Nullable
 @Size(max=50)  @ApiModelProperty(value = "The label/name that is used to label a specific product type.")
  @JsonProperty(JSON_PROPERTY_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypeName() {
    return typeName;
  }


  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public ProductItem productKind(SummaryProductKindItem productKind) {
    
    this.productKind = productKind;
    return this;
  }

   /**
   * Get productKind
   * @return productKind
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SummaryProductKindItem getProductKind() {
    return productKind;
  }


  public void setProductKind(SummaryProductKindItem productKind) {
    this.productKind = productKind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductItem productItem = (ProductItem) o;
    return Objects.equals(this.externalId, productItem.externalId) &&
        Objects.equals(this.externalTypeId, productItem.externalTypeId) &&
        Objects.equals(this.typeName, productItem.typeName) &&
        Objects.equals(this.productKind, productItem.productKind) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, externalTypeId, typeName, productKind, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalTypeId: ").append(toIndentedString(externalTypeId)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    productKind: ").append(toIndentedString(productKind)).append("\n");
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

