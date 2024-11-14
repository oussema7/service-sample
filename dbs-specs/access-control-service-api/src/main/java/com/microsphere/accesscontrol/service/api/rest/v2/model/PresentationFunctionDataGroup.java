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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationGenericObjectId;
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
 * PresentationFunctionDataGroup
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationFunctionDataGroup 
 {
    @JsonProperty("functionGroupId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String functionGroupId;

    @JsonProperty("dataGroupIds")
    private List<PresentationGenericObjectId> dataGroupIds = new ArrayList<>();


    public PresentationFunctionDataGroup functionGroupId(String functionGroupId) {
        this.functionGroupId = functionGroupId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return functionGroupId
     */
    @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
    @NotNull @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getFunctionGroupId() {
        return functionGroupId;
    }

    public void setFunctionGroupId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String functionGroupId) {
        this.functionGroupId = functionGroupId;
    }


    public PresentationFunctionDataGroup dataGroupIds(List<PresentationGenericObjectId> dataGroupIds) {
        this.dataGroupIds = dataGroupIds;
        return this;
    }

    public PresentationFunctionDataGroup addDataGroupIdsItem(PresentationGenericObjectId dataGroupIdsItem) {
        this.dataGroupIds.add(dataGroupIdsItem);
        return this;
    }

    /**
     * Get dataGroupIds
     * @return dataGroupIds
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid @Size(min=0) 
    public List<PresentationGenericObjectId> getDataGroupIds() {
        return dataGroupIds;
    }

    public void setDataGroupIds(List<PresentationGenericObjectId> dataGroupIds) {
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
        PresentationFunctionDataGroup presentationFunctionDataGroup = (PresentationFunctionDataGroup) o;
        return Objects.equals(this.functionGroupId, presentationFunctionDataGroup.functionGroupId) &&
                Objects.equals(this.dataGroupIds, presentationFunctionDataGroup.dataGroupIds);
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
        sb.append("class PresentationFunctionDataGroup {\n");
        
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

