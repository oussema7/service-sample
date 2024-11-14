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
import com.microsphere.accesscontrol.service.api.rest.v2.model.FunctionsGetResponseBodyAllOf;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistencePrivilege;
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
 * FunctionsGetResponseBody
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class FunctionsGetResponseBody 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

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
    private List<PersistencePrivilege> privileges = new ArrayList<>();


    public FunctionsGetResponseBody additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public FunctionsGetResponseBody putAdditionsItem(String key, String additionsItem) {
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


    public FunctionsGetResponseBody functionId(String functionId) {
        this.functionId = functionId;
        return this;
    }

    /**
     * Internal id of business function
     * @return functionId
     */
    @ApiModelProperty(required = true, value = "Internal id of business function")
    @NotNull 
    public  String getFunctionId() {
        return functionId;
    }

    public void setFunctionId( String functionId) {
        this.functionId = functionId;
    }


    public FunctionsGetResponseBody functionCode(String functionCode) {
        this.functionCode = functionCode;
        return this;
    }

    /**
     * Code of business function
     * @return functionCode
     */
    @ApiModelProperty(required = true, value = "Code of business function")
    @NotNull 
    public  String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode( String functionCode) {
        this.functionCode = functionCode;
    }


    public FunctionsGetResponseBody resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Name of resource
     * @return resource
     */
    @ApiModelProperty(required = true, value = "Name of resource")
    @NotNull 
    public  String getResource() {
        return resource;
    }

    public void setResource( String resource) {
        this.resource = resource;
    }


    public FunctionsGetResponseBody resourceCode(String resourceCode) {
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


    public FunctionsGetResponseBody name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Business function name
     * @return name
     */
    @ApiModelProperty(required = true, value = "Business function name")
    @NotNull 
    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }


    public FunctionsGetResponseBody privileges(List<PersistencePrivilege> privileges) {
        this.privileges = privileges;
        return this;
    }

    public FunctionsGetResponseBody addPrivilegesItem(PersistencePrivilege privilegesItem) {
        this.privileges.add(privilegesItem);
        return this;
    }

    /**
     * Applicable privileges for business function
     * @return privileges
     */
    @ApiModelProperty(required = true, value = "Applicable privileges for business function")
    @NotNull @Valid 
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
        FunctionsGetResponseBody functionsGetResponseBody = (FunctionsGetResponseBody) o;
        return Objects.equals(this.additions, functionsGetResponseBody.additions) &&
                Objects.equals(this.functionId, functionsGetResponseBody.functionId) &&
                Objects.equals(this.functionCode, functionsGetResponseBody.functionCode) &&
                Objects.equals(this.resource, functionsGetResponseBody.resource) &&
                Objects.equals(this.resourceCode, functionsGetResponseBody.resourceCode) &&
                Objects.equals(this.name, functionsGetResponseBody.name) &&
                Objects.equals(this.privileges, functionsGetResponseBody.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
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
        sb.append("class FunctionsGetResponseBody {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

