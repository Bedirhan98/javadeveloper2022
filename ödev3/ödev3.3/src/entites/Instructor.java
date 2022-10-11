package entites;

public class Instructor extends BaseEntites{
	
	String Lastname;
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

}
