package package1;

public class CustomerManager {
	private Customer customer;
	public CustomerManager(Customer customer) {
		this.customer=customer;
	}
	
	public void add(){
		System.out.println("Müşteri eklendi id : "+customer.id);
	}
	public void delete(){
		System.out.println("Müşteri silindi id : "+customer.id);
	}

}
