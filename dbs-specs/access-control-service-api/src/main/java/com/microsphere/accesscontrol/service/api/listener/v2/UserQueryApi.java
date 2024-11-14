package com.microsphere.accesscontrol.service.api.listener.v2;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;

import com.microsphere.accesscontrol.service.api.listener.v2.model.ArrangementPrivilegesGetResponseBody;
import com.microsphere.accesscontrol.service.api.listener.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ContextLegalEntities;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PersistenceApprovalPermissions;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PersistenceUserDataItemPermission;
import com.microsphere.accesscontrol.service.api.listener.v2.model.UserAccessEntitlementsResource;
import com.microsphere.accesscontrol.service.api.listener.v2.model.UserAccessLegalEntities;
import com.microsphere.accesscontrol.service.api.listener.v2.model.UserAccessServiceAgreement;
import com.microsphere.accesscontrol.service.api.listener.v2.model.UserFunctionGroups;

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
@Component("com.microsphere.accesscontrol.service.api.listener.v2.UserQueryApi")

public class UserQueryApi {
    private final ApiClient apiClient;


    @Autowired
    public UserQueryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * User Access GET.
     * # User Access GET    Request method GET for fetching all arrangements with privileges  by functionName and resourceName as required,  and userId, serviceAgreementId, legalEntityId, arrangementId and privilege as optional.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - List of arrangements with privileges retrieved.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param functionName Name of Function (required)
     * @param resourceName Name of resource (required)
     * @param userId User ID (optional)
     * @param serviceAgreementId Service Agreement ID (optional)
     * @param legalEntityId Legal Entity ID (optional)
     * @param arrangementId Arrangement ID (optional)
     * @param privilege Privilege (optional)
     * @return List&lt;ArrangementPrivilegesGetResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public List<ArrangementPrivilegesGetResponseBody> getArrangementPrivilegesQuery(String functionName, String resourceName, String userId, String serviceAgreementId, String legalEntityId, String arrangementId, String privilege) throws RestClientException {
        return getArrangementPrivilegesQueryWithHttpInfo(functionName, resourceName, userId, serviceAgreementId, legalEntityId, arrangementId, privilege).getBody();
    }

    /**
     * User Access GET.
     * # User Access GET    Request method GET for fetching all arrangements with privileges  by functionName and resourceName as required,  and userId, serviceAgreementId, legalEntityId, arrangementId and privilege as optional.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - List of arrangements with privileges retrieved.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param functionName Name of Function (required)
     * @param resourceName Name of resource (required)
     * @param userId User ID (optional)
     * @param serviceAgreementId Service Agreement ID (optional)
     * @param legalEntityId Legal Entity ID (optional)
     * @param arrangementId Arrangement ID (optional)
     * @param privilege Privilege (optional)
     * @return ResponseEntity&lt;List&lt;ArrangementPrivilegesGetResponseBody&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<List<ArrangementPrivilegesGetResponseBody>> getArrangementPrivilegesQueryWithHttpInfo(String functionName, String resourceName, String userId, String serviceAgreementId, String legalEntityId, String arrangementId, String privilege) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'functionName' is set
        if (functionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'functionName' when calling getArrangementPrivilegesQuery");
        }
        
        // verify the required parameter 'resourceName' is set
        if (resourceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resourceName' when calling getArrangementPrivilegesQuery");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/users/privileges/arrangements", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "serviceAgreementId", serviceAgreementId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "functionName", functionName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "resourceName", resourceName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "legalEntityId", legalEntityId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "arrangementId", arrangementId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "privilege", privilege));

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
     * User Permissions per Data Item GET.
     * # User Permissions per Data Item GET    Request method GET for fetching user permissions per data item for given  businessFunction or resource or privilege or dataGroupType or dataItemId.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - List of privileges retrieved.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param userId User id (required)
     * @param serviceAgreementId Service agreement id (required)
     * @param businessFunction Name of the business function (optional)
     * @param resource Name of resource (optional)
     * @param privilege Name of the privilege (optional)
     * @param dataGroupType Name of the data group type (optional)
     * @param dataItemId Id of the data item (optional)
     * @return List&lt;PersistenceUserDataItemPermission&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PersistenceUserDataItemPermission> getDataItemPermissions(String userId, String serviceAgreementId, String businessFunction, String resource, String privilege, String dataGroupType, String dataItemId) throws RestClientException {
        return getDataItemPermissionsWithHttpInfo(userId, serviceAgreementId, businessFunction, resource, privilege, dataGroupType, dataItemId).getBody();
    }

    /**
     * User Permissions per Data Item GET.
     * # User Permissions per Data Item GET    Request method GET for fetching user permissions per data item for given  businessFunction or resource or privilege or dataGroupType or dataItemId.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - List of privileges retrieved.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param userId User id (required)
     * @param serviceAgreementId Service agreement id (required)
     * @param businessFunction Name of the business function (optional)
     * @param resource Name of resource (optional)
     * @param privilege Name of the privilege (optional)
     * @param dataGroupType Name of the data group type (optional)
     * @param dataItemId Id of the data item (optional)
     * @return ResponseEntity&lt;List&lt;PersistenceUserDataItemPermission&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PersistenceUserDataItemPermission>> getDataItemPermissionsWithHttpInfo(String userId, String serviceAgreementId, String businessFunction, String resource, String privilege, String dataGroupType, String dataItemId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getDataItemPermissions");
        }
        
        // verify the required parameter 'serviceAgreementId' is set
        if (serviceAgreementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementId' when calling getDataItemPermissions");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("userId", userId);
        localVarUriVariables.put("serviceAgreementId", serviceAgreementId);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/users/{userId}/service-agreements/{serviceAgreementId}/data-item-permissions", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "businessFunction", businessFunction));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "resource", resource));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "privilege", privilege));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "dataGroupType", dataGroupType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "dataItemId", dataItemId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PersistenceUserDataItemPermission>> localVarReturnType = new ParameterizedTypeReference<List<PersistenceUserDataItemPermission>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * User Permissions GET.
     * # User Permissions GET    Request method GET for fetching user permissions for given user and service agreement.  Response contains approvalId if there is pending approval for permissions.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Users permissions successfully retrieved.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param userId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @param serviceAgreementId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @return PersistenceApprovalPermissions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PersistenceApprovalPermissions getPersistenceApprovalPermissions(String userId, String serviceAgreementId) throws RestClientException {
        return getPersistenceApprovalPermissionsWithHttpInfo(userId, serviceAgreementId).getBody();
    }

    /**
     * User Permissions GET.
     * # User Permissions GET    Request method GET for fetching user permissions for given user and service agreement.  Response contains approvalId if there is pending approval for permissions.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Users permissions successfully retrieved.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param userId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @param serviceAgreementId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @return ResponseEntity&lt;PersistenceApprovalPermissions&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PersistenceApprovalPermissions> getPersistenceApprovalPermissionsWithHttpInfo(String userId, String serviceAgreementId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getPersistenceApprovalPermissions");
        }
        
        // verify the required parameter 'serviceAgreementId' is set
        if (serviceAgreementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementId' when calling getPersistenceApprovalPermissions");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("userId", userId);
        localVarUriVariables.put("serviceAgreementId", serviceAgreementId);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/users/{userId}/service-agreements/{serviceAgreementId}/permissions", localVarUriVariables);

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

        ParameterizedTypeReference<PersistenceApprovalPermissions> localVarReturnType = new ParameterizedTypeReference<PersistenceApprovalPermissions>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * User Access GET.
     * # User Access GET    Request method GET to check if the user has the specified privileges to perform a function on a given resource.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - User is permitted to perform the function.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param userId User ID (required)
     * @param resource Resource name. (required)
     * @param function function name. (required)
     * @param privileges Comma-separated privileges. (required)
     * @param serviceAgreementId Service Agreement ID (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getUserPermissionCheckQuery(String userId, String resource, String function, String privileges, String serviceAgreementId) throws RestClientException {
        getUserPermissionCheckQueryWithHttpInfo(userId, resource, function, privileges, serviceAgreementId);
    }

    /**
     * User Access GET.
     * # User Access GET    Request method GET to check if the user has the specified privileges to perform a function on a given resource.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - User is permitted to perform the function.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param userId User ID (required)
     * @param resource Resource name. (required)
     * @param function function name. (required)
     * @param privileges Comma-separated privileges. (required)
     * @param serviceAgreementId Service Agreement ID (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getUserPermissionCheckQueryWithHttpInfo(String userId, String resource, String function, String privileges, String serviceAgreementId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserPermissionCheckQuery");
        }
        
        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resource' when calling getUserPermissionCheckQuery");
        }
        
        // verify the required parameter 'function' is set
        if (function == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'function' when calling getUserPermissionCheckQuery");
        }
        
        // verify the required parameter 'privileges' is set
        if (privileges == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'privileges' when calling getUserPermissionCheckQuery");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/users/permissions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "serviceAgreementId", serviceAgreementId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "resource", resource));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "function", function));
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
     * Users Function Groups - &#x60;GET&#x60;.
     * # Users Function Groups - &#x60;GET&#x60;    Request method GET for fetching user internal ids together with assigned function group internal ids.  
     * <p><b>200</b> - List of users/function groups retrieved successfully.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Data item type and id must be both provided or omitted.    | Message | key |  --- | --- |  |Data item type and id must be both provided or omitted|datagroup.parameters.invalid.TYPE_AND_ITEM_ID|  
     * @param serviceAgreementId Service Agreement ID (required)
     * @param functionName Function name. (required)
     * @param privilege Name of the privilege (optional)
     * @param dataGroupType Name of the data group type (optional)
     * @param dataItemId Id of the data item (optional)
     * @return List&lt;UserFunctionGroups&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UserFunctionGroups> getUsersFunctionGroups(String serviceAgreementId, String functionName, String privilege, String dataGroupType, String dataItemId) throws RestClientException {
        return getUsersFunctionGroupsWithHttpInfo(serviceAgreementId, functionName, privilege, dataGroupType, dataItemId).getBody();
    }

    /**
     * Users Function Groups - &#x60;GET&#x60;.
     * # Users Function Groups - &#x60;GET&#x60;    Request method GET for fetching user internal ids together with assigned function group internal ids.  
     * <p><b>200</b> - List of users/function groups retrieved successfully.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Data item type and id must be both provided or omitted.    | Message | key |  --- | --- |  |Data item type and id must be both provided or omitted|datagroup.parameters.invalid.TYPE_AND_ITEM_ID|  
     * @param serviceAgreementId Service Agreement ID (required)
     * @param functionName Function name. (required)
     * @param privilege Name of the privilege (optional)
     * @param dataGroupType Name of the data group type (optional)
     * @param dataItemId Id of the data item (optional)
     * @return ResponseEntity&lt;List&lt;UserFunctionGroups&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UserFunctionGroups>> getUsersFunctionGroupsWithHttpInfo(String serviceAgreementId, String functionName, String privilege, String dataGroupType, String dataItemId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'serviceAgreementId' is set
        if (serviceAgreementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementId' when calling getUsersFunctionGroups");
        }
        
        // verify the required parameter 'functionName' is set
        if (functionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'functionName' when calling getUsersFunctionGroups");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/users/function-groups/by-permissions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "serviceAgreementId", serviceAgreementId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "functionName", functionName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "privilege", privilege));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "dataGroupType", dataGroupType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "dataItemId", dataItemId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<UserFunctionGroups>> localVarReturnType = new ParameterizedTypeReference<List<UserFunctionGroups>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * User Access Legal Entities.
     * # User Access Legal Entities    Request method POST for checking to which legal entities the user has access to.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Legal Entities in context
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param userAccessLegalEntities # User Access Legal Entities    Request method POST for checking to which legal entities the user has access to.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**   (optional)
     * @return ContextLegalEntities
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ContextLegalEntities postLegalEntitiesInContext(UserAccessLegalEntities userAccessLegalEntities) throws RestClientException {
        return postLegalEntitiesInContextWithHttpInfo(userAccessLegalEntities).getBody();
    }

    /**
     * User Access Legal Entities.
     * # User Access Legal Entities    Request method POST for checking to which legal entities the user has access to.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Legal Entities in context
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param userAccessLegalEntities # User Access Legal Entities    Request method POST for checking to which legal entities the user has access to.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**   (optional)
     * @return ResponseEntity&lt;ContextLegalEntities&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ContextLegalEntities> postLegalEntitiesInContextWithHttpInfo(UserAccessLegalEntities userAccessLegalEntities) throws RestClientException {
        Object localVarPostBody = userAccessLegalEntities;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/users/access/legalentities", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ContextLegalEntities> localVarReturnType = new ParameterizedTypeReference<ContextLegalEntities>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * User Access Hierarchy.
     * # User Access Hierarchy    Request method POST for checking if a provided user has access to the provided list of resource ids.  Returns list of resource ids that the provided user has access to, a sub list of the provided ids.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Legal Entities that the user has access to
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param userAccessEntitlementsResource # User Access Hierarchy    Request method POST for checking if a provided user has access to the provided list of resource ids.  Returns list of resource ids that the provided user has access to, a sub list of the provided ids.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**   (optional)
     * @return ContextLegalEntities
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ContextLegalEntities postUserAccessToEntitlementsResource(UserAccessEntitlementsResource userAccessEntitlementsResource) throws RestClientException {
        return postUserAccessToEntitlementsResourceWithHttpInfo(userAccessEntitlementsResource).getBody();
    }

    /**
     * User Access Hierarchy.
     * # User Access Hierarchy    Request method POST for checking if a provided user has access to the provided list of resource ids.  Returns list of resource ids that the provided user has access to, a sub list of the provided ids.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Legal Entities that the user has access to
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param userAccessEntitlementsResource # User Access Hierarchy    Request method POST for checking if a provided user has access to the provided list of resource ids.  Returns list of resource ids that the provided user has access to, a sub list of the provided ids.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**   (optional)
     * @return ResponseEntity&lt;ContextLegalEntities&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ContextLegalEntities> postUserAccessToEntitlementsResourceWithHttpInfo(UserAccessEntitlementsResource userAccessEntitlementsResource) throws RestClientException {
        Object localVarPostBody = userAccessEntitlementsResource;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/users/access/resources", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ContextLegalEntities> localVarReturnType = new ParameterizedTypeReference<ContextLegalEntities>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * User Access Service agreement.
     * # User Access Service agreement    Request method POST for checking if a given user has access to the given service agreement.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>204</b> - User Access to Service Agreement check
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param userAccessServiceAgreement # User Access Service agreement    Request method POST for checking if a given user has access to the given service agreement.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**   (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postUserAccessToServiceAgreement(UserAccessServiceAgreement userAccessServiceAgreement) throws RestClientException {
        postUserAccessToServiceAgreementWithHttpInfo(userAccessServiceAgreement);
    }

    /**
     * User Access Service agreement.
     * # User Access Service agreement    Request method POST for checking if a given user has access to the given service agreement.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>204</b> - User Access to Service Agreement check
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param userAccessServiceAgreement # User Access Service agreement    Request method POST for checking if a given user has access to the given service agreement.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**   (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postUserAccessToServiceAgreementWithHttpInfo(UserAccessServiceAgreement userAccessServiceAgreement) throws RestClientException {
        Object localVarPostBody = userAccessServiceAgreement;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/users/access/serviceagreement", Collections.<String, Object>emptyMap());

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
}
