package com.microsphere.approval.service.api.listener.v2;

import com.microsphere.approval.service.api.listener.ApiClient;

import com.microsphere.approval.service.api.listener.v2.model.BadRequestError;
import com.microsphere.approval.service.api.listener.v2.model.NotFoundError;
import com.microsphere.approval.service.api.listener.v2.model.PostPolicyRequest;
import com.microsphere.approval.service.api.listener.v2.model.PostPolicyResponse;

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

@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:49.266495+01:00[Africa/Tunis]")
@Component("com.microsphere.approval.service.api.listener.v2.PoliciesApi")

public class PoliciesApi {
    private final ApiClient apiClient;


    @Autowired
    public PoliciesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * 
     * Delete policy by id
     * <p><b>204</b> - Policy deleted successfully
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param id Policy id (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deletePolicyById(String id) throws RestClientException {
        deletePolicyByIdWithHttpInfo(id);
    }

    /**
     * 
     * Delete policy by id
     * <p><b>204</b> - Policy deleted successfully
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param id Policy id (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deletePolicyByIdWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deletePolicyById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/policies/{id}", localVarUriVariables);

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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create a new policy.
     * Create a new policy.
     * <p><b>201</b> - Policy created successfully
     * <p><b>400</b> - Failed to create the policy due to an error in the request.
     * @param postPolicyRequest Create a new policy. (optional)
     * @return PostPolicyResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostPolicyResponse postPolicy(PostPolicyRequest postPolicyRequest) throws RestClientException {
        return postPolicyWithHttpInfo(postPolicyRequest).getBody();
    }

    /**
     * Create a new policy.
     * Create a new policy.
     * <p><b>201</b> - Policy created successfully
     * <p><b>400</b> - Failed to create the policy due to an error in the request.
     * @param postPolicyRequest Create a new policy. (optional)
     * @return ResponseEntity&lt;PostPolicyResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostPolicyResponse> postPolicyWithHttpInfo(PostPolicyRequest postPolicyRequest) throws RestClientException {
        Object localVarPostBody = postPolicyRequest;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/policies", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PostPolicyResponse> localVarReturnType = new ParameterizedTypeReference<PostPolicyResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
