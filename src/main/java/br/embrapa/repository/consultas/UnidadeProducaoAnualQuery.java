package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.UnidadeProducaoAnual;

public interface UnidadeProducaoAnualQuery {

	public Page<UnidadeProducaoAnual> filtrar(UnidadeProducaoAnual unidadeProducaoAnualFilter,Pageable pageble);
	
}
