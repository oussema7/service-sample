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
package com.microsphere.usermanager.extension.client.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsphere.usermanager.extension.client.api.rest.v2.model.ServiceAgreementResult;
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
 * Bank bill response body.
 */
@ApiModel(description = "Bank bill response body.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:58.643479400+01:00[Africa/Tunis]")

public class ServiceAgreementsResponseBody 
 {
    @JsonProperty("ServiceAgreementResult")
    private List<ServiceAgreementResult> serviceAgreementResult = null;

    @JsonProperty("totalElements")
    private  Integer totalElements;


    public ServiceAgreementsResponseBody serviceAgreementResult(List<ServiceAgreementResult> serviceAgreementResult) {
        this.serviceAgreementResult = serviceAgreementResult;
        return this;
    }

    public ServiceAgreementsResponseBody addServiceAgreementResultItem(ServiceAgreementResult serviceAgreementResultItem) {
        if (this.serviceAgreementResult == null) {
            this.serviceAgreementResult = new ArrayList<>();
        }
        this.serviceAgreementResult.add(serviceAgreementResultItem);
        return this;
    }

    /**
     * Get serviceAgreementResult
     * @return serviceAgreementResult
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<ServiceAgreementResult> getServiceAgreementResult() {
        return serviceAgreementResult;
    }

    public void setServiceAgreementResult(List<ServiceAgreementResult> serviceAgreementResult) {
        this.serviceAgreementResult = serviceAgreementResult;
    }


    public ServiceAgreementsResponseBody totalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    /**
     * number of elements
     * @return totalElements
     */
    @ApiModelProperty(value = "number of elements")
    
    public  Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements( Integer totalElements) {
        this.totalElements = totalElements;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceAgreementsResponseBody serviceAgreementsResponseBody = (ServiceAgreementsResponseBody) o;
        return Objects.equals(this.serviceAgreementResult, serviceAgreementsResponseBody.serviceAgreementResult) &&
                Objects.equals(this.totalElements, serviceAgreementsResponseBody.totalElements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            serviceAgreementResult,
            totalElements
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceAgreementsResponseBody {\n");
        
        sb.append("        serviceAgreementResult: ").append(toIndentedString(serviceAgreementResult)).append("\n");
        sb.append("        totalElements: ").append(toIndentedString(totalElements)).append("\n");
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

