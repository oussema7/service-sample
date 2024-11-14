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
package com.microsphere.accesscontrol.service.api.rest.v2;

import com.microsphere.accesscontrol.service.api.rest.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.BatchResponseItem;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ListOfFunctionGroupsWithDataGroups;
import com.microsphere.accesscontrol.service.api.rest.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationApprovalStatus;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ServiceAgreementBatchDelete;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ServiceAgreementParticipantsGetResponseBody;
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
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")
@Api(value = "ServiceAgreements", description = "the ServiceAgreements API")
public interface ServiceAgreementsApi {

    /**
     * GET /service-api/v2/accessgroups/service-agreements/usercontext/participants : Retrieves Legal Entities that are participants in Service Agreement from the context.
     * Retrieves Legal Entities that are participants in Service Agreement from the context.
     *
     * @return Service Agreement participants retrieved successfully. (status code 200)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Retrieves Legal Entities that are participants in Service Agreement from the context.", nickname = "getContextServiceAgreementParticipants", notes = "Retrieves Legal Entities that are participants in Service Agreement from the context.", response = ServiceAgreementParticipantsGetResponseBody.class, responseContainer = "List", tags={ "ServiceAgreements", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Service Agreement participants retrieved successfully.", response = ServiceAgreementParticipantsGetResponseBody.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/service-agreements/usercontext/participants",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ServiceAgreementParticipantsGetResponseBody>> getContextServiceAgreementParticipants(

    );


    /**
     * GET /service-api/v2/accessgroups/service-agreements/{id}/participants : Retrieves Legal Entities that are participants in Service Agreement.
     * Retrieves Legal Entities that are participants in Service Agreement.
     *
     * @param id No description available (required)
     * @return Service Agreement participants retrieved successfully. (status code 200)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Retrieves Legal Entities that are participants in Service Agreement.", nickname = "getServiceAgreementParticipants", notes = "Retrieves Legal Entities that are participants in Service Agreement.", response = ServiceAgreementParticipantsGetResponseBody.class, responseContainer = "List", tags={ "ServiceAgreements", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Service Agreement participants retrieved successfully.", response = ServiceAgreementParticipantsGetResponseBody.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/service-agreements/{id}/participants",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ServiceAgreementParticipantsGetResponseBody>> getServiceAgreementParticipants(
            @ApiParam(value = "No description available",required=true)
            @PathVariable("id")
             String id

    );


    /**
     * POST /service-api/v2/accessgroups/service-agreements/batch/delete : Batch Delete Of Service Agreement.
     * #Batch Delete Of Service Agreement.    POST request to batch delete of service agreement.
     *
     * @param serviceAgreementBatchDelete #Batch Delete Of Service Agreement.    POST request to batch delete of service agreement. (optional)
     * @return MultiStatus (status code 207)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Batch Delete Of Service Agreement.", nickname = "postBatchdelete", notes = "#Batch Delete Of Service Agreement.    POST request to batch delete of service agreement.", response = BatchResponseItem.class, responseContainer = "List", tags={ "ServiceAgreements", })
    @ApiResponses(value = { 
        @ApiResponse(code = 207, message = "MultiStatus", response = BatchResponseItem.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/service-agreements/batch/delete",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<BatchResponseItem>> postBatchdelete(
            @ApiParam(value = "#Batch Delete Of Service Agreement.    POST request to batch delete of service agreement."  )
            @Valid
            @RequestBody(required = false) ServiceAgreementBatchDelete serviceAgreementBatchDelete

    );


    /**
     * PUT /service-api/v2/accessgroups/service-agreements/{id}/users/{userId}/permissions : Updates all permission for a users in a given service agreement.
     * Updates all permission for a users in a given service agreement.
     *
     * @param id No description available (required)
     * @param userId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @param listOfFunctionGroupsWithDataGroups Updates all permission for a users in a given service agreement. (optional)
     * @return Users permissions successfully to the Service Agreement. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     */
    @ApiOperation(value = "Updates all permission for a users in a given service agreement.", nickname = "putAssignUsersPermissions", notes = "Updates all permission for a users in a given service agreement.", response = PresentationApprovalStatus.class, tags={ "ServiceAgreements", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Users permissions successfully to the Service Agreement.", response = PresentationApprovalStatus.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/service-agreements/{id}/users/{userId}/permissions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<PresentationApprovalStatus> putAssignUsersPermissions(
            @ApiParam(value = "No description available",required=true)
            @PathVariable("id")
             String id
,
                    @ApiParam(value = "Generated parameter by BOAT. Please specify the URI parameter in RAML",required=true)
            @PathVariable("userId")
             String userId
,
                    @ApiParam(value = "Updates all permission for a users in a given service agreement."  )
            @Valid
            @RequestBody(required = false) ListOfFunctionGroupsWithDataGroups listOfFunctionGroupsWithDataGroups

    );

}
