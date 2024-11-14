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
package com.microsphere.onboarding.client.api.rest.v2;

import com.microsphere.onboarding.client.api.rest.v2.model.CommercialCardResponseGet;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityIdResponse;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityPostRequest;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityTypePostResponse;
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
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")
@Api(value = "Onboarding", description = "the Onboarding API")
public interface OnboardingApi {

    /**
     * GET /client-api/v2/commercial-cards : get commercial card by offer
     * get commercial card by offer
     *
     * @param offer commercial card offer (optional)
     * @param localize language of commercial card (optional)
     * @return No description available (status code 200)
     */
    @ApiOperation(value = "get commercial card by offer", nickname = "getCommercialCard", notes = "get commercial card by offer", response = CommercialCardResponseGet.class, tags={ "onboarding", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "No description available", response = CommercialCardResponseGet.class) })
    @RequestMapping(value = "/client-api/v2/commercial-cards",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CommercialCardResponseGet> getCommercialCard(
            @ApiParam(value = "commercial card offer", allowableValues = "STANDARD, PREMIUM") @Valid
            @RequestParam(value = "offer", required = false)
            
             String offer
,
                    @ApiParam(value = "language of commercial card", allowableValues = "fr, en") @Valid
            @RequestParam(value = "localize", required = false)
            
             String localize

    );


    /**
     * POST /client-api/v2/confirm-le-subscription : Confirm Legal Entity creation
     * Persist Legal Entity
     *
     * @param legalEntityPostRequest  (required)
     * @return LE successfully saved (status code 200)
     */
    @ApiOperation(value = "Confirm Legal Entity creation", nickname = "persistLegalEntity", notes = "Persist Legal Entity", response = LegalEntityIdResponse.class, tags={ "onboarding", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "LE successfully saved", response = LegalEntityIdResponse.class) })
    @RequestMapping(value = "/client-api/v2/confirm-le-subscription",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LegalEntityIdResponse> persistLegalEntity(
            @ApiParam(value = "" ,required=true )
            @Valid @NotNull
            @RequestBody LegalEntityPostRequest legalEntityPostRequest

    );


    /**
     * GET /client-api/v2/verify-customer : Search Legal Entity by externalID
     * Search Legal Entity by externalID
     *
     * @param legalEntityExternalId Legal Entity External Id (required)
     * @return No description available (status code 200)
     */
    @ApiOperation(value = "Search Legal Entity by externalID", nickname = "searchLegalEntity", notes = "Search Legal Entity by externalID", response = LegalEntityTypePostResponse.class, tags={ "onboarding", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "No description available", response = LegalEntityTypePostResponse.class) })
    @RequestMapping(value = "/client-api/v2/verify-customer",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<LegalEntityTypePostResponse> searchLegalEntity(
            @ApiParam(value = "Legal Entity External Id", required = true) @Valid
            @RequestParam(value = "legalEntityExternalId", required = true)
            @NotNull
            
            @Size(min=1, max=50)  String legalEntityExternalId

    );

}
