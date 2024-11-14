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
 * Data group data
 */
@ApiModel(description = "Data group data")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class DataGroupData 
 {
    @JsonProperty("dataGroupId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String dataGroupId;

    @JsonProperty("dataItemIds")
    private List<@Size(min=1, max=64) String> dataItemIds = null;


    public DataGroupData dataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return dataGroupId
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getDataGroupId() {
        return dataGroupId;
    }

    public void setDataGroupId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String dataGroupId) {
        this.dataGroupId = dataGroupId;
    }


    public DataGroupData dataItemIds(List<String> dataItemIds) {
        this.dataItemIds = dataItemIds;
        return this;
    }

    public DataGroupData addDataItemIdsItem(String dataItemIdsItem) {
        if (this.dataItemIds == null) {
            this.dataItemIds = new ArrayList<>();
        }
        this.dataItemIds.add(dataItemIdsItem);
        return this;
    }

    /**
     * Get dataItemIds
     * @return dataItemIds
     */
    @ApiModelProperty(value = "")
    
    public List<@Size(min=1, max=64) String> getDataItemIds() {
        return dataItemIds;
    }

    public void setDataItemIds(List<@Size(min=1, max=64) String> dataItemIds) {
        this.dataItemIds = dataItemIds;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataGroupData dataGroupData = (DataGroupData) o;
        return Objects.equals(this.dataGroupId, dataGroupData.dataGroupId) &&
                Objects.equals(this.dataItemIds, dataGroupData.dataItemIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            dataGroupId,
            dataItemIds
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataGroupData {\n");
        
        sb.append("        dataGroupId: ").append(toIndentedString(dataGroupId)).append("\n");
        sb.append("        dataItemIds: ").append(toIndentedString(dataItemIds)).append("\n");
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

