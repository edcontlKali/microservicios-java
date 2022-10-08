package com.example.demo.service;

import com.example.demo.dao.entity.ClienteEntity;
import com.example.demo.vo.ClienteInsertRequestVO;
import com.example.demo.vo.ClienteUpdateRequestVO;

public interface ClienteService {

	public Iterable<ClienteEntity> getClientesList ();
	
	public String registarCliente(ClienteInsertRequestVO request);
	
	public String atualizarCliente(ClienteUpdateRequestVO request);
}
