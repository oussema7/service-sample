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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationParticipantPutBody;
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
 * PresentationParticipantBatchUpdate
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationParticipantBatchUpdate 
 {
    @JsonProperty("participants")
    private List<PresentationParticipantPutBody> participants = null;


    public PresentationParticipantBatchUpdate participants(List<PresentationParticipantPutBody> participants) {
        this.participants = participants;
        return this;
    }

    public PresentationParticipantBatchUpdate addParticipantsItem(PresentationParticipantPutBody participantsItem) {
        if (this.participants == null) {
            this.participants = new ArrayList<>();
        }
        this.participants.add(participantsItem);
        return this;
    }

    /**
     * Get participants
     * @return participants
     */
    @ApiModelProperty(value = "")
    @Valid @Size(min=1, max=200) 
    public List<PresentationParticipantPutBody> getParticipants() {
        return participants;
    }

    public void setParticipants(List<PresentationParticipantPutBody> participants) {
        this.participants = participants;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationParticipantBatchUpdate presentationParticipantBatchUpdate = (PresentationParticipantBatchUpdate) o;
        return Objects.equals(this.participants, presentationParticipantBatchUpdate.participants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            participants
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationParticipantBatchUpdate {\n");
        
        sb.append("        participants: ").append(toIndentedString(participants)).append("\n");
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

