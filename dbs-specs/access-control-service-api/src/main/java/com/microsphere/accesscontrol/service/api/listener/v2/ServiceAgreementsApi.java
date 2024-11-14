package com.microsphere.accesscontrol.service.api.listener.v2;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;

import com.microsphere.accesscontrol.service.api.listener.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.BatchResponseItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ListOfFunctionGroupsWithDataGroups;
import com.microsphere.accesscontrol.service.api.listener.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationApprovalStatus;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServiceAgreementBatchDelete;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServiceAgreementParticipantsGetResponseBody;

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

@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
@Component("com.microsphere.accesscontrol.service.api.listener.v2.ServiceAgreementsApi")

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
     * Retrieves Legal Entities that are participants in Service Agreement from the context.
     * Retrieves Legal Entities that are participants in Service Agreement from the context.
     * <p><b>200</b> - Service Agreement participants retrieved successfully.
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @return List&lt;ServiceAgreementParticipantsGetResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ServiceAgreementParticipantsGetResponseBody> getContextServiceAgreementParticipants() throws RestClientException {
        return getContextServiceAgreementParticipantsWithHttpInfo().getBody();
    }

    /**
     * Retrieves Legal Entities that are participants in Service Agreement from the context.
     * Retrieves Legal Entities that are participants in Service Agreement from the context.
     * <p><b>200</b> - Service Agreement participants retrieved successfully.
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @return ResponseEntity&lt;List&lt;ServiceAgreementParticipantsGetResponseBody&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ServiceAgreementParticipantsGetResponseBody>> getContextServiceAgreementParticipantsWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/service-agreements/usercontext/participants", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<ServiceAgreementParticipantsGetResponseBody>> localVarReturnType = new ParameterizedTypeReference<List<ServiceAgreementParticipantsGetResponseBody>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves Legal Entities that are participants in Service Agreement.
     * Retrieves Legal Entities that are participants in Service Agreement.
     * <p><b>200</b> - Service Agreement participants retrieved successfully.
     * <p><b>404</b> - NotFound
     * @param id No description available (required)
     * @return List&lt;ServiceAgreementParticipantsGetResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ServiceAgreementParticipantsGetResponseBody> getServiceAgreementParticipants(String id) throws RestClientException {
        return getServiceAgreementParticipantsWithHttpInfo(id).getBody();
    }

    /**
     * Retrieves Legal Entities that are participants in Service Agreement.
     * Retrieves Legal Entities that are participants in Service Agreement.
     * <p><b>200</b> - Service Agreement participants retrieved successfully.
     * <p><b>404</b> - NotFound
     * @param id No description available (required)
     * @return ResponseEntity&lt;List&lt;ServiceAgreementParticipantsGetResponseBody&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ServiceAgreementParticipantsGetResponseBody>> getServiceAgreementParticipantsWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getServiceAgreementParticipants");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/service-agreements/{id}/participants", localVarUriVariables);

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

        ParameterizedTypeReference<List<ServiceAgreementParticipantsGetResponseBody>> localVarReturnType = new ParameterizedTypeReference<List<ServiceAgreementParticipantsGetResponseBody>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Batch Delete Of Service Agreement.
     * #Batch Delete Of Service Agreement.    POST request to batch delete of service agreement.
     * <p><b>207</b> - MultiStatus
     * <p><b>400</b> - BadRequest
     * @param serviceAgreementBatchDelete #Batch Delete Of Service Agreement.    POST request to batch delete of service agreement. (optional)
     * @return List&lt;BatchResponseItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BatchResponseItem> postBatchdelete(ServiceAgreementBatchDelete serviceAgreementBatchDelete) throws RestClientException {
        return postBatchdeleteWithHttpInfo(serviceAgreementBatchDelete).getBody();
    }

    /**
     * Batch Delete Of Service Agreement.
     * #Batch Delete Of Service Agreement.    POST request to batch delete of service agreement.
     * <p><b>207</b> - MultiStatus
     * <p><b>400</b> - BadRequest
     * @param serviceAgreementBatchDelete #Batch Delete Of Service Agreement.    POST request to batch delete of service agreement. (optional)
     * @return ResponseEntity&lt;List&lt;BatchResponseItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BatchResponseItem>> postBatchdeleteWithHttpInfo(ServiceAgreementBatchDelete serviceAgreementBatchDelete) throws RestClientException {
        Object localVarPostBody = serviceAgreementBatchDelete;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/service-agreements/batch/delete", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<BatchResponseItem>> localVarReturnType = new ParameterizedTypeReference<List<BatchResponseItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates all permission for a users in a given service agreement.
     * Updates all permission for a users in a given service agreement.
     * <p><b>200</b> - Users permissions successfully to the Service Agreement.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param id No description available (required)
     * @param userId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @param listOfFunctionGroupsWithDataGroups Updates all permission for a users in a given service agreement. (optional)
     * @return PresentationApprovalStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PresentationApprovalStatus putAssignUsersPermissions(String id, String userId, ListOfFunctionGroupsWithDataGroups listOfFunctionGroupsWithDataGroups) throws RestClientException {
        return putAssignUsersPermissionsWithHttpInfo(id, userId, listOfFunctionGroupsWithDataGroups).getBody();
    }

    /**
     * Updates all permission for a users in a given service agreement.
     * Updates all permission for a users in a given service agreement.
     * <p><b>200</b> - Users permissions successfully to the Service Agreement.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param id No description available (required)
     * @param userId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @param listOfFunctionGroupsWithDataGroups Updates all permission for a users in a given service agreement. (optional)
     * @return ResponseEntity&lt;PresentationApprovalStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PresentationApprovalStatus> putAssignUsersPermissionsWithHttpInfo(String id, String userId, ListOfFunctionGroupsWithDataGroups listOfFunctionGroupsWithDataGroups) throws RestClientException {
        Object localVarPostBody = listOfFunctionGroupsWithDataGroups;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling putAssignUsersPermissions");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling putAssignUsersPermissions");
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PresentationApprovalStatus> localVarReturnType = new ParameterizedTypeReference<PresentationApprovalStatus>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
