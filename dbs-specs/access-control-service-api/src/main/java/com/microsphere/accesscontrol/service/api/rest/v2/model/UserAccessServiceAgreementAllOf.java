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
import com.microsphere.accesscontrol.service.api.rest.v2.model.AccessResourceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * UserAccessServiceAgreementAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class UserAccessServiceAgreementAllOf 
 {
    @JsonProperty("contextServiceAgreementId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String contextServiceAgreementId;

    @JsonProperty("serviceAgreementId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String serviceAgreementId;

    @JsonProperty("userLegalEntityId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String userLegalEntityId;

    @JsonProperty("accessResourceType")
    private  AccessResourceType accessResourceType;


    public UserAccessServiceAgreementAllOf contextServiceAgreementId(String contextServiceAgreementId) {
        this.contextServiceAgreementId = contextServiceAgreementId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return contextServiceAgreementId
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getContextServiceAgreementId() {
        return contextServiceAgreementId;
    }

    public void setContextServiceAgreementId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String contextServiceAgreementId) {
        this.contextServiceAgreementId = contextServiceAgreementId;
    }


    public UserAccessServiceAgreementAllOf serviceAgreementId(String serviceAgreementId) {
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


    public UserAccessServiceAgreementAllOf userLegalEntityId(String userLegalEntityId) {
        this.userLegalEntityId = userLegalEntityId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return userLegalEntityId
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getUserLegalEntityId() {
        return userLegalEntityId;
    }

    public void setUserLegalEntityId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String userLegalEntityId) {
        this.userLegalEntityId = userLegalEntityId;
    }


    public UserAccessServiceAgreementAllOf accessResourceType(AccessResourceType accessResourceType) {
        this.accessResourceType = accessResourceType;
        return this;
    }

    /**
     * Get accessResourceType
     * @return accessResourceType
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  AccessResourceType getAccessResourceType() {
        return accessResourceType;
    }

    public void setAccessResourceType( AccessResourceType accessResourceType) {
        this.accessResourceType = accessResourceType;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserAccessServiceAgreementAllOf userAccessServiceAgreementAllOf = (UserAccessServiceAgreementAllOf) o;
        return Objects.equals(this.contextServiceAgreementId, userAccessServiceAgreementAllOf.contextServiceAgreementId) &&
                Objects.equals(this.serviceAgreementId, userAccessServiceAgreementAllOf.serviceAgreementId) &&
                Objects.equals(this.userLegalEntityId, userAccessServiceAgreementAllOf.userLegalEntityId) &&
                Objects.equals(this.accessResourceType, userAccessServiceAgreementAllOf.accessResourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            contextServiceAgreementId,
            serviceAgreementId,
            userLegalEntityId,
            accessResourceType
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAccessServiceAgreementAllOf {\n");
        
        sb.append("        contextServiceAgreementId: ").append(toIndentedString(contextServiceAgreementId)).append("\n");
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
        sb.append("        userLegalEntityId: ").append(toIndentedString(userLegalEntityId)).append("\n");
        sb.append("        accessResourceType: ").append(toIndentedString(accessResourceType)).append("\n");
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

