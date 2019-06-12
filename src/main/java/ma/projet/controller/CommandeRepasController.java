package ma.projet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.projet.entity.Boisson;
import ma.projet.entity.CommandeClient;
import ma.projet.entity.Dessert;
import ma.projet.entity.Entree;
import ma.projet.entity.RepasPrincipale;
import ma.projet.repository.BoissonRepository;
import ma.projet.repository.CommandeClientRepository;
import ma.projet.repository.DessertRepository;
import ma.projet.repository.EntreeRepository;
import ma.projet.repository.RepasPrincipaleRepository;


@RestController
@RequestMapping("/api/commandeRepas")
@CrossOrigin("*")
public class CommandeRepasController {
	
	private int cmp;
	@Autowired
	private RepasPrincipaleRepository principaleRepository;
	@Autowired
	private  DessertRepository dessertRepository;
	@Autowired
	private EntreeRepository entreeRepository;
	@Autowired
	private BoissonRepository boissonRepository;
	@Autowired
	private CommandeClientRepository commandeRepasRepository;
	
	List names =new ArrayList<>();
	
	

	@GetMapping("/names")
	public List getNames(@RequestParam String name){
		System.out.println(name);
		names = new ArrayList<>();
		if(name.equals("repasPrincipal")) {
			for(RepasPrincipale r : principaleRepository.findAll()) {
				names.add(r.getCompossition());
			}			
		}else if(name.equals("dessert")) {
			for(Dessert d : dessertRepository.findAll()) {
				names.add(d.getNom());
			}
		}else if(name.equals("entree")) {
			for(Entree e : entreeRepository.findAll()) {
				names.add(e.getNom());
			}
		}else  if(name.equals("boisson")){
			for(Boisson b : boissonRepository.findAll()) {
				names.add(b.getNom());
			}
		}
		return names;
	}
	
	@GetMapping("/counts")
	public List getCounts(@RequestParam String name){
		

		List counts =new ArrayList<>();
		List ids =new ArrayList<>();
	
		int cpm=0;
		if(name.equals("repasPrincipal")) {
			for(RepasPrincipale r : principaleRepository.findAll()) {
				names.add(r.getCompossition());
				ids.add(r.getId());
			}			
		}else if(name.equals("dessert")) {
			for(Dessert d : dessertRepository.findAll()) {
				names.add(d.getNom());
				ids.add(d.getId());
			}
		}else if(name.equals("entree")) {
			for(Entree e : entreeRepository.findAll()) {
				names.add(e.getNom());
				ids.add(e.getId());
			}
		}else  if(name.equals("boisson")){
			for(Boisson b : boissonRepository.findAll()) {
				names.add(b.getNom());
				ids.add(b.getId());
			}
		}
	
		for(Object n : ids) {
			for (CommandeClient c : commandeRepasRepository.findAll()) {
			
				if(c.getRepas().getId() == n) {
					
					 cpm =+ 1 * c.getQuantitie();
				}
			}
			counts.add(cpm);
		  }
		
			
		return counts;
	}
	
	
	
}
