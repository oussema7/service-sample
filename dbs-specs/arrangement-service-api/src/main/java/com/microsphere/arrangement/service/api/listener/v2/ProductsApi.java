package com.microsphere.arrangement.service.api.listener.v2;

import com.microsphere.arrangement.service.api.listener.ApiClient;

import com.microsphere.arrangement.service.api.listener.v2.model.AccountProductId;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountProductItem;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountSchemasProductItem;
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
@Component("com.microsphere.arrangement.service.api.listener.v2.ProductsApi")

public class ProductsApi {
    private final ApiClient apiClient;


    @Autowired
    public ProductsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * 
     * Retrieve a single product.
     * <p><b>200</b> - Get Product by Id. Single Products retrieved from DBS by id
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param id product id (required)
     * @return AccountProductItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountProductItem getProductById(String id) throws RestClientException {
        return getProductByIdWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Retrieve a single product.
     * <p><b>200</b> - Get Product by Id. Single Products retrieved from DBS by id
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param id product id (required)
     * @return ResponseEntity&lt;AccountProductItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountProductItem> getProductByIdWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getProductById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/products/{id}", localVarUriVariables);

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

        ParameterizedTypeReference<AccountProductItem> localVarReturnType = new ParameterizedTypeReference<AccountProductItem>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Get a list of product
     * <p><b>200</b> - Initial call to retrieve the catalogue list.
     * <p><b>400</b> - BadRequest
     * <p><b>500</b> - InternalServerError
     * @param externalProductsIds An array of external products ids (optional, default to new ArrayList&lt;&gt;())
     * @param productKindName Product kind name (optional)
     * @return List&lt;AccountSchemasProductItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccountSchemasProductItem> getProducts(List<String> externalProductsIds, String productKindName) throws RestClientException {
        return getProductsWithHttpInfo(externalProductsIds, productKindName).getBody();
    }

    /**
     * 
     * Get a list of product
     * <p><b>200</b> - Initial call to retrieve the catalogue list.
     * <p><b>400</b> - BadRequest
     * <p><b>500</b> - InternalServerError
     * @param externalProductsIds An array of external products ids (optional, default to new ArrayList&lt;&gt;())
     * @param productKindName Product kind name (optional)
     * @return ResponseEntity&lt;List&lt;AccountSchemasProductItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AccountSchemasProductItem>> getProductsWithHttpInfo(List<String> externalProductsIds, String productKindName) throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/products", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "externalProductsIds", externalProductsIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "productKindName", productKindName));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<AccountSchemasProductItem>> localVarReturnType = new ParameterizedTypeReference<List<AccountSchemasProductItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Create product
     * <p><b>201</b> - New Product created successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param accountProductItem  (required)
     * @return AccountProductId
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountProductId postProducts(AccountProductItem accountProductItem) throws RestClientException {
        return postProductsWithHttpInfo(accountProductItem).getBody();
    }

    /**
     * 
     * Create product
     * <p><b>201</b> - New Product created successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param accountProductItem  (required)
     * @return ResponseEntity&lt;AccountProductId&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountProductId> postProductsWithHttpInfo(AccountProductItem accountProductItem) throws RestClientException {
        Object localVarPostBody = accountProductItem;
        
        // verify the required parameter 'accountProductItem' is set
        if (accountProductItem == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountProductItem' when calling postProducts");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/products", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<AccountProductId> localVarReturnType = new ParameterizedTypeReference<AccountProductId>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     *  Product       This JMS EndPoint allows updating of Business/Retail banking products     Acceptable values for productKindName are:         \&quot;Current Account\&quot;,         \&quot;Credit Card\&quot;,         \&quot;Debit Card\&quot;,         \&quot;Loan\&quot;,         \&quot;Savings Account\&quot;,         \&quot;Investment Account\&quot;,         \&quot;Term Deposit\&quot;
     * <p><b>204</b> - Indicates successful update of a product
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param accountProductItem Update product (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putProducts(AccountProductItem accountProductItem) throws RestClientException {
        putProductsWithHttpInfo(accountProductItem);
    }

    /**
     * 
     *  Product       This JMS EndPoint allows updating of Business/Retail banking products     Acceptable values for productKindName are:         \&quot;Current Account\&quot;,         \&quot;Credit Card\&quot;,         \&quot;Debit Card\&quot;,         \&quot;Loan\&quot;,         \&quot;Savings Account\&quot;,         \&quot;Investment Account\&quot;,         \&quot;Term Deposit\&quot;
     * <p><b>204</b> - Indicates successful update of a product
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param accountProductItem Update product (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putProductsWithHttpInfo(AccountProductItem accountProductItem) throws RestClientException {
        Object localVarPostBody = accountProductItem;
        
        // verify the required parameter 'accountProductItem' is set
        if (accountProductItem == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountProductItem' when calling putProducts");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/products", Collections.<String, Object>emptyMap());

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
