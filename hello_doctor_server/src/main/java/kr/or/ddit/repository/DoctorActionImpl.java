package kr.or.ddit.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.criterion.Projection;
import org.springframework.beans.factory.annotation.Autowired;

import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.impl.JPAQueryFactory;

import kr.or.ddit.dto.ChartFormVO;
import kr.or.ddit.entity.QCoMedEntity;
import kr.or.ddit.entity.QCoTaskEntity;
import kr.or.ddit.entity.QPatientEntity;
import kr.or.ddit.entity.QReservationEntity;
import kr.or.ddit.util.LocalDateParser;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DoctorActionImpl implements DoctorAction {

	EntityManager entityManager;

	private final JPAQueryFactory queryFactory;
	private QReservationEntity reservation = QReservationEntity.reservationEntity;
	private QPatientEntity patient = QPatientEntity.patientEntity;
	private QCoTaskEntity coTask = QCoTaskEntity.coTaskEntity;
	private QCoMedEntity comed = QCoMedEntity.coMedEntity;

	public List<ChartFormVO> selectAllReco(String dId) {

		List<ChartFormVO> result = queryFactory
				.select(Projections.fields(ChartFormVO.class, patient.pNo, patient.pName, reservation.rsvDay,
						reservation.rsvNo, reservation.rsvName, patient.pRnum, patient.pSex))
				.from(reservation).innerJoin(patient).on(patient.pNo.eq(reservation.pNo))
				.where(reservation.dId.eq(dId)
						.and(Expressions.stringTemplate("to_char({0}, {1})", reservation.rsvDay,"yyyy-MM-dd")
								.eq(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")))))
				.fetch();


		return result;
	}

	@Override
	public List<ChartFormVO> selectAllReco2(String dId) {
		List<ChartFormVO> result = queryFactory
				.select(Projections.fields(ChartFormVO.class, coTask.taNo, coTask.coNo, patient.pNo, patient.pName,
						coTask.taDate.as("reservedate"), patient.pRnum, coTask.taName.as("rsvName"), coTask.taContent,
						patient.pSex))
				.from(coTask)
				.innerJoin(comed).on(comed.coNo.eq(coTask.coNo))
				.innerJoin(patient).on(patient.pNo.eq(comed.pNo))
				.where(coTask.dId.eq(dId)
						.and(Expressions.stringTemplate("to_char({0}, {1})", coTask.taDate,"yyyy-MM-dd")
								.eq(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))))
						.and(coTask.taStatus.eq(1))
						.and(coTask.reservYn.eq("N")))
				.fetch();

		return result;
	}

}
