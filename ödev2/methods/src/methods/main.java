package methods;

public class main {

	public static void main(String[] args) {
		//LESSON 24
		sayiBulmaca(60);
		sayiBulmaca(70);
		sayiBulmaca(4);
		sayiBulmaca(5);

	}
	public static void sayiBulmaca( int input) {
		int[] numberlist= {3,5,6,9,7,85,39};
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
	    	sendMessage("Number is aviable: "+input);
	    }
	    else {
	    	sendMessage("Number is not aviable: "+input);
	    }
	
	}
	public static void sendMessage(String message) {
		System.out.println(message);
	}
	

}
