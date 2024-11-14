package com.microsphere.usermanager.service.api.listener.v2;

import com.microsphere.usermanager.service.api.listener.ApiClient;

import com.microsphere.usermanager.service.api.listener.v2.model.AddRealmRequest;
import com.microsphere.usermanager.service.api.listener.v2.model.AddRealmResponse;
import com.microsphere.usermanager.service.api.listener.v2.model.AssignRealm;
import com.microsphere.usermanager.service.api.listener.v2.model.BadRequestError;
import com.microsphere.usermanager.service.api.listener.v2.model.Conflict;
import com.microsphere.usermanager.service.api.listener.v2.model.CreateIdentityRequest;
import com.microsphere.usermanager.service.api.listener.v2.model.CreateIdentityResponse;
import com.microsphere.usermanager.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.usermanager.service.api.listener.v2.model.GetIdentities;
import com.microsphere.usermanager.service.api.listener.v2.model.GetIdentity;
import com.microsphere.usermanager.service.api.listener.v2.model.GetIdentityByIdpIdAndIssuer;
import com.microsphere.usermanager.service.api.listener.v2.model.GetIdentitySessions;
import com.microsphere.usermanager.service.api.listener.v2.model.IdentityLogoutRequest;
import com.microsphere.usermanager.service.api.listener.v2.model.IdentityRequiredActionsRequest;
import com.microsphere.usermanager.service.api.listener.v2.model.ImportIdentity;
import com.microsphere.usermanager.service.api.listener.v2.model.NotFoundError;
import com.microsphere.usermanager.service.api.listener.v2.model.Realm;
import com.microsphere.usermanager.service.api.listener.v2.model.UpdateIdentityRequest;

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

@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:56.279646600+01:00[Africa/Tunis]")
@Component("com.microsphere.usermanager.service.api.listener.v2.IdentityManagementApi")

public class IdentityManagementApi {
    private final ApiClient apiClient;


    @Autowired
    public IdentityManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Assign Realm to Legal Entity
     * Assigns an existing Realm stored in DBS to an existing Legal Entity defined by its ID. If no Legal Entity or Realm exist for the given IDs a Not Found Exception will be thrown.  If the Legal Entity we are trying to assign a realm to already has an assigned Realm it will update the record in the database. 
     * <p><b>201</b> - Successfully assigned.
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param realmName MicroSphere identity Realm Name (required)
     * @param assignRealm  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void assignRealm(String realmName, AssignRealm assignRealm) throws RestClientException {
        assignRealmWithHttpInfo(realmName, assignRealm);
    }

    /**
     * Assign Realm to Legal Entity
     * Assigns an existing Realm stored in DBS to an existing Legal Entity defined by its ID. If no Legal Entity or Realm exist for the given IDs a Not Found Exception will be thrown.  If the Legal Entity we are trying to assign a realm to already has an assigned Realm it will update the record in the database. 
     * <p><b>201</b> - Successfully assigned.
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param realmName MicroSphere identity Realm Name (required)
     * @param assignRealm  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> assignRealmWithHttpInfo(String realmName, AssignRealm assignRealm) throws RestClientException {
        Object localVarPostBody = assignRealm;
        
        // verify the required parameter 'realmName' is set
        if (realmName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'realmName' when calling assignRealm");
        }
        
        // verify the required parameter 'assignRealm' is set
        if (assignRealm == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assignRealm' when calling assignRealm");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("realmName", realmName);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/identities/realms/{realmName}/legalentities", localVarUriVariables);

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
     * Create/Import user identity
     * This endpoint will create of import an Identity based on the request body properties passed:  * Create identity request will contain an email address and full name properties.  * If no email address/full-name is present in the request, it will be considered an import request.  Deprecation note: The ability of importing existing identities into DBS will be removed from this endpoint in DBS 2.20.0 and the functionality will be moved to a new endpoint \&quot;/v2/users/identities/existing\&quot; 
     * <p><b>201</b> - Resource created
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * <p><b>409</b> - Conflict Error. User already exists.
     * @param createIdentityRequest  (required)
     * @return CreateIdentityResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateIdentityResponse createIdentity(CreateIdentityRequest createIdentityRequest) throws RestClientException {
        return createIdentityWithHttpInfo(createIdentityRequest).getBody();
    }

    /**
     * Create/Import user identity
     * This endpoint will create of import an Identity based on the request body properties passed:  * Create identity request will contain an email address and full name properties.  * If no email address/full-name is present in the request, it will be considered an import request.  Deprecation note: The ability of importing existing identities into DBS will be removed from this endpoint in DBS 2.20.0 and the functionality will be moved to a new endpoint \&quot;/v2/users/identities/existing\&quot; 
     * <p><b>201</b> - Resource created
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * <p><b>409</b> - Conflict Error. User already exists.
     * @param createIdentityRequest  (required)
     * @return ResponseEntity&lt;CreateIdentityResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateIdentityResponse> createIdentityWithHttpInfo(CreateIdentityRequest createIdentityRequest) throws RestClientException {
        Object localVarPostBody = createIdentityRequest;
        
        // verify the required parameter 'createIdentityRequest' is set
        if (createIdentityRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createIdentityRequest' when calling createIdentity");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/users/identities", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CreateIdentityResponse> localVarReturnType = new ParameterizedTypeReference<CreateIdentityResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Creates Realm
     * Adds a new Realm entity into DBS. 
     * <p><b>201</b> - Resource created
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * @param addRealmRequest  (required)
     * @return AddRealmResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AddRealmResponse createRealm(AddRealmRequest addRealmRequest) throws RestClientException {
        return createRealmWithHttpInfo(addRealmRequest).getBody();
    }

    /**
     * Creates Realm
     * Adds a new Realm entity into DBS. 
     * <p><b>201</b> - Resource created
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * @param addRealmRequest  (required)
     * @return ResponseEntity&lt;AddRealmResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AddRealmResponse> createRealmWithHttpInfo(AddRealmRequest addRealmRequest) throws RestClientException {
        Object localVarPostBody = addRealmRequest;
        
        // verify the required parameter 'addRealmRequest' is set
        if (addRealmRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addRealmRequest' when calling createRealm");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/users/identities/realms", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<AddRealmResponse> localVarReturnType = new ParameterizedTypeReference<AddRealmResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List User identities
     * Retrieve a list of user identities with the search criteria passed as query parameters: * externalId: User External ID used as a search term.  This endpoint results are pageable and admit also the following query parameters: * from: Page Number. Skip over pages of elements by specifying a start value for the query. * size: Number of records that will be shown each request.  As an example, a request using the following query parameters:  &#x60;&#x60;&#x60;from&#x3D;2&amp;size&#x3D;10&#x60;&#x60;&#x60;  will show the elements 20th to 30th (non inclusive) 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param externalId External unique identifier of the resource. (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return GetIdentities
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetIdentities getIdentities(String externalId, Integer from, String cursor, Integer size) throws RestClientException {
        return getIdentitiesWithHttpInfo(externalId, from, cursor, size).getBody();
    }

    /**
     * List User identities
     * Retrieve a list of user identities with the search criteria passed as query parameters: * externalId: User External ID used as a search term.  This endpoint results are pageable and admit also the following query parameters: * from: Page Number. Skip over pages of elements by specifying a start value for the query. * size: Number of records that will be shown each request.  As an example, a request using the following query parameters:  &#x60;&#x60;&#x60;from&#x3D;2&amp;size&#x3D;10&#x60;&#x60;&#x60;  will show the elements 20th to 30th (non inclusive) 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param externalId External unique identifier of the resource. (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return ResponseEntity&lt;GetIdentities&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetIdentities> getIdentitiesWithHttpInfo(String externalId, Integer from, String cursor, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/users/identities", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "externalId", externalId));
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

        ParameterizedTypeReference<GetIdentities> localVarReturnType = new ParameterizedTypeReference<GetIdentities>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * User identity details
     * Retrieves a User Identity by its internal ID. 
     * <p><b>200</b> - Successful response
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @return GetIdentity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetIdentity getIdentity(String internalId) throws RestClientException {
        return getIdentityWithHttpInfo(internalId).getBody();
    }

    /**
     * User identity details
     * Retrieves a User Identity by its internal ID. 
     * <p><b>200</b> - Successful response
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @return ResponseEntity&lt;GetIdentity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetIdentity> getIdentityWithHttpInfo(String internalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling getIdentity");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/identities/{internalId}", localVarUriVariables);

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

        ParameterizedTypeReference<GetIdentity> localVarReturnType = new ParameterizedTypeReference<GetIdentity>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * User identity details by IDP Id and Issuer
     * Retrieves a User Identity by its IDP ID and Issuer. 
     * <p><b>200</b> - Successful response
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param idpId User IDP id (required)
     * @param issuer The issuer url (required)
     * @return GetIdentityByIdpIdAndIssuer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetIdentityByIdpIdAndIssuer getIdentityByIdpIdAndIssuer(String idpId, String issuer) throws RestClientException {
        return getIdentityByIdpIdAndIssuerWithHttpInfo(idpId, issuer).getBody();
    }

    /**
     * User identity details by IDP Id and Issuer
     * Retrieves a User Identity by its IDP ID and Issuer. 
     * <p><b>200</b> - Successful response
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param idpId User IDP id (required)
     * @param issuer The issuer url (required)
     * @return ResponseEntity&lt;GetIdentityByIdpIdAndIssuer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetIdentityByIdpIdAndIssuer> getIdentityByIdpIdAndIssuerWithHttpInfo(String idpId, String issuer) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idpId' is set
        if (idpId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idpId' when calling getIdentityByIdpIdAndIssuer");
        }
        
        // verify the required parameter 'issuer' is set
        if (issuer == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issuer' when calling getIdentityByIdpIdAndIssuer");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("idpId", idpId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/identities/idp/{idpId}", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "issuer", issuer));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetIdentityByIdpIdAndIssuer> localVarReturnType = new ParameterizedTypeReference<GetIdentityByIdpIdAndIssuer>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Realms
     * It will return an empty list if no realms are stored in the database. If a Legal Entity ID is passed as a query parameter it will return the realm entity associated to the requested  Legal Entity. If no association exists between Realm and Legal Entity it will throw a Not Found Exception. 
     * <p><b>200</b> - Successful request
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param legalEntityId Legal Entity Internal Id (optional)
     * @return List&lt;Realm&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Realm> getRealms(String legalEntityId) throws RestClientException {
        return getRealmsWithHttpInfo(legalEntityId).getBody();
    }

    /**
     * Get Realms
     * It will return an empty list if no realms are stored in the database. If a Legal Entity ID is passed as a query parameter it will return the realm entity associated to the requested  Legal Entity. If no association exists between Realm and Legal Entity it will throw a Not Found Exception. 
     * <p><b>200</b> - Successful request
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param legalEntityId Legal Entity Internal Id (optional)
     * @return ResponseEntity&lt;List&lt;Realm&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Realm>> getRealmsWithHttpInfo(String legalEntityId) throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/users/identities/realms", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "legalEntityId", legalEntityId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Realm>> localVarReturnType = new ParameterizedTypeReference<List<Realm>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get User Identity sessions
     * Retrieves the sessions associated with an identity.  Note that to use this endpoint, the feature flag \&quot;microsphere.users.identity-endpoints-enabled\&quot; must be set to true. 
     * <p><b>200</b> - Successful response
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @return GetIdentitySessions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetIdentitySessions getSessions(String internalId) throws RestClientException {
        return getSessionsWithHttpInfo(internalId).getBody();
    }

    /**
     * Get User Identity sessions
     * Retrieves the sessions associated with an identity.  Note that to use this endpoint, the feature flag \&quot;microsphere.users.identity-endpoints-enabled\&quot; must be set to true. 
     * <p><b>200</b> - Successful response
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @return ResponseEntity&lt;GetIdentitySessions&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetIdentitySessions> getSessionsWithHttpInfo(String internalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling getSessions");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/identities/{internalId}/sessions", localVarUriVariables);

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

        ParameterizedTypeReference<GetIdentitySessions> localVarReturnType = new ParameterizedTypeReference<GetIdentitySessions>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Import existing User in Identity Provider into DBS Users
     * This endpoint allows the user to import an existing user in an Identity Provider defined by its username into a legal Entity defined by its legal entity internal ID. 
     * <p><b>201</b> - Identity Imported
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * <p><b>409</b> - Conflict Error. User already exists.
     * @param importIdentity  (required)
     * @return CreateIdentityResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateIdentityResponse importIdentity(ImportIdentity importIdentity) throws RestClientException {
        return importIdentityWithHttpInfo(importIdentity).getBody();
    }

    /**
     * Import existing User in Identity Provider into DBS Users
     * This endpoint allows the user to import an existing user in an Identity Provider defined by its username into a legal Entity defined by its legal entity internal ID. 
     * <p><b>201</b> - Identity Imported
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * <p><b>409</b> - Conflict Error. User already exists.
     * @param importIdentity  (required)
     * @return ResponseEntity&lt;CreateIdentityResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateIdentityResponse> importIdentityWithHttpInfo(ImportIdentity importIdentity) throws RestClientException {
        Object localVarPostBody = importIdentity;
        
        // verify the required parameter 'importIdentity' is set
        if (importIdentity == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'importIdentity' when calling importIdentity");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/users/identities/existing", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CreateIdentityResponse> localVarReturnType = new ParameterizedTypeReference<CreateIdentityResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Logout Identity sessions
     * Logs out either a list of sessions for a user, or all sessions for an individual user if an empty sessionIds array is set in the request.  Note that to use this endpoint, the feature flag \&quot;microsphere.users.identity-endpoints-enabled\&quot; must be set to true. 
     * <p><b>200</b> - Successful request
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param identityLogoutRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void logoutSessions(String internalId, IdentityLogoutRequest identityLogoutRequest) throws RestClientException {
        logoutSessionsWithHttpInfo(internalId, identityLogoutRequest);
    }

    /**
     * Logout Identity sessions
     * Logs out either a list of sessions for a user, or all sessions for an individual user if an empty sessionIds array is set in the request.  Note that to use this endpoint, the feature flag \&quot;microsphere.users.identity-endpoints-enabled\&quot; must be set to true. 
     * <p><b>200</b> - Successful request
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param identityLogoutRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> logoutSessionsWithHttpInfo(String internalId, IdentityLogoutRequest identityLogoutRequest) throws RestClientException {
        Object localVarPostBody = identityLogoutRequest;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling logoutSessions");
        }
        
        // verify the required parameter 'identityLogoutRequest' is set
        if (identityLogoutRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identityLogoutRequest' when calling logoutSessions");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/identities/{internalId}/sessions/logout", localVarUriVariables);

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
     * Send email with required actions
     * Requests the identity system to send an email to a user with a link to perform the given actions.  Note that to use this endpoint, the feature flag \&quot;microsphere.users.identity-endpoints-enabled\&quot; must be set to true. 
     * <p><b>204</b> - Successful request
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param identityRequiredActionsRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void sendRequiredActions(String internalId, IdentityRequiredActionsRequest identityRequiredActionsRequest) throws RestClientException {
        sendRequiredActionsWithHttpInfo(internalId, identityRequiredActionsRequest);
    }

    /**
     * Send email with required actions
     * Requests the identity system to send an email to a user with a link to perform the given actions.  Note that to use this endpoint, the feature flag \&quot;microsphere.users.identity-endpoints-enabled\&quot; must be set to true. 
     * <p><b>204</b> - Successful request
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param identityRequiredActionsRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> sendRequiredActionsWithHttpInfo(String internalId, IdentityRequiredActionsRequest identityRequiredActionsRequest) throws RestClientException {
        Object localVarPostBody = identityRequiredActionsRequest;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling sendRequiredActions");
        }
        
        // verify the required parameter 'identityRequiredActionsRequest' is set
        if (identityRequiredActionsRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identityRequiredActionsRequest' when calling sendRequiredActions");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/identities/{internalId}/actions", localVarUriVariables);

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
     * Update user identity
     * Updates a user in DBS and the identity system.  Note that to use this endpoint, the feature flag \&quot;microsphere.users.identity-endpoints-enabled\&quot; must be set to true. 
     * <p><b>204</b> - Resource updated
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param updateIdentityRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateIdentity(String internalId, UpdateIdentityRequest updateIdentityRequest) throws RestClientException {
        updateIdentityWithHttpInfo(internalId, updateIdentityRequest);
    }

    /**
     * Update user identity
     * Updates a user in DBS and the identity system.  Note that to use this endpoint, the feature flag \&quot;microsphere.users.identity-endpoints-enabled\&quot; must be set to true. 
     * <p><b>204</b> - Resource updated
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param updateIdentityRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateIdentityWithHttpInfo(String internalId, UpdateIdentityRequest updateIdentityRequest) throws RestClientException {
        Object localVarPostBody = updateIdentityRequest;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling updateIdentity");
        }
        
        // verify the required parameter 'updateIdentityRequest' is set
        if (updateIdentityRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateIdentityRequest' when calling updateIdentity");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/identities/{internalId}", localVarUriVariables);

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
