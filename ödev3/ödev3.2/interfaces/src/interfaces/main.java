package interfaces;

public class main {

	public static void main(String[] args) {
		// Lesson 42-43
		CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
		
		
	}

}
