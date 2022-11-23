package kr.or.ddit.service;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Service;

import kr.or.ddit.dto.ChartFormVO;
import kr.or.ddit.dto.MedFileVO;
import kr.or.ddit.dto.MedPicVO;
import kr.or.ddit.dto.MediRecoVO;
import kr.or.ddit.dto.MyOrderListVO;
import kr.or.ddit.dto.OrdersetVO;
import kr.or.ddit.dto.PatientVO;
import kr.or.ddit.dto.PrescriptVO;
import kr.or.ddit.dto.SubDVO;
import kr.or.ddit.repository.DoctorRepository;
import kr.or.ddit.repository.LoginAction;
import kr.or.ddit.repository.LoginLogRepository;
import kr.or.ddit.repository.LoginRepository;
import kr.or.ddit.repository.MedPicRepository;
import kr.or.ddit.repository.MediFileRepository;
import kr.or.ddit.repository.MediRecoRepository;
import kr.or.ddit.repository.MyDrugRepository;
import kr.or.ddit.repository.MyOrderRepository;
import kr.or.ddit.repository.PatientRepository;
import kr.or.ddit.repository.PrescriptRepository;
import kr.or.ddit.repository.SubDRepository;
import kr.or.ddit.util.MakeFileName;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MediRecoService {

	private final DoctorRepository DoctorRecodao;
	private final MyOrderRepository myOrderdao;
	private final MediRecoRepository mediRecodao;
	private final PatientRepository patientdao;
    private final PrescriptRepository prescriptdao;
    private final SubDRepository subDdao;
    private final MedPicRepository medPicdao;
    private final MediFileRepository mediFiledao;
    private final MyDrugRepository myDrugdao;
	public Map<String, Object> selectOneReco(String dId) throws Exception {
		List<ChartFormVO> result = new ArrayList<ChartFormVO>();
		Map<String, Object> map = new HashMap<String, Object>();
		List<ChartFormVO> medilist = DoctorRecodao.selectAllReco(dId);
		List<ChartFormVO> colist = DoctorRecodao.selectAllReco2(dId);
		List<MyOrderListVO> orderlist = myOrderdao.findAllByDocIdAndDelYn(dId, "N");
		String pNo = null;
		List<MediRecoVO> pastreco = null;
		PatientVO patientinfo = null;
		if (medilist != null) {
			for (int i = 0; i < medilist.size(); i++) {

				result.add(medilist.get(i));
			}
		}
		if (colist != null) {
			for (int i = 0; i < colist.size(); i++) {
				result.add(colist.get(i));
			}
		}

		Collections.sort(result, new SortByDate());
		if (!result.isEmpty()  && result != null ) {
			pNo = result.get(0).getPNo();

			pastreco = mediRecodao.findAllBypNo(pNo);
			Collections.sort(pastreco, new SortBymDate());
			pastreco.stream().sorted(Comparator.comparing(MediRecoVO :: getMDate).reversed());
			patientinfo = patientdao.findOneBypNo(pNo);
			patientinfo.setRsvNo(result.get(0).getRsvNo());
			// 나이 구하기
			String pRnum = patientinfo.getPRnum();
			pRnum = age(pRnum);
			patientinfo.setPRnum(pRnum);
			// 보험가입여부
			String pInsurance = patientinfo.getPInsurance();
			if (pInsurance.equals("Y")) {
				pInsurance = "의료보험가입";
			} else {
				pInsurance = "보험미가입";
			}
			patientinfo.setPInsurance(pInsurance);

			// 재진 여부 확인
			if (pastreco.isEmpty()) {
				patientinfo.setPAddress("초진");
			} else {
				patientinfo.setPAddress("재진");
			}

		}
		if (!result.isEmpty()  && result != null ) {
			String taNo = result.get(0).getTaNo();
			map.put("taNo", taNo);
			patientinfo.setCoNo(result.get(0).getCoNo());
			result.remove(0);
		}


		map.put("pNo", pNo);
		map.put("patient", result);
		map.put("orderset", orderlist);
		map.put("pastreco", pastreco);
		map.put("patientinfo", patientinfo);
		return map;

	}
	public String age(String rnum) {

		int age = Integer.parseInt(rnum.substring(0, 2));
		char ch = rnum.charAt(7);
		LocalDate current_date = LocalDate.now();
		int current_Year = current_date.getYear();

		if (ch == '1' || ch == '2') {
			age = current_Year - (1900 + age) + 1;
		} else if (ch == '3' || ch == '4') {
			age = current_Year - (2000 + age) + 1;
		}
		return age + "";
	}

	class SortByDate implements Comparator<ChartFormVO> {

		public int compare(ChartFormVO o1, ChartFormVO o2) {
			// TODO Auto-generated method stub
			return (o1.getRsvDay()).compareTo(o2.getRsvDay());
		}
	}

	class SortBymDate implements Comparator<MediRecoVO> {

		public int compare(MediRecoVO o1, MediRecoVO o2) {
			// TODO Auto-generated method stub
			return (o1.getMDate()).compareTo(o2.getMDate());
		}
	}
	public Map<String, Object> pastreco(String mNo) throws SQLException {
		Map<String, Object> map = new HashMap<String, Object>();
		//과거 진료기록 조회
		MediRecoVO pastsymptom = mediRecodao.findBymNo(mNo);
		//과거 처방전 조회
		List<PrescriptVO> orderdruglist = prescriptdao.findAllByPrescriptPkMno(mNo);
		//과거 부상병 조회
		List<SubDVO> sub_dlist = subDdao.findAllBySubDPkMno(mNo);
		//과거 사진 조회
		List<MedPicVO> pic = medPicdao.findAllBymNo(mNo);
		//과거 파일 조회
		List<MedFileVO> file = mediFiledao.findAllBymNo(mNo);
		map.put("pastsymptom", pastsymptom);
		map.put("orderdruglist", orderdruglist);
		map.put("sub_dlist", sub_dlist);
		map.put("pic", pic);
		if (file != null) {
			for (int i = 0; i < file.size(); i++) {
				String fileName = file.get(i).getMfFilename();
				String renew = MakeFileName.parseFileNameFromUUID(fileName, "\\&\\&");
				file.get(i).setMfFilename(renew);
			}
		}
		map.put("file", file);
		return map;
	}

	public MedPicVO getPic(String mpNo) {

		MedPicVO vo = medPicdao.findByMpNo(mpNo);
		return vo;
	}


	public List<OrdersetVO> orderdruglist(String moNo){

		List<OrdersetVO> result = myDrugdao.findAllByMoNo(moNo);

		return result;
	}

}
