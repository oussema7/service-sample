package com.microsphere.accesscontrol.service.api.listener.v2;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;

import com.microsphere.accesscontrol.service.api.listener.v2.model.ArrangementPrivilegesGetResponseBody;
import com.microsphere.accesscontrol.service.api.listener.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.BatchResponseItemExtended;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationAssignUserPermissions;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PrivilegesGetResponseBody;
import com.microsphere.accesscontrol.service.api.listener.v2.model.UserPermissionsSummaryGetResponseBody;

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
@Component("com.microsphere.accesscontrol.service.api.listener.v2.UsersApi")

public class UsersApi {
    private final ApiClient apiClient;


    @Autowired
    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Arrangement permission check.
     * # Arrangement permission check.    Checks permissions for a single arrangement item.
     * <p><b>200</b> - User has access to the given arrangement.
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * <p><b>400</b> - BadRequest
     * @param id Arrangement ID (required)
     * @param userId User ID (required)
     * @param resource Resource name. (required)
     * @param function function name. (required)
     * @param privilege Privilege name. (required)
     * @param serviceAgreementId Service Agreement ID (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public void getArrangementPermissionCheck(String id, String userId, String resource, String function, String privilege, String serviceAgreementId) throws RestClientException {
        getArrangementPermissionCheckWithHttpInfo(id, userId, resource, function, privilege, serviceAgreementId);
    }

    /**
     * Arrangement permission check.
     * # Arrangement permission check.    Checks permissions for a single arrangement item.
     * <p><b>200</b> - User has access to the given arrangement.
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * <p><b>400</b> - BadRequest
     * @param id Arrangement ID (required)
     * @param userId User ID (required)
     * @param resource Resource name. (required)
     * @param function function name. (required)
     * @param privilege Privilege name. (required)
     * @param serviceAgreementId Service Agreement ID (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<Void> getArrangementPermissionCheckWithHttpInfo(String id, String userId, String resource, String function, String privilege, String serviceAgreementId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getArrangementPermissionCheck");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getArrangementPermissionCheck");
        }
        
        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resource' when calling getArrangementPermissionCheck");
        }
        
        // verify the required parameter 'function' is set
        if (function == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'function' when calling getArrangementPermissionCheck");
        }
        
        // verify the required parameter 'privilege' is set
        if (privilege == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'privilege' when calling getArrangementPermissionCheck");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/users/privileges/arrangements/{id}", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "serviceAgreementId", serviceAgreementId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "resource", resource));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "function", function));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "privilege", privilege));

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
     * List Arrangements that user has access to - &#x60;GET&#x60;.
     * # List Arrangements that user has access to - &#x60;GET&#x60;    Provides (retrieve) list of Arrangements along with appropriate privilege(s) that given User has access to.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.GetArrangementPrivilegesRoute  * Route Id: GetArrangementPrivilegesRoute  * Route source endpoint: direct:business.GetArrangementPrivileges  * Route destination endpoint: direct:getArrangementPrivilegesRequestedInternal
     * <p><b>200</b> - Arrangements with their privileges for the given user have been successfully listed.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param userId User Id (required)
     * @param functionName Name of function (required)
     * @param resourceName Name of resource (required)
     * @param serviceAgreementId Service Agreement Id (optional)
     * @param privilegeName Name of privilege (optional)
     * @return List&lt;ArrangementPrivilegesGetResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public List<ArrangementPrivilegesGetResponseBody> getArrangementPrivileges(String userId, String functionName, String resourceName, String serviceAgreementId, String privilegeName) throws RestClientException {
        return getArrangementPrivilegesWithHttpInfo(userId, functionName, resourceName, serviceAgreementId, privilegeName).getBody();
    }

    /**
     * List Arrangements that user has access to - &#x60;GET&#x60;.
     * # List Arrangements that user has access to - &#x60;GET&#x60;    Provides (retrieve) list of Arrangements along with appropriate privilege(s) that given User has access to.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.GetArrangementPrivilegesRoute  * Route Id: GetArrangementPrivilegesRoute  * Route source endpoint: direct:business.GetArrangementPrivileges  * Route destination endpoint: direct:getArrangementPrivilegesRequestedInternal
     * <p><b>200</b> - Arrangements with their privileges for the given user have been successfully listed.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param userId User Id (required)
     * @param functionName Name of function (required)
     * @param resourceName Name of resource (required)
     * @param serviceAgreementId Service Agreement Id (optional)
     * @param privilegeName Name of privilege (optional)
     * @return ResponseEntity&lt;List&lt;ArrangementPrivilegesGetResponseBody&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<List<ArrangementPrivilegesGetResponseBody>> getArrangementPrivilegesWithHttpInfo(String userId, String functionName, String resourceName, String serviceAgreementId, String privilegeName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getArrangementPrivileges");
        }
        
        // verify the required parameter 'functionName' is set
        if (functionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'functionName' when calling getArrangementPrivileges");
        }
        
        // verify the required parameter 'resourceName' is set
        if (resourceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resourceName' when calling getArrangementPrivileges");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/users/privileges/arrangements", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "serviceAgreementId", serviceAgreementId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "functionName", functionName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "resourceName", resourceName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "privilegeName", privilegeName));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ArrangementPrivilegesGetResponseBody>> localVarReturnType = new ParameterizedTypeReference<List<ArrangementPrivilegesGetResponseBody>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Arrangement permission check.
     * # Arrangement permission check.    Checks permissions for a single arrangement item.
     * <p><b>200</b> - User has access to the given arrangement.
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - BadRequest
     * @param id Arrangement ID (required)
     * @param resource Resource name. (required)
     * @param function function name. (required)
     * @param privilege Privilege name. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getArrangementUserPermissionCheck(String id, String resource, String function, String privilege) throws RestClientException {
        getArrangementUserPermissionCheckWithHttpInfo(id, resource, function, privilege);
    }

    /**
     * Arrangement permission check.
     * # Arrangement permission check.    Checks permissions for a single arrangement item.
     * <p><b>200</b> - User has access to the given arrangement.
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - BadRequest
     * @param id Arrangement ID (required)
     * @param resource Resource name. (required)
     * @param function function name. (required)
     * @param privilege Privilege name. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getArrangementUserPermissionCheckWithHttpInfo(String id, String resource, String function, String privilege) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getArrangementUserPermissionCheck");
        }
        
        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resource' when calling getArrangementUserPermissionCheck");
        }
        
        // verify the required parameter 'function' is set
        if (function == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'function' when calling getArrangementUserPermissionCheck");
        }
        
        // verify the required parameter 'privilege' is set
        if (privilege == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'privilege' when calling getArrangementUserPermissionCheck");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/users/user-privileges/arrangements/{id}", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "resource", resource));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "function", function));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "privilege", privilege));

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
     * List Arrangements that user has access to - &#x60;GET&#x60;.
     * # List Arrangements that user has access to - &#x60;GET&#x60;    Provides (retrieve) list of Arrangements along with appropriate privilege(s) that given User has access to.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.GetArrangementPrivilegesRoute  * Route Id: GetArrangementPrivilegesRoute  * Route source endpoint: direct:business.GetArrangementPrivileges  * Route destination endpoint: direct:getArrangementPrivilegesRequestedInternal
     * <p><b>200</b> - Arrangements with their privileges for the given user have been successfully listed.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param functionName Name of function (required)
     * @param resourceName Name of resource (required)
     * @param privilegeName Name of privilege (optional)
     * @return List&lt;ArrangementPrivilegesGetResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ArrangementPrivilegesGetResponseBody> getArrangementUserPrivileges(String functionName, String resourceName, String privilegeName) throws RestClientException {
        return getArrangementUserPrivilegesWithHttpInfo(functionName, resourceName, privilegeName).getBody();
    }

    /**
     * List Arrangements that user has access to - &#x60;GET&#x60;.
     * # List Arrangements that user has access to - &#x60;GET&#x60;    Provides (retrieve) list of Arrangements along with appropriate privilege(s) that given User has access to.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.GetArrangementPrivilegesRoute  * Route Id: GetArrangementPrivilegesRoute  * Route source endpoint: direct:business.GetArrangementPrivileges  * Route destination endpoint: direct:getArrangementPrivilegesRequestedInternal
     * <p><b>200</b> - Arrangements with their privileges for the given user have been successfully listed.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param functionName Name of function (required)
     * @param resourceName Name of resource (required)
     * @param privilegeName Name of privilege (optional)
     * @return ResponseEntity&lt;List&lt;ArrangementPrivilegesGetResponseBody&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ArrangementPrivilegesGetResponseBody>> getArrangementUserPrivilegesWithHttpInfo(String functionName, String resourceName, String privilegeName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'functionName' is set
        if (functionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'functionName' when calling getArrangementUserPrivileges");
        }
        
        // verify the required parameter 'resourceName' is set
        if (resourceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resourceName' when calling getArrangementUserPrivileges");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/users/user-privileges/arrangements", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "functionName", functionName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "resourceName", resourceName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "privilegeName", privilegeName));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ArrangementPrivilegesGetResponseBody>> localVarReturnType = new ParameterizedTypeReference<List<ArrangementPrivilegesGetResponseBody>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Check if User is allowed to perform given action - &#x60;GET&#x60;.
     * # Check if User is allowed to perform given action - &#x60;GET&#x60;    Checks if the user has the specific privileges for given business function.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ValidatePermissionsRoute  * Route Id: ValidatePermissionsRoute  * Route source endpoint: direct:business.ValidatePermissions  * Route destination endpoint: direct:validatePermissionsRequestedInternal  
     * <p><b>200</b> - User is allowed perform this action.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param functionName Name of Function (required)
     * @param resourceName Name of Resource (required)
     * @param privileges comma-separated privileges. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCheckUserPermission(String functionName, String resourceName, String privileges) throws RestClientException {
        getCheckUserPermissionWithHttpInfo(functionName, resourceName, privileges);
    }

    /**
     * Check if User is allowed to perform given action - &#x60;GET&#x60;.
     * # Check if User is allowed to perform given action - &#x60;GET&#x60;    Checks if the user has the specific privileges for given business function.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ValidatePermissionsRoute  * Route Id: ValidatePermissionsRoute  * Route source endpoint: direct:business.ValidatePermissions  * Route destination endpoint: direct:validatePermissionsRequestedInternal  
     * <p><b>200</b> - User is allowed perform this action.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param functionName Name of Function (required)
     * @param resourceName Name of Resource (required)
     * @param privileges comma-separated privileges. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getCheckUserPermissionWithHttpInfo(String functionName, String resourceName, String privileges) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'functionName' is set
        if (functionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'functionName' when calling getCheckUserPermission");
        }
        
        // verify the required parameter 'resourceName' is set
        if (resourceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resourceName' when calling getCheckUserPermission");
        }
        
        // verify the required parameter 'privileges' is set
        if (privileges == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'privileges' when calling getCheckUserPermission");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/users/user-permissions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "functionName", functionName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "resourceName", resourceName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "privileges", privileges));

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
     * List User privileges for given Business function - &#x60;GET&#x60;.
     * # List User privileges for given Business function - &#x60;GET&#x60;    Provides a list of user privileges for given business function (eg. Contacts).    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ListPrivilegesRoute  * Route Id: ListPrivilegesRoute  * Route source endpoint: direct:business.ListPrivileges  * Route destination endpoint: direct:listPrivilegesRequestedInternal
     * <p><b>200</b> - User privileges for given business function listed successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param userId User ID (required)
     * @param functionName Name of Function (required)
     * @param resourceName Name of Resource (required)
     * @param serviceAgreementId Service Agreement Id (optional)
     * @return List&lt;PrivilegesGetResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public List<PrivilegesGetResponseBody> getPrivileges(String userId, String functionName, String resourceName, String serviceAgreementId) throws RestClientException {
        return getPrivilegesWithHttpInfo(userId, functionName, resourceName, serviceAgreementId).getBody();
    }

    /**
     * List User privileges for given Business function - &#x60;GET&#x60;.
     * # List User privileges for given Business function - &#x60;GET&#x60;    Provides a list of user privileges for given business function (eg. Contacts).    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ListPrivilegesRoute  * Route Id: ListPrivilegesRoute  * Route source endpoint: direct:business.ListPrivileges  * Route destination endpoint: direct:listPrivilegesRequestedInternal
     * <p><b>200</b> - User privileges for given business function listed successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param userId User ID (required)
     * @param functionName Name of Function (required)
     * @param resourceName Name of Resource (required)
     * @param serviceAgreementId Service Agreement Id (optional)
     * @return ResponseEntity&lt;List&lt;PrivilegesGetResponseBody&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<List<PrivilegesGetResponseBody>> getPrivilegesWithHttpInfo(String userId, String functionName, String resourceName, String serviceAgreementId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getPrivileges");
        }
        
        // verify the required parameter 'functionName' is set
        if (functionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'functionName' when calling getPrivileges");
        }
        
        // verify the required parameter 'resourceName' is set
        if (resourceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resourceName' when calling getPrivileges");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/users/privileges", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "serviceAgreementId", serviceAgreementId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "functionName", functionName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "resourceName", resourceName));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PrivilegesGetResponseBody>> localVarReturnType = new ParameterizedTypeReference<List<PrivilegesGetResponseBody>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Check if User is allowed to perform given action - &#x60;GET&#x60;.
     * # Check if User is allowed to perform given action - &#x60;GET&#x60;    Checks if the user has the specific privileges for given business function.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ValidatePermissionsRoute  * Route Id: ValidatePermissionsRoute  * Route source endpoint: direct:business.ValidatePermissions  * Route destination endpoint: direct:validatePermissionsRequestedInternal  
     * <p><b>200</b> - User is allowed perform this action.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param userId User Id (required)
     * @param functionName Name of Function (required)
     * @param resourceName Name of Resource (required)
     * @param privileges comma-separated privileges. (required)
     * @param serviceAgreementId Service Agreement Id (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public void getUserPermissionCheck(String userId, String functionName, String resourceName, String privileges, String serviceAgreementId) throws RestClientException {
        getUserPermissionCheckWithHttpInfo(userId, functionName, resourceName, privileges, serviceAgreementId);
    }

    /**
     * Check if User is allowed to perform given action - &#x60;GET&#x60;.
     * # Check if User is allowed to perform given action - &#x60;GET&#x60;    Checks if the user has the specific privileges for given business function.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ValidatePermissionsRoute  * Route Id: ValidatePermissionsRoute  * Route source endpoint: direct:business.ValidatePermissions  * Route destination endpoint: direct:validatePermissionsRequestedInternal  
     * <p><b>200</b> - User is allowed perform this action.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param userId User Id (required)
     * @param functionName Name of Function (required)
     * @param resourceName Name of Resource (required)
     * @param privileges comma-separated privileges. (required)
     * @param serviceAgreementId Service Agreement Id (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<Void> getUserPermissionCheckWithHttpInfo(String userId, String functionName, String resourceName, String privileges, String serviceAgreementId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserPermissionCheck");
        }
        
        // verify the required parameter 'functionName' is set
        if (functionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'functionName' when calling getUserPermissionCheck");
        }
        
        // verify the required parameter 'resourceName' is set
        if (resourceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resourceName' when calling getUserPermissionCheck");
        }
        
        // verify the required parameter 'privileges' is set
        if (privileges == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'privileges' when calling getUserPermissionCheck");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/users/permissions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "serviceAgreementId", serviceAgreementId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "functionName", functionName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "resourceName", resourceName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "privileges", privileges));

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
     * User Permissions Summary - &#x60;GET&#x60;.
     * # User Permissions Summary - &#x60;GET&#x60;    Returns aggregated summary of user permissions.  Returned data structure will contain all allowed Resources + Business Functions + Permissions.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.GetUserPrivilegesSummaryRoute  * Route Id: GetUserPrivilegesSummaryRoute  * Route source endpoint: direct:business.getUserPrivilegesSummary  * Route destination endpoint: direct:getUserPrivilegesSummaryRequestedInternal
     * <p><b>200</b> - response
     * <p><b>400</b> - BadRequest
     * @return List&lt;UserPermissionsSummaryGetResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UserPermissionsSummaryGetResponseBody> getUserPermissionsSummary() throws RestClientException {
        return getUserPermissionsSummaryWithHttpInfo().getBody();
    }

    /**
     * User Permissions Summary - &#x60;GET&#x60;.
     * # User Permissions Summary - &#x60;GET&#x60;    Returns aggregated summary of user permissions.  Returned data structure will contain all allowed Resources + Business Functions + Permissions.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.GetUserPrivilegesSummaryRoute  * Route Id: GetUserPrivilegesSummaryRoute  * Route source endpoint: direct:business.getUserPrivilegesSummary  * Route destination endpoint: direct:getUserPrivilegesSummaryRequestedInternal
     * <p><b>200</b> - response
     * <p><b>400</b> - BadRequest
     * @return ResponseEntity&lt;List&lt;UserPermissionsSummaryGetResponseBody&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UserPermissionsSummaryGetResponseBody>> getUserPermissionsSummaryWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/users/permissions/summary", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<UserPermissionsSummaryGetResponseBody>> localVarReturnType = new ParameterizedTypeReference<List<UserPermissionsSummaryGetResponseBody>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List User privileges for given Business function - &#x60;GET&#x60;.
     * # List User privileges for given Business function - &#x60;GET&#x60;    Provides a list of user privileges for given business function (eg. Contacts).    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ListPrivilegesRoute  * Route Id: ListPrivilegesRoute  * Route source endpoint: direct:business.ListPrivileges  * Route destination endpoint: direct:listPrivilegesRequestedInternal
     * <p><b>200</b> - User privileges for given business function listed successfully.
     * <p><b>400</b> - BadRequest
     * @param functionName Name of Function (required)
     * @param resourceName Name of Resource (required)
     * @return List&lt;PrivilegesGetResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PrivilegesGetResponseBody> getUserPrivileges(String functionName, String resourceName) throws RestClientException {
        return getUserPrivilegesWithHttpInfo(functionName, resourceName).getBody();
    }

    /**
     * List User privileges for given Business function - &#x60;GET&#x60;.
     * # List User privileges for given Business function - &#x60;GET&#x60;    Provides a list of user privileges for given business function (eg. Contacts).    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.useraccess.ListPrivilegesRoute  * Route Id: ListPrivilegesRoute  * Route source endpoint: direct:business.ListPrivileges  * Route destination endpoint: direct:listPrivilegesRequestedInternal
     * <p><b>200</b> - User privileges for given business function listed successfully.
     * <p><b>400</b> - BadRequest
     * @param functionName Name of Function (required)
     * @param resourceName Name of Resource (required)
     * @return ResponseEntity&lt;List&lt;PrivilegesGetResponseBody&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PrivilegesGetResponseBody>> getUserPrivilegesWithHttpInfo(String functionName, String resourceName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'functionName' is set
        if (functionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'functionName' when calling getUserPrivileges");
        }
        
        // verify the required parameter 'resourceName' is set
        if (resourceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resourceName' when calling getUserPrivileges");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/users/user-privileges", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "functionName", functionName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "resourceName", resourceName));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PrivilegesGetResponseBody>> localVarReturnType = new ParameterizedTypeReference<List<PrivilegesGetResponseBody>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates permissions for a list of users. - Put.
     * # Updates permissions for a list of users. - Put    Updates permissions for a list of users.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * <p><b>207</b> - MultiStatusExtended
     * @param presentationAssignUserPermissions # Updates permissions for a list of users. - Put    Updates permissions for a list of users. (optional)
     * @return List&lt;BatchResponseItemExtended&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BatchResponseItemExtended> putAssignUserPermissions(List<PresentationAssignUserPermissions> presentationAssignUserPermissions) throws RestClientException {
        return putAssignUserPermissionsWithHttpInfo(presentationAssignUserPermissions).getBody();
    }

    /**
     * Updates permissions for a list of users. - Put.
     * # Updates permissions for a list of users. - Put    Updates permissions for a list of users.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * <p><b>207</b> - MultiStatusExtended
     * @param presentationAssignUserPermissions # Updates permissions for a list of users. - Put    Updates permissions for a list of users. (optional)
     * @return ResponseEntity&lt;List&lt;BatchResponseItemExtended&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BatchResponseItemExtended>> putAssignUserPermissionsWithHttpInfo(List<PresentationAssignUserPermissions> presentationAssignUserPermissions) throws RestClientException {
        Object localVarPostBody = presentationAssignUserPermissions;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/users/permissions/user-permissions", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<BatchResponseItemExtended>> localVarReturnType = new ParameterizedTypeReference<List<BatchResponseItemExtended>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
