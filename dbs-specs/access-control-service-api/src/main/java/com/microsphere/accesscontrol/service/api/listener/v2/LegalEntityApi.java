package com.microsphere.accesscontrol.service.api.listener.v2;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;

import com.microsphere.accesscontrol.service.api.listener.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityItemBase;
import com.microsphere.accesscontrol.service.api.listener.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServiceAgreementItemQuery;

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
@Component("com.microsphere.accesscontrol.service.api.listener.v2.LegalEntityApi")

public class LegalEntityApi {
    private final ApiClient apiClient;


    @Autowired
    public LegalEntityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Legal Entity GET.
     * # Legal Entity GET    Request method GET for fetching legal entity by legal entity internal id.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Single legal entity retrieved
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param id Legal entity internal id (required)
     * @return LegalEntityItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LegalEntityItem getLegalEntity(String id) throws RestClientException {
        return getLegalEntityWithHttpInfo(id).getBody();
    }

    /**
     * Legal Entity GET.
     * # Legal Entity GET    Request method GET for fetching legal entity by legal entity internal id.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Single legal entity retrieved
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param id Legal entity internal id (required)
     * @return ResponseEntity&lt;LegalEntityItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LegalEntityItem> getLegalEntityWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getLegalEntity");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/legalentities/{id}", localVarUriVariables);

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

        ParameterizedTypeReference<LegalEntityItem> localVarReturnType = new ParameterizedTypeReference<LegalEntityItem>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Legal Entities MSA GET.
     * # Legal Entities MSA GET    Request method GET for fetching master service agreement of the given legal entity.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Master service agreement retrieved for given legal Entity.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param id Legal entity internal id (required)
     * @return ServiceAgreementItemQuery
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ServiceAgreementItemQuery getMasterServiceAgreement(String id) throws RestClientException {
        return getMasterServiceAgreementWithHttpInfo(id).getBody();
    }

    /**
     * Legal Entities MSA GET.
     * # Legal Entities MSA GET    Request method GET for fetching master service agreement of the given legal entity.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Master service agreement retrieved for given legal Entity.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param id Legal entity internal id (required)
     * @return ResponseEntity&lt;ServiceAgreementItemQuery&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ServiceAgreementItemQuery> getMasterServiceAgreementWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getMasterServiceAgreement");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/legalentities/{id}/serviceagreements/master", localVarUriVariables);

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

        ParameterizedTypeReference<ServiceAgreementItemQuery> localVarReturnType = new ParameterizedTypeReference<ServiceAgreementItemQuery>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Legal Entity GET.
     * # Legal Entity GET    Request method GET for fetching Root legal entity.
     * <p><b>200</b> - Root legal entity retrieved.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @return LegalEntityItemBase
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LegalEntityItemBase getRootLegalEntity() throws RestClientException {
        return getRootLegalEntityWithHttpInfo().getBody();
    }

    /**
     * Legal Entity GET.
     * # Legal Entity GET    Request method GET for fetching Root legal entity.
     * <p><b>200</b> - Root legal entity retrieved.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @return ResponseEntity&lt;LegalEntityItemBase&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LegalEntityItemBase> getRootLegalEntityWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/legalentities/root", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<LegalEntityItemBase> localVarReturnType = new ParameterizedTypeReference<LegalEntityItemBase>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Legal Entities Segmentation GET.
     * # Legal Entities Segmentation GET    List customers that user has access to.   
     * <p><b>200</b> - # Legal Entities Segmentation GET    List customers that user has access to.   
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Service agreement id or legal entity id must be provided    | Message | key   --- | --- |  |Service Agreement Id or Legal Entity Id must be provided|serviceAgreement.id.NOT_PROVIDED|
     * <p><b>404</b> - # Reasons for getting HTTP status code 404:    * Service agreement does not exist    | Message | key   --- | --- |  |Service agreement does not exist|serviceAgreements.get.error.message.E_NOT_EXISTS|  
     * @param businessFunction Name of the business function (required)
     * @param userId User id (required)
     * @param query Search by name or external ID: partial term for name and whole term for external ID (optional)
     * @param serviceAgreementId Service agreement id (optional)
     * @param legalEntityId Legal Entity Id (optional)
     * @param privilege Name of the privilege (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return List&lt;LegalEntityItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<LegalEntityItem> getSegmentation(String businessFunction, String userId, String query, String serviceAgreementId, String legalEntityId, String privilege, Integer from, String cursor, Integer size) throws RestClientException {
        return getSegmentationWithHttpInfo(businessFunction, userId, query, serviceAgreementId, legalEntityId, privilege, from, cursor, size).getBody();
    }

    /**
     * Legal Entities Segmentation GET.
     * # Legal Entities Segmentation GET    List customers that user has access to.   
     * <p><b>200</b> - # Legal Entities Segmentation GET    List customers that user has access to.   
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Service agreement id or legal entity id must be provided    | Message | key   --- | --- |  |Service Agreement Id or Legal Entity Id must be provided|serviceAgreement.id.NOT_PROVIDED|
     * <p><b>404</b> - # Reasons for getting HTTP status code 404:    * Service agreement does not exist    | Message | key   --- | --- |  |Service agreement does not exist|serviceAgreements.get.error.message.E_NOT_EXISTS|  
     * @param businessFunction Name of the business function (required)
     * @param userId User id (required)
     * @param query Search by name or external ID: partial term for name and whole term for external ID (optional)
     * @param serviceAgreementId Service agreement id (optional)
     * @param legalEntityId Legal Entity Id (optional)
     * @param privilege Name of the privilege (optional)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to &quot;&quot;)
     * @param size Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @return ResponseEntity&lt;List&lt;LegalEntityItem&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<LegalEntityItem>> getSegmentationWithHttpInfo(String businessFunction, String userId, String query, String serviceAgreementId, String legalEntityId, String privilege, Integer from, String cursor, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'businessFunction' is set
        if (businessFunction == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessFunction' when calling getSegmentation");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getSegmentation");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/legalentities/segmentation", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "businessFunction", businessFunction));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "serviceAgreementId", serviceAgreementId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "legalEntityId", legalEntityId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "privilege", privilege));
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

        ParameterizedTypeReference<List<LegalEntityItem>> localVarReturnType = new ParameterizedTypeReference<List<LegalEntityItem>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
