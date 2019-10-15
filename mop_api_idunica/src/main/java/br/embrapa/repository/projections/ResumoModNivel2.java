package br.embrapa.repository.projections;

public class ResumoModNivel2 {

	private Long cdEmpresa;
	private Long cdNivel1;
	private Long cdNivel2;
	private String nmNivel2;
	
	
	public ResumoModNivel2(Long cdEmpresa, Long cdNivel1, Long cdNivel2, String nmNivel2) {
		this.cdEmpresa = cdEmpresa;
		this.cdNivel1 = cdNivel1;
		this.cdNivel2 = cdNivel2;
		this.nmNivel2 = nmNivel2;
	}


	public Long getCdEmpresa() {
		return cdEmpresa;
	}


	public void setCdEmpresa(Long cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}


	public Long getCdNivel1() {
		return cdNivel1;
	}


	public void setCdNivel1(Long cdNivel1) {
		this.cdNivel1 = cdNivel1;
	}


	public Long getCdNivel2() {
		return cdNivel2;
	}


	public void setCdNivel2(Long cdNivel2) {
		this.cdNivel2 = cdNivel2;
	}


	public String getNmNivel2() {
		return nmNivel2;
	}


	public void setNmNivel2(String nmNivel2) {
		this.nmNivel2 = nmNivel2;
	}
	
	
	
	
	
}
