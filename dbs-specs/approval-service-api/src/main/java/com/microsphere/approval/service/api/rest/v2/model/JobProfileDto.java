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
 * The job profile describes which combinations of business functions and data access items have the approve privilege.
 */
@ApiModel(description = "The job profile describes which combinations of business functions and data access items have the approve privilege.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class JobProfileDto 
 {
    @JsonProperty("jobProfileId")
    private @Size(min=1, max=36)  String jobProfileId;

    @JsonProperty("businessFunctions")
    private List<@Size(max=32) String> businessFunctions = new ArrayList<>();

    @JsonProperty("dataAccessItemIds")
    private List<@Size(min=1, max=36) String> dataAccessItemIds = new ArrayList<>();

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public JobProfileDto jobProfileId(String jobProfileId) {
        this.jobProfileId = jobProfileId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return jobProfileId
     */
    @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @NotNull @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getJobProfileId() {
        return jobProfileId;
    }

    public void setJobProfileId(@Size(min=1, max=36)  String jobProfileId) {
        this.jobProfileId = jobProfileId;
    }


    public JobProfileDto businessFunctions(List<String> businessFunctions) {
        this.businessFunctions = businessFunctions;
        return this;
    }

    public JobProfileDto addBusinessFunctionsItem(String businessFunctionsItem) {
        this.businessFunctions.add(businessFunctionsItem);
        return this;
    }

    /**
     * The set of business functions (with the 'approve' privilege) in the job profile that applies to the set of data access items.
     * @return businessFunctions
     */
    @ApiModelProperty(required = true, value = "The set of business functions (with the 'approve' privilege) in the job profile that applies to the set of data access items.")
    @NotNull @Size(min=1) 
    public List<@Size(max=32) String> getBusinessFunctions() {
        return businessFunctions;
    }

    public void setBusinessFunctions(List<@Size(max=32) String> businessFunctions) {
        this.businessFunctions = businessFunctions;
    }


    public JobProfileDto dataAccessItemIds(List<String> dataAccessItemIds) {
        this.dataAccessItemIds = dataAccessItemIds;
        return this;
    }

    public JobProfileDto addDataAccessItemIdsItem(String dataAccessItemIdsItem) {
        this.dataAccessItemIds.add(dataAccessItemIdsItem);
        return this;
    }

    /**
     * The list of item ids. This is ignored if the approval does not have a dataAccessItemId.
     * @return dataAccessItemIds
     */
    @ApiModelProperty(required = true, value = "The list of item ids. This is ignored if the approval does not have a dataAccessItemId.")
    @NotNull @Size(min=0) 
    public List<@Size(min=1, max=36) String> getDataAccessItemIds() {
        return dataAccessItemIds;
    }

    public void setDataAccessItemIds(List<@Size(min=1, max=36) String> dataAccessItemIds) {
        this.dataAccessItemIds = dataAccessItemIds;
    }


    public JobProfileDto additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public JobProfileDto putAdditionsItem(String key, String additionsItem) {
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
        JobProfileDto jobProfileDto = (JobProfileDto) o;
        return Objects.equals(this.jobProfileId, jobProfileDto.jobProfileId) &&
                Objects.equals(this.businessFunctions, jobProfileDto.businessFunctions) &&
                Objects.equals(this.dataAccessItemIds, jobProfileDto.dataAccessItemIds) &&
                Objects.equals(this.additions, jobProfileDto.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            jobProfileId,
            businessFunctions,
            dataAccessItemIds,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobProfileDto {\n");
        
        sb.append("        jobProfileId: ").append(toIndentedString(jobProfileId)).append("\n");
        sb.append("        businessFunctions: ").append(toIndentedString(businessFunctions)).append("\n");
        sb.append("        dataAccessItemIds: ").append(toIndentedString(dataAccessItemIds)).append("\n");
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

