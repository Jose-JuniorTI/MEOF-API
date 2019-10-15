package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.ModNivel1;
import br.embrapa.repository.consultas.ModNivel1RepositoryQuery;

public interface ModNivel1Repository extends JpaRepository<ModNivel1, Long>, ModNivel1RepositoryQuery{

}
