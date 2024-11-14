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
import com.microsphere.approval.service.api.rest.v2.model.ApprovalDto;
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
 * A filtered list of approvals, based on the request parameters
 */
@ApiModel(description = "A filtered list of approvals, based on the request parameters")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PostFilterApprovalsResponse 
 {
    @JsonProperty("approvals")
    private List<ApprovalDto> approvals = new ArrayList<>();

    @JsonProperty("cursor")
    private @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String cursor;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PostFilterApprovalsResponse approvals(List<ApprovalDto> approvals) {
        this.approvals = approvals;
        return this;
    }

    public PostFilterApprovalsResponse addApprovalsItem(ApprovalDto approvalsItem) {
        this.approvals.add(approvalsItem);
        return this;
    }

    /**
     * Get approvals
     * @return approvals
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public List<ApprovalDto> getApprovals() {
        return approvals;
    }

    public void setApprovals(List<ApprovalDto> approvals) {
        this.approvals = approvals;
    }


    public PostFilterApprovalsResponse cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /**
     * Universal Unique Identifier, 
     * @return cursor
     */
    @ApiModelProperty(value = "Universal Unique Identifier, ")
    @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$") 
    public @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String getCursor() {
        return cursor;
    }

    public void setCursor(@Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  String cursor) {
        this.cursor = cursor;
    }


    public PostFilterApprovalsResponse additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PostFilterApprovalsResponse putAdditionsItem(String key, String additionsItem) {
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
        PostFilterApprovalsResponse postFilterApprovalsResponse = (PostFilterApprovalsResponse) o;
        return Objects.equals(this.approvals, postFilterApprovalsResponse.approvals) &&
                Objects.equals(this.cursor, postFilterApprovalsResponse.cursor) &&
                Objects.equals(this.additions, postFilterApprovalsResponse.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            approvals,
            cursor,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostFilterApprovalsResponse {\n");
        
        sb.append("        approvals: ").append(toIndentedString(approvals)).append("\n");
        sb.append("        cursor: ").append(toIndentedString(cursor)).append("\n");
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

