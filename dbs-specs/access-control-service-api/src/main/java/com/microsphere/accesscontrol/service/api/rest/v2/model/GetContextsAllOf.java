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
import com.microsphere.accesscontrol.service.api.rest.v2.model.Usercontextitem;
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
 * GetContextsAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class GetContextsAllOf 
 {
    @JsonProperty("elements")
    private List<Usercontextitem> elements = null;

    @JsonProperty("totalElements")
    private  Long totalElements;


    public GetContextsAllOf elements(List<Usercontextitem> elements) {
        this.elements = elements;
        return this;
    }

    public GetContextsAllOf addElementsItem(Usercontextitem elementsItem) {
        if (this.elements == null) {
            this.elements = new ArrayList<>();
        }
        this.elements.add(elementsItem);
        return this;
    }

    /**
     * List of user contexts
     * @return elements
     */
    @ApiModelProperty(value = "List of user contexts")
    @Valid 
    public List<Usercontextitem> getElements() {
        return elements;
    }

    public void setElements(List<Usercontextitem> elements) {
        this.elements = elements;
    }


    public GetContextsAllOf totalElements(Long totalElements) {
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




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetContextsAllOf getContextsAllOf = (GetContextsAllOf) o;
        return Objects.equals(this.elements, getContextsAllOf.elements) &&
                Objects.equals(this.totalElements, getContextsAllOf.totalElements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            elements,
            totalElements
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetContextsAllOf {\n");
        
        sb.append("        elements: ").append(toIndentedString(elements)).append("\n");
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

