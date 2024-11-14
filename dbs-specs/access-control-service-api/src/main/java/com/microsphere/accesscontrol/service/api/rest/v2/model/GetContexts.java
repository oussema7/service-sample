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
import com.microsphere.accesscontrol.service.api.rest.v2.model.GetContextsAllOf;
import com.microsphere.accesscontrol.service.api.rest.v2.model.Usercontextitem;
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
 * GetContexts
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class GetContexts 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("elements")
    private List<Usercontextitem> elements = new ArrayList<>();

    @JsonProperty("totalElements")
    private  Long totalElements;


    public GetContexts additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public GetContexts putAdditionsItem(String key, String additionsItem) {
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


    public GetContexts elements(List<Usercontextitem> elements) {
        this.elements = elements;
        return this;
    }

    public GetContexts addElementsItem(Usercontextitem elementsItem) {
        this.elements.add(elementsItem);
        return this;
    }

    /**
     * List of user contexts
     * @return elements
     */
    @ApiModelProperty(required = true, value = "List of user contexts")
    @NotNull @Valid 
    public List<Usercontextitem> getElements() {
        return elements;
    }

    public void setElements(List<Usercontextitem> elements) {
        this.elements = elements;
    }


    public GetContexts totalElements(Long totalElements) {
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




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetContexts getContexts = (GetContexts) o;
        return Objects.equals(this.additions, getContexts.additions) &&
                Objects.equals(this.elements, getContexts.elements) &&
                Objects.equals(this.totalElements, getContexts.totalElements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            elements,
            totalElements
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetContexts {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

