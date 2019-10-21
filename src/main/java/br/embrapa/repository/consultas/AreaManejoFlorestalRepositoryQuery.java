package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.AreaManejoFlorestal;
import br.embrapa.repository.filter.AreaManejoFlorestalFilter;


public interface AreaManejoFlorestalRepositoryQuery {

	public Page<AreaManejoFlorestal> filtrar(AreaManejoFlorestalFilter areaManejoFlorestalFilter, Pageable pageable);
	
}
