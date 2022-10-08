package package2;


public class CustomerManager {
	private CreditManager creditManager;
	public CustomerManager(Customer customer,CreditManager creditManager) {
		this.creditManager=creditManager;
	}
	
	public void add(){
		System.out.println("Müşteri eklendi :");
	}
	public void delete(){
		System.out.println("Müşteri silindi :");
	}
	public void give() {
		creditManager.calculate();
		System.out.println("Kredi verildi");
		
		
	}

}


