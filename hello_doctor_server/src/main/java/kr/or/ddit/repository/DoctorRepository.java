package kr.or.ddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.or.ddit.entity.DoctorEntity;


@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity, String >, DoctorAction {

}
