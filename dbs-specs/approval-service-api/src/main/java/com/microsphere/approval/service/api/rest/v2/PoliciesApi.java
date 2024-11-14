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
import com.microsphere.approval.service.api.rest.v2.model.NotFoundError;
import com.microsphere.approval.service.api.rest.v2.model.PostPolicyRequest;
import com.microsphere.approval.service.api.rest.v2.model.PostPolicyResponse;
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
@Api(value = "Policies", description = "the Policies API")
public interface PoliciesApi {

    /**
     * DELETE /service-api/v2/policies/{id}
     * Delete policy by id
     *
     * @param id Policy id (required)
     * @return Policy deleted successfully (status code 204)
     *         or BadRequest (status code 400)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "", nickname = "deletePolicyById", notes = "Delete policy by id", tags={ "policies", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Policy deleted successfully"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/policies/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePolicyById(
            @ApiParam(value = "Policy id",required=true)
            @PathVariable("id")
            @Size(max=36)  String id

    );


    /**
     * POST /service-api/v2/policies : Create a new policy.
     * Create a new policy.
     *
     * @param postPolicyRequest Create a new policy. (optional)
     * @return Policy created successfully (status code 201)
     *         or Failed to create the policy due to an error in the request. (status code 400)
     */
    @ApiOperation(value = "Create a new policy.", nickname = "postPolicy", notes = "Create a new policy.", response = PostPolicyResponse.class, tags={ "policies", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Policy created successfully", response = PostPolicyResponse.class),
        @ApiResponse(code = 400, message = "Failed to create the policy due to an error in the request.", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/policies",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PostPolicyResponse> postPolicy(
            @ApiParam(value = "Create a new policy."  )
            @Valid
            @RequestBody(required = false) PostPolicyRequest postPolicyRequest

    );

}
