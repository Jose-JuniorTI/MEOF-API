package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.ModNivel1;
import br.embrapa.repository.filter.ModNivel1Filter;



public interface ModNivel1RepositoryQuery {
	
	public Page<ModNivel1> filtrar(ModNivel1Filter modNivel1Filter, Pageable pageable);
	
}
