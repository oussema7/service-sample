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
package com.microsphere.usermanager.extension.client.api.rest.v2;

import com.microsphere.usermanager.extension.client.api.rest.v2.model.BadRequestError;
import com.microsphere.usermanager.extension.client.api.rest.v2.model.ForbiddenError;
import com.microsphere.usermanager.extension.client.api.rest.v2.model.InternalServerError;
import com.microsphere.usermanager.extension.client.api.rest.v2.model.ServiceAgreementsRequestBody;
import com.microsphere.usermanager.extension.client.api.rest.v2.model.ServiceAgreementsResponseBody;
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
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:58.643479400+01:00[Africa/Tunis]")
@Api(value = "GetAllServiceAgreement", description = "the GetAllServiceAgreement API")
public interface GetAllServiceAgreementApi {

    /**
     * POST /client-api/v2/getAllServiceAgreement/{legalEntityId} : get all service agreement.
     * send mail and le .
     *
     * @param legalEntityId legal Entity Id (required)
     * @param serviceAgreementsRequestBody Email address to send. (required)
     * @param from The page number. Skip over pages of elements by specifying a start value for the query. (optional, default to 0)
     * @param size Limit the number of elements in the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor. (optional, default to 10)
     * @return sucessfully resend (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or InternalServerError (status code 500)
     */
    @ApiOperation(value = "get all service agreement.", nickname = "getAllSAByEmailAndLe", notes = "send mail and le .", response = ServiceAgreementsResponseBody.class, tags={ "get-all-service-agreement", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "sucessfully resend", response = ServiceAgreementsResponseBody.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 500, message = "InternalServerError", response = InternalServerError.class) })
    @RequestMapping(value = "/client-api/v2/getAllServiceAgreement/{legalEntityId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ServiceAgreementsResponseBody> getAllSAByEmailAndLe(
            @ApiParam(value = "legal Entity Id",required=true)
            @PathVariable("legalEntityId")
             String legalEntityId
,
                    @ApiParam(value = "Email address to send." ,required=true )
            @Valid @NotNull
            @RequestBody ServiceAgreementsRequestBody serviceAgreementsRequestBody
,
                    @ApiParam(value = "The page number. Skip over pages of elements by specifying a start value for the query.", defaultValue = "0") @Valid
            @RequestParam(value = "from", required = false, defaultValue="0")
            
            @Min(0)  Integer from
,
                    @ApiParam(value = "Limit the number of elements in the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.", defaultValue = "10") @Valid
            @RequestParam(value = "size", required = false, defaultValue="10")
            
            @Min(1)  Integer size

    );

}
