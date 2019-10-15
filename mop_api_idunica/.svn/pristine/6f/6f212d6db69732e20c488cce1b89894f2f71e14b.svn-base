package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.embrapa.model.pk.ModLocal1_PK;

@Entity
@Table(name="d03_local1_m")
public class ModLocal1 {

	@EmbeddedId
	private ModLocal1_PK pkLocal1;
	
	@Column(name="d03_nmlocal1")
	private String nmlocal1;

	

	public ModLocal1_PK getPkLocal1() {
		return pkLocal1;
	}

	public void setPkLocal1(ModLocal1_PK pkLocal1) {
		this.pkLocal1 = pkLocal1;
	}

	public String getNmlocal1() {
		return nmlocal1;
	}

	public void setNmlocal1(String nmlocal1) {
		this.nmlocal1 = nmlocal1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nmlocal1 == null) ? 0 : nmlocal1.hashCode());
		result = prime * result + ((pkLocal1 == null) ? 0 : pkLocal1.hashCode());
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
		ModLocal1 other = (ModLocal1) obj;
		if (nmlocal1 == null) {
			if (other.nmlocal1 != null)
				return false;
		} else if (!nmlocal1.equals(other.nmlocal1))
			return false;
		if (pkLocal1 == null) {
			if (other.pkLocal1 != null)
				return false;
		} else if (!pkLocal1.equals(other.pkLocal1))
			return false;
		return true;
	}

	
	
}