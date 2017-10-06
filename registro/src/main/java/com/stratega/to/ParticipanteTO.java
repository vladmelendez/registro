package com.stratega.to;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ParticipanteTO {
	public static final int ADULTO	= 1;
	public static final int JUNIOR	= 2;
	public static final int PEQUE	= 3;
	
	private Integer	idParticipante;
	private Integer	idSede;
	private String	prefijoSede;
	
	@NotNull @Size(min=1, message="Se requiere nombre")
	private String	nombres;
	@NotNull @Size(min=1, message="Se requiere apellido paterno")
	private String	apellidoPaterno;
	@NotNull @Size(min=1, message="Se requiere apellido materno")
	private String	apellidoMaterno;
	private String	apodo;
	private Integer sexo;
	private String	edad;
	private Date	fechaNacimiento;
	private String	direcCalleNum;
	private String	direcNumInt;
	private String	direcColonia;
	private String	direcCP;
	private String	direcCiudadPais;
	private String	correo;
	private String	telCelular;
	private String	telCasa;
	private Integer	idTipoParticipante;
	private String	gradoEscolar;
	private String	nombreEscuela;
	private String	nombreCompletoPapa;
	private String	celularPapa;
	private String	nombreCompletoMama;
	private String	celularMama;
	private String	telOficina;
	private String	ocupacion;
	private String	ultNivelEstudios;
	private Integer	idParticipanteInvito;
	private String	token;
	private Integer	idTipoCurso;
	private Date	fechaRegistro;
//	private String	marca;
	private Boolean cartaAutoriza;	
	

	public Integer getIdParticipante() {
		return idParticipante;
	}
	public void setIdParticipante(Integer idParticipante) {
		this.idParticipante = idParticipante;
	}

	public String getParticipante() {
		return String.format("%04d", idParticipante);
	}

	public Integer getIdSede() {
		return idSede;
	}
	public void setIdSede(Integer idSede) {
		this.idSede = idSede;
	}

	public String getPrefijoSede() {
		return prefijoSede;
	}
	public void setPrefijoSede(String prefijoSede) {
		this.prefijoSede = prefijoSede;
	}

	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Integer getSexo() {
		return sexo;
	}
	public String sexoDescripcion() {
		if ( sexo == null ) {
			return "";
		}
		if ( sexo == 0) {
			return "Femenino";
		} else {
			return "Masculino";
		}
	}
	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String fechaNacimientoTexto() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(fechaNacimiento); 
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDirecCalleNum() {
		return direcCalleNum;
	}
	public void setDirecCalleNum(String direcCalleNum) {
		this.direcCalleNum = direcCalleNum;
	}

	public String getDirecNumInt() {
		return direcNumInt;
	}
	public void setDirecNumInt(String direcNumInt) {
		this.direcNumInt = direcNumInt;
	}

	public String getDirecColonia() {
		return direcColonia;
	}
	public void setDirecColonia(String direcColonia) {
		this.direcColonia = direcColonia;
	}

	public String getDirecCP() {
		return direcCP;
	}
	public void setDirecCP(String direcCP) {
		this.direcCP = direcCP;
	}

	public String getDirecCiudadPais() {
		return direcCiudadPais;
	}
	public void setDirecCiudadPais(String direcCiudadPais) {
		this.direcCiudadPais = direcCiudadPais;
	}

	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelCelular() {
		return telCelular;
	}
	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}

	public String getTelCasa() {
		return telCasa;
	}
	public void setTelCasa(String telCasa) {
		this.telCasa = telCasa;
	}

	public Integer getIdTipoParticipante() {
		return idTipoParticipante;
	}
	public void setIdTipoParticipante(Integer idTipoParticipante) {
		this.idTipoParticipante = idTipoParticipante;
	}

	public String getGradoEscolar() {
		return gradoEscolar;
	}
	public void setGradoEscolar(String gradoEscolar) {
		this.gradoEscolar = gradoEscolar;
	}

	public String getNombreEscuela() {
		return nombreEscuela;
	}
	public void setNombreEscuela(String nombreEscuela) {
		this.nombreEscuela = nombreEscuela;
	}

	public String getNombreCompletoPapa() {
		return nombreCompletoPapa;
	}
	public void setNombreCompletoPapa(String nombreCompletoPapa) {
		this.nombreCompletoPapa = nombreCompletoPapa;
	}

	public String getCelularPapa() {
		return celularPapa;
	}
	public void setCelularPapa(String celularPapa) {
		this.celularPapa = celularPapa;
	}

	public String getNombreCompletoMama() {
		return nombreCompletoMama;
	}
	public void setNombreCompletoMama(String nombreCompletoMama) {
		this.nombreCompletoMama = nombreCompletoMama;
	}

	public String getCelularMama() {
		return celularMama;
	}
	public void setCelularMama(String celularMama) {
		this.celularMama = celularMama;
	}

	public String getTelOficina() {
		return telOficina;
	}
	public void setTelOficina(String telOficina) {
		this.telOficina = telOficina;
	}

	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getUltNivelEstudios() {
		return ultNivelEstudios;
	}
	public void setUltNivelEstudios(String ultNivelEstudios) {
		this.ultNivelEstudios = ultNivelEstudios;
	}

	public Integer getIdParticipanteInvito() {
		return idParticipanteInvito;
	}
	public void setIdParticipanteInvito(Integer idParticipanteInvito) {
		this.idParticipanteInvito = idParticipanteInvito;
	}

	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	public Integer getIdTipoCurso() {
		return idTipoCurso;
	}
	public void setIdTipoCurso(Integer idTipoCurso) {
		this.idTipoCurso = idTipoCurso;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Boolean getCartaAutoriza() {
		return cartaAutoriza;
	}
	public void setCartaAutoriza(Boolean cartaAutoriza) {
		this.cartaAutoriza = cartaAutoriza;
	}

	public String getNombreApodo() {
		String nomApodo = nombres + " " + apellidoPaterno + " " + apellidoMaterno;
		if ( apodo != null ) {
			nomApodo += " (" + apodo + ")";
		}
		return nomApodo;
	}
	
	public String getIDNombreApodo() {
		String nomApodo = nombres + " " + apellidoPaterno + " " + apellidoMaterno;
		if ( apodo != null ) {
			nomApodo += " (" + apodo + ")";
		}
		nomApodo += " [" + this.getParticipante() + "]";
		return nomApodo;
	}
	
	public String textoEmail() {
		String ret = 
			"<p><b>TOKEN : </b>" + token.toUpperCase() + "</p>" +
			"<h4>DATOS PERSONALES</h4>" +

			"<p>Nombre: " + nombres + "<br/>" +
			"Apellido Paterno:  " + apellidoPaterno + "<br/>" +
			"Apellido Materno:  " + apellidoMaterno + "<br/>" +
			"Nombre Gafete:  " + apodo + "</p>" +

			"<p>Email: " + correo + "<br />" +
			"Fecha Nacimiento: " + fechaNacimientoTexto() + "<br/>" +
			"Sexo: " + sexoDescripcion() + "</p>" +

			"<p>Calle y Numero: " + direcCalleNum + "<br/>" +
			"Colonia:" + direcColonia + "<br />" +
			"C.P.:" + direcCP + "<br />" +
			"Ciudad y pais: " + direcCiudadPais + "</p>" +

			"<p>Telefono Casa: " + telCasa + "<br/>" +
			"Telefono Celular: " + telCelular + "</p>";

		if ( idTipoParticipante == 1 ) {
			ret += "<p>";
			//Adulto
			if ( telOficina != null && !telOficina.isEmpty()) {
				ret += "Telefono Oficina: " + telOficina + "<br />";
			}
			ret += "</p>";
		} else if ( idTipoParticipante == 2 ) {
			//Joven
			ret += "<p>";
			if ( gradoEscolar != null && !gradoEscolar.isEmpty()) {
				ret += "Grado Escolar: " + gradoEscolar + "<br />";
			}
			ret += "</p>";
		}
		//ret += 
		//	"<p>Quien le invito a JIVATMAN: " + participanteInvito + "<br /></p>";
		return ret;
	}
	
}
