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
 * ContextLegalEntitiesAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ContextLegalEntitiesAllOf 
 {
    @JsonProperty("legalEntities")
    private List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> legalEntities = null;


    public ContextLegalEntitiesAllOf legalEntities(List<String> legalEntities) {
        this.legalEntities = legalEntities;
        return this;
    }

    public ContextLegalEntitiesAllOf addLegalEntitiesItem(String legalEntitiesItem) {
        if (this.legalEntities == null) {
            this.legalEntities = new ArrayList<>();
        }
        this.legalEntities.add(legalEntitiesItem);
        return this;
    }

    /**
     * Get legalEntities
     * @return legalEntities
     */
    @ApiModelProperty(value = "")
    
    public List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> getLegalEntities() {
        return legalEntities;
    }

    public void setLegalEntities(List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> legalEntities) {
        this.legalEntities = legalEntities;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContextLegalEntitiesAllOf contextLegalEntitiesAllOf = (ContextLegalEntitiesAllOf) o;
        return Objects.equals(this.legalEntities, contextLegalEntitiesAllOf.legalEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            legalEntities
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContextLegalEntitiesAllOf {\n");
        
        sb.append("        legalEntities: ").append(toIndentedString(legalEntities)).append("\n");
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

