package entites;

public class Category implements BaseEntites{
	String name;
	String id;

	public Category(String name, String id) {
		this.name = name;
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
