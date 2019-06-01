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

import ma.projet.entity.Boisson;
import ma.projet.service.BoissonService;

@RestController
@RequestMapping("/api/boisson")
@CrossOrigin("*")
public class BoissonController {
	@Autowired
	private BoissonService boissonService;

	@PostMapping("/add")
	public Boisson addBoisson(@RequestBody Boisson b) {
		return boissonService.create(b);
	}

	@PutMapping("/update")
	public void updateBoisson(@RequestBody Boisson b) {
		boissonService.update(b);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteBoisson(@PathVariable Long id) {
		boissonService.delete(boissonService.findById(id));
	}

	@GetMapping
	public List<Boisson> getBoisson() {
		return boissonService.findAll();
	}

	@GetMapping("/{id}")
	public Boisson finById(@PathVariable Long id) {
		return boissonService.findById(id);
	}
//	public Boisson addBoisson(@RequestPart double prixRepas, @RequestPart int durreCuisson,
//			@RequestPart MultipartFile img, @RequestPart String nom, @RequestPart String type, @RequestPart String info)
//			throws IOException {
//		Boisson boisson = new Boisson();
//		String photo = img.getOriginalFilename();
//		boisson.setPrix(prixRepas);
//		boisson.setDurreCuisson(durreCuisson);
//		boisson.setPhoto(photo);
//		boisson.setNom(nom);
//		boisson.setType(type);
//		boisson.setInfo(info);
//		boissonService.create(boisson);
//		File upl = new File("images/" + photo);
//		upl.createNewFile();
//		FileOutputStream fout = new FileOutputStream(upl);
//		fout.write(img.getBytes());
//		fout.close();
//		return boisson;
//
//	}
}
