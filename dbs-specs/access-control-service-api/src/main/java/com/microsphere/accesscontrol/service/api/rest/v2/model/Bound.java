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
package com.microsphere.accesscontrol.service.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Bound
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class Bound 
 {
    @JsonProperty("amount")
    private @DecimalMin("0")  BigDecimal amount;

    @JsonProperty("currencyCode")
    private @Pattern(regexp="^[A-Z]{3}$")  String currencyCode;


    public Bound amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * The amount in the specified currency
     * minimum: 0
     * @return amount
     */
    @ApiModelProperty(example = "42.23", required = true, value = "The amount in the specified currency")
    @NotNull @Valid @DecimalMin("0") 
    public @DecimalMin("0")  BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(@DecimalMin("0")  BigDecimal amount) {
        this.amount = amount;
    }


    public Bound currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * The alpha-3 code (complying with ISO 4217) of the currency that qualifies the amount
     * @return currencyCode
     */
    @ApiModelProperty(example = "EUR", required = true, value = "The alpha-3 code (complying with ISO 4217) of the currency that qualifies the amount")
    @NotNull @Pattern(regexp="^[A-Z]{3}$") 
    public @Pattern(regexp="^[A-Z]{3}$")  String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(@Pattern(regexp="^[A-Z]{3}$")  String currencyCode) {
        this.currencyCode = currencyCode;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bound bound = (Bound) o;
        return Objects.equals(this.amount, bound.amount) &&
                Objects.equals(this.currencyCode, bound.currencyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            currencyCode
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Bound {\n");
        
        sb.append("        amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("        currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

