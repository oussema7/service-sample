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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationUserApsIdentifiers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * PresentationPermissionSetPut
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationPermissionSetPut 
 {
    @JsonProperty("externalServiceAgreementId")
    private  String externalServiceAgreementId;

    @JsonProperty("regularUserAps")
    private  PresentationUserApsIdentifiers regularUserAps;

    @JsonProperty("adminUserAps")
    private  PresentationUserApsIdentifiers adminUserAps;


    public PresentationPermissionSetPut externalServiceAgreementId(String externalServiceAgreementId) {
        this.externalServiceAgreementId = externalServiceAgreementId;
        return this;
    }

    /**
     * External service agreement id.
     * @return externalServiceAgreementId
     */
    @ApiModelProperty(required = true, value = "External service agreement id.")
    @NotNull 
    public  String getExternalServiceAgreementId() {
        return externalServiceAgreementId;
    }

    public void setExternalServiceAgreementId( String externalServiceAgreementId) {
        this.externalServiceAgreementId = externalServiceAgreementId;
    }


    public PresentationPermissionSetPut regularUserAps(PresentationUserApsIdentifiers regularUserAps) {
        this.regularUserAps = regularUserAps;
        return this;
    }

    /**
     * Get regularUserAps
     * @return regularUserAps
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  PresentationUserApsIdentifiers getRegularUserAps() {
        return regularUserAps;
    }

    public void setRegularUserAps( PresentationUserApsIdentifiers regularUserAps) {
        this.regularUserAps = regularUserAps;
    }


    public PresentationPermissionSetPut adminUserAps(PresentationUserApsIdentifiers adminUserAps) {
        this.adminUserAps = adminUserAps;
        return this;
    }

    /**
     * Get adminUserAps
     * @return adminUserAps
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  PresentationUserApsIdentifiers getAdminUserAps() {
        return adminUserAps;
    }

    public void setAdminUserAps( PresentationUserApsIdentifiers adminUserAps) {
        this.adminUserAps = adminUserAps;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationPermissionSetPut presentationPermissionSetPut = (PresentationPermissionSetPut) o;
        return Objects.equals(this.externalServiceAgreementId, presentationPermissionSetPut.externalServiceAgreementId) &&
                Objects.equals(this.regularUserAps, presentationPermissionSetPut.regularUserAps) &&
                Objects.equals(this.adminUserAps, presentationPermissionSetPut.adminUserAps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            externalServiceAgreementId,
            regularUserAps,
            adminUserAps
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPermissionSetPut {\n");
        
        sb.append("        externalServiceAgreementId: ").append(toIndentedString(externalServiceAgreementId)).append("\n");
        sb.append("        regularUserAps: ").append(toIndentedString(regularUserAps)).append("\n");
        sb.append("        adminUserAps: ").append(toIndentedString(adminUserAps)).append("\n");
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

