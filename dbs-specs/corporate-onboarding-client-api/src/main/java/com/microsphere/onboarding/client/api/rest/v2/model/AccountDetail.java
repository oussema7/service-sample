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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * AccountDetail
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")

public class AccountDetail 
 {
    @JsonProperty("name")
    private  String name;

    @JsonProperty("number")
    private  String number;

    @JsonProperty("ctosNumber")
    private  String ctosNumber;


    public AccountDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }


    public AccountDetail number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     * @return number
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getNumber() {
        return number;
    }

    public void setNumber( String number) {
        this.number = number;
    }


    public AccountDetail ctosNumber(String ctosNumber) {
        this.ctosNumber = ctosNumber;
        return this;
    }

    /**
     * Get ctosNumber
     * @return ctosNumber
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getCtosNumber() {
        return ctosNumber;
    }

    public void setCtosNumber( String ctosNumber) {
        this.ctosNumber = ctosNumber;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountDetail accountDetail = (AccountDetail) o;
        return Objects.equals(this.name, accountDetail.name) &&
                Objects.equals(this.number, accountDetail.number) &&
                Objects.equals(this.ctosNumber, accountDetail.ctosNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            number,
            ctosNumber
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountDetail {\n");
        
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        number: ").append(toIndentedString(number)).append("\n");
        sb.append("        ctosNumber: ").append(toIndentedString(ctosNumber)).append("\n");
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

