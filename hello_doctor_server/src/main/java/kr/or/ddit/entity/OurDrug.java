package kr.or.ddit.entity;


public class OurDrug {

  private String odNo;
  private String odName;
  private String payYn;
  private java.sql.Date odRegdate;
  private String existYn;
  private String meLimit;


  public String getOdNo() {
    return odNo;
  }

  public void setOdNo(String odNo) {
    this.odNo = odNo;
  }


  public String getOdName() {
    return odName;
  }

  public void setOdName(String odName) {
    this.odName = odName;
  }


  public String getPayYn() {
    return payYn;
  }

  public void setPayYn(String payYn) {
    this.payYn = payYn;
  }


  public java.sql.Date getOdRegdate() {
    return odRegdate;
  }

  public void setOdRegdate(java.sql.Date odRegdate) {
    this.odRegdate = odRegdate;
  }


  public String getExistYn() {
    return existYn;
  }

  public void setExistYn(String existYn) {
    this.existYn = existYn;
  }


  public String getMeLimit() {
    return meLimit;
  }

  public void setMeLimit(String meLimit) {
    this.meLimit = meLimit;
  }

}
