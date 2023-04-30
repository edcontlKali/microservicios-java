package mx.com.mispruebas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacionesRepositoryDAO extends JpaRepository<NotificacionEntity, Long>{
	
	@Query("SELECT COUNT(c) FROM NotificacionEntity c WHERE c.idCliente = :idCliente")
	public Long numeNotifXIdCliente(@Param("idCliente") Long idCliente);

}