package org.generation.italy.rifugioanimali.controller;

import java.util.List;
import java.util.Optional;

import org.generation.italy.rifugioanimali.model.Sede;
import org.generation.italy.rifugioanimali.repository.SediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sede")
public class SedeController {
	
	@Autowired
	SediRepository sediRepository;
	
	@GetMapping("/elenco")
	public String elencoSedi(Model model) {
		List<Sede> elencoSedi = sediRepository.findAll();
		
		model.addAttribute("elenco", elencoSedi);
		return "/sede/elenco";
	}
	
	@GetMapping("/dettaglio/{id}")
	public String dettaglioSede(@PathVariable Integer identificativo, Model model) {
		Optional<Sede> optSede = sediRepository.findById(identificativo);
		if(optSede.isPresent()) {
			model.addAttribute("contenuto", optSede.get());
			return "/sedi/dettaglio";
		}
		else
			return "/sedi/nonTrovato";
	}

}
