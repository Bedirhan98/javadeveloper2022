package miniproject2;

public class miniproject {

	public static void main(String[] args) {
		// LESSON 20
	    String input= "";
		String [] vowels = {"A","a","E","e","U","U","I","i","O","o"};
		String [] consonants= {"z","Z","Y","y","v","V","t","T","S","s","r","R","p","P","n","N","r","R","m","M","l","L","k","K","h","H","j","J","g","G","d","D","c","C","b","B","x","X","y","Y","z","Z","q","Q"};
		boolean a=true;  
		
		for(int i=0;i<vowels.length;i++) {
			if (input==vowels[i]) {
				System.out.println("Input is vowels");
				a=true;
				break;
			}
				else {
			      a=false;
				}
		}
		
		for(int j=0;j<consonants.length;j++) {
			if (a==true) {
				break;
			}
		    else if (input==consonants[j]) {
				System.out.println("Input is consonants");
				a=true;
				break;
			}
			else if (a==true);
			a=false;
	}
		if (a==false) {
			System.out.println("Input is invalid");
		}
  }
}
