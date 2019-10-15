package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="d24_empresa")
public class CadEmpresa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d24_cdempresa")
	private Long cdEmpresa;
	
	@Column(name="d24_nmempresa")
	@NotNull
	private String nmEmpresa;
	
	@Column(name="d24_nmabreviado")
	private String nmAbreviado;
	
	@Column(name="d24_nrtelefone")
	private String nrTelefone;
	
	@Column(name="d24_enderecocompleto")
	private String enderecoCompleto;
	
	@Column(name="d24_txpessoacontato")
	private String pessoContato;
	
	@Column(name="d24_cnpjempresa")
	private String cnpjEmpresa;
	
	@Column(name="d24_diretorioarquivos")
	private String diretorioArquivos;

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

	public String getPessoContato() {
		return pessoContato;
	}

	public void setPessoContato(String pessoContato) {
		this.pessoContato = pessoContato;
	}

	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}

	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}

	public String getDiretorioArquivos() {
		return diretorioArquivos;
	}

	public void setDiretorioArquivos(String diretorioArquivos) {
		this.diretorioArquivos = diretorioArquivos;
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
