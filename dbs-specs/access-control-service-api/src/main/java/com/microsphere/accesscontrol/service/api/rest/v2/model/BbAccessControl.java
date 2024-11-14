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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * BbAccessControl
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class BbAccessControl 
 {
    @JsonProperty("resource")
    private  String resource;

    @JsonProperty("function")
    private  String function;

    @JsonProperty("privilege")
    private  String privilege;


    public BbAccessControl resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Resource being protected, e.g. 'User'
     * @return resource
     */
    @ApiModelProperty(required = true, value = "Resource being protected, e.g. 'User'")
    @NotNull 
    public  String getResource() {
        return resource;
    }

    public void setResource( String resource) {
        this.resource = resource;
    }


    public BbAccessControl function(String function) {
        this.function = function;
        return this;
    }

    /**
     * Business function, e.g. 'Manage Users'
     * @return function
     */
    @ApiModelProperty(required = true, value = "Business function, e.g. 'Manage Users'")
    @NotNull 
    public  String getFunction() {
        return function;
    }

    public void setFunction( String function) {
        this.function = function;
    }


    public BbAccessControl privilege(String privilege) {
        this.privilege = privilege;
        return this;
    }

    /**
     * The privilege required, e.g. 'view'
     * @return privilege
     */
    @ApiModelProperty(required = true, value = "The privilege required, e.g. 'view'")
    @NotNull 
    public  String getPrivilege() {
        return privilege;
    }

    public void setPrivilege( String privilege) {
        this.privilege = privilege;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BbAccessControl bbAccessControl = (BbAccessControl) o;
        return Objects.equals(this.resource, bbAccessControl.resource) &&
                Objects.equals(this.function, bbAccessControl.function) &&
                Objects.equals(this.privilege, bbAccessControl.privilege);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            resource,
            function,
            privilege
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BbAccessControl {\n");
        
        sb.append("        resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("        function: ").append(toIndentedString(function)).append("\n");
        sb.append("        privilege: ").append(toIndentedString(privilege)).append("\n");
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

