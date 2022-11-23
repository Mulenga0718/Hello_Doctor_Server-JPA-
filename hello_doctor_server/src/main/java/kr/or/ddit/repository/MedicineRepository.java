package kr.or.ddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.or.ddit.entity.MedicineEntity;

public interface MedicineRepository extends JpaRepository<MedicineEntity, String>  {

}
