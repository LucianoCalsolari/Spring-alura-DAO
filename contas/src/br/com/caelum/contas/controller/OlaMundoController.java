package br.com.alura.contas.controller;

import org.springframework.stereotype.Controllers;

@Controller
public class OlaMundoController {
	
	@RequestMapping("/olaMundoSpring")
	public String execute() {
		System.out.println("Executando uma logica com Spring MVC");
		return "ok";
	}
	
}
