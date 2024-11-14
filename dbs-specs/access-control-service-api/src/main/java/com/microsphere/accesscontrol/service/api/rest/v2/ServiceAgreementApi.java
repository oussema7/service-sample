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
import com.microsphere.accesscontrol.service.api.rest.v2.model.BatchResponseItemExtended;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.IdItem;
import com.microsphere.accesscontrol.service.api.rest.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationParticipantBatchUpdate;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationServiceAgreementUsersBatchUpdate;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ServiceAgreementItem;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ServiceAgreementPut;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ServicesAgreementIngest;
import com.microsphere.accesscontrol.service.api.rest.v2.model.UnauthorizedAltError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.UserAssignedFunctionGroupResponse;
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
@Api(value = "ServiceAgreement", description = "the ServiceAgreement API")
public interface ServiceAgreementApi {

    /**
     * GET /service-api/v2/accessgroups/serviceagreements/external/{externalId} : Service agreement retrieved.
     * Service agreement retrieved.
     *
     * @param externalId No description available (required)
     * @return Service agreement by external id retrieved. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Service agreement retrieved.", nickname = "getServiceAgreementExternalId", notes = "Service agreement retrieved.", response = ServiceAgreementItem.class, tags={ "ServiceAgreement", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Service agreement by external id retrieved.", response = ServiceAgreementItem.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/serviceagreements/external/{externalId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ServiceAgreementItem> getServiceAgreementExternalId(
            @ApiParam(value = "No description available",required=true)
            @PathVariable("externalId")
             String externalId

    );


    /**
     * GET /service-api/v2/accessgroups/serviceagreements/{serviceAgreementId}/function-groups/{functionGroupId}/users : Users with assigned Function Group.
     * # Retrieves information about users with assigned Function Group in Service Agreement by serviceAgreementId and functionGroupId. - &#x60;GET&#x60;. ### Warning: * Calling this endpoint will bypass the validation of user permissions of the user performing the action. ### Extendability   Extendable using REST endpoint handler: * Extending handler class: com.microsphere.accesscontrol.business.flows.serviceagreement.ServiceAgreementUsersAssignedFunctionGroupFlow 
     *
     * @param serviceAgreementId Service Agreement ID (required)
     * @param functionGroupId Function Group ID (required)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query. (optional, default to 0)
     * @param size Limit the number of elements in the response. (optional, default to 10)
     * @return Successfully retrieved users for service agreement by serviceAgreementId and functionGroupId. (status code 200)
     *         or # Reasons for getting HTTP status code 400: * Invalid from parameter * Invalid size parameter  | Message | key |--- | --- | | Invalid from parameter.         | user.get.error.message.E_INVALID_FROM_PARAMETER| | Invalid size parameter.         | user.get.error.message.E_INVALID_SIZE_PARAMETER|  (status code 400)
     *         or # Reasons for getting HTTP status code 404: * SA with provided serviceAgreementId does not exist. * Function group does not exist.  | Message | key | |--- | --- | | Service agreement does not exist. | serviceAgreements.get.error.message.E_NOT_EXISTS  | | Function group does not exist.    | functionAccessGroup.get.error.message.E_NOT_EXISTS|  (status code 404)
     */
    @ApiOperation(value = "Users with assigned Function Group.", nickname = "getUsers", notes = "# Retrieves information about users with assigned Function Group in Service Agreement by serviceAgreementId and functionGroupId. - `GET`. ### Warning: * Calling this endpoint will bypass the validation of user permissions of the user performing the action. ### Extendability   Extendable using REST endpoint handler: * Extending handler class: com.microsphere.accesscontrol.business.flows.serviceagreement.ServiceAgreementUsersAssignedFunctionGroupFlow ", response = UserAssignedFunctionGroupResponse.class, responseContainer = "List", tags={ "ServiceAgreement", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved users for service agreement by serviceAgreementId and functionGroupId.", response = UserAssignedFunctionGroupResponse.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400: * Invalid from parameter * Invalid size parameter  | Message | key |--- | --- | | Invalid from parameter.         | user.get.error.message.E_INVALID_FROM_PARAMETER| | Invalid size parameter.         | user.get.error.message.E_INVALID_SIZE_PARAMETER| ", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "# Reasons for getting HTTP status code 404: * SA with provided serviceAgreementId does not exist. * Function group does not exist.  | Message | key | |--- | --- | | Service agreement does not exist. | serviceAgreements.get.error.message.E_NOT_EXISTS  | | Function group does not exist.    | functionAccessGroup.get.error.message.E_NOT_EXISTS| ", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/serviceagreements/{serviceAgreementId}/function-groups/{functionGroupId}/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<UserAssignedFunctionGroupResponse>> getUsers(
            @ApiParam(value = "Service Agreement ID",required=true)
            @PathVariable("serviceAgreementId")
             String serviceAgreementId
,
                    @ApiParam(value = "Function Group ID",required=true)
            @PathVariable("functionGroupId")
             String functionGroupId
,
                    @ApiParam(value = "Page Number. Skip over pages of elements by specifying a start value for the query.", defaultValue = "0") @Valid
            @RequestParam(value = "from", required = false, defaultValue="0")
            
             Integer from
,
                    @ApiParam(value = "Limit the number of elements in the response.", defaultValue = "10") @Valid
            @RequestParam(value = "size", required = false, defaultValue="10")
            
             Integer size

    );


    /**
     * POST /service-api/v2/accessgroups/serviceagreements/ingest/serviceagreements : Ingest Service Agreement.
     * # Ingest Service Agreement    Creates new Service Agreement (required to provide Legal Entity participants together with Admins).
     *
     * @param servicesAgreementIngest # Ingest Service Agreement    Creates new Service Agreement (required to provide Legal Entity participants together with Admins). (optional)
     * @return Service Agreement has been successfully ingested. (status code 201)
     *         or # Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  * Legal Entity as part of Service Agreement can share Users and/or Accounts. If the LE shares Users that means that its Users can be added in the given SA and to be assigned with permissions. if the LE shares Accounts that means that its Accounts can be added and PG   * Creator of Service Agreement must be direct or indirect ancestor of the participant Legal Entities in Service Agreement.  * Invalid LE participation (some of the admins or users are not valid)  * Invalid start/end date time  * Invalid id or name identifier of assignable permission set  * Both or none of the identifiers sent for regular/admin user assignable permission set.    | Message | key |  |--- | --- |  |Legal entities hierarchy missing.|legalentity.get.error.message.E_INVALID_LEGAL_HIERARCHY|  |You can not add participants that are not under the creator legal entity hierarchy |serviceAgreements.save.error.message.E_INVALID_PARTICIPANT_HIERARCHY|  |LE Participant must share Users and/or Accounts|serviceAgreement.participant.add.error.message.E_LE_NOT_VALID_PARTICIPANT|  |Participant can not expose users if sharing users is not available.|serviceAgreement.ingest.error.message.INVALID_SHARING_USERS|  |Unexpected participants sharing options, participant should share both user and accounts.|serviceAgreement.ingest.error.message.INVALID_PARTICIPANTS_SHARING|  |Unable to create service agreement of this type. Maximum 1 per legal entity is allowed.|serviceAgreement.ingest.error.message.INVALID_MAXIMUM_SERVICE_AGREEMENTS|  |External ID already exists|serviceAgreements.save.error.message.E_EXTERNAL_ID_ALREADY_EXISTS|  |Invalid participant|participant.update.error.message.E_INVALID_PARTICIPANT|  |Wrong date/time format|datetime.valid.period.INVALID_FORMAT|  |Invalid validity period.|datetime.valid.period.INVALID_VALUE|  |Invalid id or name identifier of assignable permission set.|permissionSet.identifier.INVALID_VALUE|  |Both or none of the identifiers sent for regular/admin user assignable permission set.|permissionSet.identifier.INVALID_IDENTIFIERS|  |You cannot pass creator legal entity id for master service agreement|serviceAgreements.ingest.error.message.INVALID_PARAMETER_FOR_MASTER_SA|   (status code 400)
     */
    @ApiOperation(value = "Ingest Service Agreement.", nickname = "postServiceAgreementIngest", notes = "# Ingest Service Agreement    Creates new Service Agreement (required to provide Legal Entity participants together with Admins).", response = IdItem.class, tags={ "ServiceAgreement", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Service Agreement has been successfully ingested.", response = IdItem.class),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  * Legal Entity as part of Service Agreement can share Users and/or Accounts. If the LE shares Users that means that its Users can be added in the given SA and to be assigned with permissions. if the LE shares Accounts that means that its Accounts can be added and PG   * Creator of Service Agreement must be direct or indirect ancestor of the participant Legal Entities in Service Agreement.  * Invalid LE participation (some of the admins or users are not valid)  * Invalid start/end date time  * Invalid id or name identifier of assignable permission set  * Both or none of the identifiers sent for regular/admin user assignable permission set.    | Message | key |  |--- | --- |  |Legal entities hierarchy missing.|legalentity.get.error.message.E_INVALID_LEGAL_HIERARCHY|  |You can not add participants that are not under the creator legal entity hierarchy |serviceAgreements.save.error.message.E_INVALID_PARTICIPANT_HIERARCHY|  |LE Participant must share Users and/or Accounts|serviceAgreement.participant.add.error.message.E_LE_NOT_VALID_PARTICIPANT|  |Participant can not expose users if sharing users is not available.|serviceAgreement.ingest.error.message.INVALID_SHARING_USERS|  |Unexpected participants sharing options, participant should share both user and accounts.|serviceAgreement.ingest.error.message.INVALID_PARTICIPANTS_SHARING|  |Unable to create service agreement of this type. Maximum 1 per legal entity is allowed.|serviceAgreement.ingest.error.message.INVALID_MAXIMUM_SERVICE_AGREEMENTS|  |External ID already exists|serviceAgreements.save.error.message.E_EXTERNAL_ID_ALREADY_EXISTS|  |Invalid participant|participant.update.error.message.E_INVALID_PARTICIPANT|  |Wrong date/time format|datetime.valid.period.INVALID_FORMAT|  |Invalid validity period.|datetime.valid.period.INVALID_VALUE|  |Invalid id or name identifier of assignable permission set.|permissionSet.identifier.INVALID_VALUE|  |Both or none of the identifiers sent for regular/admin user assignable permission set.|permissionSet.identifier.INVALID_IDENTIFIERS|  |You cannot pass creator legal entity id for master service agreement|serviceAgreements.ingest.error.message.INVALID_PARAMETER_FOR_MASTER_SA|  ", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/serviceagreements/ingest/serviceagreements",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<IdItem> postServiceAgreementIngest(
            @ApiParam(value = "# Ingest Service Agreement    Creates new Service Agreement (required to provide Legal Entity participants together with Admins)."  )
            @Valid
            @RequestBody(required = false) ServicesAgreementIngest servicesAgreementIngest

    );


    /**
     * PUT /service-api/v2/accessgroups/serviceagreements/ingest/service-agreements/participants : batch update service agreement participants.
     * batch update service agreement participants
     *
     * @param presentationParticipantBatchUpdate batch update service agreement participants (optional)
     * @return MultiStatusExtended (status code 207)
     *         or NotFound (status code 404)
     *         or Forbidden (status code 403)
     *         or Unauthorized (status code 401)
     */
    @ApiOperation(value = "batch update service agreement participants.", nickname = "putPresentationIngestServiceAgreementParticipants", notes = "batch update service agreement participants", response = BatchResponseItemExtended.class, responseContainer = "List", tags={ "ServiceAgreement", })
    @ApiResponses(value = { 
        @ApiResponse(code = 207, message = "MultiStatusExtended", response = BatchResponseItemExtended.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = UnauthorizedAltError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/serviceagreements/ingest/service-agreements/participants",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<List<BatchResponseItemExtended>> putPresentationIngestServiceAgreementParticipants(
            @ApiParam(value = "batch update service agreement participants"  )
            @Valid
            @RequestBody(required = false) PresentationParticipantBatchUpdate presentationParticipantBatchUpdate

    );


    /**
     * PUT /service-api/v2/accessgroups/serviceagreements/ingest/service-agreements/admins : Add or Remove admins in service agreements batch.
     * # Add or Remove admins in service agreements batch    Adds/removes admins in service agreements batch
     *
     * @param presentationServiceAgreementUsersBatchUpdate # Add or Remove admins in service agreements batch    Adds/removes admins in service agreements batch (optional)
     * @return MultiStatusExtended (status code 207)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Add or Remove admins in service agreements batch.", nickname = "putPresentationServiceAgreementAdminsBatchUpdate", notes = "# Add or Remove admins in service agreements batch    Adds/removes admins in service agreements batch", response = BatchResponseItemExtended.class, responseContainer = "List", tags={ "ServiceAgreement", })
    @ApiResponses(value = { 
        @ApiResponse(code = 207, message = "MultiStatusExtended", response = BatchResponseItemExtended.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/serviceagreements/ingest/service-agreements/admins",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<List<BatchResponseItemExtended>> putPresentationServiceAgreementAdminsBatchUpdate(
            @ApiParam(value = "# Add or Remove admins in service agreements batch    Adds/removes admins in service agreements batch"  )
            @Valid
            @RequestBody(required = false) PresentationServiceAgreementUsersBatchUpdate presentationServiceAgreementUsersBatchUpdate

    );


    /**
     * PUT /service-api/v2/accessgroups/serviceagreements/ingest/service-agreements/users : Add or Remove users in service agreements batch.
     * # Add or Remove users in service agreements batch    Adds/removes users in service agreements batch
     *
     * @param presentationServiceAgreementUsersBatchUpdate # Add or Remove users in service agreements batch    Adds/removes users in service agreements batch (optional)
     * @return MultiStatusExtended (status code 207)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Add or Remove users in service agreements batch.", nickname = "putPresentationServiceAgreementUsersBatchUpdate", notes = "# Add or Remove users in service agreements batch    Adds/removes users in service agreements batch", response = BatchResponseItemExtended.class, responseContainer = "List", tags={ "ServiceAgreement", })
    @ApiResponses(value = { 
        @ApiResponse(code = 207, message = "MultiStatusExtended", response = BatchResponseItemExtended.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/serviceagreements/ingest/service-agreements/users",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<List<BatchResponseItemExtended>> putPresentationServiceAgreementUsersBatchUpdate(
            @ApiParam(value = "# Add or Remove users in service agreements batch    Adds/removes users in service agreements batch"  )
            @Valid
            @RequestBody(required = false) PresentationServiceAgreementUsersBatchUpdate presentationServiceAgreementUsersBatchUpdate

    );


    /**
     * PUT /service-api/v2/accessgroups/serviceagreements/{serviceAgreementId} : Updates name, description and external Id for a specific service agreement.
     * Updates name, description and external Id for a specific service agreement.
     *
     * @param serviceAgreementId Service Agreement ID (required)
     * @param serviceAgreementPut Updates name, description and external Id for a specific service agreement. (optional)
     * @return Service Agreement updated successfully. (status code 200)
     *         or BadRequest (status code 400)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Updates name, description and external Id for a specific service agreement.", nickname = "putServiceAgreementItem", notes = "Updates name, description and external Id for a specific service agreement.", tags={ "ServiceAgreement", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Service Agreement updated successfully."),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/serviceagreements/{serviceAgreementId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> putServiceAgreementItem(
            @ApiParam(value = "Service Agreement ID",required=true)
            @PathVariable("serviceAgreementId")
             String serviceAgreementId
,
                    @ApiParam(value = "Updates name, description and external Id for a specific service agreement."  )
            @Valid
            @RequestBody(required = false) ServiceAgreementPut serviceAgreementPut

    );

}
