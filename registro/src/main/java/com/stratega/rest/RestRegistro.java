package com.stratega.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Months;
import org.joda.time.Years;
import org.json.JSONObject;

@RestController
public class RestRegistro {
	private static final Log logger = LogFactory.getLog(RestRegistro.class);
	//private static final String template = "Hello, %s!";
	//private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/stratega/registro")
	@ResponseBody
	public String procesa(@RequestParam(name="participante") String participante) {
System.out.println("procesa " + participante);
		final JSONObject part = new JSONObject(participante);
System.out.println("part: " + part);
		return "ok";
	}
	
	@RequestMapping("/stratega/fechaNacimiento/{fecha}")
	@ResponseBody
	public String fechaNacimiento(@PathVariable("fecha") String fecha) {
		int years = 0, months = 0, days = 0;
		DateTime today = new DateTime();
		DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		if (fecha == null ) {
			return "";
		}
		try {
			Date date = formatter.parse(fecha);
			DateTime nacimiento = new DateTime(date);
			years = Years.yearsBetween(nacimiento, today).getYears();
			months = Months.monthsBetween(nacimiento, today).getMonths() % 12;
			days = (Days.daysBetween(nacimiento.withTimeAtStartOfDay(), today.withTimeAtStartOfDay()).getDays() % 365 ) % 30;
	logger.debug("obtieneEdadTipoParticipante() anios: " + years + " meses: " + months + " días: " + days);
			//part.setEdad("" + years);
			if ( years < 6 ) {
				//part.setIdTipoParticipante(0);
				//FacesMessage msg = new FacesMessage("Edad del participante no permitida ","No se puede registrar a participantes menores de 6 años");
				//FacesContext.getCurrentInstance().addMessage(null, msg);
				return "||Edad del participante no permitida";

			} else if ( years < 11 || (years == 11 && months < 11 ) || (years == 11 && months == 11 && days == 0 )) {
				//tituloLaboralEscolar = "Escolar";
				return years + "|3|";
			} else if ( years < 17 || (years == 17 && months < 11 ) || (years == 17 && months == 11 && days == 0 )) {
				return years + "|2|";
			} else {
				return years + "|1|";
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "||Error";
	}

	@RequestMapping("/stratega/sede/{sede}")
	@ResponseBody
	public String sede(@PathVariable("sede") int sede) {
		return "sede|" + sede;
	}

}
