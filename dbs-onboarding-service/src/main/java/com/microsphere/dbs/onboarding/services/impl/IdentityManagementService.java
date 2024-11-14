package com.microsphere.dbs.onboarding.services.impl;

import com.backbase.buildingblocks.presentation.errors.NotFoundException;
import com.microsphere.usermanager.service.api.listener.v2.IdentityManagementApi;
import com.microsphere.usermanager.service.api.listener.v2.model.AssignRealm;
import com.microsphere.usermanager.service.api.listener.v2.model.Realm;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.microsphere.dbs.onboarding.exceptions.RealmNotFoundException;

@Slf4j
@Component
@AllArgsConstructor
public class IdentityManagementService {

  private final IdentityManagementApi identityManagementApi;

  public boolean linkLegalEntityToRealm(String legalEntityId, String realmName) {
    log.debug("Checking if realm '{}' exists.", realmName);
    if (!this.doesRealmExist(realmName)) {
      throw new RealmNotFoundException(String.format("realm '%s' not found", realmName));
    }

    return this.assignRealm(legalEntityId, realmName);
  }

  private boolean doesRealmExist(String realmName) {
    List<Realm> realms = this.identityManagementApi.getRealms(null);
    assert realms != null;
    for (Realm realm : realms) {
      if (realm.getRealmName().equals(realmName)) {
        return true;
      }
    }
    return false;
  }

  private boolean assignRealm(String legalEntityId, String realmName) {
    if (!isLeAlreadyAssignedToRealm(legalEntityId)) {
      // call api to assign realm
      return identityManagementApi.assignRealmWithHttpInfo(realmName,
        new AssignRealm().legalEntityId(legalEntityId)).getStatusCode().is2xxSuccessful();
    } else {
      log.debug("legal entity, with id '{}', is already assigned to realm", legalEntityId);
      return true;
    }
  }

  private boolean isLeAlreadyAssignedToRealm(String legalEntityId) {
    try {
      return !this.getLegalEntityRealms(legalEntityId).isEmpty();
    } catch (NotFoundException e) {
      return false;
    }
  }

  private List<Realm> getLegalEntityRealms(String legalEntityId) {
    List<Realm> legalEntityRealms = identityManagementApi.getRealms(legalEntityId);
    log.debug("Retrieved legal entity realm(s): {}", legalEntityRealms);
    return legalEntityRealms;
  }
}
