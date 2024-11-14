package com.microsphere.dbs.onboarding.clients;

import com.microsphere.dbs.onboarding.dtos.UpdateIbsRequestBody;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.microsphere.bank.backend.accounts.CusIBSResponse;
import com.microsphere.bank.backend.accounts.api.UpdateIbsApi;

@Slf4j
@Component
@RequiredArgsConstructor
public class IbsClientWrapper {

  private final UpdateIbsApi ibsApi;

  /**
   * make an api request to set the "Internet Banking Service" field in the customer table
   */
  public CusIBSResponse updateIbs(UpdateIbsRequestBody ibsRequest) {
    log.debug("sending ibs update request");
    try {
      return ibsApi.updateCusIBS(ibsRequest.getCustomerId(), ibsRequest.getIbsBody(),
          ibsRequest.getValidateOnly(), ibsRequest.getCredentials(), ibsRequest.getCompanyId(),
          ibsRequest.getDeviceId(), ibsRequest.getUserRole());
    } catch (Exception e) {
      // exception message should be enough to know the cause
      log.debug("failed to update ibs because {}", e.getMessage());
      return null;
    }
  }
}
