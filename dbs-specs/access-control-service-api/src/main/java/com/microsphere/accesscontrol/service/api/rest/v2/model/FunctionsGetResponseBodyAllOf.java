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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistencePrivilege;
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
 * FunctionsGetResponseBodyAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class FunctionsGetResponseBodyAllOf 
 {
    @JsonProperty("functionId")
    private  String functionId;

    @JsonProperty("functionCode")
    private  String functionCode;

    @JsonProperty("resource")
    private  String resource;

    @JsonProperty("resourceCode")
    private  String resourceCode;

    @JsonProperty("name")
    private  String name;

    @JsonProperty("privileges")
    private List<PersistencePrivilege> privileges = null;


    public FunctionsGetResponseBodyAllOf functionId(String functionId) {
        this.functionId = functionId;
        return this;
    }

    /**
     * Internal id of business function
     * @return functionId
     */
    @ApiModelProperty(value = "Internal id of business function")
    
    public  String getFunctionId() {
        return functionId;
    }

    public void setFunctionId( String functionId) {
        this.functionId = functionId;
    }


    public FunctionsGetResponseBodyAllOf functionCode(String functionCode) {
        this.functionCode = functionCode;
        return this;
    }

    /**
     * Code of business function
     * @return functionCode
     */
    @ApiModelProperty(value = "Code of business function")
    
    public  String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode( String functionCode) {
        this.functionCode = functionCode;
    }


    public FunctionsGetResponseBodyAllOf resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Name of resource
     * @return resource
     */
    @ApiModelProperty(value = "Name of resource")
    
    public  String getResource() {
        return resource;
    }

    public void setResource( String resource) {
        this.resource = resource;
    }


    public FunctionsGetResponseBodyAllOf resourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
        return this;
    }

    /**
     * Code of resource
     * @return resourceCode
     */
    @ApiModelProperty(value = "Code of resource")
    
    public  String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode( String resourceCode) {
        this.resourceCode = resourceCode;
    }


    public FunctionsGetResponseBodyAllOf name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Business function name
     * @return name
     */
    @ApiModelProperty(value = "Business function name")
    
    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }


    public FunctionsGetResponseBodyAllOf privileges(List<PersistencePrivilege> privileges) {
        this.privileges = privileges;
        return this;
    }

    public FunctionsGetResponseBodyAllOf addPrivilegesItem(PersistencePrivilege privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    /**
     * Applicable privileges for business function
     * @return privileges
     */
    @ApiModelProperty(value = "Applicable privileges for business function")
    @Valid 
    public List<PersistencePrivilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<PersistencePrivilege> privileges) {
        this.privileges = privileges;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FunctionsGetResponseBodyAllOf functionsGetResponseBodyAllOf = (FunctionsGetResponseBodyAllOf) o;
        return Objects.equals(this.functionId, functionsGetResponseBodyAllOf.functionId) &&
                Objects.equals(this.functionCode, functionsGetResponseBodyAllOf.functionCode) &&
                Objects.equals(this.resource, functionsGetResponseBodyAllOf.resource) &&
                Objects.equals(this.resourceCode, functionsGetResponseBodyAllOf.resourceCode) &&
                Objects.equals(this.name, functionsGetResponseBodyAllOf.name) &&
                Objects.equals(this.privileges, functionsGetResponseBodyAllOf.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            functionId,
            functionCode,
            resource,
            resourceCode,
            name,
            privileges
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FunctionsGetResponseBodyAllOf {\n");
        
        sb.append("        functionId: ").append(toIndentedString(functionId)).append("\n");
        sb.append("        functionCode: ").append(toIndentedString(functionCode)).append("\n");
        sb.append("        resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("        resourceCode: ").append(toIndentedString(resourceCode)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        privileges: ").append(toIndentedString(privileges)).append("\n");
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

