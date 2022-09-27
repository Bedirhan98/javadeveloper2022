package oop1;

public class main {

	public static void main(String[] args) {
		Product product1 = new Product();                // productlar bu şeilde tanımlanır.
											             // set value (değer atamak)
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(6500);
		product1.setDiscount(8);
		product1.setUnitsInStock(2);
		product1.setImageUrl("xxx1.jpg");

		Product product2 = new Product(); 
		product2.setName("DSmeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(8);
		product2.setUnitsInStock(2);
		product2.setImageUrl("xxx2.jpg");

		Product product3 = new Product(); 
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(6500);
		product3.setDiscount(8);
		product3.setUnitsInStock(2);
		product3.setImageUrl("xxx3.jpg");
		
		Product[] products= {product1,product2,product3};
		                                                                    //listeyi foreach ile getir.
		for (Product product : products) {
			System.out.println(product.getName());
			
		}
	    
	    IndividualCustomer individualCustomer = new IndividualCustomer();
	    individualCustomer.setId(1);
	    individualCustomer.setPhone("1546546");
	    individualCustomer.setCustomerNumber("45546");
	    individualCustomer.setFirstName("ali"); 
	    individualCustomer.setLastName("veli");
	    
	    CorporateCustomer corporateCustomer = new CorporateCustomer();
	    corporateCustomer.setId(1);
	    corporateCustomer.setPhone("1546546");
	    corporateCustomer.setCustomerNumber("45546");
	    corporateCustomer.setCompanyName("Kodlama.io"); 
	    corporateCustomer.setTaxNumber("58468");
	    
	    customer[] customers= {individualCustomer,corporateCustomer};
	}

}
