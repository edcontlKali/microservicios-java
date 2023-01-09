package mx.com.pruebas.mongo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="usuarios")
public class Usuario {
	
	@Id
    private String id;	
	
    private String nombreUno;
    private String nombreDos;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Long edad;
    private String genero;
    private Date fechaAlta;
    private Date fechaNacimiento;
    
    public Usuario (String nombreUno, String nombreDos, String apellidoPaterno, String apellidoMaterno, Long edad, String genero, Date fechaAlta, Date fechaNacimiento) {
		this.nombreUno = nombreUno;
		this.nombreDos = nombreDos;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
		this.genero = genero;
		this.fechaAlta = fechaAlta;
		this.fechaNacimiento = fechaNacimiento;
	}
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public Long getEdad() {
		return edad;
	}
	public void setEdad(Long edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
