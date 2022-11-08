package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.programmingLanguagesServise;
import kodlama.io.devs.entites.concretes.programmingLanguage;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private programmingLanguagesServise programmingLanguagesServise;
	@Autowired
	public LanguagesController(
			kodlama.io.devs.business.abstracts.programmingLanguagesServise programmingLanguagesServise) {
		super();
		this.programmingLanguagesServise = programmingLanguagesServise;
	}

	@GetMapping("/getall")
	public List<programmingLanguage> getall(){
		return programmingLanguagesServise.getAll();

	}
	@GetMapping("/getbyid")
	public void getById() throws Exception {
		programmingLanguagesServise.getById(4);
	
	}
	@GetMapping ("/add")
	public void add() throws Exception {
		programmingLanguagesServise.add("add");
		
	}
	@GetMapping ("/update")
	public void update()throws Exception{
		programmingLanguagesServise.update("update");
	}
	@GetMapping ("/delete")
	public void delete() throws Exception{
		programmingLanguagesServise.delete("delete");
	}

	
	
	
}
	
