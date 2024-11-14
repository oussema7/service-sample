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
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * ServiceAgreementParticipantsGetResponseBodyAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ServiceAgreementParticipantsGetResponseBodyAllOf 
 {
    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id;

    @JsonProperty("externalId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId;

    @JsonProperty("name")
    private @Size(min=1, max=128)  String name;

    @JsonProperty("sharingUsers")
    private  Boolean sharingUsers;

    @JsonProperty("sharingAccounts")
    private  Boolean sharingAccounts;


    public ServiceAgreementParticipantsGetResponseBodyAllOf id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return id
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getId() {
        return id;
    }

    public void setId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id) {
        this.id = id;
    }


    public ServiceAgreementParticipantsGetResponseBodyAllOf externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * External Unique Identifier.
     * @return externalId
     */
    @ApiModelProperty(value = "External Unique Identifier.")
    @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalId() {
        return externalId;
    }

    public void setExternalId(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId) {
        this.externalId = externalId;
    }


    public ServiceAgreementParticipantsGetResponseBodyAllOf name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the Legal Entity
     * @return name
     */
    @ApiModelProperty(value = "Name of the Legal Entity")
    @Size(min=1, max=128) 
    public @Size(min=1, max=128)  String getName() {
        return name;
    }

    public void setName(@Size(min=1, max=128)  String name) {
        this.name = name;
    }


    public ServiceAgreementParticipantsGetResponseBodyAllOf sharingUsers(Boolean sharingUsers) {
        this.sharingUsers = sharingUsers;
        return this;
    }

    /**
     * Defines if the Legal Entity shares Users in the Service Agreement
     * @return sharingUsers
     */
    @ApiModelProperty(value = "Defines if the Legal Entity shares Users in the Service Agreement")
    
    public  Boolean getSharingUsers() {
        return sharingUsers;
    }

    public void setSharingUsers( Boolean sharingUsers) {
        this.sharingUsers = sharingUsers;
    }


    public ServiceAgreementParticipantsGetResponseBodyAllOf sharingAccounts(Boolean sharingAccounts) {
        this.sharingAccounts = sharingAccounts;
        return this;
    }

    /**
     * Defines if the Legal Entity shares Accounts in the Service Agreement
     * @return sharingAccounts
     */
    @ApiModelProperty(value = "Defines if the Legal Entity shares Accounts in the Service Agreement")
    
    public  Boolean getSharingAccounts() {
        return sharingAccounts;
    }

    public void setSharingAccounts( Boolean sharingAccounts) {
        this.sharingAccounts = sharingAccounts;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceAgreementParticipantsGetResponseBodyAllOf serviceAgreementParticipantsGetResponseBodyAllOf = (ServiceAgreementParticipantsGetResponseBodyAllOf) o;
        return Objects.equals(this.id, serviceAgreementParticipantsGetResponseBodyAllOf.id) &&
                Objects.equals(this.externalId, serviceAgreementParticipantsGetResponseBodyAllOf.externalId) &&
                Objects.equals(this.name, serviceAgreementParticipantsGetResponseBodyAllOf.name) &&
                Objects.equals(this.sharingUsers, serviceAgreementParticipantsGetResponseBodyAllOf.sharingUsers) &&
                Objects.equals(this.sharingAccounts, serviceAgreementParticipantsGetResponseBodyAllOf.sharingAccounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            externalId,
            name,
            sharingUsers,
            sharingAccounts
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceAgreementParticipantsGetResponseBodyAllOf {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        sharingUsers: ").append(toIndentedString(sharingUsers)).append("\n");
        sb.append("        sharingAccounts: ").append(toIndentedString(sharingAccounts)).append("\n");
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

