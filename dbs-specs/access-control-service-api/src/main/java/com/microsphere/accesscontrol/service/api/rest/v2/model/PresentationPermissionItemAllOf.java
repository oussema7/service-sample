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
 * PresentationPermissionItemAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationPermissionItemAllOf 
 {
    @JsonProperty("functionId")
    private  String functionId;

    @JsonProperty("functionName")
    private  String functionName;

    @JsonProperty("resourceName")
    private  String resourceName;

    @JsonProperty("privileges")
    private List<@Size(min=1, max=16) String> privileges = null;


    public PresentationPermissionItemAllOf functionId(String functionId) {
        this.functionId = functionId;
        return this;
    }

    /**
     * Business function id.
     * @return functionId
     */
    @ApiModelProperty(value = "Business function id.")
    
    public  String getFunctionId() {
        return functionId;
    }

    public void setFunctionId( String functionId) {
        this.functionId = functionId;
    }


    public PresentationPermissionItemAllOf functionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Function name.
     * @return functionName
     */
    @ApiModelProperty(value = "Function name.")
    
    public  String getFunctionName() {
        return functionName;
    }

    public void setFunctionName( String functionName) {
        this.functionName = functionName;
    }


    public PresentationPermissionItemAllOf resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Resource name.
     * @return resourceName
     */
    @ApiModelProperty(value = "Resource name.")
    
    public  String getResourceName() {
        return resourceName;
    }

    public void setResourceName( String resourceName) {
        this.resourceName = resourceName;
    }


    public PresentationPermissionItemAllOf privileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public PresentationPermissionItemAllOf addPrivilegesItem(String privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    /**
     * Assignable permissions.
     * @return privileges
     */
    @ApiModelProperty(value = "Assignable permissions.")
    
    public List<@Size(min=1, max=16) String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<@Size(min=1, max=16) String> privileges) {
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
        PresentationPermissionItemAllOf presentationPermissionItemAllOf = (PresentationPermissionItemAllOf) o;
        return Objects.equals(this.functionId, presentationPermissionItemAllOf.functionId) &&
                Objects.equals(this.functionName, presentationPermissionItemAllOf.functionName) &&
                Objects.equals(this.resourceName, presentationPermissionItemAllOf.resourceName) &&
                Objects.equals(this.privileges, presentationPermissionItemAllOf.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            functionId,
            functionName,
            resourceName,
            privileges
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPermissionItemAllOf {\n");
        
        sb.append("        functionId: ").append(toIndentedString(functionId)).append("\n");
        sb.append("        functionName: ").append(toIndentedString(functionName)).append("\n");
        sb.append("        resourceName: ").append(toIndentedString(resourceName)).append("\n");
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

