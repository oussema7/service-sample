package com.microsphere.accesscontrol.service.api.listener.v2;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;

import com.microsphere.accesscontrol.service.api.listener.v2.model.BadRequestError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.BatchResponseItemExtended;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ForbiddenError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.IdItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.NotFoundError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationParticipantBatchUpdate;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationServiceAgreementUsersBatchUpdate;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServiceAgreementItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServiceAgreementPut;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServicesAgreementIngest;
import com.microsphere.accesscontrol.service.api.listener.v2.model.UnauthorizedAltError;
import com.microsphere.accesscontrol.service.api.listener.v2.model.UserAssignedFunctionGroupResponse;

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
@Component("com.microsphere.accesscontrol.service.api.listener.v2.ServiceAgreementApi")

public class ServiceAgreementApi {
    private final ApiClient apiClient;


    @Autowired
    public ServiceAgreementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }


    /**
     * Service agreement retrieved.
     * Service agreement retrieved.
     * <p><b>200</b> - Service agreement by external id retrieved.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param externalId No description available (required)
     * @return ServiceAgreementItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ServiceAgreementItem getServiceAgreementExternalId(String externalId) throws RestClientException {
        return getServiceAgreementExternalIdWithHttpInfo(externalId).getBody();
    }

    /**
     * Service agreement retrieved.
     * Service agreement retrieved.
     * <p><b>200</b> - Service agreement by external id retrieved.
     * <p><b>400</b> - BadRequest
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - NotFound
     * @param externalId No description available (required)
     * @return ResponseEntity&lt;ServiceAgreementItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ServiceAgreementItem> getServiceAgreementExternalIdWithHttpInfo(String externalId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalId' when calling getServiceAgreementExternalId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("externalId", externalId);
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/serviceagreements/external/{externalId}", localVarUriVariables);

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

        ParameterizedTypeReference<ServiceAgreementItem> localVarReturnType = new ParameterizedTypeReference<ServiceAgreementItem>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Users with assigned Function Group.
     * # Retrieves information about users with assigned Function Group in Service Agreement by serviceAgreementId and functionGroupId. - &#x60;GET&#x60;. ### Warning: * Calling this endpoint will bypass the validation of user permissions of the user performing the action. ### Extendability   Extendable using REST endpoint handler: * Extending handler class: com.microsphere.accesscontrol.business.flows.serviceagreement.ServiceAgreementUsersAssignedFunctionGroupFlow 
     * <p><b>200</b> - Successfully retrieved users for service agreement by serviceAgreementId and functionGroupId.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400: * Invalid from parameter * Invalid size parameter  | Message | key |--- | --- | | Invalid from parameter.         | user.get.error.message.E_INVALID_FROM_PARAMETER| | Invalid size parameter.         | user.get.error.message.E_INVALID_SIZE_PARAMETER| 
     * <p><b>404</b> - # Reasons for getting HTTP status code 404: * SA with provided serviceAgreementId does not exist. * Function group does not exist.  | Message | key | |--- | --- | | Service agreement does not exist. | serviceAgreements.get.error.message.E_NOT_EXISTS  | | Function group does not exist.    | functionAccessGroup.get.error.message.E_NOT_EXISTS| 
     * @param serviceAgreementId Service Agreement ID (required)
     * @param functionGroupId Function Group ID (required)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query. (optional, default to 0)
     * @param size Limit the number of elements in the response. (optional, default to 10)
     * @return List&lt;UserAssignedFunctionGroupResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UserAssignedFunctionGroupResponse> getUsers(String serviceAgreementId, String functionGroupId, Integer from, Integer size) throws RestClientException {
        return getUsersWithHttpInfo(serviceAgreementId, functionGroupId, from, size).getBody();
    }

    /**
     * Users with assigned Function Group.
     * # Retrieves information about users with assigned Function Group in Service Agreement by serviceAgreementId and functionGroupId. - &#x60;GET&#x60;. ### Warning: * Calling this endpoint will bypass the validation of user permissions of the user performing the action. ### Extendability   Extendable using REST endpoint handler: * Extending handler class: com.microsphere.accesscontrol.business.flows.serviceagreement.ServiceAgreementUsersAssignedFunctionGroupFlow 
     * <p><b>200</b> - Successfully retrieved users for service agreement by serviceAgreementId and functionGroupId.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400: * Invalid from parameter * Invalid size parameter  | Message | key |--- | --- | | Invalid from parameter.         | user.get.error.message.E_INVALID_FROM_PARAMETER| | Invalid size parameter.         | user.get.error.message.E_INVALID_SIZE_PARAMETER| 
     * <p><b>404</b> - # Reasons for getting HTTP status code 404: * SA with provided serviceAgreementId does not exist. * Function group does not exist.  | Message | key | |--- | --- | | Service agreement does not exist. | serviceAgreements.get.error.message.E_NOT_EXISTS  | | Function group does not exist.    | functionAccessGroup.get.error.message.E_NOT_EXISTS| 
     * @param serviceAgreementId Service Agreement ID (required)
     * @param functionGroupId Function Group ID (required)
     * @param from Page Number. Skip over pages of elements by specifying a start value for the query. (optional, default to 0)
     * @param size Limit the number of elements in the response. (optional, default to 10)
     * @return ResponseEntity&lt;List&lt;UserAssignedFunctionGroupResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UserAssignedFunctionGroupResponse>> getUsersWithHttpInfo(String serviceAgreementId, String functionGroupId, Integer from, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'serviceAgreementId' is set
        if (serviceAgreementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementId' when calling getUsers");
        }
        
        // verify the required parameter 'functionGroupId' is set
        if (functionGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'functionGroupId' when calling getUsers");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("serviceAgreementId", serviceAgreementId);
        localVarUriVariables.put("functionGroupId", functionGroupId);
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/serviceagreements/{serviceAgreementId}/function-groups/{functionGroupId}/users", localVarUriVariables);

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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<UserAssignedFunctionGroupResponse>> localVarReturnType = new ParameterizedTypeReference<List<UserAssignedFunctionGroupResponse>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Ingest Service Agreement.
     * # Ingest Service Agreement    Creates new Service Agreement (required to provide Legal Entity participants together with Admins).
     * <p><b>201</b> - Service Agreement has been successfully ingested.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  * Legal Entity as part of Service Agreement can share Users and/or Accounts. If the LE shares Users that means that its Users can be added in the given SA and to be assigned with permissions. if the LE shares Accounts that means that its Accounts can be added and PG   * Creator of Service Agreement must be direct or indirect ancestor of the participant Legal Entities in Service Agreement.  * Invalid LE participation (some of the admins or users are not valid)  * Invalid start/end date time  * Invalid id or name identifier of assignable permission set  * Both or none of the identifiers sent for regular/admin user assignable permission set.    | Message | key |  |--- | --- |  |Legal entities hierarchy missing.|legalentity.get.error.message.E_INVALID_LEGAL_HIERARCHY|  |You can not add participants that are not under the creator legal entity hierarchy |serviceAgreements.save.error.message.E_INVALID_PARTICIPANT_HIERARCHY|  |LE Participant must share Users and/or Accounts|serviceAgreement.participant.add.error.message.E_LE_NOT_VALID_PARTICIPANT|  |Participant can not expose users if sharing users is not available.|serviceAgreement.ingest.error.message.INVALID_SHARING_USERS|  |Unexpected participants sharing options, participant should share both user and accounts.|serviceAgreement.ingest.error.message.INVALID_PARTICIPANTS_SHARING|  |Unable to create service agreement of this type. Maximum 1 per legal entity is allowed.|serviceAgreement.ingest.error.message.INVALID_MAXIMUM_SERVICE_AGREEMENTS|  |External ID already exists|serviceAgreements.save.error.message.E_EXTERNAL_ID_ALREADY_EXISTS|  |Invalid participant|participant.update.error.message.E_INVALID_PARTICIPANT|  |Wrong date/time format|datetime.valid.period.INVALID_FORMAT|  |Invalid validity period.|datetime.valid.period.INVALID_VALUE|  |Invalid id or name identifier of assignable permission set.|permissionSet.identifier.INVALID_VALUE|  |Both or none of the identifiers sent for regular/admin user assignable permission set.|permissionSet.identifier.INVALID_IDENTIFIERS|  |You cannot pass creator legal entity id for master service agreement|serviceAgreements.ingest.error.message.INVALID_PARAMETER_FOR_MASTER_SA|  
     * @param servicesAgreementIngest # Ingest Service Agreement    Creates new Service Agreement (required to provide Legal Entity participants together with Admins). (optional)
     * @return IdItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IdItem postServiceAgreementIngest(ServicesAgreementIngest servicesAgreementIngest) throws RestClientException {
        return postServiceAgreementIngestWithHttpInfo(servicesAgreementIngest).getBody();
    }

    /**
     * Ingest Service Agreement.
     * # Ingest Service Agreement    Creates new Service Agreement (required to provide Legal Entity participants together with Admins).
     * <p><b>201</b> - Service Agreement has been successfully ingested.
     * <p><b>400</b> - # Reasons for getting HTTP status code 400:    * Request does not honor the contract, check the example in the Request tab.  * Legal Entity as part of Service Agreement can share Users and/or Accounts. If the LE shares Users that means that its Users can be added in the given SA and to be assigned with permissions. if the LE shares Accounts that means that its Accounts can be added and PG   * Creator of Service Agreement must be direct or indirect ancestor of the participant Legal Entities in Service Agreement.  * Invalid LE participation (some of the admins or users are not valid)  * Invalid start/end date time  * Invalid id or name identifier of assignable permission set  * Both or none of the identifiers sent for regular/admin user assignable permission set.    | Message | key |  |--- | --- |  |Legal entities hierarchy missing.|legalentity.get.error.message.E_INVALID_LEGAL_HIERARCHY|  |You can not add participants that are not under the creator legal entity hierarchy |serviceAgreements.save.error.message.E_INVALID_PARTICIPANT_HIERARCHY|  |LE Participant must share Users and/or Accounts|serviceAgreement.participant.add.error.message.E_LE_NOT_VALID_PARTICIPANT|  |Participant can not expose users if sharing users is not available.|serviceAgreement.ingest.error.message.INVALID_SHARING_USERS|  |Unexpected participants sharing options, participant should share both user and accounts.|serviceAgreement.ingest.error.message.INVALID_PARTICIPANTS_SHARING|  |Unable to create service agreement of this type. Maximum 1 per legal entity is allowed.|serviceAgreement.ingest.error.message.INVALID_MAXIMUM_SERVICE_AGREEMENTS|  |External ID already exists|serviceAgreements.save.error.message.E_EXTERNAL_ID_ALREADY_EXISTS|  |Invalid participant|participant.update.error.message.E_INVALID_PARTICIPANT|  |Wrong date/time format|datetime.valid.period.INVALID_FORMAT|  |Invalid validity period.|datetime.valid.period.INVALID_VALUE|  |Invalid id or name identifier of assignable permission set.|permissionSet.identifier.INVALID_VALUE|  |Both or none of the identifiers sent for regular/admin user assignable permission set.|permissionSet.identifier.INVALID_IDENTIFIERS|  |You cannot pass creator legal entity id for master service agreement|serviceAgreements.ingest.error.message.INVALID_PARAMETER_FOR_MASTER_SA|  
     * @param servicesAgreementIngest # Ingest Service Agreement    Creates new Service Agreement (required to provide Legal Entity participants together with Admins). (optional)
     * @return ResponseEntity&lt;IdItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IdItem> postServiceAgreementIngestWithHttpInfo(ServicesAgreementIngest servicesAgreementIngest) throws RestClientException {
        Object localVarPostBody = servicesAgreementIngest;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/serviceagreements/ingest/serviceagreements", Collections.<String, Object>emptyMap());

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
     * batch update service agreement participants.
     * batch update service agreement participants
     * <p><b>207</b> - MultiStatusExtended
     * <p><b>404</b> - NotFound
     * <p><b>403</b> - Forbidden
     * <p><b>401</b> - Unauthorized
     * @param presentationParticipantBatchUpdate batch update service agreement participants (optional)
     * @return List&lt;BatchResponseItemExtended&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BatchResponseItemExtended> putPresentationIngestServiceAgreementParticipants(PresentationParticipantBatchUpdate presentationParticipantBatchUpdate) throws RestClientException {
        return putPresentationIngestServiceAgreementParticipantsWithHttpInfo(presentationParticipantBatchUpdate).getBody();
    }

    /**
     * batch update service agreement participants.
     * batch update service agreement participants
     * <p><b>207</b> - MultiStatusExtended
     * <p><b>404</b> - NotFound
     * <p><b>403</b> - Forbidden
     * <p><b>401</b> - Unauthorized
     * @param presentationParticipantBatchUpdate batch update service agreement participants (optional)
     * @return ResponseEntity&lt;List&lt;BatchResponseItemExtended&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BatchResponseItemExtended>> putPresentationIngestServiceAgreementParticipantsWithHttpInfo(PresentationParticipantBatchUpdate presentationParticipantBatchUpdate) throws RestClientException {
        Object localVarPostBody = presentationParticipantBatchUpdate;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/serviceagreements/ingest/service-agreements/participants", Collections.<String, Object>emptyMap());

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
     * Add or Remove admins in service agreements batch.
     * # Add or Remove admins in service agreements batch    Adds/removes admins in service agreements batch
     * <p><b>207</b> - MultiStatusExtended
     * <p><b>400</b> - BadRequest
     * @param presentationServiceAgreementUsersBatchUpdate # Add or Remove admins in service agreements batch    Adds/removes admins in service agreements batch (optional)
     * @return List&lt;BatchResponseItemExtended&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BatchResponseItemExtended> putPresentationServiceAgreementAdminsBatchUpdate(PresentationServiceAgreementUsersBatchUpdate presentationServiceAgreementUsersBatchUpdate) throws RestClientException {
        return putPresentationServiceAgreementAdminsBatchUpdateWithHttpInfo(presentationServiceAgreementUsersBatchUpdate).getBody();
    }

    /**
     * Add or Remove admins in service agreements batch.
     * # Add or Remove admins in service agreements batch    Adds/removes admins in service agreements batch
     * <p><b>207</b> - MultiStatusExtended
     * <p><b>400</b> - BadRequest
     * @param presentationServiceAgreementUsersBatchUpdate # Add or Remove admins in service agreements batch    Adds/removes admins in service agreements batch (optional)
     * @return ResponseEntity&lt;List&lt;BatchResponseItemExtended&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BatchResponseItemExtended>> putPresentationServiceAgreementAdminsBatchUpdateWithHttpInfo(PresentationServiceAgreementUsersBatchUpdate presentationServiceAgreementUsersBatchUpdate) throws RestClientException {
        Object localVarPostBody = presentationServiceAgreementUsersBatchUpdate;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/serviceagreements/ingest/service-agreements/admins", Collections.<String, Object>emptyMap());

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
     * Add or Remove users in service agreements batch.
     * # Add or Remove users in service agreements batch    Adds/removes users in service agreements batch
     * <p><b>207</b> - MultiStatusExtended
     * <p><b>400</b> - BadRequest
     * @param presentationServiceAgreementUsersBatchUpdate # Add or Remove users in service agreements batch    Adds/removes users in service agreements batch (optional)
     * @return List&lt;BatchResponseItemExtended&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BatchResponseItemExtended> putPresentationServiceAgreementUsersBatchUpdate(PresentationServiceAgreementUsersBatchUpdate presentationServiceAgreementUsersBatchUpdate) throws RestClientException {
        return putPresentationServiceAgreementUsersBatchUpdateWithHttpInfo(presentationServiceAgreementUsersBatchUpdate).getBody();
    }

    /**
     * Add or Remove users in service agreements batch.
     * # Add or Remove users in service agreements batch    Adds/removes users in service agreements batch
     * <p><b>207</b> - MultiStatusExtended
     * <p><b>400</b> - BadRequest
     * @param presentationServiceAgreementUsersBatchUpdate # Add or Remove users in service agreements batch    Adds/removes users in service agreements batch (optional)
     * @return ResponseEntity&lt;List&lt;BatchResponseItemExtended&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BatchResponseItemExtended>> putPresentationServiceAgreementUsersBatchUpdateWithHttpInfo(PresentationServiceAgreementUsersBatchUpdate presentationServiceAgreementUsersBatchUpdate) throws RestClientException {
        Object localVarPostBody = presentationServiceAgreementUsersBatchUpdate;
        
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/serviceagreements/ingest/service-agreements/users", Collections.<String, Object>emptyMap());

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
     * Updates name, description and external Id for a specific service agreement.
     * Updates name, description and external Id for a specific service agreement.
     * <p><b>200</b> - Service Agreement updated successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param serviceAgreementId Service Agreement ID (required)
     * @param serviceAgreementPut Updates name, description and external Id for a specific service agreement. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putServiceAgreementItem(String serviceAgreementId, ServiceAgreementPut serviceAgreementPut) throws RestClientException {
        putServiceAgreementItemWithHttpInfo(serviceAgreementId, serviceAgreementPut);
    }

    /**
     * Updates name, description and external Id for a specific service agreement.
     * Updates name, description and external Id for a specific service agreement.
     * <p><b>200</b> - Service Agreement updated successfully.
     * <p><b>400</b> - BadRequest
     * <p><b>404</b> - NotFound
     * @param serviceAgreementId Service Agreement ID (required)
     * @param serviceAgreementPut Updates name, description and external Id for a specific service agreement. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putServiceAgreementItemWithHttpInfo(String serviceAgreementId, ServiceAgreementPut serviceAgreementPut) throws RestClientException {
        Object localVarPostBody = serviceAgreementPut;
        
        // verify the required parameter 'serviceAgreementId' is set
        if (serviceAgreementId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAgreementId' when calling putServiceAgreementItem");
        }
        
        // create path and map variables
        final Map<String, Object> localVarUriVariables = new HashMap<String, Object>();
        localVarUriVariables.put("serviceAgreementId", serviceAgreementId);
        String localVarPath = apiClient.expandPath("/service-api/v2/accessgroups/serviceagreements/{serviceAgreementId}", localVarUriVariables);

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
