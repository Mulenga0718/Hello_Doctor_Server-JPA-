package kr.or.ddit.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MediRecoVO {
	private String mNo         ;
	private String dId         ;
	private String pNo         ;
	private String issNo       ;
	private String mFilePath  ;
	private String symptom      ;
	private String mOpinion    ;
	private LocalDateTime mDate       ;
	private String mName       ;
	private String dName       ;
	public MediRecoVO(String mNo, String dId, String pNo, String issNo, String mFilePath, String symptom,
			String mOpinion, LocalDateTime mDate, String mName, String dName) {
		super();
		this.mNo = mNo;
		this.dId = dId;
		this.pNo = pNo;
		this.issNo = issNo;
		this.mFilePath = mFilePath;
		this.symptom = symptom;
		this.mOpinion = mOpinion;
		this.mDate = mDate;
		this.mName = mName;
		this.dName = dName;
	}




}
