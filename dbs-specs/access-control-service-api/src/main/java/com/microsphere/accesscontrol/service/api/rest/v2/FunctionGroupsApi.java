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
import java.util.List;
import com.microsphere.accesscontrol.service.api.rest.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationFunctionGroupPutRequestBody;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationIdentifier;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationIngestFunctionGroup;
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
@Api(value = "FunctionGroups", description = "the FunctionGroups API")
public interface FunctionGroupsApi {

    /**
     * DELETE /service-api/v2/accessgroups/function-groups/{id} : Delete Function Group - &#x60;DELETE&#x60;.
     * # Delete Function Group - &#x60;DELETE&#x60;    Deletes the specific function group.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.functiongroup.DeleteFunctionGroupByIdRoute  * Route Id: DeleteFunctionGroupByIdRoute  * Route source endpoint: direct:business.DeleteFunctionGroupById  * Route destination endpoint: direct:deleteFunctionGroupByIdRequestedInternal
     *
     * @param id Function Group Id (required)
     * @return Function group deleted successfully. (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Delete Function Group - `DELETE`.", nickname = "deleteFunctionGroupById", notes = "# Delete Function Group - `DELETE`    Deletes the specific function group.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.functiongroup.DeleteFunctionGroupByIdRoute  * Route Id: DeleteFunctionGroupByIdRoute  * Route source endpoint: direct:business.DeleteFunctionGroupById  * Route destination endpoint: direct:deleteFunctionGroupByIdRequestedInternal", tags={ "FunctionGroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Function group deleted successfully."),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/function-groups/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteFunctionGroupById(
            @ApiParam(value = "Function Group Id",required=true)
            @PathVariable("id")
             String id

    );


    /**
     * POST /service-api/v2/accessgroups/function-groups/batch/delete : Function Groups Batch - Delete.
     * # Function Groups Batch - Delete    Batch delete of function groups by list of provided Function Group IDs.
     *
     * @param presentationIdentifier # Function Groups Batch - Delete    Batch delete of function groups by list of provided Function Group IDs. (optional)
     * @return MultiStatusExtended (status code 207)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Function Groups Batch - Delete.", nickname = "postFunctionGroupsDelete", notes = "# Function Groups Batch - Delete    Batch delete of function groups by list of provided Function Group IDs.", response = BatchResponseItemExtended.class, responseContainer = "List", tags={ "FunctionGroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 207, message = "MultiStatusExtended", response = BatchResponseItemExtended.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/function-groups/batch/delete",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<BatchResponseItemExtended>> postFunctionGroupsDelete(
            @ApiParam(value = "# Function Groups Batch - Delete    Batch delete of function groups by list of provided Function Group IDs."  )
            @Valid
            @RequestBody(required = false) List<PresentationIdentifier> presentationIdentifier

    );


    /**
     * POST /service-api/v2/accessgroups/function-groups/ingest : Creates a new function group.
     * Creates a new function group.
     *
     * @param presentationIngestFunctionGroup Creates a new function group. (optional)
     * @return New function group created successfully. (status code 201)
     *         or # Reasons for getting HTTP status code 400:    * Job role template can&#39;t be created for custom service agreement.  * Either apsId or apsName should be sent.  * Function Group with given name already exists  * Invalid validity period.  * Function Group can not be created/updated - Invalid Business Function  * Function Group can not be created/updated - invalid or not applicable Privilege  * There is a pending record of function group with same name  * Service agreement does not exist    | Message | key   --- | --- |  | Job role template can&#39;t be created for custom service agreement. | functionGroup.create.error.message.JRT_NOT_ALLOWED_FOR_CUSTOM_SA  | Either apsId or apsName should be sent. | functionGroup.create.error.message.NEITHER_OF_APS_IDENTIFIERS_PROVIDED  | Function Group with given name already exists. | functionGroup.save.error.message.E_ALREADY_EXISTS  | Invalid validity period. | datetime.valid.period.INVALID_VALUE  | Function Group can not be created/updated - Invalid Business Function | functionGroup.create.update.error.message.E_FUNCTION_NOT_EXISTS  | Function Group can not be created/updated - invalid or not applicable Privilege | permission.get.error.E_INVALID_OR_NOT_APPLICABLE_PRIVILEGE  | There is a pending record of function group with same name | functionGroup.create.approval.error.message.ALREADY_IN_PENDING_STATE  | Service agreement does not exist | serviceAgreements.get.error.message.E_NOT_EXISTS   (status code 400)
     *         or Forbidden (status code 403)
     */
    @ApiOperation(value = "Creates a new function group.", nickname = "postPresentationIngestFunctionGroup", notes = "Creates a new function group.", response = IdItem.class, tags={ "FunctionGroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "New function group created successfully.", response = IdItem.class),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:    * Job role template can't be created for custom service agreement.  * Either apsId or apsName should be sent.  * Function Group with given name already exists  * Invalid validity period.  * Function Group can not be created/updated - Invalid Business Function  * Function Group can not be created/updated - invalid or not applicable Privilege  * There is a pending record of function group with same name  * Service agreement does not exist    | Message | key   --- | --- |  | Job role template can't be created for custom service agreement. | functionGroup.create.error.message.JRT_NOT_ALLOWED_FOR_CUSTOM_SA  | Either apsId or apsName should be sent. | functionGroup.create.error.message.NEITHER_OF_APS_IDENTIFIERS_PROVIDED  | Function Group with given name already exists. | functionGroup.save.error.message.E_ALREADY_EXISTS  | Invalid validity period. | datetime.valid.period.INVALID_VALUE  | Function Group can not be created/updated - Invalid Business Function | functionGroup.create.update.error.message.E_FUNCTION_NOT_EXISTS  | Function Group can not be created/updated - invalid or not applicable Privilege | permission.get.error.E_INVALID_OR_NOT_APPLICABLE_PRIVILEGE  | There is a pending record of function group with same name | functionGroup.create.approval.error.message.ALREADY_IN_PENDING_STATE  | Service agreement does not exist | serviceAgreements.get.error.message.E_NOT_EXISTS  ", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/function-groups/ingest",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<IdItem> postPresentationIngestFunctionGroup(
            @ApiParam(value = "Creates a new function group."  )
            @Valid
            @RequestBody(required = false) PresentationIngestFunctionGroup presentationIngestFunctionGroup

    );


    /**
     * PUT /service-api/v2/accessgroups/function-groups/batch/update : Function Groups Batch - Put.
     * # Function Groups Batch - Put    Update batch of function groups.
     *
     * @param presentationFunctionGroupPutRequestBody # Function Groups Batch - Put    Update batch of function groups. (optional)
     * @return # HTTP status code 207 is returned for successfully updated function groups      # Reasons for getting HTTP status code 400 inside one or more batch response items:    * Request does not honor the contract, check the example in the Request tab.  * Invalid function group/data group identifier  * Name is not unique  * Business function does not exist  * The APS doesn&#39;t exist.  * There is a pending record of function group.  * Invalid validity period.  * Function Group can not be created/updated - invalid or not applicable Privilege.    | Messages |  | --- |  | At least one function group must be provided |  | Invalid function group/data group identifier. |  | Invalid function group identifiers |  | Function Group with given name already exists |  | Function Group can not be created/updated - Invalid Business Function |  | The APS doesn&#39;t exist. |  | There is a pending record of function group. |  | Invalid validity period. |  | Function Group can not be created/updated - invalid or not applicable Privilege. |      # Reasons for getting HTTP status code 404 inside one or more batch response items:    * Function group does not exist    | Message |  | --- |  | Function group does not exist. |   (status code 207)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Function Groups Batch - Put.", nickname = "putFunctionGroupsUpdate", notes = "# Function Groups Batch - Put    Update batch of function groups.", response = BatchResponseItemExtended.class, responseContainer = "List", tags={ "FunctionGroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 207, message = "# HTTP status code 207 is returned for successfully updated function groups      # Reasons for getting HTTP status code 400 inside one or more batch response items:    * Request does not honor the contract, check the example in the Request tab.  * Invalid function group/data group identifier  * Name is not unique  * Business function does not exist  * The APS doesn't exist.  * There is a pending record of function group.  * Invalid validity period.  * Function Group can not be created/updated - invalid or not applicable Privilege.    | Messages |  | --- |  | At least one function group must be provided |  | Invalid function group/data group identifier. |  | Invalid function group identifiers |  | Function Group with given name already exists |  | Function Group can not be created/updated - Invalid Business Function |  | The APS doesn't exist. |  | There is a pending record of function group. |  | Invalid validity period. |  | Function Group can not be created/updated - invalid or not applicable Privilege. |      # Reasons for getting HTTP status code 404 inside one or more batch response items:    * Function group does not exist    | Message |  | --- |  | Function group does not exist. |  ", response = BatchResponseItemExtended.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/function-groups/batch/update",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<List<BatchResponseItemExtended>> putFunctionGroupsUpdate(
            @ApiParam(value = "# Function Groups Batch - Put    Update batch of function groups."  )
            @Valid
            @RequestBody(required = false) List<PresentationFunctionGroupPutRequestBody> presentationFunctionGroupPutRequestBody

    );

}
