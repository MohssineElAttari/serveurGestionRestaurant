package ma.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import ma.projet.entity.Images;
import ma.projet.service.TestService;

@RequestMapping("/api/image")
@RestController
@CrossOrigin("*")
public class TestController {
	@Autowired
	private TestService testService;

	@PostMapping("/add")
	public String addImage(@RequestParam MultipartFile file) {
		String returnValue = "start";
		try {
			testService.saveImage(file);
			getAll();
		} catch (Exception e) {
			e.printStackTrace();
			returnValue = "error";
		}
		return returnValue;

	}

	@GetMapping
	public List<Images> getAll() throws Exception {
		return testService.getImges();
	}
//	@GetMapping
//	public List<String>getImages(){
//		String returnValue = "start";
//		try {
//			testService.saveImage(imageFile);
//		} catch (Exception e) {
//			e.printStackTrace();
//			returnValue = "error";
//		}
//		return returnValue; 
//	}
}
