package kr.or.ddit.repository;

import java.util.List;

import kr.or.ddit.dto.TypeaHeadVO;

public interface DiseaseAction {


	public List<TypeaHeadVO> searchdisease(String deKo);
	public List<TypeaHeadVO> searchmedicine(String deKo);
}
