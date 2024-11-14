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
 * UsercontextitemAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class UsercontextitemAllOf 
 {
    @JsonProperty("serviceAgreementName")
    private  String serviceAgreementName;

    @JsonProperty("serviceAgreementId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String serviceAgreementId;

    @JsonProperty("serviceAgreementMaster")
    private  Boolean serviceAgreementMaster;

    @JsonProperty("externalId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId;

    @JsonProperty("description")
    private @Size(min=1, max=255)  String description;


    public UsercontextitemAllOf serviceAgreementName(String serviceAgreementName) {
        this.serviceAgreementName = serviceAgreementName;
        return this;
    }

    /**
     * Service Agreement name
     * @return serviceAgreementName
     */
    @ApiModelProperty(value = "Service Agreement name")
    
    public  String getServiceAgreementName() {
        return serviceAgreementName;
    }

    public void setServiceAgreementName( String serviceAgreementName) {
        this.serviceAgreementName = serviceAgreementName;
    }


    public UsercontextitemAllOf serviceAgreementId(String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return serviceAgreementId
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getServiceAgreementId() {
        return serviceAgreementId;
    }

    public void setServiceAgreementId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
    }


    public UsercontextitemAllOf serviceAgreementMaster(Boolean serviceAgreementMaster) {
        this.serviceAgreementMaster = serviceAgreementMaster;
        return this;
    }

    /**
     * Service Agreement Master
     * @return serviceAgreementMaster
     */
    @ApiModelProperty(value = "Service Agreement Master")
    
    public  Boolean getServiceAgreementMaster() {
        return serviceAgreementMaster;
    }

    public void setServiceAgreementMaster( Boolean serviceAgreementMaster) {
        this.serviceAgreementMaster = serviceAgreementMaster;
    }


    public UsercontextitemAllOf externalId(String externalId) {
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


    public UsercontextitemAllOf description(String description) {
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




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsercontextitemAllOf usercontextitemAllOf = (UsercontextitemAllOf) o;
        return Objects.equals(this.serviceAgreementName, usercontextitemAllOf.serviceAgreementName) &&
                Objects.equals(this.serviceAgreementId, usercontextitemAllOf.serviceAgreementId) &&
                Objects.equals(this.serviceAgreementMaster, usercontextitemAllOf.serviceAgreementMaster) &&
                Objects.equals(this.externalId, usercontextitemAllOf.externalId) &&
                Objects.equals(this.description, usercontextitemAllOf.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            serviceAgreementName,
            serviceAgreementId,
            serviceAgreementMaster,
            externalId,
            description
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsercontextitemAllOf {\n");
        
        sb.append("        serviceAgreementName: ").append(toIndentedString(serviceAgreementName)).append("\n");
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
        sb.append("        serviceAgreementMaster: ").append(toIndentedString(serviceAgreementMaster)).append("\n");
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
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

