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
import com.microsphere.accesscontrolextension.service.api.rest.v2.model.FunctionDataGroup;
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
 * ApprovalPermissionsAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:46.842949400+01:00[Africa/Tunis]")

public class ApprovalPermissionsAllOf 
 {
    @JsonProperty("approvalId")
    private  String approvalId;

    @JsonProperty("items")
    private List<FunctionDataGroup> items = null;


    public ApprovalPermissionsAllOf approvalId(String approvalId) {
        this.approvalId = approvalId;
        return this;
    }

    /**
     * Id of approval request.
     * @return approvalId
     */
    @ApiModelProperty(value = "Id of approval request.")
    
    public  String getApprovalId() {
        return approvalId;
    }

    public void setApprovalId( String approvalId) {
        this.approvalId = approvalId;
    }


    public ApprovalPermissionsAllOf items(List<FunctionDataGroup> items) {
        this.items = items;
        return this;
    }

    public ApprovalPermissionsAllOf addItemsItem(FunctionDataGroup itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Get items
     * @return items
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<FunctionDataGroup> getItems() {
        return items;
    }

    public void setItems(List<FunctionDataGroup> items) {
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
        ApprovalPermissionsAllOf approvalPermissionsAllOf = (ApprovalPermissionsAllOf) o;
        return Objects.equals(this.approvalId, approvalPermissionsAllOf.approvalId) &&
                Objects.equals(this.items, approvalPermissionsAllOf.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            approvalId,
            items
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApprovalPermissionsAllOf {\n");
        
        sb.append("        approvalId: ").append(toIndentedString(approvalId)).append("\n");
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

