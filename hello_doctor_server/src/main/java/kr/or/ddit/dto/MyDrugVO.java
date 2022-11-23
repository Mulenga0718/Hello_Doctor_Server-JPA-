package kr.or.ddit.dto;


public class MyDrugVO {

	private String oDrug    ;
	private String moNo     ;
	private int quantity  ;
	private int dgAday      ;
	private int dgDays      ;

	public String getoDrug() {
		return oDrug;
	}

	public void setoDrug(String oDrug) {
		this.oDrug = oDrug;
	}

	public String getMoNo() {
		return moNo;
	}

	public void setMoNo(String moNo) {
		this.moNo = moNo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getDgAday() {
		return dgAday;
	}

	public void setDgAday(int dgAday) {
		this.dgAday = dgAday;
	}

	public int getDgDays() {
		return dgDays;
	}

	public void setDgDays(int dgDays) {
		this.dgDays = dgDays;
	}



}
