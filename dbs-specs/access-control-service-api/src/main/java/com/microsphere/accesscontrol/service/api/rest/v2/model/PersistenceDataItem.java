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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistenceDataItemAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Data item object
 */
@ApiModel(description = "Data item object")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PersistenceDataItem 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id;

    @JsonProperty("dataType")
    private  String dataType;


    public PersistenceDataItem additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PersistenceDataItem putAdditionsItem(String key, String additionsItem) {
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


    public PersistenceDataItem id(String id) {
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


    public PersistenceDataItem dataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Type of the data item
     * @return dataType
     */
    @ApiModelProperty(value = "Type of the data item")
    
    public  String getDataType() {
        return dataType;
    }

    public void setDataType( String dataType) {
        this.dataType = dataType;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersistenceDataItem persistenceDataItem = (PersistenceDataItem) o;
        return Objects.equals(this.additions, persistenceDataItem.additions) &&
                Objects.equals(this.id, persistenceDataItem.id) &&
                Objects.equals(this.dataType, persistenceDataItem.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            id,
            dataType
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistenceDataItem {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        dataType: ").append(toIndentedString(dataType)).append("\n");
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

