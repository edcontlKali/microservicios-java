package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.entity.ClienteEntity;
import com.example.demo.service.ClienteService;
import com.example.demo.vo.ClienteInsertRequestVO;
import com.example.demo.vo.ClienteUpdateRequestVO;
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
	
	// hola mundo
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
	
	// consulta de clientes
	@GetMapping
	public ResponseEntity<?> getClientesList () {
		Iterable<ClienteEntity> listClientes = clienteService.getClientesList();
		if (listClientes.iterator().hasNext())
			return new ResponseEntity<String> (gson.toJson(listClientes), HttpStatus.OK);
		else 
			return new ResponseEntity<String> (HttpStatus.NO_CONTENT);
	}
	
	// registro de cliente
	@PostMapping ("/registros")
	public ResponseEntity<?> registrarCliente (@Valid @RequestBody ClienteInsertRequestVO request ) {
		String mensaje = clienteService.registarCliente(request);
		
		//Map<String, String> map = new HashMap<String, String>();

		return new ResponseEntity<String> (gson.toJson(mensaje), HttpStatus.OK);
	}
	
	// Actualizar datos del cliente
	@PutMapping
	public ResponseEntity<?> actualizarDatosCliente (@Valid @RequestBody ClienteUpdateRequestVO request ) {
		String mensaje = clienteService.atualizarCliente(request);
		
		//Map<String, String> map = new HashMap<String, String>();
		
		return new ResponseEntity<String> (gson.toJson(mensaje), HttpStatus.OK);
	}
}