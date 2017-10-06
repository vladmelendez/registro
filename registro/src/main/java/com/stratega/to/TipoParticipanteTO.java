package com.stratega.to;

public class TipoParticipanteTO {
	private int		idTipoParticipante;
	private String	descripcion;
	private int		idStatus;

	public int getIdTipoParticipante() {
		return idTipoParticipante;
	}
	public void setIdTipoParticipante(int idTipoParticipante) {
		this.idTipoParticipante = idTipoParticipante;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdStatus() {
		return idStatus;
	}
	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}
}
