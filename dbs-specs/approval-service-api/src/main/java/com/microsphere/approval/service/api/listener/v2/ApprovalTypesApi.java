package com.microsphere.approval.service.api.listener.v2;

import com.microsphere.approval.service.api.listener.ApiClient;

import com.microsphere.approval.service.api.listener.v2.model.BadRequestError;
import com.microsphere.approval.service.api.listener.v2.model.PostApprovalTypeRequest;
import com.microsphere.approval.service.api.listener.v2.model.PostApprovalTypeResponse;

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
@Component("com.microsphere.approval.service.api.listener.v2.ApprovalTypesApi")

public class ApprovalTypesApi {
    private final ApiClient apiClient;


    @Autowired
    public ApprovalTypesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * 
     * Delete approval type
     * <p><b>204</b> - Approval type deleted
     * <p><b>400</b> - BadRequest
     * @param id Approval type id (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteApprovalTypeById(String id) throws RestClientException {
        deleteApprovalTypeByIdWithHttpInfo(id);
    }

    /**
     * 
     * Delete approval type
     * <p><b>204</b> - Approval type deleted
     * <p><b>400</b> - BadRequest
     * @param id Approval type id (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteApprovalTypeByIdWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteApprovalTypeById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/approval-types/{id}", localVarUriVariables);

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
     * 
     * Create approval type.
     * <p><b>201</b> - Approval type created succesfully
     * <p><b>400</b> - BadRequestException
     * @param postApprovalTypeRequest  (optional)
     * @return PostApprovalTypeResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostApprovalTypeResponse postApprovalType(PostApprovalTypeRequest postApprovalTypeRequest) throws RestClientException {
        return postApprovalTypeWithHttpInfo(postApprovalTypeRequest).getBody();
    }

    /**
     * 
     * Create approval type.
     * <p><b>201</b> - Approval type created succesfully
     * <p><b>400</b> - BadRequestException
     * @param postApprovalTypeRequest  (optional)
     * @return ResponseEntity&lt;PostApprovalTypeResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostApprovalTypeResponse> postApprovalTypeWithHttpInfo(PostApprovalTypeRequest postApprovalTypeRequest) throws RestClientException {
        Object localVarPostBody = postApprovalTypeRequest;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/approval-types", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PostApprovalTypeResponse> localVarReturnType = new ParameterizedTypeReference<PostApprovalTypeResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
