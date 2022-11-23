package kr.or.ddit.entity;


public class ComReco {

  private String comNo;
  private String mNo;
  private String coNo;
  private java.sql.Date comDate;
  private String comStatus;
  private String taNo;


  public String getComNo() {
    return comNo;
  }

  public void setComNo(String comNo) {
    this.comNo = comNo;
  }


  public String getMNo() {
    return mNo;
  }

  public void setMNo(String mNo) {
    this.mNo = mNo;
  }


  public String getCoNo() {
    return coNo;
  }

  public void setCoNo(String coNo) {
    this.coNo = coNo;
  }


  public java.sql.Date getComDate() {
    return comDate;
  }

  public void setComDate(java.sql.Date comDate) {
    this.comDate = comDate;
  }


  public String getComStatus() {
    return comStatus;
  }

  public void setComStatus(String comStatus) {
    this.comStatus = comStatus;
  }


  public String getTaNo() {
    return taNo;
  }

  public void setTaNo(String taNo) {
    this.taNo = taNo;
  }

}
