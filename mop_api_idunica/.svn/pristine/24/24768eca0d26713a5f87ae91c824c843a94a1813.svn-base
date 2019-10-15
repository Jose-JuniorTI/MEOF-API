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
@Table(name="d06_amostragem_m")
public class CadAmostragem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d06_cdamostragem")
	private Long cdAmostragem;
	
	@ManyToOne
	@JoinColumn(name="d06_cdempresa")
	private CadEmpresa cdEmpresa;
	
	@Column(name="d06_nmamostragem")
	private String nmAmostragem;

	public Long getCdAmostragem() {
		return cdAmostragem;
	}

	public void setCdAmostragem(Long cdAmostragem) {
		this.cdAmostragem = cdAmostragem;
	}

	public CadEmpresa getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(CadEmpresa cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getNmAmostragem() {
		return nmAmostragem;
	}

	public void setNmAmostragem(String nmAmostragem) {
		this.nmAmostragem = nmAmostragem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdAmostragem == null) ? 0 : cdAmostragem.hashCode());
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
		result = prime * result + ((nmAmostragem == null) ? 0 : nmAmostragem.hashCode());
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
		CadAmostragem other = (CadAmostragem) obj;
		if (cdAmostragem == null) {
			if (other.cdAmostragem != null)
				return false;
		} else if (!cdAmostragem.equals(other.cdAmostragem))
			return false;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		if (nmAmostragem == null) {
			if (other.nmAmostragem != null)
				return false;
		} else if (!nmAmostragem.equals(other.nmAmostragem))
			return false;
		return true;
	}

	
	
	
}
