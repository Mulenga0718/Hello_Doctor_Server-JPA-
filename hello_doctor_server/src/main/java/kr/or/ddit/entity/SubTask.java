package kr.or.ddit.entity;


public class SubTask {

  private String subNo;
  private String taNo;
  private String subName;
  private java.sql.Date subDate;
  private String lFile;
  private String lPath;
  private String lType;
  private java.sql.Date endDay;
  private java.sql.Date startDay;
  private String color;
  private String completeYn;


  public String getSubNo() {
    return subNo;
  }

  public void setSubNo(String subNo) {
    this.subNo = subNo;
  }


  public String getTaNo() {
    return taNo;
  }

  public void setTaNo(String taNo) {
    this.taNo = taNo;
  }


  public String getSubName() {
    return subName;
  }

  public void setSubName(String subName) {
    this.subName = subName;
  }


  public java.sql.Date getSubDate() {
    return subDate;
  }

  public void setSubDate(java.sql.Date subDate) {
    this.subDate = subDate;
  }


  public String getLFile() {
    return lFile;
  }

  public void setLFile(String lFile) {
    this.lFile = lFile;
  }


  public String getLPath() {
    return lPath;
  }

  public void setLPath(String lPath) {
    this.lPath = lPath;
  }


  public String getLType() {
    return lType;
  }

  public void setLType(String lType) {
    this.lType = lType;
  }


  public java.sql.Date getEndDay() {
    return endDay;
  }

  public void setEndDay(java.sql.Date endDay) {
    this.endDay = endDay;
  }


  public java.sql.Date getStartDay() {
    return startDay;
  }

  public void setStartDay(java.sql.Date startDay) {
    this.startDay = startDay;
  }


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public String getCompleteYn() {
    return completeYn;
  }

  public void setCompleteYn(String completeYn) {
    this.completeYn = completeYn;
  }

}
