package mx.com.pruebas.mongo.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

import mx.com.pruebas.mongo.model.Usuario;
import mx.com.pruebas.mongo.service.UsuarioService;
import mx.com.pruebas.mongo.vo.EliminarUsuarioVO;
import mx.com.pruebas.mongo.vo.RespuestaExitosa;

@RestController
@Validated
@RequestMapping (path="/pruebas/v1.0/mongo/usuarios", produces = "application/json")
public class UsuariosController {
	
	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private Gson gson;
	
	@GetMapping
	public ResponseEntity<?> getUsuariosList () {
		List<Usuario> usuarios = usuarioService.getUsuarios();
		if ( !usuarios.isEmpty() ) {
			return new ResponseEntity<String> (gson.toJson(usuarios), HttpStatus.OK);
		} else {
			return new ResponseEntity<String> (HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping ("/registros")
	public ResponseEntity<?> addUser (@Valid @RequestBody Usuario request) {
		RespuestaExitosa respuesta = null;
		if (usuarioService.addUsuario(request)) {
			respuesta = new RespuestaExitosa ();
			respuesta.setDatos(null);
		}
		return new ResponseEntity<String> (gson.toJson(respuesta), HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> deleteUser (@Valid @RequestBody EliminarUsuarioVO request) {
		RespuestaExitosa respuesta = null;
		if (usuarioService.deleteUser(request.getId())) {
			respuesta = new RespuestaExitosa ();
			return new ResponseEntity<String> (gson.toJson(respuesta), HttpStatus.OK);
		} else {
			return new ResponseEntity<String> (HttpStatus.NO_CONTENT);
		}
	}
	
	@PutMapping
	public ResponseEntity<?> updateUser (@Valid @RequestBody Usuario request) {
		RespuestaExitosa respuesta = null;
		if (usuarioService.updateUser(request)) {
			respuesta = new RespuestaExitosa ();
			return new ResponseEntity<String> (gson.toJson(respuesta), HttpStatus.OK);
		} else {
			return new ResponseEntity<String> (HttpStatus.NO_CONTENT);
		}
	}

}
