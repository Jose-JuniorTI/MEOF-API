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

import br.embrapa.model.CadMaterial;
import br.embrapa.model.CadMaterial_;
import br.embrapa.repository.filter.CadMaterialFilter;
import br.embrapa.repository.projections.ResumoCadMaterial;

public class CadMaterialRepositoryImpl implements CadMaterialRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Page<CadMaterial> filtrar(CadMaterialFilter cadMaterialFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<CadMaterial> criteria = builder .createQuery(CadMaterial.class);
		Root<CadMaterial> root = criteria.from(CadMaterial.class);
		
		Predicate[] predicates = criarRestricoes(cadMaterialFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<CadMaterial> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		return new PageImpl<>(query.getResultList(), pageable, total(cadMaterialFilter));
	}

	@Override
	public Page<ResumoCadMaterial> resumir(CadMaterialFilter cadMaterialFilter, Pageable pageable) {
		CriteriaBuilder builder = manager .getCriteriaBuilder();
		CriteriaQuery<ResumoCadMaterial> criteria = builder.createQuery(ResumoCadMaterial.class);
		Root<CadMaterial> root = criteria.from(CadMaterial.class);
		
		criteria.select(builder.construct(ResumoCadMaterial.class
				, root.get(CadMaterial_.cdMaterial)
				, root.get(CadMaterial_.nmMaterial)));
		
		
		Predicate[] predicates = criarRestricoes(cadMaterialFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<ResumoCadMaterial> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		
		
		return new PageImpl<>(query.getResultList(), pageable, total(cadMaterialFilter));
	}
	private void adiconarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalDeRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalDeRegistrosPorPagina;
		
		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalDeRegistrosPorPagina);
		
	}
	
	private Long total(CadMaterialFilter cadMaterialFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<CadMaterial> root = criteria.from(CadMaterial.class);
		
		Predicate[] predicates = criarRestricoes(cadMaterialFilter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}


	private Predicate[] criarRestricoes(CadMaterialFilter cadMaterialFilter, CriteriaBuilder builder,
			Root<CadMaterial> root) {
		List<Predicate> predicates = new ArrayList<>();
		if(!StringUtils.isEmpty(cadMaterialFilter.getNmmaterial())) {
			predicates.add(builder.like(
					builder.lower(root.get(CadMaterial_.nmMaterial)), "%" + cadMaterialFilter.getNmmaterial().toLowerCase() + "%"));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}


}
