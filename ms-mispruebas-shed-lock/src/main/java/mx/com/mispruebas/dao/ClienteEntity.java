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
@Table(name = "CLIENTES")
public class ClienteEntity implements Serializable{
	
	private static final long serialVersionUID = -1530908677498016854L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quoteSeq")
	@SequenceGenerator(name = "quoteSeq", sequenceName = "SEQUENCE_CLIENTES ", allocationSize = 1)
	@Column(name = "ID_CLIENTE",nullable = false)
	private Long idCliente;
	@Column(name = "NOMBRE_UNO")
	private String nombreUno;
	@Column(name = "NOMBRE_DOS")
	private String nombreDos;
	@Column(name = "APELLIDO_PATERNO")
	private String apellidoPaterno;
	@Column(name = "APELLIDO_MATERNO")
	private String apellidoMaterno;
	@Column(name = "FECHA_REGISTRO")
	private Date fechaRegistro;
	@Column(name = "TOTAL_NOTIFICACIONES")
	private Long totalNotificaciones;
	@Column(name = "ESTATUS")
	private Long estatus;
	@Column(name = "NUMERO_CELULAR")
	private String numeroCelular;
	
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreUno() {
		return nombreUno;
	}
	public void setNombreUno(String nombreUno) {
		this.nombreUno = nombreUno;
	}
	public String getNombreDos() {
		return nombreDos;
	}
	public void setNombreDos(String nombreDos) {
		this.nombreDos = nombreDos;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Long getTotalNotificaciones() {
		return totalNotificaciones;
	}
	public void setTotalNotificaciones(Long totalNotificaciones) {
		this.totalNotificaciones = totalNotificaciones;
	}
	public Long getEstatus() {
		return estatus;
	}
	public void setEstatus(Long estatus) {
		this.estatus = estatus;
	}
	public String getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
}