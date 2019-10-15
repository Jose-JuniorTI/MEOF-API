package br.embrapa.model.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.embrapa.model.CadEmpresa;
import br.embrapa.model.ModNivel1;

public class ModNivel2_pk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Long cdNivel2;
	private CadEmpresa cdEmpresa;
	private ModNivel1 cdNivel1;
		
		
	public ModNivel2_pk() {
	}
	
	public ModNivel2_pk(Long cdNivel2, CadEmpresa cdEmpresa, ModNivel1 cdNivel1) {
		this.cdNivel2 = cdNivel2;
		this.cdEmpresa = cdEmpresa;
		this.cdNivel1 = cdNivel1;
	}
	public Long getCdNivel2() {
		return cdNivel2;
	}
	public void setCdNivel2(Long cdNivel2) {
		this.cdNivel2 = cdNivel2;
	}
	public CadEmpresa getCdEmpresa() {
		return cdEmpresa;
	}
	public void setCdEmpresa(CadEmpresa cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}
	public ModNivel1 getCdNivel1() {
		return cdNivel1;
	}
	public void setCdNivel1(ModNivel1 cdNivel1) {
		this.cdNivel1 = cdNivel1;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
