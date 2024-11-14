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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PermissionData;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PermissionDataGroupData;
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

public class PermissionDataGroup 
 {
    @JsonProperty("permissions")
    private List<PermissionData> permissions = null;

    @JsonProperty("dataGroups")
    private List<List<PermissionDataGroupData>> dataGroups = null;


    public PermissionDataGroup permissions(List<PermissionData> permissions) {
        this.permissions = permissions;
        return this;
    }

    public PermissionDataGroup addPermissionsItem(PermissionData permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<PermissionData> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionData> permissions) {
        this.permissions = permissions;
    }


    public PermissionDataGroup dataGroups(List<List<PermissionDataGroupData>> dataGroups) {
        this.dataGroups = dataGroups;
        return this;
    }

    public PermissionDataGroup addDataGroupsItem(List<PermissionDataGroupData> dataGroupsItem) {
        if (this.dataGroups == null) {
            this.dataGroups = new ArrayList<>();
        }
        this.dataGroups.add(dataGroupsItem);
        return this;
    }

    /**
     * Get dataGroups
     * @return dataGroups
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<List<PermissionDataGroupData>> getDataGroups() {
        return dataGroups;
    }

    public void setDataGroups(List<List<PermissionDataGroupData>> dataGroups) {
        this.dataGroups = dataGroups;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PermissionDataGroup permissionDataGroup = (PermissionDataGroup) o;
        return Objects.equals(this.permissions, permissionDataGroup.permissions) &&
                Objects.equals(this.dataGroups, permissionDataGroup.dataGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            permissions,
            dataGroups
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionDataGroup {\n");
        
        sb.append("        permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("        dataGroups: ").append(toIndentedString(dataGroups)).append("\n");
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

