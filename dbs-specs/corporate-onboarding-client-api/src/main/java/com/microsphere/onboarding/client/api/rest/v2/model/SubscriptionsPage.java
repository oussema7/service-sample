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
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionResponseBody;
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
 * SubscriptionsPage
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")

public class SubscriptionsPage 
 {
    @JsonProperty("subscriptionResponseBody")
    private List<SubscriptionResponseBody> subscriptionResponseBody = new ArrayList<>();

    @JsonProperty("pageNumber")
    private  Integer pageNumber;

    @JsonProperty("currentPage")
    private  Integer currentPage;

    @JsonProperty("totalItems")
    private  Integer totalItems;

    @JsonProperty("totalPages")
    private  Integer totalPages;


    public SubscriptionsPage subscriptionResponseBody(List<SubscriptionResponseBody> subscriptionResponseBody) {
        this.subscriptionResponseBody = subscriptionResponseBody;
        return this;
    }

    public SubscriptionsPage addSubscriptionResponseBodyItem(SubscriptionResponseBody subscriptionResponseBodyItem) {
        this.subscriptionResponseBody.add(subscriptionResponseBodyItem);
        return this;
    }

    /**
     * Get subscriptionResponseBody
     * @return subscriptionResponseBody
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public List<SubscriptionResponseBody> getSubscriptionResponseBody() {
        return subscriptionResponseBody;
    }

    public void setSubscriptionResponseBody(List<SubscriptionResponseBody> subscriptionResponseBody) {
        this.subscriptionResponseBody = subscriptionResponseBody;
    }


    public SubscriptionsPage pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * Get pageNumber
     * @return pageNumber
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber( Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    public SubscriptionsPage currentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    /**
     * Get currentPage
     * @return currentPage
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage( Integer currentPage) {
        this.currentPage = currentPage;
    }


    public SubscriptionsPage totalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }

    /**
     * Get totalItems
     * @return totalItems
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems( Integer totalItems) {
        this.totalItems = totalItems;
    }


    public SubscriptionsPage totalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Get totalPages
     * @return totalPages
     */
    @ApiModelProperty(value = "")
    
    public  Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages( Integer totalPages) {
        this.totalPages = totalPages;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionsPage subscriptionsPage = (SubscriptionsPage) o;
        return Objects.equals(this.subscriptionResponseBody, subscriptionsPage.subscriptionResponseBody) &&
                Objects.equals(this.pageNumber, subscriptionsPage.pageNumber) &&
                Objects.equals(this.currentPage, subscriptionsPage.currentPage) &&
                Objects.equals(this.totalItems, subscriptionsPage.totalItems) &&
                Objects.equals(this.totalPages, subscriptionsPage.totalPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            subscriptionResponseBody,
            pageNumber,
            currentPage,
            totalItems,
            totalPages
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionsPage {\n");
        
        sb.append("        subscriptionResponseBody: ").append(toIndentedString(subscriptionResponseBody)).append("\n");
        sb.append("        pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("        currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("        totalItems: ").append(toIndentedString(totalItems)).append("\n");
        sb.append("        totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

