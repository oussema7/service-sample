package com.microsphere.arrangement.service.api.listener.v2;

import com.microsphere.arrangement.service.api.listener.ApiClient;

import com.microsphere.arrangement.service.api.listener.v2.model.BadRequestError;
import com.microsphere.arrangement.service.api.listener.v2.model.BalanceHistoryFilterRequest;
import com.microsphere.arrangement.service.api.listener.v2.model.BalanceHistoryFilterResponse;
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
@Component("com.microsphere.arrangement.service.api.listener.v2.BalanceHistoryApi")

public class BalanceHistoryApi {
    private final ApiClient apiClient;


    @Autowired
    public BalanceHistoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * 
     * Retrieve balance history items.
     * <p><b>200</b> - List of balance history
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param balanceHistoryFilterRequest  (required)
     * @return List&lt;BalanceHistoryFilterResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BalanceHistoryFilterResponse> postBalanceHistoryFilter(BalanceHistoryFilterRequest balanceHistoryFilterRequest) throws RestClientException {
        return postBalanceHistoryFilterWithHttpInfo(balanceHistoryFilterRequest).getBody();
    }

    /**
     * 
     * Retrieve balance history items.
     * <p><b>200</b> - List of balance history
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param balanceHistoryFilterRequest  (required)
     * @return ResponseEntity&lt;List&lt;BalanceHistoryFilterResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BalanceHistoryFilterResponse>> postBalanceHistoryFilterWithHttpInfo(BalanceHistoryFilterRequest balanceHistoryFilterRequest) throws RestClientException {
        Object localVarPostBody = balanceHistoryFilterRequest;
        
        // verify the required parameter 'balanceHistoryFilterRequest' is set
        if (balanceHistoryFilterRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'balanceHistoryFilterRequest' when calling postBalanceHistoryFilter");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/balance-history/filter", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<BalanceHistoryFilterResponse>> localVarReturnType = new ParameterizedTypeReference<List<BalanceHistoryFilterResponse>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
