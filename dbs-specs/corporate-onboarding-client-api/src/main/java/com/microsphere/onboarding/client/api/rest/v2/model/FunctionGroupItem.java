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
 * FunctionGroupItem
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")

public class FunctionGroupItem 
 {
    @JsonProperty("id")
    private  String id;

    @JsonProperty("name")
    private  String name;


    public FunctionGroupItem id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @ApiModelProperty(value = "")
    
    public  String getId() {
        return id;
    }

    public void setId( String id) {
        this.id = id;
    }


    public FunctionGroupItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @ApiModelProperty(value = "")
    
    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FunctionGroupItem functionGroupItem = (FunctionGroupItem) o;
        return Objects.equals(this.id, functionGroupItem.id) &&
                Objects.equals(this.name, functionGroupItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FunctionGroupItem {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
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

