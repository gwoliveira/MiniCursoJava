package br.com.fpu.minicurso.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fpu.minicurso.entidades.Contato;
import br.com.fpu.minicurso.repositorios.ContatoRepositorio;

@Controller
public class ContatoControlador {
	@Autowired
	private ContatoRepositorio contatoRepositorio;

	@RequestMapping(value = "/contato", method = RequestMethod.GET)
	public String listarContatos(Long id, Model model) {
		Contato contato;
		if (id != null) {
			contato = contatoRepositorio.findOne(id);
		} else {
			contato = new Contato();
		}
		model.addAttribute("contato", contato);
		model.addAttribute("contatos", contatoRepositorio.findAll());
		return "contato";
	}

	@RequestMapping(value = "/contato", method = RequestMethod.POST)
	public String saveContato(Contato contato, Model model) {
		contatoRepositorio.save(contato);
		return "redirect:/contato";
	}
	
	@RequestMapping(value = "/contato/del", method = RequestMethod.GET)
	public String deleteContato(Long id, Model model) {
		contatoRepositorio.delete(id);
		return "redirect:/contato";
	}

}
