
public class recapdemo2 {

	public static void main(String[] args) {
		//LESSON !5
		
		double[] list= {30.5,23.67,32.43,45.656,12.34};
		double total=0;
		double smallestNumber=list[0];
		for (double number:list) {
			total+=number;
			System.out.println("NUMBER :" +number);
			if(smallestNumber>number)
				smallestNumber=number;
			
		}
		System.out.println("SMALLEST NUMBER :" +smallestNumber);
		System.out.println("TOTAL :" + total);

}
}
