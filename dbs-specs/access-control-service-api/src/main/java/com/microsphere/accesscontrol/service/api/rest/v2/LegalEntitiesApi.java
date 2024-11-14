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
import com.microsphere.accesscontrol.service.api.rest.v2.model.GetServiceAgreement;
import com.microsphere.accesscontrol.service.api.rest.v2.model.LegalEntitiesBatchDelete;
import com.microsphere.accesscontrol.service.api.rest.v2.model.LegalEntityCreateItem;
import com.microsphere.accesscontrol.service.api.rest.v2.model.LegalEntityItem;
import com.microsphere.accesscontrol.service.api.rest.v2.model.LegalEntityItemBase;
import com.microsphere.accesscontrol.service.api.rest.v2.model.LegalEntityItemId;
import com.microsphere.accesscontrol.service.api.rest.v2.model.LegalEntityPut;
import com.microsphere.accesscontrol.service.api.rest.v2.model.LegalEntityUpdateItem;
import java.util.List;
import com.microsphere.accesscontrol.service.api.rest.v2.model.NotFoundError;
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
@Api(value = "LegalEntities", description = "the LegalEntities API")
public interface LegalEntitiesApi {

    /**
     * GET /service-api/v2/legalentities/external/{externalId} : Legal Entity by external id - &#x60;GET&#x60;.
     * # Legal Entity by external id - &#x60;GET&#x60;    Initial call to retrieve a Legal Entity from the microsphere platform with the given Legal Entity external reference.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.legalentity.routes.GetLegalEntityByExternalIdRoute  * Route Id: GetLegalEntityByExternalId  * Route source endpoint: direct:business.legalentities.GetLegalEntityByExternalId  * Route destination endpoint: direct:getLegalEntityByExternalIdRequestedInternal  
     *
     * @param externalId Legal Entity external ID (required)
     * @return # Legal Entity by external id - &#x60;GET&#x60;    Initial call to retrieve a Legal Entity from the microsphere platform with the given Legal Entity external reference.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.legalentity.routes.GetLegalEntityByExternalIdRoute  * Route Id: GetLegalEntityByExternalId  * Route source endpoint: direct:business.legalentities.GetLegalEntityByExternalId  * Route destination endpoint: direct:getLegalEntityByExternalIdRequestedInternal   (status code 200)
     *         or # Reasons for getting HTTP status code 403:    * User does not have permissions to perform the action.    | Message | key |  | --- | --- |  | User does not have access to Manage Entitlements | entitlements.access.error.message.E_NOT_ACCESS   (status code 403)
     *         or BadRequest (status code 400)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Legal Entity by external id - `GET`.", nickname = "getLegalEntityByExternalId", notes = "# Legal Entity by external id - `GET`    Initial call to retrieve a Legal Entity from the microsphere platform with the given Legal Entity external reference.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.legalentity.routes.GetLegalEntityByExternalIdRoute  * Route Id: GetLegalEntityByExternalId  * Route source endpoint: direct:business.legalentities.GetLegalEntityByExternalId  * Route destination endpoint: direct:getLegalEntityByExternalIdRequestedInternal  ", response = LegalEntityItemBase.class, tags={ "legalEntities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "# Legal Entity by external id - `GET`    Initial call to retrieve a Legal Entity from the microsphere platform with the given Legal Entity external reference.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.legalentity.routes.GetLegalEntityByExternalIdRoute  * Route Id: GetLegalEntityByExternalId  * Route source endpoint: direct:business.legalentities.GetLegalEntityByExternalId  * Route destination endpoint: direct:getLegalEntityByExternalIdRequestedInternal  ", response = LegalEntityItemBase.class),
        @ApiResponse(code = 403, message = "# Reasons for getting HTTP status code 403:    * User does not have permissions to perform the action.    | Message | key |  | --- | --- |  | User does not have access to Manage Entitlements | entitlements.access.error.message.E_NOT_ACCESS  ", response = ForbiddenError.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/legalentities/external/{externalId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<LegalEntityItemBase> getLegalEntityByExternalId(
            @ApiParam(value = "Legal Entity external ID",required=true)
            @PathVariable("externalId")
             String externalId

    );


    /**
     * GET /service-api/v2/legalentities/{legalEntityId} : Retrieve a single Legal Entity.
     * Retrieve a single Legal Entity.
     *
     * @param legalEntityId Legal Entity internal ID (required)
     * @return Legal Entity by id retrieved successfully. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Retrieve a single Legal Entity.", nickname = "getLegalEntityById", notes = "Retrieve a single Legal Entity.", response = LegalEntityItem.class, tags={ "legalEntities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Legal Entity by id retrieved successfully.", response = LegalEntityItem.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/legalentities/{legalEntityId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<LegalEntityItem> getLegalEntityById(
            @ApiParam(value = "Legal Entity internal ID",required=true)
            @PathVariable("legalEntityId")
             String legalEntityId

    );


    /**
     * GET /service-api/v2/legalentities/external/{externalId}/serviceagreements/master : Retrieve the master service agreement for a external Legal Entity.
     * Retrieve the master service agreement for a external Legal Entity.
     *
     * @param externalId Legal Entity external ID (required)
     * @return Successfully returned master service agreement for provided legal entity external ID. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Retrieve the master service agreement for a external Legal Entity.", nickname = "getMasterServiceAgreementByExternalLegalEntity", notes = "Retrieve the master service agreement for a external Legal Entity.", response = GetServiceAgreement.class, tags={ "legalEntities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully returned master service agreement for provided legal entity external ID.", response = GetServiceAgreement.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/legalentities/external/{externalId}/serviceagreements/master",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GetServiceAgreement> getMasterServiceAgreementByExternalLegalEntity(
            @ApiParam(value = "Legal Entity external ID",required=true)
            @PathVariable("externalId")
             String externalId

    );


    /**
     * GET /service-api/v2/legalentities/sub-entities : Retrieve a list of all children of the given Legal Entity.
     * Retrieve a list of all children of the given Legal Entity.
     *
     * @param parentEntityId Parent Legal Entity internal ID (optional)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional)
     * @param query The search term used to search. (optional)
     * @return # Legal Entities list - &#x60;GET&#x60;    Initial call to retrieve the list of legal entities (customers) from the microsphere platform.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.legalentity.routes.ListLegalEntitiesRoute  * Route Id: ListLegalEntities  * Route source endpoint: direct:business.legalEntities.ListLegalEntities  * Route destination endpoint: direct:listLegalEntitiesRequestedInternal   (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     */
    @ApiOperation(value = "Retrieve a list of all children of the given Legal Entity.", nickname = "getSubEntities", notes = "Retrieve a list of all children of the given Legal Entity.", response = LegalEntityItemBase.class, responseContainer = "List", tags={ "legalEntities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "# Legal Entities list - `GET`    Initial call to retrieve the list of legal entities (customers) from the microsphere platform.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.legalentity.routes.ListLegalEntitiesRoute  * Route Id: ListLegalEntities  * Route source endpoint: direct:business.legalEntities.ListLegalEntities  * Route destination endpoint: direct:listLegalEntitiesRequestedInternal  ", response = LegalEntityItemBase.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/legalentities/sub-entities",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<LegalEntityItemBase>> getSubEntities(
            @ApiParam(value = "Parent Legal Entity internal ID") @Valid
            @RequestParam(value = "parentEntityId", required = false)
            
             String parentEntityId
,
                    @ApiParam(value = "Record UUID. As an alternative for specifying 'from' this allows to point to the record to start the selection from. ") @Valid
            @RequestParam(value = "cursor", required = false)
            
             String cursor
,
                    @ApiParam(value = "Page Number. Skip over pages of elements by specifying a start value for the query") @Valid
            @RequestParam(value = "from", required = false)
            
             Integer from
,
                    @ApiParam(value = "Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor. ") @Valid
            @RequestParam(value = "size", required = false)
            
             Integer size
,
                    @ApiParam(value = "The search term used to search.") @Valid
            @RequestParam(value = "query", required = false)
            
             String query

    );


    /**
     * POST /service-api/v2/legalentities/create : Add a new legal entity without master service agreement. - &#x60;POST&#x60;.
     * # Add a new legal entity without master service agreement - &#x60;POST&#x60;    Add a new legal entity without master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow  
     *
     * @param legalEntityCreateItem # Add a new legal entity without master service agreement - &#x60;POST&#x60;    Add a new legal entity without master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow   (optional)
     * @return # Legal entity was successfully created. (status code 201)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     */
    @ApiOperation(value = "Add a new legal entity without master service agreement. - `POST`.", nickname = "postCreateLegalEntities", notes = "# Add a new legal entity without master service agreement - `POST`    Add a new legal entity without master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow  ", response = LegalEntityItemId.class, tags={ "legalEntities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "# Legal entity was successfully created.", response = LegalEntityItemId.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/legalentities/create",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LegalEntityItemId> postCreateLegalEntities(
            @ApiParam(value = "# Add a new legal entity without master service agreement - `POST`    Add a new legal entity without master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow  "  )
            @Valid
            @RequestBody(required = false) LegalEntityCreateItem legalEntityCreateItem

    );


    /**
     * POST /service-api/v2/legalentities : Add a new legal entity with master service agreement- &#x60;POST&#x60;.
     * # Add a new legal entity with master service agreement - &#x60;POST&#x60;     Add a new legal entity with master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow  
     *
     * @param legalEntityCreateItem # Add a new legal entity with master service agreement - &#x60;POST&#x60;     Add a new legal entity with master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow   (optional)
     * @return # Legal entity was successfully created. (status code 201)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     */
    @ApiOperation(value = "Add a new legal entity with master service agreement- `POST`.", nickname = "postLegalEntities", notes = "# Add a new legal entity with master service agreement - `POST`     Add a new legal entity with master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow  ", response = LegalEntityItemId.class, tags={ "legalEntities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "# Legal entity was successfully created.", response = LegalEntityItemId.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/legalentities",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LegalEntityItemId> postLegalEntities(
            @ApiParam(value = "# Add a new legal entity with master service agreement - `POST`     Add a new legal entity with master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow  "  )
            @Valid
            @RequestBody(required = false) LegalEntityCreateItem legalEntityCreateItem

    );


    /**
     * POST /service-api/v2/legalentities/batch/delete : Legal Entity POST.
     * # Legal Entity POST.    POST request to delete batch legal entities.
     *
     * @param legalEntitiesBatchDelete # Legal Entity POST.    POST request to delete batch legal entities. (optional)
     * @return BadRequest (status code 400)
     *         or MultiStatus (status code 207)
     */
    @ApiOperation(value = "Legal Entity POST.", nickname = "postLegalEntitiesBatchDelete", notes = "# Legal Entity POST.    POST request to delete batch legal entities.", response = BatchResponseItem.class, responseContainer = "List", tags={ "legalEntities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 207, message = "MultiStatus", response = BatchResponseItem.class, responseContainer = "List") })
    @RequestMapping(value = "/service-api/v2/legalentities/batch/delete",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<BatchResponseItem>> postLegalEntitiesBatchDelete(
            @ApiParam(value = "# Legal Entity POST.    POST request to delete batch legal entities."  )
            @Valid
            @RequestBody(required = false) LegalEntitiesBatchDelete legalEntitiesBatchDelete

    );


    /**
     * PUT /service-api/v2/legalentities : Legal Entity Batch Put.
     * # Legal Entity Batch Put    Update batch of legal entities.
     *
     * @param legalEntityPut # Legal Entity Batch Put    Update batch of legal entities. (required)
     * @return MultiStatus (status code 207)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Legal Entity Batch Put.", nickname = "putLegalEntities", notes = "# Legal Entity Batch Put    Update batch of legal entities.", response = BatchResponseItem.class, responseContainer = "List", tags={ "legalEntities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 207, message = "MultiStatus", response = BatchResponseItem.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/legalentities",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<List<BatchResponseItem>> putLegalEntities(
            @ApiParam(value = "# Legal Entity Batch Put    Update batch of legal entities." ,required=true )
            @Valid @NotNull
            @RequestBody List<LegalEntityPut> legalEntityPut

    );


    /**
     * PUT /service-api/v2/legalentities/external/{externalId} : Update legal entity.
     * # Update legal entity.  Updates the type of the Legal Entity by it&#39;s external ID.
     *
     * @param externalId Legal Entity external ID (required)
     * @param legalEntityUpdateItem # Update legal entity.  Updates the type of the Legal Entity by it&#39;s external ID. (optional)
     * @return Legal entity was successfully updated. (status code 200)
     *         or BadRequest (status code 400)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Update legal entity.", nickname = "putLegalEntityByExternalId", notes = "# Update legal entity.  Updates the type of the Legal Entity by it's external ID.", tags={ "legalEntities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Legal entity was successfully updated."),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/legalentities/external/{externalId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> putLegalEntityByExternalId(
            @ApiParam(value = "Legal Entity external ID",required=true)
            @PathVariable("externalId")
             String externalId
,
                    @ApiParam(value = "# Update legal entity.  Updates the type of the Legal Entity by it's external ID."  )
            @Valid
            @RequestBody(required = false) LegalEntityUpdateItem legalEntityUpdateItem

    );

}
