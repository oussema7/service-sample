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
package com.microsphere.approval.service.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Currency
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class Currency 
 {
    @JsonProperty("amount")
    private @DecimalMin("-1.0E+18") @DecimalMax("1.0E+18")  String amount;

    @JsonProperty("currencyCode")
    private @Pattern(regexp="^[A-Z]{3}$")  String currencyCode;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public Currency amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * The amount in the specified currency
     * minimum: -1.0E+18
     * maximum: 1.0E+18
     * @return amount
     */
    @ApiModelProperty(required = true, value = "The amount in the specified currency")
    @NotNull @DecimalMin("-1.0E+18") @DecimalMax("1.0E+18") 
    public @DecimalMin("-1.0E+18") @DecimalMax("1.0E+18")  String getAmount() {
        return amount;
    }

    public void setAmount(@DecimalMin("-1.0E+18") @DecimalMax("1.0E+18")  String amount) {
        this.amount = amount;
    }


    public Currency currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * The alpha-3 code (complying with ISO 4217) of the currency that qualifies the amount
     * @return currencyCode
     */
    @ApiModelProperty(required = true, value = "The alpha-3 code (complying with ISO 4217) of the currency that qualifies the amount")
    @NotNull @Pattern(regexp="^[A-Z]{3}$") 
    public @Pattern(regexp="^[A-Z]{3}$")  String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(@Pattern(regexp="^[A-Z]{3}$")  String currencyCode) {
        this.currencyCode = currencyCode;
    }


    public Currency additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public Currency putAdditionsItem(String key, String additionsItem) {
        if (this.additions == null) {
            this.additions = new HashMap<>();
        }
        this.additions.put(key, additionsItem);
        return this;
    }

    /**
     * Additional properties
     * @return additions
     */
    @ApiModelProperty(value = "Additional properties")
    
    public Map<String, String> getAdditions() {
        return additions;
    }

    public void setAdditions(Map<String, String> additions) {
        this.additions = additions;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Currency currency = (Currency) o;
        return Objects.equals(this.amount, currency.amount) &&
                Objects.equals(this.currencyCode, currency.currencyCode) &&
                Objects.equals(this.additions, currency.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            currencyCode,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Currency {\n");
        
        sb.append("        amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("        currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

