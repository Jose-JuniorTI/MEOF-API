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

import org.springframework.util.StringUtils;

import br.embrapa.model.CadEmpresa_;
import br.embrapa.model.CadTipoDeVerificador_;
import br.embrapa.model.Verificador_m;
import br.embrapa.model.Verificador_m_;
import br.embrapa.repository.filter.Verificador_mFilter;
import br.embrapa.repository.projections.ResumoVerificador_m;

public class Verificador_mRepositoryImpl implements Verificador_mRepositoryQuery{

	@PersistenceContext
	private EntityManager manager;
	
	
	public List<Verificador_m> filtrar(Verificador_mFilter verificardor_mFilter){
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Verificador_m> criteria = builder .createQuery(Verificador_m.class);
		Root<Verificador_m> root = criteria.from(Verificador_m.class);
		
		Predicate[] predicates = criarRestricoes(verificardor_mFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<Verificador_m> query = manager.createQuery(criteria);
		return query.getResultList();
	}

	
	@Override
	public List<ResumoVerificador_m> resumir(Verificador_mFilter verificardor_mFilter) {
		CriteriaBuilder builder = manager .getCriteriaBuilder();
		CriteriaQuery<ResumoVerificador_m> criteria = builder.createQuery(ResumoVerificador_m.class);
		Root<Verificador_m> root = criteria.from(Verificador_m.class);
		
		criteria.select(builder.construct(ResumoVerificador_m.class 
				, root.get(Verificador_m_.cdEmpresa).get(CadEmpresa_.nmEmpresa)
				, root.get(Verificador_m_.cdTipoDeVerificador).get(CadTipoDeVerificador_.nmTipoDeVerificador)
				, root.get(Verificador_m_.cdTipoDeVerificador)
				, root.get(Verificador_m_.codalfa)
				, root.get(Verificador_m_.nmverificador)
				, root.get(Verificador_m_.limiar) 
				, root.get(Verificador_m_.p01_graco)));
		
		
		Predicate[] predicates = criarRestricoes(verificardor_mFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<ResumoVerificador_m> query = manager.createQuery(criteria);
		return query.getResultList();
		
		
	}
	
	
	
	private Predicate[] criarRestricoes(Verificador_mFilter verificador_mFilter, CriteriaBuilder builder,
			Root<Verificador_m> root) {
		
		List<Predicate> predicates = new ArrayList<>();
		if(!StringUtils.isEmpty(verificador_mFilter.getNmTipoDeVerificador())) {
			predicates.add(builder.like(
				builder.lower(root.get(Verificador_m_.cdTipoDeVerificador).get(CadTipoDeVerificador_.nmTipoDeVerificador)), "%" + verificador_mFilter.getNmTipoDeVerificador().toLowerCase() + "%"));
		}
		
		if (verificador_mFilter.getCdTipoDeVerificador() != null) {
			predicates.add(
					builder.equal(root.get(Verificador_m_.cdTipoDeVerificador), verificador_mFilter.getCdTipoDeVerificador()));
}
		if (verificador_mFilter.getCdTipoDeVerificador() != null) {
			predicates.add(
					builder.equal(root.get(Verificador_m_.cdVerificador), verificador_mFilter.getCdVerificador()));
}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	
	

	
	
		
}
