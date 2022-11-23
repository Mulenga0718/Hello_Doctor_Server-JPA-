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
@Table(name="MY_ORDER")
public class MyOrderEntity {
	@Id
	@Column(name="MO_NO")
  private String moNo;
	@Column(name="DOC_ID")
  private String docId;
	@Column(name="O_DNAME")
  private String oDname;
	@Column(name="O_CLA")
  private String oCla;
	@Column(name="O_TARGET")
  private String oTarget;
	@Column(name="O_REGDATE")
  private LocalDateTime oRegdate;
	@Column(name="O_CAUTION")
  private String oCaution;
	@Column(name="O_RESULT")
  private String oResult;
	@Column(name="DEL_YN")
  private String delYn;
	@Column(name="O_NOTI")
  private String oNoti;
	@Column(name="O_TITLE")
  private String oTitle;
	@Column(name="M_NO")
  private String mNo;

public MyOrderEntity(String moNo, String docId, String oDname, String oCla, String oTarget, LocalDateTime oRegdate,
		String oCaution, String oResult, String delYn, String oNoti, String oTitle, String mNo) {
	super();
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
public MyOrderEntity() {
	super();
}

}
