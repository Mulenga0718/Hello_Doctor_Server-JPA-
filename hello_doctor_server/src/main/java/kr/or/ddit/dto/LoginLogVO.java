package kr.or.ddit.dto;

import java.util.Date;


public class LoginLogVO {
	private String dId          ;
	private String ipaddress   ;
	private Date indate      ;
	private int logCla     ;
	private String dName;
	public String getdId() {
		return dId;
	}
	public void setdId(String dId) {
		this.dId = dId;
	}
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	public Date getIndate() {
		return indate;
	}
	public void setIndate(Date indate) {
		this.indate = indate;
	}
	public int getLogCla() {
		return logCla;
	}
	public void setLogCla(int logCla) {
		this.logCla = logCla;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}



}
