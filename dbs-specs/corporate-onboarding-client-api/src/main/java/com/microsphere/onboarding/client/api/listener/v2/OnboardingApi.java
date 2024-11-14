package com.microsphere.onboarding.client.api.listener.v2;

import com.microsphere.onboarding.client.api.listener.ApiClient;

import com.microsphere.onboarding.client.api.listener.v2.model.CommercialCardResponseGet;
import com.microsphere.onboarding.client.api.listener.v2.model.LegalEntityIdResponse;
import com.microsphere.onboarding.client.api.listener.v2.model.LegalEntityPostRequest;
import com.microsphere.onboarding.client.api.listener.v2.model.LegalEntityTypePostResponse;

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

@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:54.559235200+01:00[Africa/Tunis]")
@Component("com.microsphere.onboarding.client.api.listener.v2.OnboardingApi")

public class OnboardingApi {
    private final ApiClient apiClient;


    @Autowired
    public OnboardingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * get commercial card by offer
     * get commercial card by offer
     * <p><b>200</b> - No description available
     * @param offer commercial card offer (optional)
     * @param localize language of commercial card (optional)
     * @return CommercialCardResponseGet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommercialCardResponseGet getCommercialCard(String offer, String localize) throws RestClientException {
        return getCommercialCardWithHttpInfo(offer, localize).getBody();
    }

    /**
     * get commercial card by offer
     * get commercial card by offer
     * <p><b>200</b> - No description available
     * @param offer commercial card offer (optional)
     * @param localize language of commercial card (optional)
     * @return ResponseEntity&lt;CommercialCardResponseGet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommercialCardResponseGet> getCommercialCardWithHttpInfo(String offer, String localize) throws RestClientException {
        Object localVarPostBody = null;
        
        String localVarPath = apiClient.expandPath("/client-api/v2/commercial-cards", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offer", offer));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "localize", localize));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CommercialCardResponseGet> localVarReturnType = new ParameterizedTypeReference<CommercialCardResponseGet>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Confirm Legal Entity creation
     * Persist Legal Entity
     * <p><b>200</b> - LE successfully saved
     * @param legalEntityPostRequest  (required)
     * @return LegalEntityIdResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LegalEntityIdResponse persistLegalEntity(LegalEntityPostRequest legalEntityPostRequest) throws RestClientException {
        return persistLegalEntityWithHttpInfo(legalEntityPostRequest).getBody();
    }

    /**
     * Confirm Legal Entity creation
     * Persist Legal Entity
     * <p><b>200</b> - LE successfully saved
     * @param legalEntityPostRequest  (required)
     * @return ResponseEntity&lt;LegalEntityIdResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LegalEntityIdResponse> persistLegalEntityWithHttpInfo(LegalEntityPostRequest legalEntityPostRequest) throws RestClientException {
        Object localVarPostBody = legalEntityPostRequest;
        
        // verify the required parameter 'legalEntityPostRequest' is set
        if (legalEntityPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalEntityPostRequest' when calling persistLegalEntity");
        }
        
        String localVarPath = apiClient.expandPath("/client-api/v2/confirm-le-subscription", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<LegalEntityIdResponse> localVarReturnType = new ParameterizedTypeReference<LegalEntityIdResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Search Legal Entity by externalID
     * Search Legal Entity by externalID
     * <p><b>200</b> - No description available
     * @param legalEntityExternalId Legal Entity External Id (required)
     * @return LegalEntityTypePostResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LegalEntityTypePostResponse searchLegalEntity(String legalEntityExternalId) throws RestClientException {
        return searchLegalEntityWithHttpInfo(legalEntityExternalId).getBody();
    }

    /**
     * Search Legal Entity by externalID
     * Search Legal Entity by externalID
     * <p><b>200</b> - No description available
     * @param legalEntityExternalId Legal Entity External Id (required)
     * @return ResponseEntity&lt;LegalEntityTypePostResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LegalEntityTypePostResponse> searchLegalEntityWithHttpInfo(String legalEntityExternalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'legalEntityExternalId' is set
        if (legalEntityExternalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalEntityExternalId' when calling searchLegalEntity");
        }
        
        String localVarPath = apiClient.expandPath("/client-api/v2/verify-customer", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "legalEntityExternalId", legalEntityExternalId));

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
}
