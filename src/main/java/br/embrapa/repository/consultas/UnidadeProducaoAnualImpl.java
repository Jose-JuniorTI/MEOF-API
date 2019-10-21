package br.embrapa.repository.consultas;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.engine.spi.Managed;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.UnidadeProducaoAnual;
import br.embrapa.repository.filter.AreaManejoFlorestalFilter;
import br.embrapa.repository.filter.UnidadeProducaoAnualFilter;

public class UnidadeProducaoAnualImpl implements UnidadeProducaoAnualQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<UnidadeProducaoAnual> filtrar(UnidadeProducaoAnual unidadeProducaoAnualFilter, Pageable pageble) {
		//CriteriaBuilder Buider = Managed;
	
		
		
		return null;
	}
	
}
