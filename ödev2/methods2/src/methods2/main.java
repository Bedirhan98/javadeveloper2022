package methods2;

public class main {

	public static void main(String[] args) {
		//LESSON 25-26

		System.out.println(process(50,9));
		System.out.println(process2("ksdfbsbdfjsn"));
		System.out.println(mult(1,6,45));
	}
	public static int process(int input1,int input2) {
		return input1/input2;
	}
	public static String process2(String input3) {
		return input3.substring(0,6);
	}
	public static int mult(int... numbers) {
		int total=1;
		for (int number : numbers) {
			total*=number;
		}
		return total;

	}

}
