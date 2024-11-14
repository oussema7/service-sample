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
import com.microsphere.accesscontrol.service.api.rest.v2.model.AdditionalPropertiesAware;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ServiceAgreementPutAllOf;
import com.microsphere.accesscontrol.service.api.rest.v2.model.Status;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * ServiceAgreementPut
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ServiceAgreementPut 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("name")
    private @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name;

    @JsonProperty("description")
    private @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String description;

    @JsonProperty("externalId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId;

    @JsonProperty("validFromDate")
    private  String validFromDate;

    @JsonProperty("validFromTime")
    private  String validFromTime;

    @JsonProperty("validUntilDate")
    private  String validUntilDate;

    @JsonProperty("validUntilTime")
    private  String validUntilTime;

    @JsonProperty("status")
    private  Status status;


    public ServiceAgreementPut additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public ServiceAgreementPut putAdditionsItem(String key, String additionsItem) {
        if (this.additions == null) {
            this.additions = new HashMap<>();
        }
        this.additions.put(key, additionsItem);
        return this;
    }

    /**
     * Get additions
     * @return additions
     */
    @ApiModelProperty(value = "")
    
    public Map<String, String> getAdditions() {
        return additions;
    }

    public void setAdditions(Map<String, String> additions) {
        this.additions = additions;
    }


    public ServiceAgreementPut name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Service Agreement name
     * @return name
     */
    @ApiModelProperty(value = "Service Agreement name")
    @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128) 
    public @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String getName() {
        return name;
    }

    public void setName(@Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name) {
        this.name = name;
    }


    public ServiceAgreementPut description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Service Agreement description
     * @return description
     */
    @ApiModelProperty(value = "Service Agreement description")
    @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255) 
    public @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String getDescription() {
        return description;
    }

    public void setDescription(@Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String description) {
        this.description = description;
    }


    public ServiceAgreementPut externalId(String externalId) {
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


    public ServiceAgreementPut validFromDate(String validFromDate) {
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


    public ServiceAgreementPut validFromTime(String validFromTime) {
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


    public ServiceAgreementPut validUntilDate(String validUntilDate) {
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


    public ServiceAgreementPut validUntilTime(String validUntilTime) {
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


    public ServiceAgreementPut status(Status status) {
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




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceAgreementPut serviceAgreementPut = (ServiceAgreementPut) o;
        return Objects.equals(this.additions, serviceAgreementPut.additions) &&
                Objects.equals(this.name, serviceAgreementPut.name) &&
                Objects.equals(this.description, serviceAgreementPut.description) &&
                Objects.equals(this.externalId, serviceAgreementPut.externalId) &&
                Objects.equals(this.validFromDate, serviceAgreementPut.validFromDate) &&
                Objects.equals(this.validFromTime, serviceAgreementPut.validFromTime) &&
                Objects.equals(this.validUntilDate, serviceAgreementPut.validUntilDate) &&
                Objects.equals(this.validUntilTime, serviceAgreementPut.validUntilTime) &&
                Objects.equals(this.status, serviceAgreementPut.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            name,
            description,
            externalId,
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
        sb.append("class ServiceAgreementPut {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
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

