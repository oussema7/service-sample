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
 * PresentationItemIdentifier
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationItemIdentifier 
 {
    @JsonProperty("internalIdIdentifier")
    private @Size(min=1, max=36)  String internalIdIdentifier;

    @JsonProperty("externalIdIdentifier")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalIdIdentifier;


    public PresentationItemIdentifier internalIdIdentifier(String internalIdIdentifier) {
        this.internalIdIdentifier = internalIdIdentifier;
        return this;
    }

    /**
     * Data item id.
     * @return internalIdIdentifier
     */
    @ApiModelProperty(value = "Data item id.")
    @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getInternalIdIdentifier() {
        return internalIdIdentifier;
    }

    public void setInternalIdIdentifier(@Size(min=1, max=36)  String internalIdIdentifier) {
        this.internalIdIdentifier = internalIdIdentifier;
    }


    public PresentationItemIdentifier externalIdIdentifier(String externalIdIdentifier) {
        this.externalIdIdentifier = externalIdIdentifier;
        return this;
    }

    /**
     * External Unique Identifier.
     * @return externalIdIdentifier
     */
    @ApiModelProperty(value = "External Unique Identifier.")
    @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalIdIdentifier() {
        return externalIdIdentifier;
    }

    public void setExternalIdIdentifier(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalIdIdentifier) {
        this.externalIdIdentifier = externalIdIdentifier;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationItemIdentifier presentationItemIdentifier = (PresentationItemIdentifier) o;
        return Objects.equals(this.internalIdIdentifier, presentationItemIdentifier.internalIdIdentifier) &&
                Objects.equals(this.externalIdIdentifier, presentationItemIdentifier.externalIdIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            internalIdIdentifier,
            externalIdIdentifier
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationItemIdentifier {\n");
        
        sb.append("        internalIdIdentifier: ").append(toIndentedString(internalIdIdentifier)).append("\n");
        sb.append("        externalIdIdentifier: ").append(toIndentedString(externalIdIdentifier)).append("\n");
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

