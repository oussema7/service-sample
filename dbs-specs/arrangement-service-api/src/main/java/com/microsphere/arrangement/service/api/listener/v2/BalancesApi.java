package com.microsphere.arrangement.service.api.listener.v2;

import com.microsphere.arrangement.service.api.listener.ApiClient;

import com.microsphere.arrangement.service.api.listener.v2.model.AggregatedBalances;
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
@Component("com.microsphere.arrangement.service.api.listener.v2.BalancesApi")

public class BalancesApi {
    private final ApiClient apiClient;


    @Autowired
    public BalancesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * 
     * Retrieve aggregated balances
     * <p><b>200</b> - List of aggregated balances
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param productKindIds Filters arrangements by given product kind ids and aggregates their balances. Internal ids for product kinds were deprecated. Use externalProductKindIds instead. (optional, default to new ArrayList&lt;&gt;())
     * @param externalProductKindIds Filters arrangements by given external product kind ids and aggregates their balances (optional, default to new ArrayList&lt;&gt;())
     * @param groupedBy Groups arrangements by id of given parameter and aggregates their balances If it is empty, then it aggregates balances for all arrangements  (optional)
     * @return List&lt;AggregatedBalances&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AggregatedBalances> getAggregations(List<Integer> productKindIds, List<String> externalProductKindIds, String groupedBy) throws RestClientException {
        return getAggregationsWithHttpInfo(productKindIds, externalProductKindIds, groupedBy).getBody();
    }

    /**
     * 
     * Retrieve aggregated balances
     * <p><b>200</b> - List of aggregated balances
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param productKindIds Filters arrangements by given product kind ids and aggregates their balances. Internal ids for product kinds were deprecated. Use externalProductKindIds instead. (optional, default to new ArrayList&lt;&gt;())
     * @param externalProductKindIds Filters arrangements by given external product kind ids and aggregates their balances (optional, default to new ArrayList&lt;&gt;())
     * @param groupedBy Groups arrangements by id of given parameter and aggregates their balances If it is empty, then it aggregates balances for all arrangements  (optional)
     * @return ResponseEntity&lt;List&lt;AggregatedBalances&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AggregatedBalances>> getAggregationsWithHttpInfo(List<Integer> productKindIds, List<String> externalProductKindIds, String groupedBy) throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/balances/aggregations", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "productKindIds", productKindIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "externalProductKindIds", externalProductKindIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupedBy", groupedBy));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<AggregatedBalances>> localVarReturnType = new ParameterizedTypeReference<List<AggregatedBalances>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
