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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationPermissionSetItem;
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
 * Assignable permission set
 */
@ApiModel(description = "Assignable permission set")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationPermissionSet 
 {
    @JsonProperty("name")
    private @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name;

    @JsonProperty("description")
    private @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String description;

    @JsonProperty("permissions")
    private List<PresentationPermissionSetItem> permissions = null;


    public PresentationPermissionSet name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Assignable permission set name
     * @return name
     */
    @ApiModelProperty(required = true, value = "Assignable permission set name")
    @NotNull @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128) 
    public @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String getName() {
        return name;
    }

    public void setName(@Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name) {
        this.name = name;
    }


    public PresentationPermissionSet description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Assignable permission set description
     * @return description
     */
    @ApiModelProperty(required = true, value = "Assignable permission set description")
    @NotNull @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255) 
    public @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String getDescription() {
        return description;
    }

    public void setDescription(@Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String description) {
        this.description = description;
    }


    public PresentationPermissionSet permissions(List<PresentationPermissionSetItem> permissions) {
        this.permissions = permissions;
        return this;
    }

    public PresentationPermissionSet addPermissionsItem(PresentationPermissionSetItem permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * List of paired business function id and privileges
     * @return permissions
     */
    @ApiModelProperty(value = "List of paired business function id and privileges")
    @Valid 
    public List<PresentationPermissionSetItem> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PresentationPermissionSetItem> permissions) {
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
        PresentationPermissionSet presentationPermissionSet = (PresentationPermissionSet) o;
        return Objects.equals(this.name, presentationPermissionSet.name) &&
                Objects.equals(this.description, presentationPermissionSet.description) &&
                Objects.equals(this.permissions, presentationPermissionSet.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            description,
            permissions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPermissionSet {\n");
        
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
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

