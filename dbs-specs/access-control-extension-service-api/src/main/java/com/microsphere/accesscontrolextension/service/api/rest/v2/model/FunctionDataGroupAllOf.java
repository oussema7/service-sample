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
import com.microsphere.accesscontrolextension.service.api.rest.v2.model.GenericObjectId;
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
 * FunctionDataGroupAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:46.842949400+01:00[Africa/Tunis]")

public class FunctionDataGroupAllOf 
 {
    @JsonProperty("functionGroupId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") @Size(min=1, max=36)  String functionGroupId;

    @JsonProperty("dataGroupIds")
    private List<GenericObjectId> dataGroupIds = null;


    public FunctionDataGroupAllOf functionGroupId(String functionGroupId) {
        this.functionGroupId = functionGroupId;
        return this;
    }

    /**
     * Universally Unique IDentifier.
     * @return functionGroupId
     */
    @ApiModelProperty(value = "Universally Unique IDentifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") @Size(min=1, max=36) 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") @Size(min=1, max=36)  String getFunctionGroupId() {
        return functionGroupId;
    }

    public void setFunctionGroupId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") @Size(min=1, max=36)  String functionGroupId) {
        this.functionGroupId = functionGroupId;
    }


    public FunctionDataGroupAllOf dataGroupIds(List<GenericObjectId> dataGroupIds) {
        this.dataGroupIds = dataGroupIds;
        return this;
    }

    public FunctionDataGroupAllOf addDataGroupIdsItem(GenericObjectId dataGroupIdsItem) {
        if (this.dataGroupIds == null) {
            this.dataGroupIds = new ArrayList<>();
        }
        this.dataGroupIds.add(dataGroupIdsItem);
        return this;
    }

    /**
     * Get dataGroupIds
     * @return dataGroupIds
     */
    @ApiModelProperty(value = "")
    @Valid @Size(min=0) 
    public List<GenericObjectId> getDataGroupIds() {
        return dataGroupIds;
    }

    public void setDataGroupIds(List<GenericObjectId> dataGroupIds) {
        this.dataGroupIds = dataGroupIds;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FunctionDataGroupAllOf functionDataGroupAllOf = (FunctionDataGroupAllOf) o;
        return Objects.equals(this.functionGroupId, functionDataGroupAllOf.functionGroupId) &&
                Objects.equals(this.dataGroupIds, functionDataGroupAllOf.dataGroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            functionGroupId,
            dataGroupIds
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FunctionDataGroupAllOf {\n");
        
        sb.append("        functionGroupId: ").append(toIndentedString(functionGroupId)).append("\n");
        sb.append("        dataGroupIds: ").append(toIndentedString(dataGroupIds)).append("\n");
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

