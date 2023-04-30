package mx.com.mispruebas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import mx.com.mispruebas.dao.ClienteEntity;
import mx.com.mispruebas.dao.ClientesRepositoryDAO;

@RestController
@Validated
@RequestMapping (path="/xolalpan/v1.0/mifarmacia/clientes", produces = "application/json")
public class ClientesController {
	
	@Autowired
	private ClientesRepositoryDAO clientesRepositoryDAO;
	@Autowired
	private Gson gson;
	
	/**
	 * @apiNote Consulta de clientes
	 * */
	@GetMapping
	public ResponseEntity<?> getClientesList () {
		List<ClienteEntity> clientes = clientesRepositoryDAO.findAll();
		return new ResponseEntity<String> (gson.toJson(clientes), null, HttpStatus.OK);
	}
}