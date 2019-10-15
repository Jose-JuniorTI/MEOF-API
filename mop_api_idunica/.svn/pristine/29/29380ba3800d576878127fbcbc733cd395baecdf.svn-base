package br.embrapa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.Usuario;

public interface UsuarioInterface extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByEmail(String email);
	
}
