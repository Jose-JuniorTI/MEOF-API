package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.CadNivelDeAvaliacao;
import br.embrapa.repository.consultas.CadNivelDeAvaliacaoRepositoryQuery;

public interface CadNivelDeAvaliacaoRepository extends JpaRepository<CadNivelDeAvaliacao, Long>, CadNivelDeAvaliacaoRepositoryQuery {
	
		
}
