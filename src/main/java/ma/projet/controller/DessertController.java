package ma.projet.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import ma.projet.entity.Dessert;
import ma.projet.service.DessertService;

@RestController
@RequestMapping("/api/dessert")
@CrossOrigin("*")
public class DessertController {
	@Autowired
	private DessertService dessertService;

	@PostMapping("/add")
	public Dessert addDessert(@RequestBody Dessert b) {
		return dessertService.create(b);
	}

	@PutMapping("/update")
	public void updateDessert(@RequestBody Dessert b) {
		dessertService.update(b);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteDessert(@PathVariable Long id) {
		dessertService.delete(dessertService.findById(id));
	}

	@GetMapping
	public List<Dessert> getDessert() {
		return dessertService.findAll();
	}

	@GetMapping("/{id}")
	public Dessert finById(@PathVariable Long id) {
		return dessertService.findById(id);
	}
//	public Dessert addDessert(@RequestPart double prixRepas, @RequestPart int durreCuisson,
//			@RequestPart MultipartFile img, @RequestPart String nom, @RequestPart String type, @RequestPart String info)
//			throws IOException {
//		Dessert Dessert = new Dessert();
//		String photo = img.getOriginalFilename();
//		Dessert.setPrix(prixRepas);
//		Dessert.setDurreCuisson(durreCuisson);
//		Dessert.setPhoto(photo);
//		Dessert.setNom(nom);
//		Dessert.setType(type);
//		Dessert.setInfo(info);
//		DessertService.create(Dessert);
//		File upl = new File("images/" + photo);
//		upl.createNewFile();
//		FileOutputStream fout = new FileOutputStream(upl);
//		fout.write(img.getBytes());
//		fout.close();
//		return Dessert;
//
//	}
}
