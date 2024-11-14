package com.microsphere.dbs.onboarding.mappers;

import com.microsphere.accesscontrol.service.api.listener.v2.model.FunctionGroupItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.Functiongroupupdate;
import com.microsphere.accesscontrol.service.api.listener.v2.model.FunctionsGetResponseBody;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationPermissionFunctionGroupUpdate;
import com.microsphere.accesscontrol.service.api.listener.v2.model.Privilege;
import com.backbase.buildingblocks.presentation.errors.BadRequestException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class FunctionGroupUpdateMapper {

  public static final FunctionGroupUpdateMapper INSTANCE = Mappers.getMapper(
    FunctionGroupUpdateMapper.class);

  @Mapping(target = "permissions", ignore = true)
  public abstract Functiongroupupdate functionGroupToFunctionGroupUpdate(
    FunctionGroupItem functionGroupItem, List<FunctionsGetResponseBody> businessFunctions);

  @AfterMapping
  void afterMapping(@MappingTarget Functiongroupupdate functionGroupUpdate,
    FunctionGroupItem functionGroupItem, List<FunctionsGetResponseBody> businessFunctions) {
    if (functionGroupItem.getPermissions() != null && !functionGroupItem.getPermissions()
      .isEmpty()) {
      functionGroupItem.getPermissions()
        .forEach(permission -> {
          String businessFunctionName = this.getFunctionNameById(permission.getFunctionId(),
            businessFunctions);
          if (businessFunctionName == null) {
            throw new BadRequestException(
              "Unknown business function: " + permission.getFunctionId());
          }
          functionGroupUpdate.addPermissionsItem(
            new PresentationPermissionFunctionGroupUpdate().functionName(businessFunctionName)
              .privileges(permission.getAssignedPrivileges().stream()
                .map(Privilege::getPrivilege).collect(
                  Collectors.toList())));
        });
    }
  }

  String getFunctionNameById(String functionId, List<FunctionsGetResponseBody> businessFunctions) {
    for (FunctionsGetResponseBody function : businessFunctions) {
      if (Objects.equals(functionId, function.getFunctionId())) {
        return function.getName();
      }
    }

    return null;
  }

}
