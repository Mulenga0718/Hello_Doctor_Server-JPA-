package kr.or.ddit.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

import kr.or.ddit.dto.TypeaHeadVO;
import kr.or.ddit.entity.QDiseaseEntity;
import kr.or.ddit.entity.QMedicineEntity;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DiseaseActionImpl implements DiseaseAction {

	@Autowired
	EntityManager entityManager;

	private final JPAQueryFactory queryFactory;

	private QDiseaseEntity  disease = QDiseaseEntity.diseaseEntity;
	private QMedicineEntity medicine = QMedicineEntity.medicineEntity;
	@Override
	public List<TypeaHeadVO> searchdisease(String deKo) {

		List<TypeaHeadVO> result = queryFactory
				.select(Projections.fields(TypeaHeadVO.class,disease.deKo)
						)
				.from(disease).where(disease.deKo.contains(deKo)).limit(5).fetch();

		return result;
	}
	@Override
	public List<TypeaHeadVO> searchmedicine(String deKo) {

		List<TypeaHeadVO> result = queryFactory
				.select(Projections.fields(TypeaHeadVO.class,medicine.meName)
					)
				.from(medicine).where(medicine.meName.contains(deKo)).limit(5).fetch();

		return result;
	}

}
