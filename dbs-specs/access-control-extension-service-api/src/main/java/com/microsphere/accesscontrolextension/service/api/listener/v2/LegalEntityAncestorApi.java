package com.microsphere.accesscontrolextension.service.api.listener.v2;

import com.microsphere.accesscontrolextension.service.api.listener.ApiClient;

import com.microsphere.accesscontrolextension.service.api.listener.v2.model.HierarchyPostResponse;
import com.microsphere.accesscontrolextension.service.api.listener.v2.model.LegalEntityTypePostResponse;
import com.microsphere.accesscontrolextension.service.api.listener.v2.model.ServiceAgreementTypePostResponse;

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

@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:46.958085800+01:00[Africa/Tunis]")
@Component("com.microsphere.accesscontrolextension.service.api.listener.v2.LegalEntityAncestorApi")

public class LegalEntityAncestorApi {
    private final ApiClient apiClient;


    @Autowired
    public LegalEntityAncestorApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * get list of External Ids of the hierarchy for a giver Legal Entity.
     * get list of External Ids of the hierarchy for a giver Legal Entity.
     * <p><b>200</b> - No description available
     * @param legalEntityExternalId Legal Entity External Id (required)
     * @return HierarchyPostResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public HierarchyPostResponse getAncestorsLegalEntities(String legalEntityExternalId) throws RestClientException {
        return getAncestorsLegalEntitiesWithHttpInfo(legalEntityExternalId).getBody();
    }

    /**
     * get list of External Ids of the hierarchy for a giver Legal Entity.
     * get list of External Ids of the hierarchy for a giver Legal Entity.
     * <p><b>200</b> - No description available
     * @param legalEntityExternalId Legal Entity External Id (required)
     * @return ResponseEntity&lt;HierarchyPostResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<HierarchyPostResponse> getAncestorsLegalEntitiesWithHttpInfo(String legalEntityExternalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'legalEntityExternalId' is set
        if (legalEntityExternalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalEntityExternalId' when calling getAncestorsLegalEntities");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("legalEntityExternalId", legalEntityExternalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/ancestors/externalId/{legalEntityExternalId}", localVarUriVariables);

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

        ParameterizedTypeReference<HierarchyPostResponse> localVarReturnType = new ParameterizedTypeReference<HierarchyPostResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Legal Entity Hierarchy Type by External Id.
     * Get Legal Entity Hierarchy Type by External Id.
     * <p><b>200</b> - No description available
     * @param legalEntityExternalId Legal Entity External Id (required)
     * @return LegalEntityTypePostResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LegalEntityTypePostResponse getLegalEntityType(String legalEntityExternalId) throws RestClientException {
        return getLegalEntityTypeWithHttpInfo(legalEntityExternalId).getBody();
    }

    /**
     * Get Legal Entity Hierarchy Type by External Id.
     * Get Legal Entity Hierarchy Type by External Id.
     * <p><b>200</b> - No description available
     * @param legalEntityExternalId Legal Entity External Id (required)
     * @return ResponseEntity&lt;LegalEntityTypePostResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LegalEntityTypePostResponse> getLegalEntityTypeWithHttpInfo(String legalEntityExternalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'legalEntityExternalId' is set
        if (legalEntityExternalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalEntityExternalId' when calling getLegalEntityType");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("legalEntityExternalId", legalEntityExternalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/ancestors/externalId/{legalEntityExternalId}/type", localVarUriVariables);

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

        ParameterizedTypeReference<LegalEntityTypePostResponse> localVarReturnType = new ParameterizedTypeReference<LegalEntityTypePostResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Service Agreement Type by Id.
     * Get Service Agreement Type by Id.
     * <p><b>200</b> - No description available
     * @param id Service Agreement Id (required)
     * @return ServiceAgreementTypePostResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ServiceAgreementTypePostResponse getServiceAgreementType(String id) throws RestClientException {
        return getServiceAgreementTypeWithHttpInfo(id).getBody();
    }

    /**
     * Get Service Agreement Type by Id.
     * Get Service Agreement Type by Id.
     * <p><b>200</b> - No description available
     * @param id Service Agreement Id (required)
     * @return ResponseEntity&lt;ServiceAgreementTypePostResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ServiceAgreementTypePostResponse> getServiceAgreementTypeWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getServiceAgreementType");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("id", id);
        String localVarPath = apiClient.expandPath("/service-api/v2/service-agreement/{id}/type", localVarUriVariables);

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

        ParameterizedTypeReference<ServiceAgreementTypePostResponse> localVarReturnType = new ParameterizedTypeReference<ServiceAgreementTypePostResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
