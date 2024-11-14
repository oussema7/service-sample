package com.microsphere.dbs.onboarding.clients;

import com.microsphere.onboarding.client.api.rest.v2.model.AccountDetail;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import com.microsphere.bank.backend.legalEntity.ClientResponse;
import com.microsphere.bank.backend.legalEntity.api.DefaultApi;
import com.microsphere.dbs.onboarding.exceptions.GetLegalEntityFromCoreBankException;

@Slf4j
@Component
@RequiredArgsConstructor
public class GetLegalEntityApiClientWrapper {

  private final DefaultApi getLegalEntity;

  public ClientResponse getLegalEntityFromCoreBank(String legalEntityExternId) {
    try {
      return getLegalEntity.identificationClient(legalEntityExternId, null, null, null, null, null,
        null, null);
    } catch (RestClientException ex) {
      log.error("RestClientException on getLegalEntity ::: ", ex);
      throw new GetLegalEntityFromCoreBankException(ex);
    } catch (Exception ex) {
      log.error("Exception on getLegalEntity ::: ", ex);
      throw new GetLegalEntityFromCoreBankException(ex);
    }
  }

  public static List<AccountDetail> extractBillingAccounts(ClientResponse clientResponse) {
    return clientResponse.getBody().stream()
      .filter(item -> item.getBillingAccountNumber() != null).map(item -> {
        String[] accountDetail = item.getBillingAccountNumber().split("\\*");
        return new AccountDetail().name(accountDetail[2]).number(accountDetail[0])
          .ctosNumber(accountDetail[1]);
      }).collect(Collectors.toList());
  }
}
