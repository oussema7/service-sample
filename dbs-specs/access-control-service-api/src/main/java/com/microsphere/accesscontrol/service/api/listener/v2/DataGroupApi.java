package com.microsphere.accesscontrol.service.api.listener.v2;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;

import com.microsphere.accesscontrol.service.api.listener.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.DataGroupItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.DataGroupsIds;
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
@Component("com.microsphere.accesscontrol.service.api.listener.v2.DataGroupApi")

public class DataGroupApi {
    private final ApiClient apiClient;


    @Autowired
    public DataGroupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Data Group - &#x60;GET&#x60;.
     * # Data Group - &#x60;GET&#x60;    Request method GET for fetching data group by internal data group id.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Data group by id retrieved successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param id Data group ID (required)
     * @param includeItems Indicates whether data group items should be returned or not. (optional, default to true)
     * @return DataGroupItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DataGroupItem getDataGroupById(String id, Boolean includeItems) throws RestClientException {
        return getDataGroupByIdWithHttpInfo(id, includeItems).getBody();
    }

    /**
     * Data Group - &#x60;GET&#x60;.
     * # Data Group - &#x60;GET&#x60;    Request method GET for fetching data group by internal data group id.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Data group by id retrieved successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param id Data group ID (required)
     * @param includeItems Indicates whether data group items should be returned or not. (optional, default to true)
     * @return ResponseEntity&lt;DataGroupItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DataGroupItem> getDataGroupByIdWithHttpInfo(String id, Boolean includeItems) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDataGroupById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/data-groups/{id}", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeItems", includeItems));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<DataGroupItem> localVarReturnType = new ParameterizedTypeReference<DataGroupItem>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Data Groups GET.
     * # Data Groups GET    Request method GET for fetching data groups by serviceAgreementId and/or type.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Data groups retrieved successfully.
     * <p><b>400</b> - BadRequest
     * @param serviceAgreementId Service Agreement Id (required)
     * @param type Data group type (optional)
     * @param includeItems Defines if the items of the data groups will be returned in the response (optional, default to true)
     * @return List&lt;DataGroupItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<DataGroupItem> getDataGroups(String serviceAgreementId, String type, Boolean includeItems) throws RestClientException {
        return getDataGroupsWithHttpInfo(serviceAgreementId, type, includeItems).getBody();
    }

    /**
     * Data Groups GET.
     * # Data Groups GET    Request method GET for fetching data groups by serviceAgreementId and/or type.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Data groups retrieved successfully.
     * <p><b>400</b> - BadRequest
     * @param serviceAgreementId Service Agreement Id (required)
     * @param type Data group type (optional)
     * @param includeItems Defines if the items of the data groups will be returned in the response (optional, default to true)
     * @return ResponseEntity&lt;List&lt;DataGroupItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<DataGroupItem>> getDataGroupsWithHttpInfo(String serviceAgreementId, String type, Boolean includeItems) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'serviceAgreementId' is set
        if (serviceAgreementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementId' when calling getDataGroups");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/data-groups", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "serviceAgreementId", serviceAgreementId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeItems", includeItems));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<DataGroupItem>> localVarReturnType = new ParameterizedTypeReference<List<DataGroupItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Data Groups Bulk POST.
     * # Data Groups Bulk POST    Request for fetching data groups by ids.
     * <p><b>200</b> - Data Groups retrieved successfully.
     * <p><b>400</b> - BadRequest
     * @param dataGroupsIds # Data Groups Bulk POST    Request for fetching data groups by ids. (optional)
     * @return List&lt;DataGroupItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<DataGroupItem> postBulkSearchDataGroups(DataGroupsIds dataGroupsIds) throws RestClientException {
        return postBulkSearchDataGroupsWithHttpInfo(dataGroupsIds).getBody();
    }

    /**
     * Data Groups Bulk POST.
     * # Data Groups Bulk POST    Request for fetching data groups by ids.
     * <p><b>200</b> - Data Groups retrieved successfully.
     * <p><b>400</b> - BadRequest
     * @param dataGroupsIds # Data Groups Bulk POST    Request for fetching data groups by ids. (optional)
     * @return ResponseEntity&lt;List&lt;DataGroupItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<DataGroupItem>> postBulkSearchDataGroupsWithHttpInfo(DataGroupsIds dataGroupsIds) throws RestClientException {
        Object localVarPostBody = dataGroupsIds;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/data-groups/bulk/search", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<DataGroupItem>> localVarReturnType = new ParameterizedTypeReference<List<DataGroupItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
