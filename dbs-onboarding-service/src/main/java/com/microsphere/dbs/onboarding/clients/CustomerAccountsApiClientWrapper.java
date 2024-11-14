package com.microsphere.dbs.onboarding.clients;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import com.microsphere.bank.backend.holding_accounts.CustomerAccountsResponse;
import com.microsphere.bank.backend.holding_accounts.api.DefaultApi;
import com.microsphere.dbs.onboarding.exceptions.GetAccountsFromCoreBankException;

@Slf4j
@Component
@RequiredArgsConstructor
public class CustomerAccountsApiClientWrapper {

  private final DefaultApi defaultApi;

  public CustomerAccountsResponse getCustomerAccounts(String customerId) {
    try {
      return defaultApi.getCustomerAccounts(customerId, null, null, null,null,null,null,null);
    } catch (RestClientException ex) {
      log.error("RestClientException on getCustomerAccounts ::: ", ex);
      throw new GetAccountsFromCoreBankException(ex);
    } catch (Exception ex) {
      log.error("Exception on getCustomerAccounts ::: ", ex);
      throw new GetAccountsFromCoreBankException(ex);
    }
  }
}
