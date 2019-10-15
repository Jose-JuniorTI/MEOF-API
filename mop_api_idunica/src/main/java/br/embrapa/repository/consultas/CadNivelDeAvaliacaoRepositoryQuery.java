package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.CadNivelDeAvaliacao;
import br.embrapa.repository.filter.CadNivelDeAvaliacaoFilter;

public interface CadNivelDeAvaliacaoRepositoryQuery {

	public Page<CadNivelDeAvaliacao> filtrar(CadNivelDeAvaliacaoFilter cadNivelDeAvaliacaoFilter, Pageable pageable);
	
}
