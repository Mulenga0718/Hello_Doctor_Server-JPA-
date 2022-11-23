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
@Table(name = "MEDI_RECO")
public class MediRecoEntity {

	@Id
	@Column(name = "M_NO")
	private String mNo;
	@Column(name = "D_ID")
	private String dId;
	@Column(name = "P_NO")
	private String pNo;
	@Column(name = "ISS_NO")
	private String issNo;
	@Column(name = "M_FILE_PATH")
	private String mFilePath;
	@Column(name = "SYMPTOM")
	private String symptom;
	@Column(name = "M_OPINION")
	private String mOpinion;
	@Column(name = "M_DATE")
	private LocalDateTime mDate;
	@Column(name = "M_NAME")
	private String mName;
	@Column(name = "D_NAME")
	private String dName;

	public MediRecoEntity(String mNo, String dId, String pNo, String issNo, String mFilePath, String symptom, String mOpinion,
			LocalDateTime mDate, String mName, String dName) {

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

	public MediRecoEntity() {

	}

}
