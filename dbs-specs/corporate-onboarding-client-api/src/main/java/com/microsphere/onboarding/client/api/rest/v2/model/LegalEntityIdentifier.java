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
package com.microsphere.onboarding.client.api.rest.v2.model;

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
 * Legal entity identifier
 */
@ApiModel(description = "Legal entity identifier")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")

public class LegalEntityIdentifier 
 {
    @JsonProperty("id")
    private  String id;

    @JsonProperty("externalId")
    private  String externalId;


    public LegalEntityIdentifier id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Identifier
     * @return id
     */
    @ApiModelProperty(value = "Identifier")
    
    public  String getId() {
        return id;
    }

    public void setId( String id) {
        this.id = id;
    }


    public LegalEntityIdentifier externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Identifier
     * @return externalId
     */
    @ApiModelProperty(value = "Identifier")
    
    public  String getExternalId() {
        return externalId;
    }

    public void setExternalId( String externalId) {
        this.externalId = externalId;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LegalEntityIdentifier legalEntityIdentifier = (LegalEntityIdentifier) o;
        return Objects.equals(this.id, legalEntityIdentifier.id) &&
                Objects.equals(this.externalId, legalEntityIdentifier.externalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            externalId
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LegalEntityIdentifier {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
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

