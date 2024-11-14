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
 * Returns the number of records that were affected by the delete action.
 */
@ApiModel(description = "Returns the number of records that were affected by the delete action.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class DeletePolicyAssignmentResponse 
 {
    @JsonProperty("numberOfRowsAffected")
    private  Integer numberOfRowsAffected;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public DeletePolicyAssignmentResponse numberOfRowsAffected(Integer numberOfRowsAffected) {
        this.numberOfRowsAffected = numberOfRowsAffected;
        return this;
    }

    /**
     * Number of deleted items.
     * @return numberOfRowsAffected
     */
    @ApiModelProperty(required = true, value = "Number of deleted items.")
    @NotNull 
    public  Integer getNumberOfRowsAffected() {
        return numberOfRowsAffected;
    }

    public void setNumberOfRowsAffected( Integer numberOfRowsAffected) {
        this.numberOfRowsAffected = numberOfRowsAffected;
    }


    public DeletePolicyAssignmentResponse additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public DeletePolicyAssignmentResponse putAdditionsItem(String key, String additionsItem) {
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
        DeletePolicyAssignmentResponse deletePolicyAssignmentResponse = (DeletePolicyAssignmentResponse) o;
        return Objects.equals(this.numberOfRowsAffected, deletePolicyAssignmentResponse.numberOfRowsAffected) &&
                Objects.equals(this.additions, deletePolicyAssignmentResponse.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            numberOfRowsAffected,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePolicyAssignmentResponse {\n");
        
        sb.append("        numberOfRowsAffected: ").append(toIndentedString(numberOfRowsAffected)).append("\n");
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

