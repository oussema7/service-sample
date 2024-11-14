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
 * Permissions data group
 */
@ApiModel(description = "Permissions data group")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PermissionDataGroupData 
 {
    @JsonProperty("dataGroupType")
    private  String dataGroupType;

    @JsonProperty("dataGroupIds")
    private List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> dataGroupIds = null;


    public PermissionDataGroupData dataGroupType(String dataGroupType) {
        this.dataGroupType = dataGroupType;
        return this;
    }

    /**
     * Data group type
     * @return dataGroupType
     */
    @ApiModelProperty(value = "Data group type")
    
    public  String getDataGroupType() {
        return dataGroupType;
    }

    public void setDataGroupType( String dataGroupType) {
        this.dataGroupType = dataGroupType;
    }


    public PermissionDataGroupData dataGroupIds(List<String> dataGroupIds) {
        this.dataGroupIds = dataGroupIds;
        return this;
    }

    public PermissionDataGroupData addDataGroupIdsItem(String dataGroupIdsItem) {
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
    
    public List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> getDataGroupIds() {
        return dataGroupIds;
    }

    public void setDataGroupIds(List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> dataGroupIds) {
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
        PermissionDataGroupData permissionDataGroupData = (PermissionDataGroupData) o;
        return Objects.equals(this.dataGroupType, permissionDataGroupData.dataGroupType) &&
                Objects.equals(this.dataGroupIds, permissionDataGroupData.dataGroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            dataGroupType,
            dataGroupIds
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionDataGroupData {\n");
        
        sb.append("        dataGroupType: ").append(toIndentedString(dataGroupType)).append("\n");
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

