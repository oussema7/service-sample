package com.microsphere.dbs.onboarding.clients;

import com.microsphere.arrangement.service.api.listener.v2.ArrangementsApi;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountArrangementItemPost;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountBatchResponseItemExtended;
import com.microsphere.dbs.onboarding.exceptions.ArrangementPersistException;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class ArrangementWrapper {

  private static final Integer MAX_RETRY = 3;

  private final ArrangementsApi arrangementsApi;

  public List<AccountBatchResponseItemExtended> persistArrangements(
      List<AccountArrangementItemPost> arrangements) {
    int nbRetry = 0;
    while (nbRetry < MAX_RETRY) {
      try {
        return this.arrangementsApi.postBatchUpsertArrangements(arrangements);
      } catch (Exception ex) {
        log.error("An error occurred when persisting arrangement", ex);
        nbRetry++;
        if (nbRetry >= MAX_RETRY) {
          throw new ArrangementPersistException();
        }
      }
    }
    throw new ArrangementPersistException();
  }

}

