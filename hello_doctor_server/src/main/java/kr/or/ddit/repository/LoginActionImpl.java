package kr.or.ddit.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.querydsl.jpa.impl.JPAUpdateClause;

import kr.or.ddit.dto.docIpVO;
import kr.or.ddit.entity.QDoctorEntity;
import kr.or.ddit.entity.QIpdocEntity;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class LoginActionImpl implements LoginAction {

	  @Autowired
	  EntityManager entityManager;

	private final JPAQueryFactory queryFactory;


	@Transactional
	public void doctorStatusStart(String dId) {
		QDoctorEntity doctor = QDoctorEntity.doctorEntity;


		long affectedRows = queryFactory.update(doctor).set(doctor.status, 1).where(doctor.dId.eq(dId)).execute();
		System.out.println(affectedRows);
		entityManager.flush();
        entityManager.clear();
	}


	public List<String> docIp(String dId) {

		QIpdocEntity ipdoc = QIpdocEntity.ipdocEntity;


		List<String> result =  queryFactory.select(ipdoc.ipdocPk.ipNo).from(ipdoc).where(ipdoc.ipdocPk.dId.eq(dId)).fetch();


		return result;
	}


}
