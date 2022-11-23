package kr.or.ddit.repository;

import java.util.List;

import kr.or.ddit.dto.ChartFormVO;

public interface DoctorAction {

	List<ChartFormVO> selectAllReco(String dId);
	List<ChartFormVO> selectAllReco2(String dId);
}
