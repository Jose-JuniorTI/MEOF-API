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
@Table(name="d05_local3_m")
public class ModLocal3 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d05_cdlocal3")
	private Long cdLocal3;
		
	
	@ManyToOne
	@JoinColumn(name="d05_cdlocal2", referencedColumnName="d04_cdlocal2")
	private ModLocal2 cdLocal2;
	
	@ManyToOne
	@JoinColumn(name="d05_cdlocal1", referencedColumnName="d03_cdlocal1")
	private ModLocal1 cdLocal1;
	
	@ManyToOne
	@JoinColumn(name="d05_cdempresa", referencedColumnName="d24_cdempresa")
	private CadEmpresa cdEmpresa;

		
	@Column(name="d05_nmlocal3")
	private String nmLocal3;


	public Long getCdLocal3() {
		return cdLocal3;
	}


	public void setCdLocal3(Long cdLocal3) {
		this.cdLocal3 = cdLocal3;
	}


	public ModLocal2 getCdLocal2() {
		return cdLocal2;
	}


	public void setCdLocal2(ModLocal2 cdLocal2) {
		this.cdLocal2 = cdLocal2;
	}


	public ModLocal1 getCdLocal1() {
		return cdLocal1;
	}


	public void setCdLocal1(ModLocal1 cdLocal1) {
		this.cdLocal1 = cdLocal1;
	}


	public CadEmpresa getCdEmpresa() {
		return cdEmpresa;
	}


	public void setCdEmpresa(CadEmpresa cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}


	public String getNmLocal3() {
		return nmLocal3;
	}


	public void setNmLocal3(String nmLocal3) {
		this.nmLocal3 = nmLocal3;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdLocal3 == null) ? 0 : cdLocal3.hashCode());
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
		ModLocal3 other = (ModLocal3) obj;
		if (cdLocal3 == null) {
			if (other.cdLocal3 != null)
				return false;
		} else if (!cdLocal3.equals(other.cdLocal3))
			return false;
		return true;
	}
	
	



	
}
