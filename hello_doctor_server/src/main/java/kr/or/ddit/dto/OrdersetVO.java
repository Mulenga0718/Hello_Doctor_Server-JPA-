package kr.or.ddit.dto;

import kr.or.ddit.entity.MyDrugEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Data
public class OrdersetVO {

	private String oNo;
	private String dId;
	private String docId;  //작성자(의사아이디)
	private String dName;  //작성자이름(의사이름)
	private String oDname; // 주상병
	private String oViewcnt;
	private String oCla;
	private String oTarget; //급여대상
	private String oRegdate;
	private String oCaution;
	private String oResult;
	private String delYn;
	private String oDrug;
	private String quantity;
	private String dgAday;
	private String dgDays;
	private String oTitle;
	private int recoCnt;
	private String oNoti;
	private String cureName;
	private int pQuantity;
	private int pAday;
	private int pDays;
	private String fbNo;
	private String dPic;
	private String fbResult;
	private String fbRegdate;
	private String maName;
	private String myCla;
	// 오더세트 추천상태
	private String rStatus;
	private String osNo;
	private String osRegdate;
	private String doId;

	//my
	private String moNo;
	private String aday;
	private String days;
	public OrdersetVO(MyDrugEntity entity) {
		super();
		this.oDrug = entity.getODrug();
		this.pQuantity = entity.getQuantity();
		this.pAday = entity.getDgAday();
		this.pDays = entity.getDgDays();
		this.moNo = entity.getMoNo();
	}
	public OrdersetVO() {
		super();
	}
	public OrdersetVO(String oNo, String dId, String docId, String dName, String oDname, String oViewcnt, String oCla,
			String oTarget, String oRegdate, String oCaution, String oResult, String delYn, String oDrug,
			String quantity, String dgAday, String dgDays, String oTitle, int recoCnt, String oNoti, String cureName,
			int pQuantity, int pAday, int pDays, String fbNo, String dPic, String fbResult, String fbRegdate,
			String maName, String myCla, String rStatus, String osNo, String osRegdate, String doId, String moNo,
			String aday, String days) {
		super();
		this.oNo = oNo;
		this.dId = dId;
		this.docId = docId;
		this.dName = dName;
		this.oDname = oDname;
		this.oViewcnt = oViewcnt;
		this.oCla = oCla;
		this.oTarget = oTarget;
		this.oRegdate = oRegdate;
		this.oCaution = oCaution;
		this.oResult = oResult;
		this.delYn = delYn;
		this.oDrug = oDrug;
		this.quantity = quantity;
		this.dgAday = dgAday;
		this.dgDays = dgDays;
		this.oTitle = oTitle;
		this.recoCnt = recoCnt;
		this.oNoti = oNoti;
		this.cureName = cureName;
		this.pQuantity = pQuantity;
		this.pAday = pAday;
		this.pDays = pDays;
		this.fbNo = fbNo;
		this.dPic = dPic;
		this.fbResult = fbResult;
		this.fbRegdate = fbRegdate;
		this.maName = maName;
		this.myCla = myCla;
		this.rStatus = rStatus;
		this.osNo = osNo;
		this.osRegdate = osRegdate;
		this.doId = doId;
		this.moNo = moNo;
		this.aday = aday;
		this.days = days;
	}





}
