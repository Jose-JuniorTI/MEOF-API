package br.embrapa.repository.projections;

public class ResumoCadAmostragem {
	
	private Long cdAmostragem;
	private String nmAmostragem;
	
	public ResumoCadAmostragem(Long cdAmostragem, String nmAmostragem) {
		this.cdAmostragem = cdAmostragem;
		this.nmAmostragem = nmAmostragem;
	}

	
	public Long getCdAmostragem() {
		return cdAmostragem;
	}

	public void setCdAmostragem(Long cdAmostragem) {
		this.cdAmostragem = cdAmostragem;
	}

	public String getNmAmostragem() {
		return nmAmostragem;
	}

	public void setNmAmostragem(String nmAmostragem) {
		this.nmAmostragem = nmAmostragem;
	}
	
	
	
}
