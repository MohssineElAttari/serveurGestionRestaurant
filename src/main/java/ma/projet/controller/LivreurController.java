package ma.projet.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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

import ma.projet.entity.Livreur;
import ma.projet.repository.LivreurRepository;
import ma.projet.service.LivreurService;

@RestController
@RequestMapping("/api/livreur")
@CrossOrigin("*")
public class LivreurController {
	@Autowired
	private LivreurService livreurService;
	@Autowired
	LivreurRepository cr;

	@PostMapping("/add")
	public Livreur addLivreur(@RequestBody Livreur c) {
		return livreurService.create(c);
	}

	@PutMapping("/update")
	public void updateLivreur(@RequestBody Livreur Livreur) {
		livreurService.update(Livreur);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteLivreur(@PathVariable Long id) {
		livreurService.delete(livreurService.findById(id));
	}

	@GetMapping
	public List<Livreur> getLivreurs() {
		return livreurService.findAll();

	}

	@GetMapping("/{id}")
	public Livreur getLivreurById(@PathVariable Long id) {
		return livreurService.findById(id);
	}
}
