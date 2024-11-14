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
import com.microsphere.accesscontrol.service.api.rest.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistenceServiceAgreementDataGroups;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ServiceAgreementAdmins;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ServiceAgreementItemQuery;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ServiceAgreementParticipantsGetResponseBody;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ServiceAgreementUsersQuery;
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
@Api(value = "ServiceAgreementQuery", description = "the ServiceAgreementQuery API")
public interface ServiceAgreementQueryApi {

    /**
     * GET /service-api/v2/accesscontrol/accessgroups/serviceagreements/{serviceAgreementId} : Service Agreements GET.
     * # Service Agreements GET    Request method GET for fetching service agreement by given ID.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param serviceAgreementId Service agreement internal id. (required)
     * @return Service agreement retrieved. (status code 200)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Service Agreements GET.", nickname = "getServiceAgreement", notes = "# Service Agreements GET    Request method GET for fetching service agreement by given ID.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = ServiceAgreementItemQuery.class, tags={ "ServiceAgreementQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Service agreement retrieved.", response = ServiceAgreementItemQuery.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/serviceagreements/{serviceAgreementId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ServiceAgreementItemQuery> getServiceAgreement(
            @ApiParam(value = "Service agreement internal id.",required=true)
            @PathVariable("serviceAgreementId")
             String serviceAgreementId

    );


    /**
     * GET /service-api/v2/accesscontrol/accessgroups/serviceagreements/{serviceAgreementId}/admins : Service Agreement Admins.
     * #Service Agreement Admins    Request method GET for retrieving a list of local admins of the service agreement.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param serviceAgreementId Service agreement internal id. (required)
     * @return Service Agreement Admins retrieved successfully. (status code 200)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Service Agreement Admins.", nickname = "getServiceAgreementAdmins", notes = "#Service Agreement Admins    Request method GET for retrieving a list of local admins of the service agreement.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = ServiceAgreementAdmins.class, tags={ "ServiceAgreementQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Service Agreement Admins retrieved successfully.", response = ServiceAgreementAdmins.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/serviceagreements/{serviceAgreementId}/admins",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ServiceAgreementAdmins> getServiceAgreementAdmins(
            @ApiParam(value = "Service agreement internal id.",required=true)
            @PathVariable("serviceAgreementId")
             String serviceAgreementId

    );


    /**
     * GET /service-api/v2/accesscontrol/accessgroups/serviceagreements/{serviceAgreementId}/participants : Retrieves Service Agreement participants.
     * # Retrieves Service Agreement participants    Request method GET for retrieving Legal Entities that are participants  in Service Agreement together with their roles in the Service Agreement.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param serviceAgreementId Service agreement internal id. (required)
     * @return Service Agreement Participants retrieved successfully. (status code 200)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Retrieves Service Agreement participants.", nickname = "getServiceAgreementParticipantsQuery", notes = "# Retrieves Service Agreement participants    Request method GET for retrieving Legal Entities that are participants  in Service Agreement together with their roles in the Service Agreement.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = ServiceAgreementParticipantsGetResponseBody.class, responseContainer = "List", tags={ "ServiceAgreementQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Service Agreement Participants retrieved successfully.", response = ServiceAgreementParticipantsGetResponseBody.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/serviceagreements/{serviceAgreementId}/participants",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ServiceAgreementParticipantsGetResponseBody>> getServiceAgreementParticipantsQuery(
            @ApiParam(value = "Service agreement internal id.",required=true)
            @PathVariable("serviceAgreementId")
             String serviceAgreementId

    );


    /**
     * GET /service-api/v2/accesscontrol/accessgroups/serviceagreements/{serviceAgreementId}/users : Service Agreement Users.
     * #Service Agreement Users    Request method GET for retrieving a list of users in the service agreement.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param serviceAgreementId Service agreement internal id. (required)
     * @return Service agreement users. (status code 200)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Service Agreement Users.", nickname = "getServiceAgreementUsers", notes = "#Service Agreement Users    Request method GET for retrieving a list of users in the service agreement.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = ServiceAgreementUsersQuery.class, tags={ "ServiceAgreementQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Service agreement users.", response = ServiceAgreementUsersQuery.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/serviceagreements/{serviceAgreementId}/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ServiceAgreementUsersQuery> getServiceAgreementUsers(
            @ApiParam(value = "Service agreement internal id.",required=true)
            @PathVariable("serviceAgreementId")
             String serviceAgreementId

    );


    /**
     * GET /service-api/v2/accesscontrol/accessgroups/serviceagreements/data-items : Service Agreements Data Groups - &#x60;GET&#x60;.
     * # Service Agreements Data Groups - &#x60;GET&#x60;    Request method GET for fetching service agreement ids with data group ids   and data item ids  by user id, data group type, resource name, business function name   and privilege.  
     *
     * @param userId User id. (required)
     * @param dataGroupType Data group type. (required)
     * @param resourceName Resource name. (optional)
     * @param functionName Function name. (optional)
     * @param privileges List of comma separated privilege names. (optional)
     * @return Service agreement ids retrieved with data group ids and data item ids. (status code 200)
     *         or # Reasons for getting HTTP status code 400:    * Privileges provided without business function name or resource name    | Message | key |  --- | --- |  |Privileges cannot be provided without business function name or resource name|serviceAgreements.get.parameters.error.message.PRIVILEGES_WITHOUT_FUNCTION_OR_RESOURCE|   (status code 400)
     */
    @ApiOperation(value = "Service Agreements Data Groups - `GET`.", nickname = "getServiceAgreementsDataGroups", notes = "# Service Agreements Data Groups - `GET`    Request method GET for fetching service agreement ids with data group ids   and data item ids  by user id, data group type, resource name, business function name   and privilege.  ", response = PersistenceServiceAgreementDataGroups.class, responseContainer = "List", tags={ "ServiceAgreementQuery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Service agreement ids retrieved with data group ids and data item ids.", response = PersistenceServiceAgreementDataGroups.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:    * Privileges provided without business function name or resource name    | Message | key |  --- | --- |  |Privileges cannot be provided without business function name or resource name|serviceAgreements.get.parameters.error.message.PRIVILEGES_WITHOUT_FUNCTION_OR_RESOURCE|  ", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/serviceagreements/data-items",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PersistenceServiceAgreementDataGroups>> getServiceAgreementsDataGroups(
            @ApiParam(value = "User id.", required = true) @Valid
            @RequestParam(value = "userId", required = true)
            @NotNull
            
             String userId
,
                    @ApiParam(value = "Data group type.", required = true) @Valid
            @RequestParam(value = "dataGroupType", required = true)
            @NotNull
            
             String dataGroupType
,
                    @ApiParam(value = "Resource name.") @Valid
            @RequestParam(value = "resourceName", required = false)
            
             String resourceName
,
                    @ApiParam(value = "Function name.") @Valid
            @RequestParam(value = "functionName", required = false)
            
             String functionName
,
                    @ApiParam(value = "List of comma separated privilege names.") @Valid
            @RequestParam(value = "privileges", required = false)
            
             String privileges

    );

}
