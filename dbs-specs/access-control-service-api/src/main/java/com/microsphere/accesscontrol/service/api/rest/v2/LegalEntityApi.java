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
import com.microsphere.accesscontrol.service.api.rest.v2.model.LegalEntityItem;
import com.microsphere.accesscontrol.service.api.rest.v2.model.LegalEntityItemBase;
import com.microsphere.accesscontrol.service.api.rest.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.rest.v2.model.ServiceAgreementItemQuery;
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
@Api(value = "LegalEntity", description = "the LegalEntity API")
public interface LegalEntityApi {

    /**
     * GET /service-api/v2/accesscontrol/legalentities/{id} : Legal Entity GET.
     * # Legal Entity GET    Request method GET for fetching legal entity by legal entity internal id.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param id Legal entity internal id (required)
     * @return Single legal entity retrieved (status code 200)
     *         or BadRequest (status code 400)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Legal Entity GET.", nickname = "getLegalEntity", notes = "# Legal Entity GET    Request method GET for fetching legal entity by legal entity internal id.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = LegalEntityItem.class, tags={ "LegalEntity", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Single legal entity retrieved", response = LegalEntityItem.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/legalentities/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<LegalEntityItem> getLegalEntity(
            @ApiParam(value = "Legal entity internal id",required=true)
            @PathVariable("id")
             String id

    );


    /**
     * GET /service-api/v2/accesscontrol/legalentities/{id}/serviceagreements/master : Legal Entities MSA GET.
     * # Legal Entities MSA GET    Request method GET for fetching master service agreement of the given legal entity.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     *
     * @param id Legal entity internal id (required)
     * @return Master service agreement retrieved for given legal Entity. (status code 200)
     *         or BadRequest (status code 400)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Legal Entities MSA GET.", nickname = "getMasterServiceAgreement", notes = "# Legal Entities MSA GET    Request method GET for fetching master service agreement of the given legal entity.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  ", response = ServiceAgreementItemQuery.class, tags={ "LegalEntity", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Master service agreement retrieved for given legal Entity.", response = ServiceAgreementItemQuery.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/legalentities/{id}/serviceagreements/master",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ServiceAgreementItemQuery> getMasterServiceAgreement(
            @ApiParam(value = "Legal entity internal id",required=true)
            @PathVariable("id")
             String id

    );


    /**
     * GET /service-api/v2/accesscontrol/legalentities/root : Legal Entity GET.
     * # Legal Entity GET    Request method GET for fetching Root legal entity.
     *
     * @return Root legal entity retrieved. (status code 200)
     *         or BadRequest (status code 400)
     *         or NotFound (status code 404)
     */
    @ApiOperation(value = "Legal Entity GET.", nickname = "getRootLegalEntity", notes = "# Legal Entity GET    Request method GET for fetching Root legal entity.", response = LegalEntityItemBase.class, tags={ "LegalEntity", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Root legal entity retrieved.", response = LegalEntityItemBase.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "NotFound", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/legalentities/root",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<LegalEntityItemBase> getRootLegalEntity(

    );


    /**
     * GET /service-api/v2/accesscontrol/legalentities/segmentation : Legal Entities Segmentation GET.
     * # Legal Entities Segmentation GET    List customers that user has access to.   
     *
     * @param businessFunction Name of the business function (required)
     * @param userId User id (required)
     * @param query Search by name or external ID: partial term for name and whole term for external ID (optional)
     * @param serviceAgreementId Service agreement id (optional)
     * @param legalEntityId Legal Entity Id (optional)
     * @param privilege Name of the privilege (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return # Legal Entities Segmentation GET    List customers that user has access to.    (status code 200)
     *         or # Reasons for getting HTTP status code 400:    * Service agreement id or legal entity id must be provided    | Message | key   --- | --- |  |Service Agreement Id or Legal Entity Id must be provided|serviceAgreement.id.NOT_PROVIDED| (status code 400)
     *         or # Reasons for getting HTTP status code 404:    * Service agreement does not exist    | Message | key   --- | --- |  |Service agreement does not exist|serviceAgreements.get.error.message.E_NOT_EXISTS|   (status code 404)
     */
    @ApiOperation(value = "Legal Entities Segmentation GET.", nickname = "getSegmentation", notes = "# Legal Entities Segmentation GET    List customers that user has access to.   ", response = LegalEntityItem.class, responseContainer = "List", tags={ "LegalEntity", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "# Legal Entities Segmentation GET    List customers that user has access to.   ", response = LegalEntityItem.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "# Reasons for getting HTTP status code 400:    * Service agreement id or legal entity id must be provided    | Message | key   --- | --- |  |Service Agreement Id or Legal Entity Id must be provided|serviceAgreement.id.NOT_PROVIDED|", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "# Reasons for getting HTTP status code 404:    * Service agreement does not exist    | Message | key   --- | --- |  |Service agreement does not exist|serviceAgreements.get.error.message.E_NOT_EXISTS|  ", response = NotFoundError.class) })
    @RequestMapping(value = "/service-api/v2/accesscontrol/legalentities/segmentation",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<LegalEntityItem>> getSegmentation(
            @ApiParam(value = "Name of the business function", required = true) @Valid
            @RequestParam(value = "businessFunction", required = true)
            @NotNull
            
             String businessFunction
,
                    @ApiParam(value = "User id", required = true) @Valid
            @RequestParam(value = "userId", required = true)
            @NotNull
            
             String userId
,
                    @ApiParam(value = "Search by name or external ID: partial term for name and whole term for external ID") @Valid
            @RequestParam(value = "query", required = false)
            
             String query
,
                    @ApiParam(value = "Service agreement id") @Valid
            @RequestParam(value = "serviceAgreementId", required = false)
            
             String serviceAgreementId
,
                    @ApiParam(value = "Legal Entity Id") @Valid
            @RequestParam(value = "legalEntityId", required = false)
            
             String legalEntityId
,
                    @ApiParam(value = "Name of the privilege") @Valid
            @RequestParam(value = "privilege", required = false)
            
             String privilege
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

}
