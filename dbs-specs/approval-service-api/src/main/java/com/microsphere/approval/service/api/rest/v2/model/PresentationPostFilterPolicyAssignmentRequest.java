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
package com.microsphere.approval.service.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsphere.approval.service.api.rest.v2.model.PresentationEntitlementDto;
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
 * Filter on assigned policies in combination with External Service agreement and [resource]s + [business function]s
 */
@ApiModel(description = "Filter on assigned policies in combination with External Service agreement and [resource]s + [business function]s")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PresentationPostFilterPolicyAssignmentRequest 
 {
    @JsonProperty("externalServiceAgreementId")
    private @Size(min=1, max=64)  String externalServiceAgreementId;

    @JsonProperty("entitlements")
    private List<PresentationEntitlementDto> entitlements = null;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PresentationPostFilterPolicyAssignmentRequest externalServiceAgreementId(String externalServiceAgreementId) {
        this.externalServiceAgreementId = externalServiceAgreementId;
        return this;
    }

    /**
     * A simple definition for an external service agreement identifier.
     * @return externalServiceAgreementId
     */
    @ApiModelProperty(required = true, value = "A simple definition for an external service agreement identifier.")
    @NotNull @Size(min=1, max=64) 
    public @Size(min=1, max=64)  String getExternalServiceAgreementId() {
        return externalServiceAgreementId;
    }

    public void setExternalServiceAgreementId(@Size(min=1, max=64)  String externalServiceAgreementId) {
        this.externalServiceAgreementId = externalServiceAgreementId;
    }


    public PresentationPostFilterPolicyAssignmentRequest entitlements(List<PresentationEntitlementDto> entitlements) {
        this.entitlements = entitlements;
        return this;
    }

    public PresentationPostFilterPolicyAssignmentRequest addEntitlementsItem(PresentationEntitlementDto entitlementsItem) {
        if (this.entitlements == null) {
            this.entitlements = new ArrayList<>();
        }
        this.entitlements.add(entitlementsItem);
        return this;
    }

    /**
     * List of resource with functions to filter on.
     * @return entitlements
     */
    @ApiModelProperty(value = "List of resource with functions to filter on.")
    @Valid 
    public List<PresentationEntitlementDto> getEntitlements() {
        return entitlements;
    }

    public void setEntitlements(List<PresentationEntitlementDto> entitlements) {
        this.entitlements = entitlements;
    }


    public PresentationPostFilterPolicyAssignmentRequest additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationPostFilterPolicyAssignmentRequest putAdditionsItem(String key, String additionsItem) {
        if (this.additions == null) {
            this.additions = new HashMap<>();
        }
        this.additions.put(key, additionsItem);
        return this;
    }

    /**
     * Additional properties
     * @return additions
     */
    @ApiModelProperty(value = "Additional properties")
    
    public Map<String, String> getAdditions() {
        return additions;
    }

    public void setAdditions(Map<String, String> additions) {
        this.additions = additions;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationPostFilterPolicyAssignmentRequest presentationPostFilterPolicyAssignmentRequest = (PresentationPostFilterPolicyAssignmentRequest) o;
        return Objects.equals(this.externalServiceAgreementId, presentationPostFilterPolicyAssignmentRequest.externalServiceAgreementId) &&
                Objects.equals(this.entitlements, presentationPostFilterPolicyAssignmentRequest.entitlements) &&
                Objects.equals(this.additions, presentationPostFilterPolicyAssignmentRequest.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            externalServiceAgreementId,
            entitlements,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPostFilterPolicyAssignmentRequest {\n");
        
        sb.append("        externalServiceAgreementId: ").append(toIndentedString(externalServiceAgreementId)).append("\n");
        sb.append("        entitlements: ").append(toIndentedString(entitlements)).append("\n");
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

