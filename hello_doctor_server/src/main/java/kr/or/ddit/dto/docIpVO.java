package kr.or.ddit.dto;

import kr.or.ddit.entity.IpdocEntity;

@SuppressWarnings("serial")
public class docIpVO {

	private String dId;
	private String ipNo;

	public String getdId() {
		return dId;
	}
	public void setdId(String dId) {
		this.dId = dId;
	}
	public String getIpNo() {
		return ipNo;
	}
	public void setIpNo(String ipNo) {
		this.ipNo = ipNo;
	}
	public docIpVO(IpdocEntity entity) {

		this.dId = entity.getIpdocPk().getDId();
		this.ipNo = entity.getIpdocPk().getIpNo();
	}




}
