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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationPermissionItemAllOf;
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
 * PresentationPermissionItem
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationPermissionItem 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("functionId")
    private  String functionId;

    @JsonProperty("functionName")
    private  String functionName;

    @JsonProperty("resourceName")
    private  String resourceName;

    @JsonProperty("privileges")
    private List<@Size(min=1, max=16) String> privileges = null;


    public PresentationPermissionItem additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationPermissionItem putAdditionsItem(String key, String additionsItem) {
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


    public PresentationPermissionItem functionId(String functionId) {
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


    public PresentationPermissionItem functionName(String functionName) {
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


    public PresentationPermissionItem resourceName(String resourceName) {
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


    public PresentationPermissionItem privileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public PresentationPermissionItem addPrivilegesItem(String privilegesItem) {
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
        PresentationPermissionItem presentationPermissionItem = (PresentationPermissionItem) o;
        return Objects.equals(this.additions, presentationPermissionItem.additions) &&
                Objects.equals(this.functionId, presentationPermissionItem.functionId) &&
                Objects.equals(this.functionName, presentationPermissionItem.functionName) &&
                Objects.equals(this.resourceName, presentationPermissionItem.resourceName) &&
                Objects.equals(this.privileges, presentationPermissionItem.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            functionId,
            functionName,
            resourceName,
            privileges
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPermissionItem {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

