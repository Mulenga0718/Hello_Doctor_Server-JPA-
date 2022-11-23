package kr.or.ddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.or.ddit.entity.DiseaseEntity;

@Repository
public interface DiseaseRepository extends JpaRepository<DiseaseEntity, String>, DiseaseAction {

}
