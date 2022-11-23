package kr.or.ddit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.or.ddit.dto.SubDVO;
import kr.or.ddit.entity.SubDEntity;
import kr.or.ddit.entity.SubDPk;

@Repository
public interface SubDRepository extends JpaRepository<SubDEntity, SubDPk> {

	List<SubDVO> findAllBySubDPkMno(String mNo);
}
