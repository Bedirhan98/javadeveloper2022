package kodlama.io.devs.entites.concretes;

public class programmingLanguage {
	private int id;
	private String name;
	
	public programmingLanguage() {
		super();
	}
	public programmingLanguage(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
