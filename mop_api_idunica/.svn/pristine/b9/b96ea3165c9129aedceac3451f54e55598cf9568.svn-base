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

import br.embrapa.model.CadTipoDeVerificador_;
import br.embrapa.model.ModMonitoramentoTemplate;
import br.embrapa.model.ModMonitoramentoTemplate_;
import br.embrapa.repository.filter.ModMonitoramentoTemplateFilter;
import br.embrapa.repository.projections.ResumoModMonitoramentoTemplate;

public class ModMonitoramentoTemplateRepositoryImpl {
	
	@PersistenceContext
	private EntityManager manager;
	
	
	public Page<ModMonitoramentoTemplate> filtrar(ModMonitoramentoTemplateFilter modMonitoramentoTemplateFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<ModMonitoramentoTemplate> criteria = builder .createQuery(ModMonitoramentoTemplate.class);
		Root<ModMonitoramentoTemplate> root = criteria.from(ModMonitoramentoTemplate.class);
		
		Predicate[] predicates = criarRestricoes(modMonitoramentoTemplateFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<ModMonitoramentoTemplate> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		return new PageImpl<>(query.getResultList(), pageable, total(modMonitoramentoTemplateFilter));
	}

	public Page<ResumoModMonitoramentoTemplate> resumir(ModMonitoramentoTemplateFilter modMonitoramentoTemplateFilter, Pageable pageable) {
		CriteriaBuilder builder = manager .getCriteriaBuilder();
		CriteriaQuery<ResumoModMonitoramentoTemplate> criteria = builder.createQuery(ResumoModMonitoramentoTemplate.class);
		Root<ModMonitoramentoTemplate> root = criteria.from(ModMonitoramentoTemplate.class);
		
		criteria.select(builder.construct(ResumoModMonitoramentoTemplate.class
				, root.get(ModMonitoramentoTemplate_.CdTemplate)
				, root.get(ModMonitoramentoTemplate_.NmTemplate)
				, root.get(ModMonitoramentoTemplate_.CdTipoDeVerificador).get(CadTipoDeVerificador_.cdTipoDeVerificador)));
		
		
		Predicate[] predicates = criarRestricoes(modMonitoramentoTemplateFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<ResumoModMonitoramentoTemplate> query = manager.createQuery(criteria);
		adiconarRestricoesDePaginacao(query, pageable);
		
		
		return new PageImpl<>(query.getResultList(), pageable, total(modMonitoramentoTemplateFilter));
	}

	
	

	private void adiconarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalDeRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalDeRegistrosPorPagina;
		
		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalDeRegistrosPorPagina);
		
	}
	
	
	private Long total(ModMonitoramentoTemplateFilter modMonitoramentoTemplateFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<ModMonitoramentoTemplate> root = criteria.from(ModMonitoramentoTemplate.class);
		
		Predicate[] predicates = criarRestricoes(modMonitoramentoTemplateFilter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private Predicate[] criarRestricoes(ModMonitoramentoTemplateFilter modMonitoramentoTemplateFilter, CriteriaBuilder builder,
			Root<ModMonitoramentoTemplate> root) {
		List<Predicate> predicates = new ArrayList<>();
		if(!StringUtils.isEmpty(modMonitoramentoTemplateFilter.getNmTemplate())) {
			predicates.add(builder.like(
					builder.lower(root.get(ModMonitoramentoTemplate_.NmTemplate)), "%" + modMonitoramentoTemplateFilter.getNmTemplate().toLowerCase() + "%"));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}


}
