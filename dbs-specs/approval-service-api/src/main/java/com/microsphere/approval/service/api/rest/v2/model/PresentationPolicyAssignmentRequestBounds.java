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
import com.microsphere.approval.service.api.rest.v2.model.Currency;
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
 * PresentationPolicyAssignmentRequestBounds
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PresentationPolicyAssignmentRequestBounds 
 {
    @JsonProperty("policyId")
    private @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String policyId;

    @JsonProperty("upperBound")
    private  Currency upperBound;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PresentationPolicyAssignmentRequestBounds policyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * Universal Unique Identifier, 
     * @return policyId
     */
    @ApiModelProperty(required = true, value = "Universal Unique Identifier, ")
    @NotNull @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$") 
    public @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(@Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String policyId) {
        this.policyId = policyId;
    }


    public PresentationPolicyAssignmentRequestBounds upperBound(Currency upperBound) {
        this.upperBound = upperBound;
        return this;
    }

    /**
     * Get upperBound
     * @return upperBound
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  Currency getUpperBound() {
        return upperBound;
    }

    public void setUpperBound( Currency upperBound) {
        this.upperBound = upperBound;
    }


    public PresentationPolicyAssignmentRequestBounds additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationPolicyAssignmentRequestBounds putAdditionsItem(String key, String additionsItem) {
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
        PresentationPolicyAssignmentRequestBounds presentationPolicyAssignmentRequestBounds = (PresentationPolicyAssignmentRequestBounds) o;
        return Objects.equals(this.policyId, presentationPolicyAssignmentRequestBounds.policyId) &&
                Objects.equals(this.upperBound, presentationPolicyAssignmentRequestBounds.upperBound) &&
                Objects.equals(this.additions, presentationPolicyAssignmentRequestBounds.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            policyId,
            upperBound,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPolicyAssignmentRequestBounds {\n");
        
        sb.append("        policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("        upperBound: ").append(toIndentedString(upperBound)).append("\n");
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

