package kr.or.ddit.dto;

import kr.or.ddit.entity.PrescriptEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PrescriptVO {
	private String mNo        ;
	private String preNo      ;
	private String cureName   ;
	private int pQuantity    ;
	private int pAday        ;
	private int pDays        ;
	public PrescriptVO(String mNo, String preNo, String cureName, int pQuantity, int pAday, int pDays) {
		super();
		this.mNo = mNo;
		this.preNo = preNo;
		this.cureName = cureName;
		this.pQuantity = pQuantity;
		this.pAday = pAday;
		this.pDays = pDays;
	}



	public PrescriptVO() {
		super();
	}



	public PrescriptVO(PrescriptEntity entity) {
		super();
		this.mNo = entity.getPrescriptPk().getMno();
		this.preNo = entity.getPrescriptPk().getPreNo();
		this.cureName = entity.getCureName();
		this.pQuantity = entity.getPQuantity();
		this.pAday = entity.getPAday();
		this.pDays = entity.getPDays();
	}






}
