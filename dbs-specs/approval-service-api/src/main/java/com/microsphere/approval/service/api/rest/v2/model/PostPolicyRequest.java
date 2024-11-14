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
package com.microsphere.approval.service.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsphere.approval.service.api.rest.v2.model.CreatePolicyItemDto;
import com.microsphere.approval.service.api.rest.v2.model.LogicalPolicyItemDto;
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
 * Request body to create a new approval policy. If &#39;logicalItems&#39; is used it will be used to create a complex policy. If &#x60;items&#x60; is used but not &#39;logicalItems&#39; a simple policy is created. If both are omitted a zero-approval policy is created.
 */
@ApiModel(description = "Request body to create a new approval policy. If 'logicalItems' is used it will be used to create a complex policy. If `items` is used but not 'logicalItems' a simple policy is created. If both are omitted a zero-approval policy is created.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PostPolicyRequest 
 {
    @JsonProperty("name")
    private @Size(max=50)  String name;

    @JsonProperty("description")
    private @Size(max=255)  String description;

    @JsonProperty("items")
    private List<CreatePolicyItemDto> items = null;

    @JsonProperty("logicalItems")
    private List<LogicalPolicyItemDto> logicalItems = null;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PostPolicyRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of an item.
     * @return name
     */
    @ApiModelProperty(required = true, value = "The name of an item.")
    @NotNull @Size(max=50) 
    public @Size(max=50)  String getName() {
        return name;
    }

    public void setName(@Size(max=50)  String name) {
        this.name = name;
    }


    public PostPolicyRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * This gives a more in detailed description of the item and its purpose.
     * @return description
     */
    @ApiModelProperty(value = "This gives a more in detailed description of the item and its purpose.")
    @Size(max=255) 
    public @Size(max=255)  String getDescription() {
        return description;
    }

    public void setDescription(@Size(max=255)  String description) {
        this.description = description;
    }


    public PostPolicyRequest items(List<CreatePolicyItemDto> items) {
        this.items = items;
        return this;
    }

    public PostPolicyRequest addItemsItem(CreatePolicyItemDto itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * A list of approval types and the number of each approval type is required. Can be empty to represent a zero-approval policy.
     * @return items
     */
    @ApiModelProperty(value = "A list of approval types and the number of each approval type is required. Can be empty to represent a zero-approval policy.")
    @Valid @Size(min=0, max=50) 
    public List<CreatePolicyItemDto> getItems() {
        return items;
    }

    public void setItems(List<CreatePolicyItemDto> items) {
        this.items = items;
    }


    public PostPolicyRequest logicalItems(List<LogicalPolicyItemDto> logicalItems) {
        this.logicalItems = logicalItems;
        return this;
    }

    public PostPolicyRequest addLogicalItemsItem(LogicalPolicyItemDto logicalItemsItem) {
        if (this.logicalItems == null) {
            this.logicalItems = new ArrayList<>();
        }
        this.logicalItems.add(logicalItemsItem);
        return this;
    }

    /**
     * A policy declaration that allows you to add logical operators to the contained policy items. If this field is specified the items field is ignored.
     * @return logicalItems
     */
    @ApiModelProperty(value = "A policy declaration that allows you to add logical operators to the contained policy items. If this field is specified the items field is ignored.")
    @Valid @Size(min=0, max=5) 
    public List<LogicalPolicyItemDto> getLogicalItems() {
        return logicalItems;
    }

    public void setLogicalItems(List<LogicalPolicyItemDto> logicalItems) {
        this.logicalItems = logicalItems;
    }


    public PostPolicyRequest additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PostPolicyRequest putAdditionsItem(String key, String additionsItem) {
        if (this.additions == null) {
            this.additions = new HashMap<>();
        }
        this.additions.put(key, additionsItem);
        return this;
    }

    /**
     * Additional properties
     * @return additions
     */
    @ApiModelProperty(value = "Additional properties")
    
    public Map<String, String> getAdditions() {
        return additions;
    }

    public void setAdditions(Map<String, String> additions) {
        this.additions = additions;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostPolicyRequest postPolicyRequest = (PostPolicyRequest) o;
        return Objects.equals(this.name, postPolicyRequest.name) &&
                Objects.equals(this.description, postPolicyRequest.description) &&
                Objects.equals(this.items, postPolicyRequest.items) &&
                Objects.equals(this.logicalItems, postPolicyRequest.logicalItems) &&
                Objects.equals(this.additions, postPolicyRequest.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            description,
            items,
            logicalItems,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPolicyRequest {\n");
        
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        items: ").append(toIndentedString(items)).append("\n");
        sb.append("        logicalItems: ").append(toIndentedString(logicalItems)).append("\n");
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

