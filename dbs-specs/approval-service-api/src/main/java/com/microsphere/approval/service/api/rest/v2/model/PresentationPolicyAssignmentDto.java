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
import com.microsphere.approval.service.api.rest.v2.model.PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds;
import com.microsphere.approval.service.api.rest.v2.model.PresentationPolicyAssignmentRequestBounds;
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
 * The policy assignment.
 */
@ApiModel(description = "The policy assignment.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PresentationPolicyAssignmentDto 
 {
    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String id;

    @JsonProperty("externalServiceAgreementId")
    private @Size(min=1, max=64)  String externalServiceAgreementId;

    @JsonProperty("resource")
    private @Size(max=32)  String resource;

    @JsonProperty("functions")
    private List<@Size(max=32) String> functions = null;

    @JsonProperty("bounds")
    private List<PresentationPolicyAssignmentRequestBounds> bounds = null;

    @JsonProperty("dataGroupSpecificBounds")
    private List<PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds> dataGroupSpecificBounds = null;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PresentationPolicyAssignmentDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Universal Unique Identifier, 
     * @return id
     */
    @ApiModelProperty(required = true, value = "Universal Unique Identifier, ")
    @NotNull @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$") 
    public @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String getId() {
        return id;
    }

    public void setId(@Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String id) {
        this.id = id;
    }


    public PresentationPolicyAssignmentDto externalServiceAgreementId(String externalServiceAgreementId) {
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


    public PresentationPolicyAssignmentDto resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * This is the name of the resource.
     * @return resource
     */
    @ApiModelProperty(value = "This is the name of the resource.")
    @Size(max=32) 
    public @Size(max=32)  String getResource() {
        return resource;
    }

    public void setResource(@Size(max=32)  String resource) {
        this.resource = resource;
    }


    public PresentationPolicyAssignmentDto functions(List<String> functions) {
        this.functions = functions;
        return this;
    }

    public PresentationPolicyAssignmentDto addFunctionsItem(String functionsItem) {
        if (this.functions == null) {
            this.functions = new ArrayList<>();
        }
        this.functions.add(functionsItem);
        return this;
    }

    /**
     * Business functions to assign the policy to.
     * @return functions
     */
    @ApiModelProperty(value = "Business functions to assign the policy to.")
    
    public List<@Size(max=32) String> getFunctions() {
        return functions;
    }

    public void setFunctions(List<@Size(max=32) String> functions) {
        this.functions = functions;
    }


    public PresentationPolicyAssignmentDto bounds(List<PresentationPolicyAssignmentRequestBounds> bounds) {
        this.bounds = bounds;
        return this;
    }

    public PresentationPolicyAssignmentDto addBoundsItem(PresentationPolicyAssignmentRequestBounds boundsItem) {
        if (this.bounds == null) {
            this.bounds = new ArrayList<>();
        }
        this.bounds.add(boundsItem);
        return this;
    }

    /**
     * Get bounds
     * @return bounds
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<PresentationPolicyAssignmentRequestBounds> getBounds() {
        return bounds;
    }

    public void setBounds(List<PresentationPolicyAssignmentRequestBounds> bounds) {
        this.bounds = bounds;
    }


    public PresentationPolicyAssignmentDto dataGroupSpecificBounds(List<PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds> dataGroupSpecificBounds) {
        this.dataGroupSpecificBounds = dataGroupSpecificBounds;
        return this;
    }

    public PresentationPolicyAssignmentDto addDataGroupSpecificBoundsItem(PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds dataGroupSpecificBoundsItem) {
        if (this.dataGroupSpecificBounds == null) {
            this.dataGroupSpecificBounds = new ArrayList<>();
        }
        this.dataGroupSpecificBounds.add(dataGroupSpecificBoundsItem);
        return this;
    }

    /**
     * Get dataGroupSpecificBounds
     * @return dataGroupSpecificBounds
     */
    @ApiModelProperty(value = "")
    @Valid @Size(min=0, max=10) 
    public List<PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds> getDataGroupSpecificBounds() {
        return dataGroupSpecificBounds;
    }

    public void setDataGroupSpecificBounds(List<PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds> dataGroupSpecificBounds) {
        this.dataGroupSpecificBounds = dataGroupSpecificBounds;
    }


    public PresentationPolicyAssignmentDto additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationPolicyAssignmentDto putAdditionsItem(String key, String additionsItem) {
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
        PresentationPolicyAssignmentDto presentationPolicyAssignmentDto = (PresentationPolicyAssignmentDto) o;
        return Objects.equals(this.id, presentationPolicyAssignmentDto.id) &&
                Objects.equals(this.externalServiceAgreementId, presentationPolicyAssignmentDto.externalServiceAgreementId) &&
                Objects.equals(this.resource, presentationPolicyAssignmentDto.resource) &&
                Objects.equals(this.functions, presentationPolicyAssignmentDto.functions) &&
                Objects.equals(this.bounds, presentationPolicyAssignmentDto.bounds) &&
                Objects.equals(this.dataGroupSpecificBounds, presentationPolicyAssignmentDto.dataGroupSpecificBounds) &&
                Objects.equals(this.additions, presentationPolicyAssignmentDto.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            externalServiceAgreementId,
            resource,
            functions,
            bounds,
            dataGroupSpecificBounds,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPolicyAssignmentDto {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        externalServiceAgreementId: ").append(toIndentedString(externalServiceAgreementId)).append("\n");
        sb.append("        resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("        functions: ").append(toIndentedString(functions)).append("\n");
        sb.append("        bounds: ").append(toIndentedString(bounds)).append("\n");
        sb.append("        dataGroupSpecificBounds: ").append(toIndentedString(dataGroupSpecificBounds)).append("\n");
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

