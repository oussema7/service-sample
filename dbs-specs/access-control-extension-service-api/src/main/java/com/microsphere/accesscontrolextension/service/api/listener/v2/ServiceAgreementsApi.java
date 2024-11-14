package com.microsphere.accesscontrolextension.service.api.listener.v2;

import com.microsphere.accesscontrolextension.service.api.listener.ApiClient;

import com.microsphere.accesscontrolextension.service.api.listener.v2.model.ApprovalPermissions;

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

@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:46.958085800+01:00[Africa/Tunis]")
@Component("com.microsphere.accesscontrolextension.service.api.listener.v2.ServiceAgreementsApi")

public class ServiceAgreementsApi {
    private final ApiClient apiClient;


    @Autowired
    public ServiceAgreementsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * List Assigned permissions for a users in a service agreement. - &#x60;GET&#x60;.
     * # List Assigned permissions for a users in a service agreement. - &#x60;GET&#x60;    Returns user permissions and approval id for specific user and service agreement.
     * <p><b>200</b> - Users permissions successfully retrieved.
     * @param id Service Agreement ID (required)
     * @param userId User ID (required)
     * @return ApprovalPermissions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApprovalPermissions getAssignUsersPermissions(String id, String userId) throws RestClientException {
        return getAssignUsersPermissionsWithHttpInfo(id, userId).getBody();
    }

    /**
     * List Assigned permissions for a users in a service agreement. - &#x60;GET&#x60;.
     * # List Assigned permissions for a users in a service agreement. - &#x60;GET&#x60;    Returns user permissions and approval id for specific user and service agreement.
     * <p><b>200</b> - Users permissions successfully retrieved.
     * @param id Service Agreement ID (required)
     * @param userId User ID (required)
     * @return ResponseEntity&lt;ApprovalPermissions&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApprovalPermissions> getAssignUsersPermissionsWithHttpInfo(String id, String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getAssignUsersPermissions");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getAssignUsersPermissions");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        localVarUriVariables.put("userId", userId);
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/service-agreements/{id}/users/{userId}/permissions", localVarUriVariables);

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

        ParameterizedTypeReference<ApprovalPermissions> localVarReturnType = new ParameterizedTypeReference<ApprovalPermissions>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
