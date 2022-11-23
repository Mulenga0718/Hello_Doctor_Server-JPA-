package kr.or.ddit.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.ToString;

@Entity
@Getter
@ToString
@Table(name = "MEDICINE")
public class MedicineEntity {
	@Id
	@Column(name = "ME_NAME")
  private String meName;
	@Column(name = "ME_NO")
  private String meNo;
	@Column(name = "ME_COMPANY")
  private String meCompany;
	@Column(name = "ME_CODE")
  private String meCode;
	@Column(name = "ME_PERMITDATE")
  private String mePermitdate;
	@Column(name = "ME_MODIDATE")
  private String meModidate;
	@Column(name = "ME_LIMIT")
  private int meLimit;
	@Column(name = "EXIST_YN")
  private String existYn;
	@Column(name = "ME_USEAGE")
  private String meUseage;
	@Column(name = "ME_INSERANCE")
  private String meInserance;
	@Column(name = "UPDATE_DATE")
  private LocalDateTime updateDate;


	public MedicineEntity(String meName, String meNo, String meCompany, String meCode, String mePermitdate, String meModidate,
			int meLimit, String existYn, String meUseage, String meInserance, LocalDateTime updateDate) {
		super();
		this.meName = meName;
		this.meNo = meNo;
		this.meCompany = meCompany;
		this.meCode = meCode;
		this.mePermitdate = mePermitdate;
		this.meModidate = meModidate;
		this.meLimit = meLimit;
		this.existYn = existYn;
		this.meUseage = meUseage;
		this.meInserance = meInserance;
		this.updateDate = updateDate;
	}
	public MedicineEntity() {
		super();
	}
	public MedicineEntity(String meName) {
		super();
		this.meName = meName;
	}

}
