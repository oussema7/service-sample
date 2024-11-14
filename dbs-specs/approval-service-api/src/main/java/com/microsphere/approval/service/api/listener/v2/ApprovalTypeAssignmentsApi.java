package com.microsphere.approval.service.api.listener.v2;

import com.microsphere.approval.service.api.listener.ApiClient;

import com.microsphere.approval.service.api.listener.v2.model.BadRequestError;
import com.microsphere.approval.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.approval.service.api.listener.v2.model.GetApprovalTypeResponse;
import com.microsphere.approval.service.api.listener.v2.model.NotFoundError;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPostBulkApprovalTypeAssignmentRequest;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPostBulkApprovalTypeAssignmentResponse;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPostFilterBulkApprovalTypeAssignmentRequest;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPostFilterBulkApprovalTypeAssignmentResponse;
import com.microsphere.approval.service.api.listener.v2.model.PutApprovalTypeAssignmentRequest;

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
@Component("com.microsphere.approval.service.api.listener.v2.ApprovalTypeAssignmentsApi")

public class ApprovalTypeAssignmentsApi {
    private final ApiClient apiClient;


    @Autowired
    public ApprovalTypeAssignmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * This endpoint is used to delete the approval type that is assigned to the given job profile.
     * This endpoint is used to delete the approval type that is assigned to the given job profile.
     * <p><b>204</b> - approval type assignment is deleted
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param id The id of the job profile. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteApprovalTypeAssignmentById(String id) throws RestClientException {
        deleteApprovalTypeAssignmentByIdWithHttpInfo(id);
    }

    /**
     * This endpoint is used to delete the approval type that is assigned to the given job profile.
     * This endpoint is used to delete the approval type that is assigned to the given job profile.
     * <p><b>204</b> - approval type assignment is deleted
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param id The id of the job profile. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteApprovalTypeAssignmentByIdWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteApprovalTypeAssignmentById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/approval-type-assignments/{id}", localVarUriVariables);

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
     * Retrieve the approval type that is assigned to the given job profile.
     * Retrieve the approval type that is assigned to the given job profile.
     * <p><b>200</b> - Detailed information about the approval type.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param id The id of the job profile. (required)
     * @return GetApprovalTypeResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetApprovalTypeResponse getAssignedApprovalTypeById(String id) throws RestClientException {
        return getAssignedApprovalTypeByIdWithHttpInfo(id).getBody();
    }

    /**
     * Retrieve the approval type that is assigned to the given job profile.
     * Retrieve the approval type that is assigned to the given job profile.
     * <p><b>200</b> - Detailed information about the approval type.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param id The id of the job profile. (required)
     * @return ResponseEntity&lt;GetApprovalTypeResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetApprovalTypeResponse> getAssignedApprovalTypeByIdWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getAssignedApprovalTypeById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/approval-type-assignments/{id}", localVarUriVariables);

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

        ParameterizedTypeReference<GetApprovalTypeResponse> localVarReturnType = new ParameterizedTypeReference<GetApprovalTypeResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Bulk assign approval type
     * <p><b>201</b> - Approval type assignments created succesfully
     * <p><b>400</b> - BadRequestException
     * @param presentationPostBulkApprovalTypeAssignmentRequest  (optional)
     * @return PresentationPostBulkApprovalTypeAssignmentResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PresentationPostBulkApprovalTypeAssignmentResponse postBulk(PresentationPostBulkApprovalTypeAssignmentRequest presentationPostBulkApprovalTypeAssignmentRequest) throws RestClientException {
        return postBulkWithHttpInfo(presentationPostBulkApprovalTypeAssignmentRequest).getBody();
    }

    /**
     * 
     * Bulk assign approval type
     * <p><b>201</b> - Approval type assignments created succesfully
     * <p><b>400</b> - BadRequestException
     * @param presentationPostBulkApprovalTypeAssignmentRequest  (optional)
     * @return ResponseEntity&lt;PresentationPostBulkApprovalTypeAssignmentResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PresentationPostBulkApprovalTypeAssignmentResponse> postBulkWithHttpInfo(PresentationPostBulkApprovalTypeAssignmentRequest presentationPostBulkApprovalTypeAssignmentRequest) throws RestClientException {
        Object localVarPostBody = presentationPostBulkApprovalTypeAssignmentRequest;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/approval-type-assignments/bulk", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PresentationPostBulkApprovalTypeAssignmentResponse> localVarReturnType = new ParameterizedTypeReference<PresentationPostBulkApprovalTypeAssignmentResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Retrieve approval type assignments by job profile ids
     * <p><b>200</b> - Assigned approval types assignments retrieved successfully
     * @param presentationPostFilterBulkApprovalTypeAssignmentRequest Retrieve approval type assignments by job profile ids (optional)
     * @return PresentationPostFilterBulkApprovalTypeAssignmentResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PresentationPostFilterBulkApprovalTypeAssignmentResponse postFilter(PresentationPostFilterBulkApprovalTypeAssignmentRequest presentationPostFilterBulkApprovalTypeAssignmentRequest) throws RestClientException {
        return postFilterWithHttpInfo(presentationPostFilterBulkApprovalTypeAssignmentRequest).getBody();
    }

    /**
     * 
     * Retrieve approval type assignments by job profile ids
     * <p><b>200</b> - Assigned approval types assignments retrieved successfully
     * @param presentationPostFilterBulkApprovalTypeAssignmentRequest Retrieve approval type assignments by job profile ids (optional)
     * @return ResponseEntity&lt;PresentationPostFilterBulkApprovalTypeAssignmentResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PresentationPostFilterBulkApprovalTypeAssignmentResponse> postFilterWithHttpInfo(PresentationPostFilterBulkApprovalTypeAssignmentRequest presentationPostFilterBulkApprovalTypeAssignmentRequest) throws RestClientException {
        Object localVarPostBody = presentationPostFilterBulkApprovalTypeAssignmentRequest;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/approval-type-assignments/bulk/filter", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PresentationPostFilterBulkApprovalTypeAssignmentResponse> localVarReturnType = new ParameterizedTypeReference<PresentationPostFilterBulkApprovalTypeAssignmentResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates an existing type assignment to a new one.
     * Updates an existing type assignment to a new one.
     * <p><b>204</b> - Approval type assignment updated successfully
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Approval type assignment forbidden
     * <p><b>404</b> - NotFound
     * @param id The id of the job profile. (required)
     * @param putApprovalTypeAssignmentRequest Updates an existing type assignment to a new one. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putApprovalTypeAssignmentById(String id, PutApprovalTypeAssignmentRequest putApprovalTypeAssignmentRequest) throws RestClientException {
        putApprovalTypeAssignmentByIdWithHttpInfo(id, putApprovalTypeAssignmentRequest);
    }

    /**
     * Updates an existing type assignment to a new one.
     * Updates an existing type assignment to a new one.
     * <p><b>204</b> - Approval type assignment updated successfully
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Approval type assignment forbidden
     * <p><b>404</b> - NotFound
     * @param id The id of the job profile. (required)
     * @param putApprovalTypeAssignmentRequest Updates an existing type assignment to a new one. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putApprovalTypeAssignmentByIdWithHttpInfo(String id, PutApprovalTypeAssignmentRequest putApprovalTypeAssignmentRequest) throws RestClientException {
        Object localVarPostBody = putApprovalTypeAssignmentRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling putApprovalTypeAssignmentById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/approval-type-assignments/{id}", localVarUriVariables);

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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
