package kr.or.ddit.entity;


public class GroupChat {

  private String carNo;
  private String dId;
  private java.sql.Date ctDate;
  private String coNo;
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


  public java.sql.Date getCtDate() {
    return ctDate;
  }

  public void setCtDate(java.sql.Date ctDate) {
    this.ctDate = ctDate;
  }


  public String getCoNo() {
    return coNo;
  }

  public void setCoNo(String coNo) {
    this.coNo = coNo;
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
