package kr.or.ddit.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "SUB_D")
public class SubDEntity {

	@EmbeddedId
	private SubDPk subDPk;

	public SubDEntity(SubDPk subDPk) {
		super();
		this.subDPk = subDPk;
	}

	public SubDEntity() {
		super();
	}




}
