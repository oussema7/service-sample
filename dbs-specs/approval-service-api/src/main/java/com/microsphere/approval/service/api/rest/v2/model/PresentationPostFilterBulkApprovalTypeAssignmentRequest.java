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
 * Job profile ids list
 */
@ApiModel(description = "Job profile ids list")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PresentationPostFilterBulkApprovalTypeAssignmentRequest 
 {
    @JsonProperty("jobProfileIds")
    private List<@Size(min=1, max=36) String> jobProfileIds = new ArrayList<>();

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PresentationPostFilterBulkApprovalTypeAssignmentRequest jobProfileIds(List<String> jobProfileIds) {
        this.jobProfileIds = jobProfileIds;
        return this;
    }

    public PresentationPostFilterBulkApprovalTypeAssignmentRequest addJobProfileIdsItem(String jobProfileIdsItem) {
        this.jobProfileIds.add(jobProfileIdsItem);
        return this;
    }

    /**
     * Get jobProfileIds
     * @return jobProfileIds
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Size(min=1, max=100) 
    public List<@Size(min=1, max=36) String> getJobProfileIds() {
        return jobProfileIds;
    }

    public void setJobProfileIds(List<@Size(min=1, max=36) String> jobProfileIds) {
        this.jobProfileIds = jobProfileIds;
    }


    public PresentationPostFilterBulkApprovalTypeAssignmentRequest additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationPostFilterBulkApprovalTypeAssignmentRequest putAdditionsItem(String key, String additionsItem) {
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
        PresentationPostFilterBulkApprovalTypeAssignmentRequest presentationPostFilterBulkApprovalTypeAssignmentRequest = (PresentationPostFilterBulkApprovalTypeAssignmentRequest) o;
        return Objects.equals(this.jobProfileIds, presentationPostFilterBulkApprovalTypeAssignmentRequest.jobProfileIds) &&
                Objects.equals(this.additions, presentationPostFilterBulkApprovalTypeAssignmentRequest.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            jobProfileIds,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationPostFilterBulkApprovalTypeAssignmentRequest {\n");
        
        sb.append("        jobProfileIds: ").append(toIndentedString(jobProfileIds)).append("\n");
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

