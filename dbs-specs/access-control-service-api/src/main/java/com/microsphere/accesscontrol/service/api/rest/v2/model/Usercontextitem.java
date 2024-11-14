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
import com.microsphere.accesscontrol.service.api.rest.v2.model.UsercontextitemAllOf;
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
 * Context Service Agreement item
 */
@ApiModel(description = "Context Service Agreement item")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class Usercontextitem 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

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


    public Usercontextitem additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public Usercontextitem putAdditionsItem(String key, String additionsItem) {
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


    public Usercontextitem serviceAgreementName(String serviceAgreementName) {
        this.serviceAgreementName = serviceAgreementName;
        return this;
    }

    /**
     * Service Agreement name
     * @return serviceAgreementName
     */
    @ApiModelProperty(required = true, value = "Service Agreement name")
    @NotNull 
    public  String getServiceAgreementName() {
        return serviceAgreementName;
    }

    public void setServiceAgreementName( String serviceAgreementName) {
        this.serviceAgreementName = serviceAgreementName;
    }


    public Usercontextitem serviceAgreementId(String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return serviceAgreementId
     */
    @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
    @NotNull @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getServiceAgreementId() {
        return serviceAgreementId;
    }

    public void setServiceAgreementId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
    }


    public Usercontextitem serviceAgreementMaster(Boolean serviceAgreementMaster) {
        this.serviceAgreementMaster = serviceAgreementMaster;
        return this;
    }

    /**
     * Service Agreement Master
     * @return serviceAgreementMaster
     */
    @ApiModelProperty(required = true, value = "Service Agreement Master")
    @NotNull 
    public  Boolean getServiceAgreementMaster() {
        return serviceAgreementMaster;
    }

    public void setServiceAgreementMaster( Boolean serviceAgreementMaster) {
        this.serviceAgreementMaster = serviceAgreementMaster;
    }


    public Usercontextitem externalId(String externalId) {
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


    public Usercontextitem description(String description) {
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
        Usercontextitem usercontextitem = (Usercontextitem) o;
        return Objects.equals(this.additions, usercontextitem.additions) &&
                Objects.equals(this.serviceAgreementName, usercontextitem.serviceAgreementName) &&
                Objects.equals(this.serviceAgreementId, usercontextitem.serviceAgreementId) &&
                Objects.equals(this.serviceAgreementMaster, usercontextitem.serviceAgreementMaster) &&
                Objects.equals(this.externalId, usercontextitem.externalId) &&
                Objects.equals(this.description, usercontextitem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
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
        sb.append("class Usercontextitem {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

