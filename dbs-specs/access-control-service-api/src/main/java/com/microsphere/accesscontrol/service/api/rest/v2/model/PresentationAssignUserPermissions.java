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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationAssignUserPermissionsAllOf;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationFunctionGroupDataGroup;
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
 * PresentationAssignUserPermissions
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationAssignUserPermissions 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("externalUserId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalUserId;

    @JsonProperty("externalServiceAgreementId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalServiceAgreementId;

    @JsonProperty("functionGroupDataGroups")
    private List<PresentationFunctionGroupDataGroup> functionGroupDataGroups = new ArrayList<>();


    public PresentationAssignUserPermissions additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationAssignUserPermissions putAdditionsItem(String key, String additionsItem) {
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


    public PresentationAssignUserPermissions externalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }

    /**
     * External Unique Identifier.
     * @return externalUserId
     */
    @ApiModelProperty(required = true, value = "External Unique Identifier.")
    @NotNull @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalUserId() {
        return externalUserId;
    }

    public void setExternalUserId(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalUserId) {
        this.externalUserId = externalUserId;
    }


    public PresentationAssignUserPermissions externalServiceAgreementId(String externalServiceAgreementId) {
        this.externalServiceAgreementId = externalServiceAgreementId;
        return this;
    }

    /**
     * External Unique Identifier.
     * @return externalServiceAgreementId
     */
    @ApiModelProperty(required = true, value = "External Unique Identifier.")
    @NotNull @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalServiceAgreementId() {
        return externalServiceAgreementId;
    }

    public void setExternalServiceAgreementId(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalServiceAgreementId) {
        this.externalServiceAgreementId = externalServiceAgreementId;
    }


    public PresentationAssignUserPermissions functionGroupDataGroups(List<PresentationFunctionGroupDataGroup> functionGroupDataGroups) {
        this.functionGroupDataGroups = functionGroupDataGroups;
        return this;
    }

    public PresentationAssignUserPermissions addFunctionGroupDataGroupsItem(PresentationFunctionGroupDataGroup functionGroupDataGroupsItem) {
        this.functionGroupDataGroups.add(functionGroupDataGroupsItem);
        return this;
    }

    /**
     * Function/Data group pairs
     * @return functionGroupDataGroups
     */
    @ApiModelProperty(required = true, value = "Function/Data group pairs")
    @NotNull @Valid 
    public List<PresentationFunctionGroupDataGroup> getFunctionGroupDataGroups() {
        return functionGroupDataGroups;
    }

    public void setFunctionGroupDataGroups(List<PresentationFunctionGroupDataGroup> functionGroupDataGroups) {
        this.functionGroupDataGroups = functionGroupDataGroups;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationAssignUserPermissions presentationAssignUserPermissions = (PresentationAssignUserPermissions) o;
        return Objects.equals(this.additions, presentationAssignUserPermissions.additions) &&
                Objects.equals(this.externalUserId, presentationAssignUserPermissions.externalUserId) &&
                Objects.equals(this.externalServiceAgreementId, presentationAssignUserPermissions.externalServiceAgreementId) &&
                Objects.equals(this.functionGroupDataGroups, presentationAssignUserPermissions.functionGroupDataGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            externalUserId,
            externalServiceAgreementId,
            functionGroupDataGroups
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationAssignUserPermissions {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
        sb.append("        externalServiceAgreementId: ").append(toIndentedString(externalServiceAgreementId)).append("\n");
        sb.append("        functionGroupDataGroups: ").append(toIndentedString(functionGroupDataGroups)).append("\n");
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

