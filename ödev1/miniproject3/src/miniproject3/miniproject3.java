package miniproject3;

public class miniproject3 {

	public static void main(String[] args) {
		// LESSON 21
		int Input=28;
		int remainder;
		int totalaliquot=0;
		
		for(int i=1;i<=Input-1;i++) {
			remainder=(Input % i);
            if (remainder==0) {
            	totalaliquot+=i;
            }
		}
		System.out.println("Input : " +Input + " aliquot : " +totalaliquot);
        if (totalaliquot==Input) {
        	System.out.println("Input is perfect number");
        }
        	else {
        		System.out.println("Input is not perfect number");
        	}
	}
}
