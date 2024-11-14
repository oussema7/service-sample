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
 * LegalEntityAdmins
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class LegalEntityAdmins 
 {
    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id;

    @JsonProperty("admins")
    private List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> admins = new ArrayList<>();


    public LegalEntityAdmins id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return id
     */
    @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
    @NotNull @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getId() {
        return id;
    }

    public void setId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id) {
        this.id = id;
    }


    public LegalEntityAdmins admins(List<String> admins) {
        this.admins = admins;
        return this;
    }

    public LegalEntityAdmins addAdminsItem(String adminsItem) {
        this.admins.add(adminsItem);
        return this;
    }

    /**
     * Get admins
     * @return admins
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> getAdmins() {
        return admins;
    }

    public void setAdmins(List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> admins) {
        this.admins = admins;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LegalEntityAdmins legalEntityAdmins = (LegalEntityAdmins) o;
        return Objects.equals(this.id, legalEntityAdmins.id) &&
                Objects.equals(this.admins, legalEntityAdmins.admins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            admins
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LegalEntityAdmins {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        admins: ").append(toIndentedString(admins)).append("\n");
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

