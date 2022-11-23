package kr.or.ddit.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.ToString;

@Entity
@Getter
@ToString
@Table(name = "MED_PIC")
public class MedPicEntity {
   @Id
   @Column(name ="MP_NO")
  private String mpNo;
   @Column(name ="M_NO")
  private String mNo;
   @Column(name ="MP_PIC")
   private String mpPic;
   @Column(name ="MP_NAME")
  private String mpName;

}
