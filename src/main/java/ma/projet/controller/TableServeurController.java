package ma.projet.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.projet.entity.Serveur;
import ma.projet.entity.TableServeur;
import ma.projet.entity.TableServeur2;
import ma.projet.repository.TableServeur2Repository;
import ma.projet.repository.TableServeurRepository;
import ma.projet.service.TableServeurService;

@RestController
@RequestMapping("/api/tableserveur")
@CrossOrigin("*")
public class TableServeurController {

	@Autowired
	private TableServeurService tableServeurService;

	@Autowired
	private TableServeur2Repository tableServeur2Repository;
	
	@Autowired
	private TableServeurRepository tableServeurRepository;

	@GetMapping
	public List<TableServeur2> findAll() {
		return tableServeurService.findAlll();
	}

	@PostMapping
	public void create(@RequestParam Long table, @RequestParam Long serveur,
			@RequestParam("dateDebut") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") Date dateDebut,
			@RequestParam("dateFin") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") Date dateFin) {
		tableServeurService.createAll(table, serveur, dateDebut, dateFin);

	}

	@PutMapping
	public void update(@RequestParam Long table, @RequestParam Long serveur,
			@RequestParam("dateDebut") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") Date dateDebut,
			@RequestParam("dateFin") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") Date dateFin) {
		System.out.println("hfftt " + table + dateDebut);
		tableServeurService.updateAll(table, serveur, dateDebut, dateFin);
	}

	@DeleteMapping("/{table}/{serveur}/{dateFin}")
	public void delete(@PathVariable Long table, @PathVariable Long serveur,
			@PathVariable("dateFin") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") Date dateFin) {
		System.out.println("table " + table + "serveur " + serveur + "dateFin " + dateFin);
		TableServeur ts = tableServeurRepository.findTableServeur(table, serveur, dateFin);
		System.out.println("ftftf v "+ts);
		tableServeurService.deleteAll(table, serveur, dateFin);
	}

}
