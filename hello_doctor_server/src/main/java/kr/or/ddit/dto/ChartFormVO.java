package kr.or.ddit.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChartFormVO {
	private String pNo;
	private String pName;
	private LocalDateTime reservedate;
	private String rsvName;
	private String pRnum;
	private String coNo;
	private String taNo;
	private String taContent;
	private LocalDateTime rsvDay;
	private String dId;
	private String rsvNo;
	private String dName;
	private String maNo;
	private String maName;
	private String pSex;

	public ChartFormVO(String pNo, String pName, LocalDateTime rsvDay, String rsvNo, String pRnum, String pSex) {
		this.pNo = pNo;
		this.pName = pName;
		this.pRnum = pRnum;
		this.rsvDay = rsvDay;
		this.rsvNo = rsvNo;
		this.pSex = pSex;
	}

	public ChartFormVO(String taNo, String coNo, String pNo, String pName, LocalDateTime reservedate, String rsvName,
			String taContent, String pSex) {
		this.pNo = pNo;
		this.pName = pName;
		this.reservedate = reservedate;
		this.rsvName = rsvName;
		this.coNo = coNo;
		this.taNo = taNo;
		this.taContent = taContent;
		this.pSex = pSex;
	}

	public ChartFormVO(String pNo, String pName, LocalDateTime reservedate, String rsvName, String pRnum, String coNo,
			String taNo, String taContent, LocalDateTime rsvDay, String dId, String rsvNo, String dName, String maNo,
			String maName, String pSex) {
		super();
		this.pNo = pNo;
		this.pName = pName;
		this.reservedate = reservedate;
		this.rsvName = rsvName;
		this.pRnum = pRnum;
		this.coNo = coNo;
		this.taNo = taNo;
		this.taContent = taContent;
		this.rsvDay = rsvDay;
		this.dId = dId;
		this.rsvNo = rsvNo;
		this.dName = dName;
		this.maNo = maNo;
		this.maName = maName;
		this.pSex = pSex;
	}

	public ChartFormVO() {
		super();
	}

}
