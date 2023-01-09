package mx.com.pruebas.mongo.vo;

import java.io.Serializable;

public class EliminarUsuarioVO implements Serializable{
	
	private static final long serialVersionUID = -4464489147399820585L;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
