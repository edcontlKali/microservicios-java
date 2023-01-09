package mx.com.pruebas.mongo.service;

import java.util.List;

import mx.com.pruebas.mongo.model.Usuario;

public interface UsuarioService {

	public List<Usuario> getUsuarios ();
	
	public boolean addUsuario (Usuario request);
	
	public boolean deleteUser (String id);
	
	public boolean updateUser (Usuario request);
	
}
