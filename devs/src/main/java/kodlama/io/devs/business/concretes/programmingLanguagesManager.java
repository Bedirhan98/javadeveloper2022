package kodlama.io.devs.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.programmingLanguagesServise;
import kodlama.io.devs.dataAccess.abstracts.programmingLanguagesRepository;
import kodlama.io.devs.entites.concretes.programmingLanguage;


@Service
public class programmingLanguagesManager implements programmingLanguagesServise {
	private programmingLanguagesRepository programmingLanguagesRepository;

	@Autowired
	public programmingLanguagesManager(
			kodlama.io.devs.dataAccess.abstracts.programmingLanguagesRepository programmingLanguagesRepository) {
		this.programmingLanguagesRepository = programmingLanguagesRepository;
	}

	@Override
	public List<programmingLanguage> getAll() {
		 
		return programmingLanguagesRepository.getAll();
	}

	@Override
	public void add(String Language) throws Exception {
		
		for (programmingLanguage programmingLanguages  :this.programmingLanguagesRepository.getAll() ) {
			if (Language== programmingLanguages.getName()) {
				throw new Exception("Kurs mevcut");
			}else if(Language==null) {
				throw new Exception("Kurs adı boş geçilemez");
			}		
		}
	}


	@Override
	public void delete(String  Language) throws Exception {
		for (programmingLanguage programmingLanguages : this.programmingLanguagesRepository.getAll()) {
			if (Language ==programmingLanguages.getName()) {
				programmingLanguagesRepository.delete();
				
			}
			
		}
			
	}


	@Override
	public void update(String Language) throws Exception {
		
		for (programmingLanguage programmingLanguages  : this.programmingLanguagesRepository.getAll() ) {
				if (Language == programmingLanguages.getName()) {
					programmingLanguagesRepository.update();
					throw new Exception("Kurs güncellendi");
				}else if(Language==null) {
					throw new Exception("Kurs adı boş geçilemez");
				}
			}	
		
	}


	@Override
	public void getById(int id) throws Exception {
		for (programmingLanguage programmingLanguage: this.programmingLanguagesRepository.getAll()) {
			if (programmingLanguage.getId()==id) {
				programmingLanguagesRepository.getById();	
			}else {
				System.out.println("Id bulunamadı");
			}
		}
		
	}




}
