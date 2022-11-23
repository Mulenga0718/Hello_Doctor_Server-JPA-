package kr.or.ddit.entity;

import java.time.LocalDateTime;
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
@Table(name = "CO_TASK")
public class CoTaskEntity {
	@Id
	@Column(name = "TA_NO")
	private String taNo;
	@Column(name = "CO_NO")
	private String coNo;
	@Column(name = "D_ID")
	private String dId;
	@Column(name = "TA_NAME")
	private String taName;
	@Column(name="TA_CONTENT")
	private String taContent;
	@Column(name="TA_DATE")
	private LocalDateTime taDate;
	@Column(name="TA_STATUS")
	private int taStatus;
	@Column(name="RESERV_YN")
	private String reservYn;
	@Column(name="COLOR")
	private String color;
	@Column(name="TA_REFERENCE")
	private String taReference;
	public CoTaskEntity(String taNo, String coNo, String dId, String taName, String taContent, LocalDateTime taDate,
			int taStatus, String reservYn, String color, String taReference) {

		this.taNo = taNo;
		this.coNo = coNo;
		this.dId = dId;
		this.taName = taName;
		this.taContent = taContent;
		this.taDate = taDate;
		this.taStatus = taStatus;
		this.reservYn = reservYn;
		this.color = color;
		this.taReference = taReference;
	}
	public CoTaskEntity() {

	}


}
