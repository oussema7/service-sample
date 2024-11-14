package com.microsphere.usermanager.extension.client.api.listener.v2;

import com.microsphere.usermanager.extension.client.api.listener.ApiClient;

import com.microsphere.usermanager.extension.client.api.listener.v2.model.RevokeIdentityAccessServiceRequest;

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
@Component("com.microsphere.usermanager.extension.client.api.listener.v2.IdentityManagementServiceApi")

public class IdentityManagementServiceApi {
    private final ApiClient apiClient;


    @Autowired
    public IdentityManagementServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Revoke Identity access
     * This endpoint sets the user&#39;s status to Access Revoked and disables the user, effectively making them unable to access MicroSphere services. A user with status Access Revoked cannot be unlocked via other endpoints. 
     * <p><b>204</b> - Access has been revoked
     * @param internalId User internal ID (required)
     * @param revokeIdentityAccessServiceRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void revokeIdentityAccess(String internalId, RevokeIdentityAccessServiceRequest revokeIdentityAccessServiceRequest) throws RestClientException {
        revokeIdentityAccessWithHttpInfo(internalId, revokeIdentityAccessServiceRequest);
    }

    /**
     * Revoke Identity access
     * This endpoint sets the user&#39;s status to Access Revoked and disables the user, effectively making them unable to access MicroSphere services. A user with status Access Revoked cannot be unlocked via other endpoints. 
     * <p><b>204</b> - Access has been revoked
     * @param internalId User internal ID (required)
     * @param revokeIdentityAccessServiceRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> revokeIdentityAccessWithHttpInfo(String internalId, RevokeIdentityAccessServiceRequest revokeIdentityAccessServiceRequest) throws RestClientException {
        Object localVarPostBody = revokeIdentityAccessServiceRequest;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling revokeIdentityAccess");
        }
        
        // verify the required parameter 'revokeIdentityAccessServiceRequest' is set
        if (revokeIdentityAccessServiceRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'revokeIdentityAccessServiceRequest' when calling revokeIdentityAccess");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/identities/{internalId}/access", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
