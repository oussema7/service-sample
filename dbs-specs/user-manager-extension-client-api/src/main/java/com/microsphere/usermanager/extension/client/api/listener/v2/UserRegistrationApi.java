package com.microsphere.usermanager.extension.client.api.listener.v2;

import com.microsphere.usermanager.extension.client.api.listener.ApiClient;

import com.microsphere.usermanager.extension.client.api.listener.v2.model.BadRequestError;
import com.microsphere.usermanager.extension.client.api.listener.v2.model.ForbiddenError;
import com.microsphere.usermanager.extension.client.api.listener.v2.model.Identifier;
import com.microsphere.usermanager.extension.client.api.listener.v2.model.InternalServerError;
import com.microsphere.usermanager.extension.client.api.listener.v2.model.RegistrationStatus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:58.783782800+01:00[Africa/Tunis]")
@Component("com.microsphere.usermanager.extension.client.api.listener.v2.UserRegistrationApi")

public class UserRegistrationApi {
    private final ApiClient apiClient;


    @Autowired
    public UserRegistrationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Returns user informations.
     * Returns if user enrolled or not.
     * <p><b>200</b> - enrolled sucessfully
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - InternalServerError
     * @param userId user id (required)
     * @return RegistrationStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RegistrationStatus getUserRegistrationStatus(String userId) throws RestClientException {
        return getUserRegistrationStatusWithHttpInfo(userId).getBody();
    }

    /**
     * Returns user informations.
     * Returns if user enrolled or not.
     * <p><b>200</b> - enrolled sucessfully
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - InternalServerError
     * @param userId user id (required)
     * @return ResponseEntity&lt;RegistrationStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RegistrationStatus> getUserRegistrationStatusWithHttpInfo(String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserRegistrationStatus");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("userId", userId);
        String localVarPath = apiClient.expandPath("/client-api/v2/registration/users/{userId}/status", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<RegistrationStatus> localVarReturnType = new ParameterizedTypeReference<RegistrationStatus>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * send mail for the corresponding user.
     * send mail for the corresponding user.
     * <p><b>200</b> - sucessfully resend
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - InternalServerError
     * @param internalUserId User Id (required)
     * @return Identifier
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Identifier resendRegistrationEmail(String internalUserId) throws RestClientException {
        return resendRegistrationEmailWithHttpInfo(internalUserId).getBody();
    }

    /**
     * send mail for the corresponding user.
     * send mail for the corresponding user.
     * <p><b>200</b> - sucessfully resend
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - InternalServerError
     * @param internalUserId User Id (required)
     * @return ResponseEntity&lt;Identifier&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Identifier> resendRegistrationEmailWithHttpInfo(String internalUserId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'internalUserId' is set
        if (internalUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalUserId' when calling resendRegistrationEmail");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalUserId", internalUserId);
        String localVarPath = apiClient.expandPath("/client-api/v2/registration/users/{internalUserId}/email", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Identifier> localVarReturnType = new ParameterizedTypeReference<Identifier>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
