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
import com.microsphere.approval.service.api.rest.v2.model.PresentationDeletePolicyAssignmentResponse;
import com.microsphere.approval.service.api.rest.v2.model.PresentationPostFilterPolicyAssignmentRequest;
import com.microsphere.approval.service.api.rest.v2.model.PresentationPostFilterPolicyAssignmentResponse;
import com.microsphere.approval.service.api.rest.v2.model.PresentationPostPolicyAssignmentBulkRequest;
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
@Api(value = "PolicyAssignments", description = "the PolicyAssignments API")
public interface PolicyAssignmentsApi {

    /**
     * DELETE /service-api/v2/policy-assignments : Delete policies assigned to a service agreement. Optionally a resource or function can be specified to delete only a subset.
     * Delete policies assigned to a service agreement. Optionally a resource or function can be specified to delete only a subset.
     *
     * @param serviceAgreementId The external serviceAgreementId to remove the policies assigned to. It will be mapped to the internal id by the service.  (optional)
     * @param resource When specified, only policies assigned to this resource will be deleted. E.g. \&quot;Payments\&quot; to delete every policy assigned to any Payments function. (optional)
     * @param function When specified, only policies assigned to this function will be deleted. E.g. \&quot;SEPA CT\&quot; to delete the policies assigned to this function only. (optional)
     * @return Policies are deleted (status code 200)
     *         or Forbidden (status code 403)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Delete policies assigned to a service agreement. Optionally a resource or function can be specified to delete only a subset.", nickname = "deletePolicyAssignment", notes = "Delete policies assigned to a service agreement. Optionally a resource or function can be specified to delete only a subset.", response = PresentationDeletePolicyAssignmentResponse.class, tags={ "policy-assignments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Policies are deleted", response = PresentationDeletePolicyAssignmentResponse.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/policy-assignments",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<PresentationDeletePolicyAssignmentResponse> deletePolicyAssignment(
            @ApiParam(value = "The external serviceAgreementId to remove the policies assigned to. It will be mapped to the internal id by the service. ") @Valid
            @RequestParam(value = "serviceAgreementId", required = false)
            
            @Size(max=36)  String serviceAgreementId
,
                    @ApiParam(value = "When specified, only policies assigned to this resource will be deleted. E.g. \"Payments\" to delete every policy assigned to any Payments function.") @Valid
            @RequestParam(value = "resource", required = false)
            
            @Size(max=32)  String resource
,
                    @ApiParam(value = "When specified, only policies assigned to this function will be deleted. E.g. \"SEPA CT\" to delete the policies assigned to this function only.") @Valid
            @RequestParam(value = "function", required = false)
            
            @Size(max=32)  String function

    );


    /**
     * POST /service-api/v2/policy-assignments/bulk
     * Policy Assignments bulk ingestion
     *
     * @param presentationPostPolicyAssignmentBulkRequest  (optional)
     * @return Policies successfully assigned (status code 204)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "", nickname = "postCreatesBulkPolicyAssignments", notes = "Policy Assignments bulk ingestion", tags={ "policy-assignments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Policies successfully assigned"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/policy-assignments/bulk",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> postCreatesBulkPolicyAssignments(
            @ApiParam(value = ""  )
            @Valid
            @RequestBody(required = false) PresentationPostPolicyAssignmentBulkRequest presentationPostPolicyAssignmentBulkRequest

    );


    /**
     * POST /service-api/v2/policy-assignments/filter : Filter assigned policies by service agreement and optional additional criteria.
     * Filter assigned policies by service agreement and optional additional criteria
     *
     * @param presentationPostFilterPolicyAssignmentRequest Filter assigned policies by service agreement and optional additional criteria (optional)
     * @return List of assigned policies (status code 200)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Filter assigned policies by service agreement and optional additional criteria.", nickname = "postFilterWithPostFilterPolicyAssignmentRequestpostFilterassignedpolicies", notes = "Filter assigned policies by service agreement and optional additional criteria", response = PresentationPostFilterPolicyAssignmentResponse.class, tags={ "policy-assignments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of assigned policies", response = PresentationPostFilterPolicyAssignmentResponse.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/policy-assignments/filter",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PresentationPostFilterPolicyAssignmentResponse> postFilterWithPostFilterPolicyAssignmentRequestpostFilterassignedpolicies(
            @ApiParam(value = "Filter assigned policies by service agreement and optional additional criteria"  )
            @Valid
            @RequestBody(required = false) PresentationPostFilterPolicyAssignmentRequest presentationPostFilterPolicyAssignmentRequest

    );

}
