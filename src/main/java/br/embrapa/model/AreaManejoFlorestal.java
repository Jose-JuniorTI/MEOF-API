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
@Table(name="d14_projetos_exploracao")
public class AreaManejoFlorestal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="d14_cdprojeto")
	private Long cdProjeto;
	
	@ManyToOne
	@JoinColumn(name = "d14_cdempresa", referencedColumnName = "d13_cdempresa")
	private CadEmpresa cdEmpresa;
	
	@Column(name = "d14_nmprojeto")
	private String nmProjeto;
	
	@Column(name="d14_localizacao")
	private String localizacao;
	
	@Column(name="d14_txobservacao")
	private String txObservacao;

	public Long getCdProjeto() {
		return cdProjeto;
	}

	public void setCdProjeto(Long cdProjeto) {
		this.cdProjeto = cdProjeto;
	}

	public CadEmpresa getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(CadEmpresa cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getNmProjeto() {
		return nmProjeto;
	}

	public void setNmProjeto(String nmProjeto) {
		this.nmProjeto = nmProjeto;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getTxObservacao() {
		return txObservacao;
	}

	public void setTxObservacao(String txObservacao) {
		this.txObservacao = txObservacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdProjeto == null) ? 0 : cdProjeto.hashCode());
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
		AreaManejoFlorestal other = (AreaManejoFlorestal) obj;
		if (cdProjeto == null) {
			if (other.cdProjeto != null)
				return false;
		} else if (!cdProjeto.equals(other.cdProjeto))
			return false;
		return true;
	}
	
	
	
}
