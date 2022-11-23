package kr.or.ddit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.or.ddit.dto.MedPicVO;
import kr.or.ddit.entity.MedPicEntity;

@Repository
public interface MedPicRepository extends JpaRepository<MedPicEntity, String> {

	List<MedPicVO> findAllBymNo(String mNo);

	MedPicVO findByMpNo(String mpNo);
}
