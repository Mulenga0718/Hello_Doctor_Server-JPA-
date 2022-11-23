package kr.or.ddit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.ToString;

@Entity
@Getter
@ToString
@Table(name = "MEDI_FILE")
public class MediFileEntity {
	@Id
	@Column(name = "MF_NO")
	private String mfNo;
	@Column(name = "M_NO")
	private String mNo;
	@Column(name = "MF_FILENAME")
	private String mfFilename;
	@Column(name = "MF_FILEPATH")
	private String mfFilepath;
	@Column(name = "MF_FILETYPE")
	private String mfFiletype;

}
