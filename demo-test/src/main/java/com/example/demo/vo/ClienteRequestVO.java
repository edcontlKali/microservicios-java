package com.example.demo.vo;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ClienteRequestVO implements Serializable {
	
	private static final long serialVersionUID = -6903332260936970317L;
	@NotNull
	@NotBlank
	private String nombreUno;
    private String nombreDos;
    @NotNull
	@NotBlank
    private String apellidoPaterno;
    @NotNull
	@NotBlank
    private String apellidoMaterno;
    private String fechaNacimiento;
    @NotNull
	@NotBlank
	private char sexo;
    @NotNull
	@NotBlank
	private String curp;
    @NotNull
	@NotBlank
	private String nacionalidad;
    
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
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
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
