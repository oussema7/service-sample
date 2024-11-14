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
import com.microsphere.accesscontrol.service.api.rest.v2.model.AdditionalPropertiesAware;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ContextLegalEntitiesAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * List of legal entity ids
 */
@ApiModel(description = "List of legal entity ids")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ContextLegalEntities 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("legalEntities")
    private List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> legalEntities = null;


    public ContextLegalEntities additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public ContextLegalEntities putAdditionsItem(String key, String additionsItem) {
        if (this.additions == null) {
            this.additions = new HashMap<>();
        }
        this.additions.put(key, additionsItem);
        return this;
    }

    /**
     * Get additions
     * @return additions
     */
    @ApiModelProperty(value = "")
    
    public Map<String, String> getAdditions() {
        return additions;
    }

    public void setAdditions(Map<String, String> additions) {
        this.additions = additions;
    }


    public ContextLegalEntities legalEntities(List<String> legalEntities) {
        this.legalEntities = legalEntities;
        return this;
    }

    public ContextLegalEntities addLegalEntitiesItem(String legalEntitiesItem) {
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
        ContextLegalEntities contextLegalEntities = (ContextLegalEntities) o;
        return Objects.equals(this.additions, contextLegalEntities.additions) &&
                Objects.equals(this.legalEntities, contextLegalEntities.legalEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            legalEntities
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContextLegalEntities {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

