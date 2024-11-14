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
 * Permission
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class Permission 
 {
    @JsonProperty("functionId")
    private  String functionId;

    @JsonProperty("assignedPrivileges")
    private List<Privilege> assignedPrivileges = new ArrayList<>();


    public Permission functionId(String functionId) {
        this.functionId = functionId;
        return this;
    }

    /**
     * Get functionId
     * @return functionId
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getFunctionId() {
        return functionId;
    }

    public void setFunctionId( String functionId) {
        this.functionId = functionId;
    }


    public Permission assignedPrivileges(List<Privilege> assignedPrivileges) {
        this.assignedPrivileges = assignedPrivileges;
        return this;
    }

    public Permission addAssignedPrivilegesItem(Privilege assignedPrivilegesItem) {
        this.assignedPrivileges.add(assignedPrivilegesItem);
        return this;
    }

    /**
     * Get assignedPrivileges
     * @return assignedPrivileges
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public List<Privilege> getAssignedPrivileges() {
        return assignedPrivileges;
    }

    public void setAssignedPrivileges(List<Privilege> assignedPrivileges) {
        this.assignedPrivileges = assignedPrivileges;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Permission permission = (Permission) o;
        return Objects.equals(this.functionId, permission.functionId) &&
                Objects.equals(this.assignedPrivileges, permission.assignedPrivileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            functionId,
            assignedPrivileges
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Permission {\n");
        
        sb.append("        functionId: ").append(toIndentedString(functionId)).append("\n");
        sb.append("        assignedPrivileges: ").append(toIndentedString(assignedPrivileges)).append("\n");
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

