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
import com.microsphere.accesscontrol.service.api.rest.v2.model.UserPermissionsSummaryGetResponseBodyAllOf;
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
 * UserPermissionsSummaryGetResponseBody
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class UserPermissionsSummaryGetResponseBody 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("resource")
    private @Size(min=1, max=32)  String resource;

    @JsonProperty("function")
    private @Size(min=1, max=32)  String function;

    @JsonProperty("permissions")
    private Map<String, Boolean> permissions = new HashMap<>();


    public UserPermissionsSummaryGetResponseBody additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public UserPermissionsSummaryGetResponseBody putAdditionsItem(String key, String additionsItem) {
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


    public UserPermissionsSummaryGetResponseBody resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Resource name
     * @return resource
     */
    @ApiModelProperty(required = true, value = "Resource name")
    @NotNull @Size(min=1, max=32) 
    public @Size(min=1, max=32)  String getResource() {
        return resource;
    }

    public void setResource(@Size(min=1, max=32)  String resource) {
        this.resource = resource;
    }


    public UserPermissionsSummaryGetResponseBody function(String function) {
        this.function = function;
        return this;
    }

    /**
     * Business function name
     * @return function
     */
    @ApiModelProperty(required = true, value = "Business function name")
    @NotNull @Size(min=1, max=32) 
    public @Size(min=1, max=32)  String getFunction() {
        return function;
    }

    public void setFunction(@Size(min=1, max=32)  String function) {
        this.function = function;
    }


    public UserPermissionsSummaryGetResponseBody permissions(Map<String, Boolean> permissions) {
        this.permissions = permissions;
        return this;
    }

    public UserPermissionsSummaryGetResponseBody putPermissionsItem(String key, Boolean permissionsItem) {
        this.permissions.put(key, permissionsItem);
        return this;
    }

    /**
     * Allowed user permissions
     * @return permissions
     */
    @ApiModelProperty(required = true, value = "Allowed user permissions")
    @NotNull 
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
        UserPermissionsSummaryGetResponseBody userPermissionsSummaryGetResponseBody = (UserPermissionsSummaryGetResponseBody) o;
        return Objects.equals(this.additions, userPermissionsSummaryGetResponseBody.additions) &&
                Objects.equals(this.resource, userPermissionsSummaryGetResponseBody.resource) &&
                Objects.equals(this.function, userPermissionsSummaryGetResponseBody.function) &&
                Objects.equals(this.permissions, userPermissionsSummaryGetResponseBody.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            resource,
            function,
            permissions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserPermissionsSummaryGetResponseBody {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

