package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.CadTipoDeMetodo;
import br.embrapa.repository.consultas.CadTipoDeMetodoRepositoryQuery;

public interface CadTipoDeMetodoRepository extends JpaRepository<CadTipoDeMetodo, Long>, CadTipoDeMetodoRepositoryQuery {

}
