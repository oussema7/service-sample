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
import com.microsphere.approval.service.api.rest.v2.model.LogicalPolicyDetailsDto;
import com.microsphere.approval.service.api.rest.v2.model.PolicyItemDetailsDto;
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
 * The policy defines the rules to determine when an item is fully approved. This policy contains the full details, including the approval type of each policy item.
 */
@ApiModel(description = "The policy defines the rules to determine when an item is fully approved. This policy contains the full details, including the approval type of each policy item.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PolicyDetailsDto 
 {
    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String id;

    @JsonProperty("name")
    private @Size(max=50)  String name;

    @JsonProperty("description")
    private @Size(max=255)  String description;

    @JsonProperty("items")
    private List<PolicyItemDetailsDto> items = null;

    @JsonProperty("logicalItems")
    private List<LogicalPolicyDetailsDto> logicalItems = null;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PolicyDetailsDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Universal Unique Identifier, 
     * @return id
     */
    @ApiModelProperty(required = true, value = "Universal Unique Identifier, ")
    @NotNull @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$") 
    public @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String getId() {
        return id;
    }

    public void setId(@Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String id) {
        this.id = id;
    }


    public PolicyDetailsDto name(String name) {
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


    public PolicyDetailsDto description(String description) {
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


    public PolicyDetailsDto items(List<PolicyItemDetailsDto> items) {
        this.items = items;
        return this;
    }

    public PolicyDetailsDto addItemsItem(PolicyItemDetailsDto itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * A list of approval types and the number of each approval type is required. If there are 0 items it acts as a zero-approval policy.
     * @return items
     */
    @ApiModelProperty(value = "A list of approval types and the number of each approval type is required. If there are 0 items it acts as a zero-approval policy.")
    @Valid @Size(min=0, max=50) 
    public List<PolicyItemDetailsDto> getItems() {
        return items;
    }

    public void setItems(List<PolicyItemDetailsDto> items) {
        this.items = items;
    }


    public PolicyDetailsDto logicalItems(List<LogicalPolicyDetailsDto> logicalItems) {
        this.logicalItems = logicalItems;
        return this;
    }

    public PolicyDetailsDto addLogicalItemsItem(LogicalPolicyDetailsDto logicalItemsItem) {
        if (this.logicalItems == null) {
            this.logicalItems = new ArrayList<>();
        }
        this.logicalItems.add(logicalItemsItem);
        return this;
    }

    /**
     * A list of policy items that have some logic attached to them.
     * @return logicalItems
     */
    @ApiModelProperty(value = "A list of policy items that have some logic attached to them.")
    @Valid @Size(min=0, max=5) 
    public List<LogicalPolicyDetailsDto> getLogicalItems() {
        return logicalItems;
    }

    public void setLogicalItems(List<LogicalPolicyDetailsDto> logicalItems) {
        this.logicalItems = logicalItems;
    }


    public PolicyDetailsDto additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PolicyDetailsDto putAdditionsItem(String key, String additionsItem) {
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
        PolicyDetailsDto policyDetailsDto = (PolicyDetailsDto) o;
        return Objects.equals(this.id, policyDetailsDto.id) &&
                Objects.equals(this.name, policyDetailsDto.name) &&
                Objects.equals(this.description, policyDetailsDto.description) &&
                Objects.equals(this.items, policyDetailsDto.items) &&
                Objects.equals(this.logicalItems, policyDetailsDto.logicalItems) &&
                Objects.equals(this.additions, policyDetailsDto.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
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
        sb.append("class PolicyDetailsDto {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
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

