package com.microsphere.dbs.onboarding.configuration;

import java.util.concurrent.Executor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

@Slf4j
@EnableAsync
@Configuration
public class AsyncConfiguration {

  @Bean
  @Primary
  public Executor asyncTaskExecutor() {
    log.debug("creating async task executor");
    return new SimpleAsyncTaskExecutor("OnboardingAccounts-");
  }
}
