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
@Table(name="d08_frequencia_m")
public class CadFrequencia {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d08_cdfrequencia")
	private Long cdFrequencia;
	
	@ManyToOne
	@JoinColumn(name="d08_cdempresa")
	private CadEmpresa cdEmpresa;
	
	@Column(name="d08_nmfrequencia")
	private String nmFrequencia;

	public Long getCdFrequencia() {
		return cdFrequencia;
	}

	public void setCdFrequencia(Long cdFrequencia) {
		this.cdFrequencia = cdFrequencia;
	}

	public CadEmpresa getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(CadEmpresa cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getNmFrequencia() {
		return nmFrequencia;
	}

	public void setNmFrequencia(String nmFrequencia) {
		this.nmFrequencia = nmFrequencia;
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
		CadFrequencia other = (CadFrequencia) obj;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		return true;
	}

		
	
}
