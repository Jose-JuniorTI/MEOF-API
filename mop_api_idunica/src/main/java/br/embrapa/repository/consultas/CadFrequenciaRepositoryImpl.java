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

import br.embrapa.model.CadFrequencia;
import br.embrapa.model.CadFrequencia_;
import br.embrapa.repository.filter.CadFrequenciaFilter;
import br.embrapa.repository.projections.ResumoCadFrequencia;

public class CadFrequenciaRepositoryImpl implements CadFrequenciaRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Page<CadFrequencia> filtrar(CadFrequenciaFilter cadFrequenciaFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<CadFrequencia> criteria = builder .createQuery(CadFrequencia.class);
		Root<CadFrequencia> root = criteria.from(CadFrequencia.class);
		
		Predicate[] predicates = criarRestricoes(cadFrequenciaFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<CadFrequencia> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		return new PageImpl<>(query.getResultList(), pageable, total(cadFrequenciaFilter));
	}


	@Override
	public Page<ResumoCadFrequencia> resumir(CadFrequenciaFilter cadFrequenciaFilter, Pageable pageable) {
		CriteriaBuilder builder = manager .getCriteriaBuilder();
		CriteriaQuery<ResumoCadFrequencia> criteria = builder.createQuery(ResumoCadFrequencia.class);
		Root<CadFrequencia> root = criteria.from(CadFrequencia.class);
		
		criteria.select(builder.construct(ResumoCadFrequencia.class
				, root.get(CadFrequencia_.cdFrequencia)
				, root.get(CadFrequencia_.nmFrequencia)));
		
		
		Predicate[] predicates = criarRestricoes(cadFrequenciaFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<ResumoCadFrequencia> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		
		
		return new PageImpl<>(query.getResultList(), pageable, total(cadFrequenciaFilter));
	}

	private void adiconarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalDeRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalDeRegistrosPorPagina;
		
		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalDeRegistrosPorPagina);
		
	}
	
	private Predicate[] criarRestricoes(CadFrequenciaFilter cadFrequenciaFilter, CriteriaBuilder builder,
			Root<CadFrequencia> root) {
		List<Predicate> predicates = new ArrayList<>();
		if(!StringUtils.isEmpty(cadFrequenciaFilter.getNmFrequencia())) {
			predicates.add(builder.like(
					builder.lower(root.get(CadFrequencia_.nmFrequencia)), "%" + cadFrequenciaFilter.getNmFrequencia().toLowerCase() + "%"));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	

	private Long total(CadFrequenciaFilter cadFrequenciaFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<CadFrequencia> root = criteria.from(CadFrequencia.class);
		
		Predicate[] predicates = criarRestricoes(cadFrequenciaFilter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}
}
