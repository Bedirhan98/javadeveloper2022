package entites;

public class Courses implements BaseEntites{
	Instructor instructor;
	public double price;
	String name;
	String id;
	
	
	public Courses(String name,String id,Instructor instructor,double price) {
		this.name=name;
		this.id=id;
		this.price=price;
		this.instructor=instructor;
		
	}


	public Instructor getInstructor() {
		return instructor;
	}


	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
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
