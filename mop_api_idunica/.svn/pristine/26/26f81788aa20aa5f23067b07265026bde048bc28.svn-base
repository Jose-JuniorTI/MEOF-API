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

import br.embrapa.model.CadNivelDeAvaliacao;
import br.embrapa.model.CadNivelDeAvaliacao_;
import br.embrapa.repository.filter.CadNivelDeAvaliacaoFilter;

public class CadNivelDeAvaliacaoRepositoryImpl implements CadNivelDeAvaliacaoRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Page<CadNivelDeAvaliacao> filtrar(CadNivelDeAvaliacaoFilter cadNivelDeAvaliacaoFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<CadNivelDeAvaliacao> criteria = builder .createQuery(CadNivelDeAvaliacao.class);
		Root<CadNivelDeAvaliacao> root = criteria.from(CadNivelDeAvaliacao.class);
		
		Predicate[] predicates = criarRestricoes(cadNivelDeAvaliacaoFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<CadNivelDeAvaliacao> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		return new PageImpl<>(query.getResultList(), pageable, total(cadNivelDeAvaliacaoFilter));
	}


	private Predicate[] criarRestricoes(CadNivelDeAvaliacaoFilter cadNivelDeAvaliacaoFilter, CriteriaBuilder builder,
			Root<CadNivelDeAvaliacao> root) {
		
		List<Predicate> predicates = new ArrayList<>();
		if(!StringUtils.isEmpty(cadNivelDeAvaliacaoFilter.getNmnivelavaliacao())) {
			predicates.add(builder.like(
					builder.lower(root.get(CadNivelDeAvaliacao_.nmNivelDeAvaliacao)), "%" + cadNivelDeAvaliacaoFilter.getNmnivelavaliacao().toLowerCase() + "%"));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long total(CadNivelDeAvaliacaoFilter cadNivelDeAvaliacaoFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<CadNivelDeAvaliacao> root = criteria.from(CadNivelDeAvaliacao.class);
		
		Predicate[] predicates = criarRestricoes(cadNivelDeAvaliacaoFilter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}
	
	private void adiconarRestricoesDePaginacao(TypedQuery<CadNivelDeAvaliacao> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalDeRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalDeRegistrosPorPagina;
		
		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalDeRegistrosPorPagina);
		
	}
}
