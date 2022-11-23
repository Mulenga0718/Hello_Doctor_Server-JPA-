package kr.or.ddit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "PATIENT")
public class PatientEntity {
  @Id
  @Column(name = "P_NO")
  private String pNo;
  @Column(name = "P_NAME")
  private String pName;
  @Column(name = "P_SEX")
  private String pSex;
  @Column(name = "P_RNUM")
  private String pRnum;
  @Column(name = "P_TEL")
  private String pTel;
  @Column(name = "P_ADDRESS")
  private String pAddress;
  @Column(name = "P_INSURANCE")
  private String pInsurance;

}
