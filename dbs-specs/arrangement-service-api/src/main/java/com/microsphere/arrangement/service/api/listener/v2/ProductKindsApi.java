package com.microsphere.arrangement.service.api.listener.v2;

import com.microsphere.arrangement.service.api.listener.ApiClient;

import com.microsphere.arrangement.service.api.listener.v2.model.AccountProductKindId;
import com.microsphere.arrangement.service.api.listener.v2.model.BadRequestError;
import com.microsphere.arrangement.service.api.listener.v2.model.ExternalProductKindItemExtended;
import com.microsphere.arrangement.service.api.listener.v2.model.ExternalProductKindItemPut;
import com.microsphere.arrangement.service.api.listener.v2.model.InternalServerError;
import com.microsphere.arrangement.service.api.listener.v2.model.NotFoundError;
import com.microsphere.arrangement.service.api.listener.v2.model.ProductKindsResult;

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
@Component("com.microsphere.arrangement.service.api.listener.v2.ProductKindsApi")

public class ProductKindsApi {
    private final ApiClient apiClient;


    @Autowired
    public ProductKindsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * 
     * Endpoint for getting a list of product kinds
     * <p><b>200</b> - Get product kinds. Retrieves product kinds from database based on search criteria
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param externalKindIds The external kind ids (optional, default to new ArrayList&lt;&gt;())
     * @param kindName The product kind name (optional)
     * @param kindUri The uri path to the specific product kind, which can be used by banks that require it (optional)
     * @return ProductKindsResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProductKindsResult getProductKinds(List<String> externalKindIds, String kindName, String kindUri) throws RestClientException {
        return getProductKindsWithHttpInfo(externalKindIds, kindName, kindUri).getBody();
    }

    /**
     * 
     * Endpoint for getting a list of product kinds
     * <p><b>200</b> - Get product kinds. Retrieves product kinds from database based on search criteria
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param externalKindIds The external kind ids (optional, default to new ArrayList&lt;&gt;())
     * @param kindName The product kind name (optional)
     * @param kindUri The uri path to the specific product kind, which can be used by banks that require it (optional)
     * @return ResponseEntity&lt;ProductKindsResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProductKindsResult> getProductKindsWithHttpInfo(List<String> externalKindIds, String kindName, String kindUri) throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/product-kinds", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "externalKindIds", externalKindIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "kindName", kindName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "kindUri", kindUri));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ProductKindsResult> localVarReturnType = new ParameterizedTypeReference<ProductKindsResult>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Endpoint for inserting a new product kind into database.  Product kinds will be static, This endpoint is not functional if microsphere.arrangement.product-kinds.use-db is set to false.
     * <p><b>201</b> - Indication that the Product Kind was created successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param externalProductKindItemExtended  (required)
     * @return AccountProductKindId
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public AccountProductKindId postProductKinds(ExternalProductKindItemExtended externalProductKindItemExtended) throws RestClientException {
        return postProductKindsWithHttpInfo(externalProductKindItemExtended).getBody();
    }

    /**
     * 
     * Endpoint for inserting a new product kind into database.  Product kinds will be static, This endpoint is not functional if microsphere.arrangement.product-kinds.use-db is set to false.
     * <p><b>201</b> - Indication that the Product Kind was created successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param externalProductKindItemExtended  (required)
     * @return ResponseEntity&lt;AccountProductKindId&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<AccountProductKindId> postProductKindsWithHttpInfo(ExternalProductKindItemExtended externalProductKindItemExtended) throws RestClientException {
        Object localVarPostBody = externalProductKindItemExtended;
        
        // verify the required parameter 'externalProductKindItemExtended' is set
        if (externalProductKindItemExtended == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalProductKindItemExtended' when calling postProductKinds");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/product-kinds", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<AccountProductKindId> localVarReturnType = new ParameterizedTypeReference<AccountProductKindId>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Endpoint for updating product kind into database. Product kinds will be static, This endpoint is not functional if microsphere.arrangement.product-kinds.use-db is set to false.
     * <p><b>201</b> - Product kind updated
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param externalProductKindItemPut  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public void putProductKinds(ExternalProductKindItemPut externalProductKindItemPut) throws RestClientException {
        putProductKindsWithHttpInfo(externalProductKindItemPut);
    }

    /**
     * 
     * Endpoint for updating product kind into database. Product kinds will be static, This endpoint is not functional if microsphere.arrangement.product-kinds.use-db is set to false.
     * <p><b>201</b> - Product kind updated
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param externalProductKindItemPut  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<Void> putProductKindsWithHttpInfo(ExternalProductKindItemPut externalProductKindItemPut) throws RestClientException {
        Object localVarPostBody = externalProductKindItemPut;
        
        // verify the required parameter 'externalProductKindItemPut' is set
        if (externalProductKindItemPut == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalProductKindItemPut' when calling putProductKinds");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/product-kinds", Collections.<String, Object>emptyMap());

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
