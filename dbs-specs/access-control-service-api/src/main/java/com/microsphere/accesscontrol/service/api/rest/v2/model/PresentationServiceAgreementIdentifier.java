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
 * PresentationServiceAgreementIdentifier
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationServiceAgreementIdentifier 
 {
    @JsonProperty("idIdentifier")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") @Size(min=1, max=36)  String idIdentifier;

    @JsonProperty("nameIdentifier")
    private @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String nameIdentifier;

    @JsonProperty("externalIdIdentifier")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalIdIdentifier;


    public PresentationServiceAgreementIdentifier idIdentifier(String idIdentifier) {
        this.idIdentifier = idIdentifier;
        return this;
    }

    /**
     * Entity ID.
     * @return idIdentifier
     */
    @ApiModelProperty(value = "Entity ID.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") @Size(min=1, max=36) 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") @Size(min=1, max=36)  String getIdIdentifier() {
        return idIdentifier;
    }

    public void setIdIdentifier(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") @Size(min=1, max=36)  String idIdentifier) {
        this.idIdentifier = idIdentifier;
    }


    public PresentationServiceAgreementIdentifier nameIdentifier(String nameIdentifier) {
        this.nameIdentifier = nameIdentifier;
        return this;
    }

    /**
     * Entity name.
     * @return nameIdentifier
     */
    @ApiModelProperty(value = "Entity name.")
    @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128) 
    public @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String getNameIdentifier() {
        return nameIdentifier;
    }

    public void setNameIdentifier(@Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String nameIdentifier) {
        this.nameIdentifier = nameIdentifier;
    }


    public PresentationServiceAgreementIdentifier externalIdIdentifier(String externalIdIdentifier) {
        this.externalIdIdentifier = externalIdIdentifier;
        return this;
    }

    /**
     * External service agreement identifier.
     * @return externalIdIdentifier
     */
    @ApiModelProperty(value = "External service agreement identifier.")
    @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalIdIdentifier() {
        return externalIdIdentifier;
    }

    public void setExternalIdIdentifier(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalIdIdentifier) {
        this.externalIdIdentifier = externalIdIdentifier;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationServiceAgreementIdentifier presentationServiceAgreementIdentifier = (PresentationServiceAgreementIdentifier) o;
        return Objects.equals(this.idIdentifier, presentationServiceAgreementIdentifier.idIdentifier) &&
                Objects.equals(this.nameIdentifier, presentationServiceAgreementIdentifier.nameIdentifier) &&
                Objects.equals(this.externalIdIdentifier, presentationServiceAgreementIdentifier.externalIdIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            idIdentifier,
            nameIdentifier,
            externalIdIdentifier
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationServiceAgreementIdentifier {\n");
        
        sb.append("        idIdentifier: ").append(toIndentedString(idIdentifier)).append("\n");
        sb.append("        nameIdentifier: ").append(toIndentedString(nameIdentifier)).append("\n");
        sb.append("        externalIdIdentifier: ").append(toIndentedString(externalIdIdentifier)).append("\n");
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

