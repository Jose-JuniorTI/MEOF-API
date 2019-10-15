package br.embrapa.model.pk;

import java.io.Serializable;

import br.embrapa.model.CadEmpresa;
import br.embrapa.model.CadTipoDeVerificador;

public class Verificador_m_PK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private CadEmpresa cdEmpresa;

	
	private CadTipoDeVerificador cdTipoDeVerificador;


	private Long cdVerificador;
	
	

	public Verificador_m_PK() {
	}


	public Verificador_m_PK(CadEmpresa cdEmpresa, CadTipoDeVerificador cdTipoDeVerificador, Long cdVerificador) {
		this.cdEmpresa = cdEmpresa;
		this.cdTipoDeVerificador = cdTipoDeVerificador;
		this.cdVerificador = cdVerificador;
	}


	public CadEmpresa getCdEmpresa() {
		return cdEmpresa;
	}


	public void setCdEmpresa(CadEmpresa cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}


	public CadTipoDeVerificador getCdTipoDeVerificador() {
		return cdTipoDeVerificador;
	}


	public void setCdTipoDeVerificador(CadTipoDeVerificador cdTipoDeVerificador) {
		this.cdTipoDeVerificador = cdTipoDeVerificador;
	}


	public Long getCdVerificador() {
		return cdVerificador;
	}


	public void setCdVerificador(Long cdVerificador) {
		this.cdVerificador = cdVerificador;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
		result = prime * result + ((cdTipoDeVerificador == null) ? 0 : cdTipoDeVerificador.hashCode());
		result = prime * result + ((cdVerificador == null) ? 0 : cdVerificador.hashCode());
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
		Verificador_m_PK other = (Verificador_m_PK) obj;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		if (cdTipoDeVerificador == null) {
			if (other.cdTipoDeVerificador != null)
				return false;
		} else if (!cdTipoDeVerificador.equals(other.cdTipoDeVerificador))
			return false;
		if (cdVerificador == null) {
			if (other.cdVerificador != null)
				return false;
		} else if (!cdVerificador.equals(other.cdVerificador))
			return false;
		return true;
	}
	
	
	
	
	
	
}
