package com.example.demo.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dao.entity.ClienteEntity;

public interface ClienteRepository extends CrudRepository<ClienteEntity, Long> {

}
