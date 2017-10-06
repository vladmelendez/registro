package com.stratega.to;

public class SedeTO {
	private Integer	idSede;
	private String	descripcion;
	private String	prefijo;
	private String	correoAdmin;
	private Integer	idStatus;

	public Integer getIdSede() {
		return idSede;
	}
	public void setIdSede(Integer idSede) {
		this.idSede = idSede;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrefijo() {
		return prefijo;
	}
	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}

	public String getCorreoAdmin() {
		return correoAdmin;
	}
	public void setCorreoAdmin(String correoAdmin) {
		this.correoAdmin = correoAdmin;
	}

	public Integer getIdStatus() {
		return idStatus;
	}
	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}
}
