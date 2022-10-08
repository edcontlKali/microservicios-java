package com.example.demo.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.entity.ClienteEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
	
	@Query (value="SELECT FROM ClienteEntity A WHERE A.idCliente = :id ")
	public List<ClienteEntity> getClientesxId (Long id);
  
}
