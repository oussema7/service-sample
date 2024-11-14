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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * PresentationPermissionFunctionGroupUpdate
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationPermissionFunctionGroupUpdate 
 {
    @JsonProperty("functionName")
    private @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=36)  String functionName;

    @JsonProperty("privileges")
    private List<@Size(min=1, max=16) String> privileges = new ArrayList<>();


    public PresentationPermissionFunctionGroupUpdate functionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Get functionName
     * @return functionName
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=36) 
    public @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=36)  String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(@Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=36)  String functionName) {
        this.functionName = functionName;
    }


    public PresentationPermissionFunctionGroupUpdate privileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public PresentationPermissionFunctionGroupUpdate addPrivilegesItem(String privilegesItem) {
        this.privileges.add(privilegesItem);
        return this;
    }

    /**
     * Get privileges
     * @return privileges
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
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
        PresentationPermissionFunctionGroupUpdate presentationPermissionFunctionGroupUpdate = (PresentationPermissionFunctionGroupUpdate) o;
        return Objects.equals(this.functionName, presentationPermissionFunctionGroupUpdate.functionName) &&
                Objects.equals(this.privileges, presentationPermissionFunctionGroupUpdate.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            functionName,
            privileges
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPermissionFunctionGroupUpdate {\n");
        
        sb.append("        functionName: ").append(toIndentedString(functionName)).append("\n");
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

