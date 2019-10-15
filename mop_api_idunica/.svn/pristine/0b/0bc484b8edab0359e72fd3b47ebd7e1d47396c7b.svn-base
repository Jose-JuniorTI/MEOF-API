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
@Table(name="d11_nivel2_m")
public class ModNivel2 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d11_cdnivel2")
	private Long cdNivel2;
	
	@ManyToOne
	@JoinColumn(name="d11_cdempresa")
	private CadEmpresa cdEmpresa;
	
	@ManyToOne
	@JoinColumn(name="d11_cdnivel1")
	private ModNivel1 cdNivel1;
	
	@Column(name="d11_nmnivel2")
	private String nmNivel2;

	public Long getCdNivel2() {
		return cdNivel2; 
	}

	public void setCdNivel2(Long cdNivel2) {
		this.cdNivel2 = cdNivel2;
	}

	

	public CadEmpresa getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(CadEmpresa cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public ModNivel1 getCdNivel1() {
		return cdNivel1;
	}

	public void setCdNivel1(ModNivel1 cdNivel1) {
		this.cdNivel1 = cdNivel1;
	}

	public String getNmNivel2() {
		return nmNivel2;
	}

	public void setNmNivel2(String nmNivel2) {
		this.nmNivel2 = nmNivel2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdNivel2 == null) ? 0 : cdNivel2.hashCode());
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
		ModNivel2 other = (ModNivel2) obj;
		if (cdNivel2 == null) {
			if (other.cdNivel2 != null)
				return false;
		} else if (!cdNivel2.equals(other.cdNivel2))
			return false;
		return true;
	}
	
	
	

}
