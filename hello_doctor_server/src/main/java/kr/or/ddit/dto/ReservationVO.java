package kr.or.ddit.dto;

import java.util.Date;

public class ReservationVO {

	private String rsvNo   ;
	private Date rsvDay  ;
	private String rsvDay2  ;
	private String dId     ;
	private String pNo     ;
	private String rsvName ;



	public String getRsvDay2() {
		return rsvDay2;
	}


	public void setRsvDay2(String rsvDay2) {
		this.rsvDay2 = rsvDay2;
	}


	public String getRsvNo() {
		return rsvNo;
	}


	public void setRsvNo(String rsvNo) {
		this.rsvNo = rsvNo;
	}


	public Date getRsvDay() {
		return rsvDay;
	}


	public void setRsvDay(Date rsvDay) {
		this.rsvDay = rsvDay;
	}


	public String getdId() {
		return dId;
	}


	public void setdId(String dId) {
		this.dId = dId;
	}


	public String getpNo() {
		return pNo;
	}


	public void setpNo(String pNo) {
		this.pNo = pNo;
	}


	public String getRsvName() {
		return rsvName;
	}


	public void setRsvName(String rsvName) {
		this.rsvName = rsvName;
	}


}
