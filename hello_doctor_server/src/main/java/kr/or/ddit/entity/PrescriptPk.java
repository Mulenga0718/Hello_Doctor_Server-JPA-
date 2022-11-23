package kr.or.ddit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@Embeddable
public class PrescriptPk implements Serializable {

	@Column(name = "M_NO")
	private String mno;

	@Column(name = "PRE_NO")
	private String preNo;

	public PrescriptPk(String mno, String preNo) {
		super();
		this.mno = mno;
		this.preNo = preNo;
	}

	public PrescriptPk() {
		super();
	}




}
