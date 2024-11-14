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
import com.microsphere.accesscontrol.service.api.rest.v2.model.DataItemIds;
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
 * DataItemsPermissions
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class DataItemsPermissions 
 {
    @JsonProperty("functionName")
    private  String functionName;

    @JsonProperty("privilege")
    private  String privilege;

    @JsonProperty("dataItems")
    private List<DataItemIds> dataItems = new ArrayList<>();


    public DataItemsPermissions functionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Name of the business function
     * @return functionName
     */
    @ApiModelProperty(required = true, value = "Name of the business function")
    @NotNull 
    public  String getFunctionName() {
        return functionName;
    }

    public void setFunctionName( String functionName) {
        this.functionName = functionName;
    }


    public DataItemsPermissions privilege(String privilege) {
        this.privilege = privilege;
        return this;
    }

    /**
     * Name of the privilege
     * @return privilege
     */
    @ApiModelProperty(required = true, value = "Name of the privilege")
    @NotNull 
    public  String getPrivilege() {
        return privilege;
    }

    public void setPrivilege( String privilege) {
        this.privilege = privilege;
    }


    public DataItemsPermissions dataItems(List<DataItemIds> dataItems) {
        this.dataItems = dataItems;
        return this;
    }

    public DataItemsPermissions addDataItemsItem(DataItemIds dataItemsItem) {
        this.dataItems.add(dataItemsItem);
        return this;
    }

    /**
     * Get dataItems
     * @return dataItems
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid @Size(min=1) 
    public List<DataItemIds> getDataItems() {
        return dataItems;
    }

    public void setDataItems(List<DataItemIds> dataItems) {
        this.dataItems = dataItems;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataItemsPermissions dataItemsPermissions = (DataItemsPermissions) o;
        return Objects.equals(this.functionName, dataItemsPermissions.functionName) &&
                Objects.equals(this.privilege, dataItemsPermissions.privilege) &&
                Objects.equals(this.dataItems, dataItemsPermissions.dataItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            functionName,
            privilege,
            dataItems
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataItemsPermissions {\n");
        
        sb.append("        functionName: ").append(toIndentedString(functionName)).append("\n");
        sb.append("        privilege: ").append(toIndentedString(privilege)).append("\n");
        sb.append("        dataItems: ").append(toIndentedString(dataItems)).append("\n");
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

