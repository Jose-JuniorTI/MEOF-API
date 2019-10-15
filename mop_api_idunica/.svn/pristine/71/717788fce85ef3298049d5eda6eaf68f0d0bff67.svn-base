package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.ModNivel3;
import br.embrapa.repository.filter.ModNivel3Filter;
import br.embrapa.repository.projections.ResumoModNivel3;


public interface ModNivel3RepositoryQuery {
	
	public Page<ModNivel3> filtrar(ModNivel3Filter modNivel3Filter, Pageable pageable);
	public Page<ResumoModNivel3> resumir(ModNivel3Filter modNivel3Filter, Pageable pageable);

}
