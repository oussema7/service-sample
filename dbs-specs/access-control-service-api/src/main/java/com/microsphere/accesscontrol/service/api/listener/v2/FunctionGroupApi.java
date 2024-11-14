package com.microsphere.accesscontrol.service.api.listener.v2;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;

import com.microsphere.accesscontrol.service.api.listener.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.FunctionGroupItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.FunctionGroupsIds;
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
@Component("com.microsphere.accesscontrol.service.api.listener.v2.FunctionGroupApi")

public class FunctionGroupApi {
    private final ApiClient apiClient;


    @Autowired
    public FunctionGroupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Function Group GET.
     * # Function Group GET    Request method GET for fetching function group by id.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Function group retrieved.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param id Function group id (required)
     * @return FunctionGroupItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FunctionGroupItem getFunctionGroupById(String id) throws RestClientException {
        return getFunctionGroupByIdWithHttpInfo(id).getBody();
    }

    /**
     * Function Group GET.
     * # Function Group GET    Request method GET for fetching function group by id.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Function group retrieved.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param id Function group id (required)
     * @return ResponseEntity&lt;FunctionGroupItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FunctionGroupItem> getFunctionGroupByIdWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getFunctionGroupById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/function-groups/{id}", localVarUriVariables);

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

        ParameterizedTypeReference<FunctionGroupItem> localVarReturnType = new ParameterizedTypeReference<FunctionGroupItem>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Function Groups GET.
     * # Function Groups GET    Request method GET for fetching function groups by serviceAgreementId.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - List of function groups retrieved.
     * <p><b>400</b> - BadRequest
     * @param serviceAgreementId Service Agreement id (required)
     * @return List&lt;FunctionGroupItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<FunctionGroupItem> getFunctionGroups(String serviceAgreementId) throws RestClientException {
        return getFunctionGroupsWithHttpInfo(serviceAgreementId).getBody();
    }

    /**
     * Function Groups GET.
     * # Function Groups GET    Request method GET for fetching function groups by serviceAgreementId.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - List of function groups retrieved.
     * <p><b>400</b> - BadRequest
     * @param serviceAgreementId Service Agreement id (required)
     * @return ResponseEntity&lt;List&lt;FunctionGroupItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<FunctionGroupItem>> getFunctionGroupsWithHttpInfo(String serviceAgreementId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'serviceAgreementId' is set
        if (serviceAgreementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementId' when calling getFunctionGroups");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/function-groups", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "serviceAgreementId", serviceAgreementId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<FunctionGroupItem>> localVarReturnType = new ParameterizedTypeReference<List<FunctionGroupItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Function Groups Bulk POST.
     * # Function Groups Bulk POST    Request for fetching function groups by ids.
     * <p><b>200</b> - Function Groups retrieved successfully.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * One of the function group ids does not exists    | Message | key   --- | --- |  |Function group does not exist.|functionAccessGroup.get.error.message.E_NOT_EXISTS|
     * @param functionGroupsIds # Function Groups Bulk POST    Request for fetching function groups by ids. (optional)
     * @return List&lt;FunctionGroupItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<FunctionGroupItem> postBulkFunctionGroups(FunctionGroupsIds functionGroupsIds) throws RestClientException {
        return postBulkFunctionGroupsWithHttpInfo(functionGroupsIds).getBody();
    }

    /**
     * Function Groups Bulk POST.
     * # Function Groups Bulk POST    Request for fetching function groups by ids.
     * <p><b>200</b> - Function Groups retrieved successfully.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * One of the function group ids does not exists    | Message | key   --- | --- |  |Function group does not exist.|functionAccessGroup.get.error.message.E_NOT_EXISTS|
     * @param functionGroupsIds # Function Groups Bulk POST    Request for fetching function groups by ids. (optional)
     * @return ResponseEntity&lt;List&lt;FunctionGroupItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<FunctionGroupItem>> postBulkFunctionGroupsWithHttpInfo(FunctionGroupsIds functionGroupsIds) throws RestClientException {
        Object localVarPostBody = functionGroupsIds;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/function-groups/bulk", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<FunctionGroupItem>> localVarReturnType = new ParameterizedTypeReference<List<FunctionGroupItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
