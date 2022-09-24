package miniProject1;

public class main {

	public static void main(String[] args) {
		// LESSON 19
		int number=-6;
		int i=1;
		int remainder;
		boolean a=true;
		
		while (a) {
		    i++;
		    remainder=(number % i);		
		    System.out.println(remainder);
		    if(number<=0 | remainder<0){
		    	System.out.println("Number is invalid.");
		    	a=false;
		    }
		    else if (i!=number & remainder==0) {
		    	System.out.println("Number is not prime.");
		    	a=false;
		    	}
		    else if (i==number & remainder==0) {
		    	System.out.println("Number is prime.");
		    	a=false;
		    }
		    else if (i>number) {
		    	a=false;
		    }
		  
		    else {
		    	System.out.println("Number is invalid.");
		    	a=false;
		    }
		    }
			}
		}
	


