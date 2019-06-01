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

import ma.projet.entity.Administrateur;
import ma.projet.service.AdministrateurService;

@RestController
@RequestMapping("/api/administrateur")
public class AdministrateurController {
	@Autowired
	private AdministrateurService administrateurService;

	@PostMapping("/add")
	public Administrateur addAdministrateur(@RequestBody Administrateur a) {
		return administrateurService.create(a);
	}

	@PutMapping("/update")
	public void updateAdministrateur(@RequestBody Administrateur a) {
		administrateurService.update(a);
	}

	@DeleteMapping("/delete")
	public void deleteAdministrateur(@RequestBody Administrateur a) {
		administrateurService.delete(a);
	}

	@GetMapping
	public List<Administrateur> getAll() {
		return administrateurService.findAll();
	}

	@GetMapping("/{id}")
	public Administrateur findById(@PathVariable Long id) {
		return administrateurService.findById(id);
	}
}
