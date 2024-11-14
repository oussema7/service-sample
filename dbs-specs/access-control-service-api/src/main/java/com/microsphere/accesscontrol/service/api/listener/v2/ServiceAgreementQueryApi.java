package com.microsphere.accesscontrol.service.api.listener.v2;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;

import com.microsphere.accesscontrol.service.api.listener.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PersistenceServiceAgreementDataGroups;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServiceAgreementAdmins;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServiceAgreementItemQuery;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServiceAgreementParticipantsGetResponseBody;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServiceAgreementUsersQuery;

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
@Component("com.microsphere.accesscontrol.service.api.listener.v2.ServiceAgreementQueryApi")

public class ServiceAgreementQueryApi {
    private final ApiClient apiClient;


    @Autowired
    public ServiceAgreementQueryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Service Agreements GET.
     * # Service Agreements GET    Request method GET for fetching service agreement by given ID.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Service agreement retrieved.
     * <p><b>404</b> - NotFound
     * @param serviceAgreementId Service agreement internal id. (required)
     * @return ServiceAgreementItemQuery
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ServiceAgreementItemQuery getServiceAgreement(String serviceAgreementId) throws RestClientException {
        return getServiceAgreementWithHttpInfo(serviceAgreementId).getBody();
    }

    /**
     * Service Agreements GET.
     * # Service Agreements GET    Request method GET for fetching service agreement by given ID.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Service agreement retrieved.
     * <p><b>404</b> - NotFound
     * @param serviceAgreementId Service agreement internal id. (required)
     * @return ResponseEntity&lt;ServiceAgreementItemQuery&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ServiceAgreementItemQuery> getServiceAgreementWithHttpInfo(String serviceAgreementId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'serviceAgreementId' is set
        if (serviceAgreementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementId' when calling getServiceAgreement");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("serviceAgreementId", serviceAgreementId);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/serviceagreements/{serviceAgreementId}", localVarUriVariables);

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
     * Service Agreement Admins.
     * #Service Agreement Admins    Request method GET for retrieving a list of local admins of the service agreement.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Service Agreement Admins retrieved successfully.
     * <p><b>404</b> - NotFound
     * @param serviceAgreementId Service agreement internal id. (required)
     * @return ServiceAgreementAdmins
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ServiceAgreementAdmins getServiceAgreementAdmins(String serviceAgreementId) throws RestClientException {
        return getServiceAgreementAdminsWithHttpInfo(serviceAgreementId).getBody();
    }

    /**
     * Service Agreement Admins.
     * #Service Agreement Admins    Request method GET for retrieving a list of local admins of the service agreement.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Service Agreement Admins retrieved successfully.
     * <p><b>404</b> - NotFound
     * @param serviceAgreementId Service agreement internal id. (required)
     * @return ResponseEntity&lt;ServiceAgreementAdmins&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ServiceAgreementAdmins> getServiceAgreementAdminsWithHttpInfo(String serviceAgreementId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'serviceAgreementId' is set
        if (serviceAgreementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementId' when calling getServiceAgreementAdmins");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("serviceAgreementId", serviceAgreementId);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/serviceagreements/{serviceAgreementId}/admins", localVarUriVariables);

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

        ParameterizedTypeReference<ServiceAgreementAdmins> localVarReturnType = new ParameterizedTypeReference<ServiceAgreementAdmins>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves Service Agreement participants.
     * # Retrieves Service Agreement participants    Request method GET for retrieving Legal Entities that are participants  in Service Agreement together with their roles in the Service Agreement.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Service Agreement Participants retrieved successfully.
     * <p><b>404</b> - NotFound
     * @param serviceAgreementId Service agreement internal id. (required)
     * @return List&lt;ServiceAgreementParticipantsGetResponseBody&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ServiceAgreementParticipantsGetResponseBody> getServiceAgreementParticipantsQuery(String serviceAgreementId) throws RestClientException {
        return getServiceAgreementParticipantsQueryWithHttpInfo(serviceAgreementId).getBody();
    }

    /**
     * Retrieves Service Agreement participants.
     * # Retrieves Service Agreement participants    Request method GET for retrieving Legal Entities that are participants  in Service Agreement together with their roles in the Service Agreement.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Service Agreement Participants retrieved successfully.
     * <p><b>404</b> - NotFound
     * @param serviceAgreementId Service agreement internal id. (required)
     * @return ResponseEntity&lt;List&lt;ServiceAgreementParticipantsGetResponseBody&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ServiceAgreementParticipantsGetResponseBody>> getServiceAgreementParticipantsQueryWithHttpInfo(String serviceAgreementId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'serviceAgreementId' is set
        if (serviceAgreementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementId' when calling getServiceAgreementParticipantsQuery");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("serviceAgreementId", serviceAgreementId);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/serviceagreements/{serviceAgreementId}/participants", localVarUriVariables);

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

        ParameterizedTypeReference<List<ServiceAgreementParticipantsGetResponseBody>> localVarReturnType = new ParameterizedTypeReference<List<ServiceAgreementParticipantsGetResponseBody>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Service Agreement Users.
     * #Service Agreement Users    Request method GET for retrieving a list of users in the service agreement.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Service agreement users.
     * <p><b>400</b> - BadRequest
     * @param serviceAgreementId Service agreement internal id. (required)
     * @return ServiceAgreementUsersQuery
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ServiceAgreementUsersQuery getServiceAgreementUsers(String serviceAgreementId) throws RestClientException {
        return getServiceAgreementUsersWithHttpInfo(serviceAgreementId).getBody();
    }

    /**
     * Service Agreement Users.
     * #Service Agreement Users    Request method GET for retrieving a list of users in the service agreement.    **Warning: Calling this endpoint will bypass the validation of user permissions.**    **Recommendation: Use the corresponding endpoint on presentation service or use Auth Security library.**  
     * <p><b>200</b> - Service agreement users.
     * <p><b>400</b> - BadRequest
     * @param serviceAgreementId Service agreement internal id. (required)
     * @return ResponseEntity&lt;ServiceAgreementUsersQuery&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ServiceAgreementUsersQuery> getServiceAgreementUsersWithHttpInfo(String serviceAgreementId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'serviceAgreementId' is set
        if (serviceAgreementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementId' when calling getServiceAgreementUsers");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("serviceAgreementId", serviceAgreementId);
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/serviceagreements/{serviceAgreementId}/users", localVarUriVariables);

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

        ParameterizedTypeReference<ServiceAgreementUsersQuery> localVarReturnType = new ParameterizedTypeReference<ServiceAgreementUsersQuery>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Service Agreements Data Groups - &#x60;GET&#x60;.
     * # Service Agreements Data Groups - &#x60;GET&#x60;    Request method GET for fetching service agreement ids with data group ids   and data item ids  by user id, data group type, resource name, business function name   and privilege.  
     * <p><b>200</b> - Service agreement ids retrieved with data group ids and data item ids.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Privileges provided without business function name or resource name    | Message | key |  --- | --- |  |Privileges cannot be provided without business function name or resource name|serviceAgreements.get.parameters.error.message.PRIVILEGES_WITHOUT_FUNCTION_OR_RESOURCE|  
     * @param userId User id. (required)
     * @param dataGroupType Data group type. (required)
     * @param resourceName Resource name. (optional)
     * @param functionName Function name. (optional)
     * @param privileges List of comma separated privilege names. (optional)
     * @return List&lt;PersistenceServiceAgreementDataGroups&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PersistenceServiceAgreementDataGroups> getServiceAgreementsDataGroups(String userId, String dataGroupType, String resourceName, String functionName, String privileges) throws RestClientException {
        return getServiceAgreementsDataGroupsWithHttpInfo(userId, dataGroupType, resourceName, functionName, privileges).getBody();
    }

    /**
     * Service Agreements Data Groups - &#x60;GET&#x60;.
     * # Service Agreements Data Groups - &#x60;GET&#x60;    Request method GET for fetching service agreement ids with data group ids   and data item ids  by user id, data group type, resource name, business function name   and privilege.  
     * <p><b>200</b> - Service agreement ids retrieved with data group ids and data item ids.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Privileges provided without business function name or resource name    | Message | key |  --- | --- |  |Privileges cannot be provided without business function name or resource name|serviceAgreements.get.parameters.error.message.PRIVILEGES_WITHOUT_FUNCTION_OR_RESOURCE|  
     * @param userId User id. (required)
     * @param dataGroupType Data group type. (required)
     * @param resourceName Resource name. (optional)
     * @param functionName Function name. (optional)
     * @param privileges List of comma separated privilege names. (optional)
     * @return ResponseEntity&lt;List&lt;PersistenceServiceAgreementDataGroups&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PersistenceServiceAgreementDataGroups>> getServiceAgreementsDataGroupsWithHttpInfo(String userId, String dataGroupType, String resourceName, String functionName, String privileges) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getServiceAgreementsDataGroups");
        }
        
        // verify the required parameter 'dataGroupType' is set
        if (dataGroupType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dataGroupType' when calling getServiceAgreementsDataGroups");
        }
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accesscontrol/accessgroups/serviceagreements/data-items", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "dataGroupType", dataGroupType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "resourceName", resourceName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "functionName", functionName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "privileges", privileges));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PersistenceServiceAgreementDataGroups>> localVarReturnType = new ParameterizedTypeReference<List<PersistenceServiceAgreementDataGroups>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
