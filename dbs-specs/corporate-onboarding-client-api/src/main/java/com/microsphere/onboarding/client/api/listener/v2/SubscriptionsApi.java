package com.microsphere.onboarding.client.api.listener.v2;

import com.microsphere.onboarding.client.api.listener.ApiClient;

import com.microsphere.onboarding.client.api.listener.v2.model.AccountDetail;
import com.microsphere.onboarding.client.api.listener.v2.model.CardIds;
import com.microsphere.onboarding.client.api.listener.v2.model.ResiliationPutRequest;
import com.microsphere.onboarding.client.api.listener.v2.model.SubscriptionRequestBody;
import com.microsphere.onboarding.client.api.listener.v2.model.SubscriptionResponse;
import com.microsphere.onboarding.client.api.listener.v2.model.SubscriptionResponseBody;
import com.microsphere.onboarding.client.api.listener.v2.model.SubscriptionsPage;
import com.microsphere.onboarding.client.api.listener.v2.model.UserJobRoles;

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

@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:54.559235200+01:00[Africa/Tunis]")
@Component("com.microsphere.onboarding.client.api.listener.v2.SubscriptionsApi")

public class SubscriptionsApi {
    private final ApiClient apiClient;


    @Autowired
    public SubscriptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Get billing accounts by legalEntity ID
     * Returns a list of billing accounts associated with the legal entity external ID provided in the path parameter.
     * <p><b>200</b> - A list of billing accounts.
     * <p><b>404</b> - The specified legal entity external ID was not found.
     * @param externalId external ID of the legal entity to retrieve billing accounts for. (required)
     * @return List&lt;AccountDetail&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccountDetail> getAccountsByLegalEntityExtId(String externalId) throws RestClientException {
        return getAccountsByLegalEntityExtIdWithHttpInfo(externalId).getBody();
    }

    /**
     * Get billing accounts by legalEntity ID
     * Returns a list of billing accounts associated with the legal entity external ID provided in the path parameter.
     * <p><b>200</b> - A list of billing accounts.
     * <p><b>404</b> - The specified legal entity external ID was not found.
     * @param externalId external ID of the legal entity to retrieve billing accounts for. (required)
     * @return ResponseEntity&lt;List&lt;AccountDetail&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AccountDetail>> getAccountsByLegalEntityExtIdWithHttpInfo(String externalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalId' when calling getAccountsByLegalEntityExtId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("externalId", externalId);
        String localVarPath = apiClient.expandPath("/client-api/v2/legal-entities/{externalId}/billing-accounts", localVarUriVariables);

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

        ParameterizedTypeReference<List<AccountDetail>> localVarReturnType = new ParameterizedTypeReference<List<AccountDetail>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - subscriptions retrieved
     * @param page page number (required)
     * @param size page size (required)
     * @param query The search term used to search for sweep rules (optional)
     * @return SubscriptionsPage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionsPage getAllSubscriptions(Integer page, Integer size, String query) throws RestClientException {
        return getAllSubscriptionsWithHttpInfo(page, size, query).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - subscriptions retrieved
     * @param page page number (required)
     * @param size page size (required)
     * @param query The search term used to search for sweep rules (optional)
     * @return ResponseEntity&lt;SubscriptionsPage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionsPage> getAllSubscriptionsWithHttpInfo(Integer page, Integer size, String query) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling getAllSubscriptions");
        }
        
        // verify the required parameter 'size' is set
        if (size == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'size' when calling getAllSubscriptions");
        }
        
        String localVarPath = apiClient.expandPath("/client-api/v2/getAllSubscriptions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SubscriptionsPage> localVarReturnType = new ParameterizedTypeReference<SubscriptionsPage>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get subscription by id
     * Get subscription workflow steps by id
     * <p><b>200</b> - No description available
     * @param subscriptionId subscription id (required)
     * @return SubscriptionResponseBody
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionResponseBody getSubscriptionById(String subscriptionId) throws RestClientException {
        return getSubscriptionByIdWithHttpInfo(subscriptionId).getBody();
    }

    /**
     * Get subscription by id
     * Get subscription workflow steps by id
     * <p><b>200</b> - No description available
     * @param subscriptionId subscription id (required)
     * @return ResponseEntity&lt;SubscriptionResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionResponseBody> getSubscriptionByIdWithHttpInfo(String subscriptionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionId' when calling getSubscriptionById");
        }
        
        String localVarPath = apiClient.expandPath("/client-api/v2/getSubscriptionById", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionId", subscriptionId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SubscriptionResponseBody> localVarReturnType = new ParameterizedTypeReference<SubscriptionResponseBody>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * get subscription by service agreement id
     * get subscription by service agreement id
     * <p><b>200</b> - No description available
     * @param serviceAgreementId  (required)
     * @return SubscriptionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionResponse getSubscriptionByServiceAgreementId(String serviceAgreementId) throws RestClientException {
        return getSubscriptionByServiceAgreementIdWithHttpInfo(serviceAgreementId).getBody();
    }

    /**
     * get subscription by service agreement id
     * get subscription by service agreement id
     * <p><b>200</b> - No description available
     * @param serviceAgreementId  (required)
     * @return ResponseEntity&lt;SubscriptionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionResponse> getSubscriptionByServiceAgreementIdWithHttpInfo(String serviceAgreementId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'serviceAgreementId' is set
        if (serviceAgreementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementId' when calling getSubscriptionByServiceAgreementId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("serviceAgreementId", serviceAgreementId);
        String localVarPath = apiClient.expandPath("/service-api/v2/subscriptions/service-agreement/{serviceAgreementId}", localVarUriVariables);

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

        ParameterizedTypeReference<SubscriptionResponse> localVarReturnType = new ParameterizedTypeReference<SubscriptionResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get users under SA with their permission set
     * No description available
     * <p><b>200</b> - list of users with their job roles
     * @param subscriptionId get list of job roles for each user (required)
     * @param cardIds  (required)
     * @return List&lt;UserJobRoles&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UserJobRoles> getUsersWithJobRoles(String subscriptionId, CardIds cardIds) throws RestClientException {
        return getUsersWithJobRolesWithHttpInfo(subscriptionId, cardIds).getBody();
    }

    /**
     * Get users under SA with their permission set
     * No description available
     * <p><b>200</b> - list of users with their job roles
     * @param subscriptionId get list of job roles for each user (required)
     * @param cardIds  (required)
     * @return ResponseEntity&lt;List&lt;UserJobRoles&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UserJobRoles>> getUsersWithJobRolesWithHttpInfo(String subscriptionId, CardIds cardIds) throws RestClientException {
        Object localVarPostBody = cardIds;
        
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionId' when calling getUsersWithJobRoles");
        }
        
        // verify the required parameter 'cardIds' is set
        if (cardIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cardIds' when calling getUsersWithJobRoles");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("subscriptionId", subscriptionId);
        String localVarPath = apiClient.expandPath("/client-api/v2/subscriptions/{subscriptionId}/unassing-job-roles", localVarUriVariables);

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

        ParameterizedTypeReference<List<UserJobRoles>> localVarReturnType = new ParameterizedTypeReference<List<UserJobRoles>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Resiliate subscription
     * Resiliate subscription
     * <p><b>200</b> - subscription resiliated successfully
     * <p><b>404</b> - legal entity not found
     * @param resiliationPutRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void resiliateSubscription(ResiliationPutRequest resiliationPutRequest) throws RestClientException {
        resiliateSubscriptionWithHttpInfo(resiliationPutRequest);
    }

    /**
     * Resiliate subscription
     * Resiliate subscription
     * <p><b>200</b> - subscription resiliated successfully
     * <p><b>404</b> - legal entity not found
     * @param resiliationPutRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> resiliateSubscriptionWithHttpInfo(ResiliationPutRequest resiliationPutRequest) throws RestClientException {
        Object localVarPostBody = resiliationPutRequest;
        
        // verify the required parameter 'resiliationPutRequest' is set
        if (resiliationPutRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resiliationPutRequest' when calling resiliateSubscription");
        }
        
        String localVarPath = apiClient.expandPath("/client-api/v2/resiliate-subscription", Collections.<String, Object>emptyMap());

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
    /**
     * Retry subscription in case of failure
     * Retry subscription in case of failure
     * <p><b>200</b> - No description available
     * @param subscriptionId legal entity external id (required)
     * @return SubscriptionResponseBody
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionResponseBody retrySubscription(String subscriptionId) throws RestClientException {
        return retrySubscriptionWithHttpInfo(subscriptionId).getBody();
    }

    /**
     * Retry subscription in case of failure
     * Retry subscription in case of failure
     * <p><b>200</b> - No description available
     * @param subscriptionId legal entity external id (required)
     * @return ResponseEntity&lt;SubscriptionResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionResponseBody> retrySubscriptionWithHttpInfo(String subscriptionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionId' when calling retrySubscription");
        }
        
        String localVarPath = apiClient.expandPath("/client-api/v2/retry-subscription", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionId", subscriptionId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SubscriptionResponseBody> localVarReturnType = new ParameterizedTypeReference<SubscriptionResponseBody>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * update subscription
     * update subscription
     * <p><b>200</b> - subscription updated successfully
     * <p><b>400</b> - subscription not found
     * @param id  (required)
     * @param subscriptionRequestBody  (required)
     * @return SubscriptionResponseBody
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionResponseBody updateSubscriptionById(String id, SubscriptionRequestBody subscriptionRequestBody) throws RestClientException {
        return updateSubscriptionByIdWithHttpInfo(id, subscriptionRequestBody).getBody();
    }

    /**
     * update subscription
     * update subscription
     * <p><b>200</b> - subscription updated successfully
     * <p><b>400</b> - subscription not found
     * @param id  (required)
     * @param subscriptionRequestBody  (required)
     * @return ResponseEntity&lt;SubscriptionResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionResponseBody> updateSubscriptionByIdWithHttpInfo(String id, SubscriptionRequestBody subscriptionRequestBody) throws RestClientException {
        Object localVarPostBody = subscriptionRequestBody;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateSubscriptionById");
        }
        
        // verify the required parameter 'subscriptionRequestBody' is set
        if (subscriptionRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionRequestBody' when calling updateSubscriptionById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/client-api/v2/subscriptions/{id}", localVarUriVariables);

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

        ParameterizedTypeReference<SubscriptionResponseBody> localVarReturnType = new ParameterizedTypeReference<SubscriptionResponseBody>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
