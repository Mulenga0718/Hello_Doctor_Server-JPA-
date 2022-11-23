package kr.or.ddit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.or.ddit.dto.OrdersetVO;
import kr.or.ddit.entity.MyDrugEntity;



@Repository
public interface MyDrugRepository extends JpaRepository<MyDrugEntity, String>{

	List<OrdersetVO> findAllByMoNo(String moNo);

}
