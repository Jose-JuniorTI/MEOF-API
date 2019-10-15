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
@Table(name="d09_material_m")
public class CadMaterial {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d09_cdmaterial")
	private Long cdMaterial;
	
	@ManyToOne
	@JoinColumn(name="d09_cdempresa")
	private CadEmpresa cdEmpresa;
	
	@Column(name="d09_nmmaterial")
	private String nmMaterial;

	public Long getCdMaterial() {
		return cdMaterial;
	}

	public void setCdMaterial(Long cdMaterial) {
		this.cdMaterial = cdMaterial;
	}

	public CadEmpresa getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(CadEmpresa cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getNmMaterial() {
		return nmMaterial;
	}

	public void setNmMaterial(String nmMaterial) {
		this.nmMaterial = nmMaterial;
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
		CadMaterial other = (CadMaterial) obj;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		return true;
	}

	

	
}
