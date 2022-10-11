package entites;

public class Courses extends BaseEntites{
	Instructor instructor;
	public double price;
	
	
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

}
