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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * PersistenceUserPermissionAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PersistenceUserPermissionAllOf 
 {
    @JsonProperty("resource")
    private  String resource;

    @JsonProperty("businessFunction")
    private  String businessFunction;

    @JsonProperty("functionId")
    private  String functionId;

    @JsonProperty("functionCode")
    private  String functionCode;

    @JsonProperty("privileges")
    private List<String> privileges = null;


    public PersistenceUserPermissionAllOf resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    @ApiModelProperty(value = "")
    
    public  String getResource() {
        return resource;
    }

    public void setResource( String resource) {
        this.resource = resource;
    }


    public PersistenceUserPermissionAllOf businessFunction(String businessFunction) {
        this.businessFunction = businessFunction;
        return this;
    }

    /**
     * Get businessFunction
     * @return businessFunction
     */
    @ApiModelProperty(value = "")
    
    public  String getBusinessFunction() {
        return businessFunction;
    }

    public void setBusinessFunction( String businessFunction) {
        this.businessFunction = businessFunction;
    }


    public PersistenceUserPermissionAllOf functionId(String functionId) {
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


    public PersistenceUserPermissionAllOf functionCode(String functionCode) {
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


    public PersistenceUserPermissionAllOf privileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public PersistenceUserPermissionAllOf addPrivilegesItem(String privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    /**
     * Get privileges
     * @return privileges
     */
    @ApiModelProperty(value = "")
    
    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
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
        PersistenceUserPermissionAllOf persistenceUserPermissionAllOf = (PersistenceUserPermissionAllOf) o;
        return Objects.equals(this.resource, persistenceUserPermissionAllOf.resource) &&
                Objects.equals(this.businessFunction, persistenceUserPermissionAllOf.businessFunction) &&
                Objects.equals(this.functionId, persistenceUserPermissionAllOf.functionId) &&
                Objects.equals(this.functionCode, persistenceUserPermissionAllOf.functionCode) &&
                Objects.equals(this.privileges, persistenceUserPermissionAllOf.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            resource,
            businessFunction,
            functionId,
            functionCode,
            privileges
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistenceUserPermissionAllOf {\n");
        
        sb.append("        resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("        businessFunction: ").append(toIndentedString(businessFunction)).append("\n");
        sb.append("        functionId: ").append(toIndentedString(functionId)).append("\n");
        sb.append("        functionCode: ").append(toIndentedString(functionCode)).append("\n");
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

