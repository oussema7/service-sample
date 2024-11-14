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
 * ArrangementPrivilegesGetResponseBodyAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ArrangementPrivilegesGetResponseBodyAllOf 
 {
    @JsonProperty("arrangementId")
    private @Size(min=1, max=36)  String arrangementId;

    @JsonProperty("privileges")
    private List<Privilege> privileges = null;


    public ArrangementPrivilegesGetResponseBodyAllOf arrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }

    /**
     * Get arrangementId
     * @return arrangementId
     */
    @ApiModelProperty(value = "")
    @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getArrangementId() {
        return arrangementId;
    }

    public void setArrangementId(@Size(min=1, max=36)  String arrangementId) {
        this.arrangementId = arrangementId;
    }


    public ArrangementPrivilegesGetResponseBodyAllOf privileges(List<Privilege> privileges) {
        this.privileges = privileges;
        return this;
    }

    public ArrangementPrivilegesGetResponseBodyAllOf addPrivilegesItem(Privilege privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    /**
     * Get privileges
     * @return privileges
     */
    @ApiModelProperty(value = "")
    @Valid 
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
        ArrangementPrivilegesGetResponseBodyAllOf arrangementPrivilegesGetResponseBodyAllOf = (ArrangementPrivilegesGetResponseBodyAllOf) o;
        return Objects.equals(this.arrangementId, arrangementPrivilegesGetResponseBodyAllOf.arrangementId) &&
                Objects.equals(this.privileges, arrangementPrivilegesGetResponseBodyAllOf.privileges);
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
        sb.append("class ArrangementPrivilegesGetResponseBodyAllOf {\n");
        
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

