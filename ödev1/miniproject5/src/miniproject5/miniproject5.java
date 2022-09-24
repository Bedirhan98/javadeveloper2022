package miniproject5;

public class miniproject5 {

	public static void main(String[] args) {
		// LESSON 23
		int[] numberlist= {3,5,6,9,7,85,39};
		int input=95;
		boolean a=true;
		
		for (int number:numberlist) {
			if(number==input) {
				a=true;
				break;
			}
			else {
				a=false;
			}
		}
	    if (a==true) {
	    	System.out.println("Number is aviable");
	    }
	    else {
	    	System.out.println("Number is not aviable");
	    }
	}
	
}
