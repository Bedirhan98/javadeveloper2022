package polymorphismDemo;

public class main {

	public static void main(String[] args) {
		// LESSON 38
		/*
		 * BaseLogger[] loggers= new BaseLogger[] {new FileLogger(),new
		 * EmailLogger(),new DatabaseLogger(),new ConsoleLogger()}; for (BaseLogger
		 * b:loggers) { b.Log("Log message"); }
		 */
		CustomerManager c= new CustomerManager(new FileLogger());
		c.add();
		
		

	}

}
