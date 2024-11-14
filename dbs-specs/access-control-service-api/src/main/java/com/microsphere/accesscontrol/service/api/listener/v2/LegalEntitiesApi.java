package com.microsphere.accesscontrol.service.api.listener.v2;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;

import com.microsphere.accesscontrol.service.api.listener.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.BatchResponseItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.GetServiceAgreement;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntitiesBatchDelete;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityCreateItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityItemBase;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityItemId;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityPut;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityUpdateItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.NotFoundError;

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

@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
@Component("com.microsphere.accesscontrol.service.api.listener.v2.LegalEntitiesApi")

public class LegalEntitiesApi {
    private final ApiClient apiClient;


    @Autowired
    public LegalEntitiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Legal Entity by external id - &#x60;GET&#x60;.
     * # Legal Entity by external id - &#x60;GET&#x60;    Initial call to retrieve a Legal Entity from the microsphere platform with the given Legal Entity external reference.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.legalentity.routes.GetLegalEntityByExternalIdRoute  * Route Id: GetLegalEntityByExternalId  * Route source endpoint: direct:business.legalentities.GetLegalEntityByExternalId  * Route destination endpoint: direct:getLegalEntityByExternalIdRequestedInternal  
     * <p><b>200</b> - # Legal Entity by external id - &#x60;GET&#x60;    Initial call to retrieve a Legal Entity from the microsphere platform with the given Legal Entity external reference.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.legalentity.routes.GetLegalEntityByExternalIdRoute  * Route Id: GetLegalEntityByExternalId  * Route source endpoint: direct:business.legalentities.GetLegalEntityByExternalId  * Route destination endpoint: direct:getLegalEntityByExternalIdRequestedInternal  
     * <p><b>403</b> - # Reasons for getting HTTP status code 403:    * User does not have permissions to perform the action.    | Message | key |  | --- | --- |  | User does not have access to Manage Entitlements | entitlements.access.error.message.E_NOT_ACCESS  
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param externalId Legal Entity external ID (required)
     * @return LegalEntityItemBase
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LegalEntityItemBase getLegalEntityByExternalId(String externalId) throws RestClientException {
        return getLegalEntityByExternalIdWithHttpInfo(externalId).getBody();
    }

    /**
     * Legal Entity by external id - &#x60;GET&#x60;.
     * # Legal Entity by external id - &#x60;GET&#x60;    Initial call to retrieve a Legal Entity from the microsphere platform with the given Legal Entity external reference.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.legalentity.routes.GetLegalEntityByExternalIdRoute  * Route Id: GetLegalEntityByExternalId  * Route source endpoint: direct:business.legalentities.GetLegalEntityByExternalId  * Route destination endpoint: direct:getLegalEntityByExternalIdRequestedInternal  
     * <p><b>200</b> - # Legal Entity by external id - &#x60;GET&#x60;    Initial call to retrieve a Legal Entity from the microsphere platform with the given Legal Entity external reference.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.legalentity.routes.GetLegalEntityByExternalIdRoute  * Route Id: GetLegalEntityByExternalId  * Route source endpoint: direct:business.legalentities.GetLegalEntityByExternalId  * Route destination endpoint: direct:getLegalEntityByExternalIdRequestedInternal  
     * <p><b>403</b> - # Reasons for getting HTTP status code 403:    * User does not have permissions to perform the action.    | Message | key |  | --- | --- |  | User does not have access to Manage Entitlements | entitlements.access.error.message.E_NOT_ACCESS  
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param externalId Legal Entity external ID (required)
     * @return ResponseEntity&lt;LegalEntityItemBase&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LegalEntityItemBase> getLegalEntityByExternalIdWithHttpInfo(String externalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalId' when calling getLegalEntityByExternalId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("externalId", externalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/legalentities/external/{externalId}", localVarUriVariables);

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

        ParameterizedTypeReference<LegalEntityItemBase> localVarReturnType = new ParameterizedTypeReference<LegalEntityItemBase>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieve a single Legal Entity.
     * Retrieve a single Legal Entity.
     * <p><b>200</b> - Legal Entity by id retrieved successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param legalEntityId Legal Entity internal ID (required)
     * @return LegalEntityItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LegalEntityItem getLegalEntityById(String legalEntityId) throws RestClientException {
        return getLegalEntityByIdWithHttpInfo(legalEntityId).getBody();
    }

    /**
     * Retrieve a single Legal Entity.
     * Retrieve a single Legal Entity.
     * <p><b>200</b> - Legal Entity by id retrieved successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param legalEntityId Legal Entity internal ID (required)
     * @return ResponseEntity&lt;LegalEntityItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LegalEntityItem> getLegalEntityByIdWithHttpInfo(String legalEntityId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'legalEntityId' is set
        if (legalEntityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalEntityId' when calling getLegalEntityById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("legalEntityId", legalEntityId);
        String localVarPath = apiClient.expandPath("/service-api/v2/legalentities/{legalEntityId}", localVarUriVariables);

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

        ParameterizedTypeReference<LegalEntityItem> localVarReturnType = new ParameterizedTypeReference<LegalEntityItem>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieve the master service agreement for a external Legal Entity.
     * Retrieve the master service agreement for a external Legal Entity.
     * <p><b>200</b> - Successfully returned master service agreement for provided legal entity external ID.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param externalId Legal Entity external ID (required)
     * @return GetServiceAgreement
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetServiceAgreement getMasterServiceAgreementByExternalLegalEntity(String externalId) throws RestClientException {
        return getMasterServiceAgreementByExternalLegalEntityWithHttpInfo(externalId).getBody();
    }

    /**
     * Retrieve the master service agreement for a external Legal Entity.
     * Retrieve the master service agreement for a external Legal Entity.
     * <p><b>200</b> - Successfully returned master service agreement for provided legal entity external ID.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param externalId Legal Entity external ID (required)
     * @return ResponseEntity&lt;GetServiceAgreement&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetServiceAgreement> getMasterServiceAgreementByExternalLegalEntityWithHttpInfo(String externalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalId' when calling getMasterServiceAgreementByExternalLegalEntity");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("externalId", externalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/legalentities/external/{externalId}/serviceagreements/master", localVarUriVariables);

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

        ParameterizedTypeReference<GetServiceAgreement> localVarReturnType = new ParameterizedTypeReference<GetServiceAgreement>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieve a list of all children of the given Legal Entity.
     * Retrieve a list of all children of the given Legal Entity.
     * <p><b>200</b> - # Legal Entities list - &#x60;GET&#x60;    Initial call to retrieve the list of legal entities (customers) from the microsphere platform.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.legalentity.routes.ListLegalEntitiesRoute  * Route Id: ListLegalEntities  * Route source endpoint: direct:business.legalEntities.ListLegalEntities  * Route destination endpoint: direct:listLegalEntitiesRequestedInternal  
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param parentEntityId Parent Legal Entity internal ID (optional)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional)
     * @param query The search term used to search. (optional)
     * @return List&lt;LegalEntityItemBase&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<LegalEntityItemBase> getSubEntities(String parentEntityId, String cursor, Integer from, Integer size, String query) throws RestClientException {
        return getSubEntitiesWithHttpInfo(parentEntityId, cursor, from, size, query).getBody();
    }

    /**
     * Retrieve a list of all children of the given Legal Entity.
     * Retrieve a list of all children of the given Legal Entity.
     * <p><b>200</b> - # Legal Entities list - &#x60;GET&#x60;    Initial call to retrieve the list of legal entities (customers) from the microsphere platform.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.legalentity.routes.ListLegalEntitiesRoute  * Route Id: ListLegalEntities  * Route source endpoint: direct:business.legalEntities.ListLegalEntities  * Route destination endpoint: direct:listLegalEntitiesRequestedInternal  
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param parentEntityId Parent Legal Entity internal ID (optional)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional)
     * @param query The search term used to search. (optional)
     * @return ResponseEntity&lt;List&lt;LegalEntityItemBase&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<LegalEntityItemBase>> getSubEntitiesWithHttpInfo(String parentEntityId, String cursor, Integer from, Integer size, String query) throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/legalentities/sub-entities", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentEntityId", parentEntityId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<LegalEntityItemBase>> localVarReturnType = new ParameterizedTypeReference<List<LegalEntityItemBase>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Add a new legal entity without master service agreement. - &#x60;POST&#x60;.
     * # Add a new legal entity without master service agreement - &#x60;POST&#x60;    Add a new legal entity without master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow  
     * <p><b>201</b> - # Legal entity was successfully created.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param legalEntityCreateItem # Add a new legal entity without master service agreement - &#x60;POST&#x60;    Add a new legal entity without master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow   (optional)
     * @return LegalEntityItemId
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LegalEntityItemId postCreateLegalEntities(LegalEntityCreateItem legalEntityCreateItem) throws RestClientException {
        return postCreateLegalEntitiesWithHttpInfo(legalEntityCreateItem).getBody();
    }

    /**
     * Add a new legal entity without master service agreement. - &#x60;POST&#x60;.
     * # Add a new legal entity without master service agreement - &#x60;POST&#x60;    Add a new legal entity without master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow  
     * <p><b>201</b> - # Legal entity was successfully created.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param legalEntityCreateItem # Add a new legal entity without master service agreement - &#x60;POST&#x60;    Add a new legal entity without master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow   (optional)
     * @return ResponseEntity&lt;LegalEntityItemId&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LegalEntityItemId> postCreateLegalEntitiesWithHttpInfo(LegalEntityCreateItem legalEntityCreateItem) throws RestClientException {
        Object localVarPostBody = legalEntityCreateItem;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/legalentities/create", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<LegalEntityItemId> localVarReturnType = new ParameterizedTypeReference<LegalEntityItemId>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Add a new legal entity with master service agreement- &#x60;POST&#x60;.
     * # Add a new legal entity with master service agreement - &#x60;POST&#x60;     Add a new legal entity with master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow  
     * <p><b>201</b> - # Legal entity was successfully created.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param legalEntityCreateItem # Add a new legal entity with master service agreement - &#x60;POST&#x60;     Add a new legal entity with master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow   (optional)
     * @return LegalEntityItemId
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LegalEntityItemId postLegalEntities(LegalEntityCreateItem legalEntityCreateItem) throws RestClientException {
        return postLegalEntitiesWithHttpInfo(legalEntityCreateItem).getBody();
    }

    /**
     * Add a new legal entity with master service agreement- &#x60;POST&#x60;.
     * # Add a new legal entity with master service agreement - &#x60;POST&#x60;     Add a new legal entity with master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow  
     * <p><b>201</b> - # Legal entity was successfully created.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param legalEntityCreateItem # Add a new legal entity with master service agreement - &#x60;POST&#x60;     Add a new legal entity with master service agreement.    ### Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.presentation.services.legalentity.business.flows.CreateLegalEntityFlow   (optional)
     * @return ResponseEntity&lt;LegalEntityItemId&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LegalEntityItemId> postLegalEntitiesWithHttpInfo(LegalEntityCreateItem legalEntityCreateItem) throws RestClientException {
        Object localVarPostBody = legalEntityCreateItem;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/legalentities", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<LegalEntityItemId> localVarReturnType = new ParameterizedTypeReference<LegalEntityItemId>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Legal Entity POST.
     * # Legal Entity POST.    POST request to delete batch legal entities.
     * <p><b>400</b> - BadRequest
     * <p><b>207</b> - MultiStatus
     * @param legalEntitiesBatchDelete # Legal Entity POST.    POST request to delete batch legal entities. (optional)
     * @return List&lt;BatchResponseItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BatchResponseItem> postLegalEntitiesBatchDelete(LegalEntitiesBatchDelete legalEntitiesBatchDelete) throws RestClientException {
        return postLegalEntitiesBatchDeleteWithHttpInfo(legalEntitiesBatchDelete).getBody();
    }

    /**
     * Legal Entity POST.
     * # Legal Entity POST.    POST request to delete batch legal entities.
     * <p><b>400</b> - BadRequest
     * <p><b>207</b> - MultiStatus
     * @param legalEntitiesBatchDelete # Legal Entity POST.    POST request to delete batch legal entities. (optional)
     * @return ResponseEntity&lt;List&lt;BatchResponseItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BatchResponseItem>> postLegalEntitiesBatchDeleteWithHttpInfo(LegalEntitiesBatchDelete legalEntitiesBatchDelete) throws RestClientException {
        Object localVarPostBody = legalEntitiesBatchDelete;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/legalentities/batch/delete", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<BatchResponseItem>> localVarReturnType = new ParameterizedTypeReference<List<BatchResponseItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Legal Entity Batch Put.
     * # Legal Entity Batch Put    Update batch of legal entities.
     * <p><b>207</b> - MultiStatus
     * <p><b>400</b> - BadRequest
     * @param legalEntityPut # Legal Entity Batch Put    Update batch of legal entities. (required)
     * @return List&lt;BatchResponseItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BatchResponseItem> putLegalEntities(List<LegalEntityPut> legalEntityPut) throws RestClientException {
        return putLegalEntitiesWithHttpInfo(legalEntityPut).getBody();
    }

    /**
     * Legal Entity Batch Put.
     * # Legal Entity Batch Put    Update batch of legal entities.
     * <p><b>207</b> - MultiStatus
     * <p><b>400</b> - BadRequest
     * @param legalEntityPut # Legal Entity Batch Put    Update batch of legal entities. (required)
     * @return ResponseEntity&lt;List&lt;BatchResponseItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BatchResponseItem>> putLegalEntitiesWithHttpInfo(List<LegalEntityPut> legalEntityPut) throws RestClientException {
        Object localVarPostBody = legalEntityPut;
        
        // verify the required parameter 'legalEntityPut' is set
        if (legalEntityPut == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalEntityPut' when calling putLegalEntities");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/legalentities", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<BatchResponseItem>> localVarReturnType = new ParameterizedTypeReference<List<BatchResponseItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update legal entity.
     * # Update legal entity.  Updates the type of the Legal Entity by it&#39;s external ID.
     * <p><b>200</b> - Legal entity was successfully updated.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param externalId Legal Entity external ID (required)
     * @param legalEntityUpdateItem # Update legal entity.  Updates the type of the Legal Entity by it&#39;s external ID. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putLegalEntityByExternalId(String externalId, LegalEntityUpdateItem legalEntityUpdateItem) throws RestClientException {
        putLegalEntityByExternalIdWithHttpInfo(externalId, legalEntityUpdateItem);
    }

    /**
     * Update legal entity.
     * # Update legal entity.  Updates the type of the Legal Entity by it&#39;s external ID.
     * <p><b>200</b> - Legal entity was successfully updated.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param externalId Legal Entity external ID (required)
     * @param legalEntityUpdateItem # Update legal entity.  Updates the type of the Legal Entity by it&#39;s external ID. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putLegalEntityByExternalIdWithHttpInfo(String externalId, LegalEntityUpdateItem legalEntityUpdateItem) throws RestClientException {
        Object localVarPostBody = legalEntityUpdateItem;
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalId' when calling putLegalEntityByExternalId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("externalId", externalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/legalentities/external/{externalId}", localVarUriVariables);

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
