package com.microsphere.dbs.onboarding.services;

import com.microsphere.onboarding.client.api.rest.v2.model.AccountDetail;
import com.microsphere.onboarding.client.api.rest.v2.model.CommercialCardResponseGet;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityIdResponse;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityPostRequest;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityTypePostResponse;
import java.util.List;
import com.microsphere.dbs.onboarding.exceptions.LegalEntityAlreadyExistException;
import com.microsphere.dbs.onboarding.exceptions.LegalEntityNotExistInCoreBankException;

public interface OnboardingService {

  LegalEntityTypePostResponse getLegalEntity(String externalId)
    throws LegalEntityAlreadyExistException, LegalEntityNotExistInCoreBankException;

  LegalEntityIdResponse createLegalEntity(LegalEntityPostRequest legalEntityPostRequest);

  List<AccountDetail> getAccountsByLeExtId(String leExternalId);

  CommercialCardResponseGet getCommercialCards(String type, String language);

}
