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

import ma.projet.entity.Client;
import ma.projet.entity.Cuisinier;
import ma.projet.repository.CuisinierRepository;
import ma.projet.service.CuisinierService;

@RestController
@RequestMapping("/api/cuisinir")
@CrossOrigin("*")
public class CuisinirController {
	@Autowired
	private CuisinierService cuisinierService;
	@Autowired
	private CuisinierRepository cr;

	@PostMapping("/add")
	public Cuisinier addCuisinir(@RequestBody Cuisinier c) {
		return cuisinierService.create(c);
	}

	@PutMapping("/update")
	public void updateCuisinir(@RequestBody Cuisinier c) {
		cuisinierService.update(c);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteCusinier(@PathVariable Long id) {
		cuisinierService.delete(cr.findById(id).get());
	}

	@GetMapping
	public List<Cuisinier> getCuisiniers() {
		return cuisinierService.findAll();
	}

	@GetMapping("/{id}")
	public Cuisinier getCuisinierById(@PathVariable Long id) {
		return cuisinierService.findById(id);
	}
}
