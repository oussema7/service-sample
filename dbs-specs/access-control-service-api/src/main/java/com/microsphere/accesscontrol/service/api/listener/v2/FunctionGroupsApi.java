package com.microsphere.accesscontrol.service.api.listener.v2;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;

import com.microsphere.accesscontrol.service.api.listener.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.BatchResponseItemExtended;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.IdItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationFunctionGroupPutRequestBody;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationIdentifier;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationIngestFunctionGroup;

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
@Component("com.microsphere.accesscontrol.service.api.listener.v2.FunctionGroupsApi")

public class FunctionGroupsApi {
    private final ApiClient apiClient;


    @Autowired
    public FunctionGroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Delete Function Group - &#x60;DELETE&#x60;.
     * # Delete Function Group - &#x60;DELETE&#x60;    Deletes the specific function group.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.functiongroup.DeleteFunctionGroupByIdRoute  * Route Id: DeleteFunctionGroupByIdRoute  * Route source endpoint: direct:business.DeleteFunctionGroupById  * Route destination endpoint: direct:deleteFunctionGroupByIdRequestedInternal
     * <p><b>200</b> - Function group deleted successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param id Function Group Id (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteFunctionGroupById(String id) throws RestClientException {
        deleteFunctionGroupByIdWithHttpInfo(id);
    }

    /**
     * Delete Function Group - &#x60;DELETE&#x60;.
     * # Delete Function Group - &#x60;DELETE&#x60;    Deletes the specific function group.    ### Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.functiongroup.DeleteFunctionGroupByIdRoute  * Route Id: DeleteFunctionGroupByIdRoute  * Route source endpoint: direct:business.DeleteFunctionGroupById  * Route destination endpoint: direct:deleteFunctionGroupByIdRequestedInternal
     * <p><b>200</b> - Function group deleted successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param id Function Group Id (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteFunctionGroupByIdWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteFunctionGroupById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/function-groups/{id}", localVarUriVariables);

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
     * Function Groups Batch - Delete.
     * # Function Groups Batch - Delete    Batch delete of function groups by list of provided Function Group IDs.
     * <p><b>207</b> - MultiStatusExtended
     * <p><b>400</b> - BadRequest
     * @param presentationIdentifier # Function Groups Batch - Delete    Batch delete of function groups by list of provided Function Group IDs. (optional)
     * @return List&lt;BatchResponseItemExtended&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BatchResponseItemExtended> postFunctionGroupsDelete(List<PresentationIdentifier> presentationIdentifier) throws RestClientException {
        return postFunctionGroupsDeleteWithHttpInfo(presentationIdentifier).getBody();
    }

    /**
     * Function Groups Batch - Delete.
     * # Function Groups Batch - Delete    Batch delete of function groups by list of provided Function Group IDs.
     * <p><b>207</b> - MultiStatusExtended
     * <p><b>400</b> - BadRequest
     * @param presentationIdentifier # Function Groups Batch - Delete    Batch delete of function groups by list of provided Function Group IDs. (optional)
     * @return ResponseEntity&lt;List&lt;BatchResponseItemExtended&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BatchResponseItemExtended>> postFunctionGroupsDeleteWithHttpInfo(List<PresentationIdentifier> presentationIdentifier) throws RestClientException {
        Object localVarPostBody = presentationIdentifier;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/function-groups/batch/delete", Collections.<String, Object>emptyMap());

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
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Creates a new function group.
     * Creates a new function group.
     * <p><b>201</b> - New function group created successfully.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Job role template can&#39;t be created for custom service agreement.  * Either apsId or apsName should be sent.  * Function Group with given name already exists  * Invalid validity period.  * Function Group can not be created/updated - Invalid Business Function  * Function Group can not be created/updated - invalid or not applicable Privilege  * There is a pending record of function group with same name  * Service agreement does not exist    | Message | key   --- | --- |  | Job role template can&#39;t be created for custom service agreement. | functionGroup.create.error.message.JRT_NOT_ALLOWED_FOR_CUSTOM_SA  | Either apsId or apsName should be sent. | functionGroup.create.error.message.NEITHER_OF_APS_IDENTIFIERS_PROVIDED  | Function Group with given name already exists. | functionGroup.save.error.message.E_ALREADY_EXISTS  | Invalid validity period. | datetime.valid.period.INVALID_VALUE  | Function Group can not be created/updated - Invalid Business Function | functionGroup.create.update.error.message.E_FUNCTION_NOT_EXISTS  | Function Group can not be created/updated - invalid or not applicable Privilege | permission.get.error.E_INVALID_OR_NOT_APPLICABLE_PRIVILEGE  | There is a pending record of function group with same name | functionGroup.create.approval.error.message.ALREADY_IN_PENDING_STATE  | Service agreement does not exist | serviceAgreements.get.error.message.E_NOT_EXISTS  
     * <p><b>403</b> - Forbidden
     * @param presentationIngestFunctionGroup Creates a new function group. (optional)
     * @return IdItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IdItem postPresentationIngestFunctionGroup(PresentationIngestFunctionGroup presentationIngestFunctionGroup) throws RestClientException {
        return postPresentationIngestFunctionGroupWithHttpInfo(presentationIngestFunctionGroup).getBody();
    }

    /**
     * Creates a new function group.
     * Creates a new function group.
     * <p><b>201</b> - New function group created successfully.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Job role template can&#39;t be created for custom service agreement.  * Either apsId or apsName should be sent.  * Function Group with given name already exists  * Invalid validity period.  * Function Group can not be created/updated - Invalid Business Function  * Function Group can not be created/updated - invalid or not applicable Privilege  * There is a pending record of function group with same name  * Service agreement does not exist    | Message | key   --- | --- |  | Job role template can&#39;t be created for custom service agreement. | functionGroup.create.error.message.JRT_NOT_ALLOWED_FOR_CUSTOM_SA  | Either apsId or apsName should be sent. | functionGroup.create.error.message.NEITHER_OF_APS_IDENTIFIERS_PROVIDED  | Function Group with given name already exists. | functionGroup.save.error.message.E_ALREADY_EXISTS  | Invalid validity period. | datetime.valid.period.INVALID_VALUE  | Function Group can not be created/updated - Invalid Business Function | functionGroup.create.update.error.message.E_FUNCTION_NOT_EXISTS  | Function Group can not be created/updated - invalid or not applicable Privilege | permission.get.error.E_INVALID_OR_NOT_APPLICABLE_PRIVILEGE  | There is a pending record of function group with same name | functionGroup.create.approval.error.message.ALREADY_IN_PENDING_STATE  | Service agreement does not exist | serviceAgreements.get.error.message.E_NOT_EXISTS  
     * <p><b>403</b> - Forbidden
     * @param presentationIngestFunctionGroup Creates a new function group. (optional)
     * @return ResponseEntity&lt;IdItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IdItem> postPresentationIngestFunctionGroupWithHttpInfo(PresentationIngestFunctionGroup presentationIngestFunctionGroup) throws RestClientException {
        Object localVarPostBody = presentationIngestFunctionGroup;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/function-groups/ingest", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<IdItem> localVarReturnType = new ParameterizedTypeReference<IdItem>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Function Groups Batch - Put.
     * # Function Groups Batch - Put    Update batch of function groups.
     * <p><b>207</b> - # HTTP status code 207 is returned for successfully updated function groups      # Reasons for getting HTTP status code 400 inside one or more batch response items:    * Request does not honor the contract, check the example in the Request tab.  * Invalid function group/data group identifier  * Name is not unique  * Business function does not exist  * The APS doesn&#39;t exist.  * There is a pending record of function group.  * Invalid validity period.  * Function Group can not be created/updated - invalid or not applicable Privilege.    | Messages |  | --- |  | At least one function group must be provided |  | Invalid function group/data group identifier. |  | Invalid function group identifiers |  | Function Group with given name already exists |  | Function Group can not be created/updated - Invalid Business Function |  | The APS doesn&#39;t exist. |  | There is a pending record of function group. |  | Invalid validity period. |  | Function Group can not be created/updated - invalid or not applicable Privilege. |      # Reasons for getting HTTP status code 404 inside one or more batch response items:    * Function group does not exist    | Message |  | --- |  | Function group does not exist. |  
     * <p><b>400</b> - BadRequest
     * @param presentationFunctionGroupPutRequestBody # Function Groups Batch - Put    Update batch of function groups. (optional)
     * @return List&lt;BatchResponseItemExtended&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BatchResponseItemExtended> putFunctionGroupsUpdate(List<PresentationFunctionGroupPutRequestBody> presentationFunctionGroupPutRequestBody) throws RestClientException {
        return putFunctionGroupsUpdateWithHttpInfo(presentationFunctionGroupPutRequestBody).getBody();
    }

    /**
     * Function Groups Batch - Put.
     * # Function Groups Batch - Put    Update batch of function groups.
     * <p><b>207</b> - # HTTP status code 207 is returned for successfully updated function groups      # Reasons for getting HTTP status code 400 inside one or more batch response items:    * Request does not honor the contract, check the example in the Request tab.  * Invalid function group/data group identifier  * Name is not unique  * Business function does not exist  * The APS doesn&#39;t exist.  * There is a pending record of function group.  * Invalid validity period.  * Function Group can not be created/updated - invalid or not applicable Privilege.    | Messages |  | --- |  | At least one function group must be provided |  | Invalid function group/data group identifier. |  | Invalid function group identifiers |  | Function Group with given name already exists |  | Function Group can not be created/updated - Invalid Business Function |  | The APS doesn&#39;t exist. |  | There is a pending record of function group. |  | Invalid validity period. |  | Function Group can not be created/updated - invalid or not applicable Privilege. |      # Reasons for getting HTTP status code 404 inside one or more batch response items:    * Function group does not exist    | Message |  | --- |  | Function group does not exist. |  
     * <p><b>400</b> - BadRequest
     * @param presentationFunctionGroupPutRequestBody # Function Groups Batch - Put    Update batch of function groups. (optional)
     * @return ResponseEntity&lt;List&lt;BatchResponseItemExtended&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BatchResponseItemExtended>> putFunctionGroupsUpdateWithHttpInfo(List<PresentationFunctionGroupPutRequestBody> presentationFunctionGroupPutRequestBody) throws RestClientException {
        Object localVarPostBody = presentationFunctionGroupPutRequestBody;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/function-groups/batch/update", Collections.<String, Object>emptyMap());

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
