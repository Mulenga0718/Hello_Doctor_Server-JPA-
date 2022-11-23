package kr.or.ddit.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.or.ddit.dto.TypeaHeadVO;
import kr.or.ddit.repository.DiseaseRepository;
import kr.or.ddit.repository.LoginRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DiseaseService {

	private final DiseaseRepository diseaseDao;

	public List<TypeaHeadVO> searchdisease(String deKo) throws SQLException {
		List<TypeaHeadVO> list = diseaseDao.searchdisease(deKo);

		return list;
	}

	public List<TypeaHeadVO> searchmedicine(String deKo) throws SQLException {
		List<TypeaHeadVO> list = diseaseDao.searchmedicine(deKo);

		return list;

	}

}
