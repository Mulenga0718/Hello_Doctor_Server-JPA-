package kr.or.ddit.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.ddit.dto.DoctorVO;
import kr.or.ddit.dto.MedPicVO;
import kr.or.ddit.dto.MediRecoVO;
import kr.or.ddit.dto.MyOrderListVO;
import kr.or.ddit.dto.OrdersetVO;
import kr.or.ddit.dto.TypeaHeadVO;
import kr.or.ddit.service.DiseaseService;
import kr.or.ddit.service.MediRecoService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("medi")
@RequiredArgsConstructor
public class MediController {

	private final MediRecoService mediRecoservice;
	private final DiseaseService diseaseservice;
	@Value("${medi.recoFilePath}")
	private String mediFilePath;

	@RequestMapping("chart")
	public ResponseEntity<Map<String, Object>> chart(HttpSession session) throws Exception {
		ResponseEntity<Map<String, Object>> responseEntity = null;

		DoctorVO doctor = (DoctorVO) session.getAttribute("doctorLogin");
		String dId = doctor.getdId();
		Map<String, Object> map = mediRecoservice.selectOneReco(dId);

		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	@RequestMapping("pastreco")
	public ResponseEntity<Map<String, Object>> pastreco(MediRecoVO vo) throws Exception {

		ResponseEntity<Map<String, Object>> entity = null;
		String mNo = vo.getMNo();
		System.out.println(mNo);
		Map<String, Object> map = mediRecoservice.pastreco(mNo);

		entity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

		return entity;

	}

	@RequestMapping("getPic")
	public ResponseEntity<byte[]> getPic(String mpNo) throws Exception {
		ResponseEntity<byte[]> entity = null;
		InputStream in = null;
		try {
			MedPicVO vo = mediRecoservice.getPic(mpNo);
			in = new FileInputStream(new File(mediFilePath, vo.getMpName()));
			entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			in.close();

		}
		return entity;
	}

	@RequestMapping("orderlist")
	public ResponseEntity<List<OrdersetVO>> orderlist(MyOrderListVO vo) throws Exception {
		ResponseEntity<List<OrdersetVO>> entity = null;
		String moNo = vo.getMoNo();
		List<OrdersetVO> list = mediRecoservice.orderdruglist(moNo);

		entity = new ResponseEntity<List<OrdersetVO>>(list, HttpStatus.OK);

		return entity;
	}

	@RequestMapping("searchdisease")
	public ResponseEntity<List<TypeaHeadVO>> searchdisease(@RequestBody TypeaHeadVO vo) throws Exception {
		ResponseEntity<List<TypeaHeadVO>> entity = null;
		String deKo = vo.getDeKo();
		List<TypeaHeadVO> list = null;

		try {
			list = diseaseservice.searchdisease(deKo);
		} catch (Exception e) {
			// TODO: handle exception
		}

		entity = new ResponseEntity<List<TypeaHeadVO>>(list, HttpStatus.OK);
		return entity;
	}

	@RequestMapping("searchmedicine")
	public ResponseEntity<List<TypeaHeadVO>> searchmedicine(@RequestBody TypeaHeadVO vo) throws Exception {
		ResponseEntity<List<TypeaHeadVO>> entity = null;
		String meName = vo.getMeName();
		List<TypeaHeadVO> list = null;

		try {
			list = diseaseservice.searchmedicine(meName);

		} catch (Exception e) {
			// TODO: handle exception
		}
		entity = new ResponseEntity<List<TypeaHeadVO>>(list, HttpStatus.OK);
		return entity;
	}
}
