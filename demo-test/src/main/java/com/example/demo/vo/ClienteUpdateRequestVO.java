package com.example.demo.vo;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public class ClienteUpdateRequestVO implements Serializable {
	
	private static final long serialVersionUID = -2941409851496823092L;
	@NotNull (message = "El parametro idCliente es requerido")
	//@NotBlank (message = "El parametro idCliente es requerido")
	private Long idCliente;
	private String nombreUno;
    private String nombreDos;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String fechaNacimiento;
    private char sexo;
    private String curp;
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