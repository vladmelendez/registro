package com.stratega.controller;


import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.stratega.service.CatalogoService;
import com.stratega.to.ParticipanteTO;


import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistroController extends WebMvcConfigurerAdapter {
	private static final Log logger = LogFactory.getLog(RegistroController.class);
	@Autowired
    private CatalogoService catalogoService;
	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }
    
 /*   @Bean
    @Description("Thymeleaf template resolver serving HTML 5")
    public ClassLoaderTemplateResolver templateResolver() {
        
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        
        templateResolver.setPrefix("templates/");
        templateResolver.setCacheable(false);
        templateResolver.setSuffix(".html");        
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setCharacterEncoding("UTF-8");
        
        return templateResolver;
    }

    @Bean
    @Description("Thymeleaf template engine with Spring integration")
    public SpringTemplateEngine templateEngine() {
        
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());

        return templateEngine;
    }

    @Bean
    @Description("Thymeleaf view resolver")
    public ViewResolver viewResolver() {

        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setCharacterEncoding("UTF-8");

        return viewResolver;
    }*/

/*	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("registro");
        registry.addViewController("/registro").setViewName("registro");
    }*/

/*
    @RequestMapping("/")
    public String index() {
System.out.println("Root page");
        return "Greetings from Spring Boot!";
    }*/

    @GetMapping("/registro")
    public String registro(Model model) {
		model.addAttribute("part", new ParticipanteTO());
		//List<TipoParticipanteTO> tiposParticipantes = ;
		model.addAttribute("tiposParticipantes", catalogoService.cargaTiposParticipante());
		//List<SedeTO> sedes = ;
		model.addAttribute("sedes", catalogoService.cargaSedes());
        return "registro";
    }

    @PostMapping("/registro")
    public String registroSubmit(@Valid @ModelAttribute("part") ParticipanteTO part,
    		BindingResult bindingResult, Model model
            ) {
//HttpServletRequest request, Model model
logger.debug("Register submit nom: " + part.getNombres() + " apell pat: " + part.getApellidoPaterno() + " apell mat: " + part.getApellidoMaterno() + " error: " + bindingResult.hasErrors());
/*		if (bindingResult.hasErrors()) {
			model.addAttribute("tiposParticipantes", catalogoService.cargaTiposParticipante());
			model.addAttribute("sedes", catalogoService.cargaSedes());
logger.debug("registroSubmit() Errores "+ bindingResult.getErrorCount());
			//System.out.println("Errores "+ bindingResult.getErrorCount());
			return "registro";
		}*/

        return "registro";
    }
}

