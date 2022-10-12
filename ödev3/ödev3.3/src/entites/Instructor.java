package entites;

public class Instructor implements BaseEntites{
	String name;
	String Lastname;
	String id;
	public Instructor(String name,String lastName) {
		this.name=name;
		this.Lastname=lastName;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
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
