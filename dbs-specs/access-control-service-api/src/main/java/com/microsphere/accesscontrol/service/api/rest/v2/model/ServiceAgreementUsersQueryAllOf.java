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
 * ServiceAgreementUsersQueryAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ServiceAgreementUsersQueryAllOf 
 {
    @JsonProperty("userIds")
    private List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> userIds = null;


    public ServiceAgreementUsersQueryAllOf userIds(List<String> userIds) {
        this.userIds = userIds;
        return this;
    }

    public ServiceAgreementUsersQueryAllOf addUserIdsItem(String userIdsItem) {
        if (this.userIds == null) {
            this.userIds = new ArrayList<>();
        }
        this.userIds.add(userIdsItem);
        return this;
    }

    /**
     * Get userIds
     * @return userIds
     */
    @ApiModelProperty(value = "")
    
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
        ServiceAgreementUsersQueryAllOf serviceAgreementUsersQueryAllOf = (ServiceAgreementUsersQueryAllOf) o;
        return Objects.equals(this.userIds, serviceAgreementUsersQueryAllOf.userIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            userIds
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceAgreementUsersQueryAllOf {\n");
        
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

