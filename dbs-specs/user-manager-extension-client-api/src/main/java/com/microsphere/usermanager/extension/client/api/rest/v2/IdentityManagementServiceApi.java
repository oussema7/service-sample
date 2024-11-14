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

import com.microsphere.usermanager.extension.client.api.rest.v2.model.RevokeIdentityAccessServiceRequest;
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
@Api(value = "IdentityManagementService", description = "the IdentityManagementService API")
public interface IdentityManagementServiceApi {

    /**
     * PUT /service-api/v2/users/identities/{internalId}/access : Revoke Identity access
     * This endpoint sets the user&#39;s status to Access Revoked and disables the user, effectively making them unable to access MicroSphere services. A user with status Access Revoked cannot be unlocked via other endpoints. 
     *
     * @param internalId User internal ID (required)
     * @param revokeIdentityAccessServiceRequest  (required)
     * @return Access has been revoked (status code 204)
     */
    @ApiOperation(value = "Revoke Identity access", nickname = "revokeIdentityAccess", notes = "This endpoint sets the user's status to Access Revoked and disables the user, effectively making them unable to access MicroSphere services. A user with status Access Revoked cannot be unlocked via other endpoints. ", tags={ "identity-management-service", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Access has been revoked") })
    @RequestMapping(value = "/service-api/v2/users/identities/{internalId}/access",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> revokeIdentityAccess(
            @ApiParam(value = "User internal ID",required=true)
            @PathVariable("internalId")
             String internalId
,
                    @ApiParam(value = "" ,required=true )
            @Valid @NotNull
            @RequestBody RevokeIdentityAccessServiceRequest revokeIdentityAccessServiceRequest

    );

}
