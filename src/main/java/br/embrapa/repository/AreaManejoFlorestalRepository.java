package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.AreaManejoFlorestal;
import br.embrapa.repository.consultas.AreaManejoFlorestalRepositoryQuery;

public interface AreaManejoFlorestalRepository extends JpaRepository<AreaManejoFlorestal, Long>, AreaManejoFlorestalRepositoryQuery{

}
