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
 * An object which contain data group id and data item ids.
 */
@ApiModel(description = "An object which contain data group id and data item ids.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PersistenceDataGroupDataItems 
 {
    @JsonProperty("id")
    private  String id;

    @JsonProperty("items")
    private List<String> items = null;


    public PersistenceDataGroupDataItems id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Data group id
     * @return id
     */
    @ApiModelProperty(value = "Data group id")
    
    public  String getId() {
        return id;
    }

    public void setId( String id) {
        this.id = id;
    }


    public PersistenceDataGroupDataItems items(List<String> items) {
        this.items = items;
        return this;
    }

    public PersistenceDataGroupDataItems addItemsItem(String itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * List of data item ids
     * @return items
     */
    @ApiModelProperty(value = "List of data item ids")
    
    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersistenceDataGroupDataItems persistenceDataGroupDataItems = (PersistenceDataGroupDataItems) o;
        return Objects.equals(this.id, persistenceDataGroupDataItems.id) &&
                Objects.equals(this.items, persistenceDataGroupDataItems.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            items
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistenceDataGroupDataItems {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        items: ").append(toIndentedString(items)).append("\n");
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

