package kr.or.ddit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.or.ddit.dto.PrescriptVO;
import kr.or.ddit.entity.PrescriptEntity;
import kr.or.ddit.entity.PrescriptPk;

@Repository
public interface PrescriptRepository extends JpaRepository<PrescriptEntity, PrescriptPk> {

	List<PrescriptVO> findAllByPrescriptPkMno(String mNo);

}
