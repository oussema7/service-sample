package com.microsphere.usermanager.service.api.listener.v2;

import com.microsphere.usermanager.service.api.listener.ApiClient;

import com.microsphere.usermanager.service.api.listener.v2.model.BadRequestError;
import com.microsphere.usermanager.service.api.listener.v2.model.BatchResponseItem;
import com.microsphere.usermanager.service.api.listener.v2.model.BatchUser;
import com.microsphere.usermanager.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.usermanager.service.api.listener.v2.model.GetUser;
import com.microsphere.usermanager.service.api.listener.v2.model.GetUserIdsAndLegalEntities;
import com.microsphere.usermanager.service.api.listener.v2.model.GetUsersByLegalEntityIdsRequest;
import com.microsphere.usermanager.service.api.listener.v2.model.GetUsersList;
import com.microsphere.usermanager.service.api.listener.v2.model.LegalEntity;
import com.microsphere.usermanager.service.api.listener.v2.model.NotFoundError;
import com.microsphere.usermanager.service.api.listener.v2.model.User;
import com.microsphere.usermanager.service.api.listener.v2.model.UserCreated;
import com.microsphere.usermanager.service.api.listener.v2.model.UserExternal;

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
@Component("com.microsphere.usermanager.service.api.listener.v2.UserManagementApi")

public class UserManagementApi {
    private final ApiClient apiClient;


    @Autowired
    public UserManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Check if User exists by its external ID
     * Checks whether the given user defined by its external Id already exists. 
     * <p><b>200</b> - Successful empty response
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param externalId External unique identifier of the resource. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void checkUserExists(String externalId) throws RestClientException {
        checkUserExistsWithHttpInfo(externalId);
    }

    /**
     * Check if User exists by its external ID
     * Checks whether the given user defined by its external Id already exists. 
     * <p><b>200</b> - Successful empty response
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param externalId External unique identifier of the resource. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> checkUserExistsWithHttpInfo(String externalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalId' when calling checkUserExists");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("externalId", externalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/existing/externalids/{externalId}", localVarUriVariables);

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
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Creates User
     * Creates a new user that belongs to the given legal entity. 
     * <p><b>201</b> - Successfully created
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * @param userExternal  (required)
     * @return UserCreated
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserCreated createUser(UserExternal userExternal) throws RestClientException {
        return createUserWithHttpInfo(userExternal).getBody();
    }

    /**
     * Creates User
     * Creates a new user that belongs to the given legal entity. 
     * <p><b>201</b> - Successfully created
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * @param userExternal  (required)
     * @return ResponseEntity&lt;UserCreated&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserCreated> createUserWithHttpInfo(UserExternal userExternal) throws RestClientException {
        Object localVarPostBody = userExternal;
        
        // verify the required parameter 'userExternal' is set
        if (userExternal == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userExternal' when calling createUser");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/users", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<UserCreated> localVarReturnType = new ParameterizedTypeReference<UserCreated>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes a user by its internal ID
     * Deletes a user by its internal ID. This endpoint should never be used to delete users for any reason other than compensation of a failed provisioning workflow. Deleting a user that is or was active may cause unintended consequences and is strongly discouraged. 
     * <p><b>204</b> - User deleted
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * @param internalId User internal ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteUserByInternalId(String internalId) throws RestClientException {
        deleteUserByInternalIdWithHttpInfo(internalId);
    }

    /**
     * Deletes a user by its internal ID
     * Deletes a user by its internal ID. This endpoint should never be used to delete users for any reason other than compensation of a failed provisioning workflow. Deleting a user that is or was active may cause unintended consequences and is strongly discouraged. 
     * <p><b>204</b> - User deleted
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * @param internalId User internal ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteUserByInternalIdWithHttpInfo(String internalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling deleteUserByInternalId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}", localVarUriVariables);

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
     * Legal Entity by User External ID
     * Retrieve the Legal Entity that the User Belongs to. 
     * <p><b>200</b> - Successful response
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param externalId External unique identifier of the resource. (required)
     * @return LegalEntity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LegalEntity getLegalEntityByExternalId(String externalId) throws RestClientException {
        return getLegalEntityByExternalIdWithHttpInfo(externalId).getBody();
    }

    /**
     * Legal Entity by User External ID
     * Retrieve the Legal Entity that the User Belongs to. 
     * <p><b>200</b> - Successful response
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param externalId External unique identifier of the resource. (required)
     * @return ResponseEntity&lt;LegalEntity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LegalEntity> getLegalEntityByExternalIdWithHttpInfo(String externalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalId' when calling getLegalEntityByExternalId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("externalId", externalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/externalids/{externalId}/legalentities", localVarUriVariables);

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

        ParameterizedTypeReference<LegalEntity> localVarReturnType = new ParameterizedTypeReference<LegalEntity>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get User by external ID
     * Retrieves a User entity by its external ID. 
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param externalId External unique identifier of the resource. (required)
     * @param skipHierarchyCheck When this queryParameter is true, the request will omit the Legal Entity hierarchy checks. The Legal Entity hierarchy checks are done against the user present in the internal JWT from the &#x60;X-CXT-User-Token&#x60; header.  (optional, default to false)
     * @return GetUser
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUser getUserByExternalId(String externalId, Boolean skipHierarchyCheck) throws RestClientException {
        return getUserByExternalIdWithHttpInfo(externalId, skipHierarchyCheck).getBody();
    }

    /**
     * Get User by external ID
     * Retrieves a User entity by its external ID. 
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param externalId External unique identifier of the resource. (required)
     * @param skipHierarchyCheck When this queryParameter is true, the request will omit the Legal Entity hierarchy checks. The Legal Entity hierarchy checks are done against the user present in the internal JWT from the &#x60;X-CXT-User-Token&#x60; header.  (optional, default to false)
     * @return ResponseEntity&lt;GetUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUser> getUserByExternalIdWithHttpInfo(String externalId, Boolean skipHierarchyCheck) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalId' when calling getUserByExternalId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("externalId", externalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/externalids/{externalId}", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipHierarchyCheck", skipHierarchyCheck));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUser> localVarReturnType = new ParameterizedTypeReference<GetUser>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets a user by its ID
     * Retrieves a User entity by its Internal ID. 
     * <p><b>200</b> - Returns User
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param skipHierarchyCheck When this queryParameter is true, the request will omit the Legal Entity hierarchy checks. The Legal Entity hierarchy checks are done against the user present in the internal JWT from the &#x60;X-CXT-User-Token&#x60; header.  (optional, default to false)
     * @return GetUser
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUser getUserById(String internalId, Boolean skipHierarchyCheck) throws RestClientException {
        return getUserByIdWithHttpInfo(internalId, skipHierarchyCheck).getBody();
    }

    /**
     * Gets a user by its ID
     * Retrieves a User entity by its Internal ID. 
     * <p><b>200</b> - Returns User
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param skipHierarchyCheck When this queryParameter is true, the request will omit the Legal Entity hierarchy checks. The Legal Entity hierarchy checks are done against the user present in the internal JWT from the &#x60;X-CXT-User-Token&#x60; header.  (optional, default to false)
     * @return ResponseEntity&lt;GetUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUser> getUserByIdWithHttpInfo(String internalId, Boolean skipHierarchyCheck) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling getUserById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipHierarchyCheck", skipHierarchyCheck));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUser> localVarReturnType = new ParameterizedTypeReference<GetUser>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List all Internal UserIds and their corresponding LegalEntityId
     * Retrieve a list of Internal UserIds and their corresponding LegalEntityId  This endpoint results are pageable and admit also the following query parameters: * from: Page Number. Skip over pages of elements by specifying a start value for the query. * size: Number of records that will be shown each request.  As an example, a request using the following query parameters:  &#x60;&#x60;&#x60;from&#x3D;2&amp;size&#x3D;10&#x60;&#x60;&#x60;  will show the elements 20th to 30th (non inclusive) 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param size Limit the number of elements on the response.  (optional, default to 10)
     * @return GetUserIdsAndLegalEntities
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserIdsAndLegalEntities getUserIdsAndLegalEntities(Integer from, Integer size) throws RestClientException {
        return getUserIdsAndLegalEntitiesWithHttpInfo(from, size).getBody();
    }

    /**
     * List all Internal UserIds and their corresponding LegalEntityId
     * Retrieve a list of Internal UserIds and their corresponding LegalEntityId  This endpoint results are pageable and admit also the following query parameters: * from: Page Number. Skip over pages of elements by specifying a start value for the query. * size: Number of records that will be shown each request.  As an example, a request using the following query parameters:  &#x60;&#x60;&#x60;from&#x3D;2&amp;size&#x3D;10&#x60;&#x60;&#x60;  will show the elements 20th to 30th (non inclusive) 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param size Limit the number of elements on the response.  (optional, default to 10)
     * @return ResponseEntity&lt;GetUserIdsAndLegalEntities&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserIdsAndLegalEntities> getUserIdsAndLegalEntitiesWithHttpInfo(Integer from, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/users/legal-entities", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<GetUserIdsAndLegalEntities> localVarReturnType = new ParameterizedTypeReference<GetUserIdsAndLegalEntities>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets a list of Users by their Legal Entity ID
     * Retrieve a list of users with the search criteria passed as query parameters: * entityId: Legal Entity ID that the users belong to. REQUIRED * query: Case-insensitive search term used to search for users by their full name.  This endpoint results are pageable and admit also the following query parameters: * from: Page Number. Skip over pages of elements by specifying a start value for the query. * size: Number of records that will be shown each request.  As an example, a request using the following query parameters:  &#x60;&#x60;&#x60;from&#x3D;2&amp;size&#x3D;10&#x60;&#x60;&#x60;  will show the elements 20th to 30th (non inclusive) 
     * <p><b>200</b> - Successfully returned a list of Users
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * @param entityId Legal Entity ID (required)
     * @param query Case-insensitive search term used to search for users by their full name (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query  (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @param skipHierarchyCheck When this queryParameter is true, the request will omit the Legal Entity hierarchy checks. The Legal Entity hierarchy checks are done against the user present in the internal JWT from the &#x60;X-CXT-User-Token&#x60; header.  (optional, default to false)
     * @return List&lt;GetUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GetUser> getUsers(String entityId, String query, Integer from, String cursor, Integer size, Boolean skipHierarchyCheck) throws RestClientException {
        return getUsersWithHttpInfo(entityId, query, from, cursor, size, skipHierarchyCheck).getBody();
    }

    /**
     * Gets a list of Users by their Legal Entity ID
     * Retrieve a list of users with the search criteria passed as query parameters: * entityId: Legal Entity ID that the users belong to. REQUIRED * query: Case-insensitive search term used to search for users by their full name.  This endpoint results are pageable and admit also the following query parameters: * from: Page Number. Skip over pages of elements by specifying a start value for the query. * size: Number of records that will be shown each request.  As an example, a request using the following query parameters:  &#x60;&#x60;&#x60;from&#x3D;2&amp;size&#x3D;10&#x60;&#x60;&#x60;  will show the elements 20th to 30th (non inclusive) 
     * <p><b>200</b> - Successfully returned a list of Users
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - The user couldn&#39;t perform the operation due to lack of permissions
     * @param entityId Legal Entity ID (required)
     * @param query Case-insensitive search term used to search for users by their full name (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query  (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @param skipHierarchyCheck When this queryParameter is true, the request will omit the Legal Entity hierarchy checks. The Legal Entity hierarchy checks are done against the user present in the internal JWT from the &#x60;X-CXT-User-Token&#x60; header.  (optional, default to false)
     * @return ResponseEntity&lt;List&lt;GetUser&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GetUser>> getUsersWithHttpInfo(String entityId, String query, Integer from, String cursor, Integer size, Boolean skipHierarchyCheck) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityId' when calling getUsers");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/users", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "entityId", entityId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipHierarchyCheck", skipHierarchyCheck));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<GetUser>> localVarReturnType = new ParameterizedTypeReference<List<GetUser>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List Users by a list of their External IDs
     * Retrieve the list of Users by external Ids that might belong to separate Legal Entities. 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * @param requestBody  (required)
     * @return List&lt;GetUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GetUser> getUsersByExternalIds(List<String> requestBody) throws RestClientException {
        return getUsersByExternalIdsWithHttpInfo(requestBody).getBody();
    }

    /**
     * List Users by a list of their External IDs
     * Retrieve the list of Users by external Ids that might belong to separate Legal Entities. 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * @param requestBody  (required)
     * @return ResponseEntity&lt;List&lt;GetUser&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GetUser>> getUsersByExternalIdsWithHttpInfo(List<String> requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling getUsersByExternalIds");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/users/externalids", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<GetUser>> localVarReturnType = new ParameterizedTypeReference<List<GetUser>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List Users by a list of their External IDs
     * Retrieve the list of Users by external Ids that might belong to separate Legal Entities. Request won&#39;t fail if one of the users cannot be found. 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * @param requestBody  (required)
     * @return List&lt;GetUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GetUser> getUsersByExternalIdsBulk(List<String> requestBody) throws RestClientException {
        return getUsersByExternalIdsBulkWithHttpInfo(requestBody).getBody();
    }

    /**
     * List Users by a list of their External IDs
     * Retrieve the list of Users by external Ids that might belong to separate Legal Entities. Request won&#39;t fail if one of the users cannot be found. 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * @param requestBody  (required)
     * @return ResponseEntity&lt;List&lt;GetUser&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GetUser>> getUsersByExternalIdsBulkWithHttpInfo(List<String> requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling getUsersByExternalIdsBulk");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/users/bulk/externalids", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<GetUser>> localVarReturnType = new ParameterizedTypeReference<List<GetUser>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List Users by Legal Entity Ids
     * Retrieve a paged list of Users by given list of legal entity Ids, with optional parameters for query and excluding user ids.  The list of users is sorted by Legal Entity ID, then Full Name and ultimately ID in ascending order. 
     * <p><b>200</b> - Successful response
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param getUsersByLegalEntityIdsRequest  (required)
     * @param skipHierarchyCheck When this queryParameter is true, the request will omit the Legal Entity hierarchy checks. The Legal Entity hierarchy checks are done against the user present in the internal JWT from the &#x60;X-CXT-User-Token&#x60; header.  (optional, default to false)
     * @return GetUsersList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUsersList getUsersByLegalEntityIds(GetUsersByLegalEntityIdsRequest getUsersByLegalEntityIdsRequest, Boolean skipHierarchyCheck) throws RestClientException {
        return getUsersByLegalEntityIdsWithHttpInfo(getUsersByLegalEntityIdsRequest, skipHierarchyCheck).getBody();
    }

    /**
     * List Users by Legal Entity Ids
     * Retrieve a paged list of Users by given list of legal entity Ids, with optional parameters for query and excluding user ids.  The list of users is sorted by Legal Entity ID, then Full Name and ultimately ID in ascending order. 
     * <p><b>200</b> - Successful response
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param getUsersByLegalEntityIdsRequest  (required)
     * @param skipHierarchyCheck When this queryParameter is true, the request will omit the Legal Entity hierarchy checks. The Legal Entity hierarchy checks are done against the user present in the internal JWT from the &#x60;X-CXT-User-Token&#x60; header.  (optional, default to false)
     * @return ResponseEntity&lt;GetUsersList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUsersList> getUsersByLegalEntityIdsWithHttpInfo(GetUsersByLegalEntityIdsRequest getUsersByLegalEntityIdsRequest, Boolean skipHierarchyCheck) throws RestClientException {
        Object localVarPostBody = getUsersByLegalEntityIdsRequest;
        
        // verify the required parameter 'getUsersByLegalEntityIdsRequest' is set
        if (getUsersByLegalEntityIdsRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'getUsersByLegalEntityIdsRequest' when calling getUsersByLegalEntityIds");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/users/legalentityids", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipHierarchyCheck", skipHierarchyCheck));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUsersList> localVarReturnType = new ParameterizedTypeReference<GetUsersList>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List Users by a list of their internal IDs
     * Initial call to retrieve the list of enrolled Users by Ids in the System that might belong to separate Legal Entities. 
     * <p><b>200</b> - Successfully returned
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * @param id Comma separated list of User Ids (required)
     * @param query The search term used to search users (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional)
     * @return GetUsersList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUsersList getUsersInBulk(String id, String query, Integer from, String cursor, Integer size) throws RestClientException {
        return getUsersInBulkWithHttpInfo(id, query, from, cursor, size).getBody();
    }

    /**
     * List Users by a list of their internal IDs
     * Initial call to retrieve the list of enrolled Users by Ids in the System that might belong to separate Legal Entities. 
     * <p><b>200</b> - Successfully returned
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * @param id Comma separated list of User Ids (required)
     * @param query The search term used to search users (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional)
     * @return ResponseEntity&lt;GetUsersList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUsersList> getUsersInBulkWithHttpInfo(String id, String query, Integer from, String cursor, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getUsersInBulk");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/users/bulk", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
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

        ParameterizedTypeReference<GetUsersList> localVarReturnType = new ParameterizedTypeReference<GetUsersList>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Ingest Users in Bulk
     * Ingest Users in Bulk API endpoint. For each User Item passed in the request this endpoint will create a new User if the user does not exist or will update it if it does. 
     * <p><b>207</b> - Multi-status response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * @param user  (required)
     * @return List&lt;BatchResponseItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BatchResponseItem> ingestUsers(List<User> user) throws RestClientException {
        return ingestUsersWithHttpInfo(user).getBody();
    }

    /**
     * Ingest Users in Bulk
     * Ingest Users in Bulk API endpoint. For each User Item passed in the request this endpoint will create a new User if the user does not exist or will update it if it does. 
     * <p><b>207</b> - Multi-status response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * @param user  (required)
     * @return ResponseEntity&lt;List&lt;BatchResponseItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BatchResponseItem>> ingestUsersWithHttpInfo(List<User> user) throws RestClientException {
        Object localVarPostBody = user;
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'user' when calling ingestUsers");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/users/bulk", Collections.<String, Object>emptyMap());

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
     * Update Users in Batch
     * Update batch of users. 
     * <p><b>207</b> - Multi-status response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * @param batchUser  (required)
     * @return List&lt;BatchResponseItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BatchResponseItem> updateUserInBatch(List<BatchUser> batchUser) throws RestClientException {
        return updateUserInBatchWithHttpInfo(batchUser).getBody();
    }

    /**
     * Update Users in Batch
     * Update batch of users. 
     * <p><b>207</b> - Multi-status response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * @param batchUser  (required)
     * @return ResponseEntity&lt;List&lt;BatchResponseItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BatchResponseItem>> updateUserInBatchWithHttpInfo(List<BatchUser> batchUser) throws RestClientException {
        Object localVarPostBody = batchUser;
        
        // verify the required parameter 'batchUser' is set
        if (batchUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchUser' when calling updateUserInBatch");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/users", Collections.<String, Object>emptyMap());

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
}
