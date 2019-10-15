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
import br.embrapa.model.ModNivel2_;
import br.embrapa.model.ModNivel3_;
import br.embrapa.model.ModNivel4;
import br.embrapa.model.ModNivel4_;
import br.embrapa.repository.filter.ModNivel4Filter;
import br.embrapa.repository.projections.ResumoModNivel4;

public class ModNivel4RepositoryImpl {
	
	
	@PersistenceContext
	private EntityManager manager;
	
	
	public Page<ModNivel4> filtrar(ModNivel4Filter modNivel4Filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<ModNivel4> criteria = builder .createQuery(ModNivel4.class);
		Root<ModNivel4> root = criteria.from(ModNivel4.class);
		
		Predicate[] predicates = criarRestricoes(modNivel4Filter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<ModNivel4> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		return new PageImpl<>(query.getResultList(), pageable, total(modNivel4Filter));
	}
	
	
	public Page<ResumoModNivel4> resumir(ModNivel4Filter modNivel4Filter, Pageable pageable) {
		CriteriaBuilder builder = manager .getCriteriaBuilder();
		CriteriaQuery<ResumoModNivel4> criteria = builder.createQuery(ResumoModNivel4.class);
		Root<ModNivel4> root = criteria.from(ModNivel4.class);
		
		criteria.select(builder.construct(ResumoModNivel4.class
				, root.get(ModNivel4_.cdNivel1).get(ModNivel1_.nmNivel1)
				, root.get(ModNivel4_.cdNivel2).get(ModNivel2_.nmNivel2)
				, root.get(ModNivel4_.cdNivel3).get(ModNivel3_.nmNivel3)
				, root.get(ModNivel4_.cdNivel4)
				, root.get(ModNivel4_.nmNivel4)));
		
		
		Predicate[] predicates = criarRestricoes(modNivel4Filter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<ResumoModNivel4> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		
		
		return new PageImpl<>(query.getResultList(), pageable, total(modNivel4Filter));
	}

	private void adiconarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {
		
		int paginaAtual = pageable.getPageNumber();
		int totalDeRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalDeRegistrosPorPagina;
		
		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalDeRegistrosPorPagina);
		
	}

	private Long total(ModNivel4Filter modNivel4Filter) {
		
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<ModNivel4> root = criteria.from(ModNivel4.class);
		
		Predicate[] predicates = criarRestricoes(modNivel4Filter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}


	private Predicate[] criarRestricoes(ModNivel4Filter modNivel4Filter, CriteriaBuilder builder,
			Root<ModNivel4> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (modNivel4Filter.getCdNivel1() != null) {
			predicates.add(
			builder.equal(root.get(ModNivel4_.cdNivel1).get(ModNivel1_.cdNivel1), modNivel4Filter.getCdNivel1()));
		}
		
		if (modNivel4Filter.getCdNivel2() != null) {
			predicates.add(
			builder.equal(root.get(ModNivel4_.cdNivel2).get(ModNivel2_.cdNivel2), modNivel4Filter.getCdNivel2()));
		}
		
		if (modNivel4Filter.getCdNivel3() != null) {
			predicates.add(
			builder.equal(root.get(ModNivel4_.cdNivel3).get(ModNivel3_.cdNivel3), modNivel4Filter.getCdNivel3()));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	

}
