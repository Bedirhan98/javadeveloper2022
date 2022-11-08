package kodlama.io.devs.dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.programmingLanguagesRepository;
import kodlama.io.devs.entites.concretes.programmingLanguage;
@Repository
public class inMemoryProgrammingLanguagesRepository implements programmingLanguagesRepository{
	
	List<programmingLanguage> programmingLanguages;
	
	public inMemoryProgrammingLanguagesRepository(List<programmingLanguage> languages) {
		programmingLanguages=new ArrayList<programmingLanguage>();
		programmingLanguages.add(new programmingLanguage(1,"Java"));
		programmingLanguages.add(new programmingLanguage(2,"Python"));
		programmingLanguages.add(new programmingLanguage(3,"Swift"));
		programmingLanguages.add(new programmingLanguage(4,"C#"));
		programmingLanguages.add(new programmingLanguage(5,"Php"));
		
		
	}

	@Override
	public List<programmingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public void add() {
		System.out.println("Programlama dili eklendi");
	}

	public void update() {
		System.out.println("Programlama dili güncellendi");
		
	}

	public void delete() {
		System.out.println("Programlama dili silindi");
		
	}

	public void getById() {
		System.out.println("Id ile getirildi");
		
	}
	

}
