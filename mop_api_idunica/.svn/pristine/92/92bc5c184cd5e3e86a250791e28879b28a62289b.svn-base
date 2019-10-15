package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.ModLocal3;
import br.embrapa.repository.filter.ModLocal3Filter;
import br.embrapa.repository.projections.ResumoModLocal3;


public interface ModLocal3RepositoryQuery {

	public Page<ModLocal3> filtrar(ModLocal3Filter modLocal3Filter, Pageable pageable);
	public Page<ResumoModLocal3> resumir(ModLocal3Filter modLocal3Filter, Pageable pageable);

}
