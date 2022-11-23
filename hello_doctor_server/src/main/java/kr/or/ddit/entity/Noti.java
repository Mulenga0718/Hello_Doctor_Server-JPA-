package kr.or.ddit.entity;


public class Noti {

  private String notiNo;
  private String reqdId;
  private String resdId;
  private String coNo;
  private String taNo;
  private String claNo;
  private String response;
  private String read;
  private String reasonRef;
  private java.sql.Date notiDate;


  public String getNotiNo() {
    return notiNo;
  }

  public void setNotiNo(String notiNo) {
    this.notiNo = notiNo;
  }


  public String getReqdId() {
    return reqdId;
  }

  public void setReqdId(String reqdId) {
    this.reqdId = reqdId;
  }


  public String getResdId() {
    return resdId;
  }

  public void setResdId(String resdId) {
    this.resdId = resdId;
  }


  public String getCoNo() {
    return coNo;
  }

  public void setCoNo(String coNo) {
    this.coNo = coNo;
  }


  public String getTaNo() {
    return taNo;
  }

  public void setTaNo(String taNo) {
    this.taNo = taNo;
  }


  public String getClaNo() {
    return claNo;
  }

  public void setClaNo(String claNo) {
    this.claNo = claNo;
  }


  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }


  public String getRead() {
    return read;
  }

  public void setRead(String read) {
    this.read = read;
  }


  public String getReasonRef() {
    return reasonRef;
  }

  public void setReasonRef(String reasonRef) {
    this.reasonRef = reasonRef;
  }


  public java.sql.Date getNotiDate() {
    return notiDate;
  }

  public void setNotiDate(java.sql.Date notiDate) {
    this.notiDate = notiDate;
  }

}
