package com.microsphere.accesscontrol.service.api.listener.v2;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;

import com.microsphere.accesscontrol.service.api.listener.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.FunctionsGetResponseBody;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ListServiceAgreements;
import com.microsphere.accesscontrol.service.api.listener.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServiceAgreementByPermissionSet;

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
@Component("com.microsphere.accesscontrol.service.api.listener.v2.ServiceAgreementsQueryApi")

public class ServiceAgreementsQueryApi {
    private final ApiClient apiClient;


    @Autowired
    public ServiceAgreementsQueryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Service Agreements GET.
     * # Service Agreements GET    Request method GET for fetching service agreements by creator id, and optionally user id and usersLegalEntityId.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Service agreements retrieved.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param creatorId Legal entity ID that created the service agreement. (required)
     * @param userId Id of the user that is exposed (as regular or local admin) in the service agreement. (optional)
     * @param userLegalEntityId Legal entity Id of the user that is exposed (as regular or local admin) in the service agreement. (optional)
     * @param query The search term used to search. (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return ListServiceAgreements
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListServiceAgreements getAgreements(String creatorId, String userId, String userLegalEntityId, String query, Integer from, String cursor, Integer size) throws RestClientException {
        return getAgreementsWithHttpInfo(creatorId, userId, userLegalEntityId, query, from, cursor, size).getBody();
    }

    /**
     * Service Agreements GET.
     * # Service Agreements GET    Request method GET for fetching service agreements by creator id, and optionally user id and usersLegalEntityId.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Service agreements retrieved.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param creatorId Legal entity ID that created the service agreement. (required)
     * @param userId Id of the user that is exposed (as regular or local admin) in the service agreement. (optional)
     * @param userLegalEntityId Legal entity Id of the user that is exposed (as regular or local admin) in the service agreement. (optional)
     * @param query The search term used to search. (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return ResponseEntity&lt;ListServiceAgreements&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListServiceAgreements> getAgreementsWithHttpInfo(String creatorId, String userId, String userLegalEntityId, String query, Integer from, String cursor, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'creatorId' is set
        if (creatorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creatorId' when calling getAgreements");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/service-agreements", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "creatorId", creatorId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userLegalEntityId", userLegalEntityId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ListServiceAgreements> localVarReturnType = new ParameterizedTypeReference<ListServiceAgreements>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * No description available
     * <p><b>200</b> - Service agreement business functions by external id retrieved.
     * <p><b>404</b> - SA with external ID not found
     * <p><b>400</b> - BadRequest
     * @param externalId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @return List&lt;FunctionsGetResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<FunctionsGetResponseBody> getExternalexternalIdbusinessfunctions(String externalId) throws RestClientException {
        return getExternalexternalIdbusinessfunctionsWithHttpInfo(externalId).getBody();
    }

    /**
     * 
     * No description available
     * <p><b>200</b> - Service agreement business functions by external id retrieved.
     * <p><b>404</b> - SA with external ID not found
     * <p><b>400</b> - BadRequest
     * @param externalId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @return ResponseEntity&lt;List&lt;FunctionsGetResponseBody&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<FunctionsGetResponseBody>> getExternalexternalIdbusinessfunctionsWithHttpInfo(String externalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalId' when calling getExternalexternalIdbusinessfunctions");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("externalId", externalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/service-agreements/external/{externalId}/business-functions", localVarUriVariables);

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

        ParameterizedTypeReference<List<FunctionsGetResponseBody>> localVarReturnType = new ParameterizedTypeReference<List<FunctionsGetResponseBody>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Service Agreements - &#x60;GET&#x60;.
     * # Service Agreements - &#x60;GET&#x60;    Request method GET for fetching service agreement by assignable permission set.  
     * <p><b>200</b> - List of all service agreement where provided permission set is assigned.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Invalid id identifier of assignable permission set  * Invalid page size, size must be lower than 1000    | Message | key  --- | --- |  | Invalid id identifier of assignable permission set. | permissionSet.identifier.INVALID_VALUE  | Invalid page size, size must be lower than 1000. | list.page.error.message.E_INVALID_PAGE_SIZE  
     * <p><b>404</b> - # Reasons for getting HTTP status code 404:    * The APS doesn&#39;t exist.    | Message | key  --- | --- |  | The APS doesn&#39;t exist. | permissionSet.identifiers.NOT_EXISTS  
     * @param id Permission sets id (required)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return List&lt;ServiceAgreementByPermissionSet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ServiceAgreementByPermissionSet> getGetServiceAgremeentByPermissionSetId(String id, Integer from, String cursor, Integer size) throws RestClientException {
        return getGetServiceAgremeentByPermissionSetIdWithHttpInfo(id, from, cursor, size).getBody();
    }

    /**
     * Service Agreements - &#x60;GET&#x60;.
     * # Service Agreements - &#x60;GET&#x60;    Request method GET for fetching service agreement by assignable permission set.  
     * <p><b>200</b> - List of all service agreement where provided permission set is assigned.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Invalid id identifier of assignable permission set  * Invalid page size, size must be lower than 1000    | Message | key  --- | --- |  | Invalid id identifier of assignable permission set. | permissionSet.identifier.INVALID_VALUE  | Invalid page size, size must be lower than 1000. | list.page.error.message.E_INVALID_PAGE_SIZE  
     * <p><b>404</b> - # Reasons for getting HTTP status code 404:    * The APS doesn&#39;t exist.    | Message | key  --- | --- |  | The APS doesn&#39;t exist. | permissionSet.identifiers.NOT_EXISTS  
     * @param id Permission sets id (required)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return ResponseEntity&lt;List&lt;ServiceAgreementByPermissionSet&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ServiceAgreementByPermissionSet>> getGetServiceAgremeentByPermissionSetIdWithHttpInfo(String id, Integer from, String cursor, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getGetServiceAgremeentByPermissionSetId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/service-agreements/permission-sets/id/{id}", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ServiceAgreementByPermissionSet>> localVarReturnType = new ParameterizedTypeReference<List<ServiceAgreementByPermissionSet>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Service Agreements - &#x60;GET&#x60;.
     * # Service Agreements - &#x60;GET&#x60;    Request method GET for fetching service agreement by assignable permission set.  
     * <p><b>200</b> - List of all service agreement where provided permission set is assigned.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Invalid page size, size must be lower than 1000    | Message | key  --- | --- |  | Invalid page size, size must be lower than 1000. | list.page.error.message.E_INVALID_PAGE_SIZE  
     * <p><b>404</b> - # Reasons for getting HTTP status code 404:    * The APS doesn&#39;t exist.    | Message | key  --- | --- |  | The APS doesn&#39;t exist. | permissionSet.identifiers.NOT_EXISTS  
     * @param name No description available (required)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return List&lt;ServiceAgreementByPermissionSet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ServiceAgreementByPermissionSet> getGetServiceAgremeentByPermissionSetName(String name, Integer from, String cursor, Integer size) throws RestClientException {
        return getGetServiceAgremeentByPermissionSetNameWithHttpInfo(name, from, cursor, size).getBody();
    }

    /**
     * Service Agreements - &#x60;GET&#x60;.
     * # Service Agreements - &#x60;GET&#x60;    Request method GET for fetching service agreement by assignable permission set.  
     * <p><b>200</b> - List of all service agreement where provided permission set is assigned.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Invalid page size, size must be lower than 1000    | Message | key  --- | --- |  | Invalid page size, size must be lower than 1000. | list.page.error.message.E_INVALID_PAGE_SIZE  
     * <p><b>404</b> - # Reasons for getting HTTP status code 404:    * The APS doesn&#39;t exist.    | Message | key  --- | --- |  | The APS doesn&#39;t exist. | permissionSet.identifiers.NOT_EXISTS  
     * @param name No description available (required)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return ResponseEntity&lt;List&lt;ServiceAgreementByPermissionSet&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ServiceAgreementByPermissionSet>> getGetServiceAgremeentByPermissionSetNameWithHttpInfo(String name, Integer from, String cursor, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getGetServiceAgremeentByPermissionSetName");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("name", name);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/service-agreements/permission-sets/name/{name}", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ServiceAgreementByPermissionSet>> localVarReturnType = new ParameterizedTypeReference<List<ServiceAgreementByPermissionSet>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * No description available
     * <p><b>200</b> - Service agreement business functions by internal id retrieved.
     * <p><b>404</b> - SA with internal ID not found
     * <p><b>400</b> - BadRequest
     * @param internalId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @return List&lt;FunctionsGetResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<FunctionsGetResponseBody> getIdinternalIdbusinessfunctions(String internalId) throws RestClientException {
        return getIdinternalIdbusinessfunctionsWithHttpInfo(internalId).getBody();
    }

    /**
     * 
     * No description available
     * <p><b>200</b> - Service agreement business functions by internal id retrieved.
     * <p><b>404</b> - SA with internal ID not found
     * <p><b>400</b> - BadRequest
     * @param internalId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @return ResponseEntity&lt;List&lt;FunctionsGetResponseBody&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<FunctionsGetResponseBody>> getIdinternalIdbusinessfunctionsWithHttpInfo(String internalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling getIdinternalIdbusinessfunctions");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/service-agreements/id/{internalId}/business-functions", localVarUriVariables);

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

        ParameterizedTypeReference<List<FunctionsGetResponseBody>> localVarReturnType = new ParameterizedTypeReference<List<FunctionsGetResponseBody>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
