package com.microsphere.approval.service.api.listener.v2;

import com.microsphere.approval.service.api.listener.ApiClient;

import com.microsphere.approval.service.api.listener.v2.model.BadRequestError;
import com.microsphere.approval.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.approval.service.api.listener.v2.model.NotFoundError;
import com.microsphere.approval.service.api.listener.v2.model.PostApprovalRecordRequest;
import com.microsphere.approval.service.api.listener.v2.model.PostApprovalRecordStatusUpdateRequest;
import com.microsphere.approval.service.api.listener.v2.model.PostFilterApprovalsDetailsRequest;
import com.microsphere.approval.service.api.listener.v2.model.PostFilterApprovalsDetailsResponse;
import com.microsphere.approval.service.api.listener.v2.model.PostVerifyApprovalRequest;
import com.microsphere.approval.service.api.listener.v2.model.PostVerifyApprovalResponse;
import com.microsphere.approval.service.api.listener.v2.model.PresentationGetApprovalDetailResponse;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPostApprovalRequest;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPostApprovalResponse;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPostFilterApprovalsRequest;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPostFilterApprovalsResponse;
import com.microsphere.approval.service.api.listener.v2.model.PutUpdateStatusRequest;
import com.microsphere.approval.service.api.listener.v2.model.ReauthUnauthorizedError;

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
@Component("com.microsphere.approval.service.api.listener.v2.ApprovalsApi")

public class ApprovalsApi {
    private final ApiClient apiClient;


    @Autowired
    public ApprovalsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * 
     * Get approval detail by id
     * <p><b>200</b> - Detailed information about the approval.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>403</b> - Forbidden
     * @param approvalId The Id of the approval request. Example: \&quot;b3e4692d-6772-4fb2-9446-b8f4607f49b1\&quot; (required)
     * @param serviceAgreementId Internal id of the Service agreement (required)
     * @param userId Internal id of the user (required)
     * @param enrichUsersWithFullName Tells the approval service to enrich the approval and records with the users&#39; \&quot;Full name\&quot; and \&quot;External user id\&quot;. (optional, default to false)
     * @return PresentationGetApprovalDetailResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PresentationGetApprovalDetailResponse getApprovalById(String approvalId, String serviceAgreementId, String userId, Boolean enrichUsersWithFullName) throws RestClientException {
        return getApprovalByIdWithHttpInfo(approvalId, serviceAgreementId, userId, enrichUsersWithFullName).getBody();
    }

    /**
     * 
     * Get approval detail by id
     * <p><b>200</b> - Detailed information about the approval.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>403</b> - Forbidden
     * @param approvalId The Id of the approval request. Example: \&quot;b3e4692d-6772-4fb2-9446-b8f4607f49b1\&quot; (required)
     * @param serviceAgreementId Internal id of the Service agreement (required)
     * @param userId Internal id of the user (required)
     * @param enrichUsersWithFullName Tells the approval service to enrich the approval and records with the users&#39; \&quot;Full name\&quot; and \&quot;External user id\&quot;. (optional, default to false)
     * @return ResponseEntity&lt;PresentationGetApprovalDetailResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PresentationGetApprovalDetailResponse> getApprovalByIdWithHttpInfo(String approvalId, String serviceAgreementId, String userId, Boolean enrichUsersWithFullName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'approvalId' is set
        if (approvalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'approvalId' when calling getApprovalById");
        }
        
        // verify the required parameter 'serviceAgreementId' is set
        if (serviceAgreementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementId' when calling getApprovalById");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getApprovalById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("approvalId", approvalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/approvals/{approvalId}", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "serviceAgreementId", serviceAgreementId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "enrichUsersWithFullName", enrichUsersWithFullName));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PresentationGetApprovalDetailResponse> localVarReturnType = new ParameterizedTypeReference<PresentationGetApprovalDetailResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Create an approval
     * <p><b>201</b> - Approval created successfully
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Post approval with pre-approve unauthorized
     * <p><b>403</b> - Post approval with pre-approve forbidden
     * @param presentationPostApprovalRequest Create an approval (optional)
     * @return PresentationPostApprovalResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PresentationPostApprovalResponse postApproval(PresentationPostApprovalRequest presentationPostApprovalRequest) throws RestClientException {
        return postApprovalWithHttpInfo(presentationPostApprovalRequest).getBody();
    }

    /**
     * 
     * Create an approval
     * <p><b>201</b> - Approval created successfully
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Post approval with pre-approve unauthorized
     * <p><b>403</b> - Post approval with pre-approve forbidden
     * @param presentationPostApprovalRequest Create an approval (optional)
     * @return ResponseEntity&lt;PresentationPostApprovalResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PresentationPostApprovalResponse> postApprovalWithHttpInfo(PresentationPostApprovalRequest presentationPostApprovalRequest) throws RestClientException {
        Object localVarPostBody = presentationPostApprovalRequest;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/approvals", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PresentationPostApprovalResponse> localVarReturnType = new ParameterizedTypeReference<PresentationPostApprovalResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Approve or reject an approval. Depending on the applicable policy, the status of the approval may or may not change as a result of this action.
     * <p><b>200</b> - The request was processed successfully and the response contains the new state of the approval.
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Post approval record unauthorized
     * <p><b>403</b> - Post approval record forbidden
     * <p><b>404</b> - NotFound
     * @param approvalId The Id of the approval request to update. Example: \&quot;b3e4692d-6772-4fb2-9446-b8f4607f49b1\&quot; (required)
     * @param filterCreatedRecord If this set to true, only created record is returned in the response. Default is set to false. (optional, default to false)
     * @param postApprovalRecordRequest Approve or reject an approval. Depending on the applicable policy, the status of the approval may or may not change as a result of this action. (optional)
     * @return PresentationPostApprovalResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PresentationPostApprovalResponse postApprovalRecordByApprovalId(String approvalId, Boolean filterCreatedRecord, PostApprovalRecordRequest postApprovalRecordRequest) throws RestClientException {
        return postApprovalRecordByApprovalIdWithHttpInfo(approvalId, filterCreatedRecord, postApprovalRecordRequest).getBody();
    }

    /**
     * 
     * Approve or reject an approval. Depending on the applicable policy, the status of the approval may or may not change as a result of this action.
     * <p><b>200</b> - The request was processed successfully and the response contains the new state of the approval.
     * <p><b>400</b> - BadRequest
     * <p><b>401</b> - Post approval record unauthorized
     * <p><b>403</b> - Post approval record forbidden
     * <p><b>404</b> - NotFound
     * @param approvalId The Id of the approval request to update. Example: \&quot;b3e4692d-6772-4fb2-9446-b8f4607f49b1\&quot; (required)
     * @param filterCreatedRecord If this set to true, only created record is returned in the response. Default is set to false. (optional, default to false)
     * @param postApprovalRecordRequest Approve or reject an approval. Depending on the applicable policy, the status of the approval may or may not change as a result of this action. (optional)
     * @return ResponseEntity&lt;PresentationPostApprovalResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PresentationPostApprovalResponse> postApprovalRecordByApprovalIdWithHttpInfo(String approvalId, Boolean filterCreatedRecord, PostApprovalRecordRequest postApprovalRecordRequest) throws RestClientException {
        Object localVarPostBody = postApprovalRecordRequest;
        
        // verify the required parameter 'approvalId' is set
        if (approvalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'approvalId' when calling postApprovalRecordByApprovalId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("approvalId", approvalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/approvals/{approvalId}/records", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filterCreatedRecord", filterCreatedRecord));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PresentationPostApprovalResponse> localVarReturnType = new ParameterizedTypeReference<PresentationPostApprovalResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Filter approvals
     * <p><b>200</b> - Filtered list of approvals
     * <p><b>400</b> - The request to filter for approvals can be invalid for several reasons. See the examples.
     * <p><b>403</b> - Insufficient permissions due to a lack of job profiles for the relevant business functions. E.g. only a job profile for contacts but none for any of the payment orders business functions when filtering for approvable payment orders.
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. This allows to point to the record to start the selection from. (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. This value may not be negative.  (optional, default to 10)
     * @param presentationPostFilterApprovalsRequest  (optional)
     * @return PresentationPostFilterApprovalsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PresentationPostFilterApprovalsResponse postFilterApprovals(Integer from, String cursor, Integer size, PresentationPostFilterApprovalsRequest presentationPostFilterApprovalsRequest) throws RestClientException {
        return postFilterApprovalsWithHttpInfo(from, cursor, size, presentationPostFilterApprovalsRequest).getBody();
    }

    /**
     * 
     * Filter approvals
     * <p><b>200</b> - Filtered list of approvals
     * <p><b>400</b> - The request to filter for approvals can be invalid for several reasons. See the examples.
     * <p><b>403</b> - Insufficient permissions due to a lack of job profiles for the relevant business functions. E.g. only a job profile for contacts but none for any of the payment orders business functions when filtering for approvable payment orders.
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. This allows to point to the record to start the selection from. (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. This value may not be negative.  (optional, default to 10)
     * @param presentationPostFilterApprovalsRequest  (optional)
     * @return ResponseEntity&lt;PresentationPostFilterApprovalsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PresentationPostFilterApprovalsResponse> postFilterApprovalsWithHttpInfo(Integer from, String cursor, Integer size, PresentationPostFilterApprovalsRequest presentationPostFilterApprovalsRequest) throws RestClientException {
        Object localVarPostBody = presentationPostFilterApprovalsRequest;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/approvals/filter", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PresentationPostFilterApprovalsResponse> localVarReturnType = new ParameterizedTypeReference<PresentationPostFilterApprovalsResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Find approval by id
     * <p><b>200</b> - Detailed information about the approval.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param approvalId The Id of the approval request. Example: \&quot;b3e4692d-6772-4fb2-9446-b8f4607f49b1\&quot; (required)
     * @param postFilterApprovalsDetailsRequest  (optional)
     * @return PostFilterApprovalsDetailsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostFilterApprovalsDetailsResponse postFilterByApprovalId(String approvalId, PostFilterApprovalsDetailsRequest postFilterApprovalsDetailsRequest) throws RestClientException {
        return postFilterByApprovalIdWithHttpInfo(approvalId, postFilterApprovalsDetailsRequest).getBody();
    }

    /**
     * 
     * Find approval by id
     * <p><b>200</b> - Detailed information about the approval.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param approvalId The Id of the approval request. Example: \&quot;b3e4692d-6772-4fb2-9446-b8f4607f49b1\&quot; (required)
     * @param postFilterApprovalsDetailsRequest  (optional)
     * @return ResponseEntity&lt;PostFilterApprovalsDetailsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostFilterApprovalsDetailsResponse> postFilterByApprovalIdWithHttpInfo(String approvalId, PostFilterApprovalsDetailsRequest postFilterApprovalsDetailsRequest) throws RestClientException {
        Object localVarPostBody = postFilterApprovalsDetailsRequest;
        
        // verify the required parameter 'approvalId' is set
        if (approvalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'approvalId' when calling postFilterByApprovalId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("approvalId", approvalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/approvals/{approvalId}/filter", localVarUriVariables);

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

        ParameterizedTypeReference<PostFilterApprovalsDetailsResponse> localVarReturnType = new ParameterizedTypeReference<PostFilterApprovalsDetailsResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Using this endpoint status of an approval record can be updated. The status of the approval also may change as a result of this action.
     * <p><b>200</b> - The response body of approval record update action. This response contains the approval along with the updated approval record.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param approvalRecordId The id of the approval record (required)
     * @param filterUpdatedRecord If this set to true, only updated record is returned in the response. Default is set to false. (optional, default to false)
     * @param postApprovalRecordStatusUpdateRequest Using this endpoint status of an approval record can be updated. (optional)
     * @return PresentationPostApprovalResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PresentationPostApprovalResponse postStatusUpdateByApprovalRecordId(String approvalRecordId, Boolean filterUpdatedRecord, PostApprovalRecordStatusUpdateRequest postApprovalRecordStatusUpdateRequest) throws RestClientException {
        return postStatusUpdateByApprovalRecordIdWithHttpInfo(approvalRecordId, filterUpdatedRecord, postApprovalRecordStatusUpdateRequest).getBody();
    }

    /**
     * 
     * Using this endpoint status of an approval record can be updated. The status of the approval also may change as a result of this action.
     * <p><b>200</b> - The response body of approval record update action. This response contains the approval along with the updated approval record.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param approvalRecordId The id of the approval record (required)
     * @param filterUpdatedRecord If this set to true, only updated record is returned in the response. Default is set to false. (optional, default to false)
     * @param postApprovalRecordStatusUpdateRequest Using this endpoint status of an approval record can be updated. (optional)
     * @return ResponseEntity&lt;PresentationPostApprovalResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PresentationPostApprovalResponse> postStatusUpdateByApprovalRecordIdWithHttpInfo(String approvalRecordId, Boolean filterUpdatedRecord, PostApprovalRecordStatusUpdateRequest postApprovalRecordStatusUpdateRequest) throws RestClientException {
        Object localVarPostBody = postApprovalRecordStatusUpdateRequest;
        
        // verify the required parameter 'approvalRecordId' is set
        if (approvalRecordId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'approvalRecordId' when calling postStatusUpdateByApprovalRecordId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("approvalRecordId", approvalRecordId);
        String localVarPath = apiClient.expandPath("/service-api/v2/approval-records/{approvalRecordId}/update-status", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filterUpdatedRecord", filterUpdatedRecord));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PresentationPostApprovalResponse> localVarReturnType = new ParameterizedTypeReference<PresentationPostApprovalResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Verify approval rights
     * <p><b>200</b> - Response containing canApprove and finalApprover fields
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param postVerifyApprovalRequest  (optional)
     * @return PostVerifyApprovalResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostVerifyApprovalResponse postVerify(PostVerifyApprovalRequest postVerifyApprovalRequest) throws RestClientException {
        return postVerifyWithHttpInfo(postVerifyApprovalRequest).getBody();
    }

    /**
     * 
     * Verify approval rights
     * <p><b>200</b> - Response containing canApprove and finalApprover fields
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param postVerifyApprovalRequest  (optional)
     * @return ResponseEntity&lt;PostVerifyApprovalResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostVerifyApprovalResponse> postVerifyWithHttpInfo(PostVerifyApprovalRequest postVerifyApprovalRequest) throws RestClientException {
        Object localVarPostBody = postVerifyApprovalRequest;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/approvals/verify", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PostVerifyApprovalResponse> localVarReturnType = new ParameterizedTypeReference<PostVerifyApprovalResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * With this endpoint the status of an approval request can be set to CANCELLED.
     * With this endpoint the status of an approval request can be set to CANCELLED.
     * <p><b>204</b> - The request was processed successfully and the approval request status is the sent status.
     * <p><b>400</b> - If the approval status from the request is any other state then CANCELLED
     * <p><b>404</b> - NotFound
     * @param approvalId The Id of the approval request. Example: \&quot;b3e4692d-6772-4fb2-9446-b8f4607f49b1\&quot; (required)
     * @param putUpdateStatusRequest With this endpoint the status of an approval request can be set to CANCELLED. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putStatusByApprovalId(String approvalId, PutUpdateStatusRequest putUpdateStatusRequest) throws RestClientException {
        putStatusByApprovalIdWithHttpInfo(approvalId, putUpdateStatusRequest);
    }

    /**
     * With this endpoint the status of an approval request can be set to CANCELLED.
     * With this endpoint the status of an approval request can be set to CANCELLED.
     * <p><b>204</b> - The request was processed successfully and the approval request status is the sent status.
     * <p><b>400</b> - If the approval status from the request is any other state then CANCELLED
     * <p><b>404</b> - NotFound
     * @param approvalId The Id of the approval request. Example: \&quot;b3e4692d-6772-4fb2-9446-b8f4607f49b1\&quot; (required)
     * @param putUpdateStatusRequest With this endpoint the status of an approval request can be set to CANCELLED. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putStatusByApprovalIdWithHttpInfo(String approvalId, PutUpdateStatusRequest putUpdateStatusRequest) throws RestClientException {
        Object localVarPostBody = putUpdateStatusRequest;
        
        // verify the required parameter 'approvalId' is set
        if (approvalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'approvalId' when calling putStatusByApprovalId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("approvalId", approvalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/approvals/{approvalId}/status", localVarUriVariables);

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
