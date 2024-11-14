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
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * PersistencePrivilegeAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PersistencePrivilegeAllOf 
 {
    @JsonProperty("privilege")
    private  String privilege;

    @JsonProperty("supportsLimit")
    private  Boolean supportsLimit;


    public PersistencePrivilegeAllOf privilege(String privilege) {
        this.privilege = privilege;
        return this;
    }

    /**
     * Get privilege
     * @return privilege
     */
    @ApiModelProperty(value = "")
    
    public  String getPrivilege() {
        return privilege;
    }

    public void setPrivilege( String privilege) {
        this.privilege = privilege;
    }


    public PersistencePrivilegeAllOf supportsLimit(Boolean supportsLimit) {
        this.supportsLimit = supportsLimit;
        return this;
    }

    /**
     * Get supportsLimit
     * @return supportsLimit
     */
    @ApiModelProperty(value = "")
    
    public  Boolean getSupportsLimit() {
        return supportsLimit;
    }

    public void setSupportsLimit( Boolean supportsLimit) {
        this.supportsLimit = supportsLimit;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersistencePrivilegeAllOf persistencePrivilegeAllOf = (PersistencePrivilegeAllOf) o;
        return Objects.equals(this.privilege, persistencePrivilegeAllOf.privilege) &&
                Objects.equals(this.supportsLimit, persistencePrivilegeAllOf.supportsLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            privilege,
            supportsLimit
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistencePrivilegeAllOf {\n");
        
        sb.append("        privilege: ").append(toIndentedString(privilege)).append("\n");
        sb.append("        supportsLimit: ").append(toIndentedString(supportsLimit)).append("\n");
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

