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
 * Permission data
 */
@ApiModel(description = "Permission data")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PermissionData 
 {
    @JsonProperty("resourceName")
    private  String resourceName;

    @JsonProperty("functionName")
    private  String functionName;

    @JsonProperty("privileges")
    private List<String> privileges = null;


    public PermissionData resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Resource name
     * @return resourceName
     */
    @ApiModelProperty(value = "Resource name")
    
    public  String getResourceName() {
        return resourceName;
    }

    public void setResourceName( String resourceName) {
        this.resourceName = resourceName;
    }


    public PermissionData functionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Business function name
     * @return functionName
     */
    @ApiModelProperty(value = "Business function name")
    
    public  String getFunctionName() {
        return functionName;
    }

    public void setFunctionName( String functionName) {
        this.functionName = functionName;
    }


    public PermissionData privileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public PermissionData addPrivilegesItem(String privilegesItem) {
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
        PermissionData permissionData = (PermissionData) o;
        return Objects.equals(this.resourceName, permissionData.resourceName) &&
                Objects.equals(this.functionName, permissionData.functionName) &&
                Objects.equals(this.privileges, permissionData.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            resourceName,
            functionName,
            privileges
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionData {\n");
        
        sb.append("        resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("        functionName: ").append(toIndentedString(functionName)).append("\n");
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

