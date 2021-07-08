package br.com.alfaiate.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import br.com.alfaiate.data.DetalheUsuario;
import br.com.alfaiate.model.Usuario;
import br.com.alfaiate.repository.UsuarioRepository;


@Component
public class DetalheUsuarioServiceImpl implements UserDetailsService{

	private final UsuarioRepository repository;
	
	public DetalheUsuarioServiceImpl(UsuarioRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Usuario> usuario = repository.findBylogin(username);
		if(usuario.isEmpty()) {
			throw new UsernameNotFoundException("Usuario [" + username + "] não encontrado");
		}
		// TODO Auto-generated method stub
		return new DetalheUsuario(usuario);
	}

}
