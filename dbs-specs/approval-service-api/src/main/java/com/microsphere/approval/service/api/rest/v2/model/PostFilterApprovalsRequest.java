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
 * This is a POST request with filter parameters in the request body.
 */
@ApiModel(description = "This is a POST request with filter parameters in the request body.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PostFilterApprovalsRequest 
 {
    @JsonProperty("canApprove")
    private  Boolean canApprove;

    @JsonProperty("canReject")
    private  Boolean canReject;

    @JsonProperty("functions")
    private List<@Size(max=32) String> functions = null;

    @JsonProperty("approvalIds")
    private List<@Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$") String> approvalIds = null;

    @JsonProperty("userId")
    private @Size(min=1, max=36)  String userId;

    @JsonProperty("serviceAgreementId")
    private @Size(min=1, max=36)  String serviceAgreementId;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PostFilterApprovalsRequest canApprove(Boolean canApprove) {
        this.canApprove = canApprove;
        return this;
    }

    /**
     * If true, it will only return approvals the user with the given job profile summary is able to approve. This filter is not compatible with 'approvalIds'!
     * @return canApprove
     */
    @ApiModelProperty(value = "If true, it will only return approvals the user with the given job profile summary is able to approve. This filter is not compatible with 'approvalIds'!")
    
    public  Boolean getCanApprove() {
        return canApprove;
    }

    public void setCanApprove( Boolean canApprove) {
        this.canApprove = canApprove;
    }


    public PostFilterApprovalsRequest canReject(Boolean canReject) {
        this.canReject = canReject;
        return this;
    }

    /**
     * If true, it will only return approvals the user with the given job profile summary is able to reject. This filter is not compatible with 'approvalIds'!
     * @return canReject
     */
    @ApiModelProperty(value = "If true, it will only return approvals the user with the given job profile summary is able to reject. This filter is not compatible with 'approvalIds'!")
    
    public  Boolean getCanReject() {
        return canReject;
    }

    public void setCanReject( Boolean canReject) {
        this.canReject = canReject;
    }


    public PostFilterApprovalsRequest functions(List<String> functions) {
        this.functions = functions;
        return this;
    }

    public PostFilterApprovalsRequest addFunctionsItem(String functionsItem) {
        if (this.functions == null) {
            this.functions = new ArrayList<>();
        }
        this.functions.add(functionsItem);
        return this;
    }

    /**
     * List of functions used to narrow down the results. This filter is not compatible with 'approvalIds'!
     * @return functions
     */
    @ApiModelProperty(value = "List of functions used to narrow down the results. This filter is not compatible with 'approvalIds'!")
    
    public List<@Size(max=32) String> getFunctions() {
        return functions;
    }

    public void setFunctions(List<@Size(max=32) String> functions) {
        this.functions = functions;
    }


    public PostFilterApprovalsRequest approvalIds(List<String> approvalIds) {
        this.approvalIds = approvalIds;
        return this;
    }

    public PostFilterApprovalsRequest addApprovalIdsItem(String approvalIdsItem) {
        if (this.approvalIds == null) {
            this.approvalIds = new ArrayList<>();
        }
        this.approvalIds.add(approvalIdsItem);
        return this;
    }

    /**
     * A list of ID's of the approval to retrieve. This filter is not compatible with other filters!
     * @return approvalIds
     */
    @ApiModelProperty(value = "A list of ID's of the approval to retrieve. This filter is not compatible with other filters!")
    
    public List<@Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$") String> getApprovalIds() {
        return approvalIds;
    }

    public void setApprovalIds(List<@Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$") String> approvalIds) {
        this.approvalIds = approvalIds;
    }


    public PostFilterApprovalsRequest userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return userId
     */
    @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @NotNull @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getUserId() {
        return userId;
    }

    public void setUserId(@Size(min=1, max=36)  String userId) {
        this.userId = userId;
    }


    public PostFilterApprovalsRequest serviceAgreementId(String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
        return this;
    }

    /**
     * A simple definition for an internal identifier. Can be UUID but doesn't have to.
     * @return serviceAgreementId
     */
    @ApiModelProperty(required = true, value = "A simple definition for an internal identifier. Can be UUID but doesn't have to.")
    @NotNull @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getServiceAgreementId() {
        return serviceAgreementId;
    }

    public void setServiceAgreementId(@Size(min=1, max=36)  String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
    }


    public PostFilterApprovalsRequest additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PostFilterApprovalsRequest putAdditionsItem(String key, String additionsItem) {
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
        PostFilterApprovalsRequest postFilterApprovalsRequest = (PostFilterApprovalsRequest) o;
        return Objects.equals(this.canApprove, postFilterApprovalsRequest.canApprove) &&
                Objects.equals(this.canReject, postFilterApprovalsRequest.canReject) &&
                Objects.equals(this.functions, postFilterApprovalsRequest.functions) &&
                Objects.equals(this.approvalIds, postFilterApprovalsRequest.approvalIds) &&
                Objects.equals(this.userId, postFilterApprovalsRequest.userId) &&
                Objects.equals(this.serviceAgreementId, postFilterApprovalsRequest.serviceAgreementId) &&
                Objects.equals(this.additions, postFilterApprovalsRequest.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            canApprove,
            canReject,
            functions,
            approvalIds,
            userId,
            serviceAgreementId,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostFilterApprovalsRequest {\n");
        
        sb.append("        canApprove: ").append(toIndentedString(canApprove)).append("\n");
        sb.append("        canReject: ").append(toIndentedString(canReject)).append("\n");
        sb.append("        functions: ").append(toIndentedString(functions)).append("\n");
        sb.append("        approvalIds: ").append(toIndentedString(approvalIds)).append("\n");
        sb.append("        userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
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

