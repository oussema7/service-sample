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
import com.microsphere.accesscontrol.service.api.rest.v2.model.LegalEntityType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * LegalEntityCreateItemAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class LegalEntityCreateItemAllOf 
 {
    @JsonProperty("externalId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId;

    @JsonProperty("name")
    private @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name;

    @JsonProperty("parentExternalId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String parentExternalId;

    @JsonProperty("type")
    private  LegalEntityType type;

    @JsonProperty("activateSingleServiceAgreement")
    private  Boolean activateSingleServiceAgreement;


    public LegalEntityCreateItemAllOf externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * External legal entity identifier.
     * @return externalId
     */
    @ApiModelProperty(value = "External legal entity identifier.")
    @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalId() {
        return externalId;
    }

    public void setExternalId(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId) {
        this.externalId = externalId;
    }


    public LegalEntityCreateItemAllOf name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Legal Entity name
     * @return name
     */
    @ApiModelProperty(value = "Legal Entity name")
    @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128) 
    public @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String getName() {
        return name;
    }

    public void setName(@Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name) {
        this.name = name;
    }


    public LegalEntityCreateItemAllOf parentExternalId(String parentExternalId) {
        this.parentExternalId = parentExternalId;
        return this;
    }

    /**
     * External legal entity identifier.
     * @return parentExternalId
     */
    @ApiModelProperty(value = "External legal entity identifier.")
    @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getParentExternalId() {
        return parentExternalId;
    }

    public void setParentExternalId(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String parentExternalId) {
        this.parentExternalId = parentExternalId;
    }


    public LegalEntityCreateItemAllOf type(LegalEntityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  LegalEntityType getType() {
        return type;
    }

    public void setType( LegalEntityType type) {
        this.type = type;
    }


    public LegalEntityCreateItemAllOf activateSingleServiceAgreement(Boolean activateSingleServiceAgreement) {
        this.activateSingleServiceAgreement = activateSingleServiceAgreement;
        return this;
    }

    /**
     * Defines whether a master service agreement is activated or disabled for a legal entity.
     * @return activateSingleServiceAgreement
     */
    @ApiModelProperty(value = "Defines whether a master service agreement is activated or disabled for a legal entity.")
    
    public  Boolean getActivateSingleServiceAgreement() {
        return activateSingleServiceAgreement;
    }

    public void setActivateSingleServiceAgreement( Boolean activateSingleServiceAgreement) {
        this.activateSingleServiceAgreement = activateSingleServiceAgreement;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LegalEntityCreateItemAllOf legalEntityCreateItemAllOf = (LegalEntityCreateItemAllOf) o;
        return Objects.equals(this.externalId, legalEntityCreateItemAllOf.externalId) &&
                Objects.equals(this.name, legalEntityCreateItemAllOf.name) &&
                Objects.equals(this.parentExternalId, legalEntityCreateItemAllOf.parentExternalId) &&
                Objects.equals(this.type, legalEntityCreateItemAllOf.type) &&
                Objects.equals(this.activateSingleServiceAgreement, legalEntityCreateItemAllOf.activateSingleServiceAgreement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            externalId,
            name,
            parentExternalId,
            type,
            activateSingleServiceAgreement
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LegalEntityCreateItemAllOf {\n");
        
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        parentExternalId: ").append(toIndentedString(parentExternalId)).append("\n");
        sb.append("        type: ").append(toIndentedString(type)).append("\n");
        sb.append("        activateSingleServiceAgreement: ").append(toIndentedString(activateSingleServiceAgreement)).append("\n");
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

