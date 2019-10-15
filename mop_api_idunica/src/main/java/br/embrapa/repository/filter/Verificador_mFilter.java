package br.embrapa.repository.filter;

public class Verificador_mFilter {

	private String nmTipoDeVerificador;
	private Long cdVerificador;
	private Long cdTipoDeVerificador;
	private Long codigo;
	
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNmTipoDeVerificador() {
		return nmTipoDeVerificador;
	}
	public void setNmTipoDeVerificador(String nmTipoDeVerificador) {
		this.nmTipoDeVerificador = nmTipoDeVerificador;
	}
	public Long getCdVerificador() {
		return cdVerificador;
	}
	public void setCdVerificador(Long cdVerificador) {
		this.cdVerificador = cdVerificador;
	}
	public Long getCdTipoDeVerificador() {
		return cdTipoDeVerificador;
	}
	public void setCdTipoDeVerificador(Long cdTipoDeVerificador) {
		this.cdTipoDeVerificador = cdTipoDeVerificador;
	}

	
	
	
}
