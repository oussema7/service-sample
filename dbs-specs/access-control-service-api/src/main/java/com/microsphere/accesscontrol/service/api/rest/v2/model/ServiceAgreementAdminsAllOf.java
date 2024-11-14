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
 * ServiceAgreementAdminsAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ServiceAgreementAdminsAllOf 
 {
    @JsonProperty("admins")
    private List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> admins = null;


    public ServiceAgreementAdminsAllOf admins(List<String> admins) {
        this.admins = admins;
        return this;
    }

    public ServiceAgreementAdminsAllOf addAdminsItem(String adminsItem) {
        if (this.admins == null) {
            this.admins = new ArrayList<>();
        }
        this.admins.add(adminsItem);
        return this;
    }

    /**
     * Get admins
     * @return admins
     */
    @ApiModelProperty(value = "")
    
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
        ServiceAgreementAdminsAllOf serviceAgreementAdminsAllOf = (ServiceAgreementAdminsAllOf) o;
        return Objects.equals(this.admins, serviceAgreementAdminsAllOf.admins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            admins
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceAgreementAdminsAllOf {\n");
        
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

