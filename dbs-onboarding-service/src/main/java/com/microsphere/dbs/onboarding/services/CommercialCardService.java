package com.microsphere.dbs.onboarding.services;

import java.util.List;
import com.microsphere.dbs.onboarding.repositories.domain.CommercialCardItem;

public interface CommercialCardService {

  List<String> getApsNames(List<String> cardExternalId);

  List<CommercialCardItem> findCardItemByCardId(String externalCardsId);

  List<CommercialCardItem> findAllCardItems();

}
