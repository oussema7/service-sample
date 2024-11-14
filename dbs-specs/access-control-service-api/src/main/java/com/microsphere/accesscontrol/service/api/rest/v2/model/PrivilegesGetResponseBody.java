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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PrivilegesGetResponseBodyAllOf;
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
 * PrivilegesGetResponseBody
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PrivilegesGetResponseBody 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("privilege")
    private @Size(min=1, max=16)  String privilege;


    public PrivilegesGetResponseBody additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PrivilegesGetResponseBody putAdditionsItem(String key, String additionsItem) {
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


    public PrivilegesGetResponseBody privilege(String privilege) {
        this.privilege = privilege;
        return this;
    }

    /**
     * Get privilege
     * @return privilege
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Size(min=1, max=16) 
    public @Size(min=1, max=16)  String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(@Size(min=1, max=16)  String privilege) {
        this.privilege = privilege;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivilegesGetResponseBody privilegesGetResponseBody = (PrivilegesGetResponseBody) o;
        return Objects.equals(this.additions, privilegesGetResponseBody.additions) &&
                Objects.equals(this.privilege, privilegesGetResponseBody.privilege);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            privilege
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivilegesGetResponseBody {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        privilege: ").append(toIndentedString(privilege)).append("\n");
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
