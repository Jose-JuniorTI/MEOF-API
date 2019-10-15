package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.embrapa.model.pk.Verificador_m_PK;

@Entity
@Table(name="p01_verificador_m")
@IdClass(Verificador_m_PK.class)
public class Verificador_m {


	@Id
	@ManyToOne
	@JoinColumn(name="p01_cdempresa")
	private CadEmpresa cdEmpresa;

	@Id
	@ManyToOne
	@JoinColumn(name="p01_cdtipoverificador")
	private CadTipoDeVerificador cdTipoDeVerificador;

	@Id
	@Column(name="p01_cdverificador")
	private Long cdVerificador;
	
	@ManyToOne
	@JoinColumn(name="p01_cdnivelavaliacao")
	private CadNivelDeAvaliacao cadNivelDeAvaliacao;
	
	@Column(name="p01_codalfa")
	private String codalfa;
	
	@Column(name="p01_nmverificador")
	private String nmverificador;
	
	@Column(name="p01_limiar")
	private String limiar;
	
	@Column(name="p01_graco")
	private Double p01_graco;

	
	public CadNivelDeAvaliacao getCadNivelDeAvaliacao() {
		return cadNivelDeAvaliacao;
	}

	public void setCadNivelDeAvaliacao(CadNivelDeAvaliacao cadNivelDeAvaliacao) {
		this.cadNivelDeAvaliacao = cadNivelDeAvaliacao;
	}

	public String getCodalfa() {
		return codalfa;
	}

	public void setCodalfa(String codalfa) {
		this.codalfa = codalfa;
	}

	public String getNmverificador() {
		return nmverificador;
	}

	public void setNmverificador(String nmverificador) {
		this.nmverificador = nmverificador;
	}

	public String getLimiar() {
		return limiar;
	}

	public void setLimiar(String limiar) {
		this.limiar = limiar;
	}

	public Double getP01_graco() {
		return p01_graco;
	}

	public void setP01_graco(Double p01_graco) {
		this.p01_graco = p01_graco;
	}


	public CadEmpresa getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(CadEmpresa cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public CadTipoDeVerificador getCdTipoDeVerificador() {
		return cdTipoDeVerificador;
	}

	public void setCdTipoDeVerificador(CadTipoDeVerificador cdTipoDeVerificador) {
		this.cdTipoDeVerificador = cdTipoDeVerificador;
	}

	public Long getCdVerificador() {
		return cdVerificador;
	}

	public void setCdVerificador(Long cdVerificador) {
		this.cdVerificador = cdVerificador;
	}

	

	
	
	
}