package mx.com.mispruebas.dao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "NOTIFICACIONES")
public class NotificacionEntity implements Serializable{
	
	private static final long serialVersionUID = 7824136076969020073L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quoteSeq")
	@SequenceGenerator(name = "quoteSeq", sequenceName = "SEQUENCE_NOTIFICACIONES ", allocationSize = 1)
	@Column(name = "ID_NOTIFICACION", unique=true, nullable = false)
	private Long idNotificacion;
	@Column(name = "ID_CLIENTE")
	private Long idCliente;
	@Column(name = "NUMERO_CELULAR")
	private String numeroCelular;
	@Column(name = "ESTATUS")
	private String estatus;
	@Column(name = "TOTAL_ENVIOS")
	private Long totalEnvios;
	@Column(name = "FECHA_REGISTRO")
	private Date fechaRegistro;
	
	public Long getIdNotificacion() {
		return idNotificacion;
	}
	public void setIdNotificacion(Long idNotificacion) {
		this.idNotificacion = idNotificacion;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public Long getTotalEnvios() {
		return totalEnvios;
	}
	public void setTotalEnvios(Long totalEnvios) {
		this.totalEnvios = totalEnvios;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
}