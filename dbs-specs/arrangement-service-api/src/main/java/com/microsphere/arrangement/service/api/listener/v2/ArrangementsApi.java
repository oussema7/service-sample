package com.microsphere.arrangement.service.api.listener.v2;

import com.microsphere.arrangement.service.api.listener.ApiClient;

import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementAddedResponse;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementItem;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementItemPost;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementItemPut;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementItems;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementPutItem;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementsDeleteItem;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementsDeleteResponseItem;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementsFilter;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementsLegalEntities;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountBatchResponseItemExtended;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountExternalLegalEntityIds;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountInternalIdGetResponseBody;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountUserPreferencesItem;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountUserPreferencesItemPut;
import com.microsphere.arrangement.service.api.listener.v2.model.BadRequestError;
import com.microsphere.arrangement.service.api.listener.v2.model.CreateChildArrangement;
import com.microsphere.arrangement.service.api.listener.v2.model.CreateChildArrangementResult;
import com.microsphere.arrangement.service.api.listener.v2.model.DisplayAccountResponse;
import com.microsphere.arrangement.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.arrangement.service.api.listener.v2.model.InternalServerError;
import com.microsphere.arrangement.service.api.listener.v2.model.NotFoundError;
import com.microsphere.arrangement.service.api.listener.v2.model.Subscription;

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
@Component("com.microsphere.arrangement.service.api.listener.v2.ArrangementsApi")

public class ArrangementsApi {
    private final ApiClient apiClient;


    @Autowired
    public ArrangementsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * 
     * Add child arrangement. If productId is not defined, the service falls back to the mapping of parent-product-id to product-id.
     * <p><b>201</b> - New child arrangement created.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param arrangementId Arrangement Id (required)
     * @param createChildArrangement  (required)
     * @return CreateChildArrangementResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateChildArrangementResult addArrangementChild(String arrangementId, CreateChildArrangement createChildArrangement) throws RestClientException {
        return addArrangementChildWithHttpInfo(arrangementId, createChildArrangement).getBody();
    }

    /**
     * 
     * Add child arrangement. If productId is not defined, the service falls back to the mapping of parent-product-id to product-id.
     * <p><b>201</b> - New child arrangement created.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param arrangementId Arrangement Id (required)
     * @param createChildArrangement  (required)
     * @return ResponseEntity&lt;CreateChildArrangementResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateChildArrangementResult> addArrangementChildWithHttpInfo(String arrangementId, CreateChildArrangement createChildArrangement) throws RestClientException {
        Object localVarPostBody = createChildArrangement;
        
        // verify the required parameter 'arrangementId' is set
        if (arrangementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'arrangementId' when calling addArrangementChild");
        }
        
        // verify the required parameter 'createChildArrangement' is set
        if (createChildArrangement == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createChildArrangement' when calling addArrangementChild");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("arrangementId", arrangementId);
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/{arrangementId}/children", localVarUriVariables);

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

        ParameterizedTypeReference<CreateChildArrangementResult> localVarReturnType = new ParameterizedTypeReference<CreateChildArrangementResult>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Delegates &amp; transforms call (external ids are replaced by internal) from integration to pandp for removing legal entity from an existing arrangement. In the process if no legal entity or arrangement is found for the specified ids it will result in appropriate &#39;not found&#39; exception. Additionally, all validation constraints will be checked here and they will result in appropriate &#39;bad request&#39;.
     * <p><b>204</b> - Indicates successful removal of legal entities ids related to a specific arrangement.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param externalArrangementId external arrangement id (required)
     * @param accountExternalLegalEntityIds  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteArrangementLegalEntities(String externalArrangementId, AccountExternalLegalEntityIds accountExternalLegalEntityIds) throws RestClientException {
        deleteArrangementLegalEntitiesWithHttpInfo(externalArrangementId, accountExternalLegalEntityIds);
    }

    /**
     * 
     * Delegates &amp; transforms call (external ids are replaced by internal) from integration to pandp for removing legal entity from an existing arrangement. In the process if no legal entity or arrangement is found for the specified ids it will result in appropriate &#39;not found&#39; exception. Additionally, all validation constraints will be checked here and they will result in appropriate &#39;bad request&#39;.
     * <p><b>204</b> - Indicates successful removal of legal entities ids related to a specific arrangement.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param externalArrangementId external arrangement id (required)
     * @param accountExternalLegalEntityIds  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteArrangementLegalEntitiesWithHttpInfo(String externalArrangementId, AccountExternalLegalEntityIds accountExternalLegalEntityIds) throws RestClientException {
        Object localVarPostBody = accountExternalLegalEntityIds;
        
        // verify the required parameter 'externalArrangementId' is set
        if (externalArrangementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalArrangementId' when calling deleteArrangementLegalEntities");
        }
        
        // verify the required parameter 'accountExternalLegalEntityIds' is set
        if (accountExternalLegalEntityIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountExternalLegalEntityIds' when calling deleteArrangementLegalEntities");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("externalArrangementId", externalArrangementId);
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/{externalArrangementId}/legalentities", localVarUriVariables);

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
        return apiClient.invokeAPI(localVarPath, HttpMethod.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Delete Arrangement by external arrangement id.
     * <p><b>204</b> - Indicates successful delete on an arrangement.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param id External arrangement id (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public void deleteExternalArrangementId(String id) throws RestClientException {
        deleteExternalArrangementIdWithHttpInfo(id);
    }

    /**
     * 
     * Delete Arrangement by external arrangement id.
     * <p><b>204</b> - Indicates successful delete on an arrangement.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param id External arrangement id (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<Void> deleteExternalArrangementIdWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteExternalArrangementId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/{id}", localVarUriVariables);

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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Displays arrangements. Account number will be masked based on tha masking configuration.
     * <p><b>200</b> - List of arrangements
     * <p><b>400</b> - BadRequest
     * <p><b>500</b> - InternalServerError
     * @param arrangementIds List of arrangement identifiers (required)
     * @param userId The user identifier. This parameter is not used for filtering arrangements, but only for selecting user preferences from a specific user.  (optional)
     * @return List&lt;DisplayAccountResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<DisplayAccountResponse> displayArrangements(List<String> arrangementIds, String userId) throws RestClientException {
        return displayArrangementsWithHttpInfo(arrangementIds, userId).getBody();
    }

    /**
     * 
     * Displays arrangements. Account number will be masked based on tha masking configuration.
     * <p><b>200</b> - List of arrangements
     * <p><b>400</b> - BadRequest
     * <p><b>500</b> - InternalServerError
     * @param arrangementIds List of arrangement identifiers (required)
     * @param userId The user identifier. This parameter is not used for filtering arrangements, but only for selecting user preferences from a specific user.  (optional)
     * @return ResponseEntity&lt;List&lt;DisplayAccountResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<DisplayAccountResponse>> displayArrangementsWithHttpInfo(List<String> arrangementIds, String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'arrangementIds' is set
        if (arrangementIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'arrangementIds' when calling displayArrangements");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/display", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "arrangementIds", arrangementIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<DisplayAccountResponse>> localVarReturnType = new ParameterizedTypeReference<List<DisplayAccountResponse>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Retrieve a single arrangement with details.
     * <p><b>200</b> - Single Arrangement with details retrieved by internal arrangement ID
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param id Internal arrangement id (required)
     * @param includeSubscriptions Indicates whether to include subscriptions in the result or not (optional, default to false)
     * @return AccountArrangementItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountArrangementItem getArrangementById(String id, Boolean includeSubscriptions) throws RestClientException {
        return getArrangementByIdWithHttpInfo(id, includeSubscriptions).getBody();
    }

    /**
     * 
     * Retrieve a single arrangement with details.
     * <p><b>200</b> - Single Arrangement with details retrieved by internal arrangement ID
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param id Internal arrangement id (required)
     * @param includeSubscriptions Indicates whether to include subscriptions in the result or not (optional, default to false)
     * @return ResponseEntity&lt;AccountArrangementItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountArrangementItem> getArrangementByIdWithHttpInfo(String id, Boolean includeSubscriptions) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getArrangementById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/{id}", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeSubscriptions", includeSubscriptions));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AccountArrangementItem> localVarReturnType = new ParameterizedTypeReference<AccountArrangementItem>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Get a list of arrangements with a corresponding product from pandp service based on query of provided IBAN (note: only one arrangement is returned for IBAN), an array of arrangements ids or an array of external arrangements ids
     * <p><b>200</b> - List of arrangement items
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param iban The IBAN is an internationally agreed system of identifying bank accounts across national borders. (optional)
     * @param arrangementIds A list of internal arrangements ids (optional, default to new ArrayList&lt;&gt;())
     * @param externalArrangementIds A list of external arrangements ids (optional, default to new ArrayList&lt;&gt;())
     * @return AccountArrangementItems
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountArrangementItems getArrangements(String iban, List<String> arrangementIds, List<String> externalArrangementIds) throws RestClientException {
        return getArrangementsWithHttpInfo(iban, arrangementIds, externalArrangementIds).getBody();
    }

    /**
     * 
     * Get a list of arrangements with a corresponding product from pandp service based on query of provided IBAN (note: only one arrangement is returned for IBAN), an array of arrangements ids or an array of external arrangements ids
     * <p><b>200</b> - List of arrangement items
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param iban The IBAN is an internationally agreed system of identifying bank accounts across national borders. (optional)
     * @param arrangementIds A list of internal arrangements ids (optional, default to new ArrayList&lt;&gt;())
     * @param externalArrangementIds A list of external arrangements ids (optional, default to new ArrayList&lt;&gt;())
     * @return ResponseEntity&lt;AccountArrangementItems&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountArrangementItems> getArrangementsWithHttpInfo(String iban, List<String> arrangementIds, List<String> externalArrangementIds) throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "iban", iban));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "arrangementIds", arrangementIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "externalArrangementIds", externalArrangementIds));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AccountArrangementItems> localVarReturnType = new ParameterizedTypeReference<AccountArrangementItems>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Retrieves non deleted arrangement ids with legal entity ids for given legal entity ids and arrangement ids
     * <p><b>200</b> - Return arrangement ids with legalentity ids
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param arrangementIds A list of internal arrangements ids (required)
     * @param legalEntityIds A list of internal legalEntity ids (required)
     * @return AccountArrangementsLegalEntities
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountArrangementsLegalEntities getArrangementsLegalEntities(List<String> arrangementIds, List<String> legalEntityIds) throws RestClientException {
        return getArrangementsLegalEntitiesWithHttpInfo(arrangementIds, legalEntityIds).getBody();
    }

    /**
     * 
     * Retrieves non deleted arrangement ids with legal entity ids for given legal entity ids and arrangement ids
     * <p><b>200</b> - Return arrangement ids with legalentity ids
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param arrangementIds A list of internal arrangements ids (required)
     * @param legalEntityIds A list of internal legalEntity ids (required)
     * @return ResponseEntity&lt;AccountArrangementsLegalEntities&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountArrangementsLegalEntities> getArrangementsLegalEntitiesWithHttpInfo(List<String> arrangementIds, List<String> legalEntityIds) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'arrangementIds' is set
        if (arrangementIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'arrangementIds' when calling getArrangementsLegalEntities");
        }
        
        // verify the required parameter 'legalEntityIds' is set
        if (legalEntityIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalEntityIds' when calling getArrangementsLegalEntities");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/legalentities", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "arrangementIds", arrangementIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "legalEntityIds", legalEntityIds));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AccountArrangementsLegalEntities> localVarReturnType = new ParameterizedTypeReference<AccountArrangementsLegalEntities>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * JMS endpoint for getting arrangements with live balances for the provided list of pair BBAN and bankBranchCode
     * <p><b>200</b> - List of arrangements with live balances
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param identifiersPairs A json list of identifiers. Currently the pair consists of BBAN and bankBranchCode (required)
     * @return AccountArrangementItems
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountArrangementItems getArrangementsWithLiveBalances(String identifiersPairs) throws RestClientException {
        return getArrangementsWithLiveBalancesWithHttpInfo(identifiersPairs).getBody();
    }

    /**
     * 
     * JMS endpoint for getting arrangements with live balances for the provided list of pair BBAN and bankBranchCode
     * <p><b>200</b> - List of arrangements with live balances
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param identifiersPairs A json list of identifiers. Currently the pair consists of BBAN and bankBranchCode (required)
     * @return ResponseEntity&lt;AccountArrangementItems&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountArrangementItems> getArrangementsWithLiveBalancesWithHttpInfo(String identifiersPairs) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'identifiersPairs' is set
        if (identifiersPairs == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identifiersPairs' when calling getArrangementsWithLiveBalances");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/withLiveBalances", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "identifiersPairs", identifiersPairs));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AccountArrangementItems> localVarReturnType = new ParameterizedTypeReference<AccountArrangementItems>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieve Internal Arrangement Id for External Id.
     * Retrieve Internal Arrangement Id for External Id.
     * <p><b>200</b> - Initial call to retrieve a internal id from the microsphere platform by External Id of the arrangement.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param externalId external id (required)
     * @return AccountInternalIdGetResponseBody
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountInternalIdGetResponseBody getInternalId(String externalId) throws RestClientException {
        return getInternalIdWithHttpInfo(externalId).getBody();
    }

    /**
     * Retrieve Internal Arrangement Id for External Id.
     * Retrieve Internal Arrangement Id for External Id.
     * <p><b>200</b> - Initial call to retrieve a internal id from the microsphere platform by External Id of the arrangement.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param externalId external id (required)
     * @return ResponseEntity&lt;AccountInternalIdGetResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountInternalIdGetResponseBody> getInternalIdWithHttpInfo(String externalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalId' when calling getInternalId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("externalId", externalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/internal/{externalId}", localVarUriVariables);

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

        ParameterizedTypeReference<AccountInternalIdGetResponseBody> localVarReturnType = new ParameterizedTypeReference<AccountInternalIdGetResponseBody>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Retrieve subscriptions from an existing arrangement by internal id.
     * <p><b>200</b> - List of arrangement subscriptions
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - InternalServerError
     * @param arrangementId Arrangement Id (required)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return List&lt;Subscription&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Subscription> getSubscriptions(String arrangementId, Integer from, Integer size) throws RestClientException {
        return getSubscriptionsWithHttpInfo(arrangementId, from, size).getBody();
    }

    /**
     * 
     * Retrieve subscriptions from an existing arrangement by internal id.
     * <p><b>200</b> - List of arrangement subscriptions
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - InternalServerError
     * @param arrangementId Arrangement Id (required)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return ResponseEntity&lt;List&lt;Subscription&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Subscription>> getSubscriptionsWithHttpInfo(String arrangementId, Integer from, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'arrangementId' is set
        if (arrangementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'arrangementId' when calling getSubscriptions");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("arrangementId", arrangementId);
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/{arrangementId}/subscriptions", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Subscription>> localVarReturnType = new ParameterizedTypeReference<List<Subscription>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Retrieve user defined preferences for arrangement id
     * <p><b>200</b> - The following user preferences for an arrangement have been retrieved from persistence layer: * favorite * bankAlias * visible
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param arrangementId No description available (required)
     * @param userId No description available (optional)
     * @param favorite Favorite flag (optional)
     * @return AccountUserPreferencesItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountUserPreferencesItem getUserPreferences(String arrangementId, String userId, Boolean favorite) throws RestClientException {
        return getUserPreferencesWithHttpInfo(arrangementId, userId, favorite).getBody();
    }

    /**
     * 
     * Retrieve user defined preferences for arrangement id
     * <p><b>200</b> - The following user preferences for an arrangement have been retrieved from persistence layer: * favorite * bankAlias * visible
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param arrangementId No description available (required)
     * @param userId No description available (optional)
     * @param favorite Favorite flag (optional)
     * @return ResponseEntity&lt;AccountUserPreferencesItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountUserPreferencesItem> getUserPreferencesWithHttpInfo(String arrangementId, String userId, Boolean favorite) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'arrangementId' is set
        if (arrangementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'arrangementId' when calling getUserPreferences");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/user-preferences", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "arrangementId", arrangementId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "favorite", favorite));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AccountUserPreferencesItem> localVarReturnType = new ParameterizedTypeReference<AccountUserPreferencesItem>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Delegates &amp; transforms call (external ids are replaced by internal) from integration to pandp for adding legal entity to an existing arrangement. In the process if no legal entity or arrangement is found for the specified ids it will result in appropriate &#39;not found&#39; exception. Additionally, all validation constraints will be checked here and they will result in appropriate &#39;bad request&#39;.
     * <p><b>204</b> - Indicates successful addition of legal entities ids related to a specific arrangement.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param externalArrangementId external arrangement id (required)
     * @param accountExternalLegalEntityIds  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postArrangementLegalEntities(String externalArrangementId, AccountExternalLegalEntityIds accountExternalLegalEntityIds) throws RestClientException {
        postArrangementLegalEntitiesWithHttpInfo(externalArrangementId, accountExternalLegalEntityIds);
    }

    /**
     * 
     * Delegates &amp; transforms call (external ids are replaced by internal) from integration to pandp for adding legal entity to an existing arrangement. In the process if no legal entity or arrangement is found for the specified ids it will result in appropriate &#39;not found&#39; exception. Additionally, all validation constraints will be checked here and they will result in appropriate &#39;bad request&#39;.
     * <p><b>204</b> - Indicates successful addition of legal entities ids related to a specific arrangement.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param externalArrangementId external arrangement id (required)
     * @param accountExternalLegalEntityIds  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postArrangementLegalEntitiesWithHttpInfo(String externalArrangementId, AccountExternalLegalEntityIds accountExternalLegalEntityIds) throws RestClientException {
        Object localVarPostBody = accountExternalLegalEntityIds;
        
        // verify the required parameter 'externalArrangementId' is set
        if (externalArrangementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalArrangementId' when calling postArrangementLegalEntities");
        }
        
        // verify the required parameter 'accountExternalLegalEntityIds' is set
        if (accountExternalLegalEntityIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountExternalLegalEntityIds' when calling postArrangementLegalEntities");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("externalArrangementId", externalArrangementId);
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/{externalArrangementId}/legalentities", localVarUriVariables);

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
     * 
     * Create a arrangement with external arrangement id and returns the internal arrangement id
     * <p><b>201</b> - Creating new Arrangement
     * <p><b>400</b> - BadRequest
     * <p><b>500</b> - InternalServerError
     * @param accountArrangementItemPost  (required)
     * @return AccountArrangementAddedResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountArrangementAddedResponse postArrangements(AccountArrangementItemPost accountArrangementItemPost) throws RestClientException {
        return postArrangementsWithHttpInfo(accountArrangementItemPost).getBody();
    }

    /**
     * 
     * Create a arrangement with external arrangement id and returns the internal arrangement id
     * <p><b>201</b> - Creating new Arrangement
     * <p><b>400</b> - BadRequest
     * <p><b>500</b> - InternalServerError
     * @param accountArrangementItemPost  (required)
     * @return ResponseEntity&lt;AccountArrangementAddedResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountArrangementAddedResponse> postArrangementsWithHttpInfo(AccountArrangementItemPost accountArrangementItemPost) throws RestClientException {
        Object localVarPostBody = accountArrangementItemPost;
        
        // verify the required parameter 'accountArrangementItemPost' is set
        if (accountArrangementItemPost == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountArrangementItemPost' when calling postArrangements");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<AccountArrangementAddedResponse> localVarReturnType = new ParameterizedTypeReference<AccountArrangementAddedResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Butch insert or update on arrangement by an arrangement id.
     * <p><b>207</b> - multiStatusExtended
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param accountArrangementItemPost  (required)
     * @return List&lt;AccountBatchResponseItemExtended&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccountBatchResponseItemExtended> postBatchUpsertArrangements(List<AccountArrangementItemPost> accountArrangementItemPost) throws RestClientException {
        return postBatchUpsertArrangementsWithHttpInfo(accountArrangementItemPost).getBody();
    }

    /**
     * 
     * Butch insert or update on arrangement by an arrangement id.
     * <p><b>207</b> - multiStatusExtended
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param accountArrangementItemPost  (required)
     * @return ResponseEntity&lt;List&lt;AccountBatchResponseItemExtended&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AccountBatchResponseItemExtended>> postBatchUpsertArrangementsWithHttpInfo(List<AccountArrangementItemPost> accountArrangementItemPost) throws RestClientException {
        Object localVarPostBody = accountArrangementItemPost;
        
        // verify the required parameter 'accountArrangementItemPost' is set
        if (accountArrangementItemPost == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountArrangementItemPost' when calling postBatchUpsertArrangements");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/batch", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<AccountBatchResponseItemExtended>> localVarReturnType = new ParameterizedTypeReference<List<AccountBatchResponseItemExtended>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Delete arrangements by internal or external ids
     * <p><b>200</b> - List of delete items used to identify the arrangements to be deleted
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - InternalServerError
     * @param accountArrangementsDeleteItem  (required)
     * @return List&lt;AccountArrangementsDeleteResponseItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccountArrangementsDeleteResponseItem> postDelete(List<AccountArrangementsDeleteItem> accountArrangementsDeleteItem) throws RestClientException {
        return postDeleteWithHttpInfo(accountArrangementsDeleteItem).getBody();
    }

    /**
     * 
     * Delete arrangements by internal or external ids
     * <p><b>200</b> - List of delete items used to identify the arrangements to be deleted
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - InternalServerError
     * @param accountArrangementsDeleteItem  (required)
     * @return ResponseEntity&lt;List&lt;AccountArrangementsDeleteResponseItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AccountArrangementsDeleteResponseItem>> postDeleteWithHttpInfo(List<AccountArrangementsDeleteItem> accountArrangementsDeleteItem) throws RestClientException {
        Object localVarPostBody = accountArrangementsDeleteItem;
        
        // verify the required parameter 'accountArrangementsDeleteItem' is set
        if (accountArrangementsDeleteItem == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountArrangementsDeleteItem' when calling postDelete");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/delete", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<AccountArrangementsDeleteResponseItem>> localVarReturnType = new ParameterizedTypeReference<List<AccountArrangementsDeleteResponseItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Arrangements retrieval mechanism with the following features: filters, searching, sorting and pagination.
     * <p><b>200</b> - Filters arrangements by given parameters
     * <p><b>400</b> - BadRequest
     * <p><b>500</b> - InternalServerError
     * @param accountArrangementsFilter Arrangements retrieval mechanism with the following features: filters, searching, sorting and pagination. (required)
     * @return AccountArrangementItems
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountArrangementItems postFilter(AccountArrangementsFilter accountArrangementsFilter) throws RestClientException {
        return postFilterWithHttpInfo(accountArrangementsFilter).getBody();
    }

    /**
     * 
     * Arrangements retrieval mechanism with the following features: filters, searching, sorting and pagination.
     * <p><b>200</b> - Filters arrangements by given parameters
     * <p><b>400</b> - BadRequest
     * <p><b>500</b> - InternalServerError
     * @param accountArrangementsFilter Arrangements retrieval mechanism with the following features: filters, searching, sorting and pagination. (required)
     * @return ResponseEntity&lt;AccountArrangementItems&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountArrangementItems> postFilterWithHttpInfo(AccountArrangementsFilter accountArrangementsFilter) throws RestClientException {
        Object localVarPostBody = accountArrangementsFilter;
        
        // verify the required parameter 'accountArrangementsFilter' is set
        if (accountArrangementsFilter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountArrangementsFilter' when calling postFilter");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/filter", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<AccountArrangementItems> localVarReturnType = new ParameterizedTypeReference<AccountArrangementItems>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * Update arrangement by an arrangement id.
     * <p><b>204</b> - Arrangement updated successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>500</b> - InternalServerError
     * @param id Arrangement id (required)
     * @param accountArrangementPutItem  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putArrangementById(String id, AccountArrangementPutItem accountArrangementPutItem) throws RestClientException {
        putArrangementByIdWithHttpInfo(id, accountArrangementPutItem);
    }

    /**
     * 
     * Update arrangement by an arrangement id.
     * <p><b>204</b> - Arrangement updated successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>500</b> - InternalServerError
     * @param id Arrangement id (required)
     * @param accountArrangementPutItem  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putArrangementByIdWithHttpInfo(String id, AccountArrangementPutItem accountArrangementPutItem) throws RestClientException {
        Object localVarPostBody = accountArrangementPutItem;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling putArrangementById");
        }
        
        // verify the required parameter 'accountArrangementPutItem' is set
        if (accountArrangementPutItem == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountArrangementPutItem' when calling putArrangementById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/{id}", localVarUriVariables);

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
    /**
     * 
     * Update arrangement by an arrangement id
     * <p><b>204</b> - Indicates successful update of an arrangement
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param accountArrangementItemPut  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putArrangements(AccountArrangementItemPut accountArrangementItemPut) throws RestClientException {
        putArrangementsWithHttpInfo(accountArrangementItemPut);
    }

    /**
     * 
     * Update arrangement by an arrangement id
     * <p><b>204</b> - Indicates successful update of an arrangement
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param accountArrangementItemPut  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putArrangementsWithHttpInfo(AccountArrangementItemPut accountArrangementItemPut) throws RestClientException {
        Object localVarPostBody = accountArrangementItemPut;
        
        // verify the required parameter 'accountArrangementItemPut' is set
        if (accountArrangementItemPut == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountArrangementItemPut' when calling putArrangements");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements", Collections.<String, Object>emptyMap());

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
    /**
     * 
     * Endpoint for updating the user preferences of the arrangement
     * <p><b>204</b> - User preferences are updated successfully
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param accountUserPreferencesItemPut  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putUserPreferences(AccountUserPreferencesItemPut accountUserPreferencesItemPut) throws RestClientException {
        putUserPreferencesWithHttpInfo(accountUserPreferencesItemPut);
    }

    /**
     * 
     * Endpoint for updating the user preferences of the arrangement
     * <p><b>204</b> - User preferences are updated successfully
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * <p><b>500</b> - InternalServerError
     * @param accountUserPreferencesItemPut  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putUserPreferencesWithHttpInfo(AccountUserPreferencesItemPut accountUserPreferencesItemPut) throws RestClientException {
        Object localVarPostBody = accountUserPreferencesItemPut;
        
        // verify the required parameter 'accountUserPreferencesItemPut' is set
        if (accountUserPreferencesItemPut == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountUserPreferencesItemPut' when calling putUserPreferences");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/arrangements/user-preferences", Collections.<String, Object>emptyMap());

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
