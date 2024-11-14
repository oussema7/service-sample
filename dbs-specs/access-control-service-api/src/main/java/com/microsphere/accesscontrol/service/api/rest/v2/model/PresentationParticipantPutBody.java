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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Add Participants in Service Agreement
 */
@ApiModel(description = "Add Participants in Service Agreement")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationParticipantPutBody 
 {
    @JsonProperty("action")
    private  PresentationAction action;

    @JsonProperty("externalServiceAgreementId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalServiceAgreementId;

    @JsonProperty("externalParticipantId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalParticipantId;

    @JsonProperty("sharingUsers")
    private  Boolean sharingUsers;

    @JsonProperty("sharingAccounts")
    private  Boolean sharingAccounts;


    public PresentationParticipantPutBody action(PresentationAction action) {
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


    public PresentationParticipantPutBody externalServiceAgreementId(String externalServiceAgreementId) {
        this.externalServiceAgreementId = externalServiceAgreementId;
        return this;
    }

    /**
     * External Unique Identifier.
     * @return externalServiceAgreementId
     */
    @ApiModelProperty(required = true, value = "External Unique Identifier.")
    @NotNull @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalServiceAgreementId() {
        return externalServiceAgreementId;
    }

    public void setExternalServiceAgreementId(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalServiceAgreementId) {
        this.externalServiceAgreementId = externalServiceAgreementId;
    }


    public PresentationParticipantPutBody externalParticipantId(String externalParticipantId) {
        this.externalParticipantId = externalParticipantId;
        return this;
    }

    /**
     * External Unique Identifier.
     * @return externalParticipantId
     */
    @ApiModelProperty(required = true, value = "External Unique Identifier.")
    @NotNull @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalParticipantId() {
        return externalParticipantId;
    }

    public void setExternalParticipantId(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalParticipantId) {
        this.externalParticipantId = externalParticipantId;
    }


    public PresentationParticipantPutBody sharingUsers(Boolean sharingUsers) {
        this.sharingUsers = sharingUsers;
        return this;
    }

    /**
     * Boolean value if the Participant is sharing users
     * @return sharingUsers
     */
    @ApiModelProperty(value = "Boolean value if the Participant is sharing users")
    
    public  Boolean getSharingUsers() {
        return sharingUsers;
    }

    public void setSharingUsers( Boolean sharingUsers) {
        this.sharingUsers = sharingUsers;
    }


    public PresentationParticipantPutBody sharingAccounts(Boolean sharingAccounts) {
        this.sharingAccounts = sharingAccounts;
        return this;
    }

    /**
     * Boolean value if the Participant is sharing accounts
     * @return sharingAccounts
     */
    @ApiModelProperty(value = "Boolean value if the Participant is sharing accounts")
    
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
        PresentationParticipantPutBody presentationParticipantPutBody = (PresentationParticipantPutBody) o;
        return Objects.equals(this.action, presentationParticipantPutBody.action) &&
                Objects.equals(this.externalServiceAgreementId, presentationParticipantPutBody.externalServiceAgreementId) &&
                Objects.equals(this.externalParticipantId, presentationParticipantPutBody.externalParticipantId) &&
                Objects.equals(this.sharingUsers, presentationParticipantPutBody.sharingUsers) &&
                Objects.equals(this.sharingAccounts, presentationParticipantPutBody.sharingAccounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            action,
            externalServiceAgreementId,
            externalParticipantId,
            sharingUsers,
            sharingAccounts
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationParticipantPutBody {\n");
        
        sb.append("        action: ").append(toIndentedString(action)).append("\n");
        sb.append("        externalServiceAgreementId: ").append(toIndentedString(externalServiceAgreementId)).append("\n");
        sb.append("        externalParticipantId: ").append(toIndentedString(externalParticipantId)).append("\n");
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

