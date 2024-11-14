package com.microsphere.dbs.onboarding.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.microsphere.dbs.onboarding.repositories.domain.CommercialCardItem;

public interface CommercialCardItemRepository extends JpaRepository<CommercialCardItem, String> {

  List<CommercialCardItem> findByCardId(String externalCardsId);
}