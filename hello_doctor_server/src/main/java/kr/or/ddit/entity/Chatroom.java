package kr.or.ddit.entity;


public class Chatroom {

  private String carNo;
  private String carName;
  private String useYn;
  private java.sql.Date carDate;
  private java.sql.Date closeDate;
  private String carNop;


  public String getCarNo() {
    return carNo;
  }

  public void setCarNo(String carNo) {
    this.carNo = carNo;
  }


  public String getCarName() {
    return carName;
  }

  public void setCarName(String carName) {
    this.carName = carName;
  }


  public String getUseYn() {
    return useYn;
  }

  public void setUseYn(String useYn) {
    this.useYn = useYn;
  }


  public java.sql.Date getCarDate() {
    return carDate;
  }

  public void setCarDate(java.sql.Date carDate) {
    this.carDate = carDate;
  }


  public java.sql.Date getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(java.sql.Date closeDate) {
    this.closeDate = closeDate;
  }


  public String getCarNop() {
    return carNop;
  }

  public void setCarNop(String carNop) {
    this.carNop = carNop;
  }

}
