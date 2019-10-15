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
@Table(name="d10_nivel1_m")
public class ModNivel1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d10_cdnivel1")
	private Long cdNivel1;
	
	@ManyToOne
	@JoinColumn(name="d10_cdempresa")
	private CadEmpresa cadEmpresa;
	
	@Column(name="d10_nmnivel1")
	private String nmNivel1;

	public Long getCdNivel1() {
		return cdNivel1;
	}

	public void setCdNivel1(Long cdNivel1) {
		this.cdNivel1 = cdNivel1;
	}

	public CadEmpresa getCadEmpresa() {
		return cadEmpresa;
	}

	public void setCadEmpresa(CadEmpresa cadEmpresa) {
		this.cadEmpresa = cadEmpresa;
	}

	
	public String getNmNivel1() {
		return nmNivel1;
	}

	public void setNmNivel1(String nmNivel1) {
		this.nmNivel1 = nmNivel1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdNivel1 == null) ? 0 : cdNivel1.hashCode());
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
		ModNivel1 other = (ModNivel1) obj;
		if (cdNivel1 == null) {
			if (other.cdNivel1 != null)
				return false;
		} else if (!cdNivel1.equals(other.cdNivel1))
			return false;
		return true;
	}
	
	

}
