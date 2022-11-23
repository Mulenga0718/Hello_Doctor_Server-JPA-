package kr.or.ddit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class LoginLogPk implements Serializable {


	@Column(name = "D_ID")
	private String dId       ;
	@Column(name = "INDATE")
	private Date indate    ;


}
