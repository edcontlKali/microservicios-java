package com.example.demo.vo;

import java.io.Serializable;
import java.util.Date;

public class ClienteRequest implements Serializable {
	
	private static final long serialVersionUID = -6903332260936970317L;
	private String nombreUno;
    private String nombredOS;
    private String apellidoPaterno;
    private String appelidoMaterno;
    private Date fechaNacimiento;
	private char sexo;
	private String curp;
	private String nacionalidad;
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