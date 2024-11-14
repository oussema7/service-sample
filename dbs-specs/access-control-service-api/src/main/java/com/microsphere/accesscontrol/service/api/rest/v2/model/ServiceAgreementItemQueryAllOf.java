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
import com.microsphere.accesscontrol.service.api.rest.v2.model.Status;
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

public class ServiceAgreementItemQueryAllOf 
 {
    @JsonProperty("creatorLegalEntity")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String creatorLegalEntity;

    @JsonProperty("status")
    private  Status status;

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


    public ServiceAgreementItemQueryAllOf creatorLegalEntity(String creatorLegalEntity) {
        this.creatorLegalEntity = creatorLegalEntity;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return creatorLegalEntity
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getCreatorLegalEntity() {
        return creatorLegalEntity;
    }

    public void setCreatorLegalEntity(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String creatorLegalEntity) {
        this.creatorLegalEntity = creatorLegalEntity;
    }


    public ServiceAgreementItemQueryAllOf status(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  Status getStatus() {
        return status;
    }

    public void setStatus( Status status) {
        this.status = status;
    }


    public ServiceAgreementItemQueryAllOf id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return id
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getId() {
        return id;
    }

    public void setId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id) {
        this.id = id;
    }


    public ServiceAgreementItemQueryAllOf externalId(String externalId) {
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


    public ServiceAgreementItemQueryAllOf name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Service agreement name
     * @return name
     */
    @ApiModelProperty(value = "Service agreement name")
    @Size(min=1) 
    public @Size(min=1)  String getName() {
        return name;
    }

    public void setName(@Size(min=1)  String name) {
        this.name = name;
    }


    public ServiceAgreementItemQueryAllOf description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Service agreement description
     * @return description
     */
    @ApiModelProperty(value = "Service agreement description")
    @Size(min=1) 
    public @Size(min=1)  String getDescription() {
        return description;
    }

    public void setDescription(@Size(min=1)  String description) {
        this.description = description;
    }


    public ServiceAgreementItemQueryAllOf isMaster(Boolean isMaster) {
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


    public ServiceAgreementItemQueryAllOf validFrom(OffsetDateTime validFrom) {
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


    public ServiceAgreementItemQueryAllOf validUntil(OffsetDateTime validUntil) {
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
        ServiceAgreementItemQueryAllOf serviceAgreementItemQueryAllOf = (ServiceAgreementItemQueryAllOf) o;
        return Objects.equals(this.creatorLegalEntity, serviceAgreementItemQueryAllOf.creatorLegalEntity) &&
                Objects.equals(this.status, serviceAgreementItemQueryAllOf.status) &&
                Objects.equals(this.id, serviceAgreementItemQueryAllOf.id) &&
                Objects.equals(this.externalId, serviceAgreementItemQueryAllOf.externalId) &&
                Objects.equals(this.name, serviceAgreementItemQueryAllOf.name) &&
                Objects.equals(this.description, serviceAgreementItemQueryAllOf.description) &&
                Objects.equals(this.isMaster, serviceAgreementItemQueryAllOf.isMaster) &&
                Objects.equals(this.validFrom, serviceAgreementItemQueryAllOf.validFrom) &&
                Objects.equals(this.validUntil, serviceAgreementItemQueryAllOf.validUntil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            creatorLegalEntity,
            status,
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
        sb.append("class ServiceAgreementItemQueryAllOf {\n");
        
        sb.append("        creatorLegalEntity: ").append(toIndentedString(creatorLegalEntity)).append("\n");
        sb.append("        status: ").append(toIndentedString(status)).append("\n");
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

