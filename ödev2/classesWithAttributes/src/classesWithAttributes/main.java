package classesWithAttributes;

public class main {

	public static void main(String[] args) {
		//LESSON 31-32-33-34
		//Product product=new Product(1,"Notebook","GAMEGARAJ",500,30,"black");
				
		Product product=new Product(5,"Notebook","GAMEGARAJ",500,30,"Black");
		product.set_id(5);
		product.set_name("Notebook");
		product.set_description("GAMEGARAJ");
		product.set_price(500);
		product.set_stockAmound(30);
		product.set_color("Black");
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		System.out.println("Product Code: "+product.get_code());
		
	}

}
