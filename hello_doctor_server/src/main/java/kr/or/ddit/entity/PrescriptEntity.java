package kr.or.ddit.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "PRESCRIPT")
public class PrescriptEntity {


  @EmbeddedId
  private PrescriptPk prescriptPk;

  @Column(name = "CURE_NAME")
  private String cureName;
  @Column(name = "P_QUANTITY")
  private int pQuantity;
  @Column(name = "P_ADAY")
  private int pAday;
  @Column(name = "P_DAYS")
  private int pDays;

public PrescriptEntity() {
	super();
}
public PrescriptEntity(PrescriptPk prescriptPk, String cureName, int pQuantity, int pAday, int pDays) {
	super();
	this.prescriptPk = prescriptPk;
	this.cureName = cureName;
	this.pQuantity = pQuantity;
	this.pAday = pAday;
	this.pDays = pDays;
}


}
