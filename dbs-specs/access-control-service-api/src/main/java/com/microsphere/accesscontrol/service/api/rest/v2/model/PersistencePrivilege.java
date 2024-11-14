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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistencePrivilegeAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Privilege
 */
@ApiModel(description = "Privilege")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PersistencePrivilege 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("privilege")
    private  String privilege;

    @JsonProperty("supportsLimit")
    private  Boolean supportsLimit;


    public PersistencePrivilege additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PersistencePrivilege putAdditionsItem(String key, String additionsItem) {
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


    public PersistencePrivilege privilege(String privilege) {
        this.privilege = privilege;
        return this;
    }

    /**
     * Get privilege
     * @return privilege
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getPrivilege() {
        return privilege;
    }

    public void setPrivilege( String privilege) {
        this.privilege = privilege;
    }


    public PersistencePrivilege supportsLimit(Boolean supportsLimit) {
        this.supportsLimit = supportsLimit;
        return this;
    }

    /**
     * Get supportsLimit
     * @return supportsLimit
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
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
        PersistencePrivilege persistencePrivilege = (PersistencePrivilege) o;
        return Objects.equals(this.additions, persistencePrivilege.additions) &&
                Objects.equals(this.privilege, persistencePrivilege.privilege) &&
                Objects.equals(this.supportsLimit, persistencePrivilege.supportsLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            privilege,
            supportsLimit
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistencePrivilege {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

