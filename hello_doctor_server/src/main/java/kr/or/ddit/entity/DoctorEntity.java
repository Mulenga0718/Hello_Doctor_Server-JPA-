package kr.or.ddit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.ToString;

@Entity
@Getter
@ToString
@Table(name = "DOCTOR")
public class DoctorEntity {
	@Id
	@Column(name = "D_ID")
	private String dId;
	@Column(name = "MA_NO")
	private String maNo;
	@Column(name = "D_NAME")
	private String dName;
	@Column(name = "PWD")
	private String pwd;
	@Column(name = "TEL")
	private String tel;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "STATUS")
	private int status;
	@Column(name = "D_PIC")
	private String dPic;
	@Column(name = "REGDATE")
	private Date regdate;
	@Column(name = "ACCOUNT_STATUS")
	private int accountStatus;
	@Column(name = "RESIDENT_NUM")
	private String residentNum;
	@Column(name = "RETIREDATE")
	private Date retiredate;
	@Column(name = "SUS_STARTDATE")
	private Date susStartdate;
	@Column(name = "SUS_ENDDATE")
	private Date susEnddate;
	@Column(name = "OTP_QR")
	private String otpQr;
	@Column(name = "OTP_CO")
	private String otpCo;
	@Column(name = "D_OFFICE")
	private String dOffice;
	@Column(name = "D_EXAM")
	private String dExam;
	@Column(name = "AUTHORITY")
	private String authority;
	@Column(name = "ENABLED")
	private int enabled;
	@Column(name = "SM_NAME")
	private String smName;
	@Column(name = "OTP_CHECK")
	private String otpCheck;

	public DoctorEntity(String dId, String maNo, String dName, String pwd, String tel, String email, int status,
			String dPic, Date regdate, int accountStatus, String residentNum, Date retiredate, Date susStartdate,
			Date susEnddate, String otpQr, String otpCo, String dOffice, String dExam, String authority, int enabled,
			String smName, String otpCheck) {
		super();
		this.dId = dId;
		this.maNo = maNo;
		this.dName = dName;
		this.pwd = pwd;
		this.tel = tel;
		this.email = email;
		this.status = status;
		this.dPic = dPic;
		this.regdate = regdate;
		this.accountStatus = accountStatus;
		this.residentNum = residentNum;
		this.retiredate = retiredate;
		this.susStartdate = susStartdate;
		this.susEnddate = susEnddate;
		this.otpQr = otpQr;
		this.otpCo = otpCo;
		this.dOffice = dOffice;
		this.dExam = dExam;
		this.authority = authority;
		this.enabled = enabled;
		this.smName = smName;
		this.otpCheck = otpCheck;
	}

	public DoctorEntity() {

	}



}
