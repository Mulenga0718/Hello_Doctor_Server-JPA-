package kr.or.ddit.entity;


public class Chat {

  private String carNo;
  private String dId;
  private java.sql.Timestamp ctDate;
  private String ctSrAt;
  private String ctContent;
  private String ctRead;
  private String closeYn;


  public String getCarNo() {
    return carNo;
  }

  public void setCarNo(String carNo) {
    this.carNo = carNo;
  }


  public String getDId() {
    return dId;
  }

  public void setDId(String dId) {
    this.dId = dId;
  }


  public java.sql.Timestamp getCtDate() {
    return ctDate;
  }

  public void setCtDate(java.sql.Timestamp ctDate) {
    this.ctDate = ctDate;
  }


  public String getCtSrAt() {
    return ctSrAt;
  }

  public void setCtSrAt(String ctSrAt) {
    this.ctSrAt = ctSrAt;
  }


  public String getCtContent() {
    return ctContent;
  }

  public void setCtContent(String ctContent) {
    this.ctContent = ctContent;
  }


  public String getCtRead() {
    return ctRead;
  }

  public void setCtRead(String ctRead) {
    this.ctRead = ctRead;
  }


  public String getCloseYn() {
    return closeYn;
  }

  public void setCloseYn(String closeYn) {
    this.closeYn = closeYn;
  }

}
