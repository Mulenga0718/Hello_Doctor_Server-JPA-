package kr.or.ddit.dto;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientVO {

	private String pNo          ;
	private String pName        ;
	private String pSex         ;
	private String pRnum        ;
	private String pTel         ;
	private String pAddress     ;
	private String pInsurance   ;
	private String coNo;
	private String rsvNo;

	public PatientVO(String pNo, String pName, String pSex, String pRnum, String pTel, String pAddress,
			String pInsurance) {
		super();
		this.pNo = pNo;
		this.pName = pName;
		this.pSex = pSex;
		this.pRnum = pRnum;
		this.pTel = pTel;
		this.pAddress = pAddress;
		this.pInsurance = pInsurance;
	}




}
