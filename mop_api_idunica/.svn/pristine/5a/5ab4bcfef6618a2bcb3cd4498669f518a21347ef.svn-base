package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.persister.entity.AbstractEntityPersister;
import org.hibernate.tuple.entity.EntityMetamodel;

import br.embrapa.model.pk.ModLocal2_PK;

@Entity
@Table(name="d04_local2_m")
public class ModLocal2 {

	
	@EmbeddedId
	private ModLocal2_PK pkLocal2;
	
	@Column(name="d04_nmlocal2")
	private String nmLocal2;

	

	public ModLocal2_PK getPkLocal2() {
		return pkLocal2;
	}

	public void setPkLocal2(ModLocal2_PK pkLocal2) {
		this.pkLocal2 = pkLocal2;
	}

	public String getNmLocal2() {
		return nmLocal2;
	}

	public void setNmLocal2(String nmLocal2) {
		this.nmLocal2 = nmLocal2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nmLocal2 == null) ? 0 : nmLocal2.hashCode());
		result = prime * result + ((pkLocal2 == null) ? 0 : pkLocal2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModLocal2 other = (ModLocal2) obj;
		if (nmLocal2 == null) {
			if (other.nmLocal2 != null)
				return false;
		} else if (!nmLocal2.equals(other.nmLocal2))
			return false;
		if (pkLocal2 == null) {
			if (other.pkLocal2 != null)
				return false;
		} else if (!pkLocal2.equals(other.pkLocal2))
			return false;
		return true;
	}
	
	
	
	

	
	
}