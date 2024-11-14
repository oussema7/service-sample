package com.microsphere.dbs.onboarding.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.microsphere.bank.backend.accounts.CusIBS;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UpdateIbsRequestBody extends BaseApiRequestBody {

  private String customerId;
  private Boolean validateOnly;
  private CusIBS ibsBody;
}
