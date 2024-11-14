package com.microsphere.dbs.onboarding.clients;

import com.microsphere.usermanager.extension.client.api.listener.v2.IdentityManagementServiceApi;
import com.microsphere.usermanager.extension.client.api.listener.v2.model.RevokeIdentityAccessServiceRequest;
import com.microsphere.usermanager.service.api.listener.v2.UserManagementApi;
import com.microsphere.usermanager.service.api.listener.v2.model.GetUser;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class UserManagerWrapper {

  private final UserManagementApi userManagementApi;
  private final IdentityManagementServiceApi identityManagementServiceApi;

  public GetUser getUserById(String id) {
    return this.userManagementApi.getUserById(id, true);
  }

  public List<GetUser> getUserByLegalEntityId(String leId) {
    return this.userManagementApi.getUsers(leId, null, null, null, null, null);
  }

  public void revokeUserAccess(String internalId,
      RevokeIdentityAccessServiceRequest revokeIdentityAccessServiceRequest) {
    this.identityManagementServiceApi.revokeIdentityAccess(internalId,
        revokeIdentityAccessServiceRequest);
  }

}
