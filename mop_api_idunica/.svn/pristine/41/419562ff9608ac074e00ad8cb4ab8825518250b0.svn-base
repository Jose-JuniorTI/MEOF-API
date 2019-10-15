package br.embrapa.repository.consultas;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.ModNivel1_;
import br.embrapa.model.ModNivel2;
import br.embrapa.model.ModNivel2_;
import br.embrapa.repository.filter.ModNivel2Filter;
import br.embrapa.repository.projections.ResumoModNivel2;


public class ModNivel2RepositoryImpl {
	
	@PersistenceContext
	private EntityManager manager;
	
	
	public Page<ModNivel2> filtrar(ModNivel2Filter modNivel2Filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<ModNivel2> criteria = builder .createQuery(ModNivel2.class);
		Root<ModNivel2> root = criteria.from(ModNivel2.class);
		
		Predicate[] predicates = criarRestricoes(modNivel2Filter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<ModNivel2> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		return new PageImpl<>(query.getResultList(), pageable, total(modNivel2Filter));
	}
	
	
	public Page<ResumoModNivel2> resumir(ModNivel2Filter modNivel2Filter, Pageable pageable) {
		CriteriaBuilder builder = manager .getCriteriaBuilder();
		CriteriaQuery<ResumoModNivel2> criteria = builder.createQuery(ResumoModNivel2.class);
		Root<ModNivel2> root = criteria.from(ModNivel2.class);
		
		criteria.select(builder.construct(ResumoModNivel2.class
				, root.get(ModNivel2_.cdNivel1).get(ModNivel1_.nmNivel1)
				, root.get(ModNivel2_.cdNivel2)
				, root.get(ModNivel2_.nmNivel2)));
		
		
		Predicate[] predicates = criarRestricoes(modNivel2Filter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<ResumoModNivel2> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		
		
		return new PageImpl<>(query.getResultList(), pageable, total(modNivel2Filter));
	}

	private void adiconarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {
		
		int paginaAtual = pageable.getPageNumber();
		int totalDeRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalDeRegistrosPorPagina;
		
		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalDeRegistrosPorPagina);
		
	}

	private Long total(ModNivel2Filter modNivel2Filter) {
		
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<ModNivel2> root = criteria.from(ModNivel2.class);
		
		Predicate[] predicates = criarRestricoes(modNivel2Filter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}


	private Predicate[] criarRestricoes(ModNivel2Filter modNivel2Filter, CriteriaBuilder builder,
			Root<ModNivel2> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (modNivel2Filter.getCdNivel1() != null) {
			predicates.add(
			builder.equal(root.get(ModNivel2_.cdNivel1).get(ModNivel1_.cdNivel1), modNivel2Filter.getCdNivel1()));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}

}
