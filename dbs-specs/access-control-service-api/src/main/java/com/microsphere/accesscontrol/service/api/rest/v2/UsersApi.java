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
import com.microsphere.accesscontrol.service.api.rest.v2.model.BatchResponseItemExtended;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ForbiddenError;
import java.util.List;
import com.microsphere.accesscontrol.service.api.rest.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationAssignUserPermissions;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PrivilegesGetResponseBody;
import com.microsphere.accesscontrol.service.api.rest.v2.model.UserPermissionsSummaryGetResponseBody;
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
@Api(value = "Users", description = "the Users API")
public interface UsersApi {

    /**
     * GET /service-api/v2/accessgroups/users/privileges/arrangements/{id} : Arrangement permission check.
     * # Arrangement permission check.    Checks permissions for a single arrangement item.
     *
     * @param id Arrangement ID (required)
     * @param userId User ID (required)
     * @param resource Resource name. (required)
     * @param function function name. (required)
     * @param privilege Privilege name. (required)
     * @param serviceAgreementId Service Agreement ID (optional)
     * @return User has access to the given arrangement. (status code 200)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     *         or BadRequest (status code 400)
     * @deprecated
     */
    @ApiOperation(value = "Arrangement permission check.", nickname = "getArrangementPermissionCheck", notes = "# Arrangement permission check.    Checks permissions for a single arrangement item.", tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User has access to the given arrangement."),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/users/privileges/arrangements/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> getArrangementPermissionCheck(
            @ApiParam(value = "Arrangement ID",required=true)
            @PathVariable("id")
             String id
,
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
                    @ApiParam(value = "Privilege name.", required = true) @Valid
            @RequestParam(value = "privilege", required = true)
            @NotNull
            
             String privilege
,
                    @ApiParam(value = "Service Agreement ID") @Valid
            @RequestParam(value = "serviceAgreementId", required = false)
            
             String serviceAgreementId

    );


    /**
     * GET /service-api/v2/accessgroups/users/privileges/arrangements : List Arrangements that user has access to - &#x60;GET&#x60;.
     * # List Arrangements that user has access to - &#x60;GET&#x60;    Provides (retrieve) list of Arrangements along with appropriate privilege(s) that given User has access to.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.GetArrangementPrivilegesRoute  * Route Id: GetArrangementPrivilegesRoute  * Route source endpoint: direct:business.GetArrangementPrivileges  * Route destination endpoint: direct:getArrangementPrivilegesRequestedInternal
     *
     * @param userId User Id (required)
     * @param functionName Name of function (required)
     * @param resourceName Name of resource (required)
     * @param serviceAgreementId Service Agreement Id (optional)
     * @param privilegeName Name of privilege (optional)
     * @return Arrangements with their privileges for the given user have been successfully listed. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     * @deprecated
     */
    @ApiOperation(value = "List Arrangements that user has access to - `GET`.", nickname = "getArrangementPrivileges", notes = "# List Arrangements that user has access to - `GET`    Provides (retrieve) list of Arrangements along with appropriate privilege(s) that given User has access to.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.GetArrangementPrivilegesRoute  * Route Id: GetArrangementPrivilegesRoute  * Route source endpoint: direct:business.GetArrangementPrivileges  * Route destination endpoint: direct:getArrangementPrivilegesRequestedInternal", response = ArrangementPrivilegesGetResponseBody.class, responseContainer = "List", tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Arrangements with their privileges for the given user have been successfully listed.", response = ArrangementPrivilegesGetResponseBody.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/users/privileges/arrangements",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ArrangementPrivilegesGetResponseBody>> getArrangementPrivileges(
            @ApiParam(value = "User Id", required = true) @Valid
            @RequestParam(value = "userId", required = true)
            @NotNull
            
             String userId
,
                    @ApiParam(value = "Name of function", required = true) @Valid
            @RequestParam(value = "functionName", required = true)
            @NotNull
            
             String functionName
,
                    @ApiParam(value = "Name of resource", required = true) @Valid
            @RequestParam(value = "resourceName", required = true)
            @NotNull
            
             String resourceName
,
                    @ApiParam(value = "Service Agreement Id") @Valid
            @RequestParam(value = "serviceAgreementId", required = false)
            
             String serviceAgreementId
,
                    @ApiParam(value = "Name of privilege") @Valid
            @RequestParam(value = "privilegeName", required = false)
            
             String privilegeName

    );


    /**
     * GET /service-api/v2/accessgroups/users/user-privileges/arrangements/{id} : Arrangement permission check.
     * # Arrangement permission check.    Checks permissions for a single arrangement item.
     *
     * @param id Arrangement ID (required)
     * @param resource Resource name. (required)
     * @param function function name. (required)
     * @param privilege Privilege name. (required)
     * @return User has access to the given arrangement. (status code 200)
     *         or Forbidden (status code 403)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Arrangement permission check.", nickname = "getArrangementUserPermissionCheck", notes = "# Arrangement permission check.    Checks permissions for a single arrangement item.", tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User has access to the given arrangement."),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/users/user-privileges/arrangements/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> getArrangementUserPermissionCheck(
            @ApiParam(value = "Arrangement ID",required=true)
            @PathVariable("id")
             String id
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
                    @ApiParam(value = "Privilege name.", required = true) @Valid
            @RequestParam(value = "privilege", required = true)
            @NotNull
            
             String privilege

    );


    /**
     * GET /service-api/v2/accessgroups/users/user-privileges/arrangements : List Arrangements that user has access to - &#x60;GET&#x60;.
     * # List Arrangements that user has access to - &#x60;GET&#x60;    Provides (retrieve) list of Arrangements along with appropriate privilege(s) that given User has access to.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.GetArrangementPrivilegesRoute  * Route Id: GetArrangementPrivilegesRoute  * Route source endpoint: direct:business.GetArrangementPrivileges  * Route destination endpoint: direct:getArrangementPrivilegesRequestedInternal
     *
     * @param functionName Name of function (required)
     * @param resourceName Name of resource (required)
     * @param privilegeName Name of privilege (optional)
     * @return Arrangements with their privileges for the given user have been successfully listed. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     */
    @ApiOperation(value = "List Arrangements that user has access to - `GET`.", nickname = "getArrangementUserPrivileges", notes = "# List Arrangements that user has access to - `GET`    Provides (retrieve) list of Arrangements along with appropriate privilege(s) that given User has access to.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.GetArrangementPrivilegesRoute  * Route Id: GetArrangementPrivilegesRoute  * Route source endpoint: direct:business.GetArrangementPrivileges  * Route destination endpoint: direct:getArrangementPrivilegesRequestedInternal", response = ArrangementPrivilegesGetResponseBody.class, responseContainer = "List", tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Arrangements with their privileges for the given user have been successfully listed.", response = ArrangementPrivilegesGetResponseBody.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/users/user-privileges/arrangements",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ArrangementPrivilegesGetResponseBody>> getArrangementUserPrivileges(
            @ApiParam(value = "Name of function", required = true) @Valid
            @RequestParam(value = "functionName", required = true)
            @NotNull
            
             String functionName
,
                    @ApiParam(value = "Name of resource", required = true) @Valid
            @RequestParam(value = "resourceName", required = true)
            @NotNull
            
             String resourceName
,
                    @ApiParam(value = "Name of privilege") @Valid
            @RequestParam(value = "privilegeName", required = false)
            
             String privilegeName

    );


    /**
     * GET /service-api/v2/accessgroups/users/user-permissions : Check if User is allowed to perform given action - &#x60;GET&#x60;.
     * # Check if User is allowed to perform given action - &#x60;GET&#x60;    Checks if the user has the specific privileges for given business function.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ValidatePermissionsRoute  * Route Id: ValidatePermissionsRoute  * Route source endpoint: direct:business.ValidatePermissions  * Route destination endpoint: direct:validatePermissionsRequestedInternal  
     *
     * @param functionName Name of Function (required)
     * @param resourceName Name of Resource (required)
     * @param privileges comma-separated privileges. (required)
     * @return User is allowed perform this action. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     */
    @ApiOperation(value = "Check if User is allowed to perform given action - `GET`.", nickname = "getCheckUserPermission", notes = "# Check if User is allowed to perform given action - `GET`    Checks if the user has the specific privileges for given business function.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ValidatePermissionsRoute  * Route Id: ValidatePermissionsRoute  * Route source endpoint: direct:business.ValidatePermissions  * Route destination endpoint: direct:validatePermissionsRequestedInternal  ", tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User is allowed perform this action."),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/users/user-permissions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> getCheckUserPermission(
            @ApiParam(value = "Name of Function", required = true) @Valid
            @RequestParam(value = "functionName", required = true)
            @NotNull
            
             String functionName
,
                    @ApiParam(value = "Name of Resource", required = true) @Valid
            @RequestParam(value = "resourceName", required = true)
            @NotNull
            
             String resourceName
,
                    @ApiParam(value = "comma-separated privileges.", required = true) @Valid
            @RequestParam(value = "privileges", required = true)
            @NotNull
            
             String privileges

    );


    /**
     * GET /service-api/v2/accessgroups/users/privileges : List User privileges for given Business function - &#x60;GET&#x60;.
     * # List User privileges for given Business function - &#x60;GET&#x60;    Provides a list of user privileges for given business function (eg. Contacts).    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ListPrivilegesRoute  * Route Id: ListPrivilegesRoute  * Route source endpoint: direct:business.ListPrivileges  * Route destination endpoint: direct:listPrivilegesRequestedInternal
     *
     * @param userId User ID (required)
     * @param functionName Name of Function (required)
     * @param resourceName Name of Resource (required)
     * @param serviceAgreementId Service Agreement Id (optional)
     * @return User privileges for given business function listed successfully. (status code 200)
     *         or BadRequest (status code 400)
     *         or NotFound (status code 404)
     * @deprecated
     */
    @ApiOperation(value = "List User privileges for given Business function - `GET`.", nickname = "getPrivileges", notes = "# List User privileges for given Business function - `GET`    Provides a list of user privileges for given business function (eg. Contacts).    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ListPrivilegesRoute  * Route Id: ListPrivilegesRoute  * Route source endpoint: direct:business.ListPrivileges  * Route destination endpoint: direct:listPrivilegesRequestedInternal", response = PrivilegesGetResponseBody.class, responseContainer = "List", tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User privileges for given business function listed successfully.", response = PrivilegesGetResponseBody.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/users/privileges",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PrivilegesGetResponseBody>> getPrivileges(
            @ApiParam(value = "User ID", required = true) @Valid
            @RequestParam(value = "userId", required = true)
            @NotNull
            
             String userId
,
                    @ApiParam(value = "Name of Function", required = true) @Valid
            @RequestParam(value = "functionName", required = true)
            @NotNull
            
             String functionName
,
                    @ApiParam(value = "Name of Resource", required = true) @Valid
            @RequestParam(value = "resourceName", required = true)
            @NotNull
            
             String resourceName
,
                    @ApiParam(value = "Service Agreement Id") @Valid
            @RequestParam(value = "serviceAgreementId", required = false)
            
             String serviceAgreementId

    );


    /**
     * GET /service-api/v2/accessgroups/users/permissions : Check if User is allowed to perform given action - &#x60;GET&#x60;.
     * # Check if User is allowed to perform given action - &#x60;GET&#x60;    Checks if the user has the specific privileges for given business function.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ValidatePermissionsRoute  * Route Id: ValidatePermissionsRoute  * Route source endpoint: direct:business.ValidatePermissions  * Route destination endpoint: direct:validatePermissionsRequestedInternal  
     *
     * @param userId User Id (required)
     * @param functionName Name of Function (required)
     * @param resourceName Name of Resource (required)
     * @param privileges comma-separated privileges. (required)
     * @param serviceAgreementId Service Agreement Id (optional)
     * @return User is allowed perform this action. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     * @deprecated
     */
    @ApiOperation(value = "Check if User is allowed to perform given action - `GET`.", nickname = "getUserPermissionCheck", notes = "# Check if User is allowed to perform given action - `GET`    Checks if the user has the specific privileges for given business function.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ValidatePermissionsRoute  * Route Id: ValidatePermissionsRoute  * Route source endpoint: direct:business.ValidatePermissions  * Route destination endpoint: direct:validatePermissionsRequestedInternal  ", tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User is allowed perform this action."),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/users/permissions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> getUserPermissionCheck(
            @ApiParam(value = "User Id", required = true) @Valid
            @RequestParam(value = "userId", required = true)
            @NotNull
            
             String userId
,
                    @ApiParam(value = "Name of Function", required = true) @Valid
            @RequestParam(value = "functionName", required = true)
            @NotNull
            
             String functionName
,
                    @ApiParam(value = "Name of Resource", required = true) @Valid
            @RequestParam(value = "resourceName", required = true)
            @NotNull
            
             String resourceName
,
                    @ApiParam(value = "comma-separated privileges.", required = true) @Valid
            @RequestParam(value = "privileges", required = true)
            @NotNull
            
             String privileges
,
                    @ApiParam(value = "Service Agreement Id") @Valid
            @RequestParam(value = "serviceAgreementId", required = false)
            
             String serviceAgreementId

    );


    /**
     * GET /service-api/v2/accessgroups/users/permissions/summary : User Permissions Summary - &#x60;GET&#x60;.
     * # User Permissions Summary - &#x60;GET&#x60;    Returns aggregated summary of user permissions.  Returned data structure will contain all allowed Resources + Business Functions + Permissions.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.GetUserPrivilegesSummaryRoute  * Route Id: GetUserPrivilegesSummaryRoute  * Route source endpoint: direct:business.getUserPrivilegesSummary  * Route destination endpoint: direct:getUserPrivilegesSummaryRequestedInternal
     *
     * @return response (status code 200)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "User Permissions Summary - `GET`.", nickname = "getUserPermissionsSummary", notes = "# User Permissions Summary - `GET`    Returns aggregated summary of user permissions.  Returned data structure will contain all allowed Resources + Business Functions + Permissions.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.GetUserPrivilegesSummaryRoute  * Route Id: GetUserPrivilegesSummaryRoute  * Route source endpoint: direct:business.getUserPrivilegesSummary  * Route destination endpoint: direct:getUserPrivilegesSummaryRequestedInternal", response = UserPermissionsSummaryGetResponseBody.class, responseContainer = "List", tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = UserPermissionsSummaryGetResponseBody.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/users/permissions/summary",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<UserPermissionsSummaryGetResponseBody>> getUserPermissionsSummary(

    );


    /**
     * GET /service-api/v2/accessgroups/users/user-privileges : List User privileges for given Business function - &#x60;GET&#x60;.
     * # List User privileges for given Business function - &#x60;GET&#x60;    Provides a list of user privileges for given business function (eg. Contacts).    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ListPrivilegesRoute  * Route Id: ListPrivilegesRoute  * Route source endpoint: direct:business.ListPrivileges  * Route destination endpoint: direct:listPrivilegesRequestedInternal
     *
     * @param functionName Name of Function (required)
     * @param resourceName Name of Resource (required)
     * @return User privileges for given business function listed successfully. (status code 200)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "List User privileges for given Business function - `GET`.", nickname = "getUserPrivileges", notes = "# List User privileges for given Business function - `GET`    Provides a list of user privileges for given business function (eg. Contacts).    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ListPrivilegesRoute  * Route Id: ListPrivilegesRoute  * Route source endpoint: direct:business.ListPrivileges  * Route destination endpoint: direct:listPrivilegesRequestedInternal", response = PrivilegesGetResponseBody.class, responseContainer = "List", tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User privileges for given business function listed successfully.", response = PrivilegesGetResponseBody.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/users/user-privileges",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PrivilegesGetResponseBody>> getUserPrivileges(
            @ApiParam(value = "Name of Function", required = true) @Valid
            @RequestParam(value = "functionName", required = true)
            @NotNull
            
             String functionName
,
                    @ApiParam(value = "Name of Resource", required = true) @Valid
            @RequestParam(value = "resourceName", required = true)
            @NotNull
            
             String resourceName

    );


    /**
     * PUT /service-api/v2/accessgroups/users/permissions/user-permissions : Updates permissions for a list of users. - Put.
     * # Updates permissions for a list of users. - Put    Updates permissions for a list of users.
     *
     * @param presentationAssignUserPermissions # Updates permissions for a list of users. - Put    Updates permissions for a list of users. (optional)
     * @return BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     *         or MultiStatusExtended (status code 207)
     */
    @ApiOperation(value = "Updates permissions for a list of users. - Put.", nickname = "putAssignUserPermissions", notes = "# Updates permissions for a list of users. - Put    Updates permissions for a list of users.", response = BatchResponseItemExtended.class, responseContainer = "List", tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class),
        @ApiResponse(code = 207, message = "MultiStatusExtended", response = BatchResponseItemExtended.class, responseContainer = "List") })
    @RequestMapping(value = "/service-api/v2/accessgroups/users/permissions/user-permissions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<List<BatchResponseItemExtended>> putAssignUserPermissions(
            @ApiParam(value = "# Updates permissions for a list of users. - Put    Updates permissions for a list of users."  )
            @Valid
            @RequestBody(required = false) List<PresentationAssignUserPermissions> presentationAssignUserPermissions

    );

}
