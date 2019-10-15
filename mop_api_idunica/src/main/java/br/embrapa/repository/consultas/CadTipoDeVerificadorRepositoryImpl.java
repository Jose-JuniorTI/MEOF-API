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

import br.embrapa.model.CadTipoDeVerificador;
import br.embrapa.model.CadTipoDeVerificador_;
import br.embrapa.repository.filter.CadTipoDeVerificadorFilter;

public class CadTipoDeVerificadorRepositoryImpl implements CadTipoDeVerificadorRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Page<CadTipoDeVerificador> filtrar(CadTipoDeVerificadorFilter cadTipoDeVerificadorFilter,
			Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<CadTipoDeVerificador> criteria = builder .createQuery(CadTipoDeVerificador.class);
		Root<CadTipoDeVerificador> root = criteria.from(CadTipoDeVerificador.class);
		
		Predicate[] predicates = criarRestricoes(cadTipoDeVerificadorFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<CadTipoDeVerificador> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		return new PageImpl<>(query.getResultList(), pageable, total(cadTipoDeVerificadorFilter));
	}
	
	private Predicate[] criarRestricoes(CadTipoDeVerificadorFilter cadTipoDeVerificadorFilter, CriteriaBuilder builder,
			Root<CadTipoDeVerificador> root) {
		
		List<Predicate> predicates = new ArrayList<>();
		if(!StringUtils.isEmpty(cadTipoDeVerificadorFilter.getNmTipoDeVerificador())) {
			predicates.add(builder.like(
					builder.lower(root.get(CadTipoDeVerificador_.nmTipoDeVerificador)), "%" + cadTipoDeVerificadorFilter.getNmTipoDeVerificador().toLowerCase() + "%"));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	private void adiconarRestricoesDePaginacao(TypedQuery<CadTipoDeVerificador> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalDeRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalDeRegistrosPorPagina;
		
		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalDeRegistrosPorPagina);
		
	}

	private Long total(CadTipoDeVerificadorFilter cadTipoDeVerificadorFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<CadTipoDeVerificador> root = criteria.from(CadTipoDeVerificador.class);
		
		Predicate[] predicates = criarRestricoes(cadTipoDeVerificadorFilter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	



}
