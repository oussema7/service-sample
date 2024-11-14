package com.microsphere.arrangement.service.api.listener.v2;

import com.microsphere.arrangement.service.api.listener.ApiClient;

import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementItem;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountBalanceItem;
import com.microsphere.arrangement.service.api.listener.v2.model.BadRequestError;
import com.microsphere.arrangement.service.api.listener.v2.model.BalanceHistoryAddRequest;
import com.microsphere.arrangement.service.api.listener.v2.model.BalanceHistoryAddResponse;
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
@Component("com.microsphere.arrangement.service.api.listener.v2.AccountsApi")

public class AccountsApi {
    private final ApiClient apiClient;


    @Autowired
    public AccountsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * 
     * Retrieve balance by the following parameter: arrangementIds - external
     * <p><b>200</b> - Balance items. Balance retrieved from the banks for the provided arrangement id
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param arrangementIds external arrangement ids (optional)
     * @return List&lt;AccountBalanceItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccountBalanceItem> getBalance(String arrangementIds) throws RestClientException {
        return getBalanceWithHttpInfo(arrangementIds).getBody();
    }

    /**
     * 
     * Retrieve balance by the following parameter: arrangementIds - external
     * <p><b>200</b> - Balance items. Balance retrieved from the banks for the provided arrangement id
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param arrangementIds external arrangement ids (optional)
     * @return ResponseEntity&lt;List&lt;AccountBalanceItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AccountBalanceItem>> getBalanceWithHttpInfo(String arrangementIds) throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accounts/balance", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "arrangementIds", arrangementIds));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<AccountBalanceItem>> localVarReturnType = new ParameterizedTypeReference<List<AccountBalanceItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Get a list of arrangement ids the user can make payments to
     * <p><b>200</b> - Recipient arrangements. Returns a list of Arrangements that are eligible to be recipients of a payment.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param arrangementId Internal arrangementId of the FROM account (required)
     * @return List&lt;AccountArrangementItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccountArrangementItem> getGetRecipientArrangements(String arrangementId) throws RestClientException {
        return getGetRecipientArrangementsWithHttpInfo(arrangementId).getBody();
    }

    /**
     * 
     * Get a list of arrangement ids the user can make payments to
     * <p><b>200</b> - Recipient arrangements. Returns a list of Arrangements that are eligible to be recipients of a payment.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param arrangementId Internal arrangementId of the FROM account (required)
     * @return ResponseEntity&lt;List&lt;AccountArrangementItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AccountArrangementItem>> getGetRecipientArrangementsWithHttpInfo(String arrangementId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'arrangementId' is set
        if (arrangementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'arrangementId' when calling getGetRecipientArrangements");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accounts/recipientArrangementIds", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "arrangementId", arrangementId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<AccountArrangementItem>> localVarReturnType = new ParameterizedTypeReference<List<AccountArrangementItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Supplements supplied balance history item with internal arrangement id and sends it to arrangement pandp service.
     * <p><b>201</b> - Indication of successful processing of balance history item and successful saving of balance history item
     * <p><b>400</b> - BadRequest
     * <p><b>500</b> - InternalServerError
     * @param balanceHistoryAddRequest  (required)
     * @return BalanceHistoryAddResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BalanceHistoryAddResponse postBalanceHistory(BalanceHistoryAddRequest balanceHistoryAddRequest) throws RestClientException {
        return postBalanceHistoryWithHttpInfo(balanceHistoryAddRequest).getBody();
    }

    /**
     * 
     * Supplements supplied balance history item with internal arrangement id and sends it to arrangement pandp service.
     * <p><b>201</b> - Indication of successful processing of balance history item and successful saving of balance history item
     * <p><b>400</b> - BadRequest
     * <p><b>500</b> - InternalServerError
     * @param balanceHistoryAddRequest  (required)
     * @return ResponseEntity&lt;BalanceHistoryAddResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BalanceHistoryAddResponse> postBalanceHistoryWithHttpInfo(BalanceHistoryAddRequest balanceHistoryAddRequest) throws RestClientException {
        Object localVarPostBody = balanceHistoryAddRequest;
        
        // verify the required parameter 'balanceHistoryAddRequest' is set
        if (balanceHistoryAddRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'balanceHistoryAddRequest' when calling postBalanceHistory");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accounts/balance-history", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<BalanceHistoryAddResponse> localVarReturnType = new ParameterizedTypeReference<BalanceHistoryAddResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
