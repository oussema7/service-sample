package com.microsphere.usermanager.service.api.listener.v2;

import com.microsphere.usermanager.service.api.listener.ApiClient;

import com.microsphere.usermanager.service.api.listener.v2.model.BadRequestError;
import com.microsphere.usermanager.service.api.listener.v2.model.ElectronicAddress;
import com.microsphere.usermanager.service.api.listener.v2.model.GetElectronicAddress;
import com.microsphere.usermanager.service.api.listener.v2.model.GetElectronicAddresses;
import com.microsphere.usermanager.service.api.listener.v2.model.GetPhoneAddress;
import com.microsphere.usermanager.service.api.listener.v2.model.GetPhoneAddresses;
import com.microsphere.usermanager.service.api.listener.v2.model.GetPostalAddress;
import com.microsphere.usermanager.service.api.listener.v2.model.GetPostalAddresses;
import com.microsphere.usermanager.service.api.listener.v2.model.NotFoundError;
import com.microsphere.usermanager.service.api.listener.v2.model.PhoneAddress;
import com.microsphere.usermanager.service.api.listener.v2.model.PostalAddress;
import com.microsphere.usermanager.service.api.listener.v2.model.ReplaceUserProfileAttributes;
import com.microsphere.usermanager.service.api.listener.v2.model.UserProfile;

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

@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:56.279646600+01:00[Africa/Tunis]")
@Component("com.microsphere.usermanager.service.api.listener.v2.UserProfileManagementApi")

public class UserProfileManagementApi {
    private final ApiClient apiClient;


    @Autowired
    public UserProfileManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Add new Electronic Address to User Profile
     * This endpoint adds a new Electronic Address to the list of User Electronic Addresses associated to a User by its internal User ID. 
     * <p><b>201</b> - Successful request
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param electronicAddress  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addElectronicAddress(String internalId, ElectronicAddress electronicAddress) throws RestClientException {
        addElectronicAddressWithHttpInfo(internalId, electronicAddress);
    }

    /**
     * Add new Electronic Address to User Profile
     * This endpoint adds a new Electronic Address to the list of User Electronic Addresses associated to a User by its internal User ID. 
     * <p><b>201</b> - Successful request
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param electronicAddress  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addElectronicAddressWithHttpInfo(String internalId, ElectronicAddress electronicAddress) throws RestClientException {
        Object localVarPostBody = electronicAddress;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling addElectronicAddress");
        }
        
        // verify the required parameter 'electronicAddress' is set
        if (electronicAddress == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'electronicAddress' when calling addElectronicAddress");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/electronic-addresses", localVarUriVariables);

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
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Add new Phone Address to User Profile
     * This endpoint adds a new Phone Address to the list of User Phone Addresses associated to a User by its internal User ID. 
     * <p><b>201</b> - Successful request
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param phoneAddress  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addPhoneAddress(String internalId, PhoneAddress phoneAddress) throws RestClientException {
        addPhoneAddressWithHttpInfo(internalId, phoneAddress);
    }

    /**
     * Add new Phone Address to User Profile
     * This endpoint adds a new Phone Address to the list of User Phone Addresses associated to a User by its internal User ID. 
     * <p><b>201</b> - Successful request
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param phoneAddress  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addPhoneAddressWithHttpInfo(String internalId, PhoneAddress phoneAddress) throws RestClientException {
        Object localVarPostBody = phoneAddress;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling addPhoneAddress");
        }
        
        // verify the required parameter 'phoneAddress' is set
        if (phoneAddress == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'phoneAddress' when calling addPhoneAddress");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/phone-addresses", localVarUriVariables);

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
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Add new Postal Address to User Profile
     * This endpoint adds a new Postal Address to the list of User Postal Addresses associated to a User by its internal User ID. 
     * <p><b>201</b> - Resource created
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param postalAddress  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addPostalAddress(String internalId, PostalAddress postalAddress) throws RestClientException {
        addPostalAddressWithHttpInfo(internalId, postalAddress);
    }

    /**
     * Add new Postal Address to User Profile
     * This endpoint adds a new Postal Address to the list of User Postal Addresses associated to a User by its internal User ID. 
     * <p><b>201</b> - Resource created
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param postalAddress  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addPostalAddressWithHttpInfo(String internalId, PostalAddress postalAddress) throws RestClientException {
        Object localVarPostBody = postalAddress;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling addPostalAddress");
        }
        
        // verify the required parameter 'postalAddress' is set
        if (postalAddress == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postalAddress' when calling addPostalAddress");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/postal-addresses", localVarUriVariables);

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
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes Electronic Address by its unique key
     * Removes an Electronic Address by its unique key and the internal ID of the user associated to this profile. 
     * <p><b>204</b> - Resource successfully deleted
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param electronicAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteElectronicAddress(String electronicAddressKey, String internalId) throws RestClientException {
        deleteElectronicAddressWithHttpInfo(electronicAddressKey, internalId);
    }

    /**
     * Deletes Electronic Address by its unique key
     * Removes an Electronic Address by its unique key and the internal ID of the user associated to this profile. 
     * <p><b>204</b> - Resource successfully deleted
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param electronicAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteElectronicAddressWithHttpInfo(String electronicAddressKey, String internalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'electronicAddressKey' is set
        if (electronicAddressKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'electronicAddressKey' when calling deleteElectronicAddress");
        }
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling deleteElectronicAddress");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("electronicAddressKey", electronicAddressKey);
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/electronic-addresses/{electronicAddressKey}", localVarUriVariables);

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
     * Delete user phone number
     * Delete a singular phone number based on the key. 
     * <p><b>204</b> - Resource successfully deleted
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param phoneAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deletePhoneAddress(String phoneAddressKey, String internalId) throws RestClientException {
        deletePhoneAddressWithHttpInfo(phoneAddressKey, internalId);
    }

    /**
     * Delete user phone number
     * Delete a singular phone number based on the key. 
     * <p><b>204</b> - Resource successfully deleted
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param phoneAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deletePhoneAddressWithHttpInfo(String phoneAddressKey, String internalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'phoneAddressKey' is set
        if (phoneAddressKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'phoneAddressKey' when calling deletePhoneAddress");
        }
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling deletePhoneAddress");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("phoneAddressKey", phoneAddressKey);
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/phone-addresses/{phoneAddressKey}", localVarUriVariables);

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
     * Deletes Postal Address by its unique key
     * Removes a Postal Address by its unique key and the internal ID of the user associated to this profile. 
     * <p><b>204</b> - Resource deleted
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param postalAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deletePostalAddress(String postalAddressKey, String internalId) throws RestClientException {
        deletePostalAddressWithHttpInfo(postalAddressKey, internalId);
    }

    /**
     * Deletes Postal Address by its unique key
     * Removes a Postal Address by its unique key and the internal ID of the user associated to this profile. 
     * <p><b>204</b> - Resource deleted
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param postalAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deletePostalAddressWithHttpInfo(String postalAddressKey, String internalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'postalAddressKey' is set
        if (postalAddressKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postalAddressKey' when calling deletePostalAddress");
        }
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling deletePostalAddress");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("postalAddressKey", postalAddressKey);
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/postal-addresses/{postalAddressKey}", localVarUriVariables);

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
     * Retrieves Electronic Address by its unique key
     * Retrieves an Electronic Address by its unique key and the internal ID of the user associated to this profile. 
     * <p><b>200</b> - Successful request
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param electronicAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @return GetElectronicAddress
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetElectronicAddress getElectronicAddress(String electronicAddressKey, String internalId) throws RestClientException {
        return getElectronicAddressWithHttpInfo(electronicAddressKey, internalId).getBody();
    }

    /**
     * Retrieves Electronic Address by its unique key
     * Retrieves an Electronic Address by its unique key and the internal ID of the user associated to this profile. 
     * <p><b>200</b> - Successful request
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param electronicAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @return ResponseEntity&lt;GetElectronicAddress&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetElectronicAddress> getElectronicAddressWithHttpInfo(String electronicAddressKey, String internalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'electronicAddressKey' is set
        if (electronicAddressKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'electronicAddressKey' when calling getElectronicAddress");
        }
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling getElectronicAddress");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("electronicAddressKey", electronicAddressKey);
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/electronic-addresses/{electronicAddressKey}", localVarUriVariables);

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

        ParameterizedTypeReference<GetElectronicAddress> localVarReturnType = new ParameterizedTypeReference<GetElectronicAddress>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Electronic Addresses by User internal ID
     * Retrieves a list of User Electronic Addresses associated to a User by its internal ID. The addresses will be sorted with the primary address first, then sorted alphabetically by type and then alphabetically by key. 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @return GetElectronicAddresses
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetElectronicAddresses getElectronicAddresses(String internalId) throws RestClientException {
        return getElectronicAddressesWithHttpInfo(internalId).getBody();
    }

    /**
     * Get Electronic Addresses by User internal ID
     * Retrieves a list of User Electronic Addresses associated to a User by its internal ID. The addresses will be sorted with the primary address first, then sorted alphabetically by type and then alphabetically by key. 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @return ResponseEntity&lt;GetElectronicAddresses&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetElectronicAddresses> getElectronicAddressesWithHttpInfo(String internalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling getElectronicAddresses");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/electronic-addresses", localVarUriVariables);

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

        ParameterizedTypeReference<GetElectronicAddresses> localVarReturnType = new ParameterizedTypeReference<GetElectronicAddresses>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get user phone number
     * Get singular phone number based on the key. 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param phoneAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @return GetPhoneAddress
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetPhoneAddress getPhoneAddress(String phoneAddressKey, String internalId) throws RestClientException {
        return getPhoneAddressWithHttpInfo(phoneAddressKey, internalId).getBody();
    }

    /**
     * Get user phone number
     * Get singular phone number based on the key. 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param phoneAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @return ResponseEntity&lt;GetPhoneAddress&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetPhoneAddress> getPhoneAddressWithHttpInfo(String phoneAddressKey, String internalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'phoneAddressKey' is set
        if (phoneAddressKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'phoneAddressKey' when calling getPhoneAddress");
        }
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling getPhoneAddress");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("phoneAddressKey", phoneAddressKey);
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/phone-addresses/{phoneAddressKey}", localVarUriVariables);

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

        ParameterizedTypeReference<GetPhoneAddress> localVarReturnType = new ParameterizedTypeReference<GetPhoneAddress>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Phone Addresses by User internal ID
     * Retrieves a list of User Phone Addresses associated to a User by its internal ID. The addresses will be sorted with the primary address first, then sorted alphabetically by type and then alphabetically by key. 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @return GetPhoneAddresses
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetPhoneAddresses getPhoneAddresses(String internalId) throws RestClientException {
        return getPhoneAddressesWithHttpInfo(internalId).getBody();
    }

    /**
     * Get Phone Addresses by User internal ID
     * Retrieves a list of User Phone Addresses associated to a User by its internal ID. The addresses will be sorted with the primary address first, then sorted alphabetically by type and then alphabetically by key. 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @return ResponseEntity&lt;GetPhoneAddresses&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetPhoneAddresses> getPhoneAddressesWithHttpInfo(String internalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling getPhoneAddresses");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/phone-addresses", localVarUriVariables);

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

        ParameterizedTypeReference<GetPhoneAddresses> localVarReturnType = new ParameterizedTypeReference<GetPhoneAddresses>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves Postal Address by its unique key
     * Retrieves a Postal Address by its unique key and the internal ID of the user associated to this profile. 
     * <p><b>200</b> - Successful request
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param postalAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @return GetPostalAddress
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetPostalAddress getPostalAddress(String postalAddressKey, String internalId) throws RestClientException {
        return getPostalAddressWithHttpInfo(postalAddressKey, internalId).getBody();
    }

    /**
     * Retrieves Postal Address by its unique key
     * Retrieves a Postal Address by its unique key and the internal ID of the user associated to this profile. 
     * <p><b>200</b> - Successful request
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param postalAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @return ResponseEntity&lt;GetPostalAddress&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetPostalAddress> getPostalAddressWithHttpInfo(String postalAddressKey, String internalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'postalAddressKey' is set
        if (postalAddressKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postalAddressKey' when calling getPostalAddress");
        }
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling getPostalAddress");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("postalAddressKey", postalAddressKey);
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/postal-addresses/{postalAddressKey}", localVarUriVariables);

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

        ParameterizedTypeReference<GetPostalAddress> localVarReturnType = new ParameterizedTypeReference<GetPostalAddress>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get Postal Addresses by User internal ID
     * Retrieves a list of User Postal Addresses associated to a User by its internal ID. The addresses will be sorted with the primary address first, then sorted alphabetically by type and then alphabetically by key. 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @return GetPostalAddresses
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetPostalAddresses getPostalAddresses(String internalId) throws RestClientException {
        return getPostalAddressesWithHttpInfo(internalId).getBody();
    }

    /**
     * Get Postal Addresses by User internal ID
     * Retrieves a list of User Postal Addresses associated to a User by its internal ID. The addresses will be sorted with the primary address first, then sorted alphabetically by type and then alphabetically by key. 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @return ResponseEntity&lt;GetPostalAddresses&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetPostalAddresses> getPostalAddressesWithHttpInfo(String internalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling getPostalAddresses");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/postal-addresses", localVarUriVariables);

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

        ParameterizedTypeReference<GetPostalAddresses> localVarReturnType = new ParameterizedTypeReference<GetPostalAddresses>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get User Profile by its User internal ID
     * Retrieves the User Profile information associated to a User by its internal ID. The addresses will be sorted with the primary address first, then sorted alphabetically by type and then alphabetically by key. 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @return UserProfile
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserProfile getUserProfile(String internalId) throws RestClientException {
        return getUserProfileWithHttpInfo(internalId).getBody();
    }

    /**
     * Get User Profile by its User internal ID
     * Retrieves the User Profile information associated to a User by its internal ID. The addresses will be sorted with the primary address first, then sorted alphabetically by type and then alphabetically by key. 
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @return ResponseEntity&lt;UserProfile&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserProfile> getUserProfileWithHttpInfo(String internalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling getUserProfile");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile", localVarUriVariables);

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

        ParameterizedTypeReference<UserProfile> localVarReturnType = new ParameterizedTypeReference<UserProfile>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Replace User Profile Attributes by User internal ID
     * Replace User Profile by User internal ID Serves as an extension point to allow any data model extensions made at the top level of the user profile to be added or updated via the _additions_ map. These are only passed down to the outbound integration service and are **not** stored in DBS. Note that as per the empty request body defined, this endpoint **cannot** be used to update any other profile data. 
     * <p><b>204</b> - Successful update
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param replaceUserProfileAttributes  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void replaceUserProfileAttributes(String internalId, ReplaceUserProfileAttributes replaceUserProfileAttributes) throws RestClientException {
        replaceUserProfileAttributesWithHttpInfo(internalId, replaceUserProfileAttributes);
    }

    /**
     * Replace User Profile Attributes by User internal ID
     * Replace User Profile by User internal ID Serves as an extension point to allow any data model extensions made at the top level of the user profile to be added or updated via the _additions_ map. These are only passed down to the outbound integration service and are **not** stored in DBS. Note that as per the empty request body defined, this endpoint **cannot** be used to update any other profile data. 
     * <p><b>204</b> - Successful update
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param internalId User internal ID (required)
     * @param replaceUserProfileAttributes  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> replaceUserProfileAttributesWithHttpInfo(String internalId, ReplaceUserProfileAttributes replaceUserProfileAttributes) throws RestClientException {
        Object localVarPostBody = replaceUserProfileAttributes;
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling replaceUserProfileAttributes");
        }
        
        // verify the required parameter 'replaceUserProfileAttributes' is set
        if (replaceUserProfileAttributes == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'replaceUserProfileAttributes' when calling replaceUserProfileAttributes");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile", localVarUriVariables);

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
    /**
     * Updates Electronic Address by its unique key
     * Modifies an Electronic Address by its unique key and the internal ID of the user associated to this profile. 
     * <p><b>204</b> - Resource successfully updated
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param electronicAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @param electronicAddress  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateElectronicAddress(String electronicAddressKey, String internalId, ElectronicAddress electronicAddress) throws RestClientException {
        updateElectronicAddressWithHttpInfo(electronicAddressKey, internalId, electronicAddress);
    }

    /**
     * Updates Electronic Address by its unique key
     * Modifies an Electronic Address by its unique key and the internal ID of the user associated to this profile. 
     * <p><b>204</b> - Resource successfully updated
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param electronicAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @param electronicAddress  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateElectronicAddressWithHttpInfo(String electronicAddressKey, String internalId, ElectronicAddress electronicAddress) throws RestClientException {
        Object localVarPostBody = electronicAddress;
        
        // verify the required parameter 'electronicAddressKey' is set
        if (electronicAddressKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'electronicAddressKey' when calling updateElectronicAddress");
        }
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling updateElectronicAddress");
        }
        
        // verify the required parameter 'electronicAddress' is set
        if (electronicAddress == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'electronicAddress' when calling updateElectronicAddress");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("electronicAddressKey", electronicAddressKey);
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/electronic-addresses/{electronicAddressKey}", localVarUriVariables);

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
    /**
     * Update user phone number
     * Updates a phone number for a user. 
     * <p><b>204</b> - Resource updated
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param phoneAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @param phoneAddress  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updatePhoneAddress(String phoneAddressKey, String internalId, PhoneAddress phoneAddress) throws RestClientException {
        updatePhoneAddressWithHttpInfo(phoneAddressKey, internalId, phoneAddress);
    }

    /**
     * Update user phone number
     * Updates a phone number for a user. 
     * <p><b>204</b> - Resource updated
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param phoneAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @param phoneAddress  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updatePhoneAddressWithHttpInfo(String phoneAddressKey, String internalId, PhoneAddress phoneAddress) throws RestClientException {
        Object localVarPostBody = phoneAddress;
        
        // verify the required parameter 'phoneAddressKey' is set
        if (phoneAddressKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'phoneAddressKey' when calling updatePhoneAddress");
        }
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling updatePhoneAddress");
        }
        
        // verify the required parameter 'phoneAddress' is set
        if (phoneAddress == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'phoneAddress' when calling updatePhoneAddress");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("phoneAddressKey", phoneAddressKey);
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/phone-addresses/{phoneAddressKey}", localVarUriVariables);

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
    /**
     * Edit Postal Address by its unique key
     * Modifies a Postal Address by its unique key and the internal ID of the user associated to this profile. 
     * <p><b>204</b> - Resource successfully updated
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param postalAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @param postalAddress  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updatePostalAddress(String postalAddressKey, String internalId, PostalAddress postalAddress) throws RestClientException {
        updatePostalAddressWithHttpInfo(postalAddressKey, internalId, postalAddress);
    }

    /**
     * Edit Postal Address by its unique key
     * Modifies a Postal Address by its unique key and the internal ID of the user associated to this profile. 
     * <p><b>204</b> - Resource successfully updated
     * <p><b>400</b> - The request does not meet the API Specification or contains validation errors
     * <p><b>404</b> - The resource couldn&#39;t be found
     * @param postalAddressKey Unique identifier of the resource (required)
     * @param internalId User internal ID (required)
     * @param postalAddress  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updatePostalAddressWithHttpInfo(String postalAddressKey, String internalId, PostalAddress postalAddress) throws RestClientException {
        Object localVarPostBody = postalAddress;
        
        // verify the required parameter 'postalAddressKey' is set
        if (postalAddressKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postalAddressKey' when calling updatePostalAddress");
        }
        
        // verify the required parameter 'internalId' is set
        if (internalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'internalId' when calling updatePostalAddress");
        }
        
        // verify the required parameter 'postalAddress' is set
        if (postalAddress == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postalAddress' when calling updatePostalAddress");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("postalAddressKey", postalAddressKey);
        localVarUriVariables.put("internalId", internalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/users/{internalId}/profile/postal-addresses/{postalAddressKey}", localVarUriVariables);

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
