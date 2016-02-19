package org.leonelhernandez.SistemaDePaquetes.bean;

public class Usuario {
	private Integer idUsuario;
	private String nombre;
	private String contraseña;
	private String nick;
	private String correo;
	private String noDeIdentificacion;
	private Integer idRol;
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNoDeIdentificacion() {
		return noDeIdentificacion;
	}
	public void setNoDeIdentificacion(String noDeIdentificacion) {
		this.noDeIdentificacion = noDeIdentificacion;
	}
	public Integer getIdRol() {
		return idRol;
	}
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	public Usuario(Integer idUsuario, String nombre, String contraseña, String nick, String correo,
			String noDeIdentificacion, Integer idRol) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.nick = nick;
		this.correo = correo;
		this.noDeIdentificacion = noDeIdentificacion;
		this.idRol = idRol;
	}
	public Usuario() {
		super();
	}
}
