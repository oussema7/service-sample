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
import com.microsphere.accesscontrol.service.api.rest.v2.model.ServiceAgreementUsersQueryAllOf;
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
 * ServiceAgreementUsersQuery
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ServiceAgreementUsersQuery 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("userIds")
    private List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> userIds = new ArrayList<>();


    public ServiceAgreementUsersQuery additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public ServiceAgreementUsersQuery putAdditionsItem(String key, String additionsItem) {
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


    public ServiceAgreementUsersQuery userIds(List<String> userIds) {
        this.userIds = userIds;
        return this;
    }

    public ServiceAgreementUsersQuery addUserIdsItem(String userIdsItem) {
        this.userIds.add(userIdsItem);
        return this;
    }

    /**
     * Get userIds
     * @return userIds
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> userIds) {
        this.userIds = userIds;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceAgreementUsersQuery serviceAgreementUsersQuery = (ServiceAgreementUsersQuery) o;
        return Objects.equals(this.additions, serviceAgreementUsersQuery.additions) &&
                Objects.equals(this.userIds, serviceAgreementUsersQuery.userIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            userIds
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceAgreementUsersQuery {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        userIds: ").append(toIndentedString(userIds)).append("\n");
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

