package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.CadMaterial;
import br.embrapa.repository.filter.CadMaterialFilter;
import br.embrapa.repository.projections.ResumoCadMaterial;



public interface CadMaterialRepositoryQuery {

	public Page<CadMaterial> filtrar(CadMaterialFilter cadMaterialFilter, Pageable pageable);
	public Page<ResumoCadMaterial> resumir(CadMaterialFilter cadMaterialFilter, Pageable pageable);
	
}
