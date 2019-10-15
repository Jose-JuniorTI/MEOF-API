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
@Table(name="d12_nivel3_m")
public class ModNivel3 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d12_cdnivel3")
	private Long cdNivel3;
	
	@ManyToOne
	@JoinColumn(name="d12_cdempresa")
	private CadEmpresa cdEmpresa;
	
	@ManyToOne
	@JoinColumn(name="d12_cdnivel1")
	private ModNivel1 cdNivel1;
	
	@ManyToOne
	@JoinColumn(name="d12_cdnivel2")
	private ModNivel2 cdNivel2;
	
	@Column(name="d12_nmnivel3")
	private String nmNivel3;

	public Long getCdNivel3() {
		return cdNivel3;
	}

	public void setCdNivel3(Long cdNivel3) {
		this.cdNivel3 = cdNivel3;
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

	public ModNivel2 getCdNivel2() {
		return cdNivel2;
	}

	public void setCdNivel2(ModNivel2 cdNivel2) {
		this.cdNivel2 = cdNivel2;
	}

	public String getNmNivel3() {
		return nmNivel3;
	}

	public void setNmNivel3(String nmNivel3) {
		this.nmNivel3 = nmNivel3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdNivel3 == null) ? 0 : cdNivel3.hashCode());
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
		ModNivel3 other = (ModNivel3) obj;
		if (cdNivel3 == null) {
			if (other.cdNivel3 != null)
				return false;
		} else if (!cdNivel3.equals(other.cdNivel3))
			return false;
		return true;
	}
	
	
	

}
