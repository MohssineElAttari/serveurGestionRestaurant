package ma.projet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.projet.entity.Commande;
import ma.projet.service.CommandeService;

@RestController
@RequestMapping("/api/commande")
public class CommandeController {
	@Autowired
	private CommandeService commandeService;

	@PostMapping("/add")
	public Commande addCommande(@RequestBody Commande c) {
		return commandeService.create(c);
	}

	@PutMapping("/update")
	public void updateCommande(@RequestBody Commande c) {
		commandeService.update(c);
	}

	@DeleteMapping("/delete")
	public void deleteCommande(@RequestBody Commande c) {
		commandeService.delete(c);
	}

	@GetMapping
	public List<Commande> getCommande() {
		return commandeService.findAll();
	}

	@GetMapping("/{id}")
	public Commande findById(@PathVariable Long id) {
		return commandeService.findById(id);
	}
}
