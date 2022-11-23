package kr.or.ddit.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.or.ddit.entity.IpdocEntity;


@Repository
public interface LoginAction extends JpaRepository<IpdocEntity, String>{

	public void doctorStatusStart(String dId);

	public List<String> docIp(String dId);
}
