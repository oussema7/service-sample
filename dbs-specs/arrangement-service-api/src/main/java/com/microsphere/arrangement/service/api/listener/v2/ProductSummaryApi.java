package com.microsphere.arrangement.service.api.listener.v2;

import com.microsphere.arrangement.service.api.listener.ApiClient;

import com.microsphere.arrangement.service.api.listener.v2.model.BadRequestError;
import com.microsphere.arrangement.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.arrangement.service.api.listener.v2.model.InternalServerError;
import com.microsphere.arrangement.service.api.listener.v2.model.OrderByField;
import com.microsphere.arrangement.service.api.listener.v2.model.ProductSummaryItem;
import com.microsphere.arrangement.service.api.listener.v2.model.SortDirection;

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
@Component("com.microsphere.arrangement.service.api.listener.v2.ProductSummaryApi")

public class ProductSummaryApi {
    private final ApiClient apiClient;


    @Autowired
    public ProductSummaryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * 
     * Get a list of arrangements according to a given business function
     * <p><b>200</b> - Product summary by legal entity id. Initial call to retrieve the paginated list of product summary by legal entity id.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - InternalServerError
     * @param businessFunction Provide comma separated contexts for retrieving arrangements (required)
     * @param resourceName Provide the resource for retrieving arrangements (required)
     * @param privilege Privilege for the arrangements (required)
     * @param withLatestBalances Retrieve a list of arrangements with the latest balances (optional, default to true)
     * @param maskIndicator Masked/Unmasked card number (optional)
     * @param debitAccount Type of account (optional)
     * @param creditAccount Type of account (optional)
     * @param externalTransferAllowed Privilege for external transfers (optional)
     * @param productKindName Product Kind Name (optional)
     * @param legalEntityIds A list of legal entities ids to filter by (optional, default to new ArrayList&lt;&gt;())
     * @param sourceId identifies the system, either internal or external, that keeps records of the arrangement. (optional)
     * @param favorite Indicates whether an arrangement is favorite for a user or not (optional)
     * @param searchTerm Full text search (optional)
     * @param customOrder Parameter that identifies whether the returned list should be ordered by custom order/grouping (optional)
     * @param favoriteFirst Parameter that sets favorite arrangements on top when true (optional, default to false)
     * @param hasParent Parameter that filters out arrangements where parentId is not null (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from. (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @param orderBy Order by field (optional, default to new ArrayList&lt;&gt;())
     * @param direction Direction (optional, default to DESC)
     * @param contentLanguage Defines the translation natural language as specified in ISO 639-1, and territory two-letter form of ISO 3166. (optional)
     * @return List&lt;ProductSummaryItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ProductSummaryItem> getArrangementsByBusinessFunction(String businessFunction, String resourceName, String privilege, Boolean withLatestBalances, Boolean maskIndicator, Boolean debitAccount, Boolean creditAccount, Boolean externalTransferAllowed, String productKindName, List<String> legalEntityIds, String sourceId, Boolean favorite, String searchTerm, Boolean customOrder, Boolean favoriteFirst, Boolean hasParent, Integer from, String cursor, Integer size, List<OrderByField> orderBy, SortDirection direction, String contentLanguage) throws RestClientException {
        return getArrangementsByBusinessFunctionWithHttpInfo(businessFunction, resourceName, privilege, withLatestBalances, maskIndicator, debitAccount, creditAccount, externalTransferAllowed, productKindName, legalEntityIds, sourceId, favorite, searchTerm, customOrder, favoriteFirst, hasParent, from, cursor, size, orderBy, direction, contentLanguage).getBody();
    }

    /**
     * 
     * Get a list of arrangements according to a given business function
     * <p><b>200</b> - Product summary by legal entity id. Initial call to retrieve the paginated list of product summary by legal entity id.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - InternalServerError
     * @param businessFunction Provide comma separated contexts for retrieving arrangements (required)
     * @param resourceName Provide the resource for retrieving arrangements (required)
     * @param privilege Privilege for the arrangements (required)
     * @param withLatestBalances Retrieve a list of arrangements with the latest balances (optional, default to true)
     * @param maskIndicator Masked/Unmasked card number (optional)
     * @param debitAccount Type of account (optional)
     * @param creditAccount Type of account (optional)
     * @param externalTransferAllowed Privilege for external transfers (optional)
     * @param productKindName Product Kind Name (optional)
     * @param legalEntityIds A list of legal entities ids to filter by (optional, default to new ArrayList&lt;&gt;())
     * @param sourceId identifies the system, either internal or external, that keeps records of the arrangement. (optional)
     * @param favorite Indicates whether an arrangement is favorite for a user or not (optional)
     * @param searchTerm Full text search (optional)
     * @param customOrder Parameter that identifies whether the returned list should be ordered by custom order/grouping (optional)
     * @param favoriteFirst Parameter that sets favorite arrangements on top when true (optional, default to false)
     * @param hasParent Parameter that filters out arrangements where parentId is not null (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from. (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @param orderBy Order by field (optional, default to new ArrayList&lt;&gt;())
     * @param direction Direction (optional, default to DESC)
     * @param contentLanguage Defines the translation natural language as specified in ISO 639-1, and territory two-letter form of ISO 3166. (optional)
     * @return ResponseEntity&lt;List&lt;ProductSummaryItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ProductSummaryItem>> getArrangementsByBusinessFunctionWithHttpInfo(String businessFunction, String resourceName, String privilege, Boolean withLatestBalances, Boolean maskIndicator, Boolean debitAccount, Boolean creditAccount, Boolean externalTransferAllowed, String productKindName, List<String> legalEntityIds, String sourceId, Boolean favorite, String searchTerm, Boolean customOrder, Boolean favoriteFirst, Boolean hasParent, Integer from, String cursor, Integer size, List<OrderByField> orderBy, SortDirection direction, String contentLanguage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'businessFunction' is set
        if (businessFunction == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessFunction' when calling getArrangementsByBusinessFunction");
        }
        
        // verify the required parameter 'resourceName' is set
        if (resourceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resourceName' when calling getArrangementsByBusinessFunction");
        }
        
        // verify the required parameter 'privilege' is set
        if (privilege == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'privilege' when calling getArrangementsByBusinessFunction");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/productsummary/context/arrangements", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "withLatestBalances", withLatestBalances));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maskIndicator", maskIndicator));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "debitAccount", debitAccount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "creditAccount", creditAccount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "businessFunction", businessFunction));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "resourceName", resourceName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "privilege", privilege));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "externalTransferAllowed", externalTransferAllowed));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "productKindName", productKindName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "legalEntityIds", legalEntityIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sourceId", sourceId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "favorite", favorite));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "searchTerm", searchTerm));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "customOrder", customOrder));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "favoriteFirst", favoriteFirst));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "hasParent", hasParent));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "orderBy", orderBy));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "direction", direction));

        if (contentLanguage != null)
        localVarHeaderParams.add("Content-Language", apiClient.parameterToString(contentLanguage));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ProductSummaryItem>> localVarReturnType = new ParameterizedTypeReference<List<ProductSummaryItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
