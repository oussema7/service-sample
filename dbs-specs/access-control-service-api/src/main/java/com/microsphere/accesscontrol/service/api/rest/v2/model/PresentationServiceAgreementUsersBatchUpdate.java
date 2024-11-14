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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationAction;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationServiceAgreementUserPair;
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
 * Payload for batch adding or removing admins/users to service agreement
 */
@ApiModel(description = "Payload for batch adding or removing admins/users to service agreement")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationServiceAgreementUsersBatchUpdate 
 {
    @JsonProperty("action")
    private  PresentationAction action;

    @JsonProperty("users")
    private List<PresentationServiceAgreementUserPair> users = null;


    public PresentationServiceAgreementUsersBatchUpdate action(PresentationAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  PresentationAction getAction() {
        return action;
    }

    public void setAction( PresentationAction action) {
        this.action = action;
    }


    public PresentationServiceAgreementUsersBatchUpdate users(List<PresentationServiceAgreementUserPair> users) {
        this.users = users;
        return this;
    }

    public PresentationServiceAgreementUsersBatchUpdate addUsersItem(PresentationServiceAgreementUserPair usersItem) {
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
    @Valid @Size(min=1) 
    public List<PresentationServiceAgreementUserPair> getUsers() {
        return users;
    }

    public void setUsers(List<PresentationServiceAgreementUserPair> users) {
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
        PresentationServiceAgreementUsersBatchUpdate presentationServiceAgreementUsersBatchUpdate = (PresentationServiceAgreementUsersBatchUpdate) o;
        return Objects.equals(this.action, presentationServiceAgreementUsersBatchUpdate.action) &&
                Objects.equals(this.users, presentationServiceAgreementUsersBatchUpdate.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            action,
            users
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationServiceAgreementUsersBatchUpdate {\n");
        
        sb.append("        action: ").append(toIndentedString(action)).append("\n");
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

