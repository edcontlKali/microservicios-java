package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.entity.ClienteEntity;
import com.example.demo.dao.repository.ClienteRepository;
import com.example.demo.vo.ClienteInsertRequestVO;
import com.example.demo.vo.ClienteUpdateRequestVO;

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
	public String registarCliente(ClienteInsertRequestVO request) {
		
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
	@Override
	public String atualizarCliente(ClienteUpdateRequestVO request) {
		ClienteEntity clienteEntity = new ClienteEntity();
		clienteEntity.setIdCliente(request.getIdCliente());
		clienteEntity.setNombreUno(request.getNombreUno());
		clienteEntity.setNombredOS(request.getNombreDos());
		clienteEntity.setApellidoPaterno(request.getApellidoPaterno());
		clienteEntity.setAppelidoMaterno(request.getApellidoMaterno());
		clienteEntity.setCurp(request.getCurp());
		clienteEntity.setNacionalidad(request.getNacionalidad());
		clienteEntity.setSexo(request.getSexo());
		clienteEntity.setFechaNacimiento(request.getFechaNacimiento());
		Optional<ClienteEntity> existeCliente = clienteRepository.findById(request.getIdCliente());
		if (existeCliente.isPresent()) {
			clienteRepository.save(clienteEntity);
			return "Actualizaciòn del cliente exitoso";
		} else {
			return "No existe el cliente, verifique sus datos";
		}
	}
}
