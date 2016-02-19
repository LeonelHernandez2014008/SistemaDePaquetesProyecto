package org.leonelhernandez.SistemaDePaquetes.bean;

public class Rol {
	private Integer idRol;
	private String Nombre;
	private String descripcion;
	public Integer getIdRol() {
		return idRol;
	}
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Rol(Integer idRol, String nombre, String descripcion) {
		super();
		this.idRol = idRol;
		Nombre = nombre;
		this.descripcion = descripcion;
	}
	public Rol() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
