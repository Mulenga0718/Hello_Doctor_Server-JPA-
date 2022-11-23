package kr.or.ddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kr.or.ddit.dto.DoctorVO;
import kr.or.ddit.entity.DoctorEntity;

@Repository
public interface LoginRepository extends JpaRepository<DoctorEntity, String>{
	DoctorVO findBydIdAndPwd(String dId, String pwd);

	DoctorVO findBydId(String dId);

}