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
 * Dataaccessgroupsforfunctionaccessgroupitem
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class Dataaccessgroupsforfunctionaccessgroupitem 
 {
    @JsonProperty("functionAccessGroupId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String functionAccessGroupId;

    @JsonProperty("dataAccessGroupIds")
    private List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> dataAccessGroupIds = null;


    public Dataaccessgroupsforfunctionaccessgroupitem functionAccessGroupId(String functionAccessGroupId) {
        this.functionAccessGroupId = functionAccessGroupId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return functionAccessGroupId
     */
    @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
    @NotNull @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getFunctionAccessGroupId() {
        return functionAccessGroupId;
    }

    public void setFunctionAccessGroupId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String functionAccessGroupId) {
        this.functionAccessGroupId = functionAccessGroupId;
    }


    public Dataaccessgroupsforfunctionaccessgroupitem dataAccessGroupIds(List<String> dataAccessGroupIds) {
        this.dataAccessGroupIds = dataAccessGroupIds;
        return this;
    }

    public Dataaccessgroupsforfunctionaccessgroupitem addDataAccessGroupIdsItem(String dataAccessGroupIdsItem) {
        if (this.dataAccessGroupIds == null) {
            this.dataAccessGroupIds = new ArrayList<>();
        }
        this.dataAccessGroupIds.add(dataAccessGroupIdsItem);
        return this;
    }

    /**
     * Get dataAccessGroupIds
     * @return dataAccessGroupIds
     */
    @ApiModelProperty(value = "")
    
    public List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> getDataAccessGroupIds() {
        return dataAccessGroupIds;
    }

    public void setDataAccessGroupIds(List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> dataAccessGroupIds) {
        this.dataAccessGroupIds = dataAccessGroupIds;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dataaccessgroupsforfunctionaccessgroupitem dataaccessgroupsforfunctionaccessgroupitem = (Dataaccessgroupsforfunctionaccessgroupitem) o;
        return Objects.equals(this.functionAccessGroupId, dataaccessgroupsforfunctionaccessgroupitem.functionAccessGroupId) &&
                Objects.equals(this.dataAccessGroupIds, dataaccessgroupsforfunctionaccessgroupitem.dataAccessGroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            functionAccessGroupId,
            dataAccessGroupIds
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dataaccessgroupsforfunctionaccessgroupitem {\n");
        
        sb.append("        functionAccessGroupId: ").append(toIndentedString(functionAccessGroupId)).append("\n");
        sb.append("        dataAccessGroupIds: ").append(toIndentedString(dataAccessGroupIds)).append("\n");
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

