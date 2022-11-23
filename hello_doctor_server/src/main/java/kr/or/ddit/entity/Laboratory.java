package kr.or.ddit.entity;


public class Laboratory {

  private String lNo;
  private String pNo;
  private String lName;
  private java.sql.Date lDate;
  private String lResult;
  private String lFile;


  public String getLNo() {
    return lNo;
  }

  public void setLNo(String lNo) {
    this.lNo = lNo;
  }


  public String getPNo() {
    return pNo;
  }

  public void setPNo(String pNo) {
    this.pNo = pNo;
  }


  public String getLName() {
    return lName;
  }

  public void setLName(String lName) {
    this.lName = lName;
  }


  public java.sql.Date getLDate() {
    return lDate;
  }

  public void setLDate(java.sql.Date lDate) {
    this.lDate = lDate;
  }


  public String getLResult() {
    return lResult;
  }

  public void setLResult(String lResult) {
    this.lResult = lResult;
  }


  public String getLFile() {
    return lFile;
  }

  public void setLFile(String lFile) {
    this.lFile = lFile;
  }

}
