package com.microsphere.dbs.onboarding.services.impl;

import com.microsphere.accesscontrol.service.api.listener.v2.LegalEntitiesApi;
import com.microsphere.accesscontrol.service.api.listener.v2.model.DataGroupItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.GetServiceAgreement;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementItemPost;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountBatchResponseItemExtended;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.microsphere.bank.backend.accounts.CusIBS;
import com.microsphere.bank.backend.accounts.CusIBSBody;
import com.microsphere.bank.backend.accounts.CusIBSResponse;
import com.microsphere.dbs.onboarding.aspect.describer.FetchArrangementsEventDescriber;
import com.microsphere.dbs.onboarding.aspect.describer.InitDataGroupsEventDescriber;
import com.microsphere.dbs.onboarding.aspect.describer.InitIbsEventDescriber;
import com.microsphere.dbs.onboarding.clients.AccessControlWrapper;
import com.microsphere.dbs.onboarding.clients.ArrangementWrapper;
import com.microsphere.dbs.onboarding.clients.CustomerAccountsApiClientWrapper;
import com.microsphere.dbs.onboarding.clients.IbsClientWrapper;
import com.microsphere.dbs.onboarding.dtos.ArrangementItemReduced;
import com.microsphere.dbs.onboarding.dtos.UpdateIbsRequestBody;
import com.microsphere.dbs.onboarding.exceptions.ArrangementPersistException;
import com.microsphere.dbs.onboarding.exceptions.DataGroupCreationException;
import com.microsphere.dbs.onboarding.exceptions.InitializeIbsException;
import com.microsphere.dbs.onboarding.mappers.ArrangementMapper;
import com.microsphere.dbs.onboarding.repositories.domain.Subscription;
import com.microsphere.dbs.onboarding.services.SubscriptionInitializerService;

@Slf4j
@Service
@RequiredArgsConstructor
public class SubscriptionInitializerServiceImpl implements SubscriptionInitializerService {

  private final CustomerAccountsApiClientWrapper customerAccountsApiClientWrapper;
  private final ArrangementWrapper arrangementWrapper;
  private final ArrangementMapper arrangementMapper;
  private final AccessControlWrapper accessControlWrapper;
  private final LegalEntitiesApi legalEntitiesApi;
  private final IbsClientWrapper ibsClientWrapper;
  private final FetchArrangementsEventDescriber fetchArrangementsEventDescriber;
  private final InitDataGroupsEventDescriber initDataGroupsEventDescriber;
  private final InitIbsEventDescriber initIbsEventDescriber;
  public static final String IBS_YES = "YES";

  @Override
  @Async
  public void initializeSubscriptionAsync(String customerId, String customerName) {
    List<ArrangementItemReduced> arrangements = this.fetchArrangements(customerId, customerName);
    this.initializeDataGroup(customerId, arrangements);
    this.initializeIbsAsync(customerId);
  }

  private List<ArrangementItemReduced> fetchArrangements(String customerId, String customerName) {
    Subscription subscription = this.fetchArrangementsEventDescriber.describeInitiated(customerId);
    List<ArrangementItemReduced> arrangementItemReducedList = new ArrayList<>();
    try {
      List<AccountArrangementItemPost> arrangements = customerAccountsApiClientWrapper.getCustomerAccounts(
          customerId).getBody().stream()
        .map(response -> this.arrangementMapper.fromGetCustomerAccountsResponseBody(response,
          customerName))
        .collect(Collectors.toList());

      if (!arrangements.isEmpty()) {
        log.debug("Arrangements to be ingested for legalEntity {}: {}", customerId,
          arrangements);
        List<AccountBatchResponseItemExtended> responseItems = this.arrangementWrapper.persistArrangements(
          arrangements);
        arrangementItemReducedList = this.enrichArrangementItem(arrangements, responseItems);
      }
      this.fetchArrangementsEventDescriber.describeSuccessful(subscription);
      return arrangementItemReducedList;
    } catch (Exception ex) {
      this.fetchArrangementsEventDescriber.describeFailed(subscription);
      throw new ArrangementPersistException();
    }
  }

  private List<ArrangementItemReduced> enrichArrangementItem(
    List<AccountArrangementItemPost> arrangements,
    List<AccountBatchResponseItemExtended> itemExtendedList) {

    Map<String, AccountBatchResponseItemExtended> itemExtendedMap =
      itemExtendedList.stream().collect(
        Collectors.toMap(AccountBatchResponseItemExtended::getResourceId, Function.identity()));

    return arrangements.stream()
      .filter(arrangement -> itemExtendedMap.containsKey(arrangement.getExternalArrangementId()))
      .map(arrangement -> {
        AccountBatchResponseItemExtended itemExtended = itemExtendedMap.get(
          arrangement.getExternalArrangementId());
        ArrangementItemReduced arrangementItemReduced = new ArrangementItemReduced();
        arrangementItemReduced.setArrangementInternalId(itemExtended.getArrangementId());
        arrangementItemReduced.setArrangementExternalId(itemExtended.getResourceId());
        arrangementItemReduced.setCurrency(arrangement.getCurrency());
        return arrangementItemReduced;
      })
      .collect(Collectors.toList());
  }

  private void initializeDataGroup(String customerId,
    List<ArrangementItemReduced> arrangementItemReducedList) {
    Subscription subscription = this.initDataGroupsEventDescriber.describeInitiated(customerId);
    try {
      if (!arrangementItemReducedList.isEmpty()) {
        GetServiceAgreement masterServiceAgreement = legalEntitiesApi.getMasterServiceAgreementByExternalLegalEntity(
          customerId);

        // Init All Accounts group
        this.addAccountToGroup(masterServiceAgreement, "All accounts / Tous les comptes",
          "All accounts of the selected context",
          arrangementItemReducedList.stream()
            .map(ArrangementItemReduced::getArrangementExternalId)
            .collect(Collectors.toList()), arrangementItemReducedList.stream()
            .map(ArrangementItemReduced::getArrangementInternalId)
            .collect(Collectors.toList()));

        //Init TND Accounts group
        this.addAccountToGroup(masterServiceAgreement, "All accounts TND / Tous les comptes en TND",
          "All TND accounts of the selected context", arrangementItemReducedList.stream().filter(
              arrangementItemReduced -> arrangementItemReduced.getCurrency().equals("TND"))
            .map(ArrangementItemReduced::getArrangementExternalId)
            .collect(Collectors.toList()), arrangementItemReducedList.stream().filter(
              arrangementItemReduced -> arrangementItemReduced.getCurrency()
                .equals("TND"))
            .map(ArrangementItemReduced::getArrangementInternalId)
            .collect(Collectors.toList()));

        // Init foreign Accounts group
        this.addAccountToGroup(masterServiceAgreement,
          "All accounts foreign currency / Tous les comptes en devises",
          "All foreign currency accounts of the selected context",
          arrangementItemReducedList.stream().filter(
              arrangementItemReduced -> !arrangementItemReduced.getCurrency().equals("TND"))
            .map(ArrangementItemReduced::getArrangementExternalId)
            .collect(Collectors.toList()), arrangementItemReducedList.stream().filter(
              arrangementItemReduced -> !arrangementItemReduced.getCurrency().equals("TND"))
            .map(ArrangementItemReduced::getArrangementInternalId)
            .collect(Collectors.toList()));
      }
      this.initDataGroupsEventDescriber.describeSuccessful(subscription);
    } catch (Exception ex) {
      this.initDataGroupsEventDescriber.describeFailed(subscription);
      throw new DataGroupCreationException();
    }
  }

  @Async
  public void initializeIbsAsync(String customerId) {
    Subscription subscription = this.initIbsEventDescriber.describeInitiated(customerId);
    try {
      CusIBSResponse cusIBSResponse = ibsClientWrapper.updateIbs(
        UpdateIbsRequestBody.builder().customerId(customerId)
          .ibsBody(new CusIBS().body(new CusIBSBody().internetBankingService(IBS_YES)))
          .build());
      log.debug("received response for ibs update: {}", cusIBSResponse);
      this.initIbsEventDescriber.describeSuccessful(subscription);
    } catch (Exception ex) {
      this.initIbsEventDescriber.describeFailed(subscription);
      throw new InitializeIbsException();
    }
  }

  private void addAccountToGroup(GetServiceAgreement masterServiceAgreement, String dataGroupName,
    String groupDescription, List<String> arrangementExternalIds,
    List<String> arrangementInternalIds) {
    if (!arrangementExternalIds.isEmpty()) {
      DataGroupItem dataGroupItem = this.accessControlWrapper.getDataGroup(
        masterServiceAgreement.getId(), dataGroupName);
      if (dataGroupItem == null) {
        this.accessControlWrapper.createDataGroup(masterServiceAgreement.getId(),
          masterServiceAgreement.getExternalId(), dataGroupName, groupDescription,
          arrangementExternalIds);
      } else {
        this.accessControlWrapper.updateDataGroup(dataGroupItem, arrangementInternalIds);
      }
    }
  }
}
