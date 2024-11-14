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
 * Create an approval type
 */
@ApiModel(description = "Create an approval type")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PostApprovalTypeRequest 
 {
    @JsonProperty("name")
    private @Size(max=50)  String name;

    @JsonProperty("description")
    private @Size(max=255)  String description;

    @JsonProperty("rank")
    private @Min(1)  Integer rank;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PostApprovalTypeRequest name(String name) {
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


    public PostApprovalTypeRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * This gives a more in detailed description of the item and its purpose.
     * @return description
     */
    @ApiModelProperty(required = true, value = "This gives a more in detailed description of the item and its purpose.")
    @NotNull @Size(max=255) 
    public @Size(max=255)  String getDescription() {
        return description;
    }

    public void setDescription(@Size(max=255)  String description) {
        this.description = description;
    }


    public PostApprovalTypeRequest rank(Integer rank) {
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


    public PostApprovalTypeRequest additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PostApprovalTypeRequest putAdditionsItem(String key, String additionsItem) {
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
        PostApprovalTypeRequest postApprovalTypeRequest = (PostApprovalTypeRequest) o;
        return Objects.equals(this.name, postApprovalTypeRequest.name) &&
                Objects.equals(this.description, postApprovalTypeRequest.description) &&
                Objects.equals(this.rank, postApprovalTypeRequest.rank) &&
                Objects.equals(this.additions, postApprovalTypeRequest.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            description,
            rank,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostApprovalTypeRequest {\n");
        
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

