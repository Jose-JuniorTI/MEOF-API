package br.embrapa.repository.consultas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.CadAmostragem;
import br.embrapa.repository.filter.CadAmostragemFilter;
import br.embrapa.repository.projections.ResumoCadAmostragem;

public interface CadAmostragemRepositoryQuery {
	
	public Page<CadAmostragem> filtrar(CadAmostragemFilter cadAmostragemFilter, Pageable pageable);
	public Page<ResumoCadAmostragem> resumir(CadAmostragemFilter cadAmostragemFilter, Pageable pageable);
}
