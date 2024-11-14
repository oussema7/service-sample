package com.microsphere.dbs.onboarding.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "microsphere.bank.api")
public class ApiConfigurationProperty {

  private String pullAccountUrl;
  private String ibsApiUrl;
  private String legalEntityApiUrl;
}
