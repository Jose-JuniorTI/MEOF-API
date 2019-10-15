package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.CadEmpresa;
import br.embrapa.repository.consultas.CadEmpresaRepositoryQuery;

public interface CadEmpresaRepository extends JpaRepository<CadEmpresa, Long>, CadEmpresaRepositoryQuery {

}
