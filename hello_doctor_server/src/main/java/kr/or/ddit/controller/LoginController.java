package kr.or.ddit.controller;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.or.ddit.dto.AdminVO;
import kr.or.ddit.dto.DoctorVO;
import kr.or.ddit.dto.HospitalIpVO;
import kr.or.ddit.dto.LogVO;
import kr.or.ddit.dto.LoginLogVO;
import kr.or.ddit.entity.DoctorEntity;
import kr.or.ddit.entity.LoginLogEntity;
import kr.or.ddit.entity.LoginLogPk;
import kr.or.ddit.exception.InvalidPasswordException;
import kr.or.ddit.exception.NotFoundIdException;

import kr.or.ddit.service.LoginService;

@Controller
@RequestMapping("login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	// login check filter
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm(@RequestParam(defaultValue = "") String error, HttpServletResponse response)
			throws SQLException, UnknownHostException {
		String url = "login/loginForm";
		if (error.equals("-1")) {
			response.setStatus(302);
		}

		return url;
	}

	@ResponseBody
	@RequestMapping("/login")
	public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> map, HttpSession session)
			throws Exception {

		ResponseEntity<Map<String, String>> entity = null;
		Map<String, String> dataMap = new HashMap<String, String>();
		DoctorVO vo = new DoctorVO();

		vo.setdId(map.get("dId"));
		vo.setPwd(map.get("pwd"));
		// 로그인

		DoctorVO doctorLogin = loginService.findbyDIdAndPwd(vo);
		loginService.doctorStatusStart(map.get("dId"));

		doctorLogin.setStatus(1);
		doctorLogin.setSmName(doctorLogin.getSmName());
		session.setAttribute("doctorLogin", doctorLogin);
		// doc IP 체크
		String docipresult = loginService.docIp(doctorLogin.getdId());

		// ip 출력
		// 내 컴퓨터 IP 출력

		String getuserIp = getUserIp();

		LoginLogPk logpk = new LoginLogPk(doctorLogin.getdId(), new Date());
		LoginLogEntity logVO = new LoginLogEntity(logpk, getuserIp, 1, doctorLogin.getdName());


		loginService.insertLoginUserLog(logVO);
		dataMap.put("dId", doctorLogin.getdId());
		dataMap.put("pwd", doctorLogin.getPwd());
		dataMap.put("loginchoice", doctorLogin.getOtpCheck());

		// doc IP 체크 dataMap.put("docipresult", docipresult);

		if (doctorLogin.getAuthority().equals("9")) {
			// pwd 틀림
			dataMap.put("admin", vo.getdId());
		}
		entity = new ResponseEntity<Map<String, String>>(dataMap, HttpStatus.OK);

		return entity;

	}

	@RequestMapping(value = "/loginForm2")
	public String loginForm2() {
		String url = "login/loginForm2";
		return url;

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session, HttpServletRequest request) throws Exception {
		String url = "redirect:/login/loginForm";
		LoginLogVO logVO = new LoginLogVO();
		session = request.getSession();
		DoctorVO doctorvo = (DoctorVO) session.getAttribute("doctorLogin");
		System.out.println("vogetID!!@~@~" + doctorvo.getdId());
		// doctorService.doctorStatusReset(doctorvo.getdId());
		// 서버 ip 출력
		InetAddress ip = InetAddress.getLocalHost();
		// 서버 컴퓨터 IP 출력
		String ipcheck = ip.getHostAddress();

		//

		logVO.setdName(doctorvo.getdName());
		logVO.setdId(doctorvo.getdId());
		logVO.setIpaddress(ipcheck);
		logVO.setLogCla(2);
		// loginSearchDoctorService.insertLoginUserLog(logVO);
		session.invalidate();
		return url;

	}

	public String getUserIp() throws Exception {

		String ip = null;
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
				.getRequest();

		ip = request.getHeader("X-Forwarded-For");

		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("X-Real-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("X-RealIP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("REMOTE_ADDR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}

		return ip;
	}

}
