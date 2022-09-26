package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.entity.ClienteEntity;

public interface ClienteService {

	public Iterable<ClienteEntity> getClientesList ();
}
