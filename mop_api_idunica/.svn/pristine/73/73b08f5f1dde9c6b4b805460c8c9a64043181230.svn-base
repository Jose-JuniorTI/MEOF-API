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
@Table(name="d14_template")
public class ModMonitoramentoTemplate {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d14_cdtemplate")
	private Long CdTemplate;
	
	@Column(name="d14_nmtemplate")
	private String NmTemplate;
	
	@ManyToOne
	@JoinColumn(name="d14_cdtipoverificador")
	private CadTipoDeVerificador CdTipoDeVerificador;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CdTemplate == null) ? 0 : CdTemplate.hashCode());
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
		ModMonitoramentoTemplate other = (ModMonitoramentoTemplate) obj;
		if (CdTemplate == null) {
			if (other.CdTemplate != null)
				return false;
		} else if (!CdTemplate.equals(other.CdTemplate))
			return false;
		return true;
	}
	
	
	
}
