package kr.or.ddit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
public class SubDPk implements Serializable {

	@Column(name = "SUB_D_NAME")
	  private String subDName;
	@Column(name = "M_NO")
	  private String mno;

	public SubDPk(String subDName, String mNo) {
		this.subDName = subDName;
		this.mno = mNo;
	}
	public SubDPk() {
		super();
	}


}
