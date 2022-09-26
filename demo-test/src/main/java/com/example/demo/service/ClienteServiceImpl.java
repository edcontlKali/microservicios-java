package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.entity.ClienteEntity;
import com.example.demo.dao.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	@Override
	public Iterable<ClienteEntity> getClientesList() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}
	
	

}
