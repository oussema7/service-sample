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
import com.microsphere.accesscontrol.service.api.rest.v2.model.Participant;
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
 * ServiceAgreementPost
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ServiceAgreementPost 
 {
    @JsonProperty("name")
    private @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name;

    @JsonProperty("description")
    private @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String description;

    @JsonProperty("participants")
    private List<Participant> participants = new ArrayList<>();

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


    public ServiceAgreementPost name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Service Agreement name
     * @return name
     */
    @ApiModelProperty(required = true, value = "Service Agreement name")
    @NotNull @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128) 
    public @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String getName() {
        return name;
    }

    public void setName(@Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name) {
        this.name = name;
    }


    public ServiceAgreementPost description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Service Agreement description
     * @return description
     */
    @ApiModelProperty(required = true, value = "Service Agreement description")
    @NotNull @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255) 
    public @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String getDescription() {
        return description;
    }

    public void setDescription(@Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String description) {
        this.description = description;
    }


    public ServiceAgreementPost participants(List<Participant> participants) {
        this.participants = participants;
        return this;
    }

    public ServiceAgreementPost addParticipantsItem(Participant participantsItem) {
        this.participants.add(participantsItem);
        return this;
    }

    /**
     * Get participants
     * @return participants
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }


    public ServiceAgreementPost validFromDate(String validFromDate) {
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


    public ServiceAgreementPost validFromTime(String validFromTime) {
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


    public ServiceAgreementPost validUntilDate(String validUntilDate) {
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


    public ServiceAgreementPost validUntilTime(String validUntilTime) {
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


    public ServiceAgreementPost status(CreateStatus status) {
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




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceAgreementPost serviceAgreementPost = (ServiceAgreementPost) o;
        return Objects.equals(this.name, serviceAgreementPost.name) &&
                Objects.equals(this.description, serviceAgreementPost.description) &&
                Objects.equals(this.participants, serviceAgreementPost.participants) &&
                Objects.equals(this.validFromDate, serviceAgreementPost.validFromDate) &&
                Objects.equals(this.validFromTime, serviceAgreementPost.validFromTime) &&
                Objects.equals(this.validUntilDate, serviceAgreementPost.validUntilDate) &&
                Objects.equals(this.validUntilTime, serviceAgreementPost.validUntilTime) &&
                Objects.equals(this.status, serviceAgreementPost.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            description,
            participants,
            validFromDate,
            validFromTime,
            validUntilDate,
            validUntilTime,
            status
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceAgreementPost {\n");
        
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        participants: ").append(toIndentedString(participants)).append("\n");
        sb.append("        validFromDate: ").append(toIndentedString(validFromDate)).append("\n");
        sb.append("        validFromTime: ").append(toIndentedString(validFromTime)).append("\n");
        sb.append("        validUntilDate: ").append(toIndentedString(validUntilDate)).append("\n");
        sb.append("        validUntilTime: ").append(toIndentedString(validUntilTime)).append("\n");
        sb.append("        status: ").append(toIndentedString(status)).append("\n");
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

