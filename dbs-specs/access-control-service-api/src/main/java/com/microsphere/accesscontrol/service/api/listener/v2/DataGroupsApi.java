package com.microsphere.accesscontrol.service.api.listener.v2;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;

import com.microsphere.accesscontrol.service.api.listener.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.BatchResponseItemExtended;
import com.microsphere.accesscontrol.service.api.listener.v2.model.DataGroupItemSystemBase;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.IdItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationDataGroupIdentifier;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationDataGroupItemPutRequestBody;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationDataGroupUpdate;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationSearchDataGroupsRequest;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationServiceAgreementWithDataGroupsItem;

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
@Component("com.microsphere.accesscontrol.service.api.listener.v2.DataGroupsApi")

public class DataGroupsApi {
    private final ApiClient apiClient;


    @Autowired
    public DataGroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Delete Data Group - &#x60;DELETE&#x60;.
     * # Delete Data Group - &#x60;DELETE&#x60;    Deletes the specific data group by internal data group id.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.DeleteDataGroupRoute  * Route Id: DeleteDataGroupRoute  * Route source endpoint: direct:business.DeleteDataGroup  * Route destination endpoint: direct:deleteDataGroupRequestedInternal
     * <p><b>200</b> - Data Group deleted successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param id Data Group Id (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteDataGroupById(String id) throws RestClientException {
        deleteDataGroupByIdWithHttpInfo(id);
    }

    /**
     * Delete Data Group - &#x60;DELETE&#x60;.
     * # Delete Data Group - &#x60;DELETE&#x60;    Deletes the specific data group by internal data group id.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.DeleteDataGroupRoute  * Route Id: DeleteDataGroupRoute  * Route source endpoint: direct:business.DeleteDataGroup  * Route destination endpoint: direct:deleteDataGroupRequestedInternal
     * <p><b>200</b> - Data Group deleted successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param id Data Group Id (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteDataGroupByIdWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDataGroupById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/data-groups/{id}", localVarUriVariables);

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
     * Create Data Group - &#x60;POST&#x60;.
     * # Create Data Group - &#x60;POST&#x60;    Creates a new data group.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.AddDataGroupRoute  * Route Id: AddDataGroupRoute  * Route source endpoint:     - direct:accessgroup.datagroup.add  * Route destination endpoint:    - direct:accessgroup.datagroup.add.validate    - direct:accessgroup.datagroup.add.persist
     * <p><b>201</b> - New data group created successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param dataGroupItemSystemBase # Create Data Group - &#x60;POST&#x60;    Creates a new data group.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.AddDataGroupRoute  * Route Id: AddDataGroupRoute  * Route source endpoint:     - direct:accessgroup.datagroup.add  * Route destination endpoint:    - direct:accessgroup.datagroup.add.validate    - direct:accessgroup.datagroup.add.persist (optional)
     * @return IdItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IdItem postDataGroups(DataGroupItemSystemBase dataGroupItemSystemBase) throws RestClientException {
        return postDataGroupsWithHttpInfo(dataGroupItemSystemBase).getBody();
    }

    /**
     * Create Data Group - &#x60;POST&#x60;.
     * # Create Data Group - &#x60;POST&#x60;    Creates a new data group.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.AddDataGroupRoute  * Route Id: AddDataGroupRoute  * Route source endpoint:     - direct:accessgroup.datagroup.add  * Route destination endpoint:    - direct:accessgroup.datagroup.add.validate    - direct:accessgroup.datagroup.add.persist
     * <p><b>201</b> - New data group created successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param dataGroupItemSystemBase # Create Data Group - &#x60;POST&#x60;    Creates a new data group.    ###Extendability    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.AddDataGroupRoute  * Route Id: AddDataGroupRoute  * Route source endpoint:     - direct:accessgroup.datagroup.add  * Route destination endpoint:    - direct:accessgroup.datagroup.add.validate    - direct:accessgroup.datagroup.add.persist (optional)
     * @return ResponseEntity&lt;IdItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IdItem> postDataGroupsWithHttpInfo(DataGroupItemSystemBase dataGroupItemSystemBase) throws RestClientException {
        Object localVarPostBody = dataGroupItemSystemBase;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/data-groups", Collections.<String, Object>emptyMap());

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
     * Data Groups Batch Delete - &#x60;POST&#x60;.
     * # Data Groups Batch Delete - &#x60;POST&#x60;    Batch delete of data groups.  Delete may be done by: data group internal id or (data group name and referenced service agreement external id).
     * <p><b>207</b> - MultiStatusExtended
     * <p><b>400</b> - BadRequest
     * @param presentationDataGroupIdentifier # Data Groups Batch Delete - &#x60;POST&#x60;    Batch delete of data groups.  Delete may be done by: data group internal id or (data group name and referenced service agreement external id). (optional)
     * @return List&lt;BatchResponseItemExtended&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BatchResponseItemExtended> postDataGroupsDelete(List<PresentationDataGroupIdentifier> presentationDataGroupIdentifier) throws RestClientException {
        return postDataGroupsDeleteWithHttpInfo(presentationDataGroupIdentifier).getBody();
    }

    /**
     * Data Groups Batch Delete - &#x60;POST&#x60;.
     * # Data Groups Batch Delete - &#x60;POST&#x60;    Batch delete of data groups.  Delete may be done by: data group internal id or (data group name and referenced service agreement external id).
     * <p><b>207</b> - MultiStatusExtended
     * <p><b>400</b> - BadRequest
     * @param presentationDataGroupIdentifier # Data Groups Batch Delete - &#x60;POST&#x60;    Batch delete of data groups.  Delete may be done by: data group internal id or (data group name and referenced service agreement external id). (optional)
     * @return ResponseEntity&lt;List&lt;BatchResponseItemExtended&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BatchResponseItemExtended>> postDataGroupsDeleteWithHttpInfo(List<PresentationDataGroupIdentifier> presentationDataGroupIdentifier) throws RestClientException {
        Object localVarPostBody = presentationDataGroupIdentifier;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/data-groups/batch/delete", Collections.<String, Object>emptyMap());

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
     * Search data groups  - &#x60;POST&#x60;.
     * # Search data groups  - &#x60;POST&#x60;    Filters data groups with specific type, by service agreement or by data item  - &#x60;serviceAgreementIdentifier&#x60; can be internal or external id or name of service agreement  - &#x60;dataItemIdentifier&#x60; can be internal or external data item id.
     * <p><b>200</b> - List of data groups that fulfill the serach criteria, grouped by service agreements.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * No service agreement or data item identifier is provided in request body.   * Can not search PAYEES data item type without providing service agreement identifier.     | Message | key |  | --- | --- |  |  No service agreement or data item identifier is provided | dataGroups.search.request.invalid |   | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE|   | Service agreement identifier must be provided for this data item type | datagroup.search.error.message.MISSING_SERVICE_AGREEMENT_IDENTIFIER|   
     * @param type Type of the data group. (required)
     * @param presentationSearchDataGroupsRequest # Search data groups  - &#x60;POST&#x60;    Filters data groups with specific type, by service agreement or by data item  - &#x60;serviceAgreementIdentifier&#x60; can be internal or external id or name of service agreement  - &#x60;dataItemIdentifier&#x60; can be internal or external data item id.  - &#x60;LegalEntityIdentifier&#x60; can be external legal entity id. (optional)
     * @return List&lt;PresentationServiceAgreementWithDataGroupsItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PresentationServiceAgreementWithDataGroupsItem> postSearch(String type, PresentationSearchDataGroupsRequest presentationSearchDataGroupsRequest) throws RestClientException {
        return postSearchWithHttpInfo(type, presentationSearchDataGroupsRequest).getBody();
    }

    /**
     * Search data groups  - &#x60;POST&#x60;.
     * # Search data groups  - &#x60;POST&#x60;    Filters data groups with specific type, by service agreement or by data item  - &#x60;serviceAgreementIdentifier&#x60; can be internal or external id or name of service agreement  - &#x60;dataItemIdentifier&#x60; can be internal or external data item id.
     * <p><b>200</b> - List of data groups that fulfill the serach criteria, grouped by service agreements.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * No service agreement or data item identifier is provided in request body.   * Can not search PAYEES data item type without providing service agreement identifier.     | Message | key |  | --- | --- |  |  No service agreement or data item identifier is provided | dataGroups.search.request.invalid |   | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE|   | Service agreement identifier must be provided for this data item type | datagroup.search.error.message.MISSING_SERVICE_AGREEMENT_IDENTIFIER|   
     * @param type Type of the data group. (required)
     * @param presentationSearchDataGroupsRequest # Search data groups  - &#x60;POST&#x60;    Filters data groups with specific type, by service agreement or by data item  - &#x60;serviceAgreementIdentifier&#x60; can be internal or external id or name of service agreement  - &#x60;dataItemIdentifier&#x60; can be internal or external data item id.  - &#x60;LegalEntityIdentifier&#x60; can be external legal entity id. (optional)
     * @return ResponseEntity&lt;List&lt;PresentationServiceAgreementWithDataGroupsItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PresentationServiceAgreementWithDataGroupsItem>> postSearchWithHttpInfo(String type, PresentationSearchDataGroupsRequest presentationSearchDataGroupsRequest) throws RestClientException {
        Object localVarPostBody = presentationSearchDataGroupsRequest;
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling postSearch");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("type", type);
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/data-groups/type/{type}/search", localVarUriVariables);

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

        ParameterizedTypeReference<List<PresentationServiceAgreementWithDataGroupsItem>> localVarReturnType = new ParameterizedTypeReference<List<PresentationServiceAgreementWithDataGroupsItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Data Group Item Batch Update - &#x60;PUT&#x60;.
     * # Data Group Item Batch Update - &#x60;PUT&#x60;    Batch update of data group item by providing a list of   - dataGroupIdentifier   - action   - type   - dataItems (containing internal or external data items ids)  This identifier will be included as a part of data group object containing  one of the data group identifiers (name identifier or internal Id identifier).    Data items identifiers must all be internal or all external for one data group identifier.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  The Data Group type must be specified.      * Invalid or empty data group items   
     * <p><b>207</b> - # HTTP status code 200 is returned for successfully updated data group items    # Reasons for getting HTTP status code 400 inside one or more batch response items:    * Request does not honor the contract, check the example in the Request tab.  * Invalid data group/data item identifier  
     * @param presentationDataGroupItemPutRequestBody # Data Group Item Batch Update - &#x60;PUT&#x60;    Batch update of data group item by providing a list of   - dataGroupIdentifier   - action   - type   - dataItems (containing internal or external data items ids)  This identifier will be included as a part of data group object containing  one of the data group identifiers (name identifier or internal Id identifier).    Data items identifiers must all be internal or all external for one data group identifier. (optional)
     * @return List&lt;BatchResponseItemExtended&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BatchResponseItemExtended> putDataGroupItemsUpdate(List<PresentationDataGroupItemPutRequestBody> presentationDataGroupItemPutRequestBody) throws RestClientException {
        return putDataGroupItemsUpdateWithHttpInfo(presentationDataGroupItemPutRequestBody).getBody();
    }

    /**
     * Data Group Item Batch Update - &#x60;PUT&#x60;.
     * # Data Group Item Batch Update - &#x60;PUT&#x60;    Batch update of data group item by providing a list of   - dataGroupIdentifier   - action   - type   - dataItems (containing internal or external data items ids)  This identifier will be included as a part of data group object containing  one of the data group identifiers (name identifier or internal Id identifier).    Data items identifiers must all be internal or all external for one data group identifier.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  The Data Group type must be specified.      * Invalid or empty data group items   
     * <p><b>207</b> - # HTTP status code 200 is returned for successfully updated data group items    # Reasons for getting HTTP status code 400 inside one or more batch response items:    * Request does not honor the contract, check the example in the Request tab.  * Invalid data group/data item identifier  
     * @param presentationDataGroupItemPutRequestBody # Data Group Item Batch Update - &#x60;PUT&#x60;    Batch update of data group item by providing a list of   - dataGroupIdentifier   - action   - type   - dataItems (containing internal or external data items ids)  This identifier will be included as a part of data group object containing  one of the data group identifiers (name identifier or internal Id identifier).    Data items identifiers must all be internal or all external for one data group identifier. (optional)
     * @return ResponseEntity&lt;List&lt;BatchResponseItemExtended&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BatchResponseItemExtended>> putDataGroupItemsUpdateWithHttpInfo(List<PresentationDataGroupItemPutRequestBody> presentationDataGroupItemPutRequestBody) throws RestClientException {
        Object localVarPostBody = presentationDataGroupItemPutRequestBody;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/data-groups/batch/update/data-items", Collections.<String, Object>emptyMap());

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
    /**
     * Update Data Group details - &#x60;PUT&#x60;.
     * # Update Data Group details - &#x60;PUT&#x60;    Updates details for a specific data group.  Update may be done by: data group internal id or (data group name and referenced service agreement external id)    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.UpdateDataGroupByIdGroupRoute  * Route Id: UpdateDataGroupByIdGroupRoute  * Route source endpoint: direct:accessgroup.datagroup.update  * Route destination endpoint:      - direct:accessgroup.datagroup.update.validate     - direct:accessgroup.datagroup.update.persist
     * <p><b>200</b> - Data group updated successfully.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  * Name not unique  * Service agreement does not exist  * Data group with specified name and external service agreement is already in pending state.  * Data group type “CUSTOMERS” is not allowed    | Message | key |  | --- | --- |  | Invalid data group identifiers | dataGroup.identifier.error.message.E_INVALID_DATA_GROUP_IDENTIFIERS  | Invalid service agreement | dataGroup.update.error.message.E_INVALID_SERVICE_AGREEMENT  | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE  | Invalid data group items | dataGroup.save.error.message.E_INVALID_DATA_GROUP_ITEMS  | Data Access Group with given name already exists | dataAccessGroup.save.error.message.E_ALREADY_EXISTS  | Service agreement does not exist | serviceAgreements.get.error.message.E_NOT_EXISTS  | There is pending action of data group. | dataGroup.update.approval.error.message.ALREADY_IN_PENDING_STATE  | Data group type is not allowed. | dataGroup.save.error.message.E_NOT_ALLOWED_DATA_GROUP_TYPE  | The Data Group type must be specified. | dataGroup.get.error.message.E_DATA_GROUP_TYPE_NOT_SPECIFIED  
     * <p><b>404</b> - NotFound
     * @param presentationDataGroupUpdate # Update Data Group details - &#x60;PUT&#x60;    Updates details for a specific data group.  Update may be done by: data group internal id or (data group name and referenced service agreement external id)    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.UpdateDataGroupByIdGroupRoute  * Route Id: UpdateDataGroupByIdGroupRoute  * Route source endpoint: direct:accessgroup.datagroup.update  * Route destination endpoint:      - direct:accessgroup.datagroup.update.validate     - direct:accessgroup.datagroup.update.persist (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putDataGroups(PresentationDataGroupUpdate presentationDataGroupUpdate) throws RestClientException {
        putDataGroupsWithHttpInfo(presentationDataGroupUpdate);
    }

    /**
     * Update Data Group details - &#x60;PUT&#x60;.
     * # Update Data Group details - &#x60;PUT&#x60;    Updates details for a specific data group.  Update may be done by: data group internal id or (data group name and referenced service agreement external id)    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.UpdateDataGroupByIdGroupRoute  * Route Id: UpdateDataGroupByIdGroupRoute  * Route source endpoint: direct:accessgroup.datagroup.update  * Route destination endpoint:      - direct:accessgroup.datagroup.update.validate     - direct:accessgroup.datagroup.update.persist
     * <p><b>200</b> - Data group updated successfully.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  * Name not unique  * Service agreement does not exist  * Data group with specified name and external service agreement is already in pending state.  * Data group type “CUSTOMERS” is not allowed    | Message | key |  | --- | --- |  | Invalid data group identifiers | dataGroup.identifier.error.message.E_INVALID_DATA_GROUP_IDENTIFIERS  | Invalid service agreement | dataGroup.update.error.message.E_INVALID_SERVICE_AGREEMENT  | Invalid data group type | dataGroup.save.error.message.E_INVALID_DATA_GROUP_TYPE  | Invalid data group items | dataGroup.save.error.message.E_INVALID_DATA_GROUP_ITEMS  | Data Access Group with given name already exists | dataAccessGroup.save.error.message.E_ALREADY_EXISTS  | Service agreement does not exist | serviceAgreements.get.error.message.E_NOT_EXISTS  | There is pending action of data group. | dataGroup.update.approval.error.message.ALREADY_IN_PENDING_STATE  | Data group type is not allowed. | dataGroup.save.error.message.E_NOT_ALLOWED_DATA_GROUP_TYPE  | The Data Group type must be specified. | dataGroup.get.error.message.E_DATA_GROUP_TYPE_NOT_SPECIFIED  
     * <p><b>404</b> - NotFound
     * @param presentationDataGroupUpdate # Update Data Group details - &#x60;PUT&#x60;    Updates details for a specific data group.  Update may be done by: data group internal id or (data group name and referenced service agreement external id)    Extendable using Apache Camel:    * Route Class: com.microsphere.presentation.services.accessgroups.routes.datagroup.UpdateDataGroupByIdGroupRoute  * Route Id: UpdateDataGroupByIdGroupRoute  * Route source endpoint: direct:accessgroup.datagroup.update  * Route destination endpoint:      - direct:accessgroup.datagroup.update.validate     - direct:accessgroup.datagroup.update.persist (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putDataGroupsWithHttpInfo(PresentationDataGroupUpdate presentationDataGroupUpdate) throws RestClientException {
        Object localVarPostBody = presentationDataGroupUpdate;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/data-groups", Collections.<String, Object>emptyMap());

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
