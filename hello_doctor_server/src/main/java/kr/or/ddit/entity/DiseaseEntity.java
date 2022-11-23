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
@Table(name = "DISEASE")
public class DiseaseEntity {
	@Id
	@Column(name = "DE_KO")
	private String deKo;

	@Column(name = "DE_SIGN")
	private String deSign;
	@Column(name = "DE_EN")
	private String deEn;
	@Column(name = "DE_CODE")
	private String deCode;
	@Column(name = "DE_GROUP")
	private String deGroup;
	@Column(name = "DE_ROW")
	private String deRow;
	@Column(name = "DE_SEX")
	private String deSex;
	@Column(name = "DE_UAGE")
	private String deUage;
	@Column(name = "DE_LAGE")
	private String deLage;
	@Column(name = "DE_INTE")
	private String deInte;
	@Column(name = "DE_ERROR")
	private String deError;
	public DiseaseEntity(String deKo, String deSign, String deEn, String deCode, String deGroup, String deRow, String deSex,
			String deUage, String deLage, String deInte, String deError) {
		super();
		this.deKo = deKo;
		this.deSign = deSign;
		this.deEn = deEn;
		this.deCode = deCode;
		this.deGroup = deGroup;
		this.deRow = deRow;
		this.deSex = deSex;
		this.deUage = deUage;
		this.deLage = deLage;
		this.deInte = deInte;
		this.deError = deError;
	}
	public DiseaseEntity() {
		super();
	}

	public DiseaseEntity(String deKo) {
		super();
		this.deKo = deKo;
	}
}
