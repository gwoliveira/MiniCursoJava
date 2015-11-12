package br.com.fpu.minicurso.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControlador {
	@RequestMapping("/")
	public String goIndex() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String goLogin() {
		return "login";
	}
	
	@RequestMapping("/admin")
	public String goAdmin() {
		return "admin";
	}

}
