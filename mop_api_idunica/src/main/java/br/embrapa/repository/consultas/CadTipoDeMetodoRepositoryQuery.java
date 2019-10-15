package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.CadTipoDeMetodo;
import br.embrapa.repository.filter.CadTipoDeMetodoFilter;
import br.embrapa.repository.projections.ResumoCadTipoDeMetodo;





public interface CadTipoDeMetodoRepositoryQuery {
	
	public Page<CadTipoDeMetodo> filtrar(CadTipoDeMetodoFilter cadTipoDeMetodoFilter, Pageable pageable);
	public Page<ResumoCadTipoDeMetodo> resumir(CadTipoDeMetodoFilter cadTipoDeMetodoFilter, Pageable pageable);

}
