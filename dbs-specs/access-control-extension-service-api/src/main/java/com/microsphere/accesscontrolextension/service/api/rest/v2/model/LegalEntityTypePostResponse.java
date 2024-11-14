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
package com.microsphere.accesscontrolextension.service.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsphere.accesscontrolextension.service.api.rest.v2.model.LegalEntityType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Get legal entity type request
 */
@ApiModel(description = "Get legal entity type request")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:46.842949400+01:00[Africa/Tunis]")

public class LegalEntityTypePostResponse 
 {
    @JsonProperty("externalId")
    private  String externalId;

    @JsonProperty("type")
    private  LegalEntityType type;


    public LegalEntityTypePostResponse externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Identifier
     * @return externalId
     */
    @ApiModelProperty(required = true, value = "Identifier")
    @NotNull 
    public  String getExternalId() {
        return externalId;
    }

    public void setExternalId( String externalId) {
        this.externalId = externalId;
    }


    public LegalEntityTypePostResponse type(LegalEntityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  LegalEntityType getType() {
        return type;
    }

    public void setType( LegalEntityType type) {
        this.type = type;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LegalEntityTypePostResponse legalEntityTypePostResponse = (LegalEntityTypePostResponse) o;
        return Objects.equals(this.externalId, legalEntityTypePostResponse.externalId) &&
                Objects.equals(this.type, legalEntityTypePostResponse.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            externalId,
            type
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LegalEntityTypePostResponse {\n");
        
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        type: ").append(toIndentedString(type)).append("\n");
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

