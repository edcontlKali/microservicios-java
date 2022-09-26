package com.example.demo.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "CLIENTE")
public class ClienteEntity {
	
	@Id
	//@Column (name = "ID_CLIENTE")
    //@GeneratedValue (strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCliente;
	@Column (name = "NOMBRE_UNO")
    private String nombreUno;
	@Column (name = "NOMBRE_DOS")
    private String nombredOS;
	@Column (name = "APELLIDO_PATERNO")
    private String apellidoPaterno;
	@Column (name = "APELLIDO_MATERNO")
    private String appelidoMaterno;
	@Column (name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;
	@Column (name = "SEXO")
	private char sexo;
	@Column (name = "CURP")
	private String curp;
	@Column (name = "NACIONALIDAD")
	private String nacionalidad;
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
	public String getNombredOS() {
		return nombredOS;
	}
	public void setNombredOS(String nombredOS) {
		this.nombredOS = nombredOS;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getAppelidoMaterno() {
		return appelidoMaterno;
	}
	public void setAppelidoMaterno(String appelidoMaterno) {
		this.appelidoMaterno = appelidoMaterno;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
}
