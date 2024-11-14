package com.microsphere.dbs.onboarding.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.microsphere.dbs.onboarding.repositories.domain.Subscription;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, String> {

  @Query("SELECT s FROM Subscription s WHERE s.saExtId = ?1 AND s.externalSubscriptionStatus = ?2")
  Optional<Subscription> findBySaExtIdAndStatus(String externalServiceAgreementId, String status);

  @Query("SELECT s FROM Subscription s WHERE s.leExtId = ?1")
  List<Subscription> findAllByLeExtId(String leExtId);

  @Query("SELECT s FROM Subscription s WHERE s.leExtId = ?1 AND s.externalSubscriptionStatus = ?2")
  Optional<Subscription> findByLeExtIdAndStatus(String leExtId, String status);

  @Query("SELECT s FROM Subscription s WHERE s.leExtId = ?1 AND s.externalSubscriptionStatus = ?2 ORDER BY s.createdAt DESC")
  List<Subscription> findBySaExtIdAndStatusOrderByCreatedAtDesc(String saExtId, String status);

  @Query("SELECT s FROM Subscription s WHERE s.saId = ?1 AND s.externalSubscriptionStatus = ?2")
  Optional<Subscription> findSubscriptionBySaId(String serviceAgreementId, String status);
}

