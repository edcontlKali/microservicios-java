package mx.com.pruebas.mongo.vo;

import java.io.Serializable;
import java.util.Date;

public class RespuestaExitosa implements Serializable {
	
	private static final long serialVersionUID = 5852714899562696944L;
	private Date timeStamp = new Date();
	private String mensajeError = "Operación correcta";
	private Object datos;
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMensajeError() {
		return mensajeError;
	}
	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}
	public Object getDatos() {
		return datos;
	}
	public void setDatos(Object datos) {
		this.datos = datos;
	}
}