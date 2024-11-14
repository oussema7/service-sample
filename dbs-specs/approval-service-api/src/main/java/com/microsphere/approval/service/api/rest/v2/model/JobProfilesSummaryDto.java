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
import com.microsphere.approval.service.api.rest.v2.model.JobProfileDto;
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
 * This object describes the job profiles in the context of the given user and service agreement.
 */
@ApiModel(description = "This object describes the job profiles in the context of the given user and service agreement.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class JobProfilesSummaryDto 
 {
    @JsonProperty("userId")
    private @Size(min=1, max=36)  String userId;

    @JsonProperty("jobProfiles")
    private List<JobProfileDto> jobProfiles = new ArrayList<>();

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public JobProfilesSummaryDto userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return userId
     */
    @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @NotNull @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getUserId() {
        return userId;
    }

    public void setUserId(@Size(min=1, max=36)  String userId) {
        this.userId = userId;
    }


    public JobProfilesSummaryDto jobProfiles(List<JobProfileDto> jobProfiles) {
        this.jobProfiles = jobProfiles;
        return this;
    }

    public JobProfilesSummaryDto addJobProfilesItem(JobProfileDto jobProfilesItem) {
        this.jobProfiles.add(jobProfilesItem);
        return this;
    }

    /**
     * the list of applicable job profiles for this user and service agreement.
     * @return jobProfiles
     */
    @ApiModelProperty(required = true, value = "the list of applicable job profiles for this user and service agreement.")
    @NotNull @Valid 
    public List<JobProfileDto> getJobProfiles() {
        return jobProfiles;
    }

    public void setJobProfiles(List<JobProfileDto> jobProfiles) {
        this.jobProfiles = jobProfiles;
    }


    public JobProfilesSummaryDto additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public JobProfilesSummaryDto putAdditionsItem(String key, String additionsItem) {
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
        JobProfilesSummaryDto jobProfilesSummaryDto = (JobProfilesSummaryDto) o;
        return Objects.equals(this.userId, jobProfilesSummaryDto.userId) &&
                Objects.equals(this.jobProfiles, jobProfilesSummaryDto.jobProfiles) &&
                Objects.equals(this.additions, jobProfilesSummaryDto.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            userId,
            jobProfiles,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobProfilesSummaryDto {\n");
        
        sb.append("        userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("        jobProfiles: ").append(toIndentedString(jobProfiles)).append("\n");
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

