package br.com.spring.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Hello {
	
	@RequestMapping("/calc")
	public String form() { 
		
		return "index";
	}

}
