package miniproject4;

public class miniproject4 {

	public static void main(String[] args) {
		//LESSON 22
		int Input1=220;
		int Input2=284;
		int remainder1;
		int remainder2;
		int totalaliquot1=0;
		int totalaliquot2=0;
		
		for(int i=1;i<=Input1-1;i++) {
			remainder1=(Input1 % i);
            if (remainder1==0) {
            	totalaliquot1+=i;
            }
		}
		
		for(int j=1;j<=Input2-1;j++) {
			remainder2=(Input2 % j);
            if (remainder2==0) {
            	totalaliquot2+=j;
            }
		}
		
		System.out.println("Input1 total aliquot : " +totalaliquot1 + " Input2 total aliquot : " +totalaliquot2);
        if (totalaliquot1==Input2 & totalaliquot2==Input1) {
        	System.out.println("Inputs is friendly number");
        }
        	else {
        		System.out.println("Inputs is not friendly number");
        	}
	}
}