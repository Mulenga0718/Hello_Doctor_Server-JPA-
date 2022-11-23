package kr.or.ddit.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.ddit.dto.DoctorVO;
import kr.or.ddit.service.DoctorService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("doctor")
@RequiredArgsConstructor
public class DoctorController {

	private final DoctorService doctorService;

	@Value("${doctor.doctorFilePath}")
	private String doctorFilePath;

	@RequestMapping("getPic")
	public ResponseEntity<byte[]> getPic(String dId)throws Exception{
		ResponseEntity<byte[]> entity = null;
		InputStream in = null;
		try {
			DoctorVO vo =doctorService.selectDoctorVO(dId);
			in = new FileInputStream(new File(doctorFilePath, vo.getdPic()));
			entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), HttpStatus.CREATED);
		}catch(Exception e) {
			e.printStackTrace();
		} finally {

			in.close();
		}
		return entity;
	}

}
