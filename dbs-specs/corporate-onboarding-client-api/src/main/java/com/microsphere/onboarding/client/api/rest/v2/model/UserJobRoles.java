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
package com.microsphere.onboarding.client.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsphere.onboarding.client.api.rest.v2.model.FunctionGroupItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * UserJobRoles
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")

public class UserJobRoles 
 {
    @JsonProperty("usersId")
    private  String usersId;

    @JsonProperty("username")
    private  String username;

    @JsonProperty("fullName")
    private  String fullName;

    @JsonProperty("jobRoles")
    private List<FunctionGroupItem> jobRoles = null;


    public UserJobRoles usersId(String usersId) {
        this.usersId = usersId;
        return this;
    }

    /**
     * Get usersId
     * @return usersId
     */
    @ApiModelProperty(value = "")
    
    public  String getUsersId() {
        return usersId;
    }

    public void setUsersId( String usersId) {
        this.usersId = usersId;
    }


    public UserJobRoles username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get username
     * @return username
     */
    @ApiModelProperty(value = "")
    
    public  String getUsername() {
        return username;
    }

    public void setUsername( String username) {
        this.username = username;
    }


    public UserJobRoles fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Get fullName
     * @return fullName
     */
    @ApiModelProperty(value = "")
    
    public  String getFullName() {
        return fullName;
    }

    public void setFullName( String fullName) {
        this.fullName = fullName;
    }


    public UserJobRoles jobRoles(List<FunctionGroupItem> jobRoles) {
        this.jobRoles = jobRoles;
        return this;
    }

    public UserJobRoles addJobRolesItem(FunctionGroupItem jobRolesItem) {
        if (this.jobRoles == null) {
            this.jobRoles = new ArrayList<>();
        }
        this.jobRoles.add(jobRolesItem);
        return this;
    }

    /**
     * list of job roles (function group) assigned to the user
     * @return jobRoles
     */
    @ApiModelProperty(value = "list of job roles (function group) assigned to the user")
    @Valid 
    public List<FunctionGroupItem> getJobRoles() {
        return jobRoles;
    }

    public void setJobRoles(List<FunctionGroupItem> jobRoles) {
        this.jobRoles = jobRoles;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserJobRoles userJobRoles = (UserJobRoles) o;
        return Objects.equals(this.usersId, userJobRoles.usersId) &&
                Objects.equals(this.username, userJobRoles.username) &&
                Objects.equals(this.fullName, userJobRoles.fullName) &&
                Objects.equals(this.jobRoles, userJobRoles.jobRoles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            usersId,
            username,
            fullName,
            jobRoles
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserJobRoles {\n");
        
        sb.append("        usersId: ").append(toIndentedString(usersId)).append("\n");
        sb.append("        username: ").append(toIndentedString(username)).append("\n");
        sb.append("        fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("        jobRoles: ").append(toIndentedString(jobRoles)).append("\n");
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

