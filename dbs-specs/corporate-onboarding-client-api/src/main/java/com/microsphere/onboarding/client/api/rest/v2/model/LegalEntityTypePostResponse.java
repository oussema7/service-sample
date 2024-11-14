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
import com.microsphere.onboarding.client.api.rest.v2.model.AccountDetail;
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
 * Get legal entity request
 */
@ApiModel(description = "Get legal entity request")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")

public class LegalEntityTypePostResponse 
 {
    @JsonProperty("externalId")
    private  String externalId;

    @JsonProperty("name")
    private  String name;

    @JsonProperty("accountList")
    private List<AccountDetail> accountList = new ArrayList<>();

    @JsonProperty("subscriptionRescinded")
    private  Boolean subscriptionRescinded;


    public LegalEntityTypePostResponse externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Identifier
     * @return externalId
     */
    @ApiModelProperty(required = true, value = "Identifier")
    @NotNull 
    public  String getExternalId() {
        return externalId;
    }

    public void setExternalId( String externalId) {
        this.externalId = externalId;
    }


    public LegalEntityTypePostResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Identifier
     * @return name
     */
    @ApiModelProperty(required = true, value = "Identifier")
    @NotNull 
    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }


    public LegalEntityTypePostResponse accountList(List<AccountDetail> accountList) {
        this.accountList = accountList;
        return this;
    }

    public LegalEntityTypePostResponse addAccountListItem(AccountDetail accountListItem) {
        this.accountList.add(accountListItem);
        return this;
    }

    /**
     * Get accountList
     * @return accountList
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public List<AccountDetail> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<AccountDetail> accountList) {
        this.accountList = accountList;
    }


    public LegalEntityTypePostResponse subscriptionRescinded(Boolean subscriptionRescinded) {
        this.subscriptionRescinded = subscriptionRescinded;
        return this;
    }

    /**
     * Get subscriptionRescinded
     * @return subscriptionRescinded
     */
    @ApiModelProperty(value = "")
    
    public  Boolean getSubscriptionRescinded() {
        return subscriptionRescinded;
    }

    public void setSubscriptionRescinded( Boolean subscriptionRescinded) {
        this.subscriptionRescinded = subscriptionRescinded;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LegalEntityTypePostResponse legalEntityTypePostResponse = (LegalEntityTypePostResponse) o;
        return Objects.equals(this.externalId, legalEntityTypePostResponse.externalId) &&
                Objects.equals(this.name, legalEntityTypePostResponse.name) &&
                Objects.equals(this.accountList, legalEntityTypePostResponse.accountList) &&
                Objects.equals(this.subscriptionRescinded, legalEntityTypePostResponse.subscriptionRescinded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            externalId,
            name,
            accountList,
            subscriptionRescinded
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LegalEntityTypePostResponse {\n");
        
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        accountList: ").append(toIndentedString(accountList)).append("\n");
        sb.append("        subscriptionRescinded: ").append(toIndentedString(subscriptionRescinded)).append("\n");
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

