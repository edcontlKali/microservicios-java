package com.example.demo.vo;

import java.io.Serializable;

public class WelcomeMessageVO implements Serializable {
	
	private static final long serialVersionUID = 715684924906997446L;
	private String mensaje;
	private long aniosLuz;
	private String galaxia;
	private String nombre;
	private String planeta;
	private String serieFavorita;
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public long getAniosLuz() {
		return aniosLuz;
	}
	public void setAniosLuz(long aniosLuz) {
		this.aniosLuz = aniosLuz;
	}
	public String getGalaxia() {
		return galaxia;
	}
	public void setGalaxia(String galaxia) {
		this.galaxia = galaxia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPlaneta() {
		return planeta;
	}
	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}
	public String getSerieFavorita() {
		return serieFavorita;
	}
	public void setSerieFavorita(String serieFavorita) {
		this.serieFavorita = serieFavorita;
	}
}