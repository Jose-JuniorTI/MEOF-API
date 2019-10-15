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

import br.embrapa.model.CadAmostragem;
import br.embrapa.model.CadAmostragem_;
import br.embrapa.repository.filter.CadAmostragemFilter;
import br.embrapa.repository.projections.ResumoCadAmostragem;

public class CadAmostragemRepositoryImpl implements CadAmostragemRepositoryQuery{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<CadAmostragem> filtrar(CadAmostragemFilter cadAmostragemFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<CadAmostragem> criteria = builder .createQuery(CadAmostragem.class);
		Root<CadAmostragem> root = criteria.from(CadAmostragem.class);
		
		Predicate[] predicates = criarRestricoes(cadAmostragemFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<CadAmostragem> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		return new PageImpl<>(query.getResultList(), pageable, total(cadAmostragemFilter));
	}
	
	@Override
	public Page<ResumoCadAmostragem> resumir(CadAmostragemFilter cadAmostragemFilter, Pageable pageable) {
		CriteriaBuilder builder = manager .getCriteriaBuilder();
		CriteriaQuery<ResumoCadAmostragem> criteria = builder.createQuery(ResumoCadAmostragem.class);
		Root<CadAmostragem> root = criteria.from(CadAmostragem.class);
		
		criteria.select(builder.construct(ResumoCadAmostragem.class
				, root.get(CadAmostragem_.cdAmostragem)
				, root.get(CadAmostragem_.nmAmostragem)));
		
		
		Predicate[] predicates = criarRestricoes(cadAmostragemFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<ResumoCadAmostragem> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		
		
		return new PageImpl<>(query.getResultList(), pageable, total(cadAmostragemFilter));
	}
	


	private void adiconarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalDeRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalDeRegistrosPorPagina;
		
		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalDeRegistrosPorPagina);
	}
	
	private Long total(CadAmostragemFilter cadAmostragemFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<CadAmostragem> root = criteria.from(CadAmostragem.class);
		
		Predicate[] predicates = criarRestricoes(cadAmostragemFilter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private Predicate[] criarRestricoes(CadAmostragemFilter cadAmostragemFilter, CriteriaBuilder builder,
			Root<CadAmostragem> root) {
		
		List<Predicate> predicates = new ArrayList<>();
		if(!StringUtils.isEmpty(cadAmostragemFilter.getNmamostragem())) {
			predicates.add(builder.like(
					builder.lower(root.get(CadAmostragem_.nmAmostragem)), "%" + cadAmostragemFilter.getNmamostragem().toLowerCase() + "%"));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	


}
