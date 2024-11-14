package com.microsphere.usermanager.extension.client.api.listener.v2;

import com.microsphere.usermanager.extension.client.api.listener.ApiClient;

import com.microsphere.usermanager.extension.client.api.listener.v2.model.BadRequestError;
import com.microsphere.usermanager.extension.client.api.listener.v2.model.ForbiddenError;
import com.microsphere.usermanager.extension.client.api.listener.v2.model.InternalServerError;
import com.microsphere.usermanager.extension.client.api.listener.v2.model.ServiceAgreementsRequestBody;
import com.microsphere.usermanager.extension.client.api.listener.v2.model.ServiceAgreementsResponseBody;

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

@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:58.783782800+01:00[Africa/Tunis]")
@Component("com.microsphere.usermanager.extension.client.api.listener.v2.GetAllServiceAgreementApi")

public class GetAllServiceAgreementApi {
    private final ApiClient apiClient;


    @Autowired
    public GetAllServiceAgreementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * get all service agreement.
     * send mail and le .
     * <p><b>200</b> - sucessfully resend
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - InternalServerError
     * @param legalEntityId legal Entity Id (required)
     * @param serviceAgreementsRequestBody Email address to send. (required)
     * @param from The page number. Skip over pages of elements by specifying a start value for the query. (optional, default to 0)
     * @param size Limit the number of elements in the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor. (optional, default to 10)
     * @return ServiceAgreementsResponseBody
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ServiceAgreementsResponseBody getAllSAByEmailAndLe(String legalEntityId, ServiceAgreementsRequestBody serviceAgreementsRequestBody, Integer from, Integer size) throws RestClientException {
        return getAllSAByEmailAndLeWithHttpInfo(legalEntityId, serviceAgreementsRequestBody, from, size).getBody();
    }

    /**
     * get all service agreement.
     * send mail and le .
     * <p><b>200</b> - sucessfully resend
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - InternalServerError
     * @param legalEntityId legal Entity Id (required)
     * @param serviceAgreementsRequestBody Email address to send. (required)
     * @param from The page number. Skip over pages of elements by specifying a start value for the query. (optional, default to 0)
     * @param size Limit the number of elements in the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor. (optional, default to 10)
     * @return ResponseEntity&lt;ServiceAgreementsResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ServiceAgreementsResponseBody> getAllSAByEmailAndLeWithHttpInfo(String legalEntityId, ServiceAgreementsRequestBody serviceAgreementsRequestBody, Integer from, Integer size) throws RestClientException {
        Object localVarPostBody = serviceAgreementsRequestBody;
        
        // verify the required parameter 'legalEntityId' is set
        if (legalEntityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalEntityId' when calling getAllSAByEmailAndLe");
        }
        
        // verify the required parameter 'serviceAgreementsRequestBody' is set
        if (serviceAgreementsRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementsRequestBody' when calling getAllSAByEmailAndLe");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("legalEntityId", legalEntityId);
        String localVarPath = apiClient.expandPath("/client-api/v2/getAllServiceAgreement/{legalEntityId}", localVarUriVariables);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ServiceAgreementsResponseBody> localVarReturnType = new ParameterizedTypeReference<ServiceAgreementsResponseBody>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
