package kr.or.ddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.or.ddit.dto.PatientVO;
import kr.or.ddit.entity.PatientEntity;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, String> {

	PatientVO findOneBypNo(String pNo);

}
