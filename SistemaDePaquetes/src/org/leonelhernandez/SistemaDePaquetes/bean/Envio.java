package org.leonelhernandez.SistemaDePaquetes.bean;

public class Envio {
	private Integer idEnvio;
	private String nombre;
	private Integer idNotificacion;
	public Integer getIdEnvio() {
		return idEnvio;
	}
	public void setIdEnvio(Integer idEnvio) {
		this.idEnvio = idEnvio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getIdNotificacion() {
		return idNotificacion;
	}
	public void setIdNotificacion(Integer idNotificacion) {
		this.idNotificacion = idNotificacion;
	}
	public Envio(Integer idEnvio, String nombre, Integer idNotificacion) {
		super();
		this.idEnvio = idEnvio;
		this.nombre = nombre;
		this.idNotificacion = idNotificacion;
	}
	public Envio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
