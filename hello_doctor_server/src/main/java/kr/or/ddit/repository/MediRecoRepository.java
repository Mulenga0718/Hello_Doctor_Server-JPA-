package kr.or.ddit.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.or.ddit.dto.MediRecoVO;
import kr.or.ddit.entity.MediRecoEntity;


public interface MediRecoRepository extends JpaRepository<MediRecoEntity, String> {

	List<MediRecoVO> findAllBypNo(String pNo);

	MediRecoVO findBymNo(String mNo);


}
