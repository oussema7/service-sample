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
import com.microsphere.approval.service.api.rest.v2.model.PostApprovalTypeRequest;
import com.microsphere.approval.service.api.rest.v2.model.PostApprovalTypeResponse;
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
@Api(value = "ApprovalTypes", description = "the ApprovalTypes API")
public interface ApprovalTypesApi {

    /**
     * DELETE /service-api/v2/approval-types/{id}
     * Delete approval type
     *
     * @param id Approval type id (required)
     * @return Approval type deleted (status code 204)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "", nickname = "deleteApprovalTypeById", notes = "Delete approval type", tags={ "approval-types", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Approval type deleted"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/approval-types/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteApprovalTypeById(
            @ApiParam(value = "Approval type id",required=true)
            @PathVariable("id")
            @Size(max=36)  String id

    );


    /**
     * POST /service-api/v2/approval-types
     * Create approval type.
     *
     * @param postApprovalTypeRequest  (optional)
     * @return Approval type created succesfully (status code 201)
     *         or BadRequestException (status code 400)
     */
    @ApiOperation(value = "", nickname = "postApprovalType", notes = "Create approval type.", response = PostApprovalTypeResponse.class, tags={ "approval-types", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Approval type created succesfully", response = PostApprovalTypeResponse.class),
        @ApiResponse(code = 400, message = "BadRequestException", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/approval-types",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PostApprovalTypeResponse> postApprovalType(
            @ApiParam(value = ""  )
            @Valid
            @RequestBody(required = false) PostApprovalTypeRequest postApprovalTypeRequest

    );

}
