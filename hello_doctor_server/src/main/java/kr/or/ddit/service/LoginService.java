package kr.or.ddit.service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.dto.DoctorVO;
import kr.or.ddit.dto.LogVO;
import kr.or.ddit.dto.LoginLogVO;
import kr.or.ddit.entity.DoctorEntity;
import kr.or.ddit.entity.LoginLogEntity;
import kr.or.ddit.exception.InvalidPasswordException;
import kr.or.ddit.exception.NotFoundIdException;
import kr.or.ddit.repository.LoginAction;
import kr.or.ddit.repository.LoginLogRepository;
import kr.or.ddit.repository.LoginRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginService {

	private final LoginRepository loginRepository;

	private final LoginLogRepository loginLogRepositroy;

	private final LoginAction loginAction;



	public DoctorVO findbyDIdAndPwd(DoctorVO vo) throws NotFoundIdException, InvalidPasswordException {


		DoctorVO result = loginRepository.findBydIdAndPwd(vo.getdId(), vo.getPwd());


		if(result == null) {
			//id틀림;
			throw new NotFoundIdException();
		}else if(!result.getPwd().equals(vo.getPwd())) {
			//pwd 틀림;
			throw new InvalidPasswordException();
		}
		return result;

	};

	public void doctorStatusStart(String dId) {
		loginAction.doctorStatusStart(dId);


	}

	public String docIp(String dId) throws UnknownHostException {
		String result = "";

		InetAddress ip = InetAddress.getLocalHost();

		List<String> docip = loginAction.docIp(dId);
		String mycomip=ip.getHostAddress();

		for(String myip: docip) {

			if (mycomip.equals(myip)) {
				result = "ipsuccess";
				return result;
			} else {
				result = "ipfail";
			}
		}
		return result;
	}

	@Transactional
	public void insertLoginUserLog(LoginLogEntity loginLogVO) {
		
		loginLogRepositroy.save(loginLogVO);

	}
}
