package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;


import kodlama.io.devs.entites.concretes.programmingLanguage;

public interface programmingLanguagesRepository {
	List<programmingLanguage> getAll();
	public void add();
	public void update();
	public void delete();
	public void getById();
}
