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
import com.microsphere.accesscontrol.service.api.rest.v2.model.CreateStatus;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ParticipantIngest;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationUserApsIdentifiers;
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
 * ServicesAgreementIngestAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ServicesAgreementIngestAllOf 
 {
    @JsonProperty("name")
    private @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name;

    @JsonProperty("externalId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId;

    @JsonProperty("description")
    private @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String description;

    @JsonProperty("participantsToIngest")
    private List<ParticipantIngest> participantsToIngest = null;

    @JsonProperty("validFromDate")
    private  String validFromDate;

    @JsonProperty("validFromTime")
    private  String validFromTime;

    @JsonProperty("validUntilDate")
    private  String validUntilDate;

    @JsonProperty("validUntilTime")
    private  String validUntilTime;

    @JsonProperty("status")
    private  CreateStatus status = CreateStatus.ENABLED;

    @JsonProperty("isMaster")
    private  Boolean isMaster;

    @JsonProperty("regularUserAps")
    private  PresentationUserApsIdentifiers regularUserAps;

    @JsonProperty("adminUserAps")
    private  PresentationUserApsIdentifiers adminUserAps;

    @JsonProperty("creatorLegalEntity")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String creatorLegalEntity;


    public ServicesAgreementIngestAllOf name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The service agreement name
     * @return name
     */
    @ApiModelProperty(value = "The service agreement name")
    @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128) 
    public @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String getName() {
        return name;
    }

    public void setName(@Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name) {
        this.name = name;
    }


    public ServicesAgreementIngestAllOf externalId(String externalId) {
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


    public ServicesAgreementIngestAllOf description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description
     * @return description
     */
    @ApiModelProperty(value = "Description")
    @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255) 
    public @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String getDescription() {
        return description;
    }

    public void setDescription(@Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String description) {
        this.description = description;
    }


    public ServicesAgreementIngestAllOf participantsToIngest(List<ParticipantIngest> participantsToIngest) {
        this.participantsToIngest = participantsToIngest;
        return this;
    }

    public ServicesAgreementIngestAllOf addParticipantsToIngestItem(ParticipantIngest participantsToIngestItem) {
        if (this.participantsToIngest == null) {
            this.participantsToIngest = new ArrayList<>();
        }
        this.participantsToIngest.add(participantsToIngestItem);
        return this;
    }

    /**
     * Participants of the service agreement
     * @return participantsToIngest
     */
    @ApiModelProperty(value = "Participants of the service agreement")
    @Valid 
    public List<ParticipantIngest> getParticipantsToIngest() {
        return participantsToIngest;
    }

    public void setParticipantsToIngest(List<ParticipantIngest> participantsToIngest) {
        this.participantsToIngest = participantsToIngest;
    }


    public ServicesAgreementIngestAllOf validFromDate(String validFromDate) {
        this.validFromDate = validFromDate;
        return this;
    }

    /**
     * Start date of the service agreement.
     * @return validFromDate
     */
    @ApiModelProperty(value = "Start date of the service agreement.")
    
    public  String getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate( String validFromDate) {
        this.validFromDate = validFromDate;
    }


    public ServicesAgreementIngestAllOf validFromTime(String validFromTime) {
        this.validFromTime = validFromTime;
        return this;
    }

    /**
     * Start time of the service agreement.
     * @return validFromTime
     */
    @ApiModelProperty(value = "Start time of the service agreement.")
    
    public  String getValidFromTime() {
        return validFromTime;
    }

    public void setValidFromTime( String validFromTime) {
        this.validFromTime = validFromTime;
    }


    public ServicesAgreementIngestAllOf validUntilDate(String validUntilDate) {
        this.validUntilDate = validUntilDate;
        return this;
    }

    /**
     * End date of the service agreement.
     * @return validUntilDate
     */
    @ApiModelProperty(value = "End date of the service agreement.")
    
    public  String getValidUntilDate() {
        return validUntilDate;
    }

    public void setValidUntilDate( String validUntilDate) {
        this.validUntilDate = validUntilDate;
    }


    public ServicesAgreementIngestAllOf validUntilTime(String validUntilTime) {
        this.validUntilTime = validUntilTime;
        return this;
    }

    /**
     * End time of the service agreement.
     * @return validUntilTime
     */
    @ApiModelProperty(value = "End time of the service agreement.")
    
    public  String getValidUntilTime() {
        return validUntilTime;
    }

    public void setValidUntilTime( String validUntilTime) {
        this.validUntilTime = validUntilTime;
    }


    public ServicesAgreementIngestAllOf status(CreateStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  CreateStatus getStatus() {
        return status;
    }

    public void setStatus( CreateStatus status) {
        this.status = status;
    }


    public ServicesAgreementIngestAllOf isMaster(Boolean isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * Master flag
     * @return isMaster
     */
    @ApiModelProperty(value = "Master flag")
    
    public  Boolean getIsMaster() {
        return isMaster;
    }

    public void setIsMaster( Boolean isMaster) {
        this.isMaster = isMaster;
    }


    public ServicesAgreementIngestAllOf regularUserAps(PresentationUserApsIdentifiers regularUserAps) {
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


    public ServicesAgreementIngestAllOf adminUserAps(PresentationUserApsIdentifiers adminUserAps) {
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


    public ServicesAgreementIngestAllOf creatorLegalEntity(String creatorLegalEntity) {
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




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServicesAgreementIngestAllOf servicesAgreementIngestAllOf = (ServicesAgreementIngestAllOf) o;
        return Objects.equals(this.name, servicesAgreementIngestAllOf.name) &&
                Objects.equals(this.externalId, servicesAgreementIngestAllOf.externalId) &&
                Objects.equals(this.description, servicesAgreementIngestAllOf.description) &&
                Objects.equals(this.participantsToIngest, servicesAgreementIngestAllOf.participantsToIngest) &&
                Objects.equals(this.validFromDate, servicesAgreementIngestAllOf.validFromDate) &&
                Objects.equals(this.validFromTime, servicesAgreementIngestAllOf.validFromTime) &&
                Objects.equals(this.validUntilDate, servicesAgreementIngestAllOf.validUntilDate) &&
                Objects.equals(this.validUntilTime, servicesAgreementIngestAllOf.validUntilTime) &&
                Objects.equals(this.status, servicesAgreementIngestAllOf.status) &&
                Objects.equals(this.isMaster, servicesAgreementIngestAllOf.isMaster) &&
                Objects.equals(this.regularUserAps, servicesAgreementIngestAllOf.regularUserAps) &&
                Objects.equals(this.adminUserAps, servicesAgreementIngestAllOf.adminUserAps) &&
                Objects.equals(this.creatorLegalEntity, servicesAgreementIngestAllOf.creatorLegalEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            externalId,
            description,
            participantsToIngest,
            validFromDate,
            validFromTime,
            validUntilDate,
            validUntilTime,
            status,
            isMaster,
            regularUserAps,
            adminUserAps,
            creatorLegalEntity
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServicesAgreementIngestAllOf {\n");
        
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        participantsToIngest: ").append(toIndentedString(participantsToIngest)).append("\n");
        sb.append("        validFromDate: ").append(toIndentedString(validFromDate)).append("\n");
        sb.append("        validFromTime: ").append(toIndentedString(validFromTime)).append("\n");
        sb.append("        validUntilDate: ").append(toIndentedString(validUntilDate)).append("\n");
        sb.append("        validUntilTime: ").append(toIndentedString(validUntilTime)).append("\n");
        sb.append("        status: ").append(toIndentedString(status)).append("\n");
        sb.append("        isMaster: ").append(toIndentedString(isMaster)).append("\n");
        sb.append("        regularUserAps: ").append(toIndentedString(regularUserAps)).append("\n");
        sb.append("        adminUserAps: ").append(toIndentedString(adminUserAps)).append("\n");
        sb.append("        creatorLegalEntity: ").append(toIndentedString(creatorLegalEntity)).append("\n");
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

