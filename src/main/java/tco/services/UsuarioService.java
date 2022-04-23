package tco.services;


import tco.model.Usuario;

public interface UsuarioService {
	public Usuario save(Usuario usuario);
	public Usuario login(String nombre, String contrasenia);  
}
