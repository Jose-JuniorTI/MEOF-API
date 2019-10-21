package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.UnidadeProducaoAnual;
import br.embrapa.repository.consultas.AreaManejoFlorestalRepositoryQuery;

public interface UnidadeProducaoAnualRepository extends JpaRepository<UnidadeProducaoAnual, Long>, AreaManejoFlorestalRepositoryQuery {

	
	
	
}
