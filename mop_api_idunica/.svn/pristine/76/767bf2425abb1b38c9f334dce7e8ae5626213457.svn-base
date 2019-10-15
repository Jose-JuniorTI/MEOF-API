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

import br.embrapa.model.CadTipoDeMetodo;
import br.embrapa.model.CadTipoDeMetodo_;
import br.embrapa.repository.filter.CadTipoDeMetodoFilter;
import br.embrapa.repository.projections.ResumoCadTipoDeMetodo;

public class CadTipoDeMetodoRepositoryImpl implements CadTipoDeMetodoRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Page<CadTipoDeMetodo> filtrar(CadTipoDeMetodoFilter cadTipoDeMetodoFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<CadTipoDeMetodo> criteria = builder .createQuery(CadTipoDeMetodo.class);
		Root<CadTipoDeMetodo> root = criteria.from(CadTipoDeMetodo.class);
		
		Predicate[] predicates = criarRestricoes(cadTipoDeMetodoFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<CadTipoDeMetodo> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		return new PageImpl<>(query.getResultList(), pageable, total(cadTipoDeMetodoFilter));
	}




	@Override
	public Page<ResumoCadTipoDeMetodo> resumir(CadTipoDeMetodoFilter cadTipoDeMetodoFilter, Pageable pageable) {
		CriteriaBuilder builder = manager .getCriteriaBuilder();
		CriteriaQuery<ResumoCadTipoDeMetodo> criteria = builder.createQuery(ResumoCadTipoDeMetodo.class);
		Root<CadTipoDeMetodo> root = criteria.from(CadTipoDeMetodo.class);
		
		criteria.select(builder.construct(ResumoCadTipoDeMetodo.class
				, root.get(CadTipoDeMetodo_.cdTipoDeMetodo)
				, root.get(CadTipoDeMetodo_.nmTipoDeMetodo)));
		
		
		Predicate[] predicates = criarRestricoes(cadTipoDeMetodoFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<ResumoCadTipoDeMetodo> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		
		
		return new PageImpl<>(query.getResultList(), pageable, total(cadTipoDeMetodoFilter));
	}

	private void adiconarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalDeRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalDeRegistrosPorPagina;
		
		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalDeRegistrosPorPagina);
		
	}
	private Predicate[] criarRestricoes(CadTipoDeMetodoFilter cadTipoDeMetodoFilter, CriteriaBuilder builder,
			Root<CadTipoDeMetodo> root) {
		List<Predicate> predicates = new ArrayList<>();
		if(!StringUtils.isEmpty(cadTipoDeMetodoFilter.getTipometodo())) {
			predicates.add(builder.like(
					builder.lower(root.get(CadTipoDeMetodo_.nmTipoDeMetodo)), "%" + cadTipoDeMetodoFilter.getTipometodo().toLowerCase() + "%"));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	
	private Long total(CadTipoDeMetodoFilter cadTipoDeMetodoFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<CadTipoDeMetodo> root = criteria.from(CadTipoDeMetodo.class);
		
		Predicate[] predicates = criarRestricoes(cadTipoDeMetodoFilter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}
}
