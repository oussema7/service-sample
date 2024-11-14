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
import com.microsphere.approval.service.api.rest.v2.model.GetApprovalTypeResponse;
import com.microsphere.approval.service.api.rest.v2.model.NotFoundError;
import com.microsphere.approval.service.api.rest.v2.model.PresentationPostBulkApprovalTypeAssignmentRequest;
import com.microsphere.approval.service.api.rest.v2.model.PresentationPostBulkApprovalTypeAssignmentResponse;
import com.microsphere.approval.service.api.rest.v2.model.PresentationPostFilterBulkApprovalTypeAssignmentRequest;
import com.microsphere.approval.service.api.rest.v2.model.PresentationPostFilterBulkApprovalTypeAssignmentResponse;
import com.microsphere.approval.service.api.rest.v2.model.PutApprovalTypeAssignmentRequest;
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
@Api(value = "ApprovalTypeAssignments", description = "the ApprovalTypeAssignments API")
public interface ApprovalTypeAssignmentsApi {

    /**
     * DELETE /service-api/v2/approval-type-assignments/{id} : This endpoint is used to delete the approval type that is assigned to the given job profile.
     * This endpoint is used to delete the approval type that is assigned to the given job profile.
     *
     * @param id The id of the job profile. (required)
     * @return approval type assignment is deleted (status code 204)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     */
    @ApiOperation(value = "This endpoint is used to delete the approval type that is assigned to the given job profile.", nickname = "deleteApprovalTypeAssignmentById", notes = "This endpoint is used to delete the approval type that is assigned to the given job profile.", tags={ "approval-type-assignments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "approval type assignment is deleted"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/approval-type-assignments/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteApprovalTypeAssignmentById(
            @ApiParam(value = "The id of the job profile.",required=true)
            @PathVariable("id")
            @Size(max=36)  String id

    );


    /**
     * GET /service-api/v2/approval-type-assignments/{id} : Retrieve the approval type that is assigned to the given job profile.
     * Retrieve the approval type that is assigned to the given job profile.
     *
     * @param id The id of the job profile. (required)
     * @return Detailed information about the approval type. (status code 200)
     *         or BadRequest (status code 400)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Retrieve the approval type that is assigned to the given job profile.", nickname = "getAssignedApprovalTypeById", notes = "Retrieve the approval type that is assigned to the given job profile.", response = GetApprovalTypeResponse.class, tags={ "approval-type-assignments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Detailed information about the approval type.", response = GetApprovalTypeResponse.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/approval-type-assignments/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GetApprovalTypeResponse> getAssignedApprovalTypeById(
            @ApiParam(value = "The id of the job profile.",required=true)
            @PathVariable("id")
            @Size(max=36)  String id

    );


    /**
     * POST /service-api/v2/approval-type-assignments/bulk
     * Bulk assign approval type
     *
     * @param presentationPostBulkApprovalTypeAssignmentRequest  (optional)
     * @return Approval type assignments created succesfully (status code 201)
     *         or BadRequestException (status code 400)
     */
    @ApiOperation(value = "", nickname = "postBulk", notes = "Bulk assign approval type", response = PresentationPostBulkApprovalTypeAssignmentResponse.class, tags={ "approval-type-assignments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Approval type assignments created succesfully", response = PresentationPostBulkApprovalTypeAssignmentResponse.class),
        @ApiResponse(code = 400, message = "BadRequestException", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/approval-type-assignments/bulk",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PresentationPostBulkApprovalTypeAssignmentResponse> postBulk(
            @ApiParam(value = ""  )
            @Valid
            @RequestBody(required = false) PresentationPostBulkApprovalTypeAssignmentRequest presentationPostBulkApprovalTypeAssignmentRequest

    );


    /**
     * POST /service-api/v2/approval-type-assignments/bulk/filter
     * Retrieve approval type assignments by job profile ids
     *
     * @param presentationPostFilterBulkApprovalTypeAssignmentRequest Retrieve approval type assignments by job profile ids (optional)
     * @return Assigned approval types assignments retrieved successfully (status code 200)
     */
    @ApiOperation(value = "", nickname = "postFilter", notes = "Retrieve approval type assignments by job profile ids", response = PresentationPostFilterBulkApprovalTypeAssignmentResponse.class, tags={ "approval-type-assignments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Assigned approval types assignments retrieved successfully", response = PresentationPostFilterBulkApprovalTypeAssignmentResponse.class) })
    @RequestMapping(value = "/service-api/v2/approval-type-assignments/bulk/filter",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PresentationPostFilterBulkApprovalTypeAssignmentResponse> postFilter(
            @ApiParam(value = "Retrieve approval type assignments by job profile ids"  )
            @Valid
            @RequestBody(required = false) PresentationPostFilterBulkApprovalTypeAssignmentRequest presentationPostFilterBulkApprovalTypeAssignmentRequest

    );


    /**
     * PUT /service-api/v2/approval-type-assignments/{id} : Updates an existing type assignment to a new one.
     * Updates an existing type assignment to a new one.
     *
     * @param id The id of the job profile. (required)
     * @param putApprovalTypeAssignmentRequest Updates an existing type assignment to a new one. (optional)
     * @return Approval type assignment updated successfully (status code 204)
     *         or BadRequest (status code 400)
     *         or Approval type assignment forbidden (status code 403)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Updates an existing type assignment to a new one.", nickname = "putApprovalTypeAssignmentById", notes = "Updates an existing type assignment to a new one.", tags={ "approval-type-assignments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Approval type assignment updated successfully"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Approval type assignment forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/approval-type-assignments/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> putApprovalTypeAssignmentById(
            @ApiParam(value = "The id of the job profile.",required=true)
            @PathVariable("id")
            @Size(max=36)  String id
,
                    @ApiParam(value = "Updates an existing type assignment to a new one."  )
            @Valid
            @RequestBody(required = false) PutApprovalTypeAssignmentRequest putApprovalTypeAssignmentRequest

    );

}
