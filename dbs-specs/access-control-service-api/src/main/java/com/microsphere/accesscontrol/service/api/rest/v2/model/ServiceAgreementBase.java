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
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Service agreement item
 */
@ApiModel(description = "Service agreement item")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ServiceAgreementBase 
 {
    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id;

    @JsonProperty("externalId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId;

    @JsonProperty("name")
    private @Size(min=1)  String name;

    @JsonProperty("description")
    private @Size(min=1)  String description;

    @JsonProperty("isMaster")
    private  Boolean isMaster;

    @JsonProperty("validFrom")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private  OffsetDateTime validFrom;

    @JsonProperty("validUntil")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private  OffsetDateTime validUntil;


    public ServiceAgreementBase id(String id) {
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


    public ServiceAgreementBase externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * External Unique Identifier.
     * @return externalId
     */
    @ApiModelProperty(value = "External Unique Identifier.")
    @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalId() {
        return externalId;
    }

    public void setExternalId(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId) {
        this.externalId = externalId;
    }


    public ServiceAgreementBase name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Service agreement name
     * @return name
     */
    @ApiModelProperty(required = true, value = "Service agreement name")
    @NotNull @Size(min=1) 
    public @Size(min=1)  String getName() {
        return name;
    }

    public void setName(@Size(min=1)  String name) {
        this.name = name;
    }


    public ServiceAgreementBase description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Service agreement description
     * @return description
     */
    @ApiModelProperty(required = true, value = "Service agreement description")
    @NotNull @Size(min=1) 
    public @Size(min=1)  String getDescription() {
        return description;
    }

    public void setDescription(@Size(min=1)  String description) {
        this.description = description;
    }


    public ServiceAgreementBase isMaster(Boolean isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * Is master service agreement
     * @return isMaster
     */
    @ApiModelProperty(value = "Is master service agreement")
    
    public  Boolean getIsMaster() {
        return isMaster;
    }

    public void setIsMaster( Boolean isMaster) {
        this.isMaster = isMaster;
    }


    public ServiceAgreementBase validFrom(OffsetDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * Start date and time of the service agreement.
     * @return validFrom
     */
    @ApiModelProperty(value = "Start date and time of the service agreement.")
    @Valid 
    public  OffsetDateTime getValidFrom() {
        return validFrom;
    }

    public void setValidFrom( OffsetDateTime validFrom) {
        this.validFrom = validFrom;
    }


    public ServiceAgreementBase validUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * End date and time of the service agreement.
     * @return validUntil
     */
    @ApiModelProperty(value = "End date and time of the service agreement.")
    @Valid 
    public  OffsetDateTime getValidUntil() {
        return validUntil;
    }

    public void setValidUntil( OffsetDateTime validUntil) {
        this.validUntil = validUntil;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceAgreementBase serviceAgreementBase = (ServiceAgreementBase) o;
        return Objects.equals(this.id, serviceAgreementBase.id) &&
                Objects.equals(this.externalId, serviceAgreementBase.externalId) &&
                Objects.equals(this.name, serviceAgreementBase.name) &&
                Objects.equals(this.description, serviceAgreementBase.description) &&
                Objects.equals(this.isMaster, serviceAgreementBase.isMaster) &&
                Objects.equals(this.validFrom, serviceAgreementBase.validFrom) &&
                Objects.equals(this.validUntil, serviceAgreementBase.validUntil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            externalId,
            name,
            description,
            isMaster,
            validFrom,
            validUntil
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceAgreementBase {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        isMaster: ").append(toIndentedString(isMaster)).append("\n");
        sb.append("        validFrom: ").append(toIndentedString(validFrom)).append("\n");
        sb.append("        validUntil: ").append(toIndentedString(validUntil)).append("\n");
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

