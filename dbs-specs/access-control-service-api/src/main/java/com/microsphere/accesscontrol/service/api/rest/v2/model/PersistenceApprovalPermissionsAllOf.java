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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistenceApprovalPermissionsGetResponseBody;
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
 * PersistenceApprovalPermissionsAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PersistenceApprovalPermissionsAllOf 
 {
    @JsonProperty("approvalId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String approvalId;

    @JsonProperty("items")
    private List<PersistenceApprovalPermissionsGetResponseBody> items = null;


    public PersistenceApprovalPermissionsAllOf approvalId(String approvalId) {
        this.approvalId = approvalId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return approvalId
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String approvalId) {
        this.approvalId = approvalId;
    }


    public PersistenceApprovalPermissionsAllOf items(List<PersistenceApprovalPermissionsGetResponseBody> items) {
        this.items = items;
        return this;
    }

    public PersistenceApprovalPermissionsAllOf addItemsItem(PersistenceApprovalPermissionsGetResponseBody itemsItem) {
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
    public List<PersistenceApprovalPermissionsGetResponseBody> getItems() {
        return items;
    }

    public void setItems(List<PersistenceApprovalPermissionsGetResponseBody> items) {
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
        PersistenceApprovalPermissionsAllOf persistenceApprovalPermissionsAllOf = (PersistenceApprovalPermissionsAllOf) o;
        return Objects.equals(this.approvalId, persistenceApprovalPermissionsAllOf.approvalId) &&
                Objects.equals(this.items, persistenceApprovalPermissionsAllOf.items);
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
        sb.append("class PersistenceApprovalPermissionsAllOf {\n");
        
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

