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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Card
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")

public class Card 
 {
    @JsonProperty("externalId")
    private  String externalId;

    @JsonProperty("cardGroup")
    private  String cardGroup;

    @JsonProperty("name")
    private  String name;

    @JsonProperty("price")
    private  BigDecimal price;

    @JsonProperty("type")
    private  String type;

    @JsonProperty("description")
    private  String description;

    @JsonProperty("assignablePermissionSet")
    private  String assignablePermissionSet;

    @JsonProperty("businessFunctions")
    private List<String> businessFunctions = new ArrayList<>();


    public Card externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Get externalId
     * @return externalId
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getExternalId() {
        return externalId;
    }

    public void setExternalId( String externalId) {
        this.externalId = externalId;
    }


    public Card cardGroup(String cardGroup) {
        this.cardGroup = cardGroup;
        return this;
    }

    /**
     * Get cardGroup
     * @return cardGroup
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getCardGroup() {
        return cardGroup;
    }

    public void setCardGroup( String cardGroup) {
        this.cardGroup = cardGroup;
    }


    public Card name(String name) {
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


    public Card price(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     * @return price
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  BigDecimal getPrice() {
        return price;
    }

    public void setPrice( BigDecimal price) {
        this.price = price;
    }


    public Card type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getType() {
        return type;
    }

    public void setType( String type) {
        this.type = type;
    }


    public Card description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getDescription() {
        return description;
    }

    public void setDescription( String description) {
        this.description = description;
    }


    public Card assignablePermissionSet(String assignablePermissionSet) {
        this.assignablePermissionSet = assignablePermissionSet;
        return this;
    }

    /**
     * Get assignablePermissionSet
     * @return assignablePermissionSet
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getAssignablePermissionSet() {
        return assignablePermissionSet;
    }

    public void setAssignablePermissionSet( String assignablePermissionSet) {
        this.assignablePermissionSet = assignablePermissionSet;
    }


    public Card businessFunctions(List<String> businessFunctions) {
        this.businessFunctions = businessFunctions;
        return this;
    }

    public Card addBusinessFunctionsItem(String businessFunctionsItem) {
        this.businessFunctions.add(businessFunctionsItem);
        return this;
    }

    /**
     * list of business functions.
     * @return businessFunctions
     */
    @ApiModelProperty(required = true, value = "list of business functions.")
    @NotNull 
    public List<String> getBusinessFunctions() {
        return businessFunctions;
    }

    public void setBusinessFunctions(List<String> businessFunctions) {
        this.businessFunctions = businessFunctions;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Card card = (Card) o;
        return Objects.equals(this.externalId, card.externalId) &&
                Objects.equals(this.cardGroup, card.cardGroup) &&
                Objects.equals(this.name, card.name) &&
                Objects.equals(this.price, card.price) &&
                Objects.equals(this.type, card.type) &&
                Objects.equals(this.description, card.description) &&
                Objects.equals(this.assignablePermissionSet, card.assignablePermissionSet) &&
                Objects.equals(this.businessFunctions, card.businessFunctions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            externalId,
            cardGroup,
            name,
            price,
            type,
            description,
            assignablePermissionSet,
            businessFunctions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Card {\n");
        
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        cardGroup: ").append(toIndentedString(cardGroup)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        price: ").append(toIndentedString(price)).append("\n");
        sb.append("        type: ").append(toIndentedString(type)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        assignablePermissionSet: ").append(toIndentedString(assignablePermissionSet)).append("\n");
        sb.append("        businessFunctions: ").append(toIndentedString(businessFunctions)).append("\n");
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

