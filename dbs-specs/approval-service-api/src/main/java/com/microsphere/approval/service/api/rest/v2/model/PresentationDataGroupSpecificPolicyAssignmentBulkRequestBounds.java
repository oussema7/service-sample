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
 * This object describes the data group ids and related policy bounds infromation.
 */
@ApiModel(description = "This object describes the data group ids and related policy bounds infromation.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds 
 {
    @JsonProperty("dataGroupIds")
    private List<@Size(min=1, max=36) String> dataGroupIds = new ArrayList<>();

    @JsonProperty("bounds")
    private List<PresentationPolicyAssignmentRequestBounds> bounds = new ArrayList<>();

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds dataGroupIds(List<String> dataGroupIds) {
        this.dataGroupIds = dataGroupIds;
        return this;
    }

    public PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds addDataGroupIdsItem(String dataGroupIdsItem) {
        this.dataGroupIds.add(dataGroupIdsItem);
        return this;
    }

    /**
     * Get dataGroupIds
     * @return dataGroupIds
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Size(min=1, max=25) 
    public List<@Size(min=1, max=36) String> getDataGroupIds() {
        return dataGroupIds;
    }

    public void setDataGroupIds(List<@Size(min=1, max=36) String> dataGroupIds) {
        this.dataGroupIds = dataGroupIds;
    }


    public PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds bounds(List<PresentationPolicyAssignmentRequestBounds> bounds) {
        this.bounds = bounds;
        return this;
    }

    public PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds addBoundsItem(PresentationPolicyAssignmentRequestBounds boundsItem) {
        this.bounds.add(boundsItem);
        return this;
    }

    /**
     * Get bounds
     * @return bounds
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid @Size(min=1, max=50) 
    public List<PresentationPolicyAssignmentRequestBounds> getBounds() {
        return bounds;
    }

    public void setBounds(List<PresentationPolicyAssignmentRequestBounds> bounds) {
        this.bounds = bounds;
    }


    public PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds putAdditionsItem(String key, String additionsItem) {
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
        PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds presentationDataGroupSpecificPolicyAssignmentBulkRequestBounds = (PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds) o;
        return Objects.equals(this.dataGroupIds, presentationDataGroupSpecificPolicyAssignmentBulkRequestBounds.dataGroupIds) &&
                Objects.equals(this.bounds, presentationDataGroupSpecificPolicyAssignmentBulkRequestBounds.bounds) &&
                Objects.equals(this.additions, presentationDataGroupSpecificPolicyAssignmentBulkRequestBounds.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            dataGroupIds,
            bounds,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds {\n");
        
        sb.append("        dataGroupIds: ").append(toIndentedString(dataGroupIds)).append("\n");
        sb.append("        bounds: ").append(toIndentedString(bounds)).append("\n");
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

