package kr.or.ddit.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MyOrderListVO {
	private String oDrug    ;
	private String moNo     ;
	private String quantity;
	private String dgAday;
	private String dgDays;
	private String oDname        ;
	private String delYn        ;
	private String dName;
	private String docId;
    private String oTitle;
    private String oCla;
    private String oTarget;
    private LocalDateTime oRegdate;
    private String oCaution;
    private String oResult;
    private String oNoti;
    private String mNo;


public MyOrderListVO(String moNo, String docId, String oDname, String oCla, String oTarget, LocalDateTime oRegdate,
		String oCaution, String oResult, String delYn, String oNoti, String oTitle, String mNo) {

	this.moNo = moNo;
	this.docId = docId;
	this.oDname = oDname;
	this.oCla = oCla;
	this.oTarget = oTarget;
	this.oRegdate = oRegdate;
	this.oCaution = oCaution;
	this.oResult = oResult;
	this.delYn = delYn;
	this.oNoti = oNoti;
	this.oTitle = oTitle;
	this.mNo = mNo;
}


}
