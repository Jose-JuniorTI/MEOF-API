package br.embrapa.model.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import br.embrapa.model.CadEmpresa;
import br.embrapa.model.ModLocal1;
import br.embrapa.model.ModLocal2;
import br.embrapa.model.ModNivel1;
import br.embrapa.model.ModNivel2;

@Embeddable
public class ModNivel3_PK implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="d12_cdempresa", referencedColumnName="d11_cdempresa", foreignKey = @ForeignKey(name="nivel3_empresa_fk")),
		@JoinColumn(name="d12_cdnivel1", referencedColumnName="d11_cdnivel1", foreignKey = @ForeignKey(name="nivel3_empresa_fk")),
		@JoinColumn(name="d12_cdnivel2", referencedColumnName="d11_cdnivel2", foreignKey = @ForeignKey(name="nivel3_empresa_fk"))
	})
	private ModNivel2 modNivel2;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d12_cdnivel3")
	private Long cdNivel3;

	public ModNivel3_PK() {
	}

	
	public ModNivel3_PK(ModNivel2 modNivel2, Long cdNivel3) {
		this.modNivel2 = modNivel2;
		this.cdNivel3 = cdNivel3;
	}


	public ModNivel2 getModNivel2() {
		return modNivel2;
	}


	public void setModNivel2(ModNivel2 modNivel2) {
		this.modNivel2 = modNivel2;
	}


	public Long getCdNivel3() {
		return cdNivel3;
	}


	public void setCdNivel3(Long cdNivel3) {
		this.cdNivel3 = cdNivel3;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdNivel3 == null) ? 0 : cdNivel3.hashCode());
		result = prime * result + ((modNivel2 == null) ? 0 : modNivel2.hashCode());
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
		ModNivel3_PK other = (ModNivel3_PK) obj;
		if (cdNivel3 == null) {
			if (other.cdNivel3 != null)
				return false;
		} else if (!cdNivel3.equals(other.cdNivel3))
			return false;
		if (modNivel2 == null) {
			if (other.modNivel2 != null)
				return false;
		} else if (!modNivel2.equals(other.modNivel2))
			return false;
		return true;
	}


	
	
	
	
	

}
