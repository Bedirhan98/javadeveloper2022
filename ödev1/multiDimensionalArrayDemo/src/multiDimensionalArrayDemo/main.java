package multiDimensionalArrayDemo;

public class main {

	public static void main(String[] args) {
		// LESSON 16
        String [] [] cities= new String [3] [3];
        cities[0][0] = "İSTANBUL";
        cities[0][1] = "ANKARA";
        cities[0][2] = "BOLU";
        cities[1][0] = "BURSA";
        cities[1][1] = "KOCAELİ";
        cities[1][2] = "ADANA";
        cities[2][0] = "KAYSERİ";
        cities[2][1] = "ZONGULDAK";
        cities[2][2] = "TOKAT";
        
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		System.out.println(cities[i][j]);
        	}
        }
         
 	} 

}
