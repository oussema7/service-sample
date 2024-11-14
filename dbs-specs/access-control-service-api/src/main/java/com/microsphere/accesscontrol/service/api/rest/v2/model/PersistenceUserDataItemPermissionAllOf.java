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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistenceDataItem;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistenceUserPermission;
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
 * PersistenceUserDataItemPermissionAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PersistenceUserDataItemPermissionAllOf 
 {
    @JsonProperty("dataItem")
    private  PersistenceDataItem dataItem;

    @JsonProperty("permissions")
    private List<PersistenceUserPermission> permissions = null;


    public PersistenceUserDataItemPermissionAllOf dataItem(PersistenceDataItem dataItem) {
        this.dataItem = dataItem;
        return this;
    }

    /**
     * Get dataItem
     * @return dataItem
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  PersistenceDataItem getDataItem() {
        return dataItem;
    }

    public void setDataItem( PersistenceDataItem dataItem) {
        this.dataItem = dataItem;
    }


    public PersistenceUserDataItemPermissionAllOf permissions(List<PersistenceUserPermission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public PersistenceUserDataItemPermissionAllOf addPermissionsItem(PersistenceUserPermission permissionsItem) {
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
    public List<PersistenceUserPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PersistenceUserPermission> permissions) {
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
        PersistenceUserDataItemPermissionAllOf persistenceUserDataItemPermissionAllOf = (PersistenceUserDataItemPermissionAllOf) o;
        return Objects.equals(this.dataItem, persistenceUserDataItemPermissionAllOf.dataItem) &&
                Objects.equals(this.permissions, persistenceUserDataItemPermissionAllOf.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            dataItem,
            permissions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistenceUserDataItemPermissionAllOf {\n");
        
        sb.append("        dataItem: ").append(toIndentedString(dataItem)).append("\n");
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

