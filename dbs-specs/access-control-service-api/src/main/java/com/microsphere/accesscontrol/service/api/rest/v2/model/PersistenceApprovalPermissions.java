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
import com.microsphere.accesscontrol.service.api.rest.v2.model.AdditionalPropertiesAware;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistenceApprovalPermissionsAllOf;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistenceApprovalPermissionsGetResponseBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * PersistenceApprovalPermissions
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PersistenceApprovalPermissions 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("approvalId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String approvalId;

    @JsonProperty("items")
    private List<PersistenceApprovalPermissionsGetResponseBody> items = new ArrayList<>();


    public PersistenceApprovalPermissions additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PersistenceApprovalPermissions putAdditionsItem(String key, String additionsItem) {
        if (this.additions == null) {
            this.additions = new HashMap<>();
        }
        this.additions.put(key, additionsItem);
        return this;
    }

    /**
     * Get additions
     * @return additions
     */
    @ApiModelProperty(value = "")
    
    public Map<String, String> getAdditions() {
        return additions;
    }

    public void setAdditions(Map<String, String> additions) {
        this.additions = additions;
    }


    public PersistenceApprovalPermissions approvalId(String approvalId) {
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


    public PersistenceApprovalPermissions items(List<PersistenceApprovalPermissionsGetResponseBody> items) {
        this.items = items;
        return this;
    }

    public PersistenceApprovalPermissions addItemsItem(PersistenceApprovalPermissionsGetResponseBody itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Get items
     * @return items
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
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
        PersistenceApprovalPermissions persistenceApprovalPermissions = (PersistenceApprovalPermissions) o;
        return Objects.equals(this.additions, persistenceApprovalPermissions.additions) &&
                Objects.equals(this.approvalId, persistenceApprovalPermissions.approvalId) &&
                Objects.equals(this.items, persistenceApprovalPermissions.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            approvalId,
            items
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistenceApprovalPermissions {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

