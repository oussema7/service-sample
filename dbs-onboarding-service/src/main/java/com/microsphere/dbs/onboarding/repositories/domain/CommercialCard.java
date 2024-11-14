package com.microsphere.dbs.onboarding.repositories.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CommercialCard implements Serializable {

  @Id
  @Column(name = "id")
  private String id;
  private String cardGroupFr;
  private String cardGroupEn;
  @Column(name = "external_id", unique = true)
  private String externalId;
  private String nameFr;
  private String nameEn;
  private String descriptionFr;
  private String descriptionEn;
  private double price;
  private String type;
  private String apsName;
  @OneToMany(mappedBy = "cardId", fetch = FetchType.LAZY)
  @Fetch(FetchMode.SELECT)
  private List<CommercialCardItem> commercialCardItems;
  @ManyToMany(mappedBy = "commercialCards")
  private List<Subscription> subscriptionList;


  @Override
  public String toString() {
    return "CommercialCard{" +
        "id='" + id + '\'' +
        ", cardGroupFr='" + cardGroupFr + '\'' +
        ", cardGroupEn='" + cardGroupEn + '\'' +
        ", externalId='" + externalId + '\'' +
        ", nameFr='" + nameFr + '\'' +
        ", nameEn='" + nameEn + '\'' +
        ", descriptionFr='" + descriptionFr + '\'' +
        ", descriptionEn='" + descriptionEn + '\'' +
        ", price=" + price +
        ", type='" + type + '\'' +
        ", apsName='" + apsName + '\'' +
        '}';
  }
}
