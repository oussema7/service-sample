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

import com.microsphere.accesscontrolextension.service.api.rest.v2.model.ApprovalPermissions;
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
@Api(value = "ServiceAgreements", description = "the ServiceAgreements API")
public interface ServiceAgreementsApi {

    /**
     * GET /service-api/v2/accessgroups/service-agreements/{id}/users/{userId}/permissions : List Assigned permissions for a users in a service agreement. - &#x60;GET&#x60;.
     * # List Assigned permissions for a users in a service agreement. - &#x60;GET&#x60;    Returns user permissions and approval id for specific user and service agreement.
     *
     * @param id Service Agreement ID (required)
     * @param userId User ID (required)
     * @return Users permissions successfully retrieved. (status code 200)
     */
    @ApiOperation(value = "List Assigned permissions for a users in a service agreement. - `GET`.", nickname = "getAssignUsersPermissions", notes = "# List Assigned permissions for a users in a service agreement. - `GET`    Returns user permissions and approval id for specific user and service agreement.", response = ApprovalPermissions.class, tags={ "ServiceAgreements", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Users permissions successfully retrieved.", response = ApprovalPermissions.class) })
    @RequestMapping(value = "/service-api/v2/accessgroups/service-agreements/{id}/users/{userId}/permissions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ApprovalPermissions> getAssignUsersPermissions(
            @ApiParam(value = "Service Agreement ID",required=true)
            @PathVariable("id")
             String id
,
                    @ApiParam(value = "User ID",required=true)
            @PathVariable("userId")
             String userId

    );

}
