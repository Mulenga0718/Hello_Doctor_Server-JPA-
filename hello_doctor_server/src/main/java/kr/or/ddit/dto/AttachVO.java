package kr.or.ddit.dto;

import java.util.Date;



public class AttachVO {

	private String aNo           ;
	private String comNo         ;
	private String aFilename     ;
	private String aFiletype     ;
	private String aFilepath     ;
	private String aRegdate      ;
	private Date aCla          ;
	public String getaNo() {
		return aNo;
	}
	public void setaNo(String aNo) {
		this.aNo = aNo;
	}
	public String getComNo() {
		return comNo;
	}
	public void setComNo(String comNo) {
		this.comNo = comNo;
	}
	public String getaFilename() {
		return aFilename;
	}
	public void setaFilename(String aFilename) {
		this.aFilename = aFilename;
	}
	public String getaFiletype() {
		return aFiletype;
	}
	public void setaFiletype(String aFiletype) {
		this.aFiletype = aFiletype;
	}
	public String getaFilepath() {
		return aFilepath;
	}
	public void setaFilepath(String aFilepath) {
		this.aFilepath = aFilepath;
	}
	public String getaRegdate() {
		return aRegdate;
	}
	public void setaRegdate(String aRegdate) {
		this.aRegdate = aRegdate;
	}
	public Date getaCla() {
		return aCla;
	}
	public void setaCla(Date aCla) {
		this.aCla = aCla;
	}




}
