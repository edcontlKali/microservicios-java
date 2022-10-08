package com.example.demo.service;

import com.example.demo.dao.entity.ClienteEntity;
import com.example.demo.vo.ClienteRequestVO;

public interface ClienteService {

	public Iterable<ClienteEntity> getClientesList ();
	
	public String registarCliente(ClienteRequestVO request);
}
