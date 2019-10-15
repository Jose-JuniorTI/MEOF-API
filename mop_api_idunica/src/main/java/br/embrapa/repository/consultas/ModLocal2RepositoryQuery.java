package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.ModLocal2;
import br.embrapa.repository.filter.ModLocal2Filter;
import br.embrapa.repository.projections.ResumoModLocal2;



public interface ModLocal2RepositoryQuery {
	
	public Page<ModLocal2> filtrar(ModLocal2Filter modLocal2Filter, Pageable pageable);
	public Page<ResumoModLocal2> resumir(ModLocal2Filter modLocal2Filter, Pageable pageable);

}
