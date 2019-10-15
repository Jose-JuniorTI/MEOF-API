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
@Table(name="d13_nivel4_m")
public class ModNivel4 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d13_cdnivel4")
	private Long cdNivel4;
	
	@ManyToOne
	@JoinColumn(name="d13_cdempresa")
	private CadEmpresa cdEmpresa;
	
	@ManyToOne
	@JoinColumn(name="d13_cdnivel1")
	private ModNivel1 cdNivel1;
	
	@ManyToOne
	@JoinColumn(name="d13_cdnivel2")
	private ModNivel2 cdNivel2;
	
	@ManyToOne
	@JoinColumn(name="d13_cdnivel3")
	private ModNivel3 cdNivel3;
	
	@Column(name="d13_nmnivel4")
	private String nmNivel4;
	

	public Long getCdNivel4() {
		return cdNivel4;
	}

	public void setCdNivel4(Long cdNivel4) {
		this.cdNivel4 = cdNivel4;
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

	public ModNivel3 getCdNivel3() {
		return cdNivel3;
	}

	public void setCdNivel3(ModNivel3 cdNivel3) {
		this.cdNivel3 = cdNivel3;
	}

	public String getNmNivel4() {
		return nmNivel4;
	}

	public void setNmNivel4(String nmNivel4) {
		this.nmNivel4 = nmNivel4;
	}
	
	

}
