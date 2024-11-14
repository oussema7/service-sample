package com.microsphere.dbs.onboarding.dtos;

import lombok.Data;

@Data
public class BaseApiRequestBody {

  private Integer pageSize;
  private Integer pageStart;
  private String pageToken;
  private String credentials;
  private String companyId;
  private String deviceId;
  private String userRole;
}
