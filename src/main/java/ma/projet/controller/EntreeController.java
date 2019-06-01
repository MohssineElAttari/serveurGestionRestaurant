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

import ma.projet.entity.Entree;
import ma.projet.service.EntreeService;

@RequestMapping("/api/entree")
@RestController
@CrossOrigin("*")
public class EntreeController {
	@Autowired
	private EntreeService entreeService;

	@PostMapping("/add")
	public Entree addErntree(@RequestBody Entree entree) {
		return entreeService.create(entree);
	}

	@GetMapping
	public List<Entree> getEntrees() {
		return entreeService.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEntree(@PathVariable Long id) {
		entreeService.delete(entreeService.findById(id));
	}

	@PutMapping("/update")
	public void updateEntree(@RequestBody Entree entree) {
		entreeService.update(entree);
	}

	@GetMapping("/find")
	public Entree findById(@PathVariable Long id) {
		return entreeService.findById(id);
	}

}
