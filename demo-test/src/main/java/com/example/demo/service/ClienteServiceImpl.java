package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.entity.ClienteEntity;
import com.example.demo.dao.repository.ClienteRepository;
import com.example.demo.vo.ClienteRequestVO;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	@Override
	public Iterable<ClienteEntity> getClientesList() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}
	@Override
	public String registarCliente(ClienteRequestVO request) {
		
		ClienteEntity clienteEntity = new ClienteEntity();
		clienteEntity.setNombreUno(request.getNombreUno());
		clienteEntity.setNombredOS(request.getNombreDos());
		clienteEntity.setApellidoPaterno(request.getApellidoPaterno());
		clienteEntity.setAppelidoMaterno(request.getApellidoMaterno());
		clienteEntity.setCurp(request.getCurp());
		clienteEntity.setNacionalidad(request.getNacionalidad());
		clienteEntity.setSexo(request.getSexo());
		clienteEntity.setFechaNacimiento(request.getFechaNacimiento());
		clienteRepository.save(clienteEntity);
		return clienteEntity.getIdCliente()!=null?"Se registro correctamente el cliente.": "Occurio un error al registrar el cliente.";
	}
	
	

}
