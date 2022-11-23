package kr.or.ddit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kr.or.ddit.dto.MyOrderListVO;

import kr.or.ddit.entity.MyOrderEntity;

@Repository
public interface MyOrderRepository extends JpaRepository<MyOrderEntity, String>{

	List<MyOrderListVO> findAllByDocIdAndDelYn(String dId, String delYn);


}
