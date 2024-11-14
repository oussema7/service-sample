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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * CreateChildArrangement
 */
@JsonPropertyOrder({
  CreateChildArrangement.JSON_PROPERTY_NAME,
  CreateChildArrangement.JSON_PROPERTY_CURRENCY,
  CreateChildArrangement.JSON_PROPERTY_MATURITY_DATE,
  CreateChildArrangement.JSON_PROPERTY_MATURITY_AMOUNT,
  CreateChildArrangement.JSON_PROPERTY_PRODUCT_ID
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
public  class CreateChildArrangement extends AdditionalProperties {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_MATURITY_DATE = "maturityDate";
  private OffsetDateTime maturityDate;

  public static final String JSON_PROPERTY_MATURITY_AMOUNT = "maturityAmount";
  private BigDecimal maturityAmount;

  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  private String productId;


  public CreateChildArrangement name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name that can be assigned by the bank to label an arrangement
   * @return name
  **/
  @NotNull
 @Size(min=1,max=50)  @ApiModelProperty(required = true, value = "The name that can be assigned by the bank to label an arrangement")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateChildArrangement currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The alpha-3 code (complying with ISO 4217) of the currency that qualifies the amount.
   * @return currency
  **/
  @NotNull
 @Pattern(regexp="^[A-Z]{3}$")  @ApiModelProperty(required = true, value = "The alpha-3 code (complying with ISO 4217) of the currency that qualifies the amount.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CreateChildArrangement maturityDate(OffsetDateTime maturityDate) {
    
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * End term of a holding period
   * @return maturityDate
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "End term of a holding period")
  @JsonProperty(JSON_PROPERTY_MATURITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }


  public void setMaturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
  }


  public CreateChildArrangement maturityAmount(BigDecimal maturityAmount) {
    
    this.maturityAmount = maturityAmount;
    return this;
  }

   /**
   * Amount payable at the end of a holding period of a product (maturity date). For deposit all of the interest is usualy paid at maturity date (IF the term is shorter then one year).
   * minimum: -1.0E+18
   * maximum: 1.0E+18
   * @return maturityAmount
  **/
  @javax.annotation.Nullable
  @Valid
 @DecimalMin(value="-1.0E+18",inclusive=false) @DecimalMax(value="1.0E+18",inclusive=false)  @ApiModelProperty(value = "Amount payable at the end of a holding period of a product (maturity date). For deposit all of the interest is usualy paid at maturity date (IF the term is shorter then one year).")
  @JsonProperty(JSON_PROPERTY_MATURITY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMaturityAmount() {
    return maturityAmount;
  }


  public void setMaturityAmount(BigDecimal maturityAmount) {
    this.maturityAmount = maturityAmount;
  }


  public CreateChildArrangement productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Reference to the product of which the arrangement is an instantiation. This is the internal id.
   * @return productId
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=36)  @ApiModelProperty(value = "Reference to the product of which the arrangement is an instantiation. This is the internal id.")
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
    CreateChildArrangement createChildArrangement = (CreateChildArrangement) o;
    return Objects.equals(this.name, createChildArrangement.name) &&
        Objects.equals(this.currency, createChildArrangement.currency) &&
        Objects.equals(this.maturityDate, createChildArrangement.maturityDate) &&
        Objects.equals(this.maturityAmount, createChildArrangement.maturityAmount) &&
        Objects.equals(this.productId, createChildArrangement.productId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, currency, maturityDate, maturityAmount, productId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChildArrangement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    maturityAmount: ").append(toIndentedString(maturityAmount)).append("\n");
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
