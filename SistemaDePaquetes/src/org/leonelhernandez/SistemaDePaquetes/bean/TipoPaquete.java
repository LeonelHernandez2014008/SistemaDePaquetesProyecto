package org.leonelhernandez.SistemaDePaquetes.bean;

public class TipoPaquete {
	private Integer idTipoPaquete;
	private String tipoPaquete;
	private String costoTipoPaquete;
	public Integer getIdTipoPaquete() {
		return idTipoPaquete;
	}
	public void setIdTipoPaquete(Integer idTipoPaquete) {
		this.idTipoPaquete = idTipoPaquete;
	}
	public String getTipoPaquete() {
		return tipoPaquete;
	}
	public void setTipoPaquete(String tipoPaquete) {
		this.tipoPaquete = tipoPaquete;
	}
	public String getCostoTipoPaquete() {
		return costoTipoPaquete;
	}
	public void setCostoTipoPaquete(String costoTipoPaquete) {
		this.costoTipoPaquete = costoTipoPaquete;
	}
	public TipoPaquete(Integer idTipoPaquete, String tipoPaquete, String costoTipoPaquete) {
		super();
		this.idTipoPaquete = idTipoPaquete;
		this.tipoPaquete = tipoPaquete;
		this.costoTipoPaquete = costoTipoPaquete;
	}
	public TipoPaquete() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
