package br.embrapa.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="d13_empresa")
public class CadEmpresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="d13_cdempresa")
	private Long cdEmpresa;
	
	@Column(name="d13_nmempresa")
	private String nmEmpresa;
	
	@Column(name="d13_nmabreviado")
	private String nmAbreviado;
	
	@Column(name="d13_nmanodepreciacao")
	private BigDecimal nmAnoDepreciacao;
	
	@Column(name="d13_vltaxainteresse")
	private BigDecimal vlTaxaIntresse;
	
	@Column(name="d13_nrtelefone")
	private String nrTelefone;
	
	@Column(name="d13_enderecocompleto")
	private String enderecoCompleto;
	
	@Column(name="d13_txpessoacontato")
	private String txPessoaContato;
	
	@Column(name="d13_txrotuloprojeto")
	private String txRotuloProjeto;
	
	@Column(name="d13_txrotuloupa")
	private String txRotuloUpa;
	
	@Column(name="d13_txrotulout")
	private String txRotuloUt;
	
	@Column(name="d13_cdmoedalocal")
	private Long cdMoedaLocal;
	
	@Column(name="d13_cnpjempresa")
	private String cnpjEmpresa;

	public Long getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(Long cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getNmEmpresa() {
		return nmEmpresa;
	}

	public void setNmEmpresa(String nmEmpresa) {
		this.nmEmpresa = nmEmpresa;
	}

	public String getNmAbreviado() {
		return nmAbreviado;
	}

	public void setNmAbreviado(String nmAbreviado) {
		this.nmAbreviado = nmAbreviado;
	}

	public BigDecimal getNmAnoDepreciacao() {
		return nmAnoDepreciacao;
	}

	public void setNmAnoDepreciacao(BigDecimal nmAnoDepreciacao) {
		this.nmAnoDepreciacao = nmAnoDepreciacao;
	}

	public BigDecimal getVlTaxaIntresse() {
		return vlTaxaIntresse;
	}

	public void setVlTaxaIntresse(BigDecimal vlTaxaIntresse) {
		this.vlTaxaIntresse = vlTaxaIntresse;
	}

	public String getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}

	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}

	public String getTxPessoaContato() {
		return txPessoaContato;
	}

	public void setTxPessoaContrato(String txPessoaContato) {
		this.txPessoaContato = txPessoaContato;
	}

	public String getTxRotuloProjeto() {
		return txRotuloProjeto;
	}

	public void setTxRotuloProjeto(String txRotuloProjeto) {
		this.txRotuloProjeto = txRotuloProjeto;
	}

	public String getTxRotuloUpa() {
		return txRotuloUpa;
	}

	public void setTxRotuloUpa(String txRotuloUpa) {
		this.txRotuloUpa = txRotuloUpa;
	}

	public String getTxRotuloUt() {
		return txRotuloUt;
	}

	public void setTxRotuloUt(String txRotuloUt) {
		this.txRotuloUt = txRotuloUt;
	}

	public Long getCdMoedaLocal() {
		return cdMoedaLocal;
	}

	public void setCdMoedaLocal(Long cdMoedaLocal) {
		this.cdMoedaLocal = cdMoedaLocal;
	}

	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}

	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
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
		CadEmpresa other = (CadEmpresa) obj;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		return true;
	}
	
	
	
}
