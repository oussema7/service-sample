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
 * ReauthUnauthorizedError
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class ReauthUnauthorizedError 
 {
    @JsonProperty("challenges")
    private List<Map<String, String>> challenges = null;

    @JsonProperty("data")
    private Map<String, String> data = null;


    public ReauthUnauthorizedError challenges(List<Map<String, String>> challenges) {
        this.challenges = challenges;
        return this;
    }

    public ReauthUnauthorizedError addChallengesItem(Map<String, String> challengesItem) {
        if (this.challenges == null) {
            this.challenges = new ArrayList<>();
        }
        this.challenges.add(challengesItem);
        return this;
    }

    /**
     * Get challenges
     * @return challenges
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<Map<String, String>> getChallenges() {
        return challenges;
    }

    public void setChallenges(List<Map<String, String>> challenges) {
        this.challenges = challenges;
    }


    public ReauthUnauthorizedError data(Map<String, String> data) {
        this.data = data;
        return this;
    }

    public ReauthUnauthorizedError putDataItem(String key, String dataItem) {
        if (this.data == null) {
            this.data = new HashMap<>();
        }
        this.data.put(key, dataItem);
        return this;
    }

    /**
     * Get data
     * @return data
     */
    @ApiModelProperty(value = "")
    
    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReauthUnauthorizedError reauthUnauthorizedError = (ReauthUnauthorizedError) o;
        return Objects.equals(this.challenges, reauthUnauthorizedError.challenges) &&
                Objects.equals(this.data, reauthUnauthorizedError.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            challenges,
            data
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReauthUnauthorizedError {\n");
        
        sb.append("        challenges: ").append(toIndentedString(challenges)).append("\n");
        sb.append("        data: ").append(toIndentedString(data)).append("\n");
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

