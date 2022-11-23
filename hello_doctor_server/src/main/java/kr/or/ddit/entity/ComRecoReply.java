package kr.or.ddit.entity;


public class ComRecoReply {

  private String coReply;
  private String comNo;
  private String dId;
  private String reContent;
  private java.sql.Date reDate;


  public String getCoReply() {
    return coReply;
  }

  public void setCoReply(String coReply) {
    this.coReply = coReply;
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


  public String getReContent() {
    return reContent;
  }

  public void setReContent(String reContent) {
    this.reContent = reContent;
  }


  public java.sql.Date getReDate() {
    return reDate;
  }

  public void setReDate(java.sql.Date reDate) {
    this.reDate = reDate;
  }

}
