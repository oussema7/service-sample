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
 * DataItemIds
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class DataItemIds 
 {
    @JsonProperty("itemId")
    private  String itemId;

    @JsonProperty("itemType")
    private  String itemType;


    public DataItemIds itemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * Data item id
     * @return itemId
     */
    @ApiModelProperty(required = true, value = "Data item id")
    @NotNull 
    public  String getItemId() {
        return itemId;
    }

    public void setItemId( String itemId) {
        this.itemId = itemId;
    }


    public DataItemIds itemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    /**
     * Data item type
     * @return itemType
     */
    @ApiModelProperty(required = true, value = "Data item type")
    @NotNull 
    public  String getItemType() {
        return itemType;
    }

    public void setItemType( String itemType) {
        this.itemType = itemType;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataItemIds dataItemIds = (DataItemIds) o;
        return Objects.equals(this.itemId, dataItemIds.itemId) &&
                Objects.equals(this.itemType, dataItemIds.itemType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            itemId,
            itemType
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataItemIds {\n");
        
        sb.append("        itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("        itemType: ").append(toIndentedString(itemType)).append("\n");
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

