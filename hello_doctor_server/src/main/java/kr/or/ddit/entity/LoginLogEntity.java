package kr.or.ddit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@ToString
@Table(name="LOGIN_LOG")
public class LoginLogEntity {


	@EmbeddedId
	private LoginLogPk loginLogPk;

	@Column(name = "IPADDRESS")
	private String ipaddress ;
	@Column(name = "LOG_CLA")
	private int logCla    ;
	@Column(name = "D_NAME")
	private String dName     ;
	public LoginLogEntity(LoginLogPk loginLogPk, String ipaddress, int logCla, String dName) {

		this.loginLogPk = loginLogPk;
		this.ipaddress = ipaddress;
		this.logCla = logCla;
		this.dName = dName;
	}
	public LoginLogEntity() {

	}



}
