package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.entity.ClienteEntity;
import com.example.demo.service.ClienteService;
import com.example.demo.vo.ClienteRequest;
import com.example.demo.vo.WelcomeMessageVO;
import com.google.gson.Gson;

@RestController
@Validated
//@RequestMapping ("/xolalpan/v1.0/mifarmacia/clientes")
@RequestMapping (path="/xolalpan/v1.0/mifarmacia/clientes", produces = "application/json")
public class ClientesController {
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private Gson gson;
	
	@GetMapping("/welcomes")
	public ResponseEntity<?> helloWorld () {
		WelcomeMessageVO welcome = new WelcomeMessageVO ();
		welcome.setMensaje("Hello World!");
		welcome.setAniosLuz(789);
		welcome.setGalaxia("Via Lactea");
		welcome.setNombre("Test TestAPaterno TestAMaterno");
		welcome.setPlaneta("Tierra");
		welcome.setSerieFavorita("Dark");
		
	    return new ResponseEntity<String> (gson.toJson(welcome), null, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<?> getClientesList () {
		Iterable<ClienteEntity> listClientes = clienteService.getClientesList();
		if (listClientes.iterator().hasNext())
			return new ResponseEntity<String> (gson.toJson(listClientes), HttpStatus.OK);
		else 
			return new ResponseEntity<String> (HttpStatus.NO_CONTENT);
	}
	
	public ResponseEntity<?> registrarCliente (@Validated @RequestBody ClienteRequest request ) {
		return null;
	}
}