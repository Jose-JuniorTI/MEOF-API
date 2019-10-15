package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.CadMaterial;
import br.embrapa.repository.consultas.CadMaterialRepositoryQuery;

public interface CadMaterialRepository extends JpaRepository<CadMaterial, Long>, CadMaterialRepositoryQuery{

	

}
