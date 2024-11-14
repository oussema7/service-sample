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
import com.microsphere.accesscontrol.service.api.rest.v2.model.DataItemsPermissions;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.GetContexts;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PermissionsDataGroup;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PermissionsRequest;
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
@Api(value = "UserContext", description = "the UserContext API")
public interface UserContextApi {

    /**
     * POST /service-api/v2/accessgroups/usercontext/data-items/permissions
     * Permissions for data items
     *
     * @param dataItemsPermissions DataItemsPermissions body (optional)
     * @return Data items permissions success response (status code 204)
     *         or ### Reasons for getting HTTP status code 400:     | Message | key |   | --- | --- |   | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE |   | Data items can not be null | permissions.dataItemsPermission.INVALID_DATA_ITEM_NULL |   | Data item id or type must be unique | permissions.dataItemsPermission.UNIQUE_ID_AND_TYPE |   | Privilege not valid for business function group | permissions.dataItemsPermission.INVALID_PRIVILEGE |    (status code 400)
     *         or ### Reasons for getting HTTP status code 403:     | Message | key |   | --- | --- |   | User does not have permission for provided data items | permissions.dataItemsPermission.NO_PERMISSION |    (status code 403)
     */
    @ApiOperation(value = "", nickname = "getDataItemsPermissions", notes = "Permissions for data items", tags={ "UserContext", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Data items permissions success response"),
        @ApiResponse(code = 400, message = "### Reasons for getting HTTP status code 400:     | Message | key |   | --- | --- |   | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE |   | Data items can not be null | permissions.dataItemsPermission.INVALID_DATA_ITEM_NULL |   | Data item id or type must be unique | permissions.dataItemsPermission.UNIQUE_ID_AND_TYPE |   | Privilege not valid for business function group | permissions.dataItemsPermission.INVALID_PRIVILEGE |   ", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "### Reasons for getting HTTP status code 403:     | Message | key |   | --- | --- |   | User does not have permission for provided data items | permissions.dataItemsPermission.NO_PERMISSION |   ", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/usercontext/data-items/permissions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> getDataItemsPermissions(
            @ApiParam(value = "DataItemsPermissions body"  )
            @Valid
            @RequestBody(required = false) DataItemsPermissions dataItemsPermissions

    );


    /**
     * POST /service-api/v2/accessgroups/usercontext/data-group-permissions : Retrieve user context data group permissions.
     * Retrieve user context data group permissions.
     *
     * @param permissionsRequest # User context data group permissions - &#x60;POST&#x60;    Returns list of permissions with data groups and items filtered by user context user id and service agreement id (fallback  on MSA if no service agreement provided in the context) and data group types, resource name,  business function name and privileges provided in the request body.    ###Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.accesscontrol.business.flows.useraccess.GetPermissionDataGroupsFlow   (optional)
     * @return Permissions data group (status code 200)
     *         or # Reasons for getting HTTP status code 400:     * Data group type is invalid     | Message | key |   | --- | --- |   | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE |   (status code 400)
     */
    @ApiOperation(value = "Retrieve user context data group permissions.", nickname = "getUserContextPermissions", notes = "Retrieve user context data group permissions.", response = PermissionsDataGroup.class, tags={ "UserContext", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Permissions data group", response = PermissionsDataGroup.class),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:     * Data group type is invalid     | Message | key |   | --- | --- |   | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE |  ", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/usercontext/data-group-permissions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PermissionsDataGroup> getUserContextPermissions(
            @ApiParam(value = "# User context data group permissions - `POST`    Returns list of permissions with data groups and items filtered by user context user id and service agreement id (fallback  on MSA if no service agreement provided in the context) and data group types, resource name,  business function name and privileges provided in the request body.    ###Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.accesscontrol.business.flows.useraccess.GetPermissionDataGroupsFlow  "  )
            @Valid
            @RequestBody(required = false) PermissionsRequest permissionsRequest

    );


    /**
     * GET /service-api/v2/accesscontrol/accessgroups/usercontext/{userId}/serviceAgreements/{serviceAgreementId}/validation
     * No description available
     *
     * @param userId Internal User Id (required)
     * @param serviceAgreementId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @return User Context Validation success response (status code 204)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     */
    @ApiOperation(value = "", nickname = "getUserContextValidation", notes = "No description available", tags={ "UserContext", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "User Context Validation success response"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/usercontext/{userId}/serviceAgreements/{serviceAgreementId}/validation",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> getUserContextValidation(
            @ApiParam(value = "Internal User Id",required=true)
            @PathVariable("userId")
             String userId
,
                    @ApiParam(value = "Generated parameter by BOAT. Please specify the URI parameter in RAML",required=true)
            @PathVariable("serviceAgreementId")
             String serviceAgreementId

    );


    /**
     * GET /service-api/v2/accesscontrol/accessgroups/usercontext/{userId}/serviceAgreements : Context SA GET.
     * # Context SA GET    Request method GET for fetching list of service agreements that the user can select for the context.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param userId Internal User Id (required)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional)
     * @param query The search term used to search. (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return User Context Service Agreements GET response (status code 200)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Context SA GET.", nickname = "getUserContexts", notes = "# Context SA GET    Request method GET for fetching list of service agreements that the user can select for the context.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = GetContexts.class, tags={ "UserContext", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User Context Service Agreements GET response", response = GetContexts.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/usercontext/{userId}/serviceAgreements",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GetContexts> getUserContexts(
            @ApiParam(value = "Internal User Id",required=true)
            @PathVariable("userId")
             String userId
,
                    @ApiParam(value = "Record UUID. As an alternative for specifying 'from' this allows to point to the record to start the selection from. ") @Valid
            @RequestParam(value = "cursor", required = false)
            
             String cursor
,
                    @ApiParam(value = "The search term used to search.") @Valid
            @RequestParam(value = "query", required = false)
            
             String query
,
                    @ApiParam(value = "Page Number. Skip over pages of elements by specifying a start value for the query", defaultValue = "0") @Valid
            @RequestParam(value = "from", required = false, defaultValue="0")
            
             Integer from
,
                    @ApiParam(value = "Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor. ", defaultValue = "10") @Valid
            @RequestParam(value = "size", required = false, defaultValue="10")
            
             Integer size

    );

}
