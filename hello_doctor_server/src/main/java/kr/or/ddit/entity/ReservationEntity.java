package kr.or.ddit.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "RESERVATION")
public class ReservationEntity {

  @Id
  @Column(name = "RSV_NO")
  private String rsvNo;
  @Column(name = "RSV_DAY")
  private LocalDateTime rsvDay;
  @Column(name = "D_ID")
  private String dId;
  @Column(name = "P_NO")
  private String pNo;
  @Column(name = "RSV_NAME")
  private String rsvName;
  @Column(name = "RSV_STATUS")
  private String rsvStatus;



}