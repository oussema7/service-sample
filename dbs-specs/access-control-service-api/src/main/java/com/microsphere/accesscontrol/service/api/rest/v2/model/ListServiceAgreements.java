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
import com.microsphere.accesscontrol.service.api.rest.v2.model.AdditionalPropertiesAware;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ListServiceAgreementsAllOf;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistenceServiceAgreement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * List of service agreements
 */
@ApiModel(description = "List of service agreements")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ListServiceAgreements 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("totalElements")
    private  Long totalElements;

    @JsonProperty("serviceAgreements")
    private List<PersistenceServiceAgreement> serviceAgreements = new ArrayList<>();


    public ListServiceAgreements additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public ListServiceAgreements putAdditionsItem(String key, String additionsItem) {
        if (this.additions == null) {
            this.additions = new HashMap<>();
        }
        this.additions.put(key, additionsItem);
        return this;
    }

    /**
     * Get additions
     * @return additions
     */
    @ApiModelProperty(value = "")
    
    public Map<String, String> getAdditions() {
        return additions;
    }

    public void setAdditions(Map<String, String> additions) {
        this.additions = additions;
    }


    public ListServiceAgreements totalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    /**
     * total number of elements matching the query
     * @return totalElements
     */
    @ApiModelProperty(required = true, value = "total number of elements matching the query")
    @NotNull 
    public  Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements( Long totalElements) {
        this.totalElements = totalElements;
    }


    public ListServiceAgreements serviceAgreements(List<PersistenceServiceAgreement> serviceAgreements) {
        this.serviceAgreements = serviceAgreements;
        return this;
    }

    public ListServiceAgreements addServiceAgreementsItem(PersistenceServiceAgreement serviceAgreementsItem) {
        this.serviceAgreements.add(serviceAgreementsItem);
        return this;
    }

    /**
     * Get serviceAgreements
     * @return serviceAgreements
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
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
        ListServiceAgreements listServiceAgreements = (ListServiceAgreements) o;
        return Objects.equals(this.additions, listServiceAgreements.additions) &&
                Objects.equals(this.totalElements, listServiceAgreements.totalElements) &&
                Objects.equals(this.serviceAgreements, listServiceAgreements.serviceAgreements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            totalElements,
            serviceAgreements
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServiceAgreements {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

