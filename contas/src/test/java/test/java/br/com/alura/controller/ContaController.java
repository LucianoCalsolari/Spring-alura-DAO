package test.java.br.com.alura.controller;

import org.springframework.stereotype.Controllers;

@Controller
public class ContaController {
	
	@RequestMapping("/form")
	public String formulario() {
		return "formulario";
	}
	
	@RequestMapping("/adicionaConta")
	public String adiciona(Conta conta){
		
		System.out.println("Conta " + conta.getDescricao() + " adicionada .");
		ContaDAO dao = new ContaDAO();
		dao.adiciona(conta);
		
		return "conta-adicionada";
	}
}
