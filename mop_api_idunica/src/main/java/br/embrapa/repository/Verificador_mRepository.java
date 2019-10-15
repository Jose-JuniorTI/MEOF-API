package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.Verificador_m;
import br.embrapa.repository.consultas.Verificador_mRepositoryQuery;

public interface Verificador_mRepository extends JpaRepository<Verificador_m, Long>, Verificador_mRepositoryQuery {

	
	
}
