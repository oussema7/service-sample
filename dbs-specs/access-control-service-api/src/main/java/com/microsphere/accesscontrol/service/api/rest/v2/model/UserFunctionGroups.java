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
package com.microsphere.accesscontrol.service.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsphere.accesscontrol.service.api.rest.v2.model.AdditionalPropertiesAware;
import com.microsphere.accesscontrol.service.api.rest.v2.model.UserFunctionGroupsAllOf;
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
 * UserFunctionGroups
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class UserFunctionGroups 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("userId")
    private  String userId;

    @JsonProperty("functionGroupIds")
    private List<String> functionGroupIds = null;


    public UserFunctionGroups additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public UserFunctionGroups putAdditionsItem(String key, String additionsItem) {
        if (this.additions == null) {
            this.additions = new HashMap<>();
        }
        this.additions.put(key, additionsItem);
        return this;
    }

    /**
     * Get additions
     * @return additions
     */
    @ApiModelProperty(value = "")
    
    public Map<String, String> getAdditions() {
        return additions;
    }

    public void setAdditions(Map<String, String> additions) {
        this.additions = additions;
    }


    public UserFunctionGroups userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Internal id of the user.
     * @return userId
     */
    @ApiModelProperty(value = "Internal id of the user.")
    
    public  String getUserId() {
        return userId;
    }

    public void setUserId( String userId) {
        this.userId = userId;
    }


    public UserFunctionGroups functionGroupIds(List<String> functionGroupIds) {
        this.functionGroupIds = functionGroupIds;
        return this;
    }

    public UserFunctionGroups addFunctionGroupIdsItem(String functionGroupIdsItem) {
        if (this.functionGroupIds == null) {
            this.functionGroupIds = new ArrayList<>();
        }
        this.functionGroupIds.add(functionGroupIdsItem);
        return this;
    }

    /**
     * List of internal function group ids.
     * @return functionGroupIds
     */
    @ApiModelProperty(value = "List of internal function group ids.")
    
    public List<String> getFunctionGroupIds() {
        return functionGroupIds;
    }

    public void setFunctionGroupIds(List<String> functionGroupIds) {
        this.functionGroupIds = functionGroupIds;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserFunctionGroups userFunctionGroups = (UserFunctionGroups) o;
        return Objects.equals(this.additions, userFunctionGroups.additions) &&
                Objects.equals(this.userId, userFunctionGroups.userId) &&
                Objects.equals(this.functionGroupIds, userFunctionGroups.functionGroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            userId,
            functionGroupIds
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserFunctionGroups {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("        functionGroupIds: ").append(toIndentedString(functionGroupIds)).append("\n");
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

