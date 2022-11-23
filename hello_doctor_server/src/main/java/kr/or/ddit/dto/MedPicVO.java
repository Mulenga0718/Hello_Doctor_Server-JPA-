package kr.or.ddit.dto;

import kr.or.ddit.entity.MedPicEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Data
public class MedPicVO {
	private String mpNo    ;
	private String mNo     ;
	private String mpPic   ;
	private String mpName  ;
	public MedPicVO(String mpNo, String mNo, String mpPic, String mpName) {
		super();
		this.mpNo = mpNo;
		this.mNo = mNo;
		this.mpPic = mpPic;
		this.mpName = mpName;
	}
	public MedPicVO() {
		super();
	}
	public MedPicVO(MedPicEntity entity) {
		super();
		this.mpNo = entity.getMpNo();
		this.mNo = entity.getMNo();
		this.mpPic = entity.getMpPic();
		this.mpName = entity.getMpName();
	}


}
