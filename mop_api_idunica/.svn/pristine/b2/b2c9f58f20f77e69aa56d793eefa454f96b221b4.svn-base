package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="d02_tipo_verificador")
public class CadTipoDeVerificador {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d02_cdtipoverificador")
	private Long cdTipoDeVerificador;
	
	@Column(name="d02_nmtipoverificador")
	private String nmTipoDeVerificador;
	
	@Column(name="d02_nrniveis")
	private Integer nrNiveis;
	
	@Column(name="d02_rotulonivel1")
	private String rotuloNivel1;
	
	@Column(name="d02_rotulonivel2")
	private String rotuloNivel2;
	
	@Column(name="d02_rotulonivel3")
	private String rotuloNivel3;
	
	@Column(name="d02_rotulonivel4")
	private String rotuloNivel4;
	
	@Column(name="d02_rotulonivel5")
	private String rotuloNivel5;

	public Long getCdTipoDeVerificador() {
		return cdTipoDeVerificador;
	}

	public void setCdTipoDeVerificador(Long cdTipoDeVerificador) {
		this.cdTipoDeVerificador = cdTipoDeVerificador;
	}

	public String getNmTipoDeVerificador() {
		return nmTipoDeVerificador;
	}

	public void setNmTipoDeVerificador(String nmTipoDeVerificador) {
		this.nmTipoDeVerificador = nmTipoDeVerificador;
	}

	public Integer getNrNiveis() {
		return nrNiveis;
	}

	public void setNrNiveis(Integer nrNiveis) {
		this.nrNiveis = nrNiveis;
	}

	public String getRotuloNivel1() {
		return rotuloNivel1;
	}

	public void setRotuloNivel1(String rotuloNivel1) {
		this.rotuloNivel1 = rotuloNivel1;
	}

	public String getRotuloNivel2() {
		return rotuloNivel2;
	}

	public void setRotuloNivel2(String rotuloNivel2) {
		this.rotuloNivel2 = rotuloNivel2;
	}

	public String getRotuloNivel3() {
		return rotuloNivel3;
	}

	public void setRotuloNivel3(String rotuloNivel3) {
		this.rotuloNivel3 = rotuloNivel3;
	}

	public String getRotuloNivel4() {
		return rotuloNivel4;
	}

	public void setRotuloNivel4(String rotuloNivel4) {
		this.rotuloNivel4 = rotuloNivel4;
	}

	public String getRotuloNivel5() {
		return rotuloNivel5;
	}

	public void setRotuloNivel5(String rotuloNivel5) {
		this.rotuloNivel5 = rotuloNivel5;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdTipoDeVerificador == null) ? 0 : cdTipoDeVerificador.hashCode());
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
		CadTipoDeVerificador other = (CadTipoDeVerificador) obj;
		if (cdTipoDeVerificador == null) {
			if (other.cdTipoDeVerificador != null)
				return false;
		} else if (!cdTipoDeVerificador.equals(other.cdTipoDeVerificador))
			return false;
		return true;
	}

	
}
