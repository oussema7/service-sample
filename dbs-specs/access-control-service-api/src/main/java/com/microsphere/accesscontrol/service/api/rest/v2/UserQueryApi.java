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

import com.microsphere.accesscontrol.service.api.rest.v2.model.ArrangementPrivilegesGetResponseBody;
import com.microsphere.accesscontrol.service.api.rest.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ContextLegalEntities;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistenceApprovalPermissions;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistenceUserDataItemPermission;
import com.microsphere.accesscontrol.service.api.rest.v2.model.UserAccessEntitlementsResource;
import com.microsphere.accesscontrol.service.api.rest.v2.model.UserAccessLegalEntities;
import com.microsphere.accesscontrol.service.api.rest.v2.model.UserAccessServiceAgreement;
import com.microsphere.accesscontrol.service.api.rest.v2.model.UserFunctionGroups;
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
@Api(value = "UserQuery", description = "the UserQuery API")
public interface UserQueryApi {

    /**
     * GET /service-api/v2/accesscontrol/accessgroups/users/privileges/arrangements : User Access GET.
     * # User Access GET    Request method GET for fetching all arrangements with privileges  by functionName and resourceName as required,  and userId, serviceAgreementId, legalEntityId, arrangementId and privilege as optional.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param functionName Name of Function (required)
     * @param resourceName Name of resource (required)
     * @param userId User ID (optional)
     * @param serviceAgreementId Service Agreement ID (optional)
     * @param legalEntityId Legal Entity ID (optional)
     * @param arrangementId Arrangement ID (optional)
     * @param privilege Privilege (optional)
     * @return List of arrangements with privileges retrieved. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     * @deprecated
     */
    @ApiOperation(value = "User Access GET.", nickname = "getArrangementPrivilegesQuery", notes = "# User Access GET    Request method GET for fetching all arrangements with privileges  by functionName and resourceName as required,  and userId, serviceAgreementId, legalEntityId, arrangementId and privilege as optional.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = ArrangementPrivilegesGetResponseBody.class, responseContainer = "List", tags={ "UserQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of arrangements with privileges retrieved.", response = ArrangementPrivilegesGetResponseBody.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/users/privileges/arrangements",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ArrangementPrivilegesGetResponseBody>> getArrangementPrivilegesQuery(
            @ApiParam(value = "Name of Function", required = true) @Valid
            @RequestParam(value = "functionName", required = true)
            @NotNull
            
             String functionName
,
                    @ApiParam(value = "Name of resource", required = true) @Valid
            @RequestParam(value = "resourceName", required = true)
            @NotNull
            
             String resourceName
,
                    @ApiParam(value = "User ID") @Valid
            @RequestParam(value = "userId", required = false)
            
             String userId
,
                    @ApiParam(value = "Service Agreement ID") @Valid
            @RequestParam(value = "serviceAgreementId", required = false)
            
             String serviceAgreementId
,
                    @ApiParam(value = "Legal Entity ID") @Valid
            @RequestParam(value = "legalEntityId", required = false)
            
             String legalEntityId
,
                    @ApiParam(value = "Arrangement ID") @Valid
            @RequestParam(value = "arrangementId", required = false)
            
             String arrangementId
,
                    @ApiParam(value = "Privilege") @Valid
            @RequestParam(value = "privilege", required = false)
            
             String privilege

    );


    /**
     * GET /service-api/v2/accesscontrol/accessgroups/users/{userId}/service-agreements/{serviceAgreementId}/data-item-permissions : User Permissions per Data Item GET.
     * # User Permissions per Data Item GET    Request method GET for fetching user permissions per data item for given  businessFunction or resource or privilege or dataGroupType or dataItemId.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param userId User id (required)
     * @param serviceAgreementId Service agreement id (required)
     * @param businessFunction Name of the business function (optional)
     * @param resource Name of resource (optional)
     * @param privilege Name of the privilege (optional)
     * @param dataGroupType Name of the data group type (optional)
     * @param dataItemId Id of the data item (optional)
     * @return List of privileges retrieved. (status code 200)
     *         or BadRequest (status code 400)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "User Permissions per Data Item GET.", nickname = "getDataItemPermissions", notes = "# User Permissions per Data Item GET    Request method GET for fetching user permissions per data item for given  businessFunction or resource or privilege or dataGroupType or dataItemId.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = PersistenceUserDataItemPermission.class, responseContainer = "List", tags={ "UserQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of privileges retrieved.", response = PersistenceUserDataItemPermission.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/users/{userId}/service-agreements/{serviceAgreementId}/data-item-permissions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PersistenceUserDataItemPermission>> getDataItemPermissions(
            @ApiParam(value = "User id",required=true)
            @PathVariable("userId")
             String userId
,
                    @ApiParam(value = "Service agreement id",required=true)
            @PathVariable("serviceAgreementId")
             String serviceAgreementId
,
                    @ApiParam(value = "Name of the business function") @Valid
            @RequestParam(value = "businessFunction", required = false)
            
             String businessFunction
,
                    @ApiParam(value = "Name of resource") @Valid
            @RequestParam(value = "resource", required = false)
            
             String resource
,
                    @ApiParam(value = "Name of the privilege") @Valid
            @RequestParam(value = "privilege", required = false)
            
             String privilege
,
                    @ApiParam(value = "Name of the data group type") @Valid
            @RequestParam(value = "dataGroupType", required = false)
            
             String dataGroupType
,
                    @ApiParam(value = "Id of the data item") @Valid
            @RequestParam(value = "dataItemId", required = false)
            
             String dataItemId

    );


    /**
     * GET /service-api/v2/accesscontrol/accessgroups/users/{userId}/service-agreements/{serviceAgreementId}/permissions : User Permissions GET.
     * # User Permissions GET    Request method GET for fetching user permissions for given user and service agreement.  Response contains approvalId if there is pending approval for permissions.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param userId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @param serviceAgreementId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @return Users permissions successfully retrieved. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "User Permissions GET.", nickname = "getPersistenceApprovalPermissions", notes = "# User Permissions GET    Request method GET for fetching user permissions for given user and service agreement.  Response contains approvalId if there is pending approval for permissions.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = PersistenceApprovalPermissions.class, tags={ "UserQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Users permissions successfully retrieved.", response = PersistenceApprovalPermissions.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/users/{userId}/service-agreements/{serviceAgreementId}/permissions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<PersistenceApprovalPermissions> getPersistenceApprovalPermissions(
            @ApiParam(value = "Generated parameter by BOAT. Please specify the URI parameter in RAML",required=true)
            @PathVariable("userId")
             String userId
,
                    @ApiParam(value = "Generated parameter by BOAT. Please specify the URI parameter in RAML",required=true)
            @PathVariable("serviceAgreementId")
             String serviceAgreementId

    );


    /**
     * GET /service-api/v2/accesscontrol/accessgroups/users/permissions : User Access GET.
     * # User Access GET    Request method GET to check if the user has the specified privileges to perform a function on a given resource.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param userId User ID (required)
     * @param resource Resource name. (required)
     * @param function function name. (required)
     * @param privileges Comma-separated privileges. (required)
     * @param serviceAgreementId Service Agreement ID (optional)
     * @return User is permitted to perform the function. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     */
    @ApiOperation(value = "User Access GET.", nickname = "getUserPermissionCheckQuery", notes = "# User Access GET    Request method GET to check if the user has the specified privileges to perform a function on a given resource.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", tags={ "UserQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User is permitted to perform the function."),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/users/permissions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> getUserPermissionCheckQuery(
            @ApiParam(value = "User ID", required = true) @Valid
            @RequestParam(value = "userId", required = true)
            @NotNull
            
             String userId
,
                    @ApiParam(value = "Resource name.", required = true) @Valid
            @RequestParam(value = "resource", required = true)
            @NotNull
            
             String resource
,
                    @ApiParam(value = "function name.", required = true) @Valid
            @RequestParam(value = "function", required = true)
            @NotNull
            
             String function
,
                    @ApiParam(value = "Comma-separated privileges.", required = true) @Valid
            @RequestParam(value = "privileges", required = true)
            @NotNull
            
             String privileges
,
                    @ApiParam(value = "Service Agreement ID") @Valid
            @RequestParam(value = "serviceAgreementId", required = false)
            
             String serviceAgreementId

    );


    /**
     * GET /service-api/v2/accesscontrol/accessgroups/users/function-groups/by-permissions : Users Function Groups - &#x60;GET&#x60;.
     * # Users Function Groups - &#x60;GET&#x60;    Request method GET for fetching user internal ids together with assigned function group internal ids.  
     *
     * @param serviceAgreementId Service Agreement ID (required)
     * @param functionName Function name. (required)
     * @param privilege Name of the privilege (optional)
     * @param dataGroupType Name of the data group type (optional)
     * @param dataItemId Id of the data item (optional)
     * @return List of users/function groups retrieved successfully. (status code 200)
     *         or # Reasons for getting HTTP status code 400:    * Data item type and id must be both provided or omitted.    | Message | key |  --- | --- |  |Data item type and id must be both provided or omitted|datagroup.parameters.invalid.TYPE_AND_ITEM_ID|   (status code 400)
     */
    @ApiOperation(value = "Users Function Groups - `GET`.", nickname = "getUsersFunctionGroups", notes = "# Users Function Groups - `GET`    Request method GET for fetching user internal ids together with assigned function group internal ids.  ", response = UserFunctionGroups.class, responseContainer = "List", tags={ "UserQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of users/function groups retrieved successfully.", response = UserFunctionGroups.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:    * Data item type and id must be both provided or omitted.    | Message | key |  --- | --- |  |Data item type and id must be both provided or omitted|datagroup.parameters.invalid.TYPE_AND_ITEM_ID|  ", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/users/function-groups/by-permissions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<UserFunctionGroups>> getUsersFunctionGroups(
            @ApiParam(value = "Service Agreement ID", required = true) @Valid
            @RequestParam(value = "serviceAgreementId", required = true)
            @NotNull
            
             String serviceAgreementId
,
                    @ApiParam(value = "Function name.", required = true) @Valid
            @RequestParam(value = "functionName", required = true)
            @NotNull
            
             String functionName
,
                    @ApiParam(value = "Name of the privilege") @Valid
            @RequestParam(value = "privilege", required = false)
            
             String privilege
,
                    @ApiParam(value = "Name of the data group type") @Valid
            @RequestParam(value = "dataGroupType", required = false)
            
             String dataGroupType
,
                    @ApiParam(value = "Id of the data item") @Valid
            @RequestParam(value = "dataItemId", required = false)
            
             String dataItemId

    );


    /**
     * POST /service-api/v2/accesscontrol/accessgroups/users/access/legalentities : User Access Legal Entities.
     * # User Access Legal Entities    Request method POST for checking to which legal entities the user has access to.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param userAccessLegalEntities # User Access Legal Entities    Request method POST for checking to which legal entities the user has access to.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**   (optional)
     * @return Legal Entities in context (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "User Access Legal Entities.", nickname = "postLegalEntitiesInContext", notes = "# User Access Legal Entities    Request method POST for checking to which legal entities the user has access to.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = ContextLegalEntities.class, tags={ "UserQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Legal Entities in context", response = ContextLegalEntities.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/users/access/legalentities",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ContextLegalEntities> postLegalEntitiesInContext(
            @ApiParam(value = "# User Access Legal Entities    Request method POST for checking to which legal entities the user has access to.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  "  )
            @Valid
            @RequestBody(required = false) UserAccessLegalEntities userAccessLegalEntities

    );


    /**
     * POST /service-api/v2/accesscontrol/accessgroups/users/access/resources : User Access Hierarchy.
     * # User Access Hierarchy    Request method POST for checking if a provided user has access to the provided list of resource ids.  Returns list of resource ids that the provided user has access to, a sub list of the provided ids.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param userAccessEntitlementsResource # User Access Hierarchy    Request method POST for checking if a provided user has access to the provided list of resource ids.  Returns list of resource ids that the provided user has access to, a sub list of the provided ids.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**   (optional)
     * @return Legal Entities that the user has access to (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "User Access Hierarchy.", nickname = "postUserAccessToEntitlementsResource", notes = "# User Access Hierarchy    Request method POST for checking if a provided user has access to the provided list of resource ids.  Returns list of resource ids that the provided user has access to, a sub list of the provided ids.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = ContextLegalEntities.class, tags={ "UserQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Legal Entities that the user has access to", response = ContextLegalEntities.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/users/access/resources",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ContextLegalEntities> postUserAccessToEntitlementsResource(
            @ApiParam(value = "# User Access Hierarchy    Request method POST for checking if a provided user has access to the provided list of resource ids.  Returns list of resource ids that the provided user has access to, a sub list of the provided ids.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  "  )
            @Valid
            @RequestBody(required = false) UserAccessEntitlementsResource userAccessEntitlementsResource

    );


    /**
     * POST /service-api/v2/accesscontrol/accessgroups/users/access/serviceagreement : User Access Service agreement.
     * # User Access Service agreement    Request method POST for checking if a given user has access to the given service agreement.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param userAccessServiceAgreement # User Access Service agreement    Request method POST for checking if a given user has access to the given service agreement.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**   (optional)
     * @return User Access to Service Agreement check (status code 204)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "User Access Service agreement.", nickname = "postUserAccessToServiceAgreement", notes = "# User Access Service agreement    Request method POST for checking if a given user has access to the given service agreement.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", tags={ "UserQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "User Access to Service Agreement check"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/users/access/serviceagreement",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> postUserAccessToServiceAgreement(
            @ApiParam(value = "# User Access Service agreement    Request method POST for checking if a given user has access to the given service agreement.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  "  )
            @Valid
            @RequestBody(required = false) UserAccessServiceAgreement userAccessServiceAgreement

    );

}
