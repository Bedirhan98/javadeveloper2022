package package2;

public class main {

	public static void main(String[] args) {
		CustomerManager customerManager1=new CustomerManager(new Customer(),new MilitaryCreditManager() );
		customerManager1.give();
	}

}
