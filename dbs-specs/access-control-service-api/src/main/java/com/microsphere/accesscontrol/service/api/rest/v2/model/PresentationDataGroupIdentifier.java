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
import com.microsphere.accesscontrol.service.api.rest.v2.model.DataGroupNameIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * PresentationDataGroupIdentifier
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationDataGroupIdentifier 
 {
    @JsonProperty("idIdentifier")
    private @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=36)  String idIdentifier;

    @JsonProperty("nameIdentifier")
    private  DataGroupNameIdentifier nameIdentifier = null;


    public PresentationDataGroupIdentifier idIdentifier(String idIdentifier) {
        this.idIdentifier = idIdentifier;
        return this;
    }

    /**
     * Entity ID.
     * @return idIdentifier
     */
    @ApiModelProperty(value = "Entity ID.")
    @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=36) 
    public @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=36)  String getIdIdentifier() {
        return idIdentifier;
    }

    public void setIdIdentifier(@Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=36)  String idIdentifier) {
        this.idIdentifier = idIdentifier;
    }


    public PresentationDataGroupIdentifier nameIdentifier(DataGroupNameIdentifier nameIdentifier) {
        this.nameIdentifier = nameIdentifier;
        return this;
    }

    /**
     * Get nameIdentifier
     * @return nameIdentifier
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  DataGroupNameIdentifier getNameIdentifier() {
        return nameIdentifier;
    }

    public void setNameIdentifier( DataGroupNameIdentifier nameIdentifier) {
        this.nameIdentifier = nameIdentifier;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationDataGroupIdentifier presentationDataGroupIdentifier = (PresentationDataGroupIdentifier) o;
        return Objects.equals(this.idIdentifier, presentationDataGroupIdentifier.idIdentifier) &&
                Objects.equals(this.nameIdentifier, presentationDataGroupIdentifier.nameIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            idIdentifier,
            nameIdentifier
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationDataGroupIdentifier {\n");
        
        sb.append("        idIdentifier: ").append(toIndentedString(idIdentifier)).append("\n");
        sb.append("        nameIdentifier: ").append(toIndentedString(nameIdentifier)).append("\n");
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

