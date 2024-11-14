package com.microsphere.approval.service.api.listener.v2;

import com.microsphere.approval.service.api.listener.ApiClient;

import com.microsphere.approval.service.api.listener.v2.model.BadRequestError;
import com.microsphere.approval.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.approval.service.api.listener.v2.model.PresentationDeletePolicyAssignmentResponse;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPostFilterPolicyAssignmentRequest;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPostFilterPolicyAssignmentResponse;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPostPolicyAssignmentBulkRequest;

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
@Component("com.microsphere.approval.service.api.listener.v2.PolicyAssignmentsApi")

public class PolicyAssignmentsApi {
    private final ApiClient apiClient;


    @Autowired
    public PolicyAssignmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Delete policies assigned to a service agreement. Optionally a resource or function can be specified to delete only a subset.
     * Delete policies assigned to a service agreement. Optionally a resource or function can be specified to delete only a subset.
     * <p><b>200</b> - Policies are deleted
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - BadRequest
     * @param serviceAgreementId The external serviceAgreementId to remove the policies assigned to. It will be mapped to the internal id by the service.  (optional)
     * @param resource When specified, only policies assigned to this resource will be deleted. E.g. \&quot;Payments\&quot; to delete every policy assigned to any Payments function. (optional)
     * @param function When specified, only policies assigned to this function will be deleted. E.g. \&quot;SEPA CT\&quot; to delete the policies assigned to this function only. (optional)
     * @return PresentationDeletePolicyAssignmentResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PresentationDeletePolicyAssignmentResponse deletePolicyAssignment(String serviceAgreementId, String resource, String function) throws RestClientException {
        return deletePolicyAssignmentWithHttpInfo(serviceAgreementId, resource, function).getBody();
    }

    /**
     * Delete policies assigned to a service agreement. Optionally a resource or function can be specified to delete only a subset.
     * Delete policies assigned to a service agreement. Optionally a resource or function can be specified to delete only a subset.
     * <p><b>200</b> - Policies are deleted
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - BadRequest
     * @param serviceAgreementId The external serviceAgreementId to remove the policies assigned to. It will be mapped to the internal id by the service.  (optional)
     * @param resource When specified, only policies assigned to this resource will be deleted. E.g. \&quot;Payments\&quot; to delete every policy assigned to any Payments function. (optional)
     * @param function When specified, only policies assigned to this function will be deleted. E.g. \&quot;SEPA CT\&quot; to delete the policies assigned to this function only. (optional)
     * @return ResponseEntity&lt;PresentationDeletePolicyAssignmentResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PresentationDeletePolicyAssignmentResponse> deletePolicyAssignmentWithHttpInfo(String serviceAgreementId, String resource, String function) throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/policy-assignments", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "serviceAgreementId", serviceAgreementId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "resource", resource));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "function", function));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PresentationDeletePolicyAssignmentResponse> localVarReturnType = new ParameterizedTypeReference<PresentationDeletePolicyAssignmentResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Policy Assignments bulk ingestion
     * <p><b>204</b> - Policies successfully assigned
     * <p><b>400</b> - BadRequest
     * @param presentationPostPolicyAssignmentBulkRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postCreatesBulkPolicyAssignments(PresentationPostPolicyAssignmentBulkRequest presentationPostPolicyAssignmentBulkRequest) throws RestClientException {
        postCreatesBulkPolicyAssignmentsWithHttpInfo(presentationPostPolicyAssignmentBulkRequest);
    }

    /**
     * 
     * Policy Assignments bulk ingestion
     * <p><b>204</b> - Policies successfully assigned
     * <p><b>400</b> - BadRequest
     * @param presentationPostPolicyAssignmentBulkRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postCreatesBulkPolicyAssignmentsWithHttpInfo(PresentationPostPolicyAssignmentBulkRequest presentationPostPolicyAssignmentBulkRequest) throws RestClientException {
        Object localVarPostBody = presentationPostPolicyAssignmentBulkRequest;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/policy-assignments/bulk", Collections.<String, Object>emptyMap());

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
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Filter assigned policies by service agreement and optional additional criteria.
     * Filter assigned policies by service agreement and optional additional criteria
     * <p><b>200</b> - List of assigned policies
     * <p><b>400</b> - BadRequest
     * @param presentationPostFilterPolicyAssignmentRequest Filter assigned policies by service agreement and optional additional criteria (optional)
     * @return PresentationPostFilterPolicyAssignmentResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PresentationPostFilterPolicyAssignmentResponse postFilterWithPostFilterPolicyAssignmentRequestpostFilterassignedpolicies(PresentationPostFilterPolicyAssignmentRequest presentationPostFilterPolicyAssignmentRequest) throws RestClientException {
        return postFilterWithPostFilterPolicyAssignmentRequestpostFilterassignedpoliciesWithHttpInfo(presentationPostFilterPolicyAssignmentRequest).getBody();
    }

    /**
     * Filter assigned policies by service agreement and optional additional criteria.
     * Filter assigned policies by service agreement and optional additional criteria
     * <p><b>200</b> - List of assigned policies
     * <p><b>400</b> - BadRequest
     * @param presentationPostFilterPolicyAssignmentRequest Filter assigned policies by service agreement and optional additional criteria (optional)
     * @return ResponseEntity&lt;PresentationPostFilterPolicyAssignmentResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PresentationPostFilterPolicyAssignmentResponse> postFilterWithPostFilterPolicyAssignmentRequestpostFilterassignedpoliciesWithHttpInfo(PresentationPostFilterPolicyAssignmentRequest presentationPostFilterPolicyAssignmentRequest) throws RestClientException {
        Object localVarPostBody = presentationPostFilterPolicyAssignmentRequest;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/policy-assignments/filter", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PresentationPostFilterPolicyAssignmentResponse> localVarReturnType = new ParameterizedTypeReference<PresentationPostFilterPolicyAssignmentResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
