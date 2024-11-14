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
import com.microsphere.onboarding.client.api.rest.v2.model.Card;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * CommercialCardResponseGet
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")

public class CommercialCardResponseGet 
 {
    @JsonProperty("cards")
    private List<Card> cards = new ArrayList<>();


    public CommercialCardResponseGet cards(List<Card> cards) {
        this.cards = cards;
        return this;
    }

    public CommercialCardResponseGet addCardsItem(Card cardsItem) {
        this.cards.add(cardsItem);
        return this;
    }

    /**
     * list of commercial-cards.
     * @return cards
     */
    @ApiModelProperty(required = true, value = "list of commercial-cards.")
    @NotNull @Valid @Size(min=1, max=100) 
    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommercialCardResponseGet commercialCardResponseGet = (CommercialCardResponseGet) o;
        return Objects.equals(this.cards, commercialCardResponseGet.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            cards
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommercialCardResponseGet {\n");
        
        sb.append("        cards: ").append(toIndentedString(cards)).append("\n");
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

