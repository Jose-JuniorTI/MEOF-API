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
@Table(name="d07_tipo_metodo_m")
public class CadTipoDeMetodo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d07_cdtipometodo")
	private Long cdTipoDeMetodo;
	
	@ManyToOne
	@JoinColumn(name="d07_cdempresa")
	private CadEmpresa cdEmpresa;
	
	@Column(name="d07_nmtipometodo")
	private String nmTipoDeMetodo;

	public Long getCdTipoDeMetodo() {
		return cdTipoDeMetodo;
	}

	public void setCdTipoDeMetodo(Long cdTipoDeMetodo) {
		this.cdTipoDeMetodo = cdTipoDeMetodo;
	}

	public CadEmpresa getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(CadEmpresa cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getNmTipoDeMetodo() {
		return nmTipoDeMetodo;
	}

	public void setNmTipoDeMetodo(String nmTipoDeMetodo) {
		this.nmTipoDeMetodo = nmTipoDeMetodo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
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
		CadTipoDeMetodo other = (CadTipoDeMetodo) obj;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		return true;
	}

	
}
