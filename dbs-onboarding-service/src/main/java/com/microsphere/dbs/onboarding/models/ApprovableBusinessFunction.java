package com.microsphere.dbs.onboarding.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ApprovableBusinessFunction {

  String resource;
  String businessFunction;
  String approvalPolicyId;
}
