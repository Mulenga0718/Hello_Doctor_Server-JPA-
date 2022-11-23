package kr.or.ddit.entity;


public class ComComent {

  private String comCoNo;
  private String comNo;
  private String dId;
  private String coNo;
  private String comContent;
  private java.sql.Date comDate;
  private String delYn;


  public String getComCoNo() {
    return comCoNo;
  }

  public void setComCoNo(String comCoNo) {
    this.comCoNo = comCoNo;
  }


  public String getComNo() {
    return comNo;
  }

  public void setComNo(String comNo) {
    this.comNo = comNo;
  }


  public String getDId() {
    return dId;
  }

  public void setDId(String dId) {
    this.dId = dId;
  }


  public String getCoNo() {
    return coNo;
  }

  public void setCoNo(String coNo) {
    this.coNo = coNo;
  }


  public String getComContent() {
    return comContent;
  }

  public void setComContent(String comContent) {
    this.comContent = comContent;
  }


  public java.sql.Date getComDate() {
    return comDate;
  }

  public void setComDate(java.sql.Date comDate) {
    this.comDate = comDate;
  }


  public String getDelYn() {
    return delYn;
  }

  public void setDelYn(String delYn) {
    this.delYn = delYn;
  }

}
