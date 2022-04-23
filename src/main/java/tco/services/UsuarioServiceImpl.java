package tco.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tco.model.Usuario;
import tco.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRespository;

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		usuario = usuarioRespository.save(usuario);
		return usuario;
	}

	@Override
	@Transactional
	public Usuario login(String nombre, String contrasenia) {
		return usuarioRespository.login(nombre, contrasenia);
	}	


	
}
