package switchdemo;

public class switchdemo {

	public static void main(String[] args) {
		//LESSON 10
		char grade = 'F';
		
		switch(grade) {
		
		case 'A':
			System.out.println("PERFECT : PASSED THE COURSE");
			break;
		case 'B':
			System.out.println("VERY NICE : PASSED THE COURSE");
			break;
		case 'C':
			System.out.println("GOOD : PASSED THE COURSE");
			break;		
		case 'D':
			System.out.println("NOT BAD : PASSED THE COURSE");
			break;
		case 'F':
			System.out.println("BAD : FAILED THE COURSE");
			break;
		    default:
		    	System.out.println("INVALID INPUT");
		}

	}

}
