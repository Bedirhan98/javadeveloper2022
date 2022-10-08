package interfaces;

public class CustomerManager {
	ICustomerDal customersDal;
	
	public CustomerManager(ICustomerDal customersDal) {
		this.customersDal=customersDal;
	}
	
	public void add() {
		customersDal.Add();
	 
	}

}
