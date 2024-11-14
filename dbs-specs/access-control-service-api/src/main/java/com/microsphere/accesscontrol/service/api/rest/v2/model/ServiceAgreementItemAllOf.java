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
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * ServiceAgreementItemAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ServiceAgreementItemAllOf 
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
    private @Size(min=1, max=128)  String name;

    @JsonProperty("description")
    private @Size(min=1, max=255)  String description;

    @JsonProperty("isMaster")
    private  Boolean isMaster;

    @JsonProperty("validFromDate")
    private  String validFromDate;

    @JsonProperty("validFromTime")
    private  String validFromTime;

    @JsonProperty("validUntilDate")
    private  String validUntilDate;

    @JsonProperty("validUntilTime")
    private  String validUntilTime;


    public ServiceAgreementItemAllOf creatorLegalEntity(String creatorLegalEntity) {
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


    public ServiceAgreementItemAllOf status(Status status) {
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


    public ServiceAgreementItemAllOf id(String id) {
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


    public ServiceAgreementItemAllOf externalId(String externalId) {
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


    public ServiceAgreementItemAllOf name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Service agreement name to display
     * @return name
     */
    @ApiModelProperty(value = "Service agreement name to display")
    @Size(min=1, max=128) 
    public @Size(min=1, max=128)  String getName() {
        return name;
    }

    public void setName(@Size(min=1, max=128)  String name) {
        this.name = name;
    }


    public ServiceAgreementItemAllOf description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Brief text to describe service agreement
     * @return description
     */
    @ApiModelProperty(value = "Brief text to describe service agreement")
    @Size(min=1, max=255) 
    public @Size(min=1, max=255)  String getDescription() {
        return description;
    }

    public void setDescription(@Size(min=1, max=255)  String description) {
        this.description = description;
    }


    public ServiceAgreementItemAllOf isMaster(Boolean isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * Defines default service agreement when none selected, only one can hold true value
     * @return isMaster
     */
    @ApiModelProperty(value = "Defines default service agreement when none selected, only one can hold true value")
    
    public  Boolean getIsMaster() {
        return isMaster;
    }

    public void setIsMaster( Boolean isMaster) {
        this.isMaster = isMaster;
    }


    public ServiceAgreementItemAllOf validFromDate(String validFromDate) {
        this.validFromDate = validFromDate;
        return this;
    }

    /**
     * Start date of the service agreement. (date-only from RFC3339 - yyyy-MM-dd)
     * @return validFromDate
     */
    @ApiModelProperty(value = "Start date of the service agreement. (date-only from RFC3339 - yyyy-MM-dd)")
    
    public  String getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate( String validFromDate) {
        this.validFromDate = validFromDate;
    }


    public ServiceAgreementItemAllOf validFromTime(String validFromTime) {
        this.validFromTime = validFromTime;
        return this;
    }

    /**
     * Start time of the service agreement. (time-only from RFC3339 - HH:mm:ss)
     * @return validFromTime
     */
    @ApiModelProperty(value = "Start time of the service agreement. (time-only from RFC3339 - HH:mm:ss)")
    
    public  String getValidFromTime() {
        return validFromTime;
    }

    public void setValidFromTime( String validFromTime) {
        this.validFromTime = validFromTime;
    }


    public ServiceAgreementItemAllOf validUntilDate(String validUntilDate) {
        this.validUntilDate = validUntilDate;
        return this;
    }

    /**
     * End date of the service agreement. (date-only from RFC3339 - yyyy-MM-dd)
     * @return validUntilDate
     */
    @ApiModelProperty(value = "End date of the service agreement. (date-only from RFC3339 - yyyy-MM-dd)")
    
    public  String getValidUntilDate() {
        return validUntilDate;
    }

    public void setValidUntilDate( String validUntilDate) {
        this.validUntilDate = validUntilDate;
    }


    public ServiceAgreementItemAllOf validUntilTime(String validUntilTime) {
        this.validUntilTime = validUntilTime;
        return this;
    }

    /**
     * End time of the service agreement. (time-only from RFC3339 - HH:mm:ss)
     * @return validUntilTime
     */
    @ApiModelProperty(value = "End time of the service agreement. (time-only from RFC3339 - HH:mm:ss)")
    
    public  String getValidUntilTime() {
        return validUntilTime;
    }

    public void setValidUntilTime( String validUntilTime) {
        this.validUntilTime = validUntilTime;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceAgreementItemAllOf serviceAgreementItemAllOf = (ServiceAgreementItemAllOf) o;
        return Objects.equals(this.creatorLegalEntity, serviceAgreementItemAllOf.creatorLegalEntity) &&
                Objects.equals(this.status, serviceAgreementItemAllOf.status) &&
                Objects.equals(this.id, serviceAgreementItemAllOf.id) &&
                Objects.equals(this.externalId, serviceAgreementItemAllOf.externalId) &&
                Objects.equals(this.name, serviceAgreementItemAllOf.name) &&
                Objects.equals(this.description, serviceAgreementItemAllOf.description) &&
                Objects.equals(this.isMaster, serviceAgreementItemAllOf.isMaster) &&
                Objects.equals(this.validFromDate, serviceAgreementItemAllOf.validFromDate) &&
                Objects.equals(this.validFromTime, serviceAgreementItemAllOf.validFromTime) &&
                Objects.equals(this.validUntilDate, serviceAgreementItemAllOf.validUntilDate) &&
                Objects.equals(this.validUntilTime, serviceAgreementItemAllOf.validUntilTime);
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
            validFromDate,
            validFromTime,
            validUntilDate,
            validUntilTime
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceAgreementItemAllOf {\n");
        
        sb.append("        creatorLegalEntity: ").append(toIndentedString(creatorLegalEntity)).append("\n");
        sb.append("        status: ").append(toIndentedString(status)).append("\n");
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        isMaster: ").append(toIndentedString(isMaster)).append("\n");
        sb.append("        validFromDate: ").append(toIndentedString(validFromDate)).append("\n");
        sb.append("        validFromTime: ").append(toIndentedString(validFromTime)).append("\n");
        sb.append("        validUntilDate: ").append(toIndentedString(validUntilDate)).append("\n");
        sb.append("        validUntilTime: ").append(toIndentedString(validUntilTime)).append("\n");
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

