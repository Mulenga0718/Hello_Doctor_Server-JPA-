package kr.or.ddit.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogVO {

	private String dId;
	private String ipaddress;
	private Date indate;
	private int logCla;
	private String dName;



}
