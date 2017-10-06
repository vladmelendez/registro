package com.stratega.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;

import com.stratega.to.ParticipanteTO;

@RestController
public class RestRegistro {

	private static final String template = "Hello, %s!";
	//private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/stratega/registro")
	@ResponseBody
	public String procesa(@RequestParam(name="participante") String participante) {
System.out.println("procesa " + participante);
		final JSONObject part = new JSONObject(participante);
System.out.println("part: " + part);
		return "ok";
				//new Greeting(counter.incrementAndGet(),
	               //              String.format(template, name));
	}
}
