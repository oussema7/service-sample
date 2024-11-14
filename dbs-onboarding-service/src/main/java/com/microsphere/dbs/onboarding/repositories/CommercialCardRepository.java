package com.microsphere.dbs.onboarding.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.microsphere.dbs.onboarding.repositories.domain.CommercialCard;

public interface CommercialCardRepository extends JpaRepository<CommercialCard, String> {

  List<CommercialCard> findByType(String type);

  CommercialCard findCommercialCardByExternalId(String externalId);

  @Query(value = "SELECT * FROM subscription_cards sc, commercial_card cc WHERE sc.id_subscription LIKE %:subscriptionId% AND cc.id = sc.id_card",
    nativeQuery = true)
  Optional<List<CommercialCard>> findCardsBySubscriptionId(
    @Param("subscriptionId") String subscriptionId);

}
