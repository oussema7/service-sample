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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * UserPermissionsSummaryGetResponseBodyAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class UserPermissionsSummaryGetResponseBodyAllOf 
 {
    @JsonProperty("resource")
    private @Size(min=1, max=32)  String resource;

    @JsonProperty("function")
    private @Size(min=1, max=32)  String function;

    @JsonProperty("permissions")
    private Map<String, Boolean> permissions = null;


    public UserPermissionsSummaryGetResponseBodyAllOf resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Resource name
     * @return resource
     */
    @ApiModelProperty(value = "Resource name")
    @Size(min=1, max=32) 
    public @Size(min=1, max=32)  String getResource() {
        return resource;
    }

    public void setResource(@Size(min=1, max=32)  String resource) {
        this.resource = resource;
    }


    public UserPermissionsSummaryGetResponseBodyAllOf function(String function) {
        this.function = function;
        return this;
    }

    /**
     * Business function name
     * @return function
     */
    @ApiModelProperty(value = "Business function name")
    @Size(min=1, max=32) 
    public @Size(min=1, max=32)  String getFunction() {
        return function;
    }

    public void setFunction(@Size(min=1, max=32)  String function) {
        this.function = function;
    }


    public UserPermissionsSummaryGetResponseBodyAllOf permissions(Map<String, Boolean> permissions) {
        this.permissions = permissions;
        return this;
    }

    public UserPermissionsSummaryGetResponseBodyAllOf putPermissionsItem(String key, Boolean permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new HashMap<>();
        }
        this.permissions.put(key, permissionsItem);
        return this;
    }

    /**
     * Allowed user permissions
     * @return permissions
     */
    @ApiModelProperty(value = "Allowed user permissions")
    
    public Map<String, Boolean> getPermissions() {
        return permissions;
    }

    public void setPermissions(Map<String, Boolean> permissions) {
        this.permissions = permissions;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserPermissionsSummaryGetResponseBodyAllOf userPermissionsSummaryGetResponseBodyAllOf = (UserPermissionsSummaryGetResponseBodyAllOf) o;
        return Objects.equals(this.resource, userPermissionsSummaryGetResponseBodyAllOf.resource) &&
                Objects.equals(this.function, userPermissionsSummaryGetResponseBodyAllOf.function) &&
                Objects.equals(this.permissions, userPermissionsSummaryGetResponseBodyAllOf.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            resource,
            function,
            permissions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserPermissionsSummaryGetResponseBodyAllOf {\n");
        
        sb.append("        resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("        function: ").append(toIndentedString(function)).append("\n");
        sb.append("        permissions: ").append(toIndentedString(permissions)).append("\n");
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

