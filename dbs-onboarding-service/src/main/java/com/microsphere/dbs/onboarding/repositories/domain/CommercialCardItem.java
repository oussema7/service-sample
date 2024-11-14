package com.microsphere.dbs.onboarding.repositories.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CommercialCardItem")
public class CommercialCardItem implements Serializable {

  @Id
  @Column(name = "id")
  private String id;
  @Column(name = "card_id")
  private String cardId;
  private String nameFr;
  private String nameEn;
  private String approvableResource;
  private String approvableBusinessFunction;
  private String defaultApprovalPolicy;
  @ManyToOne
  @JoinColumn(name = "card_id", referencedColumnName = "external_id", insertable = false, updatable = false)
  private CommercialCard commercialCard;


}
