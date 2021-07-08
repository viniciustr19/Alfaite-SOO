package br.com.alfaiate.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alfaiate.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	public Optional <Usuario> findBylogin(String login);
}
