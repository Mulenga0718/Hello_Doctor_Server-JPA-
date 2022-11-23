package kr.or.ddit.entity;


public class Notice {

  private String nNo;
  private String adminId;
  private String nTitle;
  private String nContent;
  private java.sql.Date nDate;
  private String delYn;
  private String pickYn;
  private String popYn;
  private java.sql.Date popPeriodStart;
  private java.sql.Date popPeriodEnd;


  public String getNNo() {
    return nNo;
  }

  public void setNNo(String nNo) {
    this.nNo = nNo;
  }


  public String getAdminId() {
    return adminId;
  }

  public void setAdminId(String adminId) {
    this.adminId = adminId;
  }


  public String getNTitle() {
    return nTitle;
  }

  public void setNTitle(String nTitle) {
    this.nTitle = nTitle;
  }


  public String getNContent() {
    return nContent;
  }

  public void setNContent(String nContent) {
    this.nContent = nContent;
  }


  public java.sql.Date getNDate() {
    return nDate;
  }

  public void setNDate(java.sql.Date nDate) {
    this.nDate = nDate;
  }


  public String getDelYn() {
    return delYn;
  }

  public void setDelYn(String delYn) {
    this.delYn = delYn;
  }


  public String getPickYn() {
    return pickYn;
  }

  public void setPickYn(String pickYn) {
    this.pickYn = pickYn;
  }


  public String getPopYn() {
    return popYn;
  }

  public void setPopYn(String popYn) {
    this.popYn = popYn;
  }


  public java.sql.Date getPopPeriodStart() {
    return popPeriodStart;
  }

  public void setPopPeriodStart(java.sql.Date popPeriodStart) {
    this.popPeriodStart = popPeriodStart;
  }


  public java.sql.Date getPopPeriodEnd() {
    return popPeriodEnd;
  }

  public void setPopPeriodEnd(java.sql.Date popPeriodEnd) {
    this.popPeriodEnd = popPeriodEnd;
  }

}
