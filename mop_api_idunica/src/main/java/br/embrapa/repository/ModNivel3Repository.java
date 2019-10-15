package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.ModNivel3;
import br.embrapa.repository.consultas.ModNivel3RepositoryQuery;


public interface ModNivel3Repository extends JpaRepository<ModNivel3, Long>, ModNivel3RepositoryQuery{

}
