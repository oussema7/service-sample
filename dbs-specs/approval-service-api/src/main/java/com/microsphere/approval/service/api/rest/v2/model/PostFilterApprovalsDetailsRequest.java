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
import com.microsphere.approval.service.api.rest.v2.model.JobProfilesSummaryDto;
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
 * Get request for getting detailed information of a single approval.
 */
@ApiModel(description = "Get request for getting detailed information of a single approval.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PostFilterApprovalsDetailsRequest 
 {
    @JsonProperty("jobProfilesSummary")
    private  JobProfilesSummaryDto jobProfilesSummary;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PostFilterApprovalsDetailsRequest jobProfilesSummary(JobProfilesSummaryDto jobProfilesSummary) {
        this.jobProfilesSummary = jobProfilesSummary;
        return this;
    }

    /**
     * Get jobProfilesSummary
     * @return jobProfilesSummary
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  JobProfilesSummaryDto getJobProfilesSummary() {
        return jobProfilesSummary;
    }

    public void setJobProfilesSummary( JobProfilesSummaryDto jobProfilesSummary) {
        this.jobProfilesSummary = jobProfilesSummary;
    }


    public PostFilterApprovalsDetailsRequest additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PostFilterApprovalsDetailsRequest putAdditionsItem(String key, String additionsItem) {
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
        PostFilterApprovalsDetailsRequest postFilterApprovalsDetailsRequest = (PostFilterApprovalsDetailsRequest) o;
        return Objects.equals(this.jobProfilesSummary, postFilterApprovalsDetailsRequest.jobProfilesSummary) &&
                Objects.equals(this.additions, postFilterApprovalsDetailsRequest.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            jobProfilesSummary,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostFilterApprovalsDetailsRequest {\n");
        
        sb.append("        jobProfilesSummary: ").append(toIndentedString(jobProfilesSummary)).append("\n");
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

