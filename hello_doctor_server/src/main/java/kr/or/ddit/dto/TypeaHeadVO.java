package kr.or.ddit.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeaHeadVO {

	private String deKo;
	private String meName;
	private String text;

	public TypeaHeadVO(String deKo, String meName, String text) {
		super();
		this.deKo = deKo;
		this.meName = meName;
		this.text = text;
	}

	public TypeaHeadVO(String deKo) {
		super();
		this.deKo = deKo ;
	}


	public TypeaHeadVO() {
		super();
	}

}
