package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="d20_nivel_avaliacao")
public class CadNivelDeAvaliacao {

	@Id
	@Column(name="d20_cdnivelavaliacao")
	private Long cdNivelDeAvaliacao;
	
	@Column(name="d20_nmnivelavaliacao")
	private String nmNivelDeAvaliacao;
	
	@Column(name="d20_sigla")
	private String sigla;
	
	@Column(name="d20_txdescricao")
	private String txDescricao;

	public Long getCdNivelDeAvaliacao() {
		return cdNivelDeAvaliacao;
	}

	public void setCdNivelDeAvaliacao(Long cdNivelDeAvaliacao) {
		this.cdNivelDeAvaliacao = cdNivelDeAvaliacao;
	}

	public String getNmNivelDeAvaliacao() {
		return nmNivelDeAvaliacao;
	}

	public void setNmNivelDeAvaliacao(String nmNivelDeAvaliacao) {
		this.nmNivelDeAvaliacao = nmNivelDeAvaliacao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getTxDescricao() {
		return txDescricao;
	}

	public void setTxDescricao(String txDescricao) {
		this.txDescricao = txDescricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdNivelDeAvaliacao == null) ? 0 : cdNivelDeAvaliacao.hashCode());
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
		CadNivelDeAvaliacao other = (CadNivelDeAvaliacao) obj;
		if (cdNivelDeAvaliacao == null) {
			if (other.cdNivelDeAvaliacao != null)
				return false;
		} else if (!cdNivelDeAvaliacao.equals(other.cdNivelDeAvaliacao))
			return false;
		return true;
	}

	
}
