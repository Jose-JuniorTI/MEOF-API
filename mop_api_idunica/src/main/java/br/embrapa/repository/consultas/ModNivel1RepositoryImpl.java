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

import br.embrapa.model.ModNivel1;
import br.embrapa.model.ModNivel1_;
import br.embrapa.repository.filter.ModNivel1Filter;



public class ModNivel1RepositoryImpl {

	@PersistenceContext
	private EntityManager manager;
	
	public Page<ModNivel1> filtrar(ModNivel1Filter modNivel1Filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<ModNivel1> criteria = builder .createQuery(ModNivel1.class);
		Root<ModNivel1> root = criteria.from(ModNivel1.class);
		
		Predicate[] predicates = criarRestricoes(modNivel1Filter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<ModNivel1> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		return new PageImpl<>(query.getResultList(), pageable, total(modNivel1Filter));
	}

	private Long total(ModNivel1Filter modNivel1Filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<ModNivel1> root = criteria.from(ModNivel1.class);
		
		Predicate[] predicates = criarRestricoes(modNivel1Filter, builder, root);
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

	private Predicate[] criarRestricoes(ModNivel1Filter modNivel1Filter, CriteriaBuilder builder,
			Root<ModNivel1> root) {
		List<Predicate> predicates = new ArrayList<>();
		if(!StringUtils.isEmpty(modNivel1Filter.getNmNivel1())) {
			predicates.add(builder.like(
					builder.lower(root.get(ModNivel1_.nmNivel1)), "%" + modNivel1Filter.getNmNivel1().toLowerCase() + "%"));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	
}
