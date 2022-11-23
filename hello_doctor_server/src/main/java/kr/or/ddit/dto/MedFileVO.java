package kr.or.ddit.dto;

import kr.or.ddit.entity.MediFileEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MedFileVO {
	private String mfNo         ;
	private String mNo          ;
	private String mfFilename   ;
	private String mfFilepath   ;
	private String mfFiletype   ;
	private String mDate;
	private String dId;
	public MedFileVO(String mfNo, String mNo, String mfFilename, String mfFilepath, String mfFiletype, String mDate,
			String dId) {
		super();
		this.mfNo = mfNo;
		this.mNo = mNo;
		this.mfFilename = mfFilename;
		this.mfFilepath = mfFilepath;
		this.mfFiletype = mfFiletype;
		this.mDate = mDate;
		this.dId = dId;
	}
	public MedFileVO() {
		super();
	}
	public MedFileVO(MediFileEntity entity) {
		super();
		this.mfNo = entity.getMfNo();
		this.mNo = entity.getMNo();
		this.mfFilename = entity.getMfFilename();
		this.mfFilepath = entity.getMfFilepath();
		this.mfFiletype = entity.getMfFiletype();
	}


}
