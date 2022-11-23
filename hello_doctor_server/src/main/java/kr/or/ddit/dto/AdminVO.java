package kr.or.ddit.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminVO implements Serializable{

private String	adminId;
private String	pwd;

public String getAdminId() {
	return adminId;
}
public void setAdminId(String adminId) {
	this.adminId = adminId;
}
public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

}
