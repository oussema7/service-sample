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
 * Response body to verify if the user can create an approval and if it is the final approver.
 */
@ApiModel(description = "Response body to verify if the user can create an approval and if it is the final approver.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PostVerifyApprovalResponse 
 {
    @JsonProperty("canApprove")
    private  Boolean canApprove;

    @JsonProperty("finalApprover")
    private  Boolean finalApprover;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PostVerifyApprovalResponse canApprove(Boolean canApprove) {
        this.canApprove = canApprove;
        return this;
    }

    /**
     * This flag indicates if the user (with his current context) that is requesting the approval can approve it, depending on the policy that applies.
     * @return canApprove
     */
    @ApiModelProperty(required = true, value = "This flag indicates if the user (with his current context) that is requesting the approval can approve it, depending on the policy that applies.")
    @NotNull 
    public  Boolean getCanApprove() {
        return canApprove;
    }

    public void setCanApprove( Boolean canApprove) {
        this.canApprove = canApprove;
    }


    public PostVerifyApprovalResponse finalApprover(Boolean finalApprover) {
        this.finalApprover = finalApprover;
        return this;
    }

    /**
     * This flag indicates if the user (with his current context) is the final approver that is needed.
     * @return finalApprover
     */
    @ApiModelProperty(required = true, value = "This flag indicates if the user (with his current context) is the final approver that is needed.")
    @NotNull 
    public  Boolean getFinalApprover() {
        return finalApprover;
    }

    public void setFinalApprover( Boolean finalApprover) {
        this.finalApprover = finalApprover;
    }


    public PostVerifyApprovalResponse additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PostVerifyApprovalResponse putAdditionsItem(String key, String additionsItem) {
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
        PostVerifyApprovalResponse postVerifyApprovalResponse = (PostVerifyApprovalResponse) o;
        return Objects.equals(this.canApprove, postVerifyApprovalResponse.canApprove) &&
                Objects.equals(this.finalApprover, postVerifyApprovalResponse.finalApprover) &&
                Objects.equals(this.additions, postVerifyApprovalResponse.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            canApprove,
            finalApprover,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostVerifyApprovalResponse {\n");
        
        sb.append("        canApprove: ").append(toIndentedString(canApprove)).append("\n");
        sb.append("        finalApprover: ").append(toIndentedString(finalApprover)).append("\n");
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

