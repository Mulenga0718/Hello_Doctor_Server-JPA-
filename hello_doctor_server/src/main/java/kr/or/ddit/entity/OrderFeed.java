package kr.or.ddit.entity;


public class OrderFeed {

  private String fbNo;
  private String oNo;
  private String docId;
  private String fbResult;
  private java.sql.Date fbRegdate;


  public String getFbNo() {
    return fbNo;
  }

  public void setFbNo(String fbNo) {
    this.fbNo = fbNo;
  }


  public String getONo() {
    return oNo;
  }

  public void setONo(String oNo) {
    this.oNo = oNo;
  }


  public String getDocId() {
    return docId;
  }

  public void setDocId(String docId) {
    this.docId = docId;
  }


  public String getFbResult() {
    return fbResult;
  }

  public void setFbResult(String fbResult) {
    this.fbResult = fbResult;
  }


  public java.sql.Date getFbRegdate() {
    return fbRegdate;
  }

  public void setFbRegdate(java.sql.Date fbRegdate) {
    this.fbRegdate = fbRegdate;
  }

}
