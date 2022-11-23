package kr.or.ddit.entity;

import java.sql.Date;
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
@Table(name = "CO_MED")
public class CoMedEntity {

	@Id
	@Column(name="")
  private String coNo;
	@Column(name="")
  private String pNo;
	@Column(name="")
  private String coName;
	@Column(name="")
  private String coDoc;
	@Column(name="")
  private String coDisease;
	@Column(name="")
  private String coOpinion;
	@Column(name="")
  private java.sql.Date coOpenDate;
	@Column(name="")
	private int coIngStatus;
	@Column(name="")
	private String coRelease;
	@Column(name="")
  private LocalDateTime coStartDate;
	@Column(name="")
  private int coImportance;
	@Column(name="")
  private String endReason;
	@Column(name="")
  private String endOpinion;
	@Column(name="")
  private LocalDateTime endDate;
	public CoMedEntity(String coNo, String pNo, String coName, String coDoc, String coDisease, String coOpinion,
			Date coOpenDate, int coIngStatus, String coRelease, LocalDateTime coStartDate, int coImportance,
			String endReason, String endOpinion, LocalDateTime endDate) {

		this.coNo = coNo;
		this.pNo = pNo;
		this.coName = coName;
		this.coDoc = coDoc;
		this.coDisease = coDisease;
		this.coOpinion = coOpinion;
		this.coOpenDate = coOpenDate;
		this.coIngStatus = coIngStatus;
		this.coRelease = coRelease;
		this.coStartDate = coStartDate;
		this.coImportance = coImportance;
		this.endReason = endReason;
		this.endOpinion = endOpinion;
		this.endDate = endDate;
	}
	public CoMedEntity() {

	}


}
