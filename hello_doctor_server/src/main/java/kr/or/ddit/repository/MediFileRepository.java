package kr.or.ddit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.or.ddit.dto.MedFileVO;
import kr.or.ddit.entity.MediFileEntity;
import kr.or.ddit.entity.MediRecoEntity;

@Repository
public interface MediFileRepository extends JpaRepository<MediFileEntity, String> {

	List<MedFileVO> findAllBymNo(String mNo);
}
