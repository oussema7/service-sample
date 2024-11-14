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
import com.microsphere.accesscontrol.service.api.rest.v2.model.DataGroupItemSystemBase;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.IdItem;
import java.util.List;
import com.microsphere.accesscontrol.service.api.rest.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationDataGroupIdentifier;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationDataGroupItemPutRequestBody;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationDataGroupUpdate;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationSearchDataGroupsRequest;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationServiceAgreementWithDataGroupsItem;
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
@Api(value = "DataGroups", description = "the DataGroups API")
public interface DataGroupsApi {

    /**
     * DELETE /service-api/v2/accessgroups/data-groups/{id} : Delete Data Group - &#x60;DELETE&#x60;.
     * # Delete Data Group - &#x60;DELETE&#x60;    Deletes the specific data group by internal data group id.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.DeleteDataGroupRoute  * Route Id: DeleteDataGroupRoute  * Route source endpoint: direct:business.DeleteDataGroup  * Route destination endpoint: direct:deleteDataGroupRequestedInternal
     *
     * @param id Data Group Id (required)
     * @return Data Group deleted successfully. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Delete Data Group - `DELETE`.", nickname = "deleteDataGroupById", notes = "# Delete Data Group - `DELETE`    Deletes the specific data group by internal data group id.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.DeleteDataGroupRoute  * Route Id: DeleteDataGroupRoute  * Route source endpoint: direct:business.DeleteDataGroup  * Route destination endpoint: direct:deleteDataGroupRequestedInternal", tags={ "DataGroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Data Group deleted successfully."),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/data-groups/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDataGroupById(
            @ApiParam(value = "Data Group Id",required=true)
            @PathVariable("id")
             String id

    );


    /**
     * POST /service-api/v2/accessgroups/data-groups : Create Data Group - &#x60;POST&#x60;.
     * # Create Data Group - &#x60;POST&#x60;    Creates a new data group.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.AddDataGroupRoute  * Route Id: AddDataGroupRoute  * Route source endpoint:     - direct:accessgroup.datagroup.add  * Route destination endpoint:    - direct:accessgroup.datagroup.add.validate    - direct:accessgroup.datagroup.add.persist
     *
     * @param dataGroupItemSystemBase # Create Data Group - &#x60;POST&#x60;    Creates a new data group.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.AddDataGroupRoute  * Route Id: AddDataGroupRoute  * Route source endpoint:     - direct:accessgroup.datagroup.add  * Route destination endpoint:    - direct:accessgroup.datagroup.add.validate    - direct:accessgroup.datagroup.add.persist (optional)
     * @return New data group created successfully. (status code 201)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Create Data Group - `POST`.", nickname = "postDataGroups", notes = "# Create Data Group - `POST`    Creates a new data group.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.AddDataGroupRoute  * Route Id: AddDataGroupRoute  * Route source endpoint:     - direct:accessgroup.datagroup.add  * Route destination endpoint:    - direct:accessgroup.datagroup.add.validate    - direct:accessgroup.datagroup.add.persist", response = IdItem.class, tags={ "DataGroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "New data group created successfully.", response = IdItem.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/data-groups",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<IdItem> postDataGroups(
            @ApiParam(value = "# Create Data Group - `POST`    Creates a new data group.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.AddDataGroupRoute  * Route Id: AddDataGroupRoute  * Route source endpoint:     - direct:accessgroup.datagroup.add  * Route destination endpoint:    - direct:accessgroup.datagroup.add.validate    - direct:accessgroup.datagroup.add.persist"  )
            @Valid
            @RequestBody(required = false) DataGroupItemSystemBase dataGroupItemSystemBase

    );


    /**
     * POST /service-api/v2/accessgroups/data-groups/batch/delete : Data Groups Batch Delete - &#x60;POST&#x60;.
     * # Data Groups Batch Delete - &#x60;POST&#x60;    Batch delete of data groups.  Delete may be done by: data group internal id or (data group name and referenced service agreement external id).
     *
     * @param presentationDataGroupIdentifier # Data Groups Batch Delete - &#x60;POST&#x60;    Batch delete of data groups.  Delete may be done by: data group internal id or (data group name and referenced service agreement external id). (optional)
     * @return MultiStatusExtended (status code 207)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Data Groups Batch Delete - `POST`.", nickname = "postDataGroupsDelete", notes = "# Data Groups Batch Delete - `POST`    Batch delete of data groups.  Delete may be done by: data group internal id or (data group name and referenced service agreement external id).", response = BatchResponseItemExtended.class, responseContainer = "List", tags={ "DataGroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 207, message = "MultiStatusExtended", response = BatchResponseItemExtended.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/data-groups/batch/delete",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<BatchResponseItemExtended>> postDataGroupsDelete(
            @ApiParam(value = "# Data Groups Batch Delete - `POST`    Batch delete of data groups.  Delete may be done by: data group internal id or (data group name and referenced service agreement external id)."  )
            @Valid
            @RequestBody(required = false) List<PresentationDataGroupIdentifier> presentationDataGroupIdentifier

    );


    /**
     * POST /service-api/v2/accessgroups/data-groups/type/{type}/search : Search data groups  - &#x60;POST&#x60;.
     * # Search data groups  - &#x60;POST&#x60;    Filters data groups with specific type, by service agreement or by data item  - &#x60;serviceAgreementIdentifier&#x60; can be internal or external id or name of service agreement  - &#x60;dataItemIdentifier&#x60; can be internal or external data item id.
     *
     * @param type Type of the data group. (required)
     * @param presentationSearchDataGroupsRequest # Search data groups  - &#x60;POST&#x60;    Filters data groups with specific type, by service agreement or by data item  - &#x60;serviceAgreementIdentifier&#x60; can be internal or external id or name of service agreement  - &#x60;dataItemIdentifier&#x60; can be internal or external data item id.  - &#x60;LegalEntityIdentifier&#x60; can be external legal entity id. (optional)
     * @return List of data groups that fulfill the serach criteria, grouped by service agreements. (status code 200)
     *         or # Reasons for getting HTTP status code 400:    * No service agreement or data item identifier is provided in request body.   * Can not search PAYEES data item type without providing service agreement identifier.     | Message | key |  | --- | --- |  |  No service agreement or data item identifier is provided | dataGroups.search.request.invalid |   | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE|   | Service agreement identifier must be provided for this data item type | datagroup.search.error.message.MISSING_SERVICE_AGREEMENT_IDENTIFIER|    (status code 400)
     */
    @ApiOperation(value = "Search data groups  - `POST`.", nickname = "postSearch", notes = "# Search data groups  - `POST`    Filters data groups with specific type, by service agreement or by data item  - `serviceAgreementIdentifier` can be internal or external id or name of service agreement  - `dataItemIdentifier` can be internal or external data item id.", response = PresentationServiceAgreementWithDataGroupsItem.class, responseContainer = "List", tags={ "DataGroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of data groups that fulfill the serach criteria, grouped by service agreements.", response = PresentationServiceAgreementWithDataGroupsItem.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:    * No service agreement or data item identifier is provided in request body.   * Can not search PAYEES data item type without providing service agreement identifier.     | Message | key |  | --- | --- |  |  No service agreement or data item identifier is provided | dataGroups.search.request.invalid |   | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE|   | Service agreement identifier must be provided for this data item type | datagroup.search.error.message.MISSING_SERVICE_AGREEMENT_IDENTIFIER|   ", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/data-groups/type/{type}/search",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<PresentationServiceAgreementWithDataGroupsItem>> postSearch(
            @ApiParam(value = "Type of the data group.",required=true)
            @PathVariable("type")
             String type
,
                    @ApiParam(value = "# Search data groups  - `POST`    Filters data groups with specific type, by service agreement or by data item  - `serviceAgreementIdentifier` can be internal or external id or name of service agreement  - `dataItemIdentifier` can be internal or external data item id.  - `LegalEntityIdentifier` can be external legal entity id."  )
            @Valid
            @RequestBody(required = false) PresentationSearchDataGroupsRequest presentationSearchDataGroupsRequest

    );


    /**
     * PUT /service-api/v2/accessgroups/data-groups/batch/update/data-items : Data Group Item Batch Update - &#x60;PUT&#x60;.
     * # Data Group Item Batch Update - &#x60;PUT&#x60;    Batch update of data group item by providing a list of   - dataGroupIdentifier   - action   - type   - dataItems (containing internal or external data items ids)  This identifier will be included as a part of data group object containing  one of the data group identifiers (name identifier or internal Id identifier).    Data items identifiers must all be internal or all external for one data group identifier.
     *
     * @param presentationDataGroupItemPutRequestBody # Data Group Item Batch Update - &#x60;PUT&#x60;    Batch update of data group item by providing a list of   - dataGroupIdentifier   - action   - type   - dataItems (containing internal or external data items ids)  This identifier will be included as a part of data group object containing  one of the data group identifiers (name identifier or internal Id identifier).    Data items identifiers must all be internal or all external for one data group identifier. (optional)
     * @return # Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  The Data Group type must be specified.      * Invalid or empty data group items    (status code 400)
     *         or # HTTP status code 200 is returned for successfully updated data group items    # Reasons for getting HTTP status code 400 inside one or more batch response items:    * Request does not honor the contract, check the example in the Request tab.  * Invalid data group/data item identifier   (status code 207)
     */
    @ApiOperation(value = "Data Group Item Batch Update - `PUT`.", nickname = "putDataGroupItemsUpdate", notes = "# Data Group Item Batch Update - `PUT`    Batch update of data group item by providing a list of   - dataGroupIdentifier   - action   - type   - dataItems (containing internal or external data items ids)  This identifier will be included as a part of data group object containing  one of the data group identifiers (name identifier or internal Id identifier).    Data items identifiers must all be internal or all external for one data group identifier.", response = BatchResponseItemExtended.class, responseContainer = "List", tags={ "DataGroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  The Data Group type must be specified.      * Invalid or empty data group items   ", response = BadRequestError.class),
        @ApiResponse(code = 207, message = "# HTTP status code 200 is returned for successfully updated data group items    # Reasons for getting HTTP status code 400 inside one or more batch response items:    * Request does not honor the contract, check the example in the Request tab.  * Invalid data group/data item identifier  ", response = BatchResponseItemExtended.class, responseContainer = "List") })
    @RequestMapping(value = "/service-api/v2/accessgroups/data-groups/batch/update/data-items",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<List<BatchResponseItemExtended>> putDataGroupItemsUpdate(
            @ApiParam(value = "# Data Group Item Batch Update - `PUT`    Batch update of data group item by providing a list of   - dataGroupIdentifier   - action   - type   - dataItems (containing internal or external data items ids)  This identifier will be included as a part of data group object containing  one of the data group identifiers (name identifier or internal Id identifier).    Data items identifiers must all be internal or all external for one data group identifier."  )
            @Valid
            @RequestBody(required = false) List<PresentationDataGroupItemPutRequestBody> presentationDataGroupItemPutRequestBody

    );


    /**
     * PUT /service-api/v2/accessgroups/data-groups : Update Data Group details - &#x60;PUT&#x60;.
     * # Update Data Group details - &#x60;PUT&#x60;    Updates details for a specific data group.  Update may be done by: data group internal id or (data group name and referenced service agreement external id)    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.UpdateDataGroupByIdGroupRoute  * Route Id: UpdateDataGroupByIdGroupRoute  * Route source endpoint: direct:accessgroup.datagroup.update  * Route destination endpoint:      - direct:accessgroup.datagroup.update.validate     - direct:accessgroup.datagroup.update.persist
     *
     * @param presentationDataGroupUpdate # Update Data Group details - &#x60;PUT&#x60;    Updates details for a specific data group.  Update may be done by: data group internal id or (data group name and referenced service agreement external id)    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.UpdateDataGroupByIdGroupRoute  * Route Id: UpdateDataGroupByIdGroupRoute  * Route source endpoint: direct:accessgroup.datagroup.update  * Route destination endpoint:      - direct:accessgroup.datagroup.update.validate     - direct:accessgroup.datagroup.update.persist (optional)
     * @return Data group updated successfully. (status code 200)
     *         or # Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  * Name not unique  * Service agreement does not exist  * Data group with specified name and external service agreement is already in pending state.  * Data group type “CUSTOMERS” is not allowed    | Message | key |  | --- | --- |  | Invalid data group identifiers | dataGroup.identifier.error.message.E_INVALID_DATA_GROUP_IDENTIFIERS  | Invalid service agreement | dataGroup.update.error.message.E_INVALID_SERVICE_AGREEMENT  | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE  | Invalid data group items | dataGroup.save.error.message.E_INVALID_DATA_GROUP_ITEMS  | Data Access Group with given name already exists | dataAccessGroup.save.error.message.E_ALREADY_EXISTS  | Service agreement does not exist | serviceAgreements.get.error.message.E_NOT_EXISTS  | There is pending action of data group. | dataGroup.update.approval.error.message.ALREADY_IN_PENDING_STATE  | Data group type is not allowed. | dataGroup.save.error.message.E_NOT_ALLOWED_DATA_GROUP_TYPE  | The Data Group type must be specified. | dataGroup.get.error.message.E_DATA_GROUP_TYPE_NOT_SPECIFIED   (status code 400)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Update Data Group details - `PUT`.", nickname = "putDataGroups", notes = "# Update Data Group details - `PUT`    Updates details for a specific data group.  Update may be done by: data group internal id or (data group name and referenced service agreement external id)    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.UpdateDataGroupByIdGroupRoute  * Route Id: UpdateDataGroupByIdGroupRoute  * Route source endpoint: direct:accessgroup.datagroup.update  * Route destination endpoint:      - direct:accessgroup.datagroup.update.validate     - direct:accessgroup.datagroup.update.persist", tags={ "DataGroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Data group updated successfully."),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  * Name not unique  * Service agreement does not exist  * Data group with specified name and external service agreement is already in pending state.  * Data group type “CUSTOMERS” is not allowed    | Message | key |  | --- | --- |  | Invalid data group identifiers | dataGroup.identifier.error.message.E_INVALID_DATA_GROUP_IDENTIFIERS  | Invalid service agreement | dataGroup.update.error.message.E_INVALID_SERVICE_AGREEMENT  | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE  | Invalid data group items | dataGroup.save.error.message.E_INVALID_DATA_GROUP_ITEMS  | Data Access Group with given name already exists | dataAccessGroup.save.error.message.E_ALREADY_EXISTS  | Service agreement does not exist | serviceAgreements.get.error.message.E_NOT_EXISTS  | There is pending action of data group. | dataGroup.update.approval.error.message.ALREADY_IN_PENDING_STATE  | Data group type is not allowed. | dataGroup.save.error.message.E_NOT_ALLOWED_DATA_GROUP_TYPE  | The Data Group type must be specified. | dataGroup.get.error.message.E_DATA_GROUP_TYPE_NOT_SPECIFIED  ", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/data-groups",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> putDataGroups(
            @ApiParam(value = "# Update Data Group details - `PUT`    Updates details for a specific data group.  Update may be done by: data group internal id or (data group name and referenced service agreement external id)    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.UpdateDataGroupByIdGroupRoute  * Route Id: UpdateDataGroupByIdGroupRoute  * Route source endpoint: direct:accessgroup.datagroup.update  * Route destination endpoint:      - direct:accessgroup.datagroup.update.validate     - direct:accessgroup.datagroup.update.persist"  )
            @Valid
            @RequestBody(required = false) PresentationDataGroupUpdate presentationDataGroupUpdate

    );

}
