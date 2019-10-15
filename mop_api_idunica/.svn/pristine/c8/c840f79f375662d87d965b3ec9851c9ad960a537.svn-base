package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.ModMonitoramentoTemplate;
import br.embrapa.repository.filter.ModMonitoramentoTemplateFilter;
import br.embrapa.repository.projections.ResumoModMonitoramentoTemplate;


public interface ModMonitoramentoTemplateRepositoryQuery {
	
	public Page<ModMonitoramentoTemplate> filtrar(ModMonitoramentoTemplateFilter modMonitoramentoTemplateFilter, Pageable pageable);
	public Page<ResumoModMonitoramentoTemplate> resumir(ModMonitoramentoTemplateFilter modMonitoramentoTemplateFilter, Pageable pageable);

}
