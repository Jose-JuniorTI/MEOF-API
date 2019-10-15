package br.embrapa.model.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import br.embrapa.model.ModNivel3;

@Embeddable
public class ModNivel4_PK implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="d13_cdempresa", referencedColumnName="d12_cdempresa", foreignKey = @ForeignKey(name="nivel4_empresa_fk")),
		@JoinColumn(name="d13_cdnivel1", referencedColumnName="d12_cdnivel1", foreignKey = @ForeignKey(name="nivel4_empresa_fk")),
		@JoinColumn(name="d13_cdnivel2", referencedColumnName="d12_cdnivel2", foreignKey = @ForeignKey(name="nivel4_empresa_fk")),
		@JoinColumn(name="d13_cdnivel3", referencedColumnName="d12_cdnivel3", foreignKey = @ForeignKey(name="nivel4_empresa_fk"))		
	})
	private ModNivel3 modNivel3;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d13_cdnivel4")
	private Long cdNivel4;

	public ModNivel4_PK() {
	}

	

	public ModNivel4_PK(ModNivel3 modNivel3, Long cdNivel4) {
		this.modNivel3 = modNivel3;
		this.cdNivel4 = cdNivel4;
	}



	public ModNivel3 getModNivel3() {
		return modNivel3;
	}

	public void setModNivel3(ModNivel3 modNivel3) {
		this.modNivel3 = modNivel3;
	}

	
	


	public Long getCdNivel4() {
		return cdNivel4;
	}



	public void setCdNivel4(Long cdNivel4) {
		this.cdNivel4 = cdNivel4;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdNivel4 == null) ? 0 : cdNivel4.hashCode());
		result = prime * result + ((modNivel3 == null) ? 0 : modNivel3.hashCode());
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
		ModNivel4_PK other = (ModNivel4_PK) obj;
		if (cdNivel4 == null) {
			if (other.cdNivel4 != null)
				return false;
		} else if (!cdNivel4.equals(other.cdNivel4))
			return false;
		if (modNivel3 == null) {
			if (other.modNivel3 != null)
				return false;
		} else if (!modNivel3.equals(other.modNivel3))
			return false;
		return true;
	}

	
}
