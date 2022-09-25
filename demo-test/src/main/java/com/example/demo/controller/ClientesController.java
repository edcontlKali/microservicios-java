package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.vo.WelcomeMessageVO;
import com.google.gson.Gson;

@RestController
//@RequestMapping ("/xolalpan/v1.0/mifarmacia/clientes")
@RequestMapping (path="/xolalpan/v1.0/mifarmacia/clientes", produces = "application/json")
public class ClientesController {

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
		
	    return new ResponseEntity<String>(gson.toJson(welcome), null, HttpStatus.OK);
	}
}