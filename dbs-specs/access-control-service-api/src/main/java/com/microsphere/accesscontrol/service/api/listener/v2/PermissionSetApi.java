package com.microsphere.accesscontrol.service.api.listener.v2;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;

import com.microsphere.accesscontrol.service.api.listener.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationId;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationPermissionSet;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationPermissionSetPut;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationPermissionSetResponseItem;

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
@Component("com.microsphere.accesscontrol.service.api.listener.v2.PermissionSetApi")

public class PermissionSetApi {
    private final ApiClient apiClient;


    @Autowired
    public PermissionSetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Assignable permission set - &#x60;DELETE&#x60;.
     * # Assignable permission set - &#x60;DELETE&#x60;    Deletes assignable permission set by internal id or name. This endpoint requires a  valid token to perform the deletion.    To generate a valid  token, use: //accessgroup-integration-spec/v2/accessgroups/access-token  GET. Add the generated token as query parameter AccessControlToken.
     * <p><b>204</b> - Permission set deleted successfully
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * The APS is associated to at least one Service Agreement.  * The APS is system default and cannot be deleted.  * invalid identifiers    | Message | key  --- | --- |  | The APS is system default and cannot be deleted. | delete.permissionSet.identifiers.NOT_CUSTOM  | The APS is associated to at least one Service Agreement | delete.permissionSet.identifiers.ASSIGNED_TO_SERVICE_AGREEMENT  | Invalid Access Token | token.delete.validation.INVALID_ACCESS_TOKEN  
     * <p><b>404</b> - # Reasons for getting HTTP status code 404:    * The APS doesn&#39;t exist.  * Provided identifiers for the APS are invalid.     | Message | key  --- | --- |    | Provided identifiers for the APS are invalid. | delete.permissionSet.identifiers.INVALID_IDENTIFIER  | The APS doesn&#39;t exist. | delete.permissionSet.identifiers.NOT_EXISTS  
     * @param identifierType defines type(id/name) with which identifier will be defined  (required)
     * @param identifier name of the permission set or id (required)
     * @param xAccessControlToken Access token for verification of the command (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteByIdentifier(String identifierType, String identifier, String xAccessControlToken) throws RestClientException {
        deleteByIdentifierWithHttpInfo(identifierType, identifier, xAccessControlToken);
    }

    /**
     * Assignable permission set - &#x60;DELETE&#x60;.
     * # Assignable permission set - &#x60;DELETE&#x60;    Deletes assignable permission set by internal id or name. This endpoint requires a  valid token to perform the deletion.    To generate a valid  token, use: //accessgroup-integration-spec/v2/accessgroups/access-token  GET. Add the generated token as query parameter AccessControlToken.
     * <p><b>204</b> - Permission set deleted successfully
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * The APS is associated to at least one Service Agreement.  * The APS is system default and cannot be deleted.  * invalid identifiers    | Message | key  --- | --- |  | The APS is system default and cannot be deleted. | delete.permissionSet.identifiers.NOT_CUSTOM  | The APS is associated to at least one Service Agreement | delete.permissionSet.identifiers.ASSIGNED_TO_SERVICE_AGREEMENT  | Invalid Access Token | token.delete.validation.INVALID_ACCESS_TOKEN  
     * <p><b>404</b> - # Reasons for getting HTTP status code 404:    * The APS doesn&#39;t exist.  * Provided identifiers for the APS are invalid.     | Message | key  --- | --- |    | Provided identifiers for the APS are invalid. | delete.permissionSet.identifiers.INVALID_IDENTIFIER  | The APS doesn&#39;t exist. | delete.permissionSet.identifiers.NOT_EXISTS  
     * @param identifierType defines type(id/name) with which identifier will be defined  (required)
     * @param identifier name of the permission set or id (required)
     * @param xAccessControlToken Access token for verification of the command (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteByIdentifierWithHttpInfo(String identifierType, String identifier, String xAccessControlToken) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identifierType' when calling deleteByIdentifier");
        }
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identifier' when calling deleteByIdentifier");
        }
        
        // verify the required parameter 'xAccessControlToken' is set
        if (xAccessControlToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xAccessControlToken' when calling deleteByIdentifier");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("identifierType", identifierType);
        localVarUriVariables.put("identifier", identifier);
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/permission-sets/{identifierType}/{identifier}", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xAccessControlToken != null)
        localVarHeaderParams.add("X-AccessControl-Token", apiClient.parameterToString(xAccessControlToken));

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
     * Assignable Permission Sets - &#x60;GET&#x60;.
     * # Assignable Permission Sets - &#x60;GET&#x60;    Retrieves all assignable permission sets. Filter by name.  If assignable permission set name provided as filter does not exist, then empty list is returned.
     * <p><b>200</b> - # Assignable Permission Sets - &#x60;GET&#x60;    Retrieves all assignable permission sets. Filter by name.  If assignable permission set name provided as filter does not exist, then empty list is returned.
     * @param name Name of Applicable Permission Set (optional)
     * @return List&lt;PresentationPermissionSetResponseItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PresentationPermissionSetResponseItem> getPermissionSet(String name) throws RestClientException {
        return getPermissionSetWithHttpInfo(name).getBody();
    }

    /**
     * Assignable Permission Sets - &#x60;GET&#x60;.
     * # Assignable Permission Sets - &#x60;GET&#x60;    Retrieves all assignable permission sets. Filter by name.  If assignable permission set name provided as filter does not exist, then empty list is returned.
     * <p><b>200</b> - # Assignable Permission Sets - &#x60;GET&#x60;    Retrieves all assignable permission sets. Filter by name.  If assignable permission set name provided as filter does not exist, then empty list is returned.
     * @param name Name of Applicable Permission Set (optional)
     * @return ResponseEntity&lt;List&lt;PresentationPermissionSetResponseItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PresentationPermissionSetResponseItem>> getPermissionSetWithHttpInfo(String name) throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/permission-sets", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PresentationPermissionSetResponseItem>> localVarReturnType = new ParameterizedTypeReference<List<PresentationPermissionSetResponseItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Assignable permission set - &#x60;POST&#x60;.
     * # Assignable permission set - &#x60;POST&#x60;    Creates new assignable permission set and retrieve created assignable permission set id.  
     * <p><b>201</b> - No description available
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  * Permission set name should be unique  * Invalid business function privilege pair    | Message | key  --- | --- |  | Permission set name already exists | permissionSet.save.error.message.E_NAME_ALREADY_EXISTS  | Invalid business function privilege pair | permissionSet.save.error.message.E_INVALID_PERMISSION  
     * @param presentationPermissionSet # Assignable permission set - &#x60;POST&#x60;    Creates new assignable permission set and retrieve created assignable permission set id.   (optional)
     * @return PresentationId
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PresentationId postPermissionSet(PresentationPermissionSet presentationPermissionSet) throws RestClientException {
        return postPermissionSetWithHttpInfo(presentationPermissionSet).getBody();
    }

    /**
     * Assignable permission set - &#x60;POST&#x60;.
     * # Assignable permission set - &#x60;POST&#x60;    Creates new assignable permission set and retrieve created assignable permission set id.  
     * <p><b>201</b> - No description available
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  * Permission set name should be unique  * Invalid business function privilege pair    | Message | key  --- | --- |  | Permission set name already exists | permissionSet.save.error.message.E_NAME_ALREADY_EXISTS  | Invalid business function privilege pair | permissionSet.save.error.message.E_INVALID_PERMISSION  
     * @param presentationPermissionSet # Assignable permission set - &#x60;POST&#x60;    Creates new assignable permission set and retrieve created assignable permission set id.   (optional)
     * @return ResponseEntity&lt;PresentationId&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PresentationId> postPermissionSetWithHttpInfo(PresentationPermissionSet presentationPermissionSet) throws RestClientException {
        Object localVarPostBody = presentationPermissionSet;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/permission-sets", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PresentationId> localVarReturnType = new ParameterizedTypeReference<PresentationId>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Assignable permission set - &#x60;PUT&#x60;.
     * # Assignable permission set - &#x60;PUT&#x60;    Endpoint for assigning and removing assignable permission sets,  to/from service agreement.   You can update assignable permission set by:   - &#x60;IdIdentifier&#x60; - internal id of assignable permission set   - &#x60;NameIdentifier&#x60; - name of assignable permission set
     * <p><b>200</b> - Assignable permission sets updated successfully
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:  * Invalid APS set up.  * Provided identifiers for the APS are invalid.    | Messages | Key |  | --- | --- |  | At least one business function/privilege is contained in one or more function groups. | permissionSet.aps.PRIVILEGE_CONTAINED_IN_FUNCTION_GROUP |  | Provided identifiers for the APS are invalid. | delete.permissionSet.identifiers.INVALID_IDENTIFIER|    
     * <p><b>404</b> - # Reasons for getting HTTP status code 404:    * Service agreement with provided external id not found.    | Message | Key |  | --- | --- |  | Service agreement does not exist | serviceAgreements.get.error.message.E_NOT_EXISTS |
     * @param presentationPermissionSetPut # Assignable permission set - &#x60;PUT&#x60;    Endpoint for assigning and removing assignable permission sets,  to/from service agreement.   You can update assignable permission set by:   - &#x60;IdIdentifier&#x60; - internal id of assignable permission set   - &#x60;NameIdentifier&#x60; - name of assignable permission set (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putPermissionSet(PresentationPermissionSetPut presentationPermissionSetPut) throws RestClientException {
        putPermissionSetWithHttpInfo(presentationPermissionSetPut);
    }

    /**
     * Assignable permission set - &#x60;PUT&#x60;.
     * # Assignable permission set - &#x60;PUT&#x60;    Endpoint for assigning and removing assignable permission sets,  to/from service agreement.   You can update assignable permission set by:   - &#x60;IdIdentifier&#x60; - internal id of assignable permission set   - &#x60;NameIdentifier&#x60; - name of assignable permission set
     * <p><b>200</b> - Assignable permission sets updated successfully
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:  * Invalid APS set up.  * Provided identifiers for the APS are invalid.    | Messages | Key |  | --- | --- |  | At least one business function/privilege is contained in one or more function groups. | permissionSet.aps.PRIVILEGE_CONTAINED_IN_FUNCTION_GROUP |  | Provided identifiers for the APS are invalid. | delete.permissionSet.identifiers.INVALID_IDENTIFIER|    
     * <p><b>404</b> - # Reasons for getting HTTP status code 404:    * Service agreement with provided external id not found.    | Message | Key |  | --- | --- |  | Service agreement does not exist | serviceAgreements.get.error.message.E_NOT_EXISTS |
     * @param presentationPermissionSetPut # Assignable permission set - &#x60;PUT&#x60;    Endpoint for assigning and removing assignable permission sets,  to/from service agreement.   You can update assignable permission set by:   - &#x60;IdIdentifier&#x60; - internal id of assignable permission set   - &#x60;NameIdentifier&#x60; - name of assignable permission set (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putPermissionSetWithHttpInfo(PresentationPermissionSetPut presentationPermissionSetPut) throws RestClientException {
        Object localVarPostBody = presentationPermissionSetPut;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/permission-sets", Collections.<String, Object>emptyMap());

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
