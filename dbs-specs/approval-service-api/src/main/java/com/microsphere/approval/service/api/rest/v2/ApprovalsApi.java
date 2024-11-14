/*
Boat Generator configuration:
    useBeanValidation: true
    useOptional: false
    addServletRequest: false
    addBindingResult: false
    useLombokAnnotations: false
    openApiNullable: true
    useSetForUniqueItems: false
    useWithModifiers: false
*/
package com.microsphere.approval.service.api.rest.v2;

import com.microsphere.approval.service.api.rest.v2.model.BadRequestError;
import com.microsphere.approval.service.api.rest.v2.model.ForbiddenError;
import com.microsphere.approval.service.api.rest.v2.model.NotFoundError;
import com.microsphere.approval.service.api.rest.v2.model.PostApprovalRecordRequest;
import com.microsphere.approval.service.api.rest.v2.model.PostApprovalRecordStatusUpdateRequest;
import com.microsphere.approval.service.api.rest.v2.model.PostFilterApprovalsDetailsRequest;
import com.microsphere.approval.service.api.rest.v2.model.PostFilterApprovalsDetailsResponse;
import com.microsphere.approval.service.api.rest.v2.model.PostVerifyApprovalRequest;
import com.microsphere.approval.service.api.rest.v2.model.PostVerifyApprovalResponse;
import com.microsphere.approval.service.api.rest.v2.model.PresentationGetApprovalDetailResponse;
import com.microsphere.approval.service.api.rest.v2.model.PresentationPostApprovalRequest;
import com.microsphere.approval.service.api.rest.v2.model.PresentationPostApprovalResponse;
import com.microsphere.approval.service.api.rest.v2.model.PresentationPostFilterApprovalsRequest;
import com.microsphere.approval.service.api.rest.v2.model.PresentationPostFilterApprovalsResponse;
import com.microsphere.approval.service.api.rest.v2.model.PutUpdateStatusRequest;
import com.microsphere.approval.service.api.rest.v2.model.ReauthUnauthorizedError;
import java.util.Set;
import java.util.LinkedHashSet;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;


import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")
@Api(value = "Approvals", description = "the Approvals API")
public interface ApprovalsApi {

    /**
     * GET /service-api/v2/approvals/{approvalId}
     * Get approval detail by id
     *
     * @param approvalId The Id of the approval request. Example: \&quot;b3e4692d-6772-4fb2-9446-b8f4607f49b1\&quot; (required)
     * @param serviceAgreementId Internal id of the Service agreement (required)
     * @param userId Internal id of the user (required)
     * @param enrichUsersWithFullName Tells the approval service to enrich the approval and records with the users&#39; \&quot;Full name\&quot; and \&quot;External user id\&quot;. (optional, default to false)
     * @return Detailed information about the approval. (status code 200)
     *         or BadRequest (status code 400)
     *         or NotFound (status code 404)
     *         or Forbidden (status code 403)
     */
    @ApiOperation(value = "", nickname = "getApprovalById", notes = "Get approval detail by id", response = PresentationGetApprovalDetailResponse.class, tags={ "approvals", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Detailed information about the approval.", response = PresentationGetApprovalDetailResponse.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/approvals/{approvalId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<PresentationGetApprovalDetailResponse> getApprovalById(
            @ApiParam(value = "The Id of the approval request. Example: \"b3e4692d-6772-4fb2-9446-b8f4607f49b1\"",required=true)
            @PathVariable("approvalId")
            @Size(max=36)  String approvalId
,
                    @ApiParam(value = "Internal id of the Service agreement", required = true) @Valid
            @RequestParam(value = "serviceAgreementId", required = true)
            @NotNull
            
             String serviceAgreementId
,
                    @ApiParam(value = "Internal id of the user", required = true) @Valid
            @RequestParam(value = "userId", required = true)
            @NotNull
            
             String userId
,
                    @ApiParam(value = "Tells the approval service to enrich the approval and records with the users' \"Full name\" and \"External user id\".", defaultValue = "false") @Valid
            @RequestParam(value = "enrichUsersWithFullName", required = false, defaultValue="false")
            
             Boolean enrichUsersWithFullName

    );


    /**
     * POST /service-api/v2/approvals
     * Create an approval
     *
     * @param presentationPostApprovalRequest Create an approval (optional)
     * @return Approval created successfully (status code 201)
     *         or BadRequest (status code 400)
     *         or Post approval with pre-approve unauthorized (status code 401)
     *         or Post approval with pre-approve forbidden (status code 403)
     */
    @ApiOperation(value = "", nickname = "postApproval", notes = "Create an approval", response = PresentationPostApprovalResponse.class, tags={ "approvals", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Approval created successfully", response = PresentationPostApprovalResponse.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 401, message = "Post approval with pre-approve unauthorized", response = ReauthUnauthorizedError.class),
        @ApiResponse(code = 403, message = "Post approval with pre-approve forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/approvals",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PresentationPostApprovalResponse> postApproval(
            @ApiParam(value = "Create an approval"  )
            @Valid
            @RequestBody(required = false) PresentationPostApprovalRequest presentationPostApprovalRequest

    );


    /**
     * POST /service-api/v2/approvals/{approvalId}/records
     * Approve or reject an approval. Depending on the applicable policy, the status of the approval may or may not change as a result of this action.
     *
     * @param approvalId The Id of the approval request to update. Example: \&quot;b3e4692d-6772-4fb2-9446-b8f4607f49b1\&quot; (required)
     * @param filterCreatedRecord If this set to true, only created record is returned in the response. Default is set to false. (optional, default to false)
     * @param postApprovalRecordRequest Approve or reject an approval. Depending on the applicable policy, the status of the approval may or may not change as a result of this action. (optional)
     * @return The request was processed successfully and the response contains the new state of the approval. (status code 200)
     *         or BadRequest (status code 400)
     *         or Post approval record unauthorized (status code 401)
     *         or Post approval record forbidden (status code 403)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "", nickname = "postApprovalRecordByApprovalId", notes = "Approve or reject an approval. Depending on the applicable policy, the status of the approval may or may not change as a result of this action.", response = PresentationPostApprovalResponse.class, tags={ "approvals", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request was processed successfully and the response contains the new state of the approval.", response = PresentationPostApprovalResponse.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 401, message = "Post approval record unauthorized", response = ReauthUnauthorizedError.class),
        @ApiResponse(code = 403, message = "Post approval record forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/approvals/{approvalId}/records",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PresentationPostApprovalResponse> postApprovalRecordByApprovalId(
            @ApiParam(value = "The Id of the approval request to update. Example: \"b3e4692d-6772-4fb2-9446-b8f4607f49b1\"",required=true)
            @PathVariable("approvalId")
            @Size(max=36)  String approvalId
,
                    @ApiParam(value = "If this set to true, only created record is returned in the response. Default is set to false.", defaultValue = "false") @Valid
            @RequestParam(value = "filterCreatedRecord", required = false, defaultValue="false")
            
             Boolean filterCreatedRecord
,
                    @ApiParam(value = "Approve or reject an approval. Depending on the applicable policy, the status of the approval may or may not change as a result of this action."  )
            @Valid
            @RequestBody(required = false) PostApprovalRecordRequest postApprovalRecordRequest

    );


    /**
     * POST /service-api/v2/approvals/filter
     * Filter approvals
     *
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. This allows to point to the record to start the selection from. (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. This value may not be negative.  (optional, default to 10)
     * @param presentationPostFilterApprovalsRequest  (optional)
     * @return Filtered list of approvals (status code 200)
     *         or The request to filter for approvals can be invalid for several reasons. See the examples. (status code 400)
     *         or Insufficient permissions due to a lack of job profiles for the relevant business functions. E.g. only a job profile for contacts but none for any of the payment orders business functions when filtering for approvable payment orders. (status code 403)
     */
    @ApiOperation(value = "", nickname = "postFilterApprovals", notes = "Filter approvals", response = PresentationPostFilterApprovalsResponse.class, tags={ "approvals", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Filtered list of approvals", response = PresentationPostFilterApprovalsResponse.class),
        @ApiResponse(code = 400, message = "The request to filter for approvals can be invalid for several reasons. See the examples.", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Insufficient permissions due to a lack of job profiles for the relevant business functions. E.g. only a job profile for contacts but none for any of the payment orders business functions when filtering for approvable payment orders.", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/approvals/filter",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PresentationPostFilterApprovalsResponse> postFilterApprovals(
            @ApiParam(value = "Page Number. Skip over pages of elements by specifying a start value for the query", defaultValue = "0") @Valid
            @RequestParam(value = "from", required = false, defaultValue="0")
            
             Integer from
,
                    @ApiParam(value = "Record UUID. This allows to point to the record to start the selection from.", defaultValue = "") @Valid
            @RequestParam(value = "cursor", required = false, defaultValue="")
            
             String cursor
,
                    @ApiParam(value = "Limit the number of elements on the response. This value may not be negative. ", defaultValue = "10") @Valid
            @RequestParam(value = "size", required = false, defaultValue="10")
            
             Integer size
,
                    @ApiParam(value = ""  )
            @Valid
            @RequestBody(required = false) PresentationPostFilterApprovalsRequest presentationPostFilterApprovalsRequest

    );


    /**
     * POST /service-api/v2/approvals/{approvalId}/filter
     * Find approval by id
     *
     * @param approvalId The Id of the approval request. Example: \&quot;b3e4692d-6772-4fb2-9446-b8f4607f49b1\&quot; (required)
     * @param postFilterApprovalsDetailsRequest  (optional)
     * @return Detailed information about the approval. (status code 200)
     *         or BadRequest (status code 400)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "", nickname = "postFilterByApprovalId", notes = "Find approval by id", response = PostFilterApprovalsDetailsResponse.class, tags={ "approvals", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Detailed information about the approval.", response = PostFilterApprovalsDetailsResponse.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/approvals/{approvalId}/filter",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PostFilterApprovalsDetailsResponse> postFilterByApprovalId(
            @ApiParam(value = "The Id of the approval request. Example: \"b3e4692d-6772-4fb2-9446-b8f4607f49b1\"",required=true)
            @PathVariable("approvalId")
            @Size(max=36)  String approvalId
,
                    @ApiParam(value = ""  )
            @Valid
            @RequestBody(required = false) PostFilterApprovalsDetailsRequest postFilterApprovalsDetailsRequest

    );


    /**
     * POST /service-api/v2/approval-records/{approvalRecordId}/update-status
     * Using this endpoint status of an approval record can be updated. The status of the approval also may change as a result of this action.
     *
     * @param approvalRecordId The id of the approval record (required)
     * @param filterUpdatedRecord If this set to true, only updated record is returned in the response. Default is set to false. (optional, default to false)
     * @param postApprovalRecordStatusUpdateRequest Using this endpoint status of an approval record can be updated. (optional)
     * @return The response body of approval record update action. This response contains the approval along with the updated approval record. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "", nickname = "postStatusUpdateByApprovalRecordId", notes = "Using this endpoint status of an approval record can be updated. The status of the approval also may change as a result of this action.", response = PresentationPostApprovalResponse.class, tags={ "approvals", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The response body of approval record update action. This response contains the approval along with the updated approval record.", response = PresentationPostApprovalResponse.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/approval-records/{approvalRecordId}/update-status",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PresentationPostApprovalResponse> postStatusUpdateByApprovalRecordId(
            @ApiParam(value = "The id of the approval record",required=true)
            @PathVariable("approvalRecordId")
            @Size(max=36)  String approvalRecordId
,
                    @ApiParam(value = "If this set to true, only updated record is returned in the response. Default is set to false.", defaultValue = "false") @Valid
            @RequestParam(value = "filterUpdatedRecord", required = false, defaultValue="false")
            
             Boolean filterUpdatedRecord
,
                    @ApiParam(value = "Using this endpoint status of an approval record can be updated."  )
            @Valid
            @RequestBody(required = false) PostApprovalRecordStatusUpdateRequest postApprovalRecordStatusUpdateRequest

    );


    /**
     * POST /service-api/v2/approvals/verify
     * Verify approval rights
     *
     * @param postVerifyApprovalRequest  (optional)
     * @return Response containing canApprove and finalApprover fields (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     */
    @ApiOperation(value = "", nickname = "postVerify", notes = "Verify approval rights", response = PostVerifyApprovalResponse.class, tags={ "approvals", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing canApprove and finalApprover fields", response = PostVerifyApprovalResponse.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/approvals/verify",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PostVerifyApprovalResponse> postVerify(
            @ApiParam(value = ""  )
            @Valid
            @RequestBody(required = false) PostVerifyApprovalRequest postVerifyApprovalRequest

    );


    /**
     * PUT /service-api/v2/approvals/{approvalId}/status : With this endpoint the status of an approval request can be set to CANCELLED.
     * With this endpoint the status of an approval request can be set to CANCELLED.
     *
     * @param approvalId The Id of the approval request. Example: \&quot;b3e4692d-6772-4fb2-9446-b8f4607f49b1\&quot; (required)
     * @param putUpdateStatusRequest With this endpoint the status of an approval request can be set to CANCELLED. (optional)
     * @return The request was processed successfully and the approval request status is the sent status. (status code 204)
     *         or If the approval status from the request is any other state then CANCELLED (status code 400)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "With this endpoint the status of an approval request can be set to CANCELLED.", nickname = "putStatusByApprovalId", notes = "With this endpoint the status of an approval request can be set to CANCELLED.", tags={ "approvals", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The request was processed successfully and the approval request status is the sent status."),
        @ApiResponse(code = 400, message = "If the approval status from the request is any other state then CANCELLED", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/approvals/{approvalId}/status",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> putStatusByApprovalId(
            @ApiParam(value = "The Id of the approval request. Example: \"b3e4692d-6772-4fb2-9446-b8f4607f49b1\"",required=true)
            @PathVariable("approvalId")
            @Size(max=36)  String approvalId
,
                    @ApiParam(value = "With this endpoint the status of an approval request can be set to CANCELLED."  )
            @Valid
            @RequestBody(required = false) PutUpdateStatusRequest putUpdateStatusRequest

    );

}
