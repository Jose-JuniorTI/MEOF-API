package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.CadTipoDeVerificador;
import br.embrapa.repository.filter.CadTipoDeVerificadorFilter;



public interface CadTipoDeVerificadorRepositoryQuery {

	
	public Page<CadTipoDeVerificador> filtrar(CadTipoDeVerificadorFilter cadTipoDeVerificadorFilter, Pageable pageable);
	

	
	
	
}
