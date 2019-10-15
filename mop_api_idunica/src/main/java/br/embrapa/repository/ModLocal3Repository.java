package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.ModLocal3;
import br.embrapa.repository.consultas.ModLocal3RepositoryQuery;

public interface ModLocal3Repository extends JpaRepository<ModLocal3, Long>, ModLocal3RepositoryQuery {

}
