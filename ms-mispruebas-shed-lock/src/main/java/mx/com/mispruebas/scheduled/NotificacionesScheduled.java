package mx.com.mispruebas.scheduled;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import mx.com.mispruebas.dao.ClienteEntity;
import mx.com.mispruebas.dao.ClientesRepositoryDAO;
import mx.com.mispruebas.dao.NotificacionEntity;
import mx.com.mispruebas.dao.NotificacionesRepositoryDAO;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;

@Component
public class NotificacionesScheduled {
	
	@Autowired
	private ClientesRepositoryDAO clientesRepositoryDAO;
	@Autowired
	private NotificacionesRepositoryDAO notificacionesRepositoryDAO;
	
	@Scheduled(cron = "${interval-in-cron}", zone = "America/Mexico_City")
	@SchedulerLock(name = "scheduledNotificacionInactividad")
	public void computePrice() {
		List<ClienteEntity> listClientes = clientesRepositoryDAO.findAll();
		if (!listClientes.isEmpty()) {
			for (ClienteEntity cliente : listClientes) {
				if (cliente.getEstatus()  == 4 && cliente.getTotalNotificaciones() <4) {
					NotificacionEntity notificacion = new NotificacionEntity();
					notificacion.setIdCliente(cliente.getIdCliente());
					notificacion.setNumeroCelular(cliente.getNumeroCelular());
					notificacion.setEstatus("ENVIADO");					
					notificacion.setTotalEnvios(notificacionesRepositoryDAO.numeNotifXIdCliente(cliente.getIdCliente())+1);
					notificacion.setFechaRegistro(new Date());
					notificacionesRepositoryDAO.save(notificacion);
					
					cliente.setTotalNotificaciones(notificacion.getTotalEnvios());
					clientesRepositoryDAO.save(cliente);
				}
			}
		}
	}
}