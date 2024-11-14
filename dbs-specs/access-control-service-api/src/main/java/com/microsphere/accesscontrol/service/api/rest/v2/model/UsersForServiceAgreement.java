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
 * UsersForServiceAgreement
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class UsersForServiceAgreement 
 {
    @JsonProperty("users")
    private List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> users = null;


    public UsersForServiceAgreement users(List<String> users) {
        this.users = users;
        return this;
    }

    public UsersForServiceAgreement addUsersItem(String usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * Get users
     * @return users
     */
    @ApiModelProperty(value = "")
    
    public List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> getUsers() {
        return users;
    }

    public void setUsers(List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> users) {
        this.users = users;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsersForServiceAgreement usersForServiceAgreement = (UsersForServiceAgreement) o;
        return Objects.equals(this.users, usersForServiceAgreement.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            users
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsersForServiceAgreement {\n");
        
        sb.append("        users: ").append(toIndentedString(users)).append("\n");
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

