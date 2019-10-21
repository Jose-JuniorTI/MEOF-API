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
import org.springframework.util.StringUtils;

import br.embrapa.model.AreaManejoFlorestal;
import br.embrapa.model.AreaManejoFlorestal_;
import br.embrapa.repository.filter.AreaManejoFlorestalFilter;

public class AreaManejoFlorestalRepositoryImpl implements AreaManejoFlorestalRepositoryQuery {

	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Page<AreaManejoFlorestal> filtrar(AreaManejoFlorestalFilter areaManejoFlorestalFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<AreaManejoFlorestal> criteria = builder .createQuery(AreaManejoFlorestal.class);
		Root<AreaManejoFlorestal> root = criteria.from(AreaManejoFlorestal.class);
		
		Predicate[] predicates = criarRestricoes(areaManejoFlorestalFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<AreaManejoFlorestal> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		
		return new PageImpl<>(query.getResultList(), pageable, total(areaManejoFlorestalFilter));
	}

	private Long total(AreaManejoFlorestalFilter areaManejoFlorestalFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<AreaManejoFlorestal> root = criteria.from(AreaManejoFlorestal.class);
		
		Predicate[] predicates = criarRestricoes(areaManejoFlorestalFilter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adiconarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalDeRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalDeRegistrosPorPagina;
		
		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalDeRegistrosPorPagina);
		
	}

	
	// CRIAR FILTROS DE PESQUISA
	
	private Predicate[] criarRestricoes(AreaManejoFlorestalFilter areaManejoFlorestalaFilter, CriteriaBuilder builder,
			Root<AreaManejoFlorestal> root) {
		
		List<Predicate> predicates = new ArrayList<>();
		if(!StringUtils.isEmpty(areaManejoFlorestalaFilter.getNmProjeto())) {
			predicates.add(builder.like(
					builder.lower(root.get(AreaManejoFlorestal_.nmProjeto)), "%" + areaManejoFlorestalaFilter.getNmProjeto().toLowerCase() + "%"));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}

}
