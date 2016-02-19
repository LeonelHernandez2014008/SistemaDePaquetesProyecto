package org.leonelhernandez.SistemaDePaquetes.bean;

public class Paquete {
	private Integer idPaquete;
	private String nombrePaquete;
	private Integer idEnvio;
	private Integer idUsuario;
	private String fechaEntrega;
	private String fechaEnvio;
	private String lugarDeEntrega;
	private Integer idTipoPaquete;
	public Integer getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(Integer idPaquete) {
		this.idPaquete = idPaquete;
	}
	public String getNombrePaquete() {
		return nombrePaquete;
	}
	public void setNombrePaquete(String nombrePaquete) {
		this.nombrePaquete = nombrePaquete;
	}
	public Integer getIdEnvio() {
		return idEnvio;
	}
	public void setIdEnvio(Integer idEnvio) {
		this.idEnvio = idEnvio;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getFechaEnvio() {
		return fechaEnvio;
	}
	public void setFechaEnvio(String fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}
	public String getLugarDeEntrega() {
		return lugarDeEntrega;
	}
	public void setLugarDeEntrega(String lugarDeEntrega) {
		this.lugarDeEntrega = lugarDeEntrega;
	}
	public Integer getIdTipoPaquete() {
		return idTipoPaquete;
	}
	public void setIdTipoPaquete(Integer idTipoPaquete) {
		this.idTipoPaquete = idTipoPaquete;
	}
	public Paquete(Integer idPaquete, String nombrePaquete, Integer idEnvio, Integer idUsuario, String fechaEntrega,
			String fechaEnvio, String lugarDeEntrega, Integer idTipoPaquete) {
		super();
		this.idPaquete = idPaquete;
		this.nombrePaquete = nombrePaquete;
		this.idEnvio = idEnvio;
		this.idUsuario = idUsuario;
		this.fechaEntrega = fechaEntrega;
		this.fechaEnvio = fechaEnvio;
		this.lugarDeEntrega = lugarDeEntrega;
		this.idTipoPaquete = idTipoPaquete;
	}
	public Paquete() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
