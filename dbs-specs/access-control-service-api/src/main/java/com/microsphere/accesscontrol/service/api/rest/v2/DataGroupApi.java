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
import com.microsphere.accesscontrol.service.api.rest.v2.model.DataGroupItem;
import com.microsphere.accesscontrol.service.api.rest.v2.model.DataGroupsIds;
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
@Api(value = "DataGroup", description = "the DataGroup API")
public interface DataGroupApi {

    /**
     * GET /service-api/v2/accesscontrol/accessgroups/data-groups/{id} : Data Group - &#x60;GET&#x60;.
     * # Data Group - &#x60;GET&#x60;    Request method GET for fetching data group by internal data group id.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param id Data group ID (required)
     * @param includeItems Indicates whether data group items should be returned or not. (optional, default to true)
     * @return Data group by id retrieved successfully. (status code 200)
     *         or BadRequest (status code 400)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Data Group - `GET`.", nickname = "getDataGroupById", notes = "# Data Group - `GET`    Request method GET for fetching data group by internal data group id.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = DataGroupItem.class, tags={ "DataGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Data group by id retrieved successfully.", response = DataGroupItem.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/data-groups/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<DataGroupItem> getDataGroupById(
            @ApiParam(value = "Data group ID",required=true)
            @PathVariable("id")
             String id
,
                    @ApiParam(value = "Indicates whether data group items should be returned or not.", defaultValue = "true") @Valid
            @RequestParam(value = "includeItems", required = false, defaultValue="true")
            
             Boolean includeItems

    );


    /**
     * GET /service-api/v2/accesscontrol/accessgroups/data-groups : Data Groups GET.
     * # Data Groups GET    Request method GET for fetching data groups by serviceAgreementId and/or type.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param serviceAgreementId Service Agreement Id (required)
     * @param type Data group type (optional)
     * @param includeItems Defines if the items of the data groups will be returned in the response (optional, default to true)
     * @return Data groups retrieved successfully. (status code 200)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Data Groups GET.", nickname = "getDataGroups", notes = "# Data Groups GET    Request method GET for fetching data groups by serviceAgreementId and/or type.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = DataGroupItem.class, responseContainer = "List", tags={ "DataGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Data groups retrieved successfully.", response = DataGroupItem.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/data-groups",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<DataGroupItem>> getDataGroups(
            @ApiParam(value = "Service Agreement Id", required = true) @Valid
            @RequestParam(value = "serviceAgreementId", required = true)
            @NotNull
            
             String serviceAgreementId
,
                    @ApiParam(value = "Data group type") @Valid
            @RequestParam(value = "type", required = false)
            
             String type
,
                    @ApiParam(value = "Defines if the items of the data groups will be returned in the response", defaultValue = "true") @Valid
            @RequestParam(value = "includeItems", required = false, defaultValue="true")
            
             Boolean includeItems

    );


    /**
     * POST /service-api/v2/accesscontrol/accessgroups/data-groups/bulk/search : Data Groups Bulk POST.
     * # Data Groups Bulk POST    Request for fetching data groups by ids.
     *
     * @param dataGroupsIds # Data Groups Bulk POST    Request for fetching data groups by ids. (optional)
     * @return Data Groups retrieved successfully. (status code 200)
     *         or BadRequest (status code 400)
     */
    @ApiOperation(value = "Data Groups Bulk POST.", nickname = "postBulkSearchDataGroups", notes = "# Data Groups Bulk POST    Request for fetching data groups by ids.", response = DataGroupItem.class, responseContainer = "List", tags={ "DataGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Data Groups retrieved successfully.", response = DataGroupItem.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/accessgroups/data-groups/bulk/search",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<DataGroupItem>> postBulkSearchDataGroups(
            @ApiParam(value = "# Data Groups Bulk POST    Request for fetching data groups by ids."  )
            @Valid
            @RequestBody(required = false) DataGroupsIds dataGroupsIds

    );

}
