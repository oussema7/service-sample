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
 * Participant
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class Participant 
 {
    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id;

    @JsonProperty("sharingUsers")
    private  Boolean sharingUsers;

    @JsonProperty("sharingAccounts")
    private  Boolean sharingAccounts;

    @JsonProperty("admins")
    private List<@Size(min=0, max=36) String> admins = null;


    public Participant id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return id
     */
    @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
    @NotNull @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getId() {
        return id;
    }

    public void setId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id) {
        this.id = id;
    }


    public Participant sharingUsers(Boolean sharingUsers) {
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


    public Participant sharingAccounts(Boolean sharingAccounts) {
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


    public Participant admins(List<String> admins) {
        this.admins = admins;
        return this;
    }

    public Participant addAdminsItem(String adminsItem) {
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
    
    public List<@Size(min=0, max=36) String> getAdmins() {
        return admins;
    }

    public void setAdmins(List<@Size(min=0, max=36) String> admins) {
        this.admins = admins;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Participant participant = (Participant) o;
        return Objects.equals(this.id, participant.id) &&
                Objects.equals(this.sharingUsers, participant.sharingUsers) &&
                Objects.equals(this.sharingAccounts, participant.sharingAccounts) &&
                Objects.equals(this.admins, participant.admins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            sharingUsers,
            sharingAccounts,
            admins
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Participant {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        sharingUsers: ").append(toIndentedString(sharingUsers)).append("\n");
        sb.append("        sharingAccounts: ").append(toIndentedString(sharingAccounts)).append("\n");
        sb.append("        admins: ").append(toIndentedString(admins)).append("\n");
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

