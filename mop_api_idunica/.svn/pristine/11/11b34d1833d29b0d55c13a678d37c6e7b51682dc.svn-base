package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.ModLocal1;
import br.embrapa.repository.filter.ModLocal1Filter;
import br.embrapa.repository.projections.ResumoModLocal1;



public interface ModLocal1RepositoryQuery {

	public Page<ModLocal1> filtrar(ModLocal1Filter modLocal1Filter, Pageable pageable);
	public Page<ResumoModLocal1> resumir(ModLocal1Filter modLocal1Filter, Pageable pageable);
}
