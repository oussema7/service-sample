package com.microsphere.accesscontrol.service.api.listener.v2;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;

import com.microsphere.accesscontrol.service.api.listener.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.DataItemsPermissions;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.GetContexts;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PermissionsDataGroup;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PermissionsRequest;

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
@Component("com.microsphere.accesscontrol.service.api.listener.v2.UserContextApi")

public class UserContextApi {
    private final ApiClient apiClient;


    @Autowired
    public UserContextApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * 
     * Permissions for data items
     * <p><b>204</b> - Data items permissions success response
     * <p><b>400</b> - ### Reasons for getting HTTP status code 400:     | Message | key |   | --- | --- |   | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE |   | Data items can not be null | permissions.dataItemsPermission.INVALID_DATA_ITEM_NULL |   | Data item id or type must be unique | permissions.dataItemsPermission.UNIQUE_ID_AND_TYPE |   | Privilege not valid for business function group | permissions.dataItemsPermission.INVALID_PRIVILEGE |   
     * <p><b>403</b> - ### Reasons for getting HTTP status code 403:     | Message | key |   | --- | --- |   | User does not have permission for provided data items | permissions.dataItemsPermission.NO_PERMISSION |   
     * @param dataItemsPermissions DataItemsPermissions body (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getDataItemsPermissions(DataItemsPermissions dataItemsPermissions) throws RestClientException {
        getDataItemsPermissionsWithHttpInfo(dataItemsPermissions);
    }

    /**
     * 
     * Permissions for data items
     * <p><b>204</b> - Data items permissions success response
     * <p><b>400</b> - ### Reasons for getting HTTP status code 400:     | Message | key |   | --- | --- |   | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE |   | Data items can not be null | permissions.dataItemsPermission.INVALID_DATA_ITEM_NULL |   | Data item id or type must be unique | permissions.dataItemsPermission.UNIQUE_ID_AND_TYPE |   | Privilege not valid for business function group | permissions.dataItemsPermission.INVALID_PRIVILEGE |   
     * <p><b>403</b> - ### Reasons for getting HTTP status code 403:     | Message | key |   | --- | --- |   | User does not have permission for provided data items | permissions.dataItemsPermission.NO_PERMISSION |   
     * @param dataItemsPermissions DataItemsPermissions body (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getDataItemsPermissionsWithHttpInfo(DataItemsPermissions dataItemsPermissions) throws RestClientException {
        Object localVarPostBody = dataItemsPermissions;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/usercontext/data-items/permissions", Collections.<String, Object>emptyMap());

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
     * Retrieve user context data group permissions.
     * Retrieve user context data group permissions.
     * <p><b>200</b> - Permissions data group
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:     * Data group type is invalid     | Message | key |   | --- | --- |   | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE |  
     * @param permissionsRequest # User context data group permissions - &#x60;POST&#x60;    Returns list of permissions with data groups and items filtered by user context user id and service agreement id (fallback  on MSA if no service agreement provided in the context) and data group types, resource name,  business function name and privileges provided in the request body.    ###Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.accesscontrol.business.flows.useraccess.GetPermissionDataGroupsFlow   (optional)
     * @return PermissionsDataGroup
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PermissionsDataGroup getUserContextPermissions(PermissionsRequest permissionsRequest) throws RestClientException {
        return getUserContextPermissionsWithHttpInfo(permissionsRequest).getBody();
    }

    /**
     * Retrieve user context data group permissions.
     * Retrieve user context data group permissions.
     * <p><b>200</b> - Permissions data group
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:     * Data group type is invalid     | Message | key |   | --- | --- |   | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE |  
     * @param permissionsRequest # User context data group permissions - &#x60;POST&#x60;    Returns list of permissions with data groups and items filtered by user context user id and service agreement id (fallback  on MSA if no service agreement provided in the context) and data group types, resource name,  business function name and privileges provided in the request body.    ###Extendability    Extendable using REST endpoint handler:     * Extending handler class: com.microsphere.accesscontrol.business.flows.useraccess.GetPermissionDataGroupsFlow   (optional)
     * @return ResponseEntity&lt;PermissionsDataGroup&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PermissionsDataGroup> getUserContextPermissionsWithHttpInfo(PermissionsRequest permissionsRequest) throws RestClientException {
        Object localVarPostBody = permissionsRequest;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/usercontext/data-group-permissions", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PermissionsDataGroup> localVarReturnType = new ParameterizedTypeReference<PermissionsDataGroup>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * 
     * No description available
     * <p><b>204</b> - User Context Validation success response
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param userId Internal User Id (required)
     * @param serviceAgreementId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getUserContextValidation(String userId, String serviceAgreementId) throws RestClientException {
        getUserContextValidationWithHttpInfo(userId, serviceAgreementId);
    }

    /**
     * 
     * No description available
     * <p><b>204</b> - User Context Validation success response
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * @param userId Internal User Id (required)
     * @param serviceAgreementId Generated parameter by BOAT. Please specify the URI parameter in RAML (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getUserContextValidationWithHttpInfo(String userId, String serviceAgreementId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserContextValidation");
        }
        
        // verify the required parameter 'serviceAgreementId' is set
        if (serviceAgreementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementId' when calling getUserContextValidation");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("userId", userId);
        localVarUriVariables.put("serviceAgreementId", serviceAgreementId);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/usercontext/{userId}/serviceAgreements/{serviceAgreementId}/validation", localVarUriVariables);

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
     * Context SA GET.
     * # Context SA GET    Request method GET for fetching list of service agreements that the user can select for the context.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - User Context Service Agreements GET response
     * <p><b>400</b> - BadRequest
     * @param userId Internal User Id (required)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional)
     * @param query The search term used to search. (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return GetContexts
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetContexts getUserContexts(String userId, String cursor, String query, Integer from, Integer size) throws RestClientException {
        return getUserContextsWithHttpInfo(userId, cursor, query, from, size).getBody();
    }

    /**
     * Context SA GET.
     * # Context SA GET    Request method GET for fetching list of service agreements that the user can select for the context.    **Warning:**   * Calling this endpoint will bypass the validation of user permissions     of the user performing the action.   * Calling this endpoint will bypass the validation of users     (existence of user and user belonging in legal entity)     upon users on which the action is performed    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - User Context Service Agreements GET response
     * <p><b>400</b> - BadRequest
     * @param userId Internal User Id (required)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional)
     * @param query The search term used to search. (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return ResponseEntity&lt;GetContexts&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetContexts> getUserContextsWithHttpInfo(String userId, String cursor, String query, Integer from, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserContexts");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("userId", userId);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/usercontext/{userId}/serviceAgreements", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetContexts> localVarReturnType = new ParameterizedTypeReference<GetContexts>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
