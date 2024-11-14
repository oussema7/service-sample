package com.microsphere.dbs.onboarding.services.impl;

import com.microsphere.accesscontrol.service.api.listener.v2.FunctionGroupApi;
import com.microsphere.accesscontrol.service.api.listener.v2.FunctionGroupsApi;
import com.microsphere.accesscontrol.service.api.listener.v2.PermissionSetApi;
import com.microsphere.accesscontrol.service.api.listener.v2.ServiceAgreementApi;
import com.microsphere.accesscontrol.service.api.listener.v2.ServiceAgreementsQueryApi;
import com.microsphere.accesscontrol.service.api.listener.v2.model.FunctionGroupItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.FunctionGroupItem.TypeEnum;
import com.microsphere.accesscontrol.service.api.listener.v2.model.FunctionsGetResponseBody;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ListOfFunctionGroupsWithDataGroups;
import com.microsphere.accesscontrol.service.api.listener.v2.model.Permission;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationFunctionDataGroup;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationFunctionGroupPutRequestBody;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationGenericObjectId;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationIdentifier;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationPermissionItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationPermissionSetResponseItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.Privilege;
import com.microsphere.accesscontrol.service.api.listener.v2.model.UserAssignedFunctionGroupResponse;
import com.microsphere.accesscontrolextension.service.api.listener.v2.ServiceAgreementsApi;
import com.microsphere.accesscontrolextension.service.api.listener.v2.model.ApprovalPermissions;
import com.microsphere.accesscontrolextension.service.api.listener.v2.model.FunctionDataGroup;
import com.microsphere.dbs.onboarding.clients.UserManagerWrapper;
import com.microsphere.dbs.onboarding.mappers.FunctionGroupUpdateMapper;
import com.microsphere.dbs.onboarding.models.FunctionGroupUpdateReport;
import com.microsphere.dbs.onboarding.models.UsersAssignedFunctionGroup;
import com.microsphere.dbs.onboarding.repositories.CommercialCardRepository;
import com.microsphere.dbs.onboarding.repositories.domain.Subscription;
import com.microsphere.onboarding.client.api.rest.v2.model.CardIds;
import com.microsphere.onboarding.client.api.rest.v2.model.SubscriptionRequestBody;
import com.microsphere.onboarding.client.api.rest.v2.model.UserJobRoles;
import com.microsphere.usermanager.service.api.listener.v2.model.GetUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class UserPermissionsService {

  private final CommercialCardRepository commercialCardRepository;
  private final FunctionGroupApi functionGroupApi;
  private final PermissionSetApi permissionSetApi;
  private final ServiceAgreementApi serviceAgreementApi;
  private final UserManagerWrapper userManagerWrapper;
  private final ServiceAgreementsApi serviceAgreementsApi;
  private final FunctionGroupsApi functionGroupsApi;
  private final ServiceAgreementsQueryApi serviceAgreementsQueryApi;
  private final com.microsphere.accesscontrol.service.api.listener.v2.ServiceAgreementsApi bbServiceAgreementsApi;

  public List<UserJobRoles> validateSubscriptionPermissionsUpdate(Subscription subscription,
      CardIds newCardsExternalIds) {
    List<PresentationPermissionItem> availablePermissionsList = this.getUpdatedPermissionsList(
        newCardsExternalIds.getIds());
    FunctionGroupUpdateReport functionGroupUpdateReport = this.getFunctionGroupUpdateModel(
        subscription, availablePermissionsList);
    List<UserJobRoles> userAssignedFunctionGroup = getUsersByFunctionGroups(subscription.getSaId(),
        functionGroupUpdateReport);
    return this.enrichResponse(userAssignedFunctionGroup);
  }

  public void updateUserPermissions(SubscriptionRequestBody subscriptionUpdateRequest,
      Subscription subscription) {
    String serviceAgreementId = subscription.getSaId();
    List<PresentationPermissionItem> availablePermissionsList = this.getUpdatedPermissionsList(
        subscriptionUpdateRequest.getCardsExternalIds());
    FunctionGroupUpdateReport functionGroupUpdateReport = this.getFunctionGroupUpdateModel(
        subscription, availablePermissionsList);
    this.functionGroupsApi.putFunctionGroupsUpdate(
        functionGroupUpdateReport.getFunctionGroupsToUpdate());
    this.unassignFunctionGroups(functionGroupUpdateReport.getFunctionGroupsToUnassign().stream()
            .map(FunctionGroupItem::getId).collect(
                Collectors.toList()),
        serviceAgreementId);
    this.deleteFunctionGroups(
        functionGroupUpdateReport.getFunctionGroupsToDelete().stream().map(FunctionGroupItem::getId)
            .collect(
                Collectors.toList()));
  }

  private FunctionGroupUpdateReport getFunctionGroupUpdateModel(Subscription subscription,
      List<PresentationPermissionItem> availablePermissionsList) {
    List<PresentationFunctionGroupPutRequestBody> putRequestBody = new ArrayList<>();
    List<FunctionGroupItem> functionGroups = functionGroupApi.getFunctionGroups(
        subscription.getSaId());
    List<FunctionsGetResponseBody> businessFunctions = this.getBusinessFunctionsBySaExtId(
        subscription.getSaExtId());
    List<FunctionGroupItem> functionGroupsToUnassign = new ArrayList<>();
    List<FunctionGroupItem> functionGroupsToDelete = new ArrayList<>();
    for (FunctionGroupItem functionGroup : functionGroups) {
      if (functionGroup.getType().equals(TypeEnum.DEFAULT) || functionGroup.getType()
          .equals(TypeEnum.SYSTEM)) {
        if (functionGroup.getPermissions() != null && !functionGroup.getPermissions().isEmpty()) {
          List<Permission> permissions = functionGroup.getPermissions().stream()
              .map(permission -> this.buildUpdatedPermission(permission, availablePermissionsList))
              .filter(permission -> !permission.getAssignedPrivileges().isEmpty())
              .collect(Collectors.toList());
          if (permissions.isEmpty()) {
            functionGroupsToUnassign.add(functionGroup);
            functionGroupsToDelete.add(functionGroup);
          } else if (permissions.size() != functionGroup.getPermissions().size()) {
            functionGroup.setPermissions(permissions);
            putRequestBody.add(new PresentationFunctionGroupPutRequestBody().identifier(
                    new PresentationIdentifier().idIdentifier(functionGroup.getId()))
                .functionGroup(
                    FunctionGroupUpdateMapper.INSTANCE.functionGroupToFunctionGroupUpdate(
                        functionGroup, businessFunctions)));
          }
        }
      } else if (functionGroup.getType().equals(TypeEnum.TEMPLATE)
          && functionGroup.getPermissions() != null) {
        for (Permission permission : functionGroup.getPermissions()) {
          Permission updatedPermission = this.buildUpdatedPermission(permission,
              availablePermissionsList);
          if (updatedPermission.getAssignedPrivileges().size() != permission.getAssignedPrivileges()
              .size()) {
            functionGroupsToUnassign.add(functionGroup);
            break;
          }
        }
      }
    }

    return FunctionGroupUpdateReport.builder().functionGroupsToUpdate(putRequestBody)
        .functionGroupsToDelete(functionGroupsToDelete)
        .functionGroupsToUnassign(functionGroupsToUnassign).build();
  }

  private Permission buildUpdatedPermission(Permission permission,
      List<PresentationPermissionItem> allowedPermissions) {
    Permission newPermission = new Permission();
    List<String> newPrivileges = new ArrayList<>();
    for (PresentationPermissionItem allowedPermission : allowedPermissions) {
      if (allowedPermission.getFunctionId() != null && allowedPermission.getFunctionId()
          .equals(permission.getFunctionId())) {
        newPermission.setFunctionId(allowedPermission.getFunctionId());
        List<String> privileges = permission.getAssignedPrivileges().stream()
            .map(Privilege::getPrivilege).collect(
                Collectors.toList());

        Objects.requireNonNull(allowedPermission.getPrivileges()).forEach(p -> {
          if (privileges.contains(p) && !newPrivileges.contains(p)) {
            newPrivileges.add(p);
            newPermission.addAssignedPrivilegesItem(new Privilege().privilege(p));
          }
        });
      }
    }
    return newPermission;
  }

  private List<PresentationPermissionItem> getUpdatedPermissionsList(
      List<String> cardsExternalIds) {
    List<String> apsNames = this.getRelatedApsNames(new CardIds().ids(cardsExternalIds));
    return apsNames.stream()
        .map(this.permissionSetApi::getPermissionSet).flatMap(List::stream)
        .collect(Collectors.toList()).stream()
        .map(PresentationPermissionSetResponseItem::getPermissions).filter(Objects::nonNull)
        .flatMap(List::stream).collect(
            Collectors.toList());
  }

  private List<FunctionsGetResponseBody> getBusinessFunctionsBySaExtId(String saExternalId) {
    return this.serviceAgreementsQueryApi.getExternalexternalIdbusinessfunctions(saExternalId);
  }

  private List<String> getRelatedApsNames(CardIds cardsExternalIds) {
    return cardsExternalIds.getIds().stream().map(
            cardExternalId -> this.commercialCardRepository.findCommercialCardByExternalId(
                    cardExternalId)
                .getApsName())
        .collect(Collectors.toList());
  }

  private List<UserJobRoles> getUsersByFunctionGroups(String saId,
      FunctionGroupUpdateReport functionGroupUpdateReport) {
    Map<String, UsersAssignedFunctionGroup> assignedFunctionGroupMap = new HashMap<>();
    functionGroupUpdateReport.getFunctionGroupsToUnassign()
        .forEach(functionGroupItem -> assignedFunctionGroupMap.put(functionGroupItem.getId(),
            new UsersAssignedFunctionGroup().withFunctionGroupId(functionGroupItem.getId())
                .withFunctionGroupName(functionGroupItem.getName()).withUsers(
                    this.serviceAgreementApi.getUsers(saId, functionGroupItem.getId(), null, 1000))));

    functionGroupUpdateReport.getFunctionGroupsToUpdate()
        .forEach(functionGroupItem -> assignedFunctionGroupMap.put(
            functionGroupItem.getIdentifier().getIdIdentifier(),
            new UsersAssignedFunctionGroup().withFunctionGroupId(
                    functionGroupItem.getIdentifier().getIdIdentifier())
                .withFunctionGroupName(functionGroupItem.getFunctionGroup().getName()).withUsers(
                    this.serviceAgreementApi.getUsers(saId,
                        functionGroupItem.getIdentifier().getIdIdentifier(), null, 1000))));

    return this.transform(assignedFunctionGroupMap);
  }

  private List<UserJobRoles> transform(
      Map<String, UsersAssignedFunctionGroup> assignedFunctionGroupMap) {
    Map<String, UserJobRoles> userResponseMap = new HashMap<>();
    for (UsersAssignedFunctionGroup usersAssignedFunctionGroup : assignedFunctionGroupMap.values()) {
      List<UserAssignedFunctionGroupResponse> userResponses = usersAssignedFunctionGroup.getUsers();
      for (UserAssignedFunctionGroupResponse userResponse : userResponses) {
        String id = userResponse.getId();
        if (!userResponseMap.containsKey(id)) {
          userResponseMap.put(id, new UserJobRoles().usersId(id)
              .addJobRolesItem(
                  new com.microsphere.onboarding.client.api.rest.v2.model.FunctionGroupItem().name(
                          usersAssignedFunctionGroup.getFunctionGroupName())
                      .id(usersAssignedFunctionGroup.getFunctionGroupId())));
        } else {
          UserJobRoles userJobRoles = userResponseMap.get(id);
          userJobRoles.addJobRolesItem(
              new com.microsphere.onboarding.client.api.rest.v2.model.FunctionGroupItem().id(
                      usersAssignedFunctionGroup.getFunctionGroupId())
                  .name(usersAssignedFunctionGroup.getFunctionGroupName()));
        }
      }
    }

    return new ArrayList<>(userResponseMap.values());
  }

  private List<UserJobRoles> enrichResponse(List<UserJobRoles> userAssignedFunctionGroup) {
    return userAssignedFunctionGroup.stream().map(userJobRoles -> {
          GetUser user = this.userManagerWrapper.getUserById(userJobRoles.getUsersId());
          return userJobRoles.username(user.getExternalId()).fullName(user.getFullName());
        })
        .collect(Collectors.toList());
  }

  private void unassignFunctionGroups(List<String> functionGroups, String serviceAgreementId) {
    for (String fgId : functionGroups) {
      List<UserAssignedFunctionGroupResponse> users = this.serviceAgreementApi.getUsers(
          serviceAgreementId, fgId, null, 1000);
      for (UserAssignedFunctionGroupResponse user : users) {
        ApprovalPermissions assignUsersPermissions = this.serviceAgreementsApi.getAssignUsersPermissions(
            serviceAgreementId, user.getId());
        List<FunctionDataGroup> currentPermissions = assignUsersPermissions.getItems();
        if (currentPermissions != null) {
          // update current permissions
          currentPermissions.removeIf(
              functionDataGroup -> functionDataGroup.getFunctionGroupId() != null
                  && functionDataGroup.getFunctionGroupId().equals(fgId));
          ListOfFunctionGroupsWithDataGroups newPermissions = new ListOfFunctionGroupsWithDataGroups();
          currentPermissions.forEach(functionDataGroup -> {
            PresentationFunctionDataGroup functionDataGroup_ = new PresentationFunctionDataGroup();
            functionDataGroup_.functionGroupId(functionDataGroup.getFunctionGroupId());
            if (functionDataGroup.getDataGroupIds() != null) {
              functionDataGroup.getDataGroupIds()
                  .forEach(genericObjectId -> functionDataGroup_.addDataGroupIdsItem(
                      new PresentationGenericObjectId().id(genericObjectId.getId())));
            }
            newPermissions.addItemsItem(functionDataGroup_);
          });
          this.bbServiceAgreementsApi.putAssignUsersPermissions(serviceAgreementId,
              user.getId(), newPermissions);
        }
      }
    }
  }

  private void deleteFunctionGroups(List<String> functionGroups) {
    for (String id : functionGroups) {
      this.functionGroupsApi.deleteFunctionGroupById(id);
    }
  }
}
