package kr.or.ddit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.ToString;

@Entity
@Getter
@ToString
@Table(name = "MY_DRUG")
public class MyDrugEntity {

	@Id
	@Column(name = "O_DRUG")
	private String oDrug;
	@Column(name = "MO_NO")
	private String moNo;

	@Column(name = "QUANTITY")
	private int quantity;
	@Column(name = "DG_ADAY")
	private int dgAday;
	@Column(name = "DG_DAYS")
	private int dgDays;


	public MyDrugEntity(String oDrug, String moNo, int quantity, int dgAday, int dgDays) {
		super();
		this.oDrug = oDrug;
		this.moNo = moNo;
		this.quantity = quantity;
		this.dgAday = dgAday;
		this.dgDays = dgDays;
	}
	public MyDrugEntity() {
		super();
	}

}
