package kr.or.ddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.or.ddit.entity.LoginLogEntity;
import kr.or.ddit.entity.LoginLogPk;

@Repository
public interface LoginLogRepository extends JpaRepository<LoginLogEntity, LoginLogPk > {

}
