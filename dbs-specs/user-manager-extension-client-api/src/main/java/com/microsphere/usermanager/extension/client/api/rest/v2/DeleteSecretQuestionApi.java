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
@Api(value = "DeleteSecretQuestion", description = "the DeleteSecretQuestion API")
public interface DeleteSecretQuestionApi {

    /**
     * DELETE /client-api/v2/credentials/{userId}/delete-secret-question
     * delete secret question
     *
     * @param userId user id (required)
     * @return secret question deleted successfully. (status code 200)
     */
    @ApiOperation(value = "", nickname = "deleteSecretQuestion", notes = "delete secret question", tags={ "delete-secret-question", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "secret question deleted successfully.") })
    @RequestMapping(value = "/client-api/v2/credentials/{userId}/delete-secret-question",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSecretQuestion(
            @ApiParam(value = "user id",required=true)
            @PathVariable("userId")
             String userId

    );

}
