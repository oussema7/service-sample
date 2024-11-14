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
 * ParticipantIngest
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ParticipantIngest 
 {
    @JsonProperty("externalId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId;

    @JsonProperty("sharingUsers")
    private  Boolean sharingUsers;

    @JsonProperty("sharingAccounts")
    private  Boolean sharingAccounts;

    @JsonProperty("admins")
    private List<@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) String> admins = null;

    @JsonProperty("users")
    private List<@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) String> users = null;


    public ParticipantIngest externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * External Unique Identifier.
     * @return externalId
     */
    @ApiModelProperty(required = true, value = "External Unique Identifier.")
    @NotNull @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalId() {
        return externalId;
    }

    public void setExternalId(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId) {
        this.externalId = externalId;
    }


    public ParticipantIngest sharingUsers(Boolean sharingUsers) {
        this.sharingUsers = sharingUsers;
        return this;
    }

    /**
     * Boolean value if the Participant is sharing users
     * @return sharingUsers
     */
    @ApiModelProperty(required = true, value = "Boolean value if the Participant is sharing users")
    @NotNull 
    public  Boolean getSharingUsers() {
        return sharingUsers;
    }

    public void setSharingUsers( Boolean sharingUsers) {
        this.sharingUsers = sharingUsers;
    }


    public ParticipantIngest sharingAccounts(Boolean sharingAccounts) {
        this.sharingAccounts = sharingAccounts;
        return this;
    }

    /**
     * Boolean value if the participant is sharing accounts
     * @return sharingAccounts
     */
    @ApiModelProperty(required = true, value = "Boolean value if the participant is sharing accounts")
    @NotNull 
    public  Boolean getSharingAccounts() {
        return sharingAccounts;
    }

    public void setSharingAccounts( Boolean sharingAccounts) {
        this.sharingAccounts = sharingAccounts;
    }


    public ParticipantIngest admins(List<String> admins) {
        this.admins = admins;
        return this;
    }

    public ParticipantIngest addAdminsItem(String adminsItem) {
        if (this.admins == null) {
            this.admins = new ArrayList<>();
        }
        this.admins.add(adminsItem);
        return this;
    }

    /**
     * Get admins
     * @return admins
     */
    @ApiModelProperty(value = "")
    
    public List<@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) String> getAdmins() {
        return admins;
    }

    public void setAdmins(List<@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) String> admins) {
        this.admins = admins;
    }


    public ParticipantIngest users(List<String> users) {
        this.users = users;
        return this;
    }

    public ParticipantIngest addUsersItem(String usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * User external ids
     * @return users
     */
    @ApiModelProperty(value = "User external ids")
    
    public List<@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) String> getUsers() {
        return users;
    }

    public void setUsers(List<@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) String> users) {
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
        ParticipantIngest participantIngest = (ParticipantIngest) o;
        return Objects.equals(this.externalId, participantIngest.externalId) &&
                Objects.equals(this.sharingUsers, participantIngest.sharingUsers) &&
                Objects.equals(this.sharingAccounts, participantIngest.sharingAccounts) &&
                Objects.equals(this.admins, participantIngest.admins) &&
                Objects.equals(this.users, participantIngest.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            externalId,
            sharingUsers,
            sharingAccounts,
            admins,
            users
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParticipantIngest {\n");
        
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        sharingUsers: ").append(toIndentedString(sharingUsers)).append("\n");
        sb.append("        sharingAccounts: ").append(toIndentedString(sharingAccounts)).append("\n");
        sb.append("        admins: ").append(toIndentedString(admins)).append("\n");
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

