package com.stratega.to;

public class CuestPartPequeTO {
	private Integer	idCuestionario;
	private Integer	idParticipante;
	private Boolean mayor6menor12;
	private Boolean	enfPsicosomatica;
	private String	enfPsicoCualDesde;
	private Boolean enfCardiaca;
	private String	enfCardiacaCualDesde;
	private Boolean enfCardiacaMedicoEnterado;
	private Boolean	ingMedicamentoAltera;
	private String	ingMedAlteraCualDesde;
	private Boolean	tratamPsicologico;
	private String	tratamPsicoCualDesde;
	private Boolean impedimentoFisico;
	private String	impedimentoFisDetalle;
	private String	informacionRelevante;
	private String	objetivo1;
	private String	objetivo2;
	private String	objetivo3;

	public Integer getIdCuestionario() {
		return idCuestionario;
	}
	public void setIdCuestionario(Integer idCuestionario) {
		this.idCuestionario = idCuestionario;
	}

	public Integer getIdParticipante() {
		return idParticipante;
	}
	public void setIdParticipante(Integer idParticipante) {
		this.idParticipante = idParticipante;
	}

	public Boolean getMayor6menor12() {
		return mayor6menor12;
	}
	public String mayor6menor12Texto() {
		if ( mayor6menor12 != null && mayor6menor12.booleanValue() ) {
			return "SI";
		} 
		return "NO";
	}
	public void setMayor6menor12(Boolean mayor6menor12) {
		this.mayor6menor12 = mayor6menor12;
	}

	public Boolean getEnfPsicosomatica() {
		return enfPsicosomatica;
	}
	public String enfPsicosomaticaTexto() {
		if ( enfPsicosomatica != null && enfPsicosomatica.booleanValue() ) {
			return "SI";
		} 
		return "NO";
	}
	public void setEnfPsicosomatica(Boolean enfPsicosomatica) {
		this.enfPsicosomatica = enfPsicosomatica;
	}

	public String getEnfPsicoCualDesde() {
		return enfPsicoCualDesde;
	}
	public void setEnfPsicoCualDesde(String enfPsicoCualDesde) {
		this.enfPsicoCualDesde = enfPsicoCualDesde;
	}

	public Boolean getEnfCardiaca() {
		return enfCardiaca;
	}
	public String enfCardiacaTexto() {
		if ( enfCardiaca != null && enfCardiaca.booleanValue() ) {
			return "SI";
		} 
		return "NO";
	}
	public void setEnfCardiaca(Boolean enfCardiaca) {
		this.enfCardiaca = enfCardiaca;
	}

	public String getEnfCardiacaCualDesde() {
		return enfCardiacaCualDesde;
	}
	public void setEnfCardiacaCualDesde(String enfCardiacaCualDesde) {
		this.enfCardiacaCualDesde = enfCardiacaCualDesde;
	}

	public Boolean getEnfCardiacaMedicoEnterado() {
		return enfCardiacaMedicoEnterado;
	}
	public String enfCardiacaMedicoEnteradoTexto() {
		if ( enfCardiacaMedicoEnterado != null && enfCardiacaMedicoEnterado.booleanValue() ) {
			return "SI";
		} 
		return "NO";
	}
	public void setEnfCardiacaMedicoEnterado(Boolean enfCardiacaMedicoEnterado) {
		this.enfCardiacaMedicoEnterado = enfCardiacaMedicoEnterado;
	}

	public Boolean getIngMedicamentoAltera() {
		return ingMedicamentoAltera;
	}
	public String ingMedicamentoAlteraTexto() {
		if ( ingMedicamentoAltera != null && ingMedicamentoAltera.booleanValue() ) {
			return "SI";
		}
		return "NO";
	}
	public void setIngMedicamentoAltera(Boolean ingMedicamentoAltera) {
		this.ingMedicamentoAltera = ingMedicamentoAltera;
	}

	public String getIngMedAlteraCualDesde() {
		return ingMedAlteraCualDesde;
	}
	public void setIngMedAlteraCualDesde(String ingMedAlteraCualDesde) {
		this.ingMedAlteraCualDesde = ingMedAlteraCualDesde;
	}

	public Boolean getTratamPsicologico() {
		return tratamPsicologico;
	}
	public String tratamPsicologicoTexto() {
		if ( tratamPsicologico != null && tratamPsicologico.booleanValue() ) {
			return "SI";
		}
		return "NO";
	}
	public void setTratamPsicologico(Boolean tratamPsicologico) {
		this.tratamPsicologico = tratamPsicologico;
	}

	public String getTratamPsicoCualDesde() {
		return tratamPsicoCualDesde;
	}
	public void setTratamPsicoCualDesde(String tratamPsicoCualDesde) {
		this.tratamPsicoCualDesde = tratamPsicoCualDesde;
	}

	public Boolean getImpedimentoFisico() {
		return impedimentoFisico;
	}
	public String impedimentoFisicoTexto() {
		if ( impedimentoFisico != null && impedimentoFisico.booleanValue() ) {
			return "SI";
		}
		return "NO";
	}
	public void setImpedimentoFisico(Boolean impedimentoFisico) {
		this.impedimentoFisico = impedimentoFisico;
	}

	public String getImpedimentoFisDetalle() {
		return impedimentoFisDetalle;
	}
	public void setImpedimentoFisDetalle(String impedimentoFisDetalle) {
		this.impedimentoFisDetalle = impedimentoFisDetalle;
	}

	public String getInformacionRelevante() {
		return informacionRelevante;
	}
	public void setInformacionRelevante(String informacionRelevante) {
		this.informacionRelevante = informacionRelevante;
	}

	public String getObjetivo1() {
		return objetivo1;
	}
	public void setObjetivo1(String objetivo1) {
		this.objetivo1 = objetivo1;
	}

	public String getObjetivo2() {
		return objetivo2;
	}
	public void setObjetivo2(String objetivo2) {
		this.objetivo2 = objetivo2;
	}

	public String getObjetivo3() {
		return objetivo3;
	}
	public void setObjetivo3(String objetivo3) {
		this.objetivo3 = objetivo3;
	}

	public String textoEmail() {
		String ret = 
			"<h4>CUESTIONARIO MEDICO JOVEN</h4>" +
				"<ol>" +
					"<li>¿Padece alguna enfermedad psicosomática, asmática, alérgica, etc.?: " + enfPsicosomaticaTexto();
		if ( enfPsicosomatica.booleanValue() ) {
			ret += 
						"<ol><li>Qué tipo y cuando?: " + getEnfPsicoCualDesde() + "</li></ol>";
		}
		ret += 
					"</li>" +
					"<li>¿Está tomando algún medicamento que altere su comportamiento habitual?: " + ingMedicamentoAlteraTexto();
		if ( ingMedicamentoAltera.booleanValue() ) {
			ret += 
						"<ol><li>¿Cual medicamento y desde cuando?: " + getIngMedAlteraCualDesde() + "</li></ol>";
		}
		ret += 
					"</li>" +
					"<li>¿Actualmente está bajo tratamiento psicológico?: " + tratamPsicologicoTexto();
		ret = 
				"</ol>";
		return ret;
	}

}
