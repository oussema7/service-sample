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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistenceServiceAgreement;
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
 * ListServiceAgreementsAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ListServiceAgreementsAllOf 
 {
    @JsonProperty("totalElements")
    private  Long totalElements;

    @JsonProperty("serviceAgreements")
    private List<PersistenceServiceAgreement> serviceAgreements = null;


    public ListServiceAgreementsAllOf totalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    /**
     * total number of elements matching the query
     * @return totalElements
     */
    @ApiModelProperty(value = "total number of elements matching the query")
    
    public  Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements( Long totalElements) {
        this.totalElements = totalElements;
    }


    public ListServiceAgreementsAllOf serviceAgreements(List<PersistenceServiceAgreement> serviceAgreements) {
        this.serviceAgreements = serviceAgreements;
        return this;
    }

    public ListServiceAgreementsAllOf addServiceAgreementsItem(PersistenceServiceAgreement serviceAgreementsItem) {
        if (this.serviceAgreements == null) {
            this.serviceAgreements = new ArrayList<>();
        }
        this.serviceAgreements.add(serviceAgreementsItem);
        return this;
    }

    /**
     * Get serviceAgreements
     * @return serviceAgreements
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<PersistenceServiceAgreement> getServiceAgreements() {
        return serviceAgreements;
    }

    public void setServiceAgreements(List<PersistenceServiceAgreement> serviceAgreements) {
        this.serviceAgreements = serviceAgreements;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServiceAgreementsAllOf listServiceAgreementsAllOf = (ListServiceAgreementsAllOf) o;
        return Objects.equals(this.totalElements, listServiceAgreementsAllOf.totalElements) &&
                Objects.equals(this.serviceAgreements, listServiceAgreementsAllOf.serviceAgreements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            totalElements,
            serviceAgreements
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServiceAgreementsAllOf {\n");
        
        sb.append("        totalElements: ").append(toIndentedString(totalElements)).append("\n");
        sb.append("        serviceAgreements: ").append(toIndentedString(serviceAgreements)).append("\n");
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

