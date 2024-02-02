package org.generation.italy.rifugioanimali.controller;

import java.util.List;
import java.util.Optional;

import org.generation.italy.rifugioanimali.model.Utente;
import org.generation.italy.rifugioanimali.repository.UtentiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/utente")
public class UtenteController {
	
	@Autowired
	UtentiRepository utentiRepository;
	
	@GetMapping("/elenco")
	public String elencoUtenti(Model model) {
		List<Utente> elencoUtenti = utentiRepository.findAll();
		
		model.addAttribute("elenco", elencoUtenti);
		return "/utente/elenco";
	}
	
	@GetMapping("/dettaglio/{id}")
	public String dettaglioUtente(@PathVariable String numTelefono, Model model) {
		Optional<Utente> optUtente = utentiRepository.findById(numTelefono);
		if(optUtente.isPresent()) {
			model.addAttribute("contenuto", optUtente.get());
			return "/utenti/dettaglio";
		}
		else
			return "/utenti/nonTrovato";
	}

}