package kr.or.ddit.entity;


public class Mylike {

  private String disNo;
  private String disReplyNo;
  private String mlNo;
  private String oNo;
  private String dId;
  private java.sql.Date likeDate;


  public String getDisNo() {
    return disNo;
  }

  public void setDisNo(String disNo) {
    this.disNo = disNo;
  }


  public String getDisReplyNo() {
    return disReplyNo;
  }

  public void setDisReplyNo(String disReplyNo) {
    this.disReplyNo = disReplyNo;
  }


  public String getMlNo() {
    return mlNo;
  }

  public void setMlNo(String mlNo) {
    this.mlNo = mlNo;
  }


  public String getONo() {
    return oNo;
  }

  public void setONo(String oNo) {
    this.oNo = oNo;
  }


  public String getDId() {
    return dId;
  }

  public void setDId(String dId) {
    this.dId = dId;
  }


  public java.sql.Date getLikeDate() {
    return likeDate;
  }

  public void setLikeDate(java.sql.Date likeDate) {
    this.likeDate = likeDate;
  }

}
