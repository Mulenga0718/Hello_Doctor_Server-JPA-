package kr.or.ddit.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@ToString
@Table(name = "IP_DOC")
public class IpdocEntity {

	@EmbeddedId
	private IpdocPk ipdocPk;

	public IpdocEntity(IpdocPk ipdocPk) {
		this.ipdocPk = ipdocPk;
	}

	public IpdocEntity() {

	}



}
