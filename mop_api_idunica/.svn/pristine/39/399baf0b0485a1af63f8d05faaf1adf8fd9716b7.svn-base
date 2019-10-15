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
public class ModLocal1_PK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d03_cdlocal1")
	private Long cdLocal1;
	
	@ManyToOne
	@JoinColumn(name="d03_cdempresa")
	private CadEmpresa cdEmpresa;
	
	
	public ModLocal1_PK() {
	}

	

	public ModLocal1_PK(Long cdLocal1, CadEmpresa cdEmpresa) {
		this.cdLocal1 = cdLocal1;
		this.cdEmpresa = cdEmpresa;
	}



	public Long getCdLocal1() {
		return cdLocal1;
	}


	public void setCdLocal1(Long cdLocal1) {
		this.cdLocal1 = cdLocal1;
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
		result = prime * result + ((cdLocal1 == null) ? 0 : cdLocal1.hashCode());
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
		ModLocal1_PK other = (ModLocal1_PK) obj;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		if (cdLocal1 == null) {
			if (other.cdLocal1 != null)
				return false;
		} else if (!cdLocal1.equals(other.cdLocal1))
			return false;
		return true;
	}
	
	


	

}