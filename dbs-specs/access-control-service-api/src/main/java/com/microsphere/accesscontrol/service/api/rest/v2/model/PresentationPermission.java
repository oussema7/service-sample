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
 * PresentationPermission
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationPermission 
 {
    @JsonProperty("functionId")
    private @Size(min=1, max=36)  String functionId;

    @JsonProperty("privileges")
    private List<@Size(min=1, max=16) String> privileges = new ArrayList<>();


    public PresentationPermission functionId(String functionId) {
        this.functionId = functionId;
        return this;
    }

    /**
     * Get functionId
     * @return functionId
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(@Size(min=1, max=36)  String functionId) {
        this.functionId = functionId;
    }


    public PresentationPermission privileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public PresentationPermission addPrivilegesItem(String privilegesItem) {
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
        PresentationPermission presentationPermission = (PresentationPermission) o;
        return Objects.equals(this.functionId, presentationPermission.functionId) &&
                Objects.equals(this.privileges, presentationPermission.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            functionId,
            privileges
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPermission {\n");
        
        sb.append("        functionId: ").append(toIndentedString(functionId)).append("\n");
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

