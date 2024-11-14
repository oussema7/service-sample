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
import com.microsphere.usermanager.extension.client.api.rest.v2.model.Identifier;
import com.microsphere.usermanager.extension.client.api.rest.v2.model.InternalServerError;
import com.microsphere.usermanager.extension.client.api.rest.v2.model.RegistrationStatus;
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
@Api(value = "UserRegistration", description = "the UserRegistration API")
public interface UserRegistrationApi {

    /**
     * GET /client-api/v2/registration/users/{userId}/status : Returns user informations.
     * Returns if user enrolled or not.
     *
     * @param userId user id (required)
     * @return enrolled sucessfully (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or InternalServerError (status code 500)
     */
    @ApiOperation(value = "Returns user informations.", nickname = "getUserRegistrationStatus", notes = "Returns if user enrolled or not.", response = RegistrationStatus.class, tags={ "user-registration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "enrolled sucessfully", response = RegistrationStatus.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 500, message = "InternalServerError", response = InternalServerError.class) })
    @RequestMapping(value = "/client-api/v2/registration/users/{userId}/status",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RegistrationStatus> getUserRegistrationStatus(
            @ApiParam(value = "user id",required=true)
            @PathVariable("userId")
            @Size(min=1, max=128)  String userId

    );


    /**
     * POST /client-api/v2/registration/users/{internalUserId}/email : send mail for the corresponding user.
     * send mail for the corresponding user.
     *
     * @param internalUserId User Id (required)
     * @return sucessfully resend (status code 200)
     *         or BadRequest (status code 400)
     *         or Forbidden (status code 403)
     *         or InternalServerError (status code 500)
     */
    @ApiOperation(value = "send mail for the corresponding user.", nickname = "resendRegistrationEmail", notes = "send mail for the corresponding user.", response = Identifier.class, tags={ "user-registration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "sucessfully resend", response = Identifier.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ForbiddenError.class),
        @ApiResponse(code = 500, message = "InternalServerError", response = InternalServerError.class) })
    @RequestMapping(value = "/client-api/v2/registration/users/{internalUserId}/email",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Identifier> resendRegistrationEmail(
            @ApiParam(value = "User Id",required=true)
            @PathVariable("internalUserId")
            @Size(min=1, max=128)  String internalUserId

    );

}
