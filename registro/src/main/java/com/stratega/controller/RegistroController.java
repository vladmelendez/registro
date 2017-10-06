package com.stratega.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import com.stratega.to.ParticipanteTO;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RestController
public class RegistroController extends WebMvcConfigurerAdapter {
	
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
System.out.println("Register page");
		model.addAttribute("part", new ParticipanteTO());
        return "registro";
    }

    @PostMapping("/registro")
    public String registroSubmit(@Valid @ModelAttribute("part") ParticipanteTO part,
    		BindingResult bindingResult
            ) {
//HttpServletRequest request, Model model
System.out.println("Register submit nom: " + part.getNombres() + " apell pat: " + part.getApellidoPaterno() + " apell mat: " + part.getApellidoMaterno() + " error: " + bindingResult.hasErrors());
		if (bindingResult.hasErrors()) {
			System.out.println("Errores "+ bindingResult.getErrorCount());
			return "registro";
		}
System.out.println("Todo OK");
        return "registro";
    }
}

