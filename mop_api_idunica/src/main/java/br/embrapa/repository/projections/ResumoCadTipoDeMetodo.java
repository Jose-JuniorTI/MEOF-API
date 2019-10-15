package br.embrapa.repository.projections;

public class ResumoCadTipoDeMetodo {

	private Long cdTipoDeMetodo;
	private String nmTipoDeMetodo;
	
	public ResumoCadTipoDeMetodo(Long cdTipoDeMetodo, String nmTipoDeMetodo) {
		this.cdTipoDeMetodo = cdTipoDeMetodo;
		this.nmTipoDeMetodo = nmTipoDeMetodo;
	}

	public Long getCdTipoDeMetodo() {
		return cdTipoDeMetodo;
	}

	public void setCdTipoDeMetodo(Long cdTipoDeMetodo) {
		this.cdTipoDeMetodo = cdTipoDeMetodo;
	}

	public String getNmTipoDeMetodo() {
		return nmTipoDeMetodo;
	}

	public void setNmTipoDeMetodo(String nmTipoDeMetodo) {
		this.nmTipoDeMetodo = nmTipoDeMetodo;
	}
	
	
	
	
	
}
