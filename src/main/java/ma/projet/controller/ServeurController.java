package ma.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.projet.entity.Serveur;
import ma.projet.repository.ServeurRepository;
import ma.projet.service.ServeurService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/serveur")
public class ServeurController {
	@Autowired
	private ServeurService serveurService;
	@Autowired
	private ServeurRepository ServeurRepository;

	@PostMapping("/add")
	public Serveur addServeur(@RequestBody Serveur s) {
		return serveurService.create(s);
	}

	@GetMapping
	public List<Serveur> getServeurs() {
		return serveurService.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteServeur(@PathVariable Long id) {
		serveurService.delete(ServeurRepository.findById(id).get());
	}

	@PutMapping("/update")
	public void updateServeur(@RequestBody Serveur s) {
		serveurService.update(s);
	}

	@GetMapping("/{id}")
	public Serveur findById(@PathVariable Long id) {
		return serveurService.findById(id);
	}
}
