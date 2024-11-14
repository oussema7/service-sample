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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationFunctionDataGroup;
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
 * ListOfFunctionGroupsWithDataGroups
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ListOfFunctionGroupsWithDataGroups 
 {
    @JsonProperty("items")
    private List<PresentationFunctionDataGroup> items = new ArrayList<>();


    public ListOfFunctionGroupsWithDataGroups items(List<PresentationFunctionDataGroup> items) {
        this.items = items;
        return this;
    }

    public ListOfFunctionGroupsWithDataGroups addItemsItem(PresentationFunctionDataGroup itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Get items
     * @return items
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public List<PresentationFunctionDataGroup> getItems() {
        return items;
    }

    public void setItems(List<PresentationFunctionDataGroup> items) {
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
        ListOfFunctionGroupsWithDataGroups listOfFunctionGroupsWithDataGroups = (ListOfFunctionGroupsWithDataGroups) o;
        return Objects.equals(this.items, listOfFunctionGroupsWithDataGroups.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            items
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOfFunctionGroupsWithDataGroups {\n");
        
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

