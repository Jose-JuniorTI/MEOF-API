package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="d16_unidade_de_trabalho")
public class UnidadeDeTrabalho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="d16_cdut")
	private long cdUt;
	
	@ManyToOne
	@JoinColumn(name = "d16_cdupa", referencedColumnName = "d15_cdupa")
	private UnidadeProducaoAnual cdUpa;
	
	@Column (name="d16_ut")
	private long ut;

	public long getCdUt() {
		return cdUt;
	}

	public void setCdUt(long cdUt) {
		this.cdUt = cdUt;
	}

	public UnidadeProducaoAnual getCdUpa() {
		return cdUpa;
	}

	public void setCdUpa(UnidadeProducaoAnual cdUpa) {
		this.cdUpa = cdUpa;
	}

	public long getUt() {
		return ut;
	}

	public void setUt(long ut) {
		this.ut = ut;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cdUt ^ (cdUt >>> 32));
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
		UnidadeDeTrabalho other = (UnidadeDeTrabalho) obj;
		if (cdUt != other.cdUt)
			return false;
		return true;
	}
	
	
	

}
