package org.leonelhernandez.SistemaDePaquetes.bean;

public class Usuario {
	private Integer idUsuario;
	private String nombre;
	private String contrase�a;
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
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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
	public Usuario(Integer idUsuario, String nombre, String contrase�a, String nick, String correo,
			String noDeIdentificacion, Integer idRol) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.contrase�a = contrase�a;
		this.nick = nick;
		this.correo = correo;
		this.noDeIdentificacion = noDeIdentificacion;
		this.idRol = idRol;
	}
	public Usuario() {
		super();
	}
}
