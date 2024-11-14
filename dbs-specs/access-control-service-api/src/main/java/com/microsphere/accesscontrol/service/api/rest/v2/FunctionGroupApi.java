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
import com.microsphere.accesscontrol.service.api.rest.v2.model.FunctionGroupItem;
import com.microsphere.accesscontrol.service.api.rest.v2.model.FunctionGroupsIds;
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
@Api(value = "FunctionGroup", description = "the FunctionGroup API")
public interface FunctionGroupApi {

    /**
     * GET /service-api/v2/accesscontrol/accessgroups/function-groups/{id} : Function Group GET.
     * # Function Group GET    Request method GET for fetching function group by id.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param id Function group id (required)
     * @return Function group retrieved. (status code 200)
     *         or BadRequest (status code 400)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Function Group GET.", nickname = "getFunctionGroupById", notes = "# Function Group GET    Request method GET for fetching function group by id.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = FunctionGroupItem.class, tags={ "FunctionGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Function group retrieved.", response = FunctionGroupItem.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/function-groups/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<FunctionGroupItem> getFunctionGroupById(
            @ApiParam(value = "Function group id",required=true)
            @PathVariable("id")
             String id

    );


    /**
     * GET /service-api/v2/accesscontrol/accessgroups/function-groups : Function Groups GET.
     * # Function Groups GET    Request method GET for fetching function groups by serviceAgreementId.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param serviceAgreementId Service Agreement id (required)
     * @return List of function groups retrieved. (status code 200)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Function Groups GET.", nickname = "getFunctionGroups", notes = "# Function Groups GET    Request method GET for fetching function groups by serviceAgreementId.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = FunctionGroupItem.class, responseContainer = "List", tags={ "FunctionGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of function groups retrieved.", response = FunctionGroupItem.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/function-groups",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<FunctionGroupItem>> getFunctionGroups(
            @ApiParam(value = "Service Agreement id", required = true) @Valid
            @RequestParam(value = "serviceAgreementId", required = true)
            @NotNull
            
             String serviceAgreementId

    );


    /**
     * POST /service-api/v2/accesscontrol/accessgroups/function-groups/bulk : Function Groups Bulk POST.
     * # Function Groups Bulk POST    Request for fetching function groups by ids.
     *
     * @param functionGroupsIds # Function Groups Bulk POST    Request for fetching function groups by ids. (optional)
     * @return Function Groups retrieved successfully. (status code 200)
     *         or # Reasons for getting HTTP status code 400:    * One of the function group ids does not exists    | Message | key   --- | --- |  |Function group does not exist.|functionAccessGroup.get.error.message.E_NOT_EXISTS| (status code 400)
     */
    @ApiOperation(value = "Function Groups Bulk POST.", nickname = "postBulkFunctionGroups", notes = "# Function Groups Bulk POST    Request for fetching function groups by ids.", response = FunctionGroupItem.class, responseContainer = "List", tags={ "FunctionGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Function Groups retrieved successfully.", response = FunctionGroupItem.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:    * One of the function group ids does not exists    | Message | key   --- | --- |  |Function group does not exist.|functionAccessGroup.get.error.message.E_NOT_EXISTS|", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/function-groups/bulk",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<FunctionGroupItem>> postBulkFunctionGroups(
            @ApiParam(value = "# Function Groups Bulk POST    Request for fetching function groups by ids."  )
            @Valid
            @RequestBody(required = false) FunctionGroupsIds functionGroupsIds

    );

}
