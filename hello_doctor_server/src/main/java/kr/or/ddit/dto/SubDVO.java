package kr.or.ddit.dto;

import kr.or.ddit.entity.SubDEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SubDVO {
	private String subDName ;
	private String mNo       ;
	public SubDVO(String subDName, String mNo) {
		super();
		this.subDName = subDName;
		this.mNo = mNo;
	}
	public SubDVO() {
		super();
	}
	public SubDVO(SubDEntity entity) {
		super();
		this.subDName = entity.getSubDPk().getSubDName();
		this.mNo = entity.getSubDPk().getMno();
	}





}
