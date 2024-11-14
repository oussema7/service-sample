package com.microsphere.dbs.onboarding.repositories.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Table(name = "subscription")
public class Subscription implements Serializable {

  @Id
  @GeneratedValue(
      generator = "system-uuid"
  )
  @GenericGenerator(
      name = "system-uuid",
      strategy = "uuid"
  )
  @Column(
      name = "id",
      updatable = false,
      nullable = false,
      length = 36
  )
  private String id;
  @Column(
      name = "legal_entity_external_id",
      unique = true
  )
  private String leExtId;
  @Column(
      name = "legal_entity_id",
      unique = true
  )
  private String leId;
  @Column(name = "legal_entity_name")
  private String leName;
  private String offer;
  @Column(
      name = "service_agreement_id",
      unique = true
  )
  private String saId;
  @Column(
      name = "sa_external_id",
      unique = true
  )
  private String saExtId;
  @Column(name = "status")
  @Enumerated(EnumType.STRING)
  private ExecutionStatus executionStatus;
  @Column(name = "current_step")
  @Enumerated(EnumType.STRING)
  private SubscriptionStep currentStep;
  @Column(name = "step_status")
  @Enumerated(EnumType.STRING)
  private ExecutionStatus stepStatus;
  @Column(name = "accounts")
  @Enumerated(EnumType.STRING)
  private ExecutionStatus accounts;
  @Column(name = "data_groups_creation")
  @Enumerated(EnumType.STRING)
  private ExecutionStatus dataGroupsCreation;
  @Column(name = "ibs")
  @Enumerated(EnumType.STRING)
  private ExecutionStatus ibs;
  @Column(name = "subscription_external_id")
  private String externalSubscriptionId;
  @Column(name = "email_address")
  private String emailAddress;
  @Column(name = "created_at")
  private Date createdAt;
  @Column(name = "external_subscription_status")
  private String externalSubscriptionStatus;
  @Column(name = "contrat_signe")
  private String contratSigne;
  @Column(name = "last_Name_First_Name")
  private String lastNameFirstName;
  @Column(name = "billing_account")
  private String billingAccount;
  @Column(name = "subscription_type")
  private String subscriptionType;
  @Column(name = "resiliation_motive")
  private String resiliationMotive;
  @ManyToMany
  @JoinTable(
      name = "subscription_cards",
      joinColumns = @JoinColumn(name = "id_subscription"),
      inverseJoinColumns = @JoinColumn(name = "id_card")
  )
  private List<CommercialCard> commercialCards;

}
