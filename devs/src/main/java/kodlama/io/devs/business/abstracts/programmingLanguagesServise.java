package kodlama.io.devs.business.abstracts;
import java.util.List;

import kodlama.io.devs.entites.concretes.programmingLanguage;

public interface programmingLanguagesServise {
	
	public void add(String language) throws Exception;
	public void delete(String language) throws Exception;
	public void update(String language) throws Exception;
	public List<programmingLanguage> getAll();
	public void getById(int id) throws Exception;
	
	

}
