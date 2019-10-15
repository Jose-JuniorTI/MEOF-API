package br.embrapa.repository.projections;

public class ResumoModNivel3 {
	

	private Long cdNivel1;
	private Long cdNivel2;
	private Long cdNivel3;
	private String nmNivel3;
	
	
	public ResumoModNivel3() {
	}


	public ResumoModNivel3(Long cdNivel1, Long cdNivel2, Long cdNivel3, String nmNivel3) {
		this.cdNivel1 = cdNivel1;
		this.cdNivel2 = cdNivel2;
		this.cdNivel3 = cdNivel3;
		this.nmNivel3 = nmNivel3;
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


	public Long getCdNivel3() {
		return cdNivel3;
	}


	public void setCdNivel3(Long cdNivel3) {
		this.cdNivel3 = cdNivel3;
	}


	public String getNmNivel3() {
		return nmNivel3;
	}


	public void setNmNivel3(String nmNivel3) {
		this.nmNivel3 = nmNivel3;
	}
	
	
	
	

}
