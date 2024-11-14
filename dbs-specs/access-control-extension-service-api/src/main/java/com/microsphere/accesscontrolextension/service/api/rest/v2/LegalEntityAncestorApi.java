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
package com.microsphere.accesscontrolextension.service.api.rest.v2;

import com.microsphere.accesscontrolextension.service.api.rest.v2.model.HierarchyPostResponse;
import com.microsphere.accesscontrolextension.service.api.rest.v2.model.LegalEntityTypePostResponse;
import com.microsphere.accesscontrolextension.service.api.rest.v2.model.ServiceAgreementTypePostResponse;
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
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:46.842949400+01:00[Africa/Tunis]")
@Api(value = "LegalEntityAncestor", description = "the LegalEntityAncestor API")
public interface LegalEntityAncestorApi {

    /**
     * GET /service-api/v2/ancestors/externalId/{legalEntityExternalId} : get list of External Ids of the hierarchy for a giver Legal Entity.
     * get list of External Ids of the hierarchy for a giver Legal Entity.
     *
     * @param legalEntityExternalId Legal Entity External Id (required)
     * @return No description available (status code 200)
     */
    @ApiOperation(value = "get list of External Ids of the hierarchy for a giver Legal Entity.", nickname = "getAncestorsLegalEntities", notes = "get list of External Ids of the hierarchy for a giver Legal Entity.", response = HierarchyPostResponse.class, tags={ "legal-entity-ancestor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "No description available", response = HierarchyPostResponse.class) })
    @RequestMapping(value = "/service-api/v2/ancestors/externalId/{legalEntityExternalId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<HierarchyPostResponse> getAncestorsLegalEntities(
            @ApiParam(value = "Legal Entity External Id",required=true)
            @PathVariable("legalEntityExternalId")
            @Size(min=1, max=50)  String legalEntityExternalId

    );


    /**
     * GET /service-api/v2/ancestors/externalId/{legalEntityExternalId}/type : Get Legal Entity Hierarchy Type by External Id.
     * Get Legal Entity Hierarchy Type by External Id.
     *
     * @param legalEntityExternalId Legal Entity External Id (required)
     * @return No description available (status code 200)
     */
    @ApiOperation(value = "Get Legal Entity Hierarchy Type by External Id.", nickname = "getLegalEntityType", notes = "Get Legal Entity Hierarchy Type by External Id.", response = LegalEntityTypePostResponse.class, tags={ "legal-entity-ancestor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "No description available", response = LegalEntityTypePostResponse.class) })
    @RequestMapping(value = "/service-api/v2/ancestors/externalId/{legalEntityExternalId}/type",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<LegalEntityTypePostResponse> getLegalEntityType(
            @ApiParam(value = "Legal Entity External Id",required=true)
            @PathVariable("legalEntityExternalId")
            @Size(min=1, max=50)  String legalEntityExternalId

    );


    /**
     * GET /service-api/v2/service-agreement/{id}/type : Get Service Agreement Type by Id.
     * Get Service Agreement Type by Id.
     *
     * @param id Service Agreement Id (required)
     * @return No description available (status code 200)
     */
    @ApiOperation(value = "Get Service Agreement Type by Id.", nickname = "getServiceAgreementType", notes = "Get Service Agreement Type by Id.", response = ServiceAgreementTypePostResponse.class, tags={ "legal-entity-ancestor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "No description available", response = ServiceAgreementTypePostResponse.class) })
    @RequestMapping(value = "/service-api/v2/service-agreement/{id}/type",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ServiceAgreementTypePostResponse> getServiceAgreementType(
            @ApiParam(value = "Service Agreement Id",required=true)
            @PathVariable("id")
            @Size(min=1, max=50)  String id

    );

}
