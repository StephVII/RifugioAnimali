package org.generation.italy.rifugioanimali.controller;

import java.util.List;
import java.util.Optional;

import org.generation.italy.rifugioanimali.model.Animaletto;
import org.generation.italy.rifugioanimali.repository.AnimalettiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/animaletto")
public class AnimalettoController {

	@Autowired
	AnimalettiRepository animalettiRepository;

	@GetMapping("/elenco")
	public String elencoAnimaletti(Model model) {
		List<Animaletto> elencoAnimaletti = animalettiRepository.findAll();
		
		model.addAttribute("elenco", elencoAnimaletti);
		return "/animaletto/elenco";
	}

	@GetMapping("/dettaglio/{id}")
	public String dettaglioAnimaletto(@PathVariable Integer id, Model model) {
		Optional<Animaletto> optAnimaletto = animalettiRepository.findById(id);
		if(optAnimaletto.isPresent()) {
			model.addAttribute("contenuto", optAnimaletto.get());
			return "/sedi/dettaglio";
		}
		else
			return "/sedi/nonTrovato";
	}
}
