package com.microsphere.dbs.onboarding.mappers;

import com.microsphere.accesscontrol.service.api.listener.v2.model.CreateStatus;
import com.microsphere.accesscontrol.service.api.listener.v2.model.GetServiceAgreement;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityCreateItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.LegalEntityType;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ParticipantIngest;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServiceAgreementPut;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServicesAgreementIngest;
import com.microsphere.onboarding.client.api.rest.v2.model.LegalEntityPostRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
@Slf4j
public abstract class AccessGroupMapper {

  public static final AccessGroupMapper INSTANCE = Mappers.getMapper(AccessGroupMapper.class);

  private static final String BANK_CORPORATE_EXTERNAL_ID = "BANK-Corporate";

  @Mapping(source = "name", target = "name")
  @Mapping(source = "name", target = "description", qualifiedByName = "msaPostDescFormatter")
  @Mapping(source = "externalId", target = "externalId", qualifiedByName = "msaPostExtIdFormatter")
  @Mapping(source = "status", target = "status")
  @Mapping(source = "isMaster", target = "isMaster")
  @Mapping(source = "externalId", target = "participantsToIngest", qualifiedByName = "msaPostParticipantFormatter")
  @Mapping(source = "apsNames", target = "regularUserAps.nameIdentifiers")
  @Mapping(source = "apsIds", target = "regularUserAps.idIdentifiers")
  @Mapping(source = "apsNames", target = "adminUserAps.nameIdentifiers")
  @Mapping(source = "apsIds", target = "adminUserAps.idIdentifiers")
  public abstract ServicesAgreementIngest toPostServiceAgreement(String name, String externalId,
      CreateStatus status, boolean isMaster, List<String> apsNames, List<String> apsIds);

  @Mapping(source = "name", target = "name")
  @Mapping(source = "name", target = "description", qualifiedByName = {"msaPostDescFormatter"})
  @Mapping(source = "leExternalId", target = "externalId", qualifiedByName = {
      "msaPostExtIdFormatter"})
  @Mapping(source = "leMsa.validFromDate", target = "validFromDate")
  @Mapping(source = "leMsa.validFromTime", target = "validFromTime")
  @Mapping(source = "leMsa.validUntilDate", target = "validUntilDate")
  @Mapping(source = "leMsa.validUntilTime", target = "validUntilTime")
  @Mapping(source = "leMsa.status", target = "status")
  @Mapping(source = "apsNames", target = "additions", qualifiedByName = {"additionsMapper"})
  public abstract ServiceAgreementPut toPutServiceAgreementRequest(GetServiceAgreement leMsa,
      String leExternalId, String name, List<String> apsNames);

  @Mapping(source = "legalEntityPostRequest.name", target = "name")
  @Mapping(source = "legalEntityPostRequest.externalId", target = "externalId")
  @Mapping(source = "activateSingleServiceAgreement", target = "activateSingleServiceAgreement")
  public abstract LegalEntityCreateItem toLegalEntityCreateItem(
      LegalEntityPostRequest legalEntityPostRequest, boolean activateSingleServiceAgreement);

  @AfterMapping
  public void toLegalEntityCreateItemAfterMapping(@MappingTarget LegalEntityCreateItem target) {
    target.setType(LegalEntityType.CUSTOMER);
    target.setParentExternalId(BANK_CORPORATE_EXTERNAL_ID);
  }

  @Named("msaPostExtIdFormatter")
  public String formatPostServiceAgreementExtId(String externalId) {
    return String.format("sa_%s", externalId);
  }

  @Named("additionsMapper")
  public Map<String, String> additionsMapper(List<String> apsNames) {
    Map<String, String> additions = new HashMap<>();
    if (apsNames != null && !apsNames.isEmpty()) {
      additions.put("apsNames", String.join(",", apsNames));
    }
    return additions;
  }

  @Named("msaPostDescFormatter")
  public String formatPostServiceAgreementDesc(String name) {
    return String.format("Master Service Agreement for %s", name);
  }

  @Named("msaPostParticipantFormatter")
  public List<ParticipantIngest> formatPostServiceAgreementParticipants(String externalId) {
    return Collections.singletonList(
        new ParticipantIngest().externalId(externalId).sharingUsers(true).sharingAccounts(true));
  }

}
