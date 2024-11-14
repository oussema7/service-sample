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
 * User context data group permissions request
 */
@ApiModel(description = "User context data group permissions request")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PermissionsRequest 
 {
    @JsonProperty("dataGroupTypes")
    private List<String> dataGroupTypes = new ArrayList<>();

    @JsonProperty("resourceName")
    private  String resourceName;

    @JsonProperty("functionNames")
    private List<String> functionNames = null;

    @JsonProperty("privileges")
    private List<String> privileges = null;


    public PermissionsRequest dataGroupTypes(List<String> dataGroupTypes) {
        this.dataGroupTypes = dataGroupTypes;
        return this;
    }

    public PermissionsRequest addDataGroupTypesItem(String dataGroupTypesItem) {
        this.dataGroupTypes.add(dataGroupTypesItem);
        return this;
    }

    /**
     * Get dataGroupTypes
     * @return dataGroupTypes
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Size(min=1) 
    public List<String> getDataGroupTypes() {
        return dataGroupTypes;
    }

    public void setDataGroupTypes(List<String> dataGroupTypes) {
        this.dataGroupTypes = dataGroupTypes;
    }


    public PermissionsRequest resourceName(String resourceName) {
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


    public PermissionsRequest functionNames(List<String> functionNames) {
        this.functionNames = functionNames;
        return this;
    }

    public PermissionsRequest addFunctionNamesItem(String functionNamesItem) {
        if (this.functionNames == null) {
            this.functionNames = new ArrayList<>();
        }
        this.functionNames.add(functionNamesItem);
        return this;
    }

    /**
     * Get functionNames
     * @return functionNames
     */
    @ApiModelProperty(value = "")
    
    public List<String> getFunctionNames() {
        return functionNames;
    }

    public void setFunctionNames(List<String> functionNames) {
        this.functionNames = functionNames;
    }


    public PermissionsRequest privileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public PermissionsRequest addPrivilegesItem(String privilegesItem) {
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
        PermissionsRequest permissionsRequest = (PermissionsRequest) o;
        return Objects.equals(this.dataGroupTypes, permissionsRequest.dataGroupTypes) &&
                Objects.equals(this.resourceName, permissionsRequest.resourceName) &&
                Objects.equals(this.functionNames, permissionsRequest.functionNames) &&
                Objects.equals(this.privileges, permissionsRequest.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            dataGroupTypes,
            resourceName,
            functionNames,
            privileges
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionsRequest {\n");
        
        sb.append("        dataGroupTypes: ").append(toIndentedString(dataGroupTypes)).append("\n");
        sb.append("        resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("        functionNames: ").append(toIndentedString(functionNames)).append("\n");
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

