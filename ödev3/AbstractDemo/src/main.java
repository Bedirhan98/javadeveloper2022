
public class main {

	public static void main(String[] args) {
		//Lesson 41
		CustomerManager customerManager=new CustomerManager();
		customerManager.getCustomer(new OracleDatabaseManager());
		customerManager.getCustomer(new SqlServerDatabaseManager());

	}

}
