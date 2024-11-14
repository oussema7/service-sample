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
import com.microsphere.accesscontrol.service.api.rest.v2.model.AdditionalPropertiesAware;
import com.microsphere.accesscontrol.service.api.rest.v2.model.UserAccessLegalEntitiesAllOf;
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
 * UserAccessLegalEntities
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class UserAccessLegalEntities 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("contextServiceAgreementId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String contextServiceAgreementId;

    @JsonProperty("userLegalEntityId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String userLegalEntityId;

    @JsonProperty("accessResourceType")
    private  AccessResourceType accessResourceType;


    public UserAccessLegalEntities additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public UserAccessLegalEntities putAdditionsItem(String key, String additionsItem) {
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


    public UserAccessLegalEntities contextServiceAgreementId(String contextServiceAgreementId) {
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


    public UserAccessLegalEntities userLegalEntityId(String userLegalEntityId) {
        this.userLegalEntityId = userLegalEntityId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return userLegalEntityId
     */
    @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
    @NotNull @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getUserLegalEntityId() {
        return userLegalEntityId;
    }

    public void setUserLegalEntityId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String userLegalEntityId) {
        this.userLegalEntityId = userLegalEntityId;
    }


    public UserAccessLegalEntities accessResourceType(AccessResourceType accessResourceType) {
        this.accessResourceType = accessResourceType;
        return this;
    }

    /**
     * Get accessResourceType
     * @return accessResourceType
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
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
        UserAccessLegalEntities userAccessLegalEntities = (UserAccessLegalEntities) o;
        return Objects.equals(this.additions, userAccessLegalEntities.additions) &&
                Objects.equals(this.contextServiceAgreementId, userAccessLegalEntities.contextServiceAgreementId) &&
                Objects.equals(this.userLegalEntityId, userAccessLegalEntities.userLegalEntityId) &&
                Objects.equals(this.accessResourceType, userAccessLegalEntities.accessResourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            contextServiceAgreementId,
            userLegalEntityId,
            accessResourceType
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAccessLegalEntities {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        contextServiceAgreementId: ").append(toIndentedString(contextServiceAgreementId)).append("\n");
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

