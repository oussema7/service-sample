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
import com.microsphere.accesscontrol.service.api.rest.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.FunctionsGetResponseBody;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ListServiceAgreements;
import com.microsphere.accesscontrol.service.api.rest.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ServiceAgreementByPermissionSet;
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
@Api(value = "ServiceAgreementsQuery", description = "the ServiceAgreementsQuery API")
public interface ServiceAgreementsQueryApi {

    /**
     * GET /service-api/v2/accesscontrol/service-agreements : Service Agreements GET.
     * # Service Agreements GET    Request method GET for fetching service agreements by creator id, and optionally user id and usersLegalEntityId.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param creatorId Legal entity ID that created the service agreement. (required)
     * @param userId Id of the user that is exposed (as regular or local admin) in the service agreement. (optional)
     * @param userLegalEntityId Legal entity Id of the user that is exposed (as regular or local admin) in the service agreement. (optional)
     * @param query The search term used to search. (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return Service agreements retrieved. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     */
    @ApiOperation(value = "Service Agreements GET.", nickname = "getAgreements", notes = "# Service Agreements GET    Request method GET for fetching service agreements by creator id, and optionally user id and usersLegalEntityId.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = ListServiceAgreements.class, tags={ "ServiceAgreementsQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Service agreements retrieved.", response = ListServiceAgreements.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/service-agreements",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ListServiceAgreements> getAgreements(
            @ApiParam(value = "Legal entity ID that created the service agreement.", required = true) @Valid
            @RequestParam(value = "creatorId", required = true)
            @NotNull
            
             String creatorId
,
                    @ApiParam(value = "Id of the user that is exposed (as regular or local admin) in the service agreement.") @Valid
            @RequestParam(value = "userId", required = false)
            
             String userId
,
                    @ApiParam(value = "Legal entity Id of the user that is exposed (as regular or local admin) in the service agreement.") @Valid
            @RequestParam(value = "userLegalEntityId", required = false)
            
             String userLegalEntityId
,
                    @ApiParam(value = "The search term used to search.") @Valid
            @RequestParam(value = "query", required = false)
            
             String query
,
                    @ApiParam(value = "Page Number. Skip over pages of elements by specifying a start value for the query", defaultValue = "0") @Valid
            @RequestParam(value = "from", required = false, defaultValue="0")
            
             Integer from
,
                    @ApiParam(value = "Record UUID. As an alternative for specifying 'from' this allows to point to the record to start the selection from. ", defaultValue = "") @Valid
            @RequestParam(value = "cursor", required = false, defaultValue="")
            
             String cursor
,
                    @ApiParam(value = "Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor. ", defaultValue = "10") @Valid
            @RequestParam(value = "size", required = false, defaultValue="10")
            
             Integer size

    );


    /**
     * GET /service-api/v2/accesscontrol/service-agreements/external/{externalId}/business-functions
     * No description available
     *
     * @param externalId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @return Service agreement business functions by external id retrieved. (status code 200)
     *         or SA with external ID not found (status code 404)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "", nickname = "getExternalexternalIdbusinessfunctions", notes = "No description available", response = FunctionsGetResponseBody.class, responseContainer = "List", tags={ "ServiceAgreementsQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Service agreement business functions by external id retrieved.", response = FunctionsGetResponseBody.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "SA with external ID not found", response = NotFoundError.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/service-agreements/external/{externalId}/business-functions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<FunctionsGetResponseBody>> getExternalexternalIdbusinessfunctions(
            @ApiParam(value = "Generated parameter by BOAT. Please specify the URI parameter in RAML",required=true)
            @PathVariable("externalId")
             String externalId

    );


    /**
     * GET /service-api/v2/accesscontrol/service-agreements/permission-sets/id/{id} : Service Agreements - &#x60;GET&#x60;.
     * # Service Agreements - &#x60;GET&#x60;    Request method GET for fetching service agreement by assignable permission set.  
     *
     * @param id Permission sets id (required)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return List of all service agreement where provided permission set is assigned. (status code 200)
     *         or # Reasons for getting HTTP status code 400:    * Invalid id identifier of assignable permission set  * Invalid page size, size must be lower than 1000    | Message | key  --- | --- |  | Invalid id identifier of assignable permission set. | permissionSet.identifier.INVALID_VALUE  | Invalid page size, size must be lower than 1000. | list.page.error.message.E_INVALID_PAGE_SIZE   (status code 400)
     *         or # Reasons for getting HTTP status code 404:    * The APS doesn&#39;t exist.    | Message | key  --- | --- |  | The APS doesn&#39;t exist. | permissionSet.identifiers.NOT_EXISTS   (status code 404)
     */
    @ApiOperation(value = "Service Agreements - `GET`.", nickname = "getGetServiceAgremeentByPermissionSetId", notes = "# Service Agreements - `GET`    Request method GET for fetching service agreement by assignable permission set.  ", response = ServiceAgreementByPermissionSet.class, responseContainer = "List", tags={ "ServiceAgreementsQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all service agreement where provided permission set is assigned.", response = ServiceAgreementByPermissionSet.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:    * Invalid id identifier of assignable permission set  * Invalid page size, size must be lower than 1000    | Message | key  --- | --- |  | Invalid id identifier of assignable permission set. | permissionSet.identifier.INVALID_VALUE  | Invalid page size, size must be lower than 1000. | list.page.error.message.E_INVALID_PAGE_SIZE  ", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "# Reasons for getting HTTP status code 404:    * The APS doesn't exist.    | Message | key  --- | --- |  | The APS doesn't exist. | permissionSet.identifiers.NOT_EXISTS  ", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/service-agreements/permission-sets/id/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ServiceAgreementByPermissionSet>> getGetServiceAgremeentByPermissionSetId(
            @ApiParam(value = "Permission sets id",required=true)
            @PathVariable("id")
             String id
,
                    @ApiParam(value = "Page Number. Skip over pages of elements by specifying a start value for the query", defaultValue = "0") @Valid
            @RequestParam(value = "from", required = false, defaultValue="0")
            
             Integer from
,
                    @ApiParam(value = "Record UUID. As an alternative for specifying 'from' this allows to point to the record to start the selection from. ", defaultValue = "") @Valid
            @RequestParam(value = "cursor", required = false, defaultValue="")
            
             String cursor
,
                    @ApiParam(value = "Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor. ", defaultValue = "10") @Valid
            @RequestParam(value = "size", required = false, defaultValue="10")
            
             Integer size

    );


    /**
     * GET /service-api/v2/accesscontrol/service-agreements/permission-sets/name/{name} : Service Agreements - &#x60;GET&#x60;.
     * # Service Agreements - &#x60;GET&#x60;    Request method GET for fetching service agreement by assignable permission set.  
     *
     * @param name No description available (required)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return List of all service agreement where provided permission set is assigned. (status code 200)
     *         or # Reasons for getting HTTP status code 400:    * Invalid page size, size must be lower than 1000    | Message | key  --- | --- |  | Invalid page size, size must be lower than 1000. | list.page.error.message.E_INVALID_PAGE_SIZE   (status code 400)
     *         or # Reasons for getting HTTP status code 404:    * The APS doesn&#39;t exist.    | Message | key  --- | --- |  | The APS doesn&#39;t exist. | permissionSet.identifiers.NOT_EXISTS   (status code 404)
     */
    @ApiOperation(value = "Service Agreements - `GET`.", nickname = "getGetServiceAgremeentByPermissionSetName", notes = "# Service Agreements - `GET`    Request method GET for fetching service agreement by assignable permission set.  ", response = ServiceAgreementByPermissionSet.class, responseContainer = "List", tags={ "ServiceAgreementsQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all service agreement where provided permission set is assigned.", response = ServiceAgreementByPermissionSet.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:    * Invalid page size, size must be lower than 1000    | Message | key  --- | --- |  | Invalid page size, size must be lower than 1000. | list.page.error.message.E_INVALID_PAGE_SIZE  ", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "# Reasons for getting HTTP status code 404:    * The APS doesn't exist.    | Message | key  --- | --- |  | The APS doesn't exist. | permissionSet.identifiers.NOT_EXISTS  ", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/service-agreements/permission-sets/name/{name}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ServiceAgreementByPermissionSet>> getGetServiceAgremeentByPermissionSetName(
            @ApiParam(value = "No description available",required=true)
            @PathVariable("name")
             String name
,
                    @ApiParam(value = "Page Number. Skip over pages of elements by specifying a start value for the query", defaultValue = "0") @Valid
            @RequestParam(value = "from", required = false, defaultValue="0")
            
             Integer from
,
                    @ApiParam(value = "Record UUID. As an alternative for specifying 'from' this allows to point to the record to start the selection from. ", defaultValue = "") @Valid
            @RequestParam(value = "cursor", required = false, defaultValue="")
            
             String cursor
,
                    @ApiParam(value = "Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor. ", defaultValue = "10") @Valid
            @RequestParam(value = "size", required = false, defaultValue="10")
            
             Integer size

    );


    /**
     * GET /service-api/v2/accesscontrol/service-agreements/id/{internalId}/business-functions
     * No description available
     *
     * @param internalId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @return Service agreement business functions by internal id retrieved. (status code 200)
     *         or SA with internal ID not found (status code 404)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "", nickname = "getIdinternalIdbusinessfunctions", notes = "No description available", response = FunctionsGetResponseBody.class, responseContainer = "List", tags={ "ServiceAgreementsQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Service agreement business functions by internal id retrieved.", response = FunctionsGetResponseBody.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "SA with internal ID not found", response = NotFoundError.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/service-agreements/id/{internalId}/business-functions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<FunctionsGetResponseBody>> getIdinternalIdbusinessfunctions(
            @ApiParam(value = "Generated parameter by BOAT. Please specify the URI parameter in RAML",required=true)
            @PathVariable("internalId")
             String internalId

    );

}
