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
import com.microsphere.approval.service.api.rest.v2.model.PresentationApprovalDetailDto;
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
 * Result of getting the approval details.
 */
@ApiModel(description = "Result of getting the approval details.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PostFilterApprovalsDetailsResponse 
 {
    @JsonProperty("approvalDetails")
    private  PresentationApprovalDetailDto approvalDetails;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PostFilterApprovalsDetailsResponse approvalDetails(PresentationApprovalDetailDto approvalDetails) {
        this.approvalDetails = approvalDetails;
        return this;
    }

    /**
     * Get approvalDetails
     * @return approvalDetails
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  PresentationApprovalDetailDto getApprovalDetails() {
        return approvalDetails;
    }

    public void setApprovalDetails( PresentationApprovalDetailDto approvalDetails) {
        this.approvalDetails = approvalDetails;
    }


    public PostFilterApprovalsDetailsResponse additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PostFilterApprovalsDetailsResponse putAdditionsItem(String key, String additionsItem) {
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
        PostFilterApprovalsDetailsResponse postFilterApprovalsDetailsResponse = (PostFilterApprovalsDetailsResponse) o;
        return Objects.equals(this.approvalDetails, postFilterApprovalsDetailsResponse.approvalDetails) &&
                Objects.equals(this.additions, postFilterApprovalsDetailsResponse.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            approvalDetails,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostFilterApprovalsDetailsResponse {\n");
        
        sb.append("        approvalDetails: ").append(toIndentedString(approvalDetails)).append("\n");
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
