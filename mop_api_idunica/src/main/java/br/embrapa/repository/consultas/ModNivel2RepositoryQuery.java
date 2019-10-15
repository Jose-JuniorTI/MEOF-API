package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.ModNivel2;
import br.embrapa.repository.filter.ModNivel2Filter;
import br.embrapa.repository.projections.ResumoModNivel2;


public interface ModNivel2RepositoryQuery {
	
	public Page<ModNivel2> filtrar(ModNivel2Filter modNivel2Filter, Pageable pageable);
	public Page<ResumoModNivel2> resumir(ModNivel2Filter modNivel2Filter, Pageable pageable);

}
