package mx.com.pruebas.mongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.com.pruebas.mongo.model.Usuario;
import mx.com.pruebas.mongo.model.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> getUsuarios() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}
	
	@Override
	public boolean addUsuario (Usuario request) {
		// TODO Auto-generated method stub
		request.setId(null);
		Usuario user = usuarioRepository.save(request);
		return user.getId()!=null;
	}

	@Override
	public boolean deleteUser(String id) {
		// TODO Auto-generated method stub
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		usuarioRepository.deleteById(id);
		if (usuario.isPresent()) {
			usuarioRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateUser(Usuario request) {
		// TODO Auto-generated method stub
		Optional<Usuario> usuario = usuarioRepository.findById(request.getId());
		if (usuario.isPresent()) {
			usuarioRepository.save(request);
			return true;
		} else {
			return false;
		}		
	}
}
