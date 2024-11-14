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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationId;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationPermissionSet;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationPermissionSetPut;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationPermissionSetResponseItem;
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
@Api(value = "PermissionSet", description = "the PermissionSet API")
public interface PermissionSetApi {

    /**
     * DELETE /service-api/v2/accessgroups/permission-sets/{identifierType}/{identifier} : Assignable permission set - &#x60;DELETE&#x60;.
     * # Assignable permission set - &#x60;DELETE&#x60;    Deletes assignable permission set by internal id or name. This endpoint requires a  valid token to perform the deletion.    To generate a valid  token, use: //accessgroup-integration-spec/v2/accessgroups/access-token  GET. Add the generated token as query parameter AccessControlToken.
     *
     * @param identifierType defines type(id/name) with which identifier will be defined  (required)
     * @param identifier name of the permission set or id (required)
     * @param xAccessControlToken Access token for verification of the command (required)
     * @return Permission set deleted successfully (status code 204)
     *         or # Reasons for getting HTTP status code 400:    * The APS is associated to at least one Service Agreement.  * The APS is system default and cannot be deleted.  * invalid identifiers    | Message | key  --- | --- |  | The APS is system default and cannot be deleted. | delete.permissionSet.identifiers.NOT_CUSTOM  | The APS is associated to at least one Service Agreement | delete.permissionSet.identifiers.ASSIGNED_TO_SERVICE_AGREEMENT  | Invalid Access Token | token.delete.validation.INVALID_ACCESS_TOKEN   (status code 400)
     *         or # Reasons for getting HTTP status code 404:    * The APS doesn&#39;t exist.  * Provided identifiers for the APS are invalid.     | Message | key  --- | --- |    | Provided identifiers for the APS are invalid. | delete.permissionSet.identifiers.INVALID_IDENTIFIER  | The APS doesn&#39;t exist. | delete.permissionSet.identifiers.NOT_EXISTS   (status code 404)
     */
    @ApiOperation(value = "Assignable permission set - `DELETE`.", nickname = "deleteByIdentifier", notes = "# Assignable permission set - `DELETE`    Deletes assignable permission set by internal id or name. This endpoint requires a  valid token to perform the deletion.    To generate a valid  token, use: //accessgroup-integration-spec/v2/accessgroups/access-token  GET. Add the generated token as query parameter AccessControlToken.", tags={ "PermissionSet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Permission set deleted successfully"),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:    * The APS is associated to at least one Service Agreement.  * The APS is system default and cannot be deleted.  * invalid identifiers    | Message | key  --- | --- |  | The APS is system default and cannot be deleted. | delete.permissionSet.identifiers.NOT_CUSTOM  | The APS is associated to at least one Service Agreement | delete.permissionSet.identifiers.ASSIGNED_TO_SERVICE_AGREEMENT  | Invalid Access Token | token.delete.validation.INVALID_ACCESS_TOKEN  ", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "# Reasons for getting HTTP status code 404:    * The APS doesn't exist.  * Provided identifiers for the APS are invalid.     | Message | key  --- | --- |    | Provided identifiers for the APS are invalid. | delete.permissionSet.identifiers.INVALID_IDENTIFIER  | The APS doesn't exist. | delete.permissionSet.identifiers.NOT_EXISTS  ", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/permission-sets/{identifierType}/{identifier}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteByIdentifier(
            @ApiParam(value = "defines type(id/name) with which identifier will be defined ",required=true)
            @PathVariable("identifierType")
             String identifierType
,
                    @ApiParam(value = "name of the permission set or id",required=true)
            @PathVariable("identifier")
             String identifier
,
                    @ApiParam(value = "Access token for verification of the command" ,required=true)
            @RequestHeader(value="X-AccessControl-Token", required=true)
             String xAccessControlToken

    );


    /**
     * GET /service-api/v2/accessgroups/permission-sets : Assignable Permission Sets - &#x60;GET&#x60;.
     * # Assignable Permission Sets - &#x60;GET&#x60;    Retrieves all assignable permission sets. Filter by name.  If assignable permission set name provided as filter does not exist, then empty list is returned.
     *
     * @param name Name of Applicable Permission Set (optional)
     * @return # Assignable Permission Sets - &#x60;GET&#x60;    Retrieves all assignable permission sets. Filter by name.  If assignable permission set name provided as filter does not exist, then empty list is returned. (status code 200)
     */
    @ApiOperation(value = "Assignable Permission Sets - `GET`.", nickname = "getPermissionSet", notes = "# Assignable Permission Sets - `GET`    Retrieves all assignable permission sets. Filter by name.  If assignable permission set name provided as filter does not exist, then empty list is returned.", response = PresentationPermissionSetResponseItem.class, responseContainer = "List", tags={ "PermissionSet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "# Assignable Permission Sets - `GET`    Retrieves all assignable permission sets. Filter by name.  If assignable permission set name provided as filter does not exist, then empty list is returned.", response = PresentationPermissionSetResponseItem.class, responseContainer = "List") })
    @RequestMapping(value = "/service-api/v2/accessgroups/permission-sets",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PresentationPermissionSetResponseItem>> getPermissionSet(
            @ApiParam(value = "Name of Applicable Permission Set") @Valid
            @RequestParam(value = "name", required = false)
            
             String name

    );


    /**
     * POST /service-api/v2/accessgroups/permission-sets : Assignable permission set - &#x60;POST&#x60;.
     * # Assignable permission set - &#x60;POST&#x60;    Creates new assignable permission set and retrieve created assignable permission set id.  
     *
     * @param presentationPermissionSet # Assignable permission set - &#x60;POST&#x60;    Creates new assignable permission set and retrieve created assignable permission set id.   (optional)
     * @return No description available (status code 201)
     *         or # Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  * Permission set name should be unique  * Invalid business function privilege pair    | Message | key  --- | --- |  | Permission set name already exists | permissionSet.save.error.message.E_NAME_ALREADY_EXISTS  | Invalid business function privilege pair | permissionSet.save.error.message.E_INVALID_PERMISSION   (status code 400)
     */
    @ApiOperation(value = "Assignable permission set - `POST`.", nickname = "postPermissionSet", notes = "# Assignable permission set - `POST`    Creates new assignable permission set and retrieve created assignable permission set id.  ", response = PresentationId.class, tags={ "PermissionSet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "No description available", response = PresentationId.class),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  * Permission set name should be unique  * Invalid business function privilege pair    | Message | key  --- | --- |  | Permission set name already exists | permissionSet.save.error.message.E_NAME_ALREADY_EXISTS  | Invalid business function privilege pair | permissionSet.save.error.message.E_INVALID_PERMISSION  ", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/permission-sets",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PresentationId> postPermissionSet(
            @ApiParam(value = "# Assignable permission set - `POST`    Creates new assignable permission set and retrieve created assignable permission set id.  "  )
            @Valid
            @RequestBody(required = false) PresentationPermissionSet presentationPermissionSet

    );


    /**
     * PUT /service-api/v2/accessgroups/permission-sets : Assignable permission set - &#x60;PUT&#x60;.
     * # Assignable permission set - &#x60;PUT&#x60;    Endpoint for assigning and removing assignable permission sets,  to/from service agreement.   You can update assignable permission set by:   - &#x60;IdIdentifier&#x60; - internal id of assignable permission set   - &#x60;NameIdentifier&#x60; - name of assignable permission set
     *
     * @param presentationPermissionSetPut # Assignable permission set - &#x60;PUT&#x60;    Endpoint for assigning and removing assignable permission sets,  to/from service agreement.   You can update assignable permission set by:   - &#x60;IdIdentifier&#x60; - internal id of assignable permission set   - &#x60;NameIdentifier&#x60; - name of assignable permission set (optional)
     * @return Assignable permission sets updated successfully (status code 200)
     *         or # Reasons for getting HTTP status code 400:  * Invalid APS set up.  * Provided identifiers for the APS are invalid.    | Messages | Key |  | --- | --- |  | At least one business function/privilege is contained in one or more function groups. | permissionSet.aps.PRIVILEGE_CONTAINED_IN_FUNCTION_GROUP |  | Provided identifiers for the APS are invalid. | delete.permissionSet.identifiers.INVALID_IDENTIFIER|     (status code 400)
     *         or # Reasons for getting HTTP status code 404:    * Service agreement with provided external id not found.    | Message | Key |  | --- | --- |  | Service agreement does not exist | serviceAgreements.get.error.message.E_NOT_EXISTS | (status code 404)
     */
    @ApiOperation(value = "Assignable permission set - `PUT`.", nickname = "putPermissionSet", notes = "# Assignable permission set - `PUT`    Endpoint for assigning and removing assignable permission sets,  to/from service agreement.   You can update assignable permission set by:   - `IdIdentifier` - internal id of assignable permission set   - `NameIdentifier` - name of assignable permission set", tags={ "PermissionSet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Assignable permission sets updated successfully"),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:  * Invalid APS set up.  * Provided identifiers for the APS are invalid.    | Messages | Key |  | --- | --- |  | At least one business function/privilege is contained in one or more function groups. | permissionSet.aps.PRIVILEGE_CONTAINED_IN_FUNCTION_GROUP |  | Provided identifiers for the APS are invalid. | delete.permissionSet.identifiers.INVALID_IDENTIFIER|    ", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "# Reasons for getting HTTP status code 404:    * Service agreement with provided external id not found.    | Message | Key |  | --- | --- |  | Service agreement does not exist | serviceAgreements.get.error.message.E_NOT_EXISTS |", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/permission-sets",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> putPermissionSet(
            @ApiParam(value = "# Assignable permission set - `PUT`    Endpoint for assigning and removing assignable permission sets,  to/from service agreement.   You can update assignable permission set by:   - `IdIdentifier` - internal id of assignable permission set   - `NameIdentifier` - name of assignable permission set"  )
            @Valid
            @RequestBody(required = false) PresentationPermissionSetPut presentationPermissionSetPut

    );

}
