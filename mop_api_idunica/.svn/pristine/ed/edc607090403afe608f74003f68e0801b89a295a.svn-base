package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.embrapa.model.pk.ModLocal3_PK;

@Entity
@Table(name="d05_local3_m")
public class ModLocal3 {

	
	
	@EmbeddedId
	private ModLocal3_PK pkLocal3;
	
		
	@Column(name="d05_nmlocal3")
	private String nmLocal3;


	public ModLocal3_PK getPkLocal3() {
		return pkLocal3;
	}


	public void setPkLocal3(ModLocal3_PK pkLocal3) {
		this.pkLocal3 = pkLocal3;
	}


	public String getNmLocal3() {
		return nmLocal3;
	}


	public void setNmLocal3(String nmLocal3) {
		this.nmLocal3 = nmLocal3;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nmLocal3 == null) ? 0 : nmLocal3.hashCode());
		result = prime * result + ((pkLocal3 == null) ? 0 : pkLocal3.hashCode());
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
		ModLocal3 other = (ModLocal3) obj;
		if (nmLocal3 == null) {
			if (other.nmLocal3 != null)
				return false;
		} else if (!nmLocal3.equals(other.nmLocal3))
			return false;
		if (pkLocal3 == null) {
			if (other.pkLocal3 != null)
				return false;
		} else if (!pkLocal3.equals(other.pkLocal3))
			return false;
		return true;
	}


	

}
