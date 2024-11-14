package com.microsphere.dbs.onboarding.models;

import com.microsphere.accesscontrol.service.api.listener.v2.model.UserAssignedFunctionGroupResponse;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.With;

@With
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UsersAssignedFunctionGroup {

  String functionGroupId;
  String functionGroupName;
  List<UserAssignedFunctionGroupResponse> users;
}
