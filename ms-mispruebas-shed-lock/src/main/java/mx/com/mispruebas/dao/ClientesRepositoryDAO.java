package mx.com.mispruebas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepositoryDAO extends JpaRepository<ClienteEntity, Long>{

}