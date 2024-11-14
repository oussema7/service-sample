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
import com.microsphere.accesscontrol.service.api.rest.v2.model.UserAccessEntitlementsResourceAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * UserAccessEntitlementsResource
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class UserAccessEntitlementsResource 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("contextServiceAgreementId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String contextServiceAgreementId;

    @JsonProperty("userLegalEntityId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String userLegalEntityId;

    @JsonProperty("legalEntityIds")
    private List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> legalEntityIds = new ArrayList<>();

    @JsonProperty("accessResourceType")
    private  AccessResourceType accessResourceType;


    public UserAccessEntitlementsResource additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public UserAccessEntitlementsResource putAdditionsItem(String key, String additionsItem) {
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


    public UserAccessEntitlementsResource contextServiceAgreementId(String contextServiceAgreementId) {
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


    public UserAccessEntitlementsResource userLegalEntityId(String userLegalEntityId) {
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


    public UserAccessEntitlementsResource legalEntityIds(List<String> legalEntityIds) {
        this.legalEntityIds = legalEntityIds;
        return this;
    }

    public UserAccessEntitlementsResource addLegalEntityIdsItem(String legalEntityIdsItem) {
        this.legalEntityIds.add(legalEntityIdsItem);
        return this;
    }

    /**
     * List of legal entity ids to check
     * @return legalEntityIds
     */
    @ApiModelProperty(required = true, value = "List of legal entity ids to check")
    @NotNull 
    public List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> getLegalEntityIds() {
        return legalEntityIds;
    }

    public void setLegalEntityIds(List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> legalEntityIds) {
        this.legalEntityIds = legalEntityIds;
    }


    public UserAccessEntitlementsResource accessResourceType(AccessResourceType accessResourceType) {
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
        UserAccessEntitlementsResource userAccessEntitlementsResource = (UserAccessEntitlementsResource) o;
        return Objects.equals(this.additions, userAccessEntitlementsResource.additions) &&
                Objects.equals(this.contextServiceAgreementId, userAccessEntitlementsResource.contextServiceAgreementId) &&
                Objects.equals(this.userLegalEntityId, userAccessEntitlementsResource.userLegalEntityId) &&
                Objects.equals(this.legalEntityIds, userAccessEntitlementsResource.legalEntityIds) &&
                Objects.equals(this.accessResourceType, userAccessEntitlementsResource.accessResourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            contextServiceAgreementId,
            userLegalEntityId,
            legalEntityIds,
            accessResourceType
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAccessEntitlementsResource {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        contextServiceAgreementId: ").append(toIndentedString(contextServiceAgreementId)).append("\n");
        sb.append("        userLegalEntityId: ").append(toIndentedString(userLegalEntityId)).append("\n");
        sb.append("        legalEntityIds: ").append(toIndentedString(legalEntityIds)).append("\n");
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

