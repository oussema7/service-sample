package com.microsphere.dbs.onboarding.services.impl;

import com.microsphere.dbs.onboarding.repositories.CommercialCardItemRepository;
import com.microsphere.dbs.onboarding.repositories.CommercialCardRepository;
import com.microsphere.dbs.onboarding.repositories.domain.CommercialCard;
import com.microsphere.dbs.onboarding.repositories.domain.CommercialCardItem;
import com.microsphere.dbs.onboarding.services.CommercialCardService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Slf4j
@Service
@AllArgsConstructor
public class CommercialCardServiceImpl implements CommercialCardService {

  private CommercialCardRepository commercialCardRepository;
  private CommercialCardItemRepository commercialCardItemRepository;

  @Override
  public List<String> getApsNames(List<String> cardExternalIds) {
    List<String> apsNameList = new ArrayList<>();
    if (cardExternalIds != null) {
      cardExternalIds.forEach(c -> {
        CommercialCard commercialCard = commercialCardRepository.findCommercialCardByExternalId(c);
        if (commercialCard != null) {
          apsNameList.add(commercialCard.getApsName());
        }
      });
    }

    return apsNameList.stream().distinct().filter(StringUtils::hasText)
        .collect(Collectors.toList());
  }

  @Override
  public List<CommercialCardItem> findCardItemByCardId(String externalCardsId) {
    return this.commercialCardItemRepository.findByCardId(externalCardsId);
  }

  @Override
  public List<CommercialCardItem> findAllCardItems() {
    return this.commercialCardItemRepository.findAll();
  }
}
