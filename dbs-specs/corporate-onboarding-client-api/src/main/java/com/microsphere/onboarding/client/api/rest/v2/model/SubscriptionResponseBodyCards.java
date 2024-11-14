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
 * SubscriptionResponseBodyCards
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")

public class SubscriptionResponseBodyCards 
 {
    @JsonProperty("externalId")
    private  String externalId;

    @JsonProperty("nameEn")
    private  String nameEn;

    @JsonProperty("nameFr")
    private  String nameFr;


    public SubscriptionResponseBodyCards externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Get externalId
     * @return externalId
     */
    @ApiModelProperty(value = "")
    
    public  String getExternalId() {
        return externalId;
    }

    public void setExternalId( String externalId) {
        this.externalId = externalId;
    }


    public SubscriptionResponseBodyCards nameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * Get nameEn
     * @return nameEn
     */
    @ApiModelProperty(value = "")
    
    public  String getNameEn() {
        return nameEn;
    }

    public void setNameEn( String nameEn) {
        this.nameEn = nameEn;
    }


    public SubscriptionResponseBodyCards nameFr(String nameFr) {
        this.nameFr = nameFr;
        return this;
    }

    /**
     * Get nameFr
     * @return nameFr
     */
    @ApiModelProperty(value = "")
    
    public  String getNameFr() {
        return nameFr;
    }

    public void setNameFr( String nameFr) {
        this.nameFr = nameFr;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionResponseBodyCards subscriptionResponseBodyCards = (SubscriptionResponseBodyCards) o;
        return Objects.equals(this.externalId, subscriptionResponseBodyCards.externalId) &&
                Objects.equals(this.nameEn, subscriptionResponseBodyCards.nameEn) &&
                Objects.equals(this.nameFr, subscriptionResponseBodyCards.nameFr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            externalId,
            nameEn,
            nameFr
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionResponseBodyCards {\n");
        
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("        nameFr: ").append(toIndentedString(nameFr)).append("\n");
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

