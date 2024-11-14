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
 * AccountArrangementItemPut
 */
@JsonPropertyOrder({
  AccountArrangementItemPut.JSON_PROPERTY_EXTERNAL_ARRANGEMENT_ID,
  AccountArrangementItemPut.JSON_PROPERTY_PRODUCT_ID
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
public  class AccountArrangementItemPut extends AccountArrangementItemBase {
  public static final String JSON_PROPERTY_EXTERNAL_ARRANGEMENT_ID = "externalArrangementId";
  private String externalArrangementId;

  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  private String productId;


  public AccountArrangementItemPut externalArrangementId(String externalArrangementId) {
    
    this.externalArrangementId = externalArrangementId;
    return this;
  }

   /**
   * A unique external identifier for the arrangement
   * @return externalArrangementId
  **/
  @NotNull
 @Size(min=1,max=50)  @ApiModelProperty(required = true, value = "A unique external identifier for the arrangement")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ARRANGEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalArrangementId() {
    return externalArrangementId;
  }


  public void setExternalArrangementId(String externalArrangementId) {
    this.externalArrangementId = externalArrangementId;
  }


  public AccountArrangementItemPut productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Reference to the product of which the arrangement is an instantiation. This is an external product id
   * @return productId
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=50)  @ApiModelProperty(value = "Reference to the product of which the arrangement is an instantiation. This is an external product id")
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountArrangementItemPut accountArrangementItemPut = (AccountArrangementItemPut) o;
    return Objects.equals(this.externalArrangementId, accountArrangementItemPut.externalArrangementId) &&
        Objects.equals(this.productId, accountArrangementItemPut.productId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalArrangementId, productId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountArrangementItemPut {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    externalArrangementId: ").append(toIndentedString(externalArrangementId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
