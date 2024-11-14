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
 * DataGroupNameIdentifierAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class DataGroupNameIdentifierAllOf 
 {
    @JsonProperty("dataGroupType")
    private @Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String dataGroupType;


    public DataGroupNameIdentifierAllOf dataGroupType(String dataGroupType) {
        this.dataGroupType = dataGroupType;
        return this;
    }

    /**
     * Data group type
     * @return dataGroupType
     */
    @ApiModelProperty(value = "Data group type")
    @Pattern(regexp="^\\S+$") @Size(min=1, max=36) 
    public @Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String getDataGroupType() {
        return dataGroupType;
    }

    public void setDataGroupType(@Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String dataGroupType) {
        this.dataGroupType = dataGroupType;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataGroupNameIdentifierAllOf dataGroupNameIdentifierAllOf = (DataGroupNameIdentifierAllOf) o;
        return Objects.equals(this.dataGroupType, dataGroupNameIdentifierAllOf.dataGroupType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            dataGroupType
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataGroupNameIdentifierAllOf {\n");
        
        sb.append("        dataGroupType: ").append(toIndentedString(dataGroupType)).append("\n");
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

