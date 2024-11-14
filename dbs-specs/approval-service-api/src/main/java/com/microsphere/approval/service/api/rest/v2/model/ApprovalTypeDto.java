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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * An approval type, also known as approval level, is used to allow a hierarchy of approvals to grant to various users or groups to allow complex policies to be defined.
 */
@ApiModel(description = "An approval type, also known as approval level, is used to allow a hierarchy of approvals to grant to various users or groups to allow complex policies to be defined.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class ApprovalTypeDto 
 {
    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String id;

    @JsonProperty("name")
    private @Size(max=50)  String name;

    @JsonProperty("description")
    private @Size(max=255)  String description;

    @JsonProperty("rank")
    private @Min(1)  Integer rank;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public ApprovalTypeDto id(String id) {
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


    public ApprovalTypeDto name(String name) {
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


    public ApprovalTypeDto description(String description) {
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


    public ApprovalTypeDto rank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * The rank determines which item takes precedence over another. 1 means highest precedence and 100 takes lower precedence than 10. Must be unique!
     * minimum: 1
     * @return rank
     */
    @ApiModelProperty(required = true, value = "The rank determines which item takes precedence over another. 1 means highest precedence and 100 takes lower precedence than 10. Must be unique!")
    @NotNull @Min(1) 
    public @Min(1)  Integer getRank() {
        return rank;
    }

    public void setRank(@Min(1)  Integer rank) {
        this.rank = rank;
    }


    public ApprovalTypeDto additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public ApprovalTypeDto putAdditionsItem(String key, String additionsItem) {
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
        ApprovalTypeDto approvalTypeDto = (ApprovalTypeDto) o;
        return Objects.equals(this.id, approvalTypeDto.id) &&
                Objects.equals(this.name, approvalTypeDto.name) &&
                Objects.equals(this.description, approvalTypeDto.description) &&
                Objects.equals(this.rank, approvalTypeDto.rank) &&
                Objects.equals(this.additions, approvalTypeDto.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            description,
            rank,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApprovalTypeDto {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        rank: ").append(toIndentedString(rank)).append("\n");
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

