package com.microsphere.dbs.onboarding.mappers;

import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementItemPost;
import java.text.ParseException;
import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Collections;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.springframework.util.StringUtils;
import com.microsphere.bank.backend.holding_accounts.CustomerAccountsResponseBodyInner;

@Mapper(componentModel = "spring")
@Slf4j
public abstract class ArrangementMapper {

  private static final String LEGAL_ENTITY_NAME = "legalEntityName";
  private static final String PACKAGE = "package";
  private static final String IBAN_FORMAT = "TN59%s";
  private static final String BIC = "BANKTNTTTET";
  private static final String IGNORED_CATEGORY_13 = "1019";
  private static final String NON_DISPOSABLE_ACCOUNT = "1400";

  @Mapping(source = "apiResponse.accountId", target = "externalArrangementId")
  @Mapping(source = "apiResponse.customerId", target = "externalLegalEntityIds", qualifiedByName = "customerIdToList")
  @Mapping(source = "apiResponse.category", target = "externalProductId")
  @Mapping(source = "apiResponse.accountTitle", target = "name")
  @Mapping(source = "apiResponse.currency", target = "currency")
  @Mapping(source = "apiResponse.openingDate", target = "startDate", qualifiedByName = "accountToDbsDate")
  @Mapping(source = "apiResponse.openingDate", target = "accountOpeningDate", qualifiedByName = "accountToDbsDate")
  @Mapping(source = "apiResponse.dateLastUpdate", target = "lastUpdateDate", qualifiedByName = "accountToDbsDate")
  @Mapping(source = "apiResponse.accountCtos", target = "BBAN")
  @Mapping(source = "apiResponse.rib", target = "IBAN", qualifiedByName = "ribToIban")
  @Mapping(source = "apiResponse.creditAccount", target = "creditAccount")
  @Mapping(source = "apiResponse.debitAccount", target = "debitAccount")
  @Mapping(source = "apiResponse.stateId", target = "externalStateId", qualifiedByName = "stateFormatter")
  @Mapping(source = "apiResponse.accountCtosPrincipal", target = "sourceId")
  public abstract AccountArrangementItemPost fromGetCustomerAccountsResponseBody(
    CustomerAccountsResponseBodyInner apiResponse, String customerName);

  @Named("customerIdToList")
  public List<String> formatSingleSet(String customerId) {
    return Collections.singletonList(customerId);
  }

  @Named("accountToDbsDate")
  public OffsetDateTime formatAccountDate(String accountDate) throws ParseException {
    try {
      if (!StringUtils.hasText(accountDate)) {
        return null;
      }
      log.trace("parsing account date: {}", accountDate);
      return ZonedDateTime.parse(accountDate,
        new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd")
          .parseDefaulting(ChronoField.NANO_OF_DAY, 0).toFormatter()
          .withZone(ZoneId.systemDefault())).toOffsetDateTime();
    } catch (DateTimeException e) {
      log.debug("error parsing account date", e);
    }
    return null;
  }

  @Named("ribToIban")
  public String ribToIbanFormatter(String rib) {
    return String.format(IBAN_FORMAT, rib);
  }

  @Named("stateFormatter")
  public String formatAccountState(String stateId) {
    if (StringUtils.hasText(stateId) && stateId.equals("ACTIF")) {
      return "ACTIF";
    } else if (stateId.equals("Inactive")) {
      return "Inactive";
    } else {
      return "Closed";
    }
  }

  @AfterMapping
  void afterMapping(@MappingTarget AccountArrangementItemPost target,
    CustomerAccountsResponseBodyInner apiResponse, String customerName) {
    target.setBIC(BIC);
    target.putAdditionsItem(PACKAGE, apiResponse.getOptionCompte());
    target.putAdditionsItem(LEGAL_ENTITY_NAME, customerName);
    this.mapCreditDebitFlag(target);
  }

  private void mapCreditDebitFlag(AccountArrangementItemPost accountArrangementItemPost) {
    if (NON_DISPOSABLE_ACCOUNT.equals(accountArrangementItemPost.getExternalProductId())
      || IGNORED_CATEGORY_13.equals(accountArrangementItemPost.getExternalProductId())) {
      accountArrangementItemPost.setCreditAccount(false);
      accountArrangementItemPost.setDebitAccount(false);
    }
  }
}
