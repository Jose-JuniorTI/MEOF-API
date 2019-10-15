package br.embrapa.repository.projections;

import br.embrapa.model.CadTipoDeVerificador;

public class ResumoModMonitoramentoTemplate {


	private Long CdTemplate;
	private String NmTemplate;
	private CadTipoDeVerificador CdTipoDeVerificador;
	
	public ResumoModMonitoramentoTemplate(Long cdTemplate, String nmTemplate,
		CadTipoDeVerificador cdTipoDeVerificador) {
		CdTemplate = cdTemplate;
		NmTemplate = nmTemplate;
		CdTipoDeVerificador = cdTipoDeVerificador;
	}

	public Long getCdTemplate() {
		return CdTemplate;
	}

	public void setCdTemplate(Long cdTemplate) {
		CdTemplate = cdTemplate;
	}

	public String getNmTemplate() {
		return NmTemplate;
	}

	public void setNmTemplate(String nmTemplate) {
		NmTemplate = nmTemplate;
	}

	public CadTipoDeVerificador getCdTipoDeVerificador() {
		return CdTipoDeVerificador;
	}

	public void setCdTipoDeVerificador(CadTipoDeVerificador cdTipoDeVerificador) {
		CdTipoDeVerificador = cdTipoDeVerificador;
	}
	
	
	
	
	
}
