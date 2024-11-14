package com.microsphere.dbs.onboarding.clients;

import com.microsphere.accesscontrol.service.api.listener.v2.DataGroupApi;
import com.microsphere.accesscontrol.service.api.listener.v2.DataGroupsApi;
import com.microsphere.accesscontrol.service.api.listener.v2.model.DataGroupItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.DataGroupItemSystemBase;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationAction;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationDataGroupIdentifier;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationDataGroupItemPutRequestBody;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationItemIdentifier;
import com.microsphere.dbs.onboarding.exceptions.DataGroupCreationException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class AccessControlWrapper {

  private final DataGroupApi dataGroupApi;
  private final DataGroupsApi dataGroupsApi;

  public DataGroupItem getDataGroup(String serviceAgreementId, String dataGroupName) {
    List<DataGroupItem> dataGroupItems = this.dataGroupApi.getDataGroups(serviceAgreementId,
        "ARRANGEMENTS", true);
    for (DataGroupItem dataGroupItem : dataGroupItems) {
      if (dataGroupItem.getName().equals(dataGroupName)) {
        return dataGroupItem;
      }
    }
    return null;
  }

  public void createDataGroup(String serviceAgreementId, String externalServiceAgreementId,
      String name, String description, List<String> items) {
    DataGroupItemSystemBase dataGroup = new DataGroupItemSystemBase().name(name)
        .description(description).serviceAgreementId(serviceAgreementId)
        .externalServiceAgreementId(externalServiceAgreementId).type("ARRANGEMENTS")
        .areItemsInternalIds(false).items(items);
    try {
      dataGroupsApi.postDataGroups(dataGroup);
    } catch (Exception ex) {
      throw new DataGroupCreationException();
    }
  }

  public void updateDataGroup(DataGroupItem dataGroupItem, List<String> arrangementIds) {
    PresentationDataGroupItemPutRequestBody putRequestBody = new PresentationDataGroupItemPutRequestBody().type(
            "ARRANGEMENTS").action(PresentationAction.ADD)
        .dataGroupIdentifier(
            new PresentationDataGroupIdentifier().idIdentifier(dataGroupItem.getId()))
        .dataItems(arrangementIds.stream()
            .filter(id -> !dataGroupItem.getItems().contains(id))
            .map(id -> new PresentationItemIdentifier().internalIdIdentifier(id))
            .collect(Collectors.toList()));
    if (putRequestBody.getDataItems() != null && !putRequestBody.getDataItems().isEmpty()) {
      this.dataGroupsApi.putDataGroupItemsUpdate(Collections.singletonList(putRequestBody));
    }

  }

}
