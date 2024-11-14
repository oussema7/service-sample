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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationPermissionItem;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationPermissionSetResponseItemAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
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
 * PresentationPermissionSetResponseItem
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationPermissionSetResponseItem 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("id")
    private  BigDecimal id;

    @JsonProperty("name")
    private  String name;

    @JsonProperty("description")
    private  String description;

    @JsonProperty("type")
    private  String type;

    @JsonProperty("permissions")
    private List<PresentationPermissionItem> permissions = null;


    public PresentationPermissionSetResponseItem additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationPermissionSetResponseItem putAdditionsItem(String key, String additionsItem) {
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


    public PresentationPermissionSetResponseItem id(BigDecimal id) {
        this.id = id;
        return this;
    }

    /**
     * Internal id of the assignable permission set.
     * @return id
     */
    @ApiModelProperty(value = "Internal id of the assignable permission set.")
    @Valid 
    public  BigDecimal getId() {
        return id;
    }

    public void setId( BigDecimal id) {
        this.id = id;
    }


    public PresentationPermissionSetResponseItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the assignable permission set.
     * @return name
     */
    @ApiModelProperty(value = "Name of the assignable permission set.")
    
    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }


    public PresentationPermissionSetResponseItem description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the assignable permission set.
     * @return description
     */
    @ApiModelProperty(value = "Description of the assignable permission set.")
    
    public  String getDescription() {
        return description;
    }

    public void setDescription( String description) {
        this.description = description;
    }


    public PresentationPermissionSetResponseItem type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Type of the assignable permission set.
     * @return type
     */
    @ApiModelProperty(value = "Type of the assignable permission set.")
    
    public  String getType() {
        return type;
    }

    public void setType( String type) {
        this.type = type;
    }


    public PresentationPermissionSetResponseItem permissions(List<PresentationPermissionItem> permissions) {
        this.permissions = permissions;
        return this;
    }

    public PresentationPermissionSetResponseItem addPermissionsItem(PresentationPermissionItem permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Assignable permissions.
     * @return permissions
     */
    @ApiModelProperty(value = "Assignable permissions.")
    @Valid 
    public List<PresentationPermissionItem> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PresentationPermissionItem> permissions) {
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
        PresentationPermissionSetResponseItem presentationPermissionSetResponseItem = (PresentationPermissionSetResponseItem) o;
        return Objects.equals(this.additions, presentationPermissionSetResponseItem.additions) &&
                Objects.equals(this.id, presentationPermissionSetResponseItem.id) &&
                Objects.equals(this.name, presentationPermissionSetResponseItem.name) &&
                Objects.equals(this.description, presentationPermissionSetResponseItem.description) &&
                Objects.equals(this.type, presentationPermissionSetResponseItem.type) &&
                Objects.equals(this.permissions, presentationPermissionSetResponseItem.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            id,
            name,
            description,
            type,
            permissions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPermissionSetResponseItem {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        type: ").append(toIndentedString(type)).append("\n");
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

