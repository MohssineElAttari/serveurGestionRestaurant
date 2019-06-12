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

import ma.projet.entity.Tablee;
import ma.projet.service.TableService;

@RestController
@RequestMapping("/api/table")
@CrossOrigin("*")
public class TableController {
	@Autowired
	private TableService tableService;

	@PostMapping("/add")
	public Tablee addTable(@RequestBody Tablee b) {
		return tableService.create(b);
	}

	@PutMapping("/update")
	public void updateTable(@RequestBody Tablee b) {
		tableService.update(b);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteTable(@PathVariable Long id) {
		tableService.delete(tableService.findById(id));
	}

	@GetMapping
	public List<Tablee> getTable() {
		return tableService.findAll();
	}

	@GetMapping("/{id}")
	public Tablee finById(@PathVariable Long id) {
		return tableService.findById(id);
	}
//	public Table addTable(@RequestPart double prixRepas, @RequestPart int durreCuisson,
//			@RequestPart MultipartFile img, @RequestPart String nom, @RequestPart String type, @RequestPart String info)
//			throws IOException {
//		Table table = new Table();
//		String photo = img.getOriginalFilename();
//		table.setPrix(prixRepas);
//		table.setDurreCuisson(durreCuisson);
//		table.setPhoto(photo);
//		table.setNom(nom);
//		table.setType(type);
//		table.setInfo(info);
//		tableService.create(table);
//		File upl = new File("images/" + photo);
//		upl.createNewFile();
//		FileOutputStream fout = new FileOutputStream(upl);
//		fout.write(img.getBytes());
//		fout.close();
//		return table;
//
//	}
}
