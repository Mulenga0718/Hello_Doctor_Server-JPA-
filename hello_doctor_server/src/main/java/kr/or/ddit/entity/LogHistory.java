package kr.or.ddit.entity;


public class LogHistory {

  private String hiNo;
  private String coNo;
  private String hiContent;
  private String hiCla;
  private java.sql.Date hiDate;
  private String hiReference;
  private String dName;


  public String getHiNo() {
    return hiNo;
  }

  public void setHiNo(String hiNo) {
    this.hiNo = hiNo;
  }


  public String getCoNo() {
    return coNo;
  }

  public void setCoNo(String coNo) {
    this.coNo = coNo;
  }


  public String getHiContent() {
    return hiContent;
  }

  public void setHiContent(String hiContent) {
    this.hiContent = hiContent;
  }


  public String getHiCla() {
    return hiCla;
  }

  public void setHiCla(String hiCla) {
    this.hiCla = hiCla;
  }


  public java.sql.Date getHiDate() {
    return hiDate;
  }

  public void setHiDate(java.sql.Date hiDate) {
    this.hiDate = hiDate;
  }


  public String getHiReference() {
    return hiReference;
  }

  public void setHiReference(String hiReference) {
    this.hiReference = hiReference;
  }


  public String getDName() {
    return dName;
  }

  public void setDName(String dName) {
    this.dName = dName;
  }

}
