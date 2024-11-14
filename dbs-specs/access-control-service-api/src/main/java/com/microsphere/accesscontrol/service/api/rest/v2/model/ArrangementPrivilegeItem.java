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
import com.microsphere.accesscontrol.service.api.rest.v2.model.Privilege;
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
 * Arrangement with privileges
 */
@ApiModel(description = "Arrangement with privileges")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ArrangementPrivilegeItem 
 {
    @JsonProperty("arrangementId")
    private  String arrangementId;

    @JsonProperty("privileges")
    private List<Privilege> privileges = new ArrayList<>();


    public ArrangementPrivilegeItem arrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }

    /**
     * Get arrangementId
     * @return arrangementId
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getArrangementId() {
        return arrangementId;
    }

    public void setArrangementId( String arrangementId) {
        this.arrangementId = arrangementId;
    }


    public ArrangementPrivilegeItem privileges(List<Privilege> privileges) {
        this.privileges = privileges;
        return this;
    }

    public ArrangementPrivilegeItem addPrivilegesItem(Privilege privilegesItem) {
        this.privileges.add(privilegesItem);
        return this;
    }

    /**
     * Get privileges
     * @return privileges
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
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
        ArrangementPrivilegeItem arrangementPrivilegeItem = (ArrangementPrivilegeItem) o;
        return Objects.equals(this.arrangementId, arrangementPrivilegeItem.arrangementId) &&
                Objects.equals(this.privileges, arrangementPrivilegeItem.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            arrangementId,
            privileges
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArrangementPrivilegeItem {\n");
        
        sb.append("        arrangementId: ").append(toIndentedString(arrangementId)).append("\n");
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

