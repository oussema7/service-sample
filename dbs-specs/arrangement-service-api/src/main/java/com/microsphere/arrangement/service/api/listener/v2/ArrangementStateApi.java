package com.microsphere.arrangement.service.api.listener.v2;

import com.microsphere.arrangement.service.api.listener.ApiClient;

import com.microsphere.arrangement.service.api.listener.v2.model.AccountStateItem;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountStateItemId;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountStateListResponse;
import com.microsphere.arrangement.service.api.listener.v2.model.BadRequestError;
import com.microsphere.arrangement.service.api.listener.v2.model.InternalServerError;
import com.microsphere.arrangement.service.api.listener.v2.model.NotFoundError;

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

@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
@Component("com.microsphere.arrangement.service.api.listener.v2.ArrangementStateApi")

public class ArrangementStateApi {
    private final ApiClient apiClient;


    @Autowired
    public ArrangementStateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * 
     * Retrieve list of arrangement states
     * <p><b>200</b> - Retrieve all arrangement states from database based on filtering params
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param externalStateIds The external state ids (optional, default to new ArrayList&lt;&gt;())
     * @param stateIds The state ids (optional, default to new ArrayList&lt;&gt;())
     * @param state The state name (optional)
     * @return AccountStateListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountStateListResponse getArrangementState(List<String> externalStateIds, List<Integer> stateIds, String state) throws RestClientException {
        return getArrangementStateWithHttpInfo(externalStateIds, stateIds, state).getBody();
    }

    /**
     * 
     * Retrieve list of arrangement states
     * <p><b>200</b> - Retrieve all arrangement states from database based on filtering params
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param externalStateIds The external state ids (optional, default to new ArrayList&lt;&gt;())
     * @param stateIds The state ids (optional, default to new ArrayList&lt;&gt;())
     * @param state The state name (optional)
     * @return ResponseEntity&lt;AccountStateListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountStateListResponse> getArrangementStateWithHttpInfo(List<String> externalStateIds, List<Integer> stateIds, String state) throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangement-state", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "externalStateIds", externalStateIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "stateIds", stateIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "state", state));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AccountStateListResponse> localVarReturnType = new ParameterizedTypeReference<AccountStateListResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Endpoint for inserting a new state into database.
     * <p><b>201</b> - Indication that the state was created successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param accountStateItem  (required)
     * @return AccountStateItemId
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountStateItemId postArrangementState(AccountStateItem accountStateItem) throws RestClientException {
        return postArrangementStateWithHttpInfo(accountStateItem).getBody();
    }

    /**
     * 
     * Endpoint for inserting a new state into database.
     * <p><b>201</b> - Indication that the state was created successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param accountStateItem  (required)
     * @return ResponseEntity&lt;AccountStateItemId&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountStateItemId> postArrangementStateWithHttpInfo(AccountStateItem accountStateItem) throws RestClientException {
        Object localVarPostBody = accountStateItem;
        
        // verify the required parameter 'accountStateItem' is set
        if (accountStateItem == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountStateItem' when calling postArrangementState");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangement-state", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<AccountStateItemId> localVarReturnType = new ParameterizedTypeReference<AccountStateItemId>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Endpoint for updating state into database.
     * <p><b>204</b> - Indication that the state was updated successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param accountStateItem  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putArrangementState(AccountStateItem accountStateItem) throws RestClientException {
        putArrangementStateWithHttpInfo(accountStateItem);
    }

    /**
     * 
     * Endpoint for updating state into database.
     * <p><b>204</b> - Indication that the state was updated successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param accountStateItem  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putArrangementStateWithHttpInfo(AccountStateItem accountStateItem) throws RestClientException {
        Object localVarPostBody = accountStateItem;
        
        // verify the required parameter 'accountStateItem' is set
        if (accountStateItem == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountStateItem' when calling putArrangementState");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangement-state", Collections.<String, Object>emptyMap());

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
