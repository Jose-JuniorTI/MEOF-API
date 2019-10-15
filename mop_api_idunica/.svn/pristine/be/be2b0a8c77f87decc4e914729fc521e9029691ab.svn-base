package br.embrapa.model.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.embrapa.model.CadEmpresa;

@Embeddable
public class ModNivel1_PK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d10_cdnivel1")
	private Long cdNivel1;
	
	@ManyToOne
	@JoinColumn(name="d10_cdempresa")
	private CadEmpresa cdEmpresa;

	public ModNivel1_PK() {
	}

	public ModNivel1_PK(Long cdNivel1, CadEmpresa cdEmpresa) {
		this.cdNivel1 = cdNivel1;
		this.cdEmpresa = cdEmpresa;
	}

	public Long getCdNivel1() {
		return cdNivel1;
	}

	public void setCdNivel1(Long cdNivel1) {
		this.cdNivel1 = cdNivel1;
	}

	public CadEmpresa getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(CadEmpresa cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
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
		ModNivel1_PK other = (ModNivel1_PK) obj;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		if (cdNivel1 == null) {
			if (other.cdNivel1 != null)
				return false;
		} else if (!cdNivel1.equals(other.cdNivel1))
			return false;
		return true;
	}

	
}
