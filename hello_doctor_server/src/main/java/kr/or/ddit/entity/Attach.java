package kr.or.ddit.entity;


public class Attach {

  private String aNo;
  private String comNo;
  private String aFilename;
  private String aFiletype;
  private String aFilepath;
  private java.sql.Date aRegdate;
  private String aCla;


  public String getANo() {
    return aNo;
  }

  public void setANo(String aNo) {
    this.aNo = aNo;
  }


  public String getComNo() {
    return comNo;
  }

  public void setComNo(String comNo) {
    this.comNo = comNo;
  }


  public String getAFilename() {
    return aFilename;
  }

  public void setAFilename(String aFilename) {
    this.aFilename = aFilename;
  }


  public String getAFiletype() {
    return aFiletype;
  }

  public void setAFiletype(String aFiletype) {
    this.aFiletype = aFiletype;
  }


  public String getAFilepath() {
    return aFilepath;
  }

  public void setAFilepath(String aFilepath) {
    this.aFilepath = aFilepath;
  }


  public java.sql.Date getARegdate() {
    return aRegdate;
  }

  public void setARegdate(java.sql.Date aRegdate) {
    this.aRegdate = aRegdate;
  }


  public String getACla() {
    return aCla;
  }

  public void setACla(String aCla) {
    this.aCla = aCla;
  }

}
