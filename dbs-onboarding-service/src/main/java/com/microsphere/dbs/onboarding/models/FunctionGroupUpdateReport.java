package com.microsphere.dbs.onboarding.models;

import com.microsphere.accesscontrol.service.api.listener.v2.model.FunctionGroupItem;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationFunctionGroupPutRequestBody;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FunctionGroupUpdateReport {

  List<PresentationFunctionGroupPutRequestBody> functionGroupsToUpdate;
  List<FunctionGroupItem> functionGroupsToUnassign;
  List<FunctionGroupItem> functionGroupsToDelete;
}
