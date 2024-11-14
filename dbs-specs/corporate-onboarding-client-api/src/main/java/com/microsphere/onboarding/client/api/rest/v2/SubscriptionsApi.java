/*
Boat Generator configuration:
    useBeanValidation: true
    useOptional: false
    addServletRequest: false
    addBindingResult: false
    useLombokAnnotations: false
    openApiNullable: true
    useSetForUniqueItems: false
    useWithModifiers: false
*/
package com.microsphere.onboarding.client.api.rest.v2;

import com.microsphere.onboarding.client.api.rest.v2.model.AccountDetail;
import com.microsphere.onboarding.client.api.rest.v2.model.CardIds;
import com.microsphere.onboarding.client.api.rest.v2.model.ResiliationPutRequest;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionRequestBody;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionResponse;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionResponseBody;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionsPage;
import com.microsphere.onboarding.client.api.rest.v2.model.UserJobRoles;
import java.util.Set;
import java.util.LinkedHashSet;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;


import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")
@Api(value = "Subscriptions", description = "the Subscriptions API")
public interface SubscriptionsApi {

    /**
     * GET /client-api/v2/legal-entities/{externalId}/billing-accounts : Get billing accounts by legalEntity ID
     * Returns a list of billing accounts associated with the legal entity external ID provided in the path parameter.
     *
     * @param externalId external ID of the legal entity to retrieve billing accounts for. (required)
     * @return A list of billing accounts. (status code 200)
     *         or The specified legal entity external ID was not found. (status code 404)
     */
    @ApiOperation(value = "Get billing accounts by legalEntity ID", nickname = "getAccountsByLegalEntityExtId", notes = "Returns a list of billing accounts associated with the legal entity external ID provided in the path parameter.", response = AccountDetail.class, responseContainer = "List", tags={ "subscriptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of billing accounts.", response = AccountDetail.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "The specified legal entity external ID was not found.") })
    @RequestMapping(value = "/client-api/v2/legal-entities/{externalId}/billing-accounts",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<AccountDetail>> getAccountsByLegalEntityExtId(
            @ApiParam(value = "external ID of the legal entity to retrieve billing accounts for.",required=true)
            @PathVariable("externalId")
             String externalId

    );


    /**
     * GET /client-api/v2/getAllSubscriptions
     *
     * @param page page number (required)
     * @param size page size (required)
     * @param query The search term used to search for sweep rules (optional)
     * @return subscriptions retrieved (status code 200)
     */
    @ApiOperation(value = "", nickname = "getAllSubscriptions", notes = "", response = SubscriptionsPage.class, tags={ "subscriptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "subscriptions retrieved", response = SubscriptionsPage.class) })
    @RequestMapping(value = "/client-api/v2/getAllSubscriptions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<SubscriptionsPage> getAllSubscriptions(
            @ApiParam(value = "page number", required = true) @Valid
            @RequestParam(value = "page", required = true)
            @NotNull
            
            @Size(min=1)  Integer page
,
                    @ApiParam(value = "page size", required = true) @Valid
            @RequestParam(value = "size", required = true)
            @NotNull
            
             Integer size
,
                    @ApiParam(value = "The search term used to search for sweep rules") @Valid
            @RequestParam(value = "query", required = false)
            
             String query

    );


    /**
     * GET /client-api/v2/getSubscriptionById : Get subscription by id
     * Get subscription workflow steps by id
     *
     * @param subscriptionId subscription id (required)
     * @return No description available (status code 200)
     */
    @ApiOperation(value = "Get subscription by id", nickname = "getSubscriptionById", notes = "Get subscription workflow steps by id", response = SubscriptionResponseBody.class, tags={ "subscriptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "No description available", response = SubscriptionResponseBody.class) })
    @RequestMapping(value = "/client-api/v2/getSubscriptionById",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<SubscriptionResponseBody> getSubscriptionById(
            @ApiParam(value = "subscription id", required = true) @Valid
            @RequestParam(value = "subscriptionId", required = true)
            @NotNull
            
             String subscriptionId

    );


    /**
     * GET /service-api/v2/subscriptions/service-agreement/{serviceAgreementId} : get subscription by service agreement id
     * get subscription by service agreement id
     *
     * @param serviceAgreementId  (required)
     * @return No description available (status code 200)
     */
    @ApiOperation(value = "get subscription by service agreement id", nickname = "getSubscriptionByServiceAgreementId", notes = "get subscription by service agreement id", response = SubscriptionResponse.class, tags={ "subscriptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "No description available", response = SubscriptionResponse.class) })
    @RequestMapping(value = "/service-api/v2/subscriptions/service-agreement/{serviceAgreementId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<SubscriptionResponse> getSubscriptionByServiceAgreementId(
            @ApiParam(value = "",required=true)
            @PathVariable("serviceAgreementId")
             String serviceAgreementId

    );


    /**
     * POST /client-api/v2/subscriptions/{subscriptionId}/unassing-job-roles : Get users under SA with their permission set
     * No description available
     *
     * @param subscriptionId get list of job roles for each user (required)
     * @param cardIds  (required)
     * @return list of users with their job roles (status code 200)
     */
    @ApiOperation(value = "Get users under SA with their permission set", nickname = "getUsersWithJobRoles", notes = "No description available", response = UserJobRoles.class, responseContainer = "List", tags={ "subscriptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "list of users with their job roles", response = UserJobRoles.class, responseContainer = "List") })
    @RequestMapping(value = "/client-api/v2/subscriptions/{subscriptionId}/unassing-job-roles",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<UserJobRoles>> getUsersWithJobRoles(
            @ApiParam(value = "get list of job roles for each user",required=true)
            @PathVariable("subscriptionId")
             String subscriptionId
,
                    @ApiParam(value = "" ,required=true )
            @Valid @NotNull
            @RequestBody CardIds cardIds

    );


    /**
     * PUT /client-api/v2/resiliate-subscription : Resiliate subscription
     * Resiliate subscription
     *
     * @param resiliationPutRequest  (required)
     * @return subscription resiliated successfully (status code 200)
     *         or legal entity not found (status code 404)
     */
    @ApiOperation(value = "Resiliate subscription", nickname = "resiliateSubscription", notes = "Resiliate subscription", tags={ "subscriptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "subscription resiliated successfully"),
        @ApiResponse(code = 404, message = "legal entity not found") })
    @RequestMapping(value = "/client-api/v2/resiliate-subscription",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> resiliateSubscription(
            @ApiParam(value = "" ,required=true )
            @Valid @NotNull
            @RequestBody ResiliationPutRequest resiliationPutRequest

    );


    /**
     * POST /client-api/v2/retry-subscription : Retry subscription in case of failure
     * Retry subscription in case of failure
     *
     * @param subscriptionId legal entity external id (required)
     * @return No description available (status code 200)
     */
    @ApiOperation(value = "Retry subscription in case of failure", nickname = "retrySubscription", notes = "Retry subscription in case of failure", response = SubscriptionResponseBody.class, tags={ "subscriptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "No description available", response = SubscriptionResponseBody.class) })
    @RequestMapping(value = "/client-api/v2/retry-subscription",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<SubscriptionResponseBody> retrySubscription(
            @ApiParam(value = "legal entity external id", required = true) @Valid
            @RequestParam(value = "subscriptionId", required = true)
            @NotNull
            
             String subscriptionId

    );


    /**
     * PUT /client-api/v2/subscriptions/{id} : update subscription
     * update subscription
     *
     * @param id  (required)
     * @param subscriptionRequestBody  (required)
     * @return subscription updated successfully (status code 200)
     *         or subscription not found (status code 400)
     */
    @ApiOperation(value = "update subscription", nickname = "updateSubscriptionById", notes = "update subscription", response = SubscriptionResponseBody.class, tags={ "subscriptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "subscription updated successfully", response = SubscriptionResponseBody.class),
        @ApiResponse(code = 400, message = "subscription not found") })
    @RequestMapping(value = "/client-api/v2/subscriptions/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<SubscriptionResponseBody> updateSubscriptionById(
            @ApiParam(value = "",required=true)
            @PathVariable("id")
             String id
,
                    @ApiParam(value = "" ,required=true )
            @Valid @NotNull
            @RequestBody SubscriptionRequestBody subscriptionRequestBody

    );

}
