package com.stratega.to;

public class CuestPartAdultoTO {
	private Integer	idCuestionario;
	private Integer	idParticipante;
	private Boolean	mayor18;
	private Boolean	embarazada;
	private String	horasDuerme;
	private Boolean	antecAdiccion;
	private String	antecAdiccionCualEpoca;
	private Boolean	antecEnfPsicologica;
	private String	antecEnfPsicologicaEspecifica;
	private Boolean	enfPsicosomatica;
	private String	enfPsicoCualDesde;
	private Boolean enfCardiaca;
	private String	enfCardiacaCualDesde;	
	private Boolean	enfCardioMedicoEnterado;
	private Boolean	tratamPsicologico;
	private Boolean	ingMedicamentoAltera;
	private String	ingMedAlteraCualDesde;
	private Boolean	impedimentoFisico;
	private String	impedimentoFisDetalle;
	private Boolean	suicidio;
	private String	suicidioCuando;
	private Boolean	fantasiasSuicidio;
	private String	fantasiasSuicidioDetalle;
	private Boolean	crisisNerviosa;
	private String	crisisNerviosaQueCuando;
	private Boolean	perdidaConocimiento;
	private String	perdidaConocimQueCuando;
	private String	informacionRelevante;
	private String	ejercitarCuerpo;
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

	public Boolean getMayor18() {
		return mayor18;
	}
	public String mayor18Texto() {
		if ( mayor18 != null && mayor18.booleanValue() ) {
			return "SI";
		}
		return "NO";
	}
	public void setMayor18(Boolean mayor18) {
		this.mayor18 = mayor18;
	}

	public Boolean getEmbarazada() {
		return embarazada;
	}
	public String embarazadaTexto() {
		if ( embarazada != null && embarazada.booleanValue() ) {
			return "SI";
		}
		return "NO";
	}
	public void setEmbarazada(Boolean embarazada) {
		this.embarazada = embarazada;
	}

	public String getHorasDuerme() {
		return horasDuerme;
	}
	public void setHorasDuerme(String horasDuerme) {
		this.horasDuerme = horasDuerme;
	}

	public Boolean getAntecAdiccion() {
		return antecAdiccion;
	}
	public String antecAdiccionTexto() {
		if ( antecAdiccion != null && antecAdiccion.booleanValue() ) {
			return "SI";
		}
		return "NO";
	}
	public void setAntecAdiccion(Boolean antecAdiccion) {
		this.antecAdiccion = antecAdiccion;
	}

	public String getAntecAdiccionCualEpoca() {
		return antecAdiccionCualEpoca;
	}
	public void setAntecAdiccionCualEpoca(String antecAdiccionCualEpoca) {
		this.antecAdiccionCualEpoca = antecAdiccionCualEpoca;
	}

	public Boolean getAntecEnfPsicologica() {
		return antecEnfPsicologica;
	}
	public String antecEnfPsicologicaTexto() {
		if ( antecEnfPsicologica != null && antecEnfPsicologica.booleanValue() ) {
			return "SI";
		}
		return "NO";
	}
	public void setAntecEnfPsicologica(Boolean antecEnfPsicologica) {
		this.antecEnfPsicologica = antecEnfPsicologica;
	}

	public String getAntecEnfPsicologicaEspecifica() {
		return antecEnfPsicologicaEspecifica;
	}
	public void setAntecEnfPsicologicaEspecifica(
			String antecEnfPsicologicaEspecifica) {
		this.antecEnfPsicologicaEspecifica = antecEnfPsicologicaEspecifica;
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

	
	public Boolean getEnfCardioMedicoEnterado() {
		return enfCardioMedicoEnterado;
	}
	public String enfCardioMedicoEnteradoTexto() {
		if ( enfCardioMedicoEnterado != null && enfCardioMedicoEnterado.booleanValue() ) {
			return "SI";
		}
		return "NO";
	}
	public void setEnfCardioMedicoEnterado(Boolean enfCardioMedicoEnterado) {
		this.enfCardioMedicoEnterado = enfCardioMedicoEnterado;
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

	public Boolean getSuicidio() {
		return suicidio;
	}
	public String suicidioTexto() {
		if ( suicidio != null && suicidio.booleanValue() ) {
			return "SI";
		}
		return "NO";
	}
	public void setSuicidio(Boolean suicidio) {
		this.suicidio = suicidio;
	}

	public String getSuicidioCuando() {
		return suicidioCuando;
	}
	public void setSuicidioCuando(String suicidioCuando) {
		this.suicidioCuando = suicidioCuando;
	}

	public Boolean getFantasiasSuicidio() {
		return fantasiasSuicidio;
	}
	public String fantasiasSuicidioTexto() {
		if ( fantasiasSuicidio != null && fantasiasSuicidio.booleanValue() ) {
			return "SI";
		}
		return "NO";
	}
	public void setFantasiasSuicidio(Boolean fantasiasSuicidio) {
		this.fantasiasSuicidio = fantasiasSuicidio;
	}

	public String getFantasiasSuicidioDetalle() {
		return fantasiasSuicidioDetalle;
	}
	public void setFantasiasSuicidioDetalle(String fantasiasSuicidioDetalle) {
		this.fantasiasSuicidioDetalle = fantasiasSuicidioDetalle;
	}

	public Boolean getCrisisNerviosa() {
		return crisisNerviosa;
	}
	public String crisisNerviosaTexto() {
		if ( crisisNerviosa != null && crisisNerviosa.booleanValue() ) {
			return "SI";
		}
		return "NO";
	}
	public void setCrisisNerviosa(Boolean crisisNerviosa) {
		this.crisisNerviosa = crisisNerviosa;
	}

	public String getCrisisNerviosaQueCuando() {
		return crisisNerviosaQueCuando;
	}
	public void setCrisisNerviosaQueCuando(String crisisNerviosaQueCuando) {
		this.crisisNerviosaQueCuando = crisisNerviosaQueCuando;
	}

	public Boolean getPerdidaConocimiento() {
		return perdidaConocimiento;
	}
	public String perdidaConocimientoTexto() {
		if ( perdidaConocimiento != null && perdidaConocimiento.booleanValue() ) {
			return "SI";
		}
		return "NO";
	}
	public void setPerdidaConocimiento(Boolean perdidaConocimiento) {
		this.perdidaConocimiento = perdidaConocimiento;
	}

	public String getPerdidaConocimQueCuando() {
		return perdidaConocimQueCuando;
	}
	public void setPerdidaConocimQueCuando(String perdidaConocimQueCuando) {
		this.perdidaConocimQueCuando = perdidaConocimQueCuando;
	}

	public String getInformacionRelevante() {
		return informacionRelevante;
	}
	public void setInformacionRelevante(String informacionRelevante) {
		this.informacionRelevante = informacionRelevante;
	}

	public String getEjercitarCuerpo() {
		return ejercitarCuerpo;
	}
	public void setEjercitarCuerpo(String ejercitarCuerpo) {
		this.ejercitarCuerpo = ejercitarCuerpo;
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

	public String toString() {
		return "[idCuestionario=" + idCuestionario +
				", idParticipante=" + idParticipante +
				", embarazada=" + embarazada +
				", horasDuerme=" + horasDuerme +
				", antecAdiccion=" + antecAdiccion +
				", antecEnfPsicologica=" + antecEnfPsicologica +
				", enfPsicosomatica=" + enfPsicosomatica +
				", enfPsicoCualDesde=" + enfPsicoCualDesde +
				", enfCardioMedicoEnterado=" + enfCardioMedicoEnterado +
				", tratamPsicologico=" + tratamPsicologico +
				", ingMedicamentoAltera=" + ingMedicamentoAltera +
				", ingMedAlteraCualDesde=" + ingMedAlteraCualDesde +
				", impedimentoFisico=" + impedimentoFisico +
				", suicidio=" + suicidio +
				", suicidioCuando=" + suicidioCuando +
				", fantasiasSuicidio=" + fantasiasSuicidio +
				", crisisNerviosa=" + crisisNerviosa +
				", crisisNerviosaQueCuando=" + crisisNerviosaQueCuando +
				", perdidaConocimiento=" + perdidaConocimiento +
				", perdidaConocimQueCuando=" + perdidaConocimQueCuando +
				", informacionRelevante=" + informacionRelevante + "]";
	}
	
	public String textoEmail(Integer sexo) {
		String ret = 
			"<h4>CUESTIONARIO MEDICO ADULTO</h4>" +
				"<ol>";
		if ( sexo == 0) {
			ret +=
					"<li>¿Está embarazada? " + embarazadaTexto() + "</li>";
		}
		ret += 
					"<li>¿Cuántas horas duerme diariamente?: " + horasDuerme + "</li>" +
					"<li>¿Tiene antedecente de alguna adicción? (droga, alcohol, tabaquismo, etc.): " + antecAdiccionTexto() + "</li>" +
					"<li>Antecedentes personales o familiares de enfermedades psicológicas: " + antecEnfPsicologicaTexto() + "</li>" +
					"<li>¿Padece alguna enfermedad psicosomática, asmática, alérgica, etc.?: " + enfPsicosomaticaTexto();
		if ( enfPsicosomatica.booleanValue() ) {
			ret += 
						"<ol><li>¿Cuál enfermedad y desde cuando?: " + getEnfPsicoCualDesde() + "</li>" +
							"<li>En caso afirmativo, ¿su médico está enterado de su participación en este entrenamiento?: " + 
							enfCardioMedicoEnteradoTexto() + "</li></ol>";
		}
		ret += 
					"</li>" +
					"<li>¿Actualmente esta bajo tratamiento psicológico o psiquiátrico?: " + tratamPsicologicoTexto() + "</li>" +
					"<li>¿Está tomando algún medicamento que altere su comportamiento habitual?: " + ingMedicamentoAlteraTexto();
		if ( ingMedicamentoAltera.booleanValue() ) {
			ret += 
						"<ol><li>¿Cual medicamento y desde cuando?: " + getIngMedAlteraCualDesde() + "</li></ol>";
		}
		ret += 
					"</li>" +
					"<li>¿Tiene algún impedimento físico?: " + impedimentoFisicoTexto() + "</li>" +
					"<li>¿Ha tenido algun intento de suicidio?: " + suicidioTexto();
		if ( suicidio.booleanValue() ) {
			ret += 
						"<ol><li>¿Cuando?: " + getSuicidioCuando() + "</li></ol>";
		}
		ret += 
					"</li>" +
					"<li>¿Ha tenido fantasías de suicidio?: " + fantasiasSuicidioTexto() + "</li>" +
					"<li>¿Ha tenido crisis nerviosas? (depresión, histeria, etc.): " + crisisNerviosaTexto();
		if ( crisisNerviosa.booleanValue() ) {
			ret += 
						"<ol><li>Qué tipo de crisis nerviosa y cuando?: " + getCrisisNerviosaQueCuando() + "</li></ol>";
		}
		ret += 
					"</li>" +
					"<li>¿Ha tenido pérdida de conocimiento, mareo o vértigo no de origen traumático?: " + perdidaConocimientoTexto();
		if ( perdidaConocimiento.booleanValue() ) {
			ret += 
						"<ol><li>¿Qué tipo y cuando?: " + getPerdidaConocimQueCuando() + "</li></ol>";
		}
		ret += 
					"</li>" +
					"<li>Comparta cualquier otra información que considere relevante (abandonos, muertes, violaciones, intentos de violaciones, fobias, etc.). Especifique qué y cuando: " + 
						getInformacionRelevante() + "</li>";
		ret = 
				"</ol>";
		return ret;
	}
}
