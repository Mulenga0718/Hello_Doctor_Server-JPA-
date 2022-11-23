package kr.or.ddit.service;

import org.springframework.stereotype.Service;

import kr.or.ddit.dto.DoctorVO;
import kr.or.ddit.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class DoctorService {


	private final LoginRepository loginRepository;



	public DoctorVO selectDoctorVO(String dId) {

		return loginRepository.findBydId(dId);

	}


}
