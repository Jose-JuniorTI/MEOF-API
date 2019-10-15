package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.CadFrequencia;
import br.embrapa.repository.filter.CadFrequenciaFilter;
import br.embrapa.repository.projections.ResumoCadFrequencia;


public interface CadFrequenciaRepositoryQuery {
	
	public Page<CadFrequencia> filtrar(CadFrequenciaFilter cadFrequenciaFilter, Pageable pageable);
	public Page<ResumoCadFrequencia> resumir(CadFrequenciaFilter cadFrequenciaFilter, Pageable pageable);

}
